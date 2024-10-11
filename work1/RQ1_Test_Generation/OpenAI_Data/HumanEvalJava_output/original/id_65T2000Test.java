// CircularShiftTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
	/**
			* Test case 1: shift > number of digits
			* > circularShift(100, 2)
			* "001"
			*/
			@Test
			void testCircularShift1() {
				String result = CircularShift.circularShift(100, 2);
				assertEquals("001", result);
			}

			/**
			* Test case 2: shift = number of digits
			* > circularShift(12, 2)
			* "12"
			*/
			@Test
			void testCircularShift2() {
				String result = CircularShift.circularShift(12, 2);
				assertEquals("12", result);
			}

			/**
			* Test case 3: shift < number of digits
			* > circularShift(97, 8)
			* "79"
			*/
			@Test
			void testCircularShift3() {
				String result = CircularShift.circularShift(97, 8);
				assertEquals("79", result);
			}

			/**
			* Test case 4: shift = 1
			* > circularShift(12, 1)
			* "21"
			*/
			@Test
			void testCircularShift4() {
				String result = CircularShift.circularShift(12, 1);
				assertEquals("21", result);
			}

			/**
			* Test case 5: shift = 0
			* > circularShift(11, 0)
			* "11"
			*/
			@Test
			void testCircularShift5() {
				String result = CircularShift.circularShift(11, 0);
				assertEquals("11", result);
			}

			/**
			* Test case 6: shift = -1
			* > circularShift(11, -1)
			* "11"
			*/
			@Test
			void testCircularShift6() {
				String result = CircularShift.circularShift(11, -1);
				assertEquals("11", result);
			}

			/**
			* Test case 7: shift = -2
			* > circularShift(12, -2)
			* "12"
			*/
			@Test
			void testCircularShift7() {
				String result = CircularShift.circularShift(12, -2);
				assertEquals("12", result);
			}

			/**
			* Test case 8: shift = -3
			* > circularShift(123, -3)
			* "123"
			*/
			@Test
			void testCircularShift8() {
				String result = CircularShift.circularShift(123, -3);
				assertEquals("123", result);
			}

			/**
			* Test case 9: shift = -4
			* > circularShift(1234, -4)
			* "1234"
			*/
			@Test
			void testCircularShift9() {
				String result = CircularShift.circularShift(1234, -4);
				assertEquals("1234", result);
			}

			/**
			* Test case 10: shift = -5
			* > circularShift(12345, -5)
			* "12345"
			*/
			@Test
			void testCircularShift10() {
				String result = CircularShift.circularShift(12345, -5);
				assertEquals("12345", result);
			}
}
