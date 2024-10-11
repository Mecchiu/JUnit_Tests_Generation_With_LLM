// CountUpToTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
			// Test case 1: n = 0
			@Test
			void testCountUpTo1() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = CountUpTo.countUpTo(0);
				assertEquals(expected, actual);
			}
			
			// Test case 2: n = 1
			@Test
			void testCountUpTo2() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = CountUpTo.countUpTo(1);
				assertEquals(expected, actual);
			}
			
			// Test case 3: n = 2
			@Test
			void testCountUpTo3() {
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = CountUpTo.countUpTo(2);
				assertEquals(expected, actual);
			}
			
			// Test case 4: n = 3
			@Test
			void testCountUpTo4() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				List<Object> actual = CountUpTo.countUpTo(3);
				assertEquals(expected, actual);
			}
			
			// Test case 5: n = 4
			@Test
			void testCountUpTo5() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				List<Object> actual = CountUpTo.countUpTo(4);
				assertEquals(expected, actual);
			}
			
			// Test case 6: n = 5
			@Test
			void testCountUpTo6() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				List<Object> actual = CountUpTo.countUpTo(5);
				assertEquals(expected, actual);
			}
			
			// Test case 7: n = 6
			@Test
			void testCountUpTo7() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				List<Object> actual = CountUpTo.countUpTo(6);
				assertEquals(expected, actual);
			}
			
			// Test case 8: n = 7
			@Test
			void testCountUpTo8() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Object> actual = CountUpTo.countUpTo(7);
				assertEquals(expected, actual);
			}
			
			// Test case 9: n = 8
			@Test
			void testCountUpTo9() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Object> actual = CountUpTo.countUpTo(8);
				assertEquals(expected, actual);
			}
			
			// Test case 10: n = 9
			@Test
			void testCountUpTo10() {
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Object> actual = CountUpTo.countUpTo(9);
				assertEquals(expected, actual);
			}
}