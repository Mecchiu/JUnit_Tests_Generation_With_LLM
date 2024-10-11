// RemoveDuplicatesTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

	@Test
	void testRemoveDuplicates_1() {
		List<Object> input = List.of(1, 2, 3, 2, 4);
		List<Object> expected = List.of(1, 3, 4);
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_2() {
		List<Object> input = List.of();
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_3() {
		List<Object> input = List.of(1, 2, 3, 4);
		List<Object> expected = List.of(1, 2, 3, 4);
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_4() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5);
		List<Object> expected = List.of(1, 4, 5);
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_5() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5, 1, 2, 3, 4, 5);
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_6() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_7() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_8() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_9() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveDuplicates_10() {
		List<Object> input = List.of(1, 2, 3, 2, 4, 3, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		List<Object> expected = List.of();
		List<Object> actual = RemoveDuplicates.removeDuplicates(input);
		assertEquals(expected, actual);
	}
}