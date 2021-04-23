package com.fc.test.controller.gen;

import cn.hutool.core.date.DateUtil;
import com.fc.test.mapper.auto.TSysRoleUserMapper;
import com.fc.test.model.auto.*;
import com.fc.test.service.SysCourseService;
import com.fc.test.service.SysUserService;
import com.fc.test.service.SysVipService;
import com.github.pagehelper.PageHelper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.SysCommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
@RequestMapping("SysCommentController")
@Api(value = "")
public class SysCommentController extends BaseController{
	
	private String prefix = "gen/sysComment";
	@Autowired
	private SysCommentService sysCommentService;
	@Autowired
    private SysVipService sysVipService;
	@Autowired
    private SysCourseService courseService;
	@Autowired
    private SysUserService userService;
    @Autowired
    private TSysRoleUserMapper tSysRoleUserMapper;
    public static final String FORMAT = "yyyy-MM-dd";


    @GetMapping("view")
	@RequiresPermissions("gen:sysComment:view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
    @GetMapping("bar")
    @RequiresPermissions("gen:sysComment:bar")
    public String bar(ModelMap model)
    {
        //获取七天前的日期
        List<Date> lDate = new ArrayList<>();
        int off = -7;
        for (int i = 0;i < 7 ;i++){
            lDate.add(DateUtil.offsetDay(new Date(),off));
            off = off + 1;
        }
        LinkedList<Map<String,Object>> datelist = new LinkedList<>();
        int l = 1;
        for (Date date : lDate){
            Map<String,Object> map = new HashMap();
            map.put("date",DateUtil.format(date,FORMAT));
            map.put("offset","date"+l);
            datelist.add(map);
            l++;
        }
        model.addAttribute("datelist", datelist);

        Map<String,Double> map = new HashMap();
        int i = 1;
        SysVipExample example = new SysVipExample();
//        example.createCriteria().andCreateDateLike()
        List<SysVip> viplist = sysVipService.selectByExample(example);
        for (Date date : lDate){
            map.put("data"+i,(viplist.stream().filter(item -> DateUtil.format(item.getCreateDate(), FORMAT).contains(DateUtil.format(date,FORMAT))).mapToDouble(SysVip::getBalance).sum()));
            i++;
        }
        model.addAttribute("data", map);
        String str="";
        return prefix + "/bar";
    }
    @GetMapping("pie")
    @RequiresPermissions("gen:sysComment:pie")
    public String pie(ModelMap model){
        String str="教练业绩";
        setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));

        return prefix + "/pie";
    }
    @PostMapping("pie")
    @RequiresPermissions("gen:sysComment:pie")
    @ResponseBody
    public Object pie(Tablepar tablepar,String searchText){
        //将所有课程的归属教练信息统计出来
        List<SysCourse> courselist = courseService.selectByExample(null);

        TSysRoleUserExample example=new TSysRoleUserExample();
        example.createCriteria().andSysRoleIdEqualTo("393320526766018560");
        List<String> useridlist = tSysRoleUserMapper.selectByExample(example).stream().map(TSysRoleUser::getSysUserId).collect(Collectors.toList());
        List<TsysUser> userlist = userService.selectByExample(new TsysUserExample()).stream().filter(line->useridlist.contains(line.getId())).collect(Collectors.toList());

        List<CourseTest> alllist = new ArrayList<>();
        //查询教练上的所有课程和今天上的课程
        userlist.forEach(line->{
            Map<String,String> map = new HashMap<>();
            CourseTest courseTest = new CourseTest();
            SysCourseExample example1 = new SysCourseExample();
            example1.createCriteria().andUserIdEqualTo(Long.valueOf(line.getId()));
//             map.put("all", String.valueOf(courseService.selectByExample(example1).size()));
            courseTest.setAll(courseService.selectByExample(example1).size());
            example1.createCriteria().andStartLike(DateUtil.format(new Date(),FORMAT));
            courseTest.setToday(courseService.selectByExample(example1).size());
            courseTest.setUsername(line.getNickname());
//             map.put("today", String.valueOf(courseService.selectByExample(example1).size()));
//             map.put("username",line.getNickname());

             alllist.add(courseTest);

        });


        PageInfo<SysComment> page=sysCommentService.list2(tablepar,searchText,alllist) ;
        TableSplitResult<SysComment> result=new TableSplitResult<SysComment>(page.getPageNum(), page.getTotal(), page.getList());
        return  result;
//        Map<String, Long> userlist = courselist.stream().map(SysCourse::getUserName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        model.addAttribute("list",alllist);

    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
	@RequiresPermissions("gen:sysComment:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<SysComment> page=sysCommentService.list(tablepar,searchText) ; 
		TableSplitResult<SysComment> result=new TableSplitResult<SysComment>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
	
	/**
     * 新增
     */

    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") String id,ModelMap modelMap)
    {
     modelMap.addAttribute("id",id);
        return prefix + "/add";
    }
	
	//@Log(title = "新增", action = "111")
	@PostMapping("add")
//	@RequiresPermissions("gen:sysComment:add")
	@ResponseBody
	public AjaxResult add(SysComment sysComment){
		int b=sysCommentService.insertSelective(sysComment);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 删除用户
	 * @param ids
	 * @return
	 */
	//@Log(title = "删除", action = "111")
	@PostMapping("remove")
	@RequiresPermissions("gen:sysComment:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysCommentService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 检查用户
	 * @param
	 * @return
	 */
	@PostMapping("checkNameUnique")
	@ResponseBody
	public int checkNameUnique(SysComment sysComment){
		int b=sysCommentService.checkNameUnique(sysComment);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.put("SysComment", sysCommentService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:sysComment:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysComment record)
    {
        return toAjax(sysCommentService.updateByPrimaryKeySelective(record));
    }

    
    /**
   	 * 根据主键查询
   	 * 
   	 * @param id
   	 * @param
   	 * @return
   	 */
   	@PostMapping("/get/{id}")
   	@ApiOperation(value = "根据id查询唯一", notes = "根据id查询唯一")
   	public SysComment edit(@PathVariable("id") String id) {
   		return sysCommentService.selectByPrimaryKey(id);
   	}
    

	
}
