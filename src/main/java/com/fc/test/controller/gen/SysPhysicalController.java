package com.fc.test.controller.gen;

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
import com.fc.test.model.auto.SysPhysical;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.SysPhysicalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("SysPhysicalController")
@Api(value = "")
public class SysPhysicalController extends BaseController{
	
	private String prefix = "gen/sysPhysical";
	@Autowired
	private SysPhysicalService sysPhysicalService;
	
	@GetMapping("view/{id}")
//	@RequiresPermissions("gen:sysPhysical:view")
    public String view(@PathVariable("id") String id,ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
		model.addAttribute("id",id);
        return prefix + "/list";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list/{id}")
//	@RequiresPermissions("gen:sysPhysical:list")
	@ResponseBody
	public Object list(@PathVariable("id") String id,Tablepar tablepar,String searchText){
		PageInfo<SysPhysical> page=sysPhysicalService.list(tablepar,searchText,id) ;
		TableSplitResult<SysPhysical> result=new TableSplitResult<SysPhysical>(page.getPageNum(), page.getTotal(), page.getList()); 
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
//	@RequiresPermissions("gen:sysPhysical:add")
	@ResponseBody
	public AjaxResult add(SysPhysical sysPhysical){
		int b=sysPhysicalService.insertSelective(sysPhysical);
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
	@RequiresPermissions("gen:sysPhysical:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysPhysicalService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(SysPhysical sysPhysical){
		int b=sysPhysicalService.checkNameUnique(sysPhysical);
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
        mmap.put("SysPhysical", sysPhysicalService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:sysPhysical:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPhysical record)
    {
        return toAjax(sysPhysicalService.updateByPrimaryKeySelective(record));
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
   	public SysPhysical edit(@PathVariable("id") String id) {
   		return sysPhysicalService.selectByPrimaryKey(id);
   	}
    

	
}
