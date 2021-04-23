package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.SysCustomerMapper;
import com.fc.test.model.auto.SysCustomer;
import com.fc.test.model.auto.SysCustomerExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  SysCustomerService
 * @Title: SysCustomerService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:19:23  
 **/
@Service
public class SysCustomerService implements BaseService<SysCustomer, SysCustomerExample>{
	@Autowired
	private SysCustomerMapper sysCustomerMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<SysCustomer> list(Tablepar tablepar,String name){
	        SysCustomerExample testExample=new SysCustomerExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andNicknameLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<SysCustomer> list= sysCustomerMapper.selectByExample(testExample);
	        PageInfo<SysCustomer> pageInfo = new PageInfo<SysCustomer>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = Convert.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			SysCustomerExample example=new SysCustomerExample();
			example.createCriteria().andIdIn(stringB);
			return sysCustomerMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public SysCustomer selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return sysCustomerMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysCustomer record) {
		return sysCustomerMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysCustomer record) {
				
		record.setId(null);
		
				
		return sysCustomerMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysCustomer record, SysCustomerExample example) {
		
		return sysCustomerMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysCustomer record, SysCustomerExample example) {
		
		return sysCustomerMapper.updateByExample(record, example);
	}

	@Override
	public List<SysCustomer> selectByExample(SysCustomerExample example) {
		
		return sysCustomerMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysCustomerExample example) {
		
		return sysCustomerMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysCustomerExample example) {
		
		return sysCustomerMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysCustomer
	 * @return
	 */
	public int checkNameUnique(SysCustomer sysCustomer){
		SysCustomerExample example=new SysCustomerExample();
		example.createCriteria().andNicknameEqualTo(sysCustomer.getNickname());
		List<SysCustomer> list=sysCustomerMapper.selectByExample(example);
		return list.size();
	}


}
