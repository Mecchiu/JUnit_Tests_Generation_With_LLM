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
				assertEquals(10, result.get(0));
				assertEquals(24, result.get(1));
			}

			@Test
			void testSumProductEmpty() {
				List<Integer> result = SumProduct.sumProduct(List.of());
				assertEquals(0, result.get(0));
				assertEquals(1, result.get(1));
			}

			@Test
			void testSumProductSame() {
				List<Integer> result = SumProduct.sumProduct(List.of(1, 1, 1));
				assertEquals(3, result.get(0));
				assertEquals(1, result.get(1));
			}

			@Test
			void testSumProductZero() {
				List<Integer> result = SumProduct.sumProduct(List.of(100, 0));
				assertEquals(100, result.get(0));
				assertEquals(0, result.get(1));
			}

			@Test
			void testSumProductDifferent() {
				List<Integer> result = SumProduct.sumProduct(List.of(3, 5, 7));
				assertEquals(15, result.get(0));
				assertEquals(105, result.get(1));
			}

			@Test
			void testSumProductOne() {
				List<Integer> result = SumProduct.sumProduct(List.of(10));
				assertEquals(10, result.get(0));
				assertEquals(10, result.get(1));
			}

			@Test
			void testSumProductNull() {
				List<Integer> result = SumProduct.sumProduct(null);
				assertNull(result);
			}

			@Test
			void testSumProductOneNull() {
				List<Integer> result = SumProduct.sumProduct(List.of(1, null));
				assertEquals(1, result.get(0));
				assertEquals(0, result.get(1));
			}

			@Test
			void testSumProductOneNullOne() {
				List<Integer> result = SumProduct.sumProduct(List.of(null, 1));
				assertEquals(1, result.get(0));
				assertEquals(0, result.get(1));
			}

			@Test
			void testSumProductOneNullOneNull() {
				List<Integer> result = SumProduct.sumProduct(List.of(null, null));
				assertEquals(0, result.get(0));
				assertEquals(1, result.get(1));
			}
}
