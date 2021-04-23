package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  SysMycourse 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 21:23:30
 */
 @ApiModel(value="SysMycourse", description="")
public class SysMycourse implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer id;
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer userId;
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer courseId;
		
	/**  **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "")
	private Date createDate;
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer status;
		
		
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
	 
			
	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
	 
			
	public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
	 
			
	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
	 
			
	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
	 
			
	public SysMycourse() {
        super();
    }
    
																											
	public SysMycourse(Integer id,Integer userId,Integer courseId,Date createDate,Integer status) {
	
		this.id = id;
		this.userId = userId;
		this.courseId = courseId;
		this.createDate = createDate;
		this.status = status;
		
	}
	
}