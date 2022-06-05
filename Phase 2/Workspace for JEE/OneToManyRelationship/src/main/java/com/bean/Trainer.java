package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity					// by default table name consider as Trainer 
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
//private Students student;
//@OneToMany(mappedBy = "tsid")		if table already created in database base side this approach 
									// is good to link to fk 
@OneToMany(cascade = CascadeType.ALL)			// through Trainer object we can do all operation on student object like save, delete, update and retrieve 
@JoinColumn(name = "tsid",referencedColumnName = "tid")	// tid is pk in trainer and tsid if fk in student 
private List<Students> listOfStd;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Students> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Students> listOfStd) {
	this.listOfStd = listOfStd;
}
public Trainer(int tid, String tname, String tech, List<Students> listOfStd) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tech = tech;
	this.listOfStd = listOfStd;
}
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", tech=" + tech + ", listOfStd=" + listOfStd + "]";
}

}
