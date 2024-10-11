// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
			// Test case 1: Test with a list of positive and negative numbers.
			@Test
			void testGetPositive1() {
				List<Object> l = List.of(-1, 2, -4, 5, 6);
				List<Object> expected = List.of(2, 5, 6);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with a list of positive and negative numbers.
			@Test
			void testGetPositive2() {
				List<Object> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
				List<Object> expected = List.of(5, 3, 2, 3, 9, 123, 1);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with a list of positive and negative numbers.
			@Test
			void testGetPositive3() {
				List<Object> l = List.of(-1, -2, 4, 5, 6);
				List<Object> expected = List.of(4, 5, 6);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of positive and negative numbers.
			@Test
			void testGetPositive4() {
				List<Object> l = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
				List<Object> expected = List.of(5, 3, 2, 3, 3, 9, 123, 1);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of negative numbers.
			@Test
			void testGetPositive5() {
				List<Object> l = List.of(-1, -2);
				List<Object> expected = List.of();
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with an empty list.
			@Test
			void testGetPositive6() {
				List<Object> l = List.of();
				List<Object> expected = List.of();
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of positive numbers.
			@Test
			void testGetPositive7() {
				List<Object> l = List.of(1, 2, 3, 4, 5);
				List<Object> expected = List.of(1, 2, 3, 4, 5);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of negative numbers.
			@Test
			void testGetPositive8() {
				List<Object> l = List.of(-1, -2, -3, -4, -5);
				List<Object> expected = List.of();
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of positive and negative numbers.
			@Test
			void testGetPositive9() {
				List<Object> l = List.of(-1, 2, -3, 4, -5);
				List<Object> expected = List.of(2, 4);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of positive and negative numbers.
			@Test
			void testGetPositive10() {
				List<Object> l = List.of(1, -2, 3, -4, 5);
				List<Object> expected = List.of(1, 3, 5);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}
}