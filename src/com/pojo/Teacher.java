package com.pojo;

public class Teacher {
	private int id;//ְ��id
	private String thname;//ְ������
	private String post;//ְλ
	private double money;//н��
	private String sex;//�Ա�
	private String phonenum;//�绰
	private String email;//����
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Teacher(int id, String thname, String post, double money) {
		this.id = id;
		this.thname = thname;
		this.post = post;
		this.money = money;
	}
	public Teacher() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getThname() {
		return thname;
	}
	public void setThname(String thname) {
		this.thname = thname;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}	
