package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Employee;
import com.Operation;

public class OperationTest {

	@Test									// it is like a main method 
	public void testAdd() {
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);			// assertXXX format method to check actual and expect code. 
	}

	
	@Test
	public void testGetEmployeeDetails() {
		Operation op = new Operation();
		Employee emp = op.getEmployeeDetails();
		//assertNull(emp);
		assertNotNull(emp);
		assertEquals(100, emp.getId());
	}
}
