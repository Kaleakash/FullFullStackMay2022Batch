package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
@Id
private int sid;
private String sname;
private int age;
private int tsid;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getTsid() {
	return tsid;
}
public void setTsid(int tsid) {
	this.tsid = tsid;
}
public Students() {
	super();
	// TODO Auto-generated constructor stub
}
public Students(int sid, String sname, int age, int tsid) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.age = age;
	this.tsid = tsid;
}
@Override
public String toString() {
	return "Students [sid=" + sid + ", sname=" + sname + ", age=" + age + ", tsid=" + tsid + "]";
}

}
