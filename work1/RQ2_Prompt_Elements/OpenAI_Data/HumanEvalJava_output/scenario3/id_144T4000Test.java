// SimplifyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

	@Test
	void testSimplify() {
		assertTrue(Simplify.simplify("1/5", "5/1"));
		assertFalse(Simplify.simplify("1/6", "2/1"));
		assertFalse(Simplify.simplify("7/10", "10/2"));
		assertTrue(Simplify.simplify("5/1", "3/1"));
		assertTrue(Simplify.simplify("2/10", "50/10"));
		assertTrue(Simplify.simplify("7/2", "4/2"));
		assertTrue(Simplify.simplify("11/6", "6/1"));
		assertFalse(Simplify.simplify("2/3", "5/2"));
		assertFalse(Simplify.simplify("5/2", "3/5"));
		assertTrue(Simplify.simplify("2/4", "8/4"));
		assertTrue(Simplify.simplify("2/4", "4/2"));
		assertTrue(Simplify.simplify("1/5", "5/1"));
		assertFalse(Simplify.simplify("1/5", "1/5"));
	}
}