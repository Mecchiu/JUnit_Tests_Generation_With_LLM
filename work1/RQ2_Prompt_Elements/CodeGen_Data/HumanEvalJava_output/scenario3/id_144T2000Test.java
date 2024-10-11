// SimplifyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains one unit test case for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

	/**
	 * Test of simplify method, of class SimplifyTest.
	 * The actual implementations and expected result.
	 */
	@Test
	public void testSimplifyTest() {
		System.out.println("simplify");
		String num = "";
		String denoms = "";
		String result = "";
		boolean ans = Simplify.simplify(num, denoms);
		assertEquals("Returned incorrect value for simplification.", ans, true);
		
		num = "";
		ans = (Simplify.simplify(num, denoms) == false);
		assertEquals("Returned incorrect value for simplified value.", ans, false);
		
		num = "";
		denoms = "";
		ans = Simplify.simplify(num, denoms);
		assertEquals("Returned incorrect value for simplified value.", ans, true);
		
		num = "";
		ans = Simplify.simplify("", "");
		assertEquals("Returned incorrect value for simplified value.", ans, false);
	}
}
