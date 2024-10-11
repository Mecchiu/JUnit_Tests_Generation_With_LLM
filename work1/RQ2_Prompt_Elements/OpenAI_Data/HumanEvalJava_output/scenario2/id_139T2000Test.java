// SpecialFactorialTest.java
package scenario2;


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
				assertEquals(2, SpecialFactorial.specialFactorial(2));
				assertEquals(12, SpecialFactorial.specialFactorial(3));
				assertEquals(288, SpecialFactorial.specialFactorial(4));
				assertEquals(34560, SpecialFactorial.specialFactorial(5));
				assertEquals(24883200, SpecialFactorial.specialFactorial(6));
				assertEquals(1254113280000L, SpecialFactorial.specialFactorial(7));
				assertEquals(523069747200000L, SpecialFactorial.specialFactorial(8));
				assertEquals(188305108992000000L, SpecialFactorial.specialFactorial(9));
				assertEquals(6082818640344576000L, SpecialFactorial.specialFactorial(10));
			}
}
