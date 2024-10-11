// SumProductTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

	@Test
	void testSumProduct() {
		List<Integer> result = SumProduct.sumProduct(List.of(1, 2, 3, 4));
		assertEquals(List.of(10, 24), result);
	}
	
	@Test
	void testSumProductEmpty() {
		List<Integer> result = SumProduct.sumProduct(List.of());
		assertEquals(List.of(0, 1), result);
	}
	
	@Test
	void testSumProductOne() {
		List<Integer> result = SumProduct.sumProduct(List.of(1));
		assertEquals(List.of(1, 1), result);
	}
	
	@Test
	void testSumProductTwo() {
		List<Integer> result = SumProduct.sumProduct(List.of(1, 1));
		assertEquals(List.of(2, 1), result);
	}
	
	@Test
	void testSumProductThree() {
		List<Integer> result = SumProduct.sumProduct(List.of(1, 1, 1));
		assertEquals(List.of(3, 1), result);
	}
	
	@Test
	void testSumProductZero() {
		List<Integer> result = SumProduct.sumProduct(List.of(100, 0));
		assertEquals(List.of(100, 0), result);
	}
	
	@Test
	void testSumProductThreeNumbers() {
		List<Integer> result = SumProduct.sumProduct(List.of(3, 5, 7));
		assertEquals(List.of(15, 105), result);
	}
	
	@Test
	void testSumProductTen() {
		List<Integer> result = SumProduct.sumProduct(List.of(10));
		assertEquals(List.of(10, 10), result);
	}
	
	@Test
	void testSumProductNegative() {
		List<Integer> result = SumProduct.sumProduct(List.of(-1, -2, -3, -4));
		assertEquals(List.of(-10, 24), result);
	}
	
	@Test
	void testSumProductNegativeAndPositive() {
		List<Integer> result = SumProduct.sumProduct(List.of(-1, -2, -3, -4, 5, 6, 7, 8));
		assertEquals(List.of(20, -40320), result);
	}
}