// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
			/**
			* Test case for an empty list.
			*/
			@Test
			void testEmptyList() {
				List<Object> operations = List.of();
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with only positive numbers.
			*/
			@Test
			void testPositiveNumbers() {
				List<Object> operations = List.of(1, 2, 3);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with only negative numbers.
			*/
			@Test
			void testNegativeNumbers() {
				List<Object> operations = List.of(-1, -2, -3);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd() {
				List<Object> operations = List.of(1, 2, -3);
				assertFalse(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning() {
				List<Object> operations = List.of(-1, 2, 3);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle() {
				List<Object> operations = List.of(1, -2, 3);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd2() {
				List<Object> operations = List.of(1, 2, 3, -4);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning2() {
				List<Object> operations = List.of(-1, 2, 3, 4);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle2() {
				List<Object> operations = List.of(1, 2, -3, 4);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd3() {
				List<Object> operations = List.of(1, 2, 3, -4, 5);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning3() {
				List<Object> operations = List.of(-1, 2, 3, 4, 5);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle3() {
				List<Object> operations = List.of(1, 2, -3, 4, 5);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd4() {
				List<Object> operations = List.of(1, 2, 3, -4, 5, 6);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning4() {
				List<Object> operations = List.of(-1, 2, 3, 4, 5, 6);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle4() {
				List<Object> operations = List.of(1, 2, -3, 4, 5, 6);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd5() {
				List<Object> operations = List.of(1, 2, 3, -4, 5, 6, 7);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning5() {
				List<Object> operations = List.of(-1, 2, 3, 4, 5, 6, 7);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle5() {
				List<Object> operations = List.of(1, 2, -3, 4, 5, 6, 7);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd6() {
				List<Object> operations = List.of(1, 2, 3, -4, 5, 6, 7, 8);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning6() {
				List<Object> operations = List.of(-1, 2, 3, 4, 5, 6, 7, 8);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle6() {
				List<Object> operations = List.of(1, 2, -3, 4, 5, 6, 7, 8);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd7() {
				List<Object> operations = List.of(1, 2, 3, -4, 5, 6, 7, 8, 9);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning7() {
				List<Object> operations = List.of(-1, 2, 3, 4, 5, 6, 7, 8, 9);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle7() {
				List<Object> operations = List.of(1, 2, -3, 4, 5, 6, 7, 8, 9);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the end.
			*/
			@Test
			void testNegativeNumberAtEnd8() {
				List<Object> operations = List.of(1, 2, 3, -4, 5, 6, 7, 8, 9, 10);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number at the beginning.
			*/
			@Test
			void testNegativeNumberAtBeginning8() {
				List<Object> operations = List.of(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertTrue(BelowZero.belowZero(operations));
			}

			/**
			* Test case for a list with a negative number in the middle.
			*/
			@Test
			void testNegativeNumberInMiddle8() {
}
}