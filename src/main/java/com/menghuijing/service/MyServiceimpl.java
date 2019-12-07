package com.menghuijing.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.menghuijing.mapper.MyMapper;
import com.menghuijing.pojo.Brand;
import com.menghuijing.pojo.Goods;
import com.menghuijing.pojo.Goodskind;
@Service
public class MyServiceimpl implements MyService{

	@Resource
	private MyMapper mymapper;
	//全查列表
	public List<Goods> glist(Map<String, Object> map) {
		return mymapper.glist(map);
	}
	//全查品牌的下拉框
	public List<Brand> blist() {
		// TODO Auto-generated method stub
		return mymapper.blist();
	}
	//全查分类的下拉框
	public List<Goodskind> klist() {
		// TODO Auto-generated method stub
		return mymapper.klist();
	}
	//添加
	public void add(Goods g) {
		// TODO Auto-generated method stub
		mymapper.add(g);
	}
	//回显
	public Goods getById(int id) {
		// TODO Auto-generated method stub
		return mymapper.getById(id);
	}
	//修改
	public int update(int id) {
		// TODO Auto-generated method stub
		return mymapper.update(id);
	}
	//批删
	public int delete(String id) {
		// TODO Auto-generated method stub
		return mymapper.delete(id);
	}

	


}
