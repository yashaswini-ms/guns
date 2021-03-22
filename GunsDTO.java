package com.wolken.wolkenapp.DTO;

public class GunsDTO {
	private int gunid;
	private String name;
	private String serialno;
	private double price;
	private String brandname;
	private String type;
	private int noofbullets;
	private String  madein;
	
	public int getGunid() {
		return gunid;
	}
	public void setGunid(int gunid) {
		this.gunid = gunid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoofbullets() {
		return noofbullets;
	}
	public void setNoofbullets(int noofbullets) {
		this.noofbullets = noofbullets;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	@Override
	public String toString() {
		return "GunsDTO [gunid=" + gunid + ", name=" + name + ", serialno=" + serialno + ", price=" + price
				+ ", brandname=" + brandname + ", type=" + type + ", noofbullets=" + noofbullets + ", madein=" + madein
				+ "]";
	}
	

}
