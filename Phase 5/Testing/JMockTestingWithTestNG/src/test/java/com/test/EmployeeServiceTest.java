package com.test;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dao.EmployeeDao;
import com.service.EmployeeService;


public class EmployeeServiceTest {
  
 @Mock
 EmployeeDao employeeDao;
 
 @InjectMocks
 EmployeeService employeeService;
 
	
  @Test
  public void mockTestMethod() {
	  // This code provide mock or fake output 
	  //Mockito.when(employeeDao.getEmployeDetails()).thenReturn("This code mock testing");
	  
	  String result = employeeService.getEmployeeInService();
	  Assert.assertEquals(result, "This code mock testing");
  }
}
