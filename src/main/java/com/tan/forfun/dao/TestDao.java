package com.tan.forfun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tan.forfun.model.TreeModel;

@Mapper
public interface TestDao {

	List<TreeModel> getTree();

}
