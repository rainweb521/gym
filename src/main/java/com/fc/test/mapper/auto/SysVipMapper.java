package com.fc.test.mapper.auto;

import com.fc.test.model.auto.SysVip;
import com.fc.test.model.auto.SysVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  SysVipMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:19:47
 */
public interface SysVipMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(SysVipExample example);

    int deleteByExample(SysVipExample example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(SysVip record);

    int insertSelective(SysVip record);

    List<SysVip> selectByExample(SysVipExample example);
		
    SysVip selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") SysVip record, @Param("example") SysVipExample example);

    int updateByExample(@Param("record") SysVip record, @Param("example") SysVipExample example); 
		
    int updateByPrimaryKeySelective(SysVip record);

    int updateByPrimaryKey(SysVip record);
  	  	
}