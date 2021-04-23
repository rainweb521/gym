package com.fc.test.controller.gen;

import com.fc.test.mapper.auto.TSysRoleUserMapper;
import com.fc.test.model.auto.*;
import com.fc.test.service.SysMycourseService;
import com.fc.test.service.SysUserService;
import com.fc.test.service.SysVipService;
import com.fc.test.shiro.util.ShiroUtils;
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
import com.fc.test.service.SysCourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping("SysCourseController")
@Api(value = "")
public class SysCourseController extends BaseController{
	
	private String prefix = "gen/sysCourse";
	@Autowired
	private SysCourseService sysCourseService;
	@Autowired
    private SysUserService userService;
	@Autowired
    private SysVipService vipService;
	@Autowired
    private SysMycourseService mycourseService;
	@Autowired
    private TSysRoleUserMapper tSysRoleUserMapper;
	
	@GetMapping("view")
	@RequiresPermissions("gen:sysCourse:view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
    @GetMapping("buy")
    @RequiresPermissions("gen:sysCourse:buy")
    public String buy(ModelMap model)
    {
        String str="购买课程";
        setTitle(model, new TitleVo("课程列表", str+"购买管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/buylist";
    }
    @GetMapping("my")
    @RequiresPermissions("gen:sysCourse:my")
    public String my(ModelMap model)
    {
        String str="我的课程";
        setTitle(model, new TitleVo("课程列表", str+"我的课程", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/mylist";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
//	@RequiresPermissions("gen:sysCourse:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<SysCourse> page=sysCourseService.list(tablepar,searchText) ; 
		TableSplitResult<SysCourse> result=new TableSplitResult<SysCourse>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
    @GetMapping("customer/{id}")
    public String customer(@PathVariable("id") String id,ModelMap model)
    {
        String str="我的课程";
        setTitle(model, new TitleVo("课程列表", str+"我的课程", true,"欢迎进入"+str+"页面", true, false));
        model.addAttribute("id",id);

        return prefix + "/customerlist";
    }
    @PostMapping("customerlist/{id}")
//    @RequiresPermissions("gen:sysCourse:list")
    @ResponseBody
    public Object customerlist(@PathVariable("id") String id,Tablepar tablepar,String searchText){
        PageInfo<SysCourse> page=sysCourseService.list2(tablepar,searchText,id) ;
        TableSplitResult<SysCourse> result=new TableSplitResult<SysCourse>(page.getPageNum(), page.getTotal(), page.getList());
        return  result;
    }
    @PostMapping("mylist")
    @RequiresPermissions("gen:sysCourse:my")
    @ResponseBody
    public Object mylist(Tablepar tablepar,String searchText){
        PageInfo<SysCourse> page=sysCourseService.list2(tablepar,searchText,ShiroUtils.getUserId()) ;
        TableSplitResult<SysCourse> result=new TableSplitResult<SysCourse>(page.getPageNum(), page.getTotal(), page.getList());
        return  result;
    }
	
	/**
     * 新增
     */

    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        TSysRoleUserExample example=new TSysRoleUserExample();
        example.createCriteria().andSysRoleIdEqualTo("393320526766018560");
        List<String> userlist = tSysRoleUserMapper.selectByExample(example).stream().map(TSysRoleUser::getSysUserId).collect(Collectors.toList());
        List<TsysUser> list = userService.selectByExample(new TsysUserExample()).stream().filter(line->userlist.contains(line.getId())).collect(Collectors.toList());
        modelMap.addAttribute("list",list);
        return prefix + "/add";
    }
    /**
     * 评价跳转
     */

    @GetMapping("/comment/{id}")
    public String comment(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.addAttribute("id",id);
        mmap.put("SysCourse", sysCourseService.selectByPrimaryKey(id));

        return prefix + "/comment";
    }
	
	//@Log(title = "新增", action = "111")
	@PostMapping("add")
	@RequiresPermissions("gen:sysCourse:add")
	@ResponseBody
	public AjaxResult add(SysCourse sysCourse){
        sysCourse.setUserName(userService.selectByPrimaryKey(String.valueOf(sysCourse.getUserId())).getNickname());
        int b=sysCourseService.insertSelective(sysCourse);
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
	@RequiresPermissions("gen:sysCourse:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysCourseService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}

    @PostMapping("buy")
    @RequiresPermissions("gen:sysCourse:buy")
    @ResponseBody
    public AjaxResult buy(String ids){
//	    获取会员卡余额
        TsysUser user = userService.selectByPrimaryKey(ShiroUtils.getUserId());
        try {

            SysVip vip = vipService.selectByExample(new SysVipExample()).stream().filter(item -> item.getUserId().toString().equals(ShiroUtils.getUserId())).findFirst().get();
            if (vip.getBalance()==null){
                vip.setBalance(0.0);
            }
            SysCourse course = sysCourseService.selectByPrimaryKey(ids);
            Double price = vip.getBalance() - course.getPrice();
            if (price>0.0){
                vip.setBalance(price);
                vipService.updateByPrimaryKeySelective(vip);
                SysMycourse mycourse = new SysMycourse();
                mycourse.setCourseId(Integer.valueOf(ids));
                mycourse.setCreateDate(new Date());
                mycourse.setStatus(1);
                mycourse.setUserId(Integer.valueOf(ShiroUtils.getUserId()));
                mycourseService.insertSelective(mycourse);
                return success();
            }else {
                return error("余额不足！");
            }
        }catch (NoSuchElementException e){
            return error("会员卡不存在！");
        }

    }
	
	/**
	 * 检查用户
	 * @param
	 * @return
	 */
	@PostMapping("checkNameUnique")
	@ResponseBody
	public int checkNameUnique(SysCourse sysCourse){
		int b=sysCourseService.checkNameUnique(sysCourse);
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
        TSysRoleUserExample example=new TSysRoleUserExample();
        example.createCriteria().andSysRoleIdEqualTo("393320526766018560");
        List<String> userlist = tSysRoleUserMapper.selectByExample(example).stream().map(TSysRoleUser::getSysUserId).collect(Collectors.toList());
        List<TsysUser> list = userService.selectByExample(new TsysUserExample()).stream().filter(line->userlist.contains(line.getId())).collect(Collectors.toList());
        List<SysCourse> list2 = new ArrayList<>();
        list.forEach(line->{
            SysCourse sysCourse = new SysCourse();
            sysCourse.setUserName(line.getNickname());
            sysCourse.setId(Long.valueOf(line.getId()));
            list2.add(sysCourse);
        });
        mmap.addAttribute("list2",list2);
        mmap.put("SysCourse", sysCourseService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:sysCourse:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysCourse record)
    {
//        record.setUserName(userService.selectByPrimaryKey(String.valueOf(record.getUserId())).getNickname());
//        record.setUserName(userService.selectByPrimaryKey(String.valueOf(record.getUserId())).getNickname());
        return toAjax(sysCourseService.updateByPrimaryKeySelective(record));
    }
    /**
     * 修改保存签到信息
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:sysCourse:edit")
    @GetMapping("/checkin2/")
    @ResponseBody
    public AjaxResult checkin(String id,String[] ids)
    {
        List<String> idss = new ArrayList<>();
        for (int i = 0;i<ids.length;i++){
            idss.add(ids[i]);
        }
        List<SysMycourse> mycourselist = mycourseService.selectByExample(new SysMycourseExample());
        mycourselist.stream().filter(item->item.getCourseId().toString().equals(id)).forEach(item->{
            if (idss.contains(item.getUserId())){
                //已签到
                item.setStatus(2);
            }else{
                //已过期
                item.setStatus(3);
            }
            mycourseService.updateByPrimaryKeySelective(item);
        });
        return toAjax(1);
    }

    /**
     * 获取签到人员列表
     */
    //@Log(title = "修改", action = "111")
    @GetMapping("/checkin/{id}")
    public String checkin(@PathVariable("id") String id, ModelMap mmap)
    {
//        SysMycourseExample sysmycourse = new SysMycourseExample();
//        sysmycourse.or()
        List<SysMycourse> mycourselist = mycourseService.selectByExample(new SysMycourseExample());
        List<TsysUser> userList = new ArrayList<>();
        mycourselist.stream().filter(item->item.getCourseId().toString().equals(id)).forEach(item->{
            TsysUser user = new TsysUser();
            user = userService.selectByPrimaryKey(String.valueOf(item.getUserId()));
            userList.add(user);
        });
//        List<TsysUser> list = userService.selectByExample(new TsysUserExample());
        mmap.addAttribute("list",userList);
        mmap.addAttribute("id",id);
        mmap.put("SysCourse", sysCourseService.selectByPrimaryKey(id));
        return prefix + "/checkin";
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
   	public SysCourse edit(@PathVariable("id") String id) {
   		return sysCourseService.selectByPrimaryKey(id);
   	}
    

	
}
