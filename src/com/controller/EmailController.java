package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.dao.EmailMapper;
import com.pojo.Email;
import com.pojo.Examresult;
import com.pojo.Userstu;
import com.util.PageUtil;

@Controller
public class EmailController {
	@Resource
	EmailMapper dao;
	@RequestMapping(value="/seleEm",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object getList(String email,String bool,String love){
		List<Email> list = dao.seleEm(email, bool, love);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	@RequestMapping(value="/addEmail",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object add(String send,String inbox,String head,String text){
		int list=dao.addEmail1(send, inbox);
		dao.addEmail2(head, text);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	@RequestMapping(value="/judge",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object judge(int type,String email){
		Userstu list=dao.judge(type, email);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	@RequestMapping(value="/sc",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object sc(int id){
		int list=dao.sc(id);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	@RequestMapping(value="/bc",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object bc(int id){
		int list=dao.bc(id);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	/*@RequestMapping(value="/Recent",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object Recent(int id){
		int list=dao.Recent(id);
		int list1=dao.Recentdel(id);
		int list2=dao.Recentdel1(id);
		String json = JSONArray.toJSONString(list);
		return json;
	 }*/
	@RequestMapping(value="/Recentdelall",method=RequestMethod.GET,produces="application/json; charset=utf-8")
	@ResponseBody
	public Object show(String d){
		List<Integer> list=new ArrayList<Integer>();
		for (String  i : d.split(",")) {
			if(i!=null&&i!=""){
				try {
					list.add(new Integer(i));
				} catch (Exception e) {
					e.getMessage();
				}
				
			}
		}
		int list1=dao.Recentdel(list);
		int list2=dao.Recentdel1(list);
		return JSONArray.toJSONString(list1);
	}
	
	/*@RequestMapping(value="/Recentlydele",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object Recentlydele(int id){
		int list=dao.Recentlydele(id);
		int list1=dao.Recentlydele1(id);
		int list2=dao.Recentlydeledel(id);
		String json = JSONArray.toJSONString(list);
		return json;
	 }*/
}
