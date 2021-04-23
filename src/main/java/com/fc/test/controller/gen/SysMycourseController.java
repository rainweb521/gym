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
import com.fc.test.model.auto.SysMycourse;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.SysMycourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("SysMycourseController")
@Api(value = "")
public class SysMycourseController extends BaseController{
	
	private String prefix = "gen/sysMycourse";
	@Autowired
	private SysMycourseService sysMycourseService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:sysMycourse:view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
	@RequiresPermissions("gen:sysMycourse:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<SysMycourse> page=sysMycourseService.list(tablepar,searchText) ; 
		TableSplitResult<SysMycourse> result=new TableSplitResult<SysMycourse>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	@RequiresPermissions("gen:sysMycourse:add")
	@ResponseBody
	public AjaxResult add(SysMycourse sysMycourse){
		int b=sysMycourseService.insertSelective(sysMycourse);
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
	@RequiresPermissions("gen:sysMycourse:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=sysMycourseService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(SysMycourse sysMycourse){
		int b=sysMycourseService.checkNameUnique(sysMycourse);
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
        mmap.put("SysMycourse", sysMycourseService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:sysMycourse:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysMycourse record)
    {
        return toAjax(sysMycourseService.updateByPrimaryKeySelective(record));
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
   	public SysMycourse edit(@PathVariable("id") String id) {
   		return sysMycourseService.selectByPrimaryKey(id);
   	}
    

	
}
