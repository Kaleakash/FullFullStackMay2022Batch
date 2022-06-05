package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technologies {
@Id
private int tid;
private String tech;
@ManyToMany(cascade = CascadeType.ALL)
private List<Employees> listOfEmp;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Employees> getListOfEmp() {
	return listOfEmp;
}
public void setListOfEmp(List<Employees> listOfEmp) {
	this.listOfEmp = listOfEmp;
}

}
