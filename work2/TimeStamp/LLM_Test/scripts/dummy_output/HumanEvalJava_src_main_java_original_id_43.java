// PairsSumToZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {
			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero1() {
						List<Integer> l = List.of(1, 3, 5, 0);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero2() {
						List<Integer> l = List.of(1, 3, -2, 1);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero3() {
						List<Integer> l = List.of(1, 2, 3, 7);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero4() {
						List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertTrue(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains only one element.
			*/
			@Test
			void testPairsSumToZero5() {
						List<Integer> l = List.of(1);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero6() {
						List<Integer> l = List.of(1, 3, 5, 0);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero7() {
						List<Integer> l = List.of(1, 3, -2, 1);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero8() {
						List<Integer> l = List.of(1, 2, 3, 7);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains two distinct elements that sum to zero.
			*/
			@Test
			void testPairsSumToZero9() {
						List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertTrue(result);
			}

			/**
			* Test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
			* It tests the case when the list contains only one element.
			*/
			@Test
			void testPairsSumToZero10() {
						List<Integer> l = List.of(1);
						Boolean result = PairsSumToZero.pairsSumToZero(l);
						assertFalse(result);
			}
}