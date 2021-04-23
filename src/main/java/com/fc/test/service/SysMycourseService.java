package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.SysMycourseMapper;
import com.fc.test.model.auto.SysMycourse;
import com.fc.test.model.auto.SysMycourseExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  SysMycourseService
 * @Title: SysMycourseService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 21:23:30  
 **/
@Service
public class SysMycourseService implements BaseService<SysMycourse, SysMycourseExample>{
	@Autowired
	private SysMycourseMapper sysMycourseMapper;
	
      	   	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<SysMycourse> list(Tablepar tablepar,String name){
	        SysMycourseExample testExample=new SysMycourseExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andCourseIdLike(null);
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<SysMycourse> list= sysMycourseMapper.selectByExample(testExample);
	        PageInfo<SysMycourse> pageInfo = new PageInfo<SysMycourse>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = Convert.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			SysMycourseExample example=new SysMycourseExample();
			example.createCriteria().andIdIn(stringB);
			return sysMycourseMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public SysMycourse selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return sysMycourseMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysMycourse record) {
		return sysMycourseMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysMycourse record) {
				
		record.setId(null);
		
				
		return sysMycourseMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysMycourse record, SysMycourseExample example) {
		
		return sysMycourseMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysMycourse record, SysMycourseExample example) {
		
		return sysMycourseMapper.updateByExample(record, example);
	}

	@Override
	public List<SysMycourse> selectByExample(SysMycourseExample example) {
		
		return sysMycourseMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysMycourseExample example) {
		
		return sysMycourseMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysMycourseExample example) {
		
		return sysMycourseMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysMycourse
	 * @return
	 */
	public int checkNameUnique(SysMycourse sysMycourse){
		SysMycourseExample example=new SysMycourseExample();
		example.createCriteria().andCourseIdEqualTo(sysMycourse.getCourseId());
		List<SysMycourse> list=sysMycourseMapper.selectByExample(example);
		return list.size();
	}


}
