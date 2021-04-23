package com.fc.test.mapper.auto;

import com.fc.test.model.auto.SysMycourse;
import com.fc.test.model.auto.SysMycourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  SysMycourseMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 21:23:30
 */
public interface SysMycourseMapper {
      	   	      	      	      	      	      
    long countByExample(SysMycourseExample example);

    int deleteByExample(SysMycourseExample example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(SysMycourse record);

    int insertSelective(SysMycourse record);

    List<SysMycourse> selectByExample(SysMycourseExample example);
		
    SysMycourse selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") SysMycourse record, @Param("example") SysMycourseExample example);

    int updateByExample(@Param("record") SysMycourse record, @Param("example") SysMycourseExample example); 
		
    int updateByPrimaryKeySelective(SysMycourse record);

    int updateByPrimaryKey(SysMycourse record);
  	  	
}