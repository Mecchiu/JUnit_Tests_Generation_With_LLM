// AnyIntTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the first number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntFirst() {
				Boolean result = AnyInt.anyInt(5, 2, 7);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the second number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntSecond() {
				Boolean result = AnyInt.anyInt(3, 2, 2);
				assertFalse(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the third number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntThird() {
				Boolean result = AnyInt.anyInt(3, -2, 1);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the numbers are not integers.
			*/
			@Test
			void testAnyIntNotInt() {
				Boolean result = AnyInt.anyInt(3.6, -2.2, 2);
				assertFalse(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the first number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntFirst2() {
				Boolean result = AnyInt.anyInt(2, 3, 1);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the second number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntSecond2() {
				Boolean result = AnyInt.anyInt(2.5, 2, 3);
				assertFalse(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the third number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntThird2() {
				Boolean result = AnyInt.anyInt(1.5, 5, 3.5);
				assertFalse(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the numbers are not integers.
			*/
			@Test
			void testAnyIntNotInt2() {
				Boolean result = AnyInt.anyInt(2, 6, 2);
				assertFalse(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the first number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntFirst3() {
				Boolean result = AnyInt.anyInt(4, 2, 2);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the second number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntSecond3() {
				Boolean result = AnyInt.anyInt(2.2, 2.2, 2.2);
				assertFalse(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the third number is equal to the sum of the other two.
			*/
			@Test
			void testAnyIntThird3() {
				Boolean result = AnyInt.anyInt(-4, 6, 2);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the numbers are not integers.
			*/
			@Test
			void testAnyIntNotInt3() {
				Boolean result = AnyInt.anyInt(2, 1, 1);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the numbers are not integers.
			*/
			@Test
			void testAnyIntNotInt4() {
				Boolean result = AnyInt.anyInt(3, 4, 7);
				assertTrue(result);
			}

			/**
			* Test case for {@link AnyInt#anyInt(Number, Number, Number)}.
			* It tests the case where the numbers are not integers.
			*/
			@Test
			void testAnyIntNotInt5() {
				Boolean result = AnyInt.anyInt(3.0, 4, 7);
				assertFalse(result);
			}
}