package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  SysComment 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-28 15:56:32
 */
 @ApiModel(value="SysComment", description="")
public class SysComment implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/** 评价表 **/
	@ApiModelProperty(value = "评价表")
	private Long id;
		
	/** 内容 **/
	@ApiModelProperty(value = "内容")
	private String content;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date createDate;
		
	/** 课程或教练名称 **/
	@ApiModelProperty(value = "课程或教练名称")
	private String name;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 类型 **/
	@ApiModelProperty(value = "类型")
	private Integer type;
		
	/** 用户名 **/
	@ApiModelProperty(value = "用户名")
	private String username;

    /** 课程id **/
    @ApiModelProperty(value = "课程id")
    private Integer courseId;


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
	 
			
	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
	 
			
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	 
			
	public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
	 
			
	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
	 
			
	public SysComment() {
        super();
    }
    
																																					
	public SysComment(Long id,String content,Date createDate,String name,String title,Integer type,String username) {
	
		this.id = id;
		this.content = content;
		this.createDate = createDate;
		this.name = name;
		this.title = title;
		this.type = type;
		this.username = username;
		
	}
	
}