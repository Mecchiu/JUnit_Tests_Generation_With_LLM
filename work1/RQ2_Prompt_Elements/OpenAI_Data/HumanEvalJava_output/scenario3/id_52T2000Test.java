// BelowThresholdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
	// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Integer> l = new ArrayList<>();
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 2: Test with list of one element
			@Test
			void testOneElementList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 3: Test with list of two elements
			@Test
			void testTwoElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 4: Test with list of three elements
			@Test
			void testThreeElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(4);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 5: Test with list of four elements
			@Test
			void testFourElementsList() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(4);
				l.add(10);
				int t = 100;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 6: Test with list of four elements and threshold less than all elements
			@Test
			void testThresholdLessThanAllElements() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(4);
				l.add(10);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 7: Test with list of four elements and threshold greater than all elements
			@Test
			void testThresholdGreaterThanAllElements() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(4);
				l.add(10);
				int t = 21;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 8: Test with list of four elements and threshold greater than all elements
			@Test
			void testThresholdGreaterThanAllElements2() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(2);
				l.add(4);
				l.add(10);
				int t = 22;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 9: Test with list of four elements and threshold greater than all elements
			@Test
			void testThresholdGreaterThanAllElements3() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(8);
				l.add(4);
				l.add(10);
				int t = 11;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 10: Test with list of four elements and threshold greater than all elements
			@Test
			void testThresholdGreaterThanAllElements4() {
				List<Integer> l = new ArrayList<>();
				l.add(1);
				l.add(8);
				l.add(4);
				l.add(10);
				int t = 10;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
}