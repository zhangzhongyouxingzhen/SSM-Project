package com.pojo;

public class Examresult {
	int id;// id
	int examid;// ���Ա��
	int compresult;// ���Գɼ�
	int paperesult;// ���Գɼ�
	int stuid;// ѧ��id
	int mid;// רҵid
	public Examresult() {
		
	}

	public Examresult(int id, int examid, int compresult, int paperesult,
			int stuid, int mid, String sname, String mname, String examname) {
		
		this.id = id;
		this.examid = examid;
		this.compresult = compresult;
		this.paperesult = paperesult;
		this.stuid = stuid;
		this.mid = mid;
		this.sname = sname;
		this.mname = mname;
		this.examname = examname;
	}

	String sname;// ѧ������
	String mname;// רҵ����
	String examname;//��������
	/**
	 * @return the examname
	 */
	public String getExamname() {
		return examname;
	}

	/**
	 * @param examname the examname to set
	 */
	public void setExamname(String examname) {
		this.examname = examname;
	}

	@Override
	public String toString() {
		return "Examresult [id=" + id + ", examid=" + examid + ", compresult="
				+ compresult + ", paperesult=" + paperesult + ", stuid="
				+ stuid + ", mid=" + mid + ", sname=" + sname + ", mname="
				+ mname + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public int getCompresult() {
		return compresult;
	}

	public void setCompresult(int compresult) {
		this.compresult = compresult;
	}

	public int getPaperesult() {
		return paperesult;
	}

	public void setPaperesult(int paperesult) {
		this.paperesult = paperesult;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Examresult(int id, int examid, int compresult, int paperesult,
			int stuid, int mid, String sname, String mname) {
		super();
		this.id = id;
		this.examid = examid;
		this.compresult = compresult;
		this.paperesult = paperesult;
		this.stuid = stuid;
		this.mid = mid;
		this.sname = sname;
		this.mname = mname;
	}
}
