package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Teacher;

public interface TeacherMapper {
	//��ѯ
	
	public List<Teacher> list(@Param("index")int index,@Param("s")String s);
	//��ѯ������
	public int count(@Param("s")String s);
	//����Ų�ѯ
	public Teacher updsel(@Param("id")String id);
	//�޸�
	public int updat(Teacher teacher);
	//ɾ��
	public int dele(@Param("id")String id);
	//����
	public int insert(Teacher teacher);
}
