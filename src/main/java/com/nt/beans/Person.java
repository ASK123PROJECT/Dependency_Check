package com.nt.beans;

public class Person {
	private String name;
	private String desg;
	private MobileDeviceInfo mobile;
	
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setMobile(MobileDeviceInfo mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", desg=" + desg + ", mobile=" + mobile + ", id=" + id + "]";
	}
	
	
	
	
}
