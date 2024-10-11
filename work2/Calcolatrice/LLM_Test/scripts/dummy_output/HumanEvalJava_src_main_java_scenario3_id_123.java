// GetOddCollatzTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {
			@Test
			void testGetOddCollatz() {
				List<Integer> result = GetOddCollatz.getOddCollatz(5);
				assertEquals(1, result.get(0));
				assertEquals(5, result.get(1));
			}

			@Test
			void testGetOddCollatz2() {
				List<Integer> result = GetOddCollatz.getOddCollatz(14);
				assertEquals(1, result.get(0));
				assertEquals(5, result.get(1));
				assertEquals(7, result.get(2));
				assertEquals(11, result.get(3));
				assertEquals(13, result.get(4));
				assertEquals(17, result.get(5));
			}

			@Test
			void testGetOddCollatz3() {
				List<Integer> result = GetOddCollatz.getOddCollatz(12);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(5, result.get(2));
			}

			@Test
			void testGetOddCollatz4() {
				List<Integer> result = GetOddCollatz.getOddCollatz(1);
				assertEquals(1, result.get(0));
			}

			@Test
			void testGetOddCollatz5() {
				List<Integer> result = GetOddCollatz.getOddCollatz(2);
				assertEquals(1, result.get(0));
			}

			@Test
			void testGetOddCollatz6() {
				List<Integer> result = GetOddCollatz.getOddCollatz(3);
				assertEquals(1, result.get(0));
			}

			@Test
			void testGetOddCollatz7() {
				List<Integer> result = GetOddCollatz.getOddCollatz(4);
				assertEquals(1, result.get(0));
			}

			@Test
			void testGetOddCollatz8() {
				List<Integer> result = GetOddCollatz.getOddCollatz(6);
				assertEquals(1, result.get(0));
			}

			@Test
			void testGetOddCollatz9() {
				List<Integer> result = GetOddCollatz.getOddCollatz(7);
				assertEquals(1, result.get(0));
			}

			@Test
			void testGetOddCollatz10() {
				List<Integer> result = GetOddCollatz.getOddCollatz(8);
				assertEquals(1, result.get(0));
			}
}