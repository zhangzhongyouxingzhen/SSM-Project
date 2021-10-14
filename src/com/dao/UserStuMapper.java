package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.pojo.Major;

import com.pojo.Districts;
import com.pojo.Teacher;
import com.pojo.Userstu;

public interface UserStuMapper {
	public List<Userstu> selgra(@Param("cn")String nn);
	public List<Userstu> email();
	public List<Userstu> sel(@Param("name")String nn,@Param("index")int qw);
	public int cou(@Param("name")String nn);
	public int del(@Param("n")int nn);
	public int add(Userstu userstu);
	public Userstu hid(@Param("id")int nn);
	public int upd(Userstu userstu);
	public int dela(List<Integer> list);
	public List<Major> selzy();
	public List<Districts> selpro();
	public List<Districts> selci(@Param("co")int nn);
	public List<Districts> selqu(@Param("co")int nn);
	public Districts selss(@Param("co")int nn);
}
