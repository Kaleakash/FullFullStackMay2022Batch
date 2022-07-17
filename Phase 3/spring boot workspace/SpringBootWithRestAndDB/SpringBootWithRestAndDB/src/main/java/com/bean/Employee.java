package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@Data
public class Employee {
@Id
private int id;
private String name;
private float salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
