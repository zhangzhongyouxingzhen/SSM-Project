package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.pojo.ExamData;

public interface ExamDataMapper {
	public List<ExamData> sele(@Param("name")String nn,@Param("index")int q);
	public int count(@Param("name")String nn);
}
