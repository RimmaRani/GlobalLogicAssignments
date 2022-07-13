package org.JunitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTest2 {

	@Test
	public void test() {
		MathUtils mathUtils=new MathUtils();
		assertEquals(314.1343345,mathUtils.computerCircleArea(10),314.13);
		System.out.println("should return right circle area");
	}

}
