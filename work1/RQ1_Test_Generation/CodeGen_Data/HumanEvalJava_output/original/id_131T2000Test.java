// DigitsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {

	@Test
	void canAddDigits() {
		assertEquals(digits(1), 1);
	}
	
	@Test
	void canAddNumerals() {
		assertEquals(digits(1), 1);
		assertEquals(digits(0), 0);
	}
}
