package com.fc.test.controller.gen;

import com.fc.test.model.auto.SysCustomerExample;
import com.fc.test.model.auto.TsysUser;
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
import com.fc.test.model.auto.SysCustomer;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.SysCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Controller
@RequestMapping("SysCustomerController")
@Api(value = "")
public class SysCustomerController extends BaseController{
	
	private String prefix = "gen/sysCustomer";
	@Autowired
	private SysCustomerService sysCustomerService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:sysCustomer:view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
	@RequiresPermissions("gen:sysCustomer:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<SysCustomer> page=sysCustomerService.list(tablepar,searchText) ; 
		TableSplitResult<SysCustomer> result=new TableSplitResult<SysCustomer>(page.getPageNum(), page.getTotal(), page.getList()); 
		return  result;
	}
	
	/**
     * 新增
     */

    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
	//@Log(title = "新增", action = "111")
	@PostMapping("add")
	@RequiresPermissions("gen:sysCustomer:add")
	@ResponseBody
	public AjaxResult add(SysCustomer sysCustomer){
		int b=sysCustomerService.insertSelective(sysCustomer);
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
	@RequiresPermissions("gen:sysCustomer:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysCustomerService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 检查用户
	 * @param tsysUser
	 * @return
	 */
	@PostMapping("checkNameUnique")
	@ResponseBody
	public int checkNameUnique(SysCustomer sysCustomer){
		int b=sysCustomerService.checkNameUnique(sysCustomer);
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
        mmap.addAttribute("userId",ShiroUtils.getUserId());
        mmap.put("SysCustomer", sysCustomerService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }

    @GetMapping("/edit2")
    public String edit( ModelMap mmap)
    {
        SysCustomer customer2 = new SysCustomer();
        SysCustomerExample example = new SysCustomerExample();
        example.createCriteria().andUserIdEqualTo(Integer.valueOf(ShiroUtils.getUserId()));
        List<SysCustomer> customer = sysCustomerService.selectByExample(example);
        if (customer.size()==0){
            customer2.setUserId(Integer.valueOf(ShiroUtils.getUserId()));
            customer2.setNickname(ShiroUtils.getUser().getNickname());
            sysCustomerService.insertSelective(customer2);
            mmap.put("SysCustomer", customer2);
        }else {

            mmap.put("SysCustomer", customer.get(0));
        }


        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
//    @RequiresPermissions("gen:sysCustomer:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysCustomer record)
    {
        TsysUser user = sysUserService.selectByPrimaryKey(String.valueOf(record.getUserId()));
        user.setNickname(record.getNickname());
        sysUserService.updateByPrimaryKeySelective(user);
        return toAjax(sysCustomerService.updateByPrimaryKeySelective(record));
    }

    
    /**
   	 * 根据主键查询
   	 * 
   	 * @param id
   	 * @param mmap
   	 * @return
   	 */
   	@PostMapping("/get/{id}")
   	@ApiOperation(value = "根据id查询唯一", notes = "根据id查询唯一")
   	public SysCustomer edit(@PathVariable("id") String id) {
   		return sysCustomerService.selectByPrimaryKey(id);
   	}
    

	
}
