package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.dao.UserStuMapper;
import com.pojo.Districts;
import com.pojo.Major;
import com.pojo.Teacher;
import com.pojo.Userstu;
import com.util.PageUtil;

@Controller
public class UserStuController {
		@Resource
		UserStuMapper dao;
		//��ҳ��ѯ����
				@RequestMapping(value="/selgra",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
				 @ResponseBody
				 public Object getse(String cn){
					
					List<Userstu> list=dao.selgra(cn);
					String json = JSONArray.toJSONString(list);
					return json;
				 }
		//��ҳ��ѯ����
		/*@RequestMapping("/sele")
		public ModelAndView list(String name,String index){
			name=name==null?"":name;
			index=index==null?"1":index;
			ModelAndView and=new ModelAndView();
			//��ҳ��
			int count=dao.cou("%"+name+"%");
			int cou=count%10==0?count/10:count/10+1;
			List<Userstu> li=dao.sel("%"+name+"%", (new Integer(index)-1)*10);
			//��ǰҳ��
			and.addObject("index", new Integer(index));
			//��תҳ��
			and.setViewName("students");
			//��ҳ��
			and.addObject("cou1", cou);
			//��ҳ����
			and.addObject("list", li);
			//����
			and.addObject("name",name);
			return and;
		}*/
		//��ҳ��ѯ����
		@RequestMapping(value="/sele",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object getList(String index,String name){
			name=name==null?"":name;
			index=index==null?"1":index;
			int coun=dao.cou("%"+name+"%");
			int count=coun%10==0?coun/10:coun/10+1;
			List<Userstu> list=dao.sel("%"+name+"%", (new Integer(index)-1)*10);
			
			PageUtil page=new PageUtil(new Integer(index),list,count);
			String json = JSONArray.toJSONString(page);
			return json;
		 }
				//��ѯʡ��
				@RequestMapping(value="/selpro",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
				 @ResponseBody
				 public Object getListsf(){
					List<Districts> list=dao.selpro();
					String json = JSONArray.toJSONString(list);
					return json;
				 }
				//������
				@RequestMapping(value="/selci",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
				 @ResponseBody
				 public Object getListc(int co){
					List<Districts> list=dao.selci(co);
					String json = JSONArray.toJSONString(list);
					return json;
				 }
				//������
				@RequestMapping(value="/selqu",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
				 @ResponseBody
				 public Object getListcq(int co){
					List<Districts> list=dao.selqu(co);
					for (Districts districts : list) {
						System.out.println(districts.getDeep());
					}
					String json = JSONArray.toJSONString(list);
					return json;
				 }
		//��ѯ��רҵ
		@RequestMapping(value="/selzy",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object getList12(){
			List<Major> list=dao.selzy();
			String json = JSONArray.toJSONString(list);
			return json;
		 }
		//�޸���������
		@RequestMapping(value="/selss",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object getLists(int co){
			Districts dis=dao.selss(co);
			String json = JSONArray.toJSONString(dis);
			return json;
			}
		//ɾ��
		@RequestMapping(value="/del",method=RequestMethod.GET,produces="application/json;charset=utf-8;")
		 @ResponseBody
		 public Object getList1(int id){
			return  JSONArray.toJSONString(dao.del(id));
			
		 }
		//��ȡ���ݰ��޸�ҳ��
		@RequestMapping("/upd")
		public ModelAndView upd(int id){
			ModelAndView and=new ModelAndView();
			Userstu list=dao.hid(id);
			and.addObject("list", list);
			and.setViewName("edit-student");
			return and;
		}
		
		//�޸�
		@RequestMapping(value="/upda",method=RequestMethod.POST)
		public ModelAndView upda(HttpSession session,@RequestParam("f1")MultipartFile file,HttpServletRequest request,Userstu ustr) throws IllegalStateException, IOException{
			
			//file�ͻ����ļ�����
			String path=request.getSession().getServletContext().
					getRealPath("assets"+File.separator+"img"+File.separator+"profiles");
			//��������󴫵ݸ��µ��ļ�����
			
			String newname=UUID.randomUUID().toString();
			File f1=new File(path+"/"+newname+".jpg");
			if(!f1.exists()){
			//�༶Ŀ¼����
			f1.mkdir();
			}
			file.transferTo(f1);
			ustr.setPhoto(newname+".jpg");
			ModelAndView and=new ModelAndView();
			dao.upd(ustr);
			if(session.getAttribute("shen").equals("��ʦ")){
				and.setViewName("teacher-students");
			}else if(session.getAttribute("shen").equals("admin")){
				and.setViewName("students");
			}
			return and;
		}
		//����
		@RequestMapping(value="/add",method=RequestMethod.POST)
		public ModelAndView addqw(HttpSession session,@RequestParam("f1")MultipartFile file,HttpServletRequest request,Userstu ustr) throws IllegalStateException, IOException{
				//file�ͻ����ļ�����
				String path=request.getSession().getServletContext().
						getRealPath("assets"+File.separator+"img"+File.separator+"profiles");
				//��������󴫵ݸ��µ��ļ�����
				
				String newname=UUID.randomUUID().toString();
				File f1=new File(path+"/"+newname+".jpg");
				if(!f1.exists()){
				//�༶Ŀ¼����
				f1.mkdir();
				}
				file.transferTo(f1);
				
					ustr.setPhoto(newname+".jpg");
				
				
			
			ModelAndView and=new ModelAndView();
					dao.add(ustr);
					if(session.getAttribute("shen").equals("��ʦ")){
						and.setViewName("teacher-students");
					}else if(session.getAttribute("shen").equals("admin")){
						and.setViewName("students");
					}
					return and;
				}
		//����
		/*@RequestMapping("/teAdd")
		public ModelAndView inset(Teacher teacher){
			ModelAndView and=new ModelAndView();
			tea.add(teacher);
			and.setViewName("redirect:/sele");
			return and;
		}*/
		//����ɾ��
		/*@RequestMapping(value="/delall",method=RequestMethod.GET,produces="application/json; charset=utf-8")
		@ResponseBody
		public Object show(String d){
			List<Integer> list=new ArrayList<Integer>();
			for (String  i : d.split(",")) {
				if(i!=null&&i!=""){
					list.add(new Integer(i));
				}
			}
			int i=tea.dela(list);
			return JSONArray.toJSONString(i);
		}*/
		@RequestMapping(value="/selphoto")
		 public String getphoto(HttpServletRequest request){
			
			return "students";
		 }
}
