// MaxFillTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {
			/**
			* Test case 1: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[0,0,1,0], [0,1,0,0], [1,1,1,1]]
			* bucket_capacity : 1
			* Output: 6
			*/
			@Test
			void testMaxFill1() {
				List<List<Integer>> grid = List.of(List.of(0, 0, 1, 0), List.of(0, 1, 0, 0), List.of(1, 1, 1, 1));
				int bucketCapacity = 1;
				int expected = 6;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[0,0,1,1], [0,0,0,0], [1,1,1,1], [0,1,1,1]]
			* bucket_capacity : 2
			* Output: 5
			*/
			@Test
			void testMaxFill2() {
				List<List<Integer>> grid = List.of(List.of(0, 0, 1, 1), List.of(0, 0, 0, 0), List.of(1, 1, 1, 1), List.of(0, 1, 1, 1));
				int bucketCapacity = 2;
				int expected = 5;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[0,0,0], [0,0,0]]
			* bucket_capacity : 5
			* Output: 0
			*/
			@Test
			void testMaxFill3() {
				List<List<Integer>> grid = List.of(List.of(0, 0, 0), List.of(0, 0, 0));
				int bucketCapacity = 5;
				int expected = 0;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 2
			* Output: 4
			*/
			@Test
			void testMaxFill4() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 2;
				int expected = 4;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 9
			* Output: 2
			*/
			@Test
			void testMaxFill5() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 9;
				int expected = 2;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 1
			* Output: 8
			*/
			@Test
			void testMaxFill6() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 1;
				int expected = 8;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 0
			* Output: 0
			*/
			@Test
			void testMaxFill7() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 0;
				int expected = 0;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 10
			* Output: 1
			*/
			@Test
			void testMaxFill8() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 10;
				int expected = 1;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 100
			* Output: 1
			*/
			@Test
			void testMaxFill9() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 100;
				int expected = 1;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: {@link MaxFill#maxFill(List, int)}.
			* Input:
			* grid : [[1,1,1,1], [1,1,1,1]]
			* bucket_capacity : 1000
			* Output: 1
			*/
			@Test
			void testMaxFill10() {
				List<List<Integer>> grid = List.of(List.of(1, 1, 1, 1), List.of(1, 1, 1, 1));
				int bucketCapacity = 1000;
				int expected = 1;
				int actual = MaxFill.maxFill(grid, bucketCapacity);
				assertEquals(expected, actual);
			}
}