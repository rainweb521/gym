package com.fc.test.mapper.auto;

import com.fc.test.model.auto.SysCustomer;
import com.fc.test.model.auto.SysCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  SysCustomerMapper
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:19:23
 */
public interface SysCustomerMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(SysCustomerExample example);

    int deleteByExample(SysCustomerExample example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(SysCustomer record);

    int insertSelective(SysCustomer record);

    List<SysCustomer> selectByExample(SysCustomerExample example);
		
    SysCustomer selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") SysCustomer record, @Param("example") SysCustomerExample example);

    int updateByExample(@Param("record") SysCustomer record, @Param("example") SysCustomerExample example); 
		
    int updateByPrimaryKeySelective(SysCustomer record);

    int updateByPrimaryKey(SysCustomer record);
  	  	
}