// MaxElementTest.java
package scenario3;

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
				assertEquals(3, MaxElement.maxElement(l));
			}

			// Test case 2: Test the method with a list of negative integers.
			@Test
			void testMaxElement2() {
				List<Integer> l = List.of(-5, -3, -1);
				assertEquals(-1, MaxElement.maxElement(l));
			}

			// Test case 3: Test the method with a list of positive and negative integers.
			@Test
			void testMaxElement3() {
				List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
				assertEquals(123, MaxElement.maxElement(l));
			}

			// Test case 4: Test the method with a list of positive integers and zero.
			@Test
			void testMaxElement4() {
				List<Integer> l = List.of(1, 2, 3, 0);
				assertEquals(3, MaxElement.maxElement(l));
			}

			// Test case 5: Test the method with a list of negative integers and zero.
			@Test
			void testMaxElement5() {
				List<Integer> l = List.of(-5, -3, -1, 0);
				assertEquals(0, MaxElement.maxElement(l));
			}

			// Test case 6: Test the method with a list of positive and negative integers and zero.
			@Test
			void testMaxElement6() {
				List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
				assertEquals(124, MaxElement.maxElement(l));
			}

			// Test case 7: Test the method with a list of one positive integer.
			@Test
			void testMaxElement7() {
				List<Integer> l = List.of(1);
				assertEquals(1, MaxElement.maxElement(l));
			}

			// Test case 8: Test the method with a list of one negative integer.
			@Test
			void testMaxElement8() {
				List<Integer> l = List.of(-1);
				assertEquals(-1, MaxElement.maxElement(l));
			}

			// Test case 9: Test the method with a list of one zero.
			@Test
			void testMaxElement9() {
				List<Integer> l = List.of(0);
				assertEquals(0, MaxElement.maxElement(l));
			}

			// Test case 10: Test the method with an empty list.
			@Test
			void testMaxElement10() {
				List<Integer> l = List.of();
				assertThrows(IllegalArgumentException.class, () -> MaxElement.maxElement(l));
			}
}