package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Course;

public interface CourseMapper {
	List<Course> list(@Param("date")String date);
}
