// SimplifyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains one unit test case for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

	@Test
	public void testSimplify() {
		assertTrue(Simplify.simplify("1/5", "5/1"));
		assertFalse(Simplify.simplify("1/5", "8/1"));
	}

}
