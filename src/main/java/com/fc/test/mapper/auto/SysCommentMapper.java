package com.fc.test.mapper.auto;

import com.fc.test.model.auto.SysComment;
import com.fc.test.model.auto.SysCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  SysCommentMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-28 15:56:32
 */
public interface SysCommentMapper {
      	   	      	      	      	      	      	      	      
    long countByExample(SysCommentExample example);

    int deleteByExample(SysCommentExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(SysComment record);

    int insertSelective(SysComment record);

    List<SysComment> selectByExample(SysCommentExample example);
		
    SysComment selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") SysComment record, @Param("example") SysCommentExample example);

    int updateByExample(@Param("record") SysComment record, @Param("example") SysCommentExample example); 
		
    int updateByPrimaryKeySelective(SysComment record);

    int updateByPrimaryKey(SysComment record);
  	  	
}