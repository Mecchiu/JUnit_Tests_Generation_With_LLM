// ClosestIntegerTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
			@Test
			void testClosestInteger1() {
				assertEquals(15, ClosestInteger.closestInteger("14.5"));
			}

			@Test
			void testClosestInteger2() {
				assertEquals(-15, ClosestInteger.closestInteger("-14.5"));
			}

			@Test
			void testClosestInteger3() {
				assertEquals(0, ClosestInteger.closestInteger("0.5"));
			}

			@Test
			void testClosestInteger4() {
				assertEquals(0, ClosestInteger.closestInteger("-0.5"));
			}

			@Test
			void testClosestInteger5() {
				assertEquals(1, ClosestInteger.closestInteger("0.6"));
			}

			@Test
			void testClosestInteger6() {
				assertEquals(-1, ClosestInteger.closestInteger("-0.6"));
			}

			@Test
			void testClosestInteger7() {
				assertEquals(1, ClosestInteger.closestInteger("0.4"));
			}

			@Test
			void testClosestInteger8() {
				assertEquals(-1, ClosestInteger.closestInteger("-0.4"));
			}

			@Test
			void testClosestInteger9() {
				assertEquals(0, ClosestInteger.closestInteger("0.2"));
			}

			@Test
			void testClosestInteger10() {
				assertEquals(0, ClosestInteger.closestInteger("-0.2"));
			}
}