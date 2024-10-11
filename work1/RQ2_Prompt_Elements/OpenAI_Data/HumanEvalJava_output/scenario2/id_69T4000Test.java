// SearchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#search(List)} method.
*/
class SearchTest {

	@Test
	void testSearch() {
		assertEquals(1, Search.search(List.of(1, 1, 1)));
		assertEquals(2, Search.search(List.of(2, 2, 2, 2)));
		assertEquals(3, Search.search(List.of(3, 3, 3, 3, 3)));
		assertEquals(4, Search.search(List.of(4, 4, 4, 4, 4, 4)));
		assertEquals(5, Search.search(List.of(5, 5, 5, 5, 5, 5, 5)));
		assertEquals(6, Search.search(List.of(6, 6, 6, 6, 6, 6, 6, 6)));
		assertEquals(7, Search.search(List.of(7, 7, 7, 7, 7, 7, 7, 7, 7)));
		assertEquals(8, Search.search(List.of(8, 8, 8, 8, 8, 8, 8, 8, 8, 8)));
		assertEquals(9, Search.search(List.of(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9)));
		assertEquals(10, Search.search(List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)));
	}
}