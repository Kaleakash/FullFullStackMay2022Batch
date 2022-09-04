package com.test;


import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.testng.MockitoTestNGListener;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.service.EmployeeService;


@Listeners(MockitoTestNGListener.class)
public class EmployeeServiceTest {
  
 @Mock
 EmployeeDao employeeDao;				// doing mock for DAO method 
 
 @InjectMocks
 EmployeeService employeeService;		// Inject Service layer 
 
	
  @Test
  @Ignore
  public void mockTestMethod() {
	  // This code provide mock or fake output 
	  Mockito.when(employeeDao.getEmployeDetails()).thenReturn("This code mock testing");
	  
	 
	  String result = employeeService.getEmployeeInService();
	  Assert.assertEquals(result, "This code mock testing");
  }
  
  @Test
  @Ignore
  public void readMethodTest() {
	  EmployeeService ees = new EmployeeService();
	  
	  String result = ees.getEmployeeInService();
	  Assert.assertEquals(result, "This is Employee Details code from DB");
  }
  
  @Test
  public void testFindEmployeeDetails() {
	
	  // Fake implementation - Record not present 
	  Mockito.when(employeeDao.findEmployee(1)).thenReturn(null);
	  Employee e =  employeeService.getEmployeeDetails(1);
	  Assert.assertNull(e);
	  
	  // Fake implementation - Record present 
	  Employee empFake =new Employee(100, "Raj", 12000);
	  //Mockito.when(employeeDao.findEmployee(100)).thenReturn(empFake);
	  
	  Mockito.when(employeeDao.findEmployee(101)).thenCallRealMethod();			// calling DAO method code 
	  Employee e1 =  employeeService.getEmployeeDetails(101);
	  Assert.assertNotNull(e1);
	  Assert.assertEquals(e1.getName(), "Ajay");
	  Assert.assertEquals(e1.getSalary(), 45000);
  }
  
  @Test
  @Ignore
  public void testAllEmployeeDetails() {
	  // Fake implementation - zero records 
	  List<Employee> listOfEmp1 = new ArrayList<Employee>();
	  Mockito.when(employeeDao.getAllEmployeeDetails()).thenReturn(listOfEmp1);
	  
	  List<Employee> listOfEmp11 = employeeService.getAllEmployeeDetails();
	  Assert.assertEquals(listOfEmp11.size(), 0);
	  
	  
	  // Fake implementation - more than one records return 
	  List<Employee> listOfEmp2 = new ArrayList<Employee>();
	  listOfEmp2.add(new Employee(1, "Raj", 12000));
	  listOfEmp2.add(new Employee(2, "Ravi", 17000));
	  listOfEmp2.add(new Employee(3, "Ramesh", 19000));
	  Mockito.when(employeeDao.getAllEmployeeDetails()).thenReturn(listOfEmp2);
	  List<Employee> listOfEmp22 = employeeService.getAllEmployeeDetails();
	  Assert.assertEquals(listOfEmp22.size(), 3);
	  Employee e = listOfEmp22.get(1);
	  Assert.assertEquals(e.getId(), 2);
	  Assert.assertEquals(e.getName(), "Ravi");
	  Assert.assertEquals(e.getSalary(), 17000);
	  
  }
  
  @Test
  @Ignore
  public void updateEmployeeSalary() {
	  
	  // Fake implementation record updated succesfully 
	  Employee emp1 = new Employee(100,"Ravi",12000);
	  Mockito.when(employeeDao.updateEmployee(emp1)).thenReturn(0);
	  
	  String result1 = employeeService.updateEmployee(emp1);
	  Assert.assertEquals(result1, "Didn't update");
	  
	  // Fake implementation record  update successfully 
	  Employee emp2 = new Employee(101,"Lokesh",18000);
	  Mockito.when(employeeDao.updateEmployee(emp2)).thenReturn(1);

	  String result2 = employeeService.updateEmployee(emp2);
	  Assert.assertEquals(result2, "Successfully update");
  }
  
}
