package com;

public class Demo {
    public static void main(String argsp[]){
        System.out.println("Welcome to Simple Java Program running through Docker");
        Employee emp1 = new Employee(100, "Ravi", 12000);
        Employee emp2 = new Employee(100, "Ravi", 12000);
        emp1.display();
        emp2.display();
    }
}