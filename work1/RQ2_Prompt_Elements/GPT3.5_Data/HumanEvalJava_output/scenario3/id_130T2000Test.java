// Tri.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Tri {

    /**
     * Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in
     * the last couple centuries. However, what people don't know is Tribonacci sequence.
     * Tribonacci sequence is defined by the recurrence:
     * tri(1) = 3
     * tri(n) = 1 + n / 2, if n is even.
     * tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
     * For example:
     * tri(2) = 1 + (2 / 2) = 2
     * tri(4) = 3
     * tri(3) = tri(2) + tri(1) + tri(4)
     * = 2 + 3 + 3 = 8
     * You are given a non-negative integer number n, you have to a return a list of the
     * first n + 1 numbers of the Tribonacci sequence.
     * Examples:
     * tri(3) = [1, 3, 2, 8]
     *
     * > tri(3)
     * [1, 3, 2.0, 8.0]
     * > tri(4)
     * [1, 3, 2.0, 8.0, 3.0]
     * > tri(5)
     * [1, 3, 2.0, 8.0, 3.0, 15.0]
     * > tri(6)
     * [1, 3, 2.0, 8.0, 3.0, 15.0, 4.0]
     * > tri(7)
     * [1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0]
     * > tri(8)
     * [1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0]
     * > tri(9)
     * [1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0]
     * > tri(20)
     * [1, 3, 2.0, 8.0, 3.0, 15.0, 4.0, 24.0, 5.0, 35.0, 6.0, 48.0, 7.0, 63.0, 8.0, 80.0, 9.0, 99.0, 10.0, 120.0, 11.0]
     * > tri(0)
     * [1]
     * > tri(1)
     * [1, 3]
     */
    public static List<Number> tri(int n) {
        List<Number> result = new ArrayList<>();
        if (n >= 0) {
            result.add(1);
            if (n > 0) {
                result.add(3);
                for (int i = 2; i <= n; i++) {
                    if (i % 2 == 0) {
                        result.add(1 + i / 2);
                    } else {
                        result.add(result.get(i - 1).intValue() + result.get(i - 2).intValue() + result.get(i + 1).intValue());
                    }
                }
            }
        }
        return result;
    }
}

// TriTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {
    @Test
    void testTriWithNegativeInput() {
        List<Number> result = Tri.tri(-1);
        assertTrue(result.isEmpty());
    }

    @Test
    void testTriWithZeroInput() {
        List<Number> result = Tri.tri(0);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).intValue());
    }

    @Test
    void testTriWithOneInput() {
        List<Number> result = Tri.tri(1);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
    }

    @Test
    void testTriWithTwoInput() {
        List<Number> result = Tri.tri(2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
    }

    @Test
    void testTriWithThreeInput() {
        List<Number> result = Tri.tri(3);
        assertEquals(4, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
    }

    @Test
    void testTriWithFourInput() {
        List<Number> result = Tri.tri(4);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
        assertEquals(3, result.get(4).intValue());
    }

    @Test
    void testTriWithFiveInput() {
        List<Number> result = Tri.tri(5);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
        assertEquals(3, result.get(4).intValue());
        assertEquals(15, result.get(5).intValue());
    }

    @Test
    void testTriWithSixInput() {
        List<Number> result = Tri.tri(6);
        assertEquals(7, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
        assertEquals(3, result.get(4).intValue());
        assertEquals(15, result.get(5).intValue());
        assertEquals(4, result.get(6).intValue());
    }

    @Test
    void testTriWithSevenInput() {
        List<Number> result = Tri.tri(7);
        assertEquals(8, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
        assertEquals(3, result.get(4).intValue());
        assertEquals(15, result.get(5).intValue());
        assertEquals(4, result.get(6).intValue());
        assertEquals(24, result.get(7).intValue());
    }

    @Test
    void testTriWithEightInput() {
        List<Number> result = Tri.tri(8);
        assertEquals(9, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
        assertEquals(3, result.get(4).intValue());
        assertEquals(15, result.get(5).intValue());
        assertEquals(4, result.get(6).intValue());
        assertEquals(24, result.get(7).intValue());
        assertEquals(5, result.get(8).intValue());
    }

    @Test
    void testTriWithTwentyInput() {
        List<Number> result = Tri.tri(20);
        assertEquals(21, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
        assertEquals(8, result.get(3).intValue());
        assertEquals(3, result.get(4).intValue());
        assertEquals(15, result.get(5).intValue());
        assertEquals(4, result.get(6).intValue());
        assertEquals(24, result.get(7).intValue());
        assertEquals(5, result.get(8).intValue());
        assertEquals(35, result.get(9).intValue());
        assertEquals(6, result.get(10).intValue());
        assertEquals(48, result.get(11).intValue());
        assertEquals(7, result.get(12).intValue());
        assertEquals(63, result.get(13).intValue());
        assertEquals(8, result.get(14).intValue());
        assertEquals(80,