// MaxFillTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains one unit test case for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

	@Test
	void maxTest() {
		List<List<Integer>> grid = new ArrayList<>();
		
		List<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		grid.add(arr1);
		
		List<Integer> arr2 = new ArrayList<>();
		arr2.add(1); arr2.add(2);
		grid.add(arr2);
		
		assertEquals("0", maxFill(grid, 1));
		assertEquals("0", maxFill(grid, 2));
		assertEquals("0", maxFill(grid, 3));
		
		arr1 = new ArrayList<>();
		arr1.add(2);
		arr1.add(1);
		grid.add(arr1);
		assertEquals("0", maxFill(grid, 2));
		assertEquals("0", maxFill(grid, 3));
		
		arr2 = new ArrayList<>();
		arr2.add(2); arr2.add(1); arr2.add(2);
		grid.add(arr2);
		assertEquals("0", maxFill(grid, 3));
		assertEquals("0", maxFill(grid, 4));
		
		grid = new ArrayList<>();
		grid.add(arr1);
		grid.add(arr2);
		grid.add(arr1);
		assertEquals("1", maxFill(grid, 1));
		assertEquals("2", maxFill(grid, 2));
		assertEquals("3", maxFill(grid, 3)); 
	}
}