// IncrListTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {
			// Test case 1: Test with a list of positive integers
			@Test
			void testIncrList1() {
				List<Object> l = Arrays.asList(1, 2, 3);
				List<Object> expected = Arrays.asList(2, 3, 4);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with a list of positive and negative integers
			@Test
			void testIncrList2() {
				List<Object> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
				List<Object> expected = Arrays.asList(6, 4, 6, 3, 4, 4, 10, 1, 124);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with an empty list
			@Test
			void testIncrList3() {
				List<Object> l = Arrays.asList();
				List<Object> expected = Arrays.asList();
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of negative integers
			@Test
			void testIncrList4() {
				List<Object> l = Arrays.asList(-1, -2, -3);
				List<Object> expected = Arrays.asList(0, -1, -2);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of positive and negative integers
			@Test
			void testIncrList5() {
				List<Object> l = Arrays.asList(5, -3, 5, -2, 3, -3, 9, 0, -123);
				List<Object> expected = Arrays.asList(6, -2, 6, -1, 4, -2, 10, 1, -122);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with a list of positive and negative integers
			@Test
			void testIncrList6() {
				List<Object> l = Arrays.asList(5, -3, 5, -2, 3, -3, 9, 0, -123);
				List<Object> expected = Arrays.asList(6, -2, 6, -1, 4, -2, 10, 1, -122);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of positive and negative integers
			@Test
			void testIncrList7() {
				List<Object> l = Arrays.asList(5, -3, 5, -2, 3, -3, 9, 0, -123);
				List<Object> expected = Arrays.asList(6, -2, 6, -1, 4, -2, 10, 1, -122);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of positive and negative integers
			@Test
			void testIncrList8() {
				List<Object> l = Arrays.asList(5, -3, 5, -2, 3, -3, 9, 0, -123);
				List<Object> expected = Arrays.asList(6, -2, 6, -1, 4, -2, 10, 1, -122);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of positive and negative integers
			@Test
			void testIncrList9() {
				List<Object> l = Arrays.asList(5, -3, 5, -2, 3, -3, 9, 0, -123);
				List<Object> expected = Arrays.asList(6, -2, 6, -1, 4, -2, 10, 1, -122);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of positive and negative integers
			@Test
			void testIncrList10() {
				List<Object> l = Arrays.asList(5, -3, 5, -2, 3, -3, 9, 0, -123);
				List<Object> expected = Arrays.asList(6, -2, 6, -1, 4, -2, 10, 1, -122);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
}