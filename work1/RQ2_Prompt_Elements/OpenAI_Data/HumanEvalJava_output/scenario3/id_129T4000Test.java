// MinpathTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains ten unit test cases for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {

	@Test
	void testMinpath1() {
		List<List<Integer>> grid = List.of(
			List.of(1, 2, 3),
			List.of(4, 5, 6),
			List.of(7, 8, 9)
		);
		List<Integer> expected = List.of(1, 2, 1);
		List<Integer> actual = Minpath.minpath(grid, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath2() {
		List<List<Integer>> grid = List.of(
			List.of(5, 9, 3),
			List.of(4, 1, 6),
			List.of(7, 8, 2)
		);
		List<Integer> expected = List.of(1);
		List<Integer> actual = Minpath.minpath(grid, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath3() {
		List<List<Integer>> grid = List.of(
			List.of(1, 2, 3, 4),
			List.of(5, 6, 7, 8),
			List.of(9, 10, 11, 12),
			List.of(13, 14, 15, 16)
		);
		List<Integer> expected = List.of(1, 2, 1, 2);
		List<Integer> actual = Minpath.minpath(grid, 4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath4() {
		List<List<Integer>> grid = List.of(
			List.of(6, 4, 13, 10),
			List.of(5, 7, 12, 1),
			List.of(3, 16, 11, 15),
			List.of(8, 14, 9, 2)
		);
		List<Integer> expected = List.of(1, 10, 1, 10, 1, 10, 1);
		List<Integer> actual = Minpath.minpath(grid, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath5() {
		List<List<Integer>> grid = List.of(
			List.of(8, 14, 9, 2),
			List.of(6, 4, 13, 15),
			List.of(5, 7, 1, 12),
			List.of(3, 10, 11, 16)
		);
		List<Integer> expected = List.of(1, 7, 1, 7, 1);
		List<Integer> actual = Minpath.minpath(grid, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath6() {
		List<List<Integer>> grid = List.of(
			List.of(11, 8, 7, 2),
			List.of(5, 16, 14, 4),
			List.of(9, 3, 15, 6),
			List.of(12, 13, 10, 1)
		);
		List<Integer> expected = List.of(1, 6, 1, 6, 1, 6, 1, 6, 1);
		List<Integer> actual = Minpath.minpath(grid, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath7() {
		List<List<Integer>> grid = List.of(
			List.of(12, 13, 10, 1),
			List.of(9, 3, 15, 6),
			List.of(5, 16, 14, 4),
			List.of(11, 8, 7, 2)
		);
		List<Integer> expected = List.of(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6);
		List<Integer> actual = Minpath.minpath(grid, 12);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath8() {
		List<List<Integer>> grid = List.of(
			List.of(2, 7, 4),
			List.of(3, 1, 5),
			List.of(6, 8, 9)
		);
		List<Integer> expected = List.of(1, 3, 1, 3, 1, 3, 1, 3);
		List<Integer> actual = Minpath.minpath(grid, 8);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath9() {
		List<List<Integer>> grid = List.of(
			List.of(6, 1, 5),
			List.of(3, 8, 9),
			List.of(2, 7, 4)
		);
		List<Integer> expected = List.of(1, 5, 1, 5, 1, 5, 1, 5);
		List<Integer> actual = Minpath.minpath(grid, 8);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMinpath10() {
		List<List<Integer>> grid = List.of(
			List.of(1, 2),
			List.of(3, 4)
		);
		List<Integer> expected = List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2);
		List<Integer> actual = Minpath.minpath(grid, 10);
		assertEquals(expected, actual);
	}
}