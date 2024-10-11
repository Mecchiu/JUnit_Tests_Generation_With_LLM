// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
			// Test case 1: Test with an empty list
			@Test
			void testEmptyList() {
				List<Integer> l = new ArrayList<>();
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 2: Test with a list of one element
			@Test
			void testOneElementList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 3: Test with a list of two elements
			@Test
			void testTwoElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 4: Test with a list of three elements
			@Test
			void testThreeElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 5: Test with a list of four elements
			@Test
			void testFourElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 6: Test with a list of five elements
			@Test
			void testFiveElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 7: Test with a list of six elements
			@Test
			void testSixElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 8: Test with a list of seven elements
			@Test
			void testSevenElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				l.add(7);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 9: Test with a list of eight elements
			@Test
			void testEightElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				l.add(7);
				l.add(8);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}

			// Test case 10: Test with a list of nine elements
			@Test
			void testNineElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				l.add(7);
				l.add(8);
				l.add(9);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
}