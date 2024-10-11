// EvenOddPalindromeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains one unit test case for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
EvenOddPalindromeTest() {
	}
	
	@Test
    void evenOddPalindromeTest() {

        // Given:
        int test = 3;
        // When:
        List<Integer> tests = evenOddPalindrome.evenOddPalindrome(test);

	    // Then:
	    assertEquals(5, tests.size());
        assertEquals(new Integer(4), tests.get(0));
        assertEquals(new Integer(1), tests.get(1));
        assertEquals(new Integer(2), tests.get(2));
        assertEquals(new Integer(3), tests.get(3));
    }
}

/**
 * Class that implements unit test for the {@link EvenOddPalindromeTest}.
 * It contains one unit test {@link EvenOddPalindromeTest} for every test case in the tests package.
 */
class EvenOddPalindromeTest2 {
		EvenOddPalindromeTest2() {
	}
	
	@Test
    void evenOddPalindromeTest2() {

		// Given:
		int test = 3;
		// 
		// When:
		List<Integer> tests = evenOddPalindrome.evenOddPalindrome(test);

	    // Then:
	    assertEquals(4, tests.size());
        assertEquals(new Integer(6), tests.get(3));
        assertEquals(new Integer(4), tests.get(2));
        assertEquals(new Integer(5), tests.get(1));
        assertEquals(new Integer(2), tests.get(0));
    }

}

/**
 * Example {@link EvenOddPalindrome} implementation.
 */
class EvenOddPalindromeTest3 {
	EvenOddPalindromeTest3() {
	}

	@Test
    void evenOddPalindromeTest3() {

		// Given:
		int test = 3;
		List<Integer> tests = evenOddPalindrome.evenOddPalindrome(test);
	    // When:
	    // Then:
	    assertEquals(3, tests.size());
    }

}