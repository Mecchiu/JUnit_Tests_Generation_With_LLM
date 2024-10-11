// BelowThresholdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Integer> l = new ArrayList<>();
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 2: List with one element below threshold
			@Test
			void testOneElementBelowThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(3);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 3: List with one element equal to threshold
			@Test
			void testOneElementEqualToThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 4: List with one element above threshold
			@Test
			void testOneElementAboveThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(7);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 5: List with multiple elements all below threshold
			@Test
			void testMultipleElementsAllBelowThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(3);
				l.add(2);
				l.add(4);
				l.add(1);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(true, result);
			}
			
			// Test case 6: List with multiple elements all equal to threshold
			@Test
			void testMultipleElementsAllEqualToThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(5);
				l.add(5);
				l.add(5);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 7: List with multiple elements all above threshold
			@Test
			void testMultipleElementsAllAboveThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(7);
				l.add(8);
				l.add(6);
				l.add(9);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 8: List with multiple elements some below and some equal to threshold
			@Test
			void testMultipleElementsSomeBelowSomeEqualToThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(5);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 9: List with multiple elements some below and some above threshold
			@Test
			void testMultipleElementsSomeBelowSomeAboveThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(3);
				l.add(7);
				l.add(2);
				l.add(8);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
			
			// Test case 10: List with multiple elements some equal to and some above threshold
			@Test
			void testMultipleElementsSomeEqualToSomeAboveThreshold() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(7);
				l.add(5);
				l.add(8);
				int t = 5;
				Boolean result = BelowThreshold.belowThreshold(l, t);
				assertEquals(false, result);
			}
}