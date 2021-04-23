package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  SysVip 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:19:47
 */
 @ApiModel(value="SysVip", description="")
public class SysVip implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer id;
		
	/** 卡号 **/
	@ApiModelProperty(value = "卡号")
	private String card;
		
	/** 会员级别 **/
	@ApiModelProperty(value = "会员级别")
	private String level;
		
	/** 余额 **/
	@ApiModelProperty(value = "余额")
	private Double balance;
		
	/** 会员卡类型 1月卡 2季卡 3半年卡 4 年卡 **/
	@ApiModelProperty(value = "会员卡类型 1月卡 2季卡 3半年卡 4 年卡")
	private String type;
		
	/** 用户id **/
	@ApiModelProperty(value = "用户id")
	private Integer userId;
		
	/** 建立时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "建立时间")
	private Date createDate;
		
	/** 备注 **/
	@ApiModelProperty(value = "备注")
	private String remark;
		
	/** 状态 **/
	@ApiModelProperty(value = "状态")
	private Integer status;
		
	/** 修改时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "修改时间")
	private Date updateDate;
		
	/** 用户姓名 **/
	@ApiModelProperty(value = "用户姓名")
	private String userName;
		
		
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
	 
			
	public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
	 
			
	public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
	 
			
	public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
	 
			
	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
	 
			
	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
	 
			
	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
	 
			
	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	 
			
	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
	 
			
	public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
	 
			
	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
	 
			
	public SysVip() {
        super();
    }
    
																																																									
	public SysVip(Integer id,String card,String level,Double balance,String type,Integer userId,Date createDate,String remark,Integer status,Date updateDate,String userName) {
	
		this.id = id;
		this.card = card;
		this.level = level;
		this.balance = balance;
		this.type = type;
		this.userId = userId;
		this.createDate = createDate;
		this.remark = remark;
		this.status = status;
		this.updateDate = updateDate;
		this.userName = userName;
		
	}
	
}