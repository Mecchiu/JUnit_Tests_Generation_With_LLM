// SimplifyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains one unit test case for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {
SimplifyTest() {
    }

	@Test
	public void testSimplifyExceponets() {
		assertTrue(Simplify.simplify("9", "") == false);
		assertTrue(Simplify.simplify(1, "") == false);
		assertTrue(Simplify.simplify("2", "7") == true);
		assertTrue(Simplify.simplify("", "7") == false);
		assertTrue(Simplify.simplify("9", "" ) == false);
		assertTrue(Simplify.simplify(12345, "") == false);
		
		failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
	}
}
