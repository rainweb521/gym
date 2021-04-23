package com.fc.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import com.fc.test.model.auto.CourseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.SysCommentMapper;
import com.fc.test.model.auto.SysComment;
import com.fc.test.model.auto.SysCommentExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;

/**
 *  SysCommentService
 * @Title: SysCommentService.java 
 * @Package com.fc.test.service 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-28 15:56:32  
 **/
@Service
public class SysCommentService implements BaseService<SysComment, SysCommentExample>{
	@Autowired
	private SysCommentMapper sysCommentMapper;
	
      	   	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<SysComment> list(Tablepar tablepar,String name){
	        SysCommentExample testExample=new SysCommentExample();
	        testExample.setOrderByClause("id ASC");
	        if(name!=null&&!"".equals(name)){
	        	testExample.createCriteria().andTitleLike("%"+name+"%");
	        }

	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<SysComment> list= sysCommentMapper.selectByExample(testExample);
	        PageInfo<SysComment> pageInfo = new PageInfo<SysComment>(list);
	        return  pageInfo;
	 }
    public PageInfo<SysComment> list2(Tablepar tablepar,String name,List<CourseTest> alllist){
        SysCommentExample testExample=new SysCommentExample();
        testExample.setOrderByClause("id ASC");
        if(name!=null&&!"".equals(name)){
            testExample.createCriteria().andTitleLike("%"+name+"%");
        }


        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<SysComment> list= sysCommentMapper.selectByExample(testExample);
        List<SysComment> list2 = new ArrayList<>();
        alllist.forEach(line->{
            SysComment sysComment =  new SysComment();

            sysComment.setCourseId(line.getAll());
            sysComment.setType(line.getToday());
            sysComment.setTitle(line.getUsername());
            list2.add(sysComment);
        });
        PageInfo<SysComment> pageInfo = new PageInfo<SysComment>(list2);
        return  pageInfo;
    }


	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = Convert.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			SysCommentExample example=new SysCommentExample();
			example.createCriteria().andIdIn(stringB);
			return sysCommentMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public SysComment selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return sysCommentMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(SysComment record) {
		return sysCommentMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(SysComment record) {
				
		record.setId(null);
		
				
		return sysCommentMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(SysComment record, SysCommentExample example) {
		
		return sysCommentMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(SysComment record, SysCommentExample example) {
		
		return sysCommentMapper.updateByExample(record, example);
	}

	@Override
	public List<SysComment> selectByExample(SysCommentExample example) {
		
		return sysCommentMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(SysCommentExample example) {
		
		return sysCommentMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(SysCommentExample example) {
		
		return sysCommentMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param sysComment
	 * @return
	 */
	public int checkNameUnique(SysComment sysComment){
		SysCommentExample example=new SysCommentExample();
		example.createCriteria().andTitleEqualTo(sysComment.getTitle());
		List<SysComment> list=sysCommentMapper.selectByExample(example);
		return list.size();
	}


}
