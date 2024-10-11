// PrimeFibTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains one unit test case for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
private final int p1 = 12;
		private final int p2 = 12;
		private final int p3 = 13;
		private final int p4 = 3;
		private final int p5 = 1;
		private final int p6 = 2;

		private final int p12 = 5;
		private final int p13 = 5;
		private final int p4p3 = 2;

		@Test public void primeFib() {
			assertTrue(primeFib(p1) == 1);
			assertTrue(primeFib(p2) == 2);
			assertTrue(primeFib(p3) == 2);
		}

		@Test public void primeFibNegative1() {
			assertTrue(primeFib(-p1) == 0);
		}

		@Test public void primeFibPositive1() {
			assertTrue(primeFib(p1) == p1);
		}

		@Test public void primeFibNegative2() {
			assertTrue(primeFib(-p2) == 0);
		}

		@Test public void primeFibPositive2() {
			assertTrue(primeFib(p2) == p2);
		}

		@Test public void primeFibPositive3() {
			assertTrue(primeFib(p3) == p4p3);
		}

		@Test public void primeFibNegative3() {
			assertTrue(primeFib(-p3) == 0);
		}

		@Test public void primeFibPositive4() {
			assertTrue(primeFib(p4) == 0);
		}

		@Test public void primeFibNegative4() {
			assertTrue(primeFib(-p4) == 0);
		}

		@Test public void primeFibPositive5() {
			assertTrue(primeFib(p5) == p5);
		}

		@Test public void primeFibNegative5() {
			assertTrue(primeFib(-p5) == 0);
		}

		@Test public void primeFibPositive3p1() {
			assertEquals(p1 + primeFib(p3), p12);
		}

		@Test public void primeFibNegative3p1() {
			assertEquals(p1 + primeFib(-p3), 0);
		}

		@Test public void primeFibPositive3p1p1() {
			assertEquals(p1 + primeFib(p3 + p1), p12);
		}

		@Test public void testZero() {
			assertEquals(0, primeFib(0));
		}

		@Test public void testNegative1() {
			assertEquals(-1, primeFib(-1));
		}

		@Test public void testPositive1() {
			assertEquals(p1, primeFib(p1));
		}

		@Test public void testNegative2() {
			final int expected = 2 * p4 + p5;
			int result1 = primeFib(-expected);
			int result2 = primeFib(expected);
			assertEquals(expected, result1);
			assertEquals(expected, result2);
		}

		@Test public void testPositive2() {
			final int expected = p3 + 1;
			int result1 = primeFib(expected);
			int result2 = primeFib(expected);
			assertEquals(expected, result1);
			assertEquals(expected, result2);
		}

		@Test public void testNegative3() {
			final int expected = p4p3 + 1;
			int result1 = primeFib(expected);
			int result2 = primeFib(expected);
			assertEquals(expected, result1);
			assertEquals(expected, result2);
		}

		@Test public void testPositive3() {
			final int expected = 1;
			int result1 = primeFib(p4p3);
			int result2 = primeFib(p4p3);
			assertEquals(expected, result1);
			assertEquals(expected, result2);
		}

}