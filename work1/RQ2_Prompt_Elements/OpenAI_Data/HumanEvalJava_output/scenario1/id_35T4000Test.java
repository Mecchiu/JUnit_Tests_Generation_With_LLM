// MaxElementTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

	@Test
	void testMaxElement_1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5);
		assertEquals(5, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_2() {
		List<Integer> l = List.of(5, 4, 3, 2, 1);
		assertEquals(5, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals(10, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_4() {
		List<Integer> l = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(10, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		assertEquals(20, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_6() {
		List<Integer> l = List.of(20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(20, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
		assertEquals(30, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_8() {
		List<Integer> l = List.of(30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(30, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		assertEquals(40, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement_10() {
		List<Integer> l = List.of(40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(40, MaxElement.maxElement(l));
	}
}