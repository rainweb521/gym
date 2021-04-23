package com.fc.test.controller.gen;

import com.fc.test.mapper.auto.TSysRoleUserMapper;
import com.fc.test.model.auto.*;
import com.fc.test.service.SysCustomerService;
import com.fc.test.service.SysUserService;
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
import com.fc.test.service.SysVipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("SysVipController")
@Api(value = "")
public class SysVipController extends BaseController{
	
	private String prefix = "gen/sysVip";
	@Autowired
	private SysVipService sysVipService;
	@Autowired
    private SysCustomerService sysCustomerService;
	@Autowired
    private SysUserService sysUserService;
    @Autowired
    private TSysRoleUserMapper tSysRoleUserMapper;
	@GetMapping("view")
	@RequiresPermissions("gen:sysVip:view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
	@RequiresPermissions("gen:sysVip:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<SysVip> page=sysVipService.list(tablepar,searchText) ; 
		TableSplitResult<SysVip> result=new TableSplitResult<SysVip>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
	
	/**
     * 新增
     */

    @GetMapping("/add")
    public String add(ModelMap modelMap){
//        List<SysCustomer> customerlist = sysCustomerService.selectByExample(new SysCustomerExample());
        TSysRoleUserExample example=new TSysRoleUserExample();
        example.createCriteria().andSysRoleIdEqualTo("488289006124007424");
        List<String> userlist = tSysRoleUserMapper.selectByExample(example).stream().map(TSysRoleUser::getSysUserId).collect(Collectors.toList());
        List<TsysUser> list = sysUserService.selectByExample(new TsysUserExample()).stream().filter(line->userlist.contains(line.getId())).collect(Collectors.toList());
        modelMap.addAttribute("list",list);
//        modelMap.addAttribute("list",customerlist);
        return prefix + "/add";
    }
	
	//@Log(title = "新增", action = "111")
	@PostMapping("add")
	@RequiresPermissions("gen:sysVip:add")
	@ResponseBody
	public AjaxResult add(SysVip sysVip){
        sysVip.setUserName(sysUserService.selectByPrimaryKey(String.valueOf(sysVip.getUserId())).getNickname());
        int b=sysVipService.insertSelective(sysVip);
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
	@RequiresPermissions("gen:sysVip:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysVipService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(SysVip sysVip){
		int b=sysVipService.checkNameUnique(sysVip);
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
        List<SysCustomer> customerlist = sysCustomerService.selectByExample(new SysCustomerExample());
        mmap.addAttribute("list",customerlist);
        mmap.put("SysVip", sysVipService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:sysVip:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysVip record)
    {
//        record.setUserName(sysUserService.selectByPrimaryKey(String.valueOf(record.getUserId())).getNickname());
        return toAjax(sysVipService.updateByPrimaryKeySelective(record));
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
   	public SysVip edit(@PathVariable("id") String id) {
   		return sysVipService.selectByPrimaryKey(id);
   	}
    

	
}
