package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {
	private int emailid;
	/**
	 * @return the emailid
	 */
	public int getEmailid() {
		return emailid;
	}
	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}
	private int id;//�ʼ����
	private String text;//�ʼ�����
	private int bool;//�Ƿ��Ѷ�  0����Ϊδ��  1�������Ѷ�
	private String inbox;//�ռ��˵�����
	private String sendemail;//�����˵�����
	private Date createTime;//����ʱ��
	private int love;//�Ƿ��ղ�    0����δ�ղ�  1�������ղ�
	private String headtext;//����
	private String createDate;
	
	public String getCreateDate() {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.createDate = sim.format(createTime);
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Email() {
		// TODO Auto-generated constructor stub
	}
	public Email(int id ,String text,int bool,String inbox,String sendemail,Date createTime,int love){
		this.id=id;
		this.text=text;
		this.bool = bool;
		this.inbox = inbox;
		this.sendemail =sendemail;
		this.createTime= createTime;
		this.love = love;
	}
	
	
	
	public String getHeadtext() {
		return headtext;
	}
	public void setHeadtext(String headtext) {
		this.headtext = headtext;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getBool() {
		return bool;
	}
	public void setBool(int bool) {
		this.bool = bool;
	}
	public String getInbox() {
		return inbox;
	}
	public void setInbox(String inbox) {
		this.inbox = inbox;
	}
	public String getSendemail() {
		return sendemail;
	}
	public void setSendemail(String sendemail) {
		this.sendemail = sendemail;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
