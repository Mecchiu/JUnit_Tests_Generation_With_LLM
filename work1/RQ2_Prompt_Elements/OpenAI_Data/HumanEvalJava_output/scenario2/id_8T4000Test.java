// SumProductTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

	@Test
	void testSumProduct_EmptyList() {
		List<Object> numbers = new ArrayList<Object>();
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_OneInteger() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_TwoIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(2);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_ThreeIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(6);
		expected.add(6);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_FourIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(10);
		expected.add(24);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_FiveIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(15);
		expected.add(120);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_SixIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(21);
		expected.add(720);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_SevenIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(28);
		expected.add(5040);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_EightIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(36);
		expected.add(40320);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_NineIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(45);
		expected.add(362880);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	@Test
	void testSumProduct_TenIntegers() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(55);
		expected.add(3628800);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
}