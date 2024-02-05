package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles {
	@Id
   private int modelNo;
   private String modelName;
   private String company_name;
   private String ram_size;
   private String rom_size;
   private String os_name;
   private String processor_name;
   private String f_cam;
   private String b_cam;
   private double price;
   private String imei_no;
   
public Mobiles() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobiles(int modelNo, String modelName, String company_name, String ram_size, String rom_size, String os_name,
		String processor_name, String f_cam, String b_cam, double price, String imei_no) {
	super();
	this.modelNo = modelNo;
	this.modelName = modelName;
	this.company_name = company_name;
	this.ram_size = ram_size;
	this.rom_size = rom_size;
	this.os_name = os_name;
	this.processor_name = processor_name;
	this.f_cam = f_cam;
	this.b_cam = b_cam;
	this.price = price;
	this.imei_no = imei_no;
}
public int getModelNo() {
	return modelNo;
}
public void setModelNo(int modelNo) {
	this.modelNo = modelNo;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public String getRam_size() {
	return ram_size;
}
public void setRam_size(String ram_size) {
	this.ram_size = ram_size;
}
public String getRom_size() {
	return rom_size;
}
public void setRom_size(String rom_size) {
	this.rom_size = rom_size;
}
public String getOs_name() {
	return os_name;
}
public void setOs_name(String os_name) {
	this.os_name = os_name;
}
public String getProcessor_name() {
	return processor_name;
}
public void setProcessor_name(String processor_name) {
	this.processor_name = processor_name;
}
public String getF_cam() {
	return f_cam;
}
public void setF_cam(String f_cam) {
	this.f_cam = f_cam;
}
public String getB_cam() {
	return b_cam;
}
public void setB_cam(String b_cam) {
	this.b_cam = b_cam;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getImei_no() {
	return imei_no;
}
public void setImei_no(String imei_no) {
	this.imei_no = imei_no;
}
@Override
public String toString() {
	return "Mobiles [modelNo=" + modelNo + ", modelName=" + modelName + ", company_name=" + company_name + ", ram_size="
			+ ram_size + ", rom_size=" + rom_size + ", os_name=" + os_name + ", processor_name=" + processor_name
			+ ", f_cam=" + f_cam + ", b_cam=" + b_cam + ", price=" + price + ", imei_no=" + imei_no + "]";
}
}
   
