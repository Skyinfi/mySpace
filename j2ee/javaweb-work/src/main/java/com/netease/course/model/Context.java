package com.netease.course.model;

public class Context {
	private int id;
	private float price;
	private String title;
	private byte[] icon;
	private String abs;
	private byte[] text;
	private float prePrice;
	public Context(int id, float price, String title, byte[] icon, String abs, byte[] text) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
		this.icon = icon;
		this.abs = abs;
		this.text = text;
	}
	
	public float getPrePrice() {
		return prePrice;
	}

	public void setPrePrice(float prePrice) {
		this.prePrice = prePrice;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public byte[] getIcon() {
		return icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public byte[] getText() {
		return text;
	}
	public void setText(byte[] text) {
		this.text = text;
	}
	
	
}
