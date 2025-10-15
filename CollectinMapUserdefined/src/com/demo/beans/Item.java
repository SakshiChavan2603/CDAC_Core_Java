package com.demo.beans;

import java.util.Objects;

public class Item {
	private int iid;
	private String iname;
	private int qnty;
	private double price;
	public Item() {
		super();
	}
	public Item(int iid, String iname, int qnty, double price) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.qnty = qnty;
		this.price = price;
	}
	public Item(int iid2) {
		iid = iid2;
	}
	
	
	@Override
	public int hashCode() {
		return this.iid;
	}
	@Override
	public boolean equals(Object obj) {
		return this.iid == ((Item)obj).iid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", qnty=" + qnty + ", price=" + price + "]";
	}
}
