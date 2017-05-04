package cn.zhang.model;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String idNum;
	private Integer gender;
	private String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Person [" + (name != null ? "name=" + name + ", " : "") + (idNum != null ? "idNum=" + idNum + ", " : "")
				+ (gender != null ? "gender=" + gender + ", " : "") + (birthday != null ? "birthday=" + birthday : "")
				+ "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String idNum, Integer gender, String birthday) {
		super();
		this.name = name;
		this.idNum = idNum;
		this.gender = gender;
		this.birthday = birthday;
	}
}
