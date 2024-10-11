// CircularShiftTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
	/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when shift is greater than the number of digits.
			*/
			@Test
			void testCircularShift1() {
						assertEquals("4321", CircularShift.circularShift(1234, 5));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when shift is equal to the number of digits.
			*/
			@Test
			void testCircularShift2() {
						assertEquals("1234", CircularShift.circularShift(1234, 4));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when shift is less than the number of digits.
			*/
			@Test
			void testCircularShift3() {
						assertEquals("2341", CircularShift.circularShift(1234, 1));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when shift is zero.
			*/
			@Test
			void testCircularShift4() {
						assertEquals("1234", CircularShift.circularShift(1234, 0));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when the number is negative.
			*/
			@Test
			void testCircularShift5() {
						assertEquals("4321", CircularShift.circularShift(-1234, 5));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when the number is zero.
			*/
			@Test
			void testCircularShift6() {
						assertEquals("0", CircularShift.circularShift(0, 5));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when the number is a single digit.
			*/
			@Test
			void testCircularShift7() {
						assertEquals("1", CircularShift.circularShift(1, 5));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when the number is a single digit and shift is zero.
			*/
			@Test
			void testCircularShift8() {
						assertEquals("1", CircularShift.circularShift(1, 0));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when the number is a single digit and shift is greater than the number of digits.
			*/
			@Test
			void testCircularShift9() {
						assertEquals("1", CircularShift.circularShift(1, 5));
			}

			/**
			* Test case for {@link CircularShift#circularShift(int, int)}.
			* Test the case when the number is a single digit and shift is equal to the number of digits.
			*/
			@Test
			void testCircularShift10() {
						assertEquals("1", CircularShift.circularShift(1, 1));
			}
}
