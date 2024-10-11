// EvenOddPalindromeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {

	@Test
	void testEvenOddPalindrome() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(8);
		expected.add(13);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(123));
		
		expected.clear();
		expected.add(4);
		expected.add(6);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(12));
		
		expected.clear();
		expected.add(1);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
		
		expected.clear();
		expected.add(6);
		expected.add(8);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(63));
		
		expected.clear();
		expected.add(5);
		expected.add(6);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(25));
		
		expected.clear();
		expected.add(4);
		expected.add(6);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(19));
		
		expected.clear();
		expected.add(4);
		expected.add(5);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
		
		expected.clear();
		expected.add(0);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
	}
}