package com.pojo;

public class Course {
	private int id;//�γ�ID
	private int thid;//��ʦID
	private int timeid;//ʱ��ID
	private int roomid;//����ID
	private int classid;//�༶ID
	private String tname;//��������
	private String date;//����ʱ��:��һ���ܶ�
	private String time;//ʱ��:���硢����
	private String cname;//�༶����
	private String thname;//��ʦ����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThid() {
		return thid;
	}
	public void setThid(int thid) {
		this.thid = thid;
	}
	public int getTimeid() {
		return timeid;
	}
	public void setTimeid(int timeid) {
		this.timeid = timeid;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getThname() {
		return thname;
	}
	public void setThname(String thname) {
		this.thname = thname;
	}
	public Course(int id, int thid, int timeid, int roomid, int classid,
			String tname, String date, String time, String cname, String thname) {
		super();
		this.id = id;
		this.thid = thid;
		this.timeid = timeid;
		this.roomid = roomid;
		this.classid = classid;
		this.tname = tname;
		this.date = date;
		this.time = time;
		this.cname = cname;
		this.thname = thname;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", thid=" + thid + ", timeid=" + timeid
				+ ", roomid=" + roomid + ", classid=" + classid + ", tname="
				+ tname + ", date=" + date + ", time=" + time + ", cname="
				+ cname + ", thname=" + thname + "]";
	}
	public Course() {
		
	}
}
