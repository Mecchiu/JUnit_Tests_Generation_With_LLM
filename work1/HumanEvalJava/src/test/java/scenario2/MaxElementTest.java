// MaxElementTest.java
package scenario2;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
			// Test case 1: Test with empty list
			@Test
			void testMaxElementEmptyList() {
				List<Integer> l = new ArrayList<>();
				int result = MaxElement.maxElement(l);
				assertEquals(Integer.MIN_VALUE, result);
			}
			
			// Test case 2: Test with list of one element
			@Test
			void testMaxElementOneElement() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				int result = MaxElement.maxElement(l);
				assertEquals(5, result);
			}
			
			// Test case 3: Test with list of two elements
			@Test
			void testMaxElementTwoElements() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(10);
				int result = MaxElement.maxElement(l);
				assertEquals(10, result);
			}
			
			// Test case 4: Test with list of three elements
			@Test
			void testMaxElementThreeElements() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(10);
				l.add(15);
				int result = MaxElement.maxElement(l);
				assertEquals(15, result);
			}
			
			// Test case 5: Test with list of four elements
			@Test
			void testMaxElementFourElements() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(10);
				l.add(15);
				l.add(20);
				int result = MaxElement.maxElement(l);
				assertEquals(20, result);
			}
			
			// Test case 6: Test with list of five elements
			@Test
			void testMaxElementFiveElements() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(10);
				l.add(15);
				l.add(20);
				l.add(25);
				int result = MaxElement.maxElement(l);
				assertEquals(25, result);
			}
			
			// Test case 7: Test with list of negative elements
			@Test
			void testMaxElementNegativeElements() {
				List<Integer> l = new ArrayList<>();
				l.add(-5);
				l.add(-10);
				l.add(-15);
				l.add(-20);
				l.add(-25);
				int result = MaxElement.maxElement(l);
				assertEquals(-5, result);
			}
			
			// Test case 8: Test with list of positive and negative elements
			@Test
			void testMaxElementPositiveAndNegativeElements() {
				List<Integer> l = new ArrayList<>();
				l.add(-5);
				l.add(10);
				l.add(-15);
				l.add(20);
				l.add(-25);
				int result = MaxElement.maxElement(l);
				assertEquals(20, result);
			}
			
			// Test case 9: Test with list of duplicate elements
			@Test
			void testMaxElementDuplicateElements() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(10);
				l.add(15);
				l.add(20);
				l.add(20);
				int result = MaxElement.maxElement(l);
				assertEquals(20, result);
			}
			
			// Test case 10: Test with list of large elements
			@Test
			void testMaxElementLargeElements() {
				List<Integer> l = new ArrayList<>();
				l.add(500000);
				l.add(1000000);
				l.add(1500000);
				l.add(2000000);
				l.add(2500000);
				int result = MaxElement.maxElement(l);
				assertEquals(2500000, result);
			}
}