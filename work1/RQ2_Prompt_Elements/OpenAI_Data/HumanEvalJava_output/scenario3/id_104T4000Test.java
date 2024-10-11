// UniqueDigitsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

	@Test
	void testUniqueDigits() {
		List<Integer> x = List.of(15, 33, 1422, 1);
		List<Integer> expected = List.of(1, 15, 33);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits2() {
		List<Integer> x = List.of(152, 323, 1422, 10);
		List<Integer> expected = List.of();
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits3() {
		List<Integer> x = List.of(12345, 2033, 111, 151);
		List<Integer> expected = List.of(111, 151);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits4() {
		List<Integer> x = List.of(135, 103, 31);
		List<Integer> expected = List.of(31, 135);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits5() {
		List<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> expected = List.of(1, 3, 5, 7, 9);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits6() {
		List<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits7() {
		List<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits8() {
		List<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50);
		List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits9() {
		List<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60);
		List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void testUniqueDigits10() {
		List<Integer> x = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70);
		List<Integer> expected = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69);
		List<Integer> actual = UniqueDigits.uniqueDigits(x);
		assertEquals(expected, actual);
	}
}