// OrderByPointsTest.java
package scenario2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains ten unit test cases for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {
			// Test case 1: Test with empty list
			@Test
			void testWithEmptyList() {
				List<Object> nums = Collections.emptyList();
				List<Object> expected = Collections.emptyList();
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 2: Test with list of one element
			@Test
			void testWithOneElement() {
				List<Object> nums = Collections.singletonList(1);
				List<Object> expected = Collections.singletonList(1);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 3: Test with list of two elements
			@Test
			void testWithTwoElements() {
				List<Object> nums = List.of(1, 2);
				List<Object> expected = List.of(1, 2);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 4: Test with list of three elements
			@Test
			void testWithThreeElements() {
				List<Object> nums = List.of(1, 2, 3);
				List<Object> expected = List.of(1, 2, 3);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 5: Test with list of four elements
			@Test
			void testWithFourElements() {
				List<Object> nums = List.of(1, 2, 3, 4);
				List<Object> expected = List.of(1, 2, 3, 4);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 6: Test with list of five elements
			@Test
			void testWithFiveElements() {
				List<Object> nums = List.of(1, 2, 3, 4, 5);
				List<Object> expected = List.of(1, 2, 3, 4, 5);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 7: Test with list of six elements
			@Test
			void testWithSixElements() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 8: Test with list of seven elements
			@Test
			void testWithSevenElements() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 9: Test with list of eight elements
			@Test
			void testWithEightElements() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
			
			// Test case 10: Test with list of nine elements
			@Test
			void testWithNineElements() {
				List<Object> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertEquals(expected, OrderByPoints.orderByPoints(nums));
			}
}