// MaxFillTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains one unit test case for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {
/**
		* Test case 1: Returns empty if the matrix is empty.
		* @throws Exception
		*/
		@Test
		void test() throws Exception {
		// test case 1: Input is empty
		List<List<Integer>> grid = new ArrayList<>(0);
		int bucket_capacity = 10;
		assertEquals(0, maxFill(grid, bucket_capacity));
		// test case 1: input is filled
		List<Integer> bucket = new ArrayList<>(4);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				bucket.add(0);
			}
		}
		assertEquals(bucket_capacity, maxFill(grid, bucket_capacity));
		// test 2: All buckets available
		assertEquals(bucket_capacity, maxFill(grid, bucket_capacity));
		}

		/**
		* Test case 2: Returns 1 if the matrix is filled with 1 unit of water.
		* @throws Exception
		*/
		@Test
		void test2() throws Exception {
		// test case 2: Output 1 unit of water
		List<Integer> bucket = new ArrayList<>(4);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				bucket.add(i * 10 + j - 5);
			}
		}
		int bucket_capacity = 10;
		assertEquals(1, maxFill(grid, bucket_capacity, bucket));
		// test case 2: Input is filled
		assertEquals(1, maxFill(new ArrayListView<>(grid), bucket_capacity, bucket));
		}

		/**
		* Test case 3: Outputs the count of times you need lower the buckets.
		* @throws Exception
		*/
		@Test
		void test3() throws Exception {
		// test case 3: Input is filled
		List<Integer> bucket = new ArrayList<>(0);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				bucket.add(0);
			}
		}
		assertEquals(bucket.size(), maxFill(grid, bucket.size(), bucket));
		// test case 3: Input is not filled
		List<Integer> bucket_not_filled = new ArrayList<>(11);
		grid = new ArrayList<>(10);
		assertEquals(0, maxFill(grid, bucket_not_filled.size(), bucket_not_filled));
		}
}

// EOF