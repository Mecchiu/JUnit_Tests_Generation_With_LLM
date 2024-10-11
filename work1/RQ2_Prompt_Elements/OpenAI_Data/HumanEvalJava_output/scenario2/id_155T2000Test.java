// EvenOddCountTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
	// Test case 1: Test with positive number
    @Test
    void testEvenOddCount1() {
        List<Integer> expected = Arrays.asList(2, 2);
        List<Integer> actual = EvenOddCount.evenOddCount(2468);
        assertEquals(expected, actual);
    }

    // Test case 2: Test with negative number
    @Test
    void testEvenOddCount2() {
        List<Integer> expected = Arrays.asList(2, 2);
        List<Integer> actual = EvenOddCount.evenOddCount(-2468);
        assertEquals(expected, actual);
    }

    // Test case 3: Test with zero
    @Test
    void testEvenOddCount3() {
        List<Integer> expected = Arrays.asList(1, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(0);
        assertEquals(expected, actual);
    }

    // Test case 4: Test with single digit number
    @Test
    void testEvenOddCount4() {
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(7);
        assertEquals(expected, actual);
    }

    // Test case 5: Test with large number
    @Test
    void testEvenOddCount5() {
        List<Integer> expected = Arrays.asList(5, 5);
        List<Integer> actual = EvenOddCount.evenOddCount(1234567890);
        assertEquals(expected, actual);
    }

    // Test case 6: Test with negative single digit number
    @Test
    void testEvenOddCount6() {
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> actual = EvenOddCount.evenOddCount(-7);
        assertEquals(expected, actual);
    }

    // Test case 7: Test with negative large number
    @Test
    void testEvenOddCount7() {
        List<Integer> expected = Arrays.asList(5, 5);
        List<Integer> actual = EvenOddCount.evenOddCount(-1234567890);
        assertEquals(expected, actual);
    }

    // Test case 8: Test with positive number having all even digits
    @Test
    void testEvenOddCount8() {
        List<Integer> expected = Arrays.asList(4, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(2468);
        assertEquals(expected, actual);
    }

    // Test case 9: Test with positive number having all odd digits
    @Test
    void testEvenOddCount9() {
        List<Integer> expected = Arrays.asList(0, 4);
        List<Integer> actual = EvenOddCount.evenOddCount(1357);
        assertEquals(expected, actual);
    }

    // Test case 10: Test with negative number having all even digits
    @Test
    void testEvenOddCount10() {
        List<Integer> expected = Arrays.asList(4, 0);
        List<Integer> actual = EvenOddCount.evenOddCount(-2468);
        assertEquals(expected, actual);
    }
}
