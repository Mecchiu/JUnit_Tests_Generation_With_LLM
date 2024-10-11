```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddPalindromeTest {

    @Test
    void testEvenOddPalindrome_123() {
        List<Integer> expected = new ArrayList<>();
        expected.add(8);
        expected.add(13);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(123));
    }

    @Test
    void testEvenOddPalindrome_12() {
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(12));
    }

    @Test
    void testEvenOddPalindrome_3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
    }

    @Test
    void testEvenOddPalindrome_63() {
        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(8);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(63));
    }

    @Test
    void testEvenOddPalindrome_25() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(25));
    }

    @Test
    void testEvenOddPalindrome_19() {
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(19));
    }

    @Test
    void testEvenOddPalindrome_9() {
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(5);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
    }

    @Test
    void testEvenOddPalindrome_1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
    }
}
```
