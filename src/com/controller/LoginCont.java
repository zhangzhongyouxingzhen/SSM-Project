package com.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.dao.LoginMapper;
import com.pojo.Districts;
import com.pojo.Login;
import com.pojo.Userstu;

@Controller
public class LoginCont {
	@Resource
	LoginMapper dao;
	
	
	@RequestMapping("/login")
	public String getlogin(HttpServletRequest request,Login lo,HttpSession session){
			Login list = dao.login(lo);
			if(list==null){
				System.out.println("��¼ʧ��");
				session.setAttribute("qq","��¼ʧ��");
				return "";
			}else if(list.getUserType()==1){
				System.out.println("����ѧ��ҳ��");
				System.out.println(list.getStuid());
				session.setAttribute("qq", list);
				session.setAttribute("shen", "ѧ��");
				return "student-index";
			}else if(list.getUserType()==2){
				session.setAttribute("qq", list);
				session.setAttribute("shen", "��ʦ");
				String img = request.getParameter("img");
				request.setAttribute("img", img);
				System.out.println("�����ʦҳ��");
				return "teacher-index";
			}else if(list.getUserType()==3){
				System.out.println("���볬������Աҳ��");
				session.setAttribute("shen", "admin");
				return "index";
			}
		return "";
	}
	@RequestMapping(value="/login1",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object getlogin(int ty,String ph,String pa){
		Login list=dao.login1(ty, ph,pa);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	//��ѯ������Ϣ
	@RequestMapping(value="/selgeren",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
	 @ResponseBody
	 public Object getListsf(int id){
		Userstu list=dao.stu(id);
		String json = JSONArray.toJSONString(list);
		return json;
	 }
	//�ж���û������ѧ��
		@RequestMapping(value="/selid",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object getList(int id,int type){
			int list=dao.selid(id,type);
			String json = JSONArray.toJSONString(list);
			return json;
		 }
		//�ж�����ѧ����û��ע���
		@RequestMapping(value="/stuid",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object getLis(int id,int type){
			int list=dao.stuid(id,type);
			String json = JSONArray.toJSONString(list);
			return json;
		 }
		//ע��ɹ���ֱ����תѧ��ҳ��
		@RequestMapping(value="/addlo",method=RequestMethod.GET)
		public ModelAndView getzhuce(Login login){
			ModelAndView and=new ModelAndView();
			dao.addlo(login);
			and.setViewName("login");
			return and;
		}
		//�޸�����
		@RequestMapping(value="/updpass",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object updpass(String user,String pass,int id){
			int row=dao.updpasss(user, pass, id);
			String json = JSONArray.toJSONString(row);
			return json;
		 }
		
}
