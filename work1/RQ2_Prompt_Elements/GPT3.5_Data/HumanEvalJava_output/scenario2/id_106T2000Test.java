// F.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class F {

    /**
     * Implement the function f that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     */
    public static List<Integer> f(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(factorial(i));
            } else {
                result.add(sum(i));
            }
        }
        return result;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

// FTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

    @Test
    void testFWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = F.f(0);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = F.f(1);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        List<Integer> actual = F.f(2);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        List<Integer> actual = F.f(3);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        List<Integer> actual = F.f(4);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(10);
        expected.add(5);
        List<Integer> actual = F.f(5);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(15);
        expected.add(6);
        List<Integer> actual = F.f(6);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithSeven() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(10);
        expected.add(5);
        expected.add(42);
        expected.add(7);
        List<Integer> actual = F.f(7);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(15);
        expected.add(6);
        expected.add(56);
        expected.add(8);
        List<Integer> actual = F.f(8);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithNine() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(10);
        expected.add(5);
        expected.add(42);
        expected.add(7);
        expected.add(144);
        expected.add(9);
        List<Integer> actual = F.f(9);
        assertEquals(expected, actual);
    }

    @Test
    void testFWithTen() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(15);
        expected.add(6);
        expected.add(56);
        expected.add(8);
        expected.add(362);
        expected.add(10);
        List<Integer> actual = F.f(10);
        assertEquals(expected, actual);
    }
}