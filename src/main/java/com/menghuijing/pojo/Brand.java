package com.menghuijing.pojo;

public class Brand {

	private Integer id;
	private String bname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Brand(Integer id, String bname) {
		super();
		this.id = id;
		this.bname = bname;
	}
	public Brand() {
		super();
	}
}
