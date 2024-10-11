// UniqueTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains one unit test case for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

	/**
	 * Test method for {@link Unique#unique(List)}.
	 */
	@Test
	public void testUnique() {
		assertArrayEquals(new int[]{0}, new Unique().unique(new List<Integer>()));
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		int[] expected = new int[]{1, 2, 3};
		//assertArrayEquals(expected, new Unique().unique(list));
		assertArrayEquals(expected, new Unique().unique(list));
	}
}