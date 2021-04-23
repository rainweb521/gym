package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  SysCustomer 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-26 20:19:23
 */
 @ApiModel(value="SysCustomer", description="")
public class SysCustomer implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer id;
		
	/** 姓名 **/
	@ApiModelProperty(value = "姓名")
	private String nickname;
		
	/** 年龄 **/
	@ApiModelProperty(value = "年龄")
	private Integer age;
		
	/** 性别 **/
	@ApiModelProperty(value = "性别")
	private String sex;
		
	/** 生日 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "生日")
	private Date birthday;
		
	/** 手机号 **/
	@ApiModelProperty(value = "手机号")
	private String phone;
		
	/** 家庭住址 **/
	@ApiModelProperty(value = "家庭住址")
	private String address;
		
	/** 邮箱 **/
	@ApiModelProperty(value = "邮箱")
	private String email;
		
	/** 爱好 **/
	@ApiModelProperty(value = "爱好")
	private String hobby;
		
	/** userid **/
	@ApiModelProperty(value = "userid")
	private Integer userId;
		
	/** 注册时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@ApiModelProperty(value = "注册时间")
	private Date createDate;
		
		
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
	 
			
	public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
	 
			
	public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
	 
			
	public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
	 
			
	public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
	 
			
	public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	 
			
	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	 
			
	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	 
			
	public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
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
	 
			
	public SysCustomer() {
        super();
    }
    
																																																									
	public SysCustomer(Integer id,String nickname,Integer age,String sex,Date birthday,String phone,String address,String email,String hobby,Integer userId,Date createDate) {
	
		this.id = id;
		this.nickname = nickname;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.hobby = hobby;
		this.userId = userId;
		this.createDate = createDate;
		
	}
	
}