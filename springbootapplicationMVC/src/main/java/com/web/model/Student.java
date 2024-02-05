package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
   @Id
   private int stdId;
   private String name;
   private String course;
   private int hibernate;
   private int spring;
   private int springboot;
   private int total;
   private double percentage;
   private String grade;
   private String result;
public Student() {
	super();
}
public Student(int stdId, String name, String course, int hibernate, int spring, int springboot, int total,
		double percentage, String grade, String result) {
	super();
	this.stdId = stdId;
	this.name = name;
	this.course = course;
	this.hibernate = hibernate;
	this.spring = spring;
	this.springboot = springboot;
	this.total = total;
	this.percentage = percentage;
	this.grade = grade;
	this.result = result;
}
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getHibernate() {
	return hibernate;
}
public void setHibernate(int hibernate) {
	this.hibernate = hibernate;
}
public int getSpring() {
	return spring;
}
public void setSpring(int spring) {
	this.spring = spring;
}
public int getSpringboot() {
	return springboot;
}
public void setSpringboot(int springboot) {
	this.springboot = springboot;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
@Override
public String toString() {
	return "Student [stdId=" + stdId + ", name=" + name + ", course=" + course + ", hibernate=" + hibernate
			+ ", spring=" + spring + ", springboot=" + springboot + ", total=" + total + ", percentage=" + percentage
			+ ", grade=" + grade + ", result=" + result + "]";
}
}