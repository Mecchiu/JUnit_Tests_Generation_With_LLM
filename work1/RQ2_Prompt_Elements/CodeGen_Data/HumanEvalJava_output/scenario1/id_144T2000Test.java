// SimplifyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains one unit test case for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {
/**
		* Method tests the method {@link Simplify#simplify(String, String)}.
		*/
		@Test
		public void testSolution() {
			boolean resultBoolean = false;
			boolean resultInteger = true;
			String a = "1/2";
			String n = "2/4";
			// SimplifyTest.java
			resultInteger = Simplify.simplify(a, n);
			//assertTrue(resultInteger);
			if (resultInteger) {
			  resultBoolean = true;
			}
			//assertTrue(resultBoolean);
		}
}
