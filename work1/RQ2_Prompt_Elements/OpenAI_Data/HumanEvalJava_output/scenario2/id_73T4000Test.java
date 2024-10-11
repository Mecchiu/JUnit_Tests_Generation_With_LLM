// SmallestChangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

	@Test
	void testSmallestChange() {
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(9, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(10, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(11, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(12, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(13, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals(14, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals(15, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals(16, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals(17, SmallestChange.smallestChange(arr));
		
		arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
		assertEquals(18, SmallestChange.smallestChange(arr));
	}
}