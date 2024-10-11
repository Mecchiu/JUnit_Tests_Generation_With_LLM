// SumProductTest.java
package scenario1;

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
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list is empty.
	*/
	@Test
	void testSumProduct_EmptyList() {
		List<Object> numbers = new ArrayList<Object>();
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only one element.
	*/
	@Test
	void testSumProduct_OneElement() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(1);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only two elements.
	*/
	@Test
	void testSumProduct_TwoElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(2);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only three elements.
	*/
	@Test
	void testSumProduct_ThreeElements() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(6);
		expected.add(6);
		assertEquals(expected, SumProduct.sumProduct(numbers));
	}
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only four elements.
	*/
	@Test
	void testSumProduct_FourElements() {
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
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only five elements.
	*/
	@Test
	void testSumProduct_FiveElements() {
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
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only six elements.
	*/
	@Test
	void testSumProduct_SixElements() {
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
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only seven elements.
	*/
	@Test
	void testSumProduct_SevenElements() {
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
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only eight elements.
	*/
	@Test
	void testSumProduct_EightElements() {
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
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only nine elements.
	*/
	@Test
	void testSumProduct_NineElements() {
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
	
	/**
	* Test case for {@link SumProduct#sumProduct(List)} method.
	* It tests the case when the input list contains only ten elements.
	*/
	@Test
	void testSumProduct_TenElements() {
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