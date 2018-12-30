package ecnu.edu.sei.st;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JenkinsGradleDemoClassTest {
	
	private JenkinsGradleDemoClass demo;
	
	@Before
	public void init() {
		demo = new JenkinsGradleDemoClass();
	}
	
	@Test
	public void op1_is_null_and_op2_is_null() {
		Integer op1 = null;
		Integer op2 = null;
		int expectedRlt = 0;
		int actualRlt = demo.absSum(op1, op2);
		assertEquals(expectedRlt, actualRlt);
	}
	
	@Test
	public void op1_is_null_and_op2_isnot_null() {
		Integer op1 = null;
		Integer op2 = new Integer("5");
		int expectedRlt = 5;
		int actualRlt = demo.absSum(op1, op2);
		assertEquals(expectedRlt, actualRlt);
	}
	
	@Test
	public void op1_isnot_null_and_op2_is_null() {
		Integer op1 = new Integer("10");
		Integer op2 = null;
		int expectedRlt = 10;
		int actualRlt = demo.absSum(op1, op2);
		assertEquals(expectedRlt, actualRlt);
	}
	
	@Test
	public void op1_isnot_null_and_op2_isnot_null() {
		Integer op1 = new Integer("10");
		Integer op2 = new Integer("5");
		int expectedRlt = 15;
		int actualRlt = demo.absSum(op1, op2);
		assertEquals(expectedRlt, actualRlt);
	}
}
