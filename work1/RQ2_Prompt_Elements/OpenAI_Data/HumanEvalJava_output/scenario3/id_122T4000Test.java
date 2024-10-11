// AddElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {

	@Test
	void testAddElements() {
		List<Integer> arr = List.of(1, -2, -3, 41, 57, 76, 87, 88, 99);
		assertEquals(-4, AddElements.addElements(arr, 3));
		
		arr = List.of(111, 121, 3, 4000, 5, 6);
		assertEquals(0, AddElements.addElements(arr, 2));
		
		arr = List.of(11, 21, 3, 90, 5, 6, 7, 8, 9);
		assertEquals(125, AddElements.addElements(arr, 4));
		
		arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
		assertEquals(24, AddElements.addElements(arr, 4));
		
		arr = List.of(1);
		assertEquals(1, AddElements.addElements(arr, 1));
	}
}