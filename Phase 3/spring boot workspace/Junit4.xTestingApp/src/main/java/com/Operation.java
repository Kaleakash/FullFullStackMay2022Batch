package com;

public class Operation {

				public int add(int a, int b) {
					int sum = a+b;
					return sum;
				}
				
			public Employee getEmployeeDetails() {
				
				Employee emp = new Employee();
				emp.setId(100);
				emp.setName("Ramesh");
				emp.setSalary(14000);
				return emp;
				//return null;
			}
}
