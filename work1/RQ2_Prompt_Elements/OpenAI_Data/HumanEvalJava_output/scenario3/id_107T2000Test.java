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
    void evenOddPalindromeTest1() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(123);
        assertEquals(8, result.get(0));
        assertEquals(13, result.get(1));
    }

    @Test
    void evenOddPalindromeTest2() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(12);
        assertEquals(4, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void evenOddPalindromeTest3() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(3);
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void evenOddPalindromeTest4() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(63);
        assertEquals(6, result.get(0));
        assertEquals(8, result.get(1));
    }

    @Test
    void evenOddPalindromeTest5() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(25);
        assertEquals(5, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void evenOddPalindromeTest6() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(19);
        assertEquals(4, result.get(0));
        assertEquals(6, result.get(1));
    }

    @Test
    void evenOddPalindromeTest7() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(9);
        assertEquals(4, result.get(0));
        assertEquals(5, result.get(1));
    }

    @Test
    void evenOddPalindromeTest8() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(1);
        assertEquals(0, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void evenOddPalindromeTest9() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(1000);
        assertEquals(50, result.get(0));
        assertEquals(100, result.get(1));
    }

    @Test
    void evenOddPalindromeTest10() {
        List<Integer> result = EvenOddPalindrome.evenOddPalindrome(100);
        assertEquals(9, result.get(0));
        assertEquals(18, result.get(1));
    }
}
