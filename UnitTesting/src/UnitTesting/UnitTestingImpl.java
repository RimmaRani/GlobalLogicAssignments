package UnitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTestingImpl {
//Method
	@Test
	public void add_twoplustwo_retuenfour() {
		final int expected=-4;  //If we give something else here it will give error
		final int actual=Math.addExact(-2, -2);
		//Test method to perform unit testing
		assertEquals(actual,expected);
	}
	@Test
	public void multiply() {
		
		final int result=10;
		int test=Math.multiplyExact(5, 2);
		assertEquals(result, test);
		//return test;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("SINGLE UNIT IMPLEMENT AND TESTED");
System.out.println("Testing went good");
	}

}
