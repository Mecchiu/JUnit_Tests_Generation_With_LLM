// TriplesSumToZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero1() {
				List<Integer> l = List.of(1, 3, -2, 1);
				assertTrue(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero2() {
				List<Integer> l = List.of(2, 4, -5, 3, 9, 7);
				assertTrue(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero3() {
				List<Integer> l = List.of(1, 3, 5, 0);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero4() {
				List<Integer> l = List.of(1, 3, 5, -1);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero5() {
				List<Integer> l = List.of(1, 2, 3, 7);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero6() {
				List<Integer> l = List.of(1, 2, 5, 7);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero7() {
				List<Integer> l = List.of(1);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero8() {
				List<Integer> l = List.of(1, 3, 5, -100);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero9() {
				List<Integer> l = List.of(100, 3, 5, -100);
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}

			/**
			* Test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
			* It tests the case where the list contains three distinct elements that sum to zero.
			*/
			@Test
			void testTriplesSumToZero10() {
				List<Integer> l = List.of();
				assertFalse(TriplesSumToZero.triplesSumToZero(l));
			}
}