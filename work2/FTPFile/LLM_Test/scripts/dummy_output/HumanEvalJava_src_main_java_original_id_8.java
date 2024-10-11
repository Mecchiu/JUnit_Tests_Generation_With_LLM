// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method returns the correct sum and product for a given list of integers.
			*/
			@Test
			void testSumProduct() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(10, result.get(0));
				assertEquals(24, result.get(1));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method returns the correct sum and product for an empty list.
			*/
			@Test
			void testSumProductEmptyList() {
				List<Object> numbers = new ArrayList<Object>();
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(0, result.get(0));
				assertEquals(1, result.get(1));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method returns the correct sum and product for a list of identical integers.
			*/
			@Test
			void testSumProductIdenticalIntegers() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(1);
				numbers.add(1);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(3, result.get(0));
				assertEquals(1, result.get(1));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method returns the correct sum and product for a list of two integers.
			*/
			@Test
			void testSumProductTwoIntegers() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(100);
				numbers.add(0);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(100, result.get(0));
				assertEquals(0, result.get(1));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method returns the correct sum and product for a list of three integers.
			*/
			@Test
			void testSumProductThreeIntegers() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(3);
				numbers.add(5);
				numbers.add(7);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(15, result.get(0));
				assertEquals(105, result.get(1));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method returns the correct sum and product for a list of one integer.
			*/
			@Test
			void testSumProductOneInteger() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(10);
				List<Integer> result = SumProduct.sumProduct(numbers);
				assertEquals(10, result.get(0));
				assertEquals(10, result.get(1));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method throws an exception when the list contains an invalid number type.
			*/
			@Test
			void testSumProductInvalidNumberType() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add("1");
				assertThrows(IllegalArgumentException.class, () -> SumProduct.sumProduct(numbers));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method throws an exception when the list contains a null value.
			*/
			@Test
			void testSumProductNullValue() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(null);
				assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(numbers));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method throws an exception when the list is null.
			*/
			@Test
			void testSumProductNullList() {
				assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(null));
			}

			/**
			* Test case for the {@link SumProduct#sumProduct(List)} method.
			* It checks if the method throws an exception when the list contains a null value.
			*/
			@Test
			void testSumProductNullValueInList() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(null);
				assertThrows(NullPointerException.class, () -> SumProduct.sumProduct(numbers));
			}
}