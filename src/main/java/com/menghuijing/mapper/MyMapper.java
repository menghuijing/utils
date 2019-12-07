package com.menghuijing.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.menghuijing.pojo.Brand;
import com.menghuijing.pojo.Goods;
import com.menghuijing.pojo.Goodskind;

public interface MyMapper {
	//全查列表
	List<Goods> glist(Map<String, Object> map);
	//全查品牌的下拉框
	List<Brand> blist();
	//全查分类的下拉框
	List<Goodskind> klist();
	//添加
	public void add(Goods g);
	//回显
	Goods getById(int id);
	//修改
	int update(int id);
	//批删
	int delete(@Param("id")String id);
}
