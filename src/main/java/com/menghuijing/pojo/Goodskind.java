package com.menghuijing.pojo;

public class Goodskind {

	private Integer id;
	private String kname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public Goodskind(Integer id, String kname) {
		super();
		this.id = id;
		this.kname = kname;
	}
	public Goodskind() {
		super();
	}
}
