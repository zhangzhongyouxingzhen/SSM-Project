package com.pojo;

public class Districts {
	private int id;//���
	private int pid;//�ϼ����
	private int deep;//�㼶
	private String ext_name;//����
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the deep
	 */
	public int getDeep() {
		return deep;
	}
	/**
	 * @param deep the deep to set
	 */
	public void setDeep(int deep) {
		this.deep = deep;
	}
	/**
	 * @return the ext_name
	 */
	public String getExt_name() {
		return ext_name;
	}
	/**
	 * @param ext_name the ext_name to set
	 */
	public void setExt_name(String ext_name) {
		this.ext_name = ext_name;
	}
	public Districts(int id, int pid, int deep, String ext_name) {
	
		this.id = id;
		this.pid = pid;
		this.deep = deep;
		this.ext_name = ext_name;
	}
	public Districts() {
	
	}
	
}
