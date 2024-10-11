// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		private final static String TEST_ARRAY[] = new String[] { 
			"1", 
			"2", 
			"3", 
			"4", 
			"5" };
		
		@Test
		public void test() {
			String[] result = (_FailResponse.getTypeDesc()).toArray(TEST_ARRAY);
			assertEquals(1, result.length);
			assertEquals("Failed", result[0]);
		}
	}