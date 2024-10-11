// SpecialFactorialTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {

	@Test
	void testSpecialFactorial() {
		assertEquals(1, SpecialFactorial.specialFactorial(1));
		assertEquals(288, SpecialFactorial.specialFactorial(4));
		assertEquals(34560, SpecialFactorial.specialFactorial(5));
		assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
		assertEquals(3628800, SpecialFactorial.specialFactorial(10));
		assertEquals(39916800, SpecialFactorial.specialFactorial(11));
		assertEquals(479001600, SpecialFactorial.specialFactorial(12));
		assertEquals(6227020800L, SpecialFactorial.specialFactorial(13));
		assertEquals(87178291200L, SpecialFactorial.specialFactorial(14));
		assertEquals(1307674368000L, SpecialFactorial.specialFactorial(15));
	}
}