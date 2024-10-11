// ProdSignsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {
			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns null when the list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> list = List.of();
				Integer result = ProdSigns.prodSigns(list);
				assertNull(result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains only positive numbers.
			*/
			@Test
			void testPositiveNumbers() {
				List<Object> list = List.of(1, 2, 3, 4);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(10, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains only negative numbers.
			*/
			@Test
			void testNegativeNumbers() {
				List<Object> list = List.of(-1, -2, -3, -4);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(-10, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains only zeros.
			*/
			@Test
			void testZeros() {
				List<Object> list = List.of(0, 0, 0, 0);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(0, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains a mix of positive and negative numbers.
			*/
			@Test
			void testMixOfPositiveAndNegativeNumbers() {
				List<Object> list = List.of(1, -2, 3, -4);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(24, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains a mix of positive and negative numbers and zeros.
			*/
			@Test
			void testMixOfPositiveAndNegativeNumbersAndZeros() {
				List<Object> list = List.of(1, 0, -2, 3, 0, -4);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(0, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains only one positive number.
			*/
			@Test
			void testOnePositiveNumber() {
				List<Object> list = List.of(1);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(1, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains only one negative number.
			*/
			@Test
			void testOneNegativeNumber() {
				List<Object> list = List.of(-1);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(-1, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains only one zero.
			*/
			@Test
			void testOneZero() {
				List<Object> list = List.of(0);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(0, result);
			}

			/**
			* Test case for {@link ProdSigns#prodSigns(List)}.
			* It checks if the method returns the correct result when the list contains a mix of positive and negative numbers and zeros.
			*/
			@Test
			void testMixOfPositiveAndNegativeNumbersAndZeros2() {
				List<Object> list = List.of(1, 0, -2, 3, 0, -4);
				Integer result = ProdSigns.prodSigns(list);
				assertEquals(0, result);
			}
}