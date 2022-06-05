package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employees {
@Id
private int empId;
private String empName;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "employees_technologies",joinColumns = {
		@JoinColumn(name="empId")
},inverseJoinColumns = {@JoinColumn(name="tid")})
private List<Technologies> listOfTech;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public List<Technologies> getListOfTech() {
	return listOfTech;
}
public void setListOfTech(List<Technologies> listOfTech) {
	this.listOfTech = listOfTech;
}

}
