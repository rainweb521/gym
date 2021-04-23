package com.fc.test.mapper.auto;

import com.fc.test.model.auto.SysCourse;
import com.fc.test.model.auto.SysCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  SysCourseMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:17:02
 */
public interface SysCourseMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(SysCourseExample example);

    int deleteByExample(SysCourseExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    List<SysCourse> selectByExample(SysCourseExample example);
		
    SysCourse selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") SysCourse record, @Param("example") SysCourseExample example);

    int updateByExample(@Param("record") SysCourse record, @Param("example") SysCourseExample example); 
		
    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);
  	  	
}