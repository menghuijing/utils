package com.menghuijing.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.menghuijing.pojo.Brand;
import com.menghuijing.pojo.Goods;
import com.menghuijing.pojo.Goodskind;
import com.menghuijing.service.MyService;

@Controller
public class MyController {

	@Resource
	private MyService myService;
	//全查列表
	@RequestMapping("glist")
	public String glist(Model model,@RequestParam(defaultValue="1")Integer pageNum,String bname){
		PageHelper.startPage(pageNum, 2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bname", bname);
		List<Goods> list = myService.glist(map);
		PageInfo<Goods> pi = new PageInfo<Goods>(list);
		model.addAttribute("pi", pi);
		return "glist";
	}
	//全查品牌的下拉框
	@RequestMapping("blist")
	public String blist(Map<String, Object> map){
		List<Brand> list = myService.blist();
		map.put("blist", list);
		return "add";
	}
	//全查分类的下拉框
	@RequestMapping("klist")
	public String klist(Map<String, Object> map){
		List<Goodskind> list = myService.klist();
		map.put("klist", list);
		return "add";
	}
	//添加
	@RequestMapping("adds")
	@ResponseBody
	public boolean add(Goods g){
		myService.add(g);
		return true;
	}
	//回显
	@RequestMapping("byid")
	public Goods getById(int id){
		Goods byId = myService.getById(id);
		return byId;
	}
	//修改
	@RequestMapping("update")
	public String update(int id){
		myService.update(id);
		return "update";
	}
	//批删
	@RequestMapping("delete")
	public String delete(String id){
		myService.delete(id);
		return "glist";
	}
}
