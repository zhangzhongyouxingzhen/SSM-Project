package com.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class FilterUtil implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("�����----");
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("������");
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		System.out.println("����ǰ");
		HttpSession session = arg0.getSession();
		if(session.getAttribute("qq")=="��¼ʧ��"){
			return false;
		}else if(session.getAttribute("qq")!=null){
			return true;
		}
		arg1.sendRedirect("/ManageS/login.jsp");
		return false;
	}

}
