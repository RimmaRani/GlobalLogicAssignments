package junittestcase;

import static org.junit.Assert.assertEquals;

import org.globallogic.MyEvenOdd;
import org.junit.Test;

public class EvenOddCheckTest {

	@Test
	public void test() {
		 MyEvenOdd meo = new MyEvenOdd();
	        assertEquals("10 is a even number", true, meo.isEvenNumber(10));
	}

}
