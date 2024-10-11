// IsBoredTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored("I"));
		assertEquals(0, IsBored.isBored("I."));
		assertEquals(0, IsBored.isBored("I.I"));
		assertEquals(0, IsBored.isBored("I.I."));
		assertEquals(1, IsBored.isBored("I.I.I"));
		assertEquals(1, IsBored.isBored("I.I.I."));
		assertEquals(1, IsBored.isBored("I.I.I.I"));
		assertEquals(1, IsBored.isBored("I.I.I.I."));
		assertEquals(2, IsBored.isBored("I.I.I.I.I"));
	}
}