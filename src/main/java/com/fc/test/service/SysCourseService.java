package com.fc.test.service;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.fc.test.model.auto.SysMycourse;
import com.fc.test.shiro.util.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.SysCourseMapper;
import com.fc.test.model.auto.SysCourse;
import com.fc.test.model.auto.SysCourseExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  SysCourseService
 * @Title: SysCourseService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:17:02  
 **/
@Service
public class SysCourseService implements BaseService<SysCourse, SysCourseExample>{
	@Autowired
	private SysCourseMapper sysCourseMapper;
	@Autowired
    private SysMycourseService sysMycourseService;
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<SysCourse> list(Tablepar tablepar,String name){
	        SysCourseExample testExample=new SysCourseExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andTitleLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<SysCourse> list= sysCourseMapper.selectByExample(testExample);
	        PageInfo<SysCourse> pageInfo = new PageInfo<SysCourse>(list);
	        return  pageInfo;
	 }
    public PageInfo<SysCourse> list2(Tablepar tablepar,String name,String id){
        SysCourseExample testExample=new SysCourseExample();
        testExample.setOrderByClause("id ASC");
        if(name!=null&&!"".equals(name)){
            testExample.createCriteria().andTitleLike("%"+name+"%");
        }

        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<SysCourse> list= sysCourseMapper.selectByExample(testExample);
        //以上是所有的课程，下面查询会员购买的课程，然后取交集
        List<String> mycourselist = sysMycourseService.selectByExample(null).stream().filter(line -> line.getUserId().toString().equals(id))
                .map(line->line.getCourseId().toString()).collect(Collectors.toList());
        List<SysCourse> newCourse = list.stream().filter(line -> mycourselist.contains(line.getId().toString()))
//                .forEach(line->line.setStatus(mycourselist.get(mycourselist.indexOf(line.getId().toString()))))
                .collect(Collectors.toList());
        PageInfo<SysCourse> pageInfo = new PageInfo<SysCourse>(newCourse);
        return  pageInfo;
    }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			SysCourseExample example=new SysCourseExample();
			example.createCriteria().andIdIn(stringB);
			return sysCourseMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public SysCourse selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return sysCourseMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysCourse record) {
		return sysCourseMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysCourse record) {
				
		record.setId(null);
		
				
		return sysCourseMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysCourse record, SysCourseExample example) {
		
		return sysCourseMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysCourse record, SysCourseExample example) {
		
		return sysCourseMapper.updateByExample(record, example);
	}

	@Override
	public List<SysCourse> selectByExample(SysCourseExample example) {
		
		return sysCourseMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysCourseExample example) {
		
		return sysCourseMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysCourseExample example) {
		
		return sysCourseMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysCourse
	 * @return
	 */
	public int checkNameUnique(SysCourse sysCourse){
		SysCourseExample example=new SysCourseExample();
		example.createCriteria().andTitleEqualTo(sysCourse.getTitle());
		List<SysCourse> list=sysCourseMapper.selectByExample(example);
		return list.size();
	}


}
