// DigitsumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains one unit test case for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
// Test String inputs
		@Test
		void testStringInputs() {
			// Given string
			String s = "";
			assertEquals(0, Digitsum.digitSum(s));
			s = "Hello";
			assertEquals(14, Digitsum.digitSum(s));
			s = "Hello World!";
			assertEquals(23, Digitsum.digitSum(s));
			s = "Hello The World!";
			assertEquals(41, Digitsum.digitSum(s));
			s = "AaaaXa";
			assertEquals(132, Digitsum.digitSum(s));
			s = "woArBld";
			assertEquals(127, Digitsum.digitSum(s));
		}
}

