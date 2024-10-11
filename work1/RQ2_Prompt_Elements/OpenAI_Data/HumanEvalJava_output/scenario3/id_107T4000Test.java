// EvenOddPalindromeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {

	@Test
	void testEvenOddPalindrome_1() {
		List<Integer> expected = List.of(8, 13);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(123);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_2() {
		List<Integer> expected = List.of(4, 6);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(12);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_3() {
		List<Integer> expected = List.of(1, 2);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_4() {
		List<Integer> expected = List.of(6, 8);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(63);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_5() {
		List<Integer> expected = List.of(5, 6);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(25);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_6() {
		List<Integer> expected = List.of(4, 6);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(19);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_7() {
		List<Integer> expected = List.of(4, 5);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(9);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_8() {
		List<Integer> expected = List.of(0, 1);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_9() {
		List<Integer> expected = List.of(0, 1);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddPalindrome_10() {
		List<Integer> expected = List.of(0, 1);
		List<Integer> actual = EvenOddPalindrome.evenOddPalindrome(4);
		assertEquals(expected, actual);
	}
}