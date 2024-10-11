// SolveTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains one unit test case for the {@link Solve#solve(String)} method.
*/
class SolveTest {
/**
		* Test cases.
		* One string, contains only letters, has letters in lower case.
		* The function should return the string.
		*/
	@Test
	void test() {
		String testString = "zabaz";
		String expectedString = "ABC";
		assertEquals(expectedString, Solve.<String>.solve(testString));
	}
}
