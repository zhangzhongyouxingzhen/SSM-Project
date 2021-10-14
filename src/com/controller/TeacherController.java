package com.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.dao.TeacherMapper;
import com.pojo.Teacher;
import com.util.PageUtil;

@Controller
public class TeacherController {
	@Resource
	TeacherMapper dao;
	//��ҳ��ѯ����
			@RequestMapping(value="/seletea",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
			 @ResponseBody
			 public Object getList(String index,String name){
				name=name==null?"":name;
				index=index==null?"1":index;
				int coun=dao.count("%"+name+"%");
				int count=coun%10==0?coun/10:coun/10+1;
				List<Teacher> list=dao.list((new Integer(index)-1)*10,"%"+name+"%");
				PageUtil page=new PageUtil(new Integer(index),list,count);
				String json = JSONArray.toJSONString(page);
				return json;	
			 }
	//ɾ������
			@RequestMapping(value="/deletea",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
			 @ResponseBody
			 public Object delList(String id){
				return JSONArray.toJSONString(dao.dele(id));	
			 }	
			//����Ų�ѯ
			@RequestMapping("/updseltea")
			public String updsel(String id,Map map){
				Teacher list = dao.updsel(id);
				map.put("list", list);
				return "edit-teacher";
			}
			//�޸�
			@RequestMapping("/updtea")
			 public String updList(Teacher teacher,Map map){
				dao.updat(teacher);
				return "edit-teacher";
			 }	
			//����
			@RequestMapping("/insetea")
			public String inseList(Teacher teacher){
				dao.insert(teacher);
				return "add-teacher";
			}
}
