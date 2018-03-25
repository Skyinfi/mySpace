package com.netease.course.model;

public class trx {
	private int id;
	private int contentId;
	private int personId;
	private int price;
	private String time;
	public trx(int id, int contentId, int personId, int price, String time) {
		super();
		this.id = id;
		this.contentId = contentId;
		this.personId = personId;
		this.price = price;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
