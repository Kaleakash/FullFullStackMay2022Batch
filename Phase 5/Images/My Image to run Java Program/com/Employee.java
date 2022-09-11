package com;
public class Employee {
    private int id;
    private String name;
    private float salary;
    public Employee(int id, String name, float salary){
        this.id = id;
        this.name  = name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("id is "+this.id);
        System.out.println("name is "+this.name);
        System.out.println("salary is "+this.salary);
    }
}
