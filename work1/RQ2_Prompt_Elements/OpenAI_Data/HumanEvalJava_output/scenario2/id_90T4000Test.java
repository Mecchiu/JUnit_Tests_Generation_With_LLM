// NextSmallestTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

	@Test
	void testNextSmallest() {
		List<Object> lst = List.of(1, 2, 3, 4, 5);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest2() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest3() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest4() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest5() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest6() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest7() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest8() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest9() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
	
	@Test
	void testNextSmallest10() {
		List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals(2, NextSmallest.nextSmallest(lst));
	}
}