package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Email;
import com.pojo.Userstu;

public interface EmailMapper {
	public List<Email> seleEm(@Param("email")String email,@Param("bool")String bool,@Param("love")String love );
	public int addEmail2(@Param("headtext")String headtext,@Param("text")String text);
	public int addEmail1(@Param("sendemail")String sendemail,@Param("inbox")String inbox);
	public Userstu judge(@Param("type")int type,@Param("email")String email);
	public int sc(@Param("id")int id);
	public int bc(@Param("id")int id);
	public int Recentdel(List<Integer> list);
	public int Recentdel1(List<Integer> list);
	
	
}
