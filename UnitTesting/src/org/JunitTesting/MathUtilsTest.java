package org.JunitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsTest {

	@Test
	public void test() {
		MathUtils mathUtils=new MathUtils();
		int expected=20;
		int actual=mathUtils.add(10, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		MathUtils mathUtils=new MathUtils();
		int expected=2;
		int actual=mathUtils.divide(40, 20);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		MathUtils mathUtils=new MathUtils();
		int expected=20;
		int actual=mathUtils.sub(40, 20);
		assertEquals(expected,actual);
	}

}
