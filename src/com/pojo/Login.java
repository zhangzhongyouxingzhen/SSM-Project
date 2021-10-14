package com.pojo;

import java.sql.Date;

public class Login {
	private int id;//ID
	private String userName;//�û���
	private String password;//����
	private int userType;//�û�����
	private Date createDate;//��������
	private int stuid;//ѧ������id
	private int thid;//��ʦ����id
	private String phonenum;//�ֻ���
	private String tname;//���
	private int stid;
	private String thname;//��ʦ����
	private String sname;//ѧ������
	private String email;//����
	private String photo;//����
	
	
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the thname
	 */
	public String getThname() {
		return thname;
	}
	/**
	 * @param thname the thname to set
	 */
	public void setThname(String thname) {
		this.thname = thname;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the stid
	 */
	public int getStid() {
		return stid;
	}
	/**
	 * @param stid the stid to set
	 */
	public void setStid(int stid) {
		this.stid = stid;
	}
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	/**
	 * @return the stuid
	 */
	public int getStuid() {
		return stuid;
	}
	/**
	 * @param stuid the stuid to set
	 */
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	/**
	 * @return the thid
	 */
	public int getThid() {
		return thid;
	}
	/**
	 * @param thid the thid to set
	 */
	public void setThid(int thid) {
		this.thid = thid;
	}
	/**
	 * @return the phonenum
	 */
	public String getPhonenum() {
		return phonenum;
	}
	/**
	 * @param phonenum the phonenum to set
	 */
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public Login() {
	}
	public Login(int id, String userName, String password, int userType,
			Date createDate) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.createDate = createDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
