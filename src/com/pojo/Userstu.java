package com.pojo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Userstu {
	private int id;//ѧ��ID
	private String sname;//ѧ������
	private Date bornDate;//��������
	private String bornDates;//����
	
	/**
	 * @return the bornDates
	 */
	public String getBornDates() {
		SimpleDateFormat fo=new SimpleDateFormat("yyyy-MM-dd");
		if(bornDate!=null){
			this.bornDates=fo.format(bornDate);
			
		}
		return bornDates;
	}
	/**
	 * @param bornDates the bornDates to set
	 */
	public void setBornDates(String bornDates) {
		this.bornDates = bornDates;
	}
	private String email;
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the bornDates
	 */
	
	private String from;//����
	private int classid;//�༶id
	private int majorid;//רҵID
	private String state;//״̬
	private String sex;//�Ա�
	private String nativename;//����
	private String phonenum;//�绰����
	private String arean;//��������
	private int idp;//ʡid
	private int idc;//��id
	private int idt;//��id
	private String photo;//ͷ��
	private String introduce;//����
	
	
	/**
	 * @return the introduce
	 */
	public String getIntroduce() {
		return introduce;
	}
	/**
	 * @param introduce the introduce to set
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the idp
	 */
	public int getIdp() {
		return idp;
	}
	/**
	 * @param idp the idp to set
	 */
	public void setIdp(int idp) {
		this.idp = idp;
	}
	/**
	 * @return the idc
	 */
	public int getIdc() {
		return idc;
	}
	/**
	 * @param idc the idc to set
	 */
	public void setIdc(int idc) {
		this.idc = idc;
	}
	/**
	 * @return the idt
	 */
	public int getIdt() {
		return idt;
	}
	/**
	 * @param idt the idt to set
	 */
	public void setIdt(int idt) {
		this.idt = idt;
	}
	/**
	 * @return the provincecode
	 */

	/**
	 * @return the arean
	 */
	public String getArean() {
		return arean;
	}
	/**
	 * @param arean the arean to set
	 */
	public void setArean(String arean) {
		this.arean = arean;
	}
	/**
	 * @return the classid
	 */
	public int getClassid() {
		return classid;
	}
	/**
	 * @param classid the classid to set
	 */
	public void setClassid(int classid) {
		this.classid = classid;
	}

	
	/**
	 * @return the phonenum
	 */
	
	/**
	 * @return the nativename
	 */
	public String getNativename() {
		return nativename;
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
	/**
	 * @param nativename the nativename to set
	 */
	public void setNativename(String nativename) {
		this.nativename = nativename;
	}
	private String major;//����
	private String classs;//�༶
	
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the classs
	 */
	public String getClasss() {
		return classs;
	}
	/**
	 * @param classs the classs to set
	 */
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public Userstu() {
		
	}
	public Userstu(int id, String sname, Date bornDate, String from,
			int majorid, String state, String sex) {
		this.id = id;
		this.sname = sname;
		this.bornDate = bornDate;
		this.from = from;
		this.majorid = majorid;
		this.state = state;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getMajorid() {
		return majorid;
	}
	public void setMajorid(int majorid) {
		this.majorid = majorid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
