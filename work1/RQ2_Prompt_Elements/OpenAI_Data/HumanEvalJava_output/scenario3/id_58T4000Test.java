// CommonTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

	@Test
	void testCommon() {
		List<Integer> l1 = List.of(1, 4, 3, 34, 653, 2, 5);
		List<Integer> l2 = List.of(5, 7, 1, 5, 9, 653, 121);
		List<Integer> expected = List.of(1, 5, 653);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon2() {
		List<Integer> l1 = List.of(5, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2);
		List<Integer> expected = List.of(2, 3);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon3() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon4() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of();
		List<Integer> expected = List.of();
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon5() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon6() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon7() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon8() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon9() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCommon10() {
		List<Integer> l1 = List.of(4, 3, 2, 8);
		List<Integer> l2 = List.of(3, 2, 4);
		List<Integer> expected = List.of(2, 3, 4);
		List<Integer> actual = Common.common(l1, l2);
		assertEquals(expected, actual);
	}
}