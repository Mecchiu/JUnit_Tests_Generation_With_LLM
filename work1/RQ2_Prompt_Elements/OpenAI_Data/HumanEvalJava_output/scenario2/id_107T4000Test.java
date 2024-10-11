// EvenOddPalindromeTest.java
package scenario2;

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
		expected.add(1);
		expected.add(1);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(2));
		
		expected.clear();
		expected.add(1);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
		
		expected.clear();
		expected.add(1);
		expected.add(3);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(4));
		
		expected.clear();
		expected.add(1);
		expected.add(4);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(5));
		
		expected.clear();
		expected.add(1);
		expected.add(5);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(6));
		
		expected.clear();
		expected.add(1);
		expected.add(6);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(7));
		
		expected.clear();
		expected.add(1);
		expected.add(7);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(8));
		
		expected.clear();
		expected.add(1);
		expected.add(8);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
		
		expected.clear();
		expected.add(1);
		expected.add(9);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
		
		expected.clear();
		expected.add(1);
		expected.add(10);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(11));
	}
}