package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.SysPhysicalMapper;
import com.fc.test.model.auto.SysPhysical;
import com.fc.test.model.auto.SysPhysicalExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  SysPhysicalService
 * @Title: SysPhysicalService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-28 15:55:48  
 **/
@Service
public class SysPhysicalService implements BaseService<SysPhysical, SysPhysicalExample>{
	@Autowired
	private SysPhysicalMapper sysPhysicalMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param
	 * @param
	 * @return
	 */
	 public PageInfo<SysPhysical> list(Tablepar tablepar,String name,String id){
	        SysPhysicalExample testExample=new SysPhysicalExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andUsernameLike("%"+name+"%");
	        }
            testExample.createCriteria().andCourseIdEqualTo(Integer.valueOf(id));

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<SysPhysical> list= sysPhysicalMapper.selectByExample(testExample);
	        PageInfo<SysPhysical> pageInfo = new PageInfo<SysPhysical>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = Convert.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			SysPhysicalExample example=new SysPhysicalExample();
			example.createCriteria().andIdIn(stringB);
			return sysPhysicalMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public SysPhysical selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return sysPhysicalMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysPhysical record) {
		return sysPhysicalMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysPhysical record) {
				
		record.setId(null);
		
				
		return sysPhysicalMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysPhysical record, SysPhysicalExample example) {
		
		return sysPhysicalMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysPhysical record, SysPhysicalExample example) {
		
		return sysPhysicalMapper.updateByExample(record, example);
	}

	@Override
	public List<SysPhysical> selectByExample(SysPhysicalExample example) {
		
		return sysPhysicalMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysPhysicalExample example) {
		
		return sysPhysicalMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysPhysicalExample example) {
		
		return sysPhysicalMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysPhysical
	 * @return
	 */
	public int checkNameUnique(SysPhysical sysPhysical){
		SysPhysicalExample example=new SysPhysicalExample();
		example.createCriteria().andUsernameEqualTo(sysPhysical.getUsername());
		List<SysPhysical> list=sysPhysicalMapper.selectByExample(example);
		return list.size();
	}


}
