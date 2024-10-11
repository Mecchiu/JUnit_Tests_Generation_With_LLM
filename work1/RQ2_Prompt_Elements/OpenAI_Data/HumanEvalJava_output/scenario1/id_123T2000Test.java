// GetOddCollatzTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
	// Test case 1: n = 1
			@Test
			void testGetOddCollatz1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = GetOddCollatz.getOddCollatz(1);
				assertEquals(expected, actual);
			}
			
			// Test case 2: n = 2
			@Test
			void testGetOddCollatz2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = GetOddCollatz.getOddCollatz(2);
				assertEquals(expected, actual);
			}
			
			// Test case 3: n = 3
			@Test
			void testGetOddCollatz3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(3);
				List<Integer> actual = GetOddCollatz.getOddCollatz(3);
				assertEquals(expected, actual);
			}
			
			// Test case 4: n = 4
			@Test
			void testGetOddCollatz4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(3);
				List<Integer> actual = GetOddCollatz.getOddCollatz(4);
				assertEquals(expected, actual);
			}
			
			// Test case 5: n = 5
			@Test
			void testGetOddCollatz5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(5);
				List<Integer> actual = GetOddCollatz.getOddCollatz(5);
				assertEquals(expected, actual);
			}
			
			// Test case 6: n = 6
			@Test
			void testGetOddCollatz6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = GetOddCollatz.getOddCollatz(6);
				assertEquals(expected, actual);
			}
			
			// Test case 7: n = 7
			@Test
			void testGetOddCollatz7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(7);
				List<Integer> actual = GetOddCollatz.getOddCollatz(7);
				assertEquals(expected, actual);
			}
			
			// Test case 8: n = 8
			@Test
			void testGetOddCollatz8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = GetOddCollatz.getOddCollatz(8);
				assertEquals(expected, actual);
			}
			
			// Test case 9: n = 9
			@Test
			void testGetOddCollatz9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(3);
				expected.add(9);
				List<Integer> actual = GetOddCollatz.getOddCollatz(9);
				assertEquals(expected, actual);
			}
			
			// Test case 10: n = 10
			@Test
			void testGetOddCollatz10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(5);
				expected.add(7);
				List<Integer> actual = GetOddCollatz.getOddCollatz(10);
				assertEquals(expected, actual);
			}
}