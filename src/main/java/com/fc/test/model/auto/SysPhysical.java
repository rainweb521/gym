package com.fc.test.model.auto;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.Integer;

/**
 *  SysPhysical 
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-02-28 15:55:48
 */
 @ApiModel(value="SysPhysical", description="")
public class SysPhysical implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	@ApiModelProperty(value = "")
	private Integer id;
		
	/** 身高 **/
	@ApiModelProperty(value = "身高")
	private String height;
		
	/** 体重 **/
	@ApiModelProperty(value = "体重")
	private String weight;
		
	/** bmi **/
	@ApiModelProperty(value = "bmi")
	private String bmi;
		
	/** 体内脂肪 **/
	@ApiModelProperty(value = "体内脂肪")
	private String fat;
		
	/** 肌肉 **/
	@ApiModelProperty(value = "肌肉")
	private String muscle;
		
	/** 水分 **/
	@ApiModelProperty(value = "水分")
	private String moisture;
		
	/** 蛋白质 **/
	@ApiModelProperty(value = "蛋白质")
	private String protein;
		
	/** 骨量 **/
	@ApiModelProperty(value = "骨量")
	private String bone;
		
	/** 性别 **/
	@ApiModelProperty(value = "性别")
	private String sex;
		
	/** 年龄 **/
	@ApiModelProperty(value = "年龄")
	private Integer age;
		
	/** 备注 **/
	@ApiModelProperty(value = "备注")
	private String remark;
		
	/** 姓名 **/
	@ApiModelProperty(value = "姓名")
	private String username;
		
	/** 课程id **/
	@ApiModelProperty(value = "课程id")
	private Integer courseId;
		
		
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
	 
			
	public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
	 
			
	public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
	 
			
	public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }
	 
			
	public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }
	 
			
	public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }
	 
			
	public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }
	 
			
	public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }
	 
			
	public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }
	 
			
	public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
	 
			
	public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
	 
			
	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	 
			
	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
	 
			
	public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
	 
			
	public SysPhysical() {
        super();
    }
    
																																																																								
	public SysPhysical(Integer id,String height,String weight,String bmi,String fat,String muscle,String moisture,String protein,String bone,String sex,Integer age,String remark,String username,Integer courseId) {
	
		this.id = id;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.fat = fat;
		this.muscle = muscle;
		this.moisture = moisture;
		this.protein = protein;
		this.bone = bone;
		this.sex = sex;
		this.age = age;
		this.remark = remark;
		this.username = username;
		this.courseId = courseId;
		
	}
	
}