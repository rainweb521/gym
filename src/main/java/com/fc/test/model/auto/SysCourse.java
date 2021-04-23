package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  SysCourse 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:17:02
 */
 @ApiModel(value="SysCourse", description="")
public class SysCourse implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Long id;
		
	/** 容纳人数 **/
	@ApiModelProperty(value = "容纳人数")
	private Integer count;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "创建时间")
	private Date createDate;
		
	/** 结束时间 **/
	@ApiModelProperty(value = "结束时间")
	private String end;
		
	/** 标题 **/
	@ApiModelProperty(value = "标题")
	private String title;
		
	/** 备注 **/
	@ApiModelProperty(value = "备注")
	private String remark;
		
	/** 开始时间 **/
	@ApiModelProperty(value = "开始时间")
	private String start;
		
	/** 状态 **/
	@ApiModelProperty(value = "状态")
	private Integer status;
		
	/** 授课类型 **/
	@ApiModelProperty(value = "授课类型")
	private String type;
		
	/** 教练id **/
	@ApiModelProperty(value = "教练id")
	private Long userId;
		
	/** 教练姓名 **/
	@ApiModelProperty(value = "教练姓名")
	private String userName;
		
	/** 价格 **/
	@ApiModelProperty(value = "价格")
	private Double price;
		
	/** 教室 **/
	@ApiModelProperty(value = "教室")
	private String room;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
	 
			
	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
	 
			
	public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
	 
			
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	 
			
	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	 
			
	public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
	 
			
	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
	 
			
	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
	 
			
	public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
	 
			
	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
	 
			
	public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
	 
			
	public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
	 
			
	public SysCourse() {
        super();
    }
    
																																																																			
	public SysCourse(Long id,Integer count,Date createDate,String end,String title,String remark,String start,Integer status,String type,Long userId,String userName,Double price,String room) {
	
		this.id = id;
		this.count = count;
		this.createDate = createDate;
		this.end = end;
		this.title = title;
		this.remark = remark;
		this.start = start;
		this.status = status;
		this.type = type;
		this.userId = userId;
		this.userName = userName;
		this.price = price;
		this.room = room;
		
	}
	
}