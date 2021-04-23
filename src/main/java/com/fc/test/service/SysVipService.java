package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.SysVipMapper;
import com.fc.test.model.auto.SysVip;
import com.fc.test.model.auto.SysVipExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  SysVipService
 * @Title: SysVipService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:19:47  
 **/
@Service
public class SysVipService implements BaseService<SysVip, SysVipExample>{
	@Autowired
	private SysVipMapper sysVipMapper;


	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<SysVip> list(Tablepar tablepar,String name){
	        SysVipExample testExample=new SysVipExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andCardLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<SysVip> list= sysVipMapper.selectByExample(testExample);
	        PageInfo<SysVip> pageInfo = new PageInfo<SysVip>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = Convert.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			SysVipExample example=new SysVipExample();
			example.createCriteria().andIdIn(stringB);
			return sysVipMapper.deleteByExample(example);
			
				
	}
	
	
	@Override
	public SysVip selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return sysVipMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysVip record) {
		return sysVipMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysVip record) {
				
		record.setId(null);
		
				
		return sysVipMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysVip record, SysVipExample example) {
		
		return sysVipMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysVip record, SysVipExample example) {
		
		return sysVipMapper.updateByExample(record, example);
	}

	@Override
	public List<SysVip> selectByExample(SysVipExample example) {
		
		return sysVipMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysVipExample example) {
		
		return sysVipMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysVipExample example) {
		
		return sysVipMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysVip
	 * @return
	 */
	public int checkNameUnique(SysVip sysVip){
		SysVipExample example=new SysVipExample();
		example.createCriteria().andCardEqualTo(sysVip.getCard());
		List<SysVip> list=sysVipMapper.selectByExample(example);
		return list.size();
	}


}
