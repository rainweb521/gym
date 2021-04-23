package com.fc.test.mapper.auto;

import com.fc.test.model.auto.SysPhysical;
import com.fc.test.model.auto.SysPhysicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  SysPhysicalMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-28 15:55:48
 */
public interface SysPhysicalMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(SysPhysicalExample example);

    int deleteByExample(SysPhysicalExample example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(SysPhysical record);

    int insertSelective(SysPhysical record);

    List<SysPhysical> selectByExample(SysPhysicalExample example);
		
    SysPhysical selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") SysPhysical record, @Param("example") SysPhysicalExample example);

    int updateByExample(@Param("record") SysPhysical record, @Param("example") SysPhysicalExample example); 
		
    int updateByPrimaryKeySelective(SysPhysical record);

    int updateByPrimaryKey(SysPhysical record);
  	  	
}