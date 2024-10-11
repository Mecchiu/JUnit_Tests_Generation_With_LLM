// MaxElementTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
			// Test case 1: Test the method with a list of positive integers.
			@Test
			void testMaxElement1() {
				List<Integer> l = List.of(1, 2, 3);
				int expected = 3;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 2: Test the method with a list of negative integers.
			@Test
			void testMaxElement2() {
				List<Integer> l = List.of(-5, -3, -1);
				int expected = -1;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 3: Test the method with a list of positive and negative integers.
			@Test
			void testMaxElement3() {
				List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
				int expected = 123;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 4: Test the method with a list of positive integers and zero.
			@Test
			void testMaxElement4() {
				List<Integer> l = List.of(1, 2, 3, 0);
				int expected = 3;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 5: Test the method with a list of negative integers and zero.
			@Test
			void testMaxElement5() {
				List<Integer> l = List.of(-5, -3, -1, 0);
				int expected = 0;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 6: Test the method with a list of positive and negative integers and zero.
			@Test
			void testMaxElement6() {
				List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
				int expected = 124;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 7: Test the method with a list of one positive integer.
			@Test
			void testMaxElement7() {
				List<Integer> l = List.of(1);
				int expected = 1;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 8: Test the method with a list of one negative integer.
			@Test
			void testMaxElement8() {
				List<Integer> l = List.of(-1);
				int expected = -1;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 9: Test the method with a list of one zero.
			@Test
			void testMaxElement9() {
				List<Integer> l = List.of(0);
				int expected = 0;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}

			// Test case 10: Test the method with an empty list.
			@Test
			void testMaxElement10() {
				List<Integer> l = List.of();
				int expected = Integer.MIN_VALUE;
				int actual = MaxElement.maxElement(l);
				assertEquals(expected, actual);
			}
}