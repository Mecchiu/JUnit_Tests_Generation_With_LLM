// EvenOddPalindromeTest.java
package scenario1;

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
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(11));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(12));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(13));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(14));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(15));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(16));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(17));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(18));
		
		expected.clear();
		expected.add(2);
		expected.add(2);
		assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(19));
	}
}