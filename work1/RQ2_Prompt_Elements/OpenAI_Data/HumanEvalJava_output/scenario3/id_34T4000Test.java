// UniqueTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

	@Test
	void testUnique() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique2() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique3() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique4() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique5() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique6() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique7() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique8() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique9() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
	
	@Test
	void testUnique10() {
		List<Integer> l = List.of(5, 3, 5, 2, 3, 3, 9, 0, 123);
		List<Integer> expected = List.of(0, 2, 3, 5, 9, 123);
		assertEquals(expected, Unique.unique(l));
	}
}