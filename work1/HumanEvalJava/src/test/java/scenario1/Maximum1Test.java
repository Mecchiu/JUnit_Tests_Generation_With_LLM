// Maximum1Test.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {
			// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Integer> arr = new ArrayList<Integer>();
				int k = 3;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test with k = 0
			@Test
			void testKZero() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 0;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test with k = 1
			@Test
			void testKOne() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 1;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test with k = 5
			@Test
			void testKFive() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 5;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(1, 2, 3, 4, 5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test with k = 3
			@Test
			void testKThree() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 3;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(3, 4, 5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test with k = 2
			@Test
			void testKTwo() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 2;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(4, 5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test with k = 4
			@Test
			void testKFour() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 4;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(2, 3, 4, 5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test with k = 6
			@Test
			void testKSix() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
				int k = 6;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(1, 2, 3, 4, 5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test with k = 3 and duplicate elements
			@Test
			void testKThreeDuplicate() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 5));
				int k = 3;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(5, 5, 5));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test with k = 3 and negative elements
			@Test
			void testKThreeNegative() {
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(-1, -2, -3, -4, -5));
				int k = 3;
				List<Object> expected = new ArrayList<Object>(Arrays.asList(-3, -2, -1));
				List<Object> actual = Maximum1.maximum(arr, k);
				assertEquals(expected, actual);
			}
}