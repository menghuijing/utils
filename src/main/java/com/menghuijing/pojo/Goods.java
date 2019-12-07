package com.menghuijing.pojo;

import java.sql.Date;

public class Goods {

	private Integer id;
	private String name;
	private Date datea;
	private Integer bid;
	private Integer kid;
	private float price;
	private Integer status;
	
	private String bname;
	private String kname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDatea() {
		return datea;
	}
	public void setDatea(Date datea) {
		this.datea = datea;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public Goods(Integer id, String name, Date datea, Integer bid, Integer kid, float price, Integer status,
			String bname, String kname) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.bid = bid;
		this.kid = kid;
		this.price = price;
		this.status = status;
		this.bname = bname;
		this.kname = kname;
	}
	public Goods() {
		super();
	}
}
