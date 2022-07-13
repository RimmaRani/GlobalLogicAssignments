package junit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.globallogic.MathUtils;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class OperationjunitTest {

	//Wrapper object
	MathUtils mathUtils;
	

	@BeforeAll
	static void setup(){
		fail("BeforeAll executed");
	}

	@BeforeEach
	static void setupThis(){
		System.out.println("BeforeEach executed");
	}
	
	@Test
	public void test() {
		MathUtils mathUtils=new MathUtils();
		//tests works in two ways in order to get the output
		//1.actual 2, expected
		int expected=20;
		int actual=mathUtils.add(10, 10);
		assertEquals(expected,actual);
		System.out.println("Test one executed");
	}
	@Test
	public void test2() {
		MathUtils mathUtils=new MathUtils();
		//tests works in two ways in order to get the output
		//1.actual 2, expected
		int expected=0;
		int actual=mathUtils.sub(10, 10);
		assertEquals(expected,actual);
		System.out.println("Test two executed");
	}
	@Test
	public void computerCircleArea() {
		MathUtils mathUtils=new MathUtils();
		assertEquals(10.0,mathUtils.computerCircleArea(10.0),"Should return area");
	}
	
	@Test
	public void divide() {																//method for performing dividation
		final MathUtils mathUtils=new MathUtils();										//creating object
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(10, 0));          // () -> = lambda expression  assertThrows for throwing exception
	}
	
	@AfterEach																			//After Each annotation
	void tearThis(){																	//Method for afterEach
		System.out.println("AfterEach executed");										//Print statement
	}

	@AfterAll																			//AfterAll Annotation
	void tear(){																		//Method for AfterAll
		System.out.println("AfterAll executed");										//Print statement
	}
	
	

}
