// MaxFillTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains ten unit test cases for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

	@Test
	void testMaxFill() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 3;
		int expected = 3;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill2() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 2;
		int expected = 4;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill3() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 1;
		int expected = 6;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill4() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 4;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill5() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 5;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill6() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 6;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill7() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 7;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill8() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 8;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill9() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 9;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMaxFill10() {
		List<List<Integer>> grid = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
		int capacity = 10;
		int expected = 2;
		int actual = MaxFill.maxFill(grid, capacity);
		assertEquals(expected, actual);
	}
}