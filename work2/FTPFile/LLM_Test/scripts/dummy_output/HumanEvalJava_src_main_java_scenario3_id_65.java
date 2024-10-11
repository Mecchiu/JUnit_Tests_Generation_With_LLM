// CircularShiftTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
			@Test
			void testCircularShift1() {
				assertEquals("001", CircularShift.circularShift(100, 2));
			}
			
			@Test
			void testCircularShift2() {
				assertEquals("12", CircularShift.circularShift(12, 2));
			}
			
			@Test
			void testCircularShift3() {
				assertEquals("79", CircularShift.circularShift(97, 8));
			}
			
			@Test
			void testCircularShift4() {
				assertEquals("21", CircularShift.circularShift(12, 1));
			}
			
			@Test
			void testCircularShift5() {
				assertEquals("11", CircularShift.circularShift(11, 101));
			}
			
			@Test
			void testCircularShift6() {
				assertEquals("001", CircularShift.circularShift(100, 3));
			}
			
			@Test
			void testCircularShift7() {
				assertEquals("12", CircularShift.circularShift(12, 3));
			}
			
			@Test
			void testCircularShift8() {
				assertEquals("79", CircularShift.circularShift(97, 9));
			}
			
			@Test
			void testCircularShift9() {
				assertEquals("21", CircularShift.circularShift(12, 2));
			}
			
			@Test
			void testCircularShift10() {
				assertEquals("11", CircularShift.circularShift(11, 102));
			}
}