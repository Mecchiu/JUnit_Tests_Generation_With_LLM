// AnyIntTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains ten unit test cases for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
	/**
			* Test case 1: Test the case where the sum of two numbers is equal to the third number.
			* The test case expects the method to return true.
			*/
			@Test
			void testAnyInt1() {
						assertTrue(AnyInt.anyInt(5, 2, 7));
			}

			/**
			* Test case 2: Test the case where the sum of two numbers is not equal to the third number.
			* The test case expects the method to return false.
			*/
			@Test
			void testAnyInt2() {
						assertFalse(AnyInt.anyInt(3, 2, 2));
			}

			/**
			* Test case 3: Test the case where the sum of two numbers is equal to the third number and all numbers are negative.
			* The test case expects the method to return true.
			*/
			@Test
			void testAnyInt3() {
						assertTrue(AnyInt.anyInt(-3, -2, -5));
			}

			/**
			* Test case 4: Test the case where the sum of two numbers is not equal to the third number and all numbers are negative.
			* The test case expects the method to return false.
			*/
			@Test
			void testAnyInt4() {
						assertFalse(AnyInt.anyInt(-3, -2, -6));
			}

			/**
			* Test case 5: Test the case where the sum of two numbers is equal to the third number and all numbers are positive.
			* The test case expects the method to return true.
			*/
			@Test
			void testAnyInt5() {
						assertTrue(AnyInt.anyInt(3, 2, 5));
			}

			/**
			* Test case 6: Test the case where the sum of two numbers is not equal to the third number and all numbers are positive.
			* The test case expects the method to return false.
			*/
			@Test
			void testAnyInt6() {
						assertFalse(AnyInt.anyInt(3, 2, 6));
			}

			/**
			* Test case 7: Test the case where the sum of two numbers is equal to the third number and one of the numbers is negative.
			* The test case expects the method to return true.
			*/
			@Test
			void testAnyInt7() {
						assertTrue(AnyInt.anyInt(-3, 2, -1));
			}

			/**
			* Test case 8: Test the case where the sum of two numbers is not equal to the third number and one of the numbers is negative.
			* The test case expects the method to return false.
			*/
			@Test
			void testAnyInt8() {
						assertFalse(AnyInt.anyInt(-3, 2, -2));
			}

			/**
			* Test case 9: Test the case where the sum of two numbers is equal to the third number and one of the numbers is positive.
			* The test case expects the method to return true.
			*/
			@Test
			void testAnyInt9() {
						assertTrue(AnyInt.anyInt(3, -2, 1));
			}

			/**
			* Test case 10: Test the case where the sum of two numbers is not equal to the third number and one of the numbers is positive.
			* The test case expects the method to return false.
			*/
			@Test
			void testAnyInt10() {
						assertFalse(AnyInt.anyInt(3, -2, 2));
			}
}
