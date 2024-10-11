// Skjkasdkd.java
package scenario3;

import java.util.List;

class Skjkasdkd {

    /**
     * You are given a list of integers.
     * You need to find the largest prime value and return the sum of its digits.
     *
     * Examples:
     * For lst = [0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3] the output should be 10
     * For lst = [1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1] the output should be 25
     * For lst = [1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3] the output should be 13
     * For lst = [0,724,32,71,99,32,6,0,5,91,83,0,5,6] the output should be 11
     * For lst = [0,81,12,3,1,21] the output should be 3
     * For lst = [0,8,1,2,1,7] the output should be 7
     *
     * > skjkasdkd([0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3])
     * 10
     * > skjkasdkd([1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1])
     * 25
     * > skjkasdkd([1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3])
     * 13
     * > skjkasdkd([0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6])
     * 11
     * > skjkasdkd([0, 81, 12, 3, 1, 21])
     * 3
     * > skjkasdkd([0, 8, 1, 2, 1, 7])
     * 7
     * > skjkasdkd([8191])
     * 19
     * > skjkasdkd([8191, 123456, 127, 7])
     * 19
     * > skjkasdkd([127, 97, 8192])
     * 10
     */
    public static int skjkasdkd(List<Integer> lst) {
        int maxPrime = -1;
        for (int num : lst) {
            if (isPrime(num) && num > maxPrime) {
                maxPrime = num;
            }
        }
        if (maxPrime == -1) {
            return 0;
        }
        return sumOfDigits(maxPrime);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

// SkjkasdkdTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains ten unit test cases for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {

    @Test
    void test1() {
        List<Integer> lst = Arrays.asList(0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3);
        int expected = 10;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        List<Integer> lst = Arrays.asList(1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1);
        int expected = 25;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        List<Integer> lst = Arrays.asList(1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3);
        int expected = 13;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        List<Integer> lst = Arrays.asList(0,724,32,71,99,32,6,0,5,91,83,0,5,6);
        int expected = 11;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        List<Integer> lst = Arrays.asList(0,81,12,3,1,21);
        int expected = 3;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test6() {
        List<Integer> lst = Arrays.asList(0,8,1,2,1,7);
        int expected = 7;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test7() {
        List<Integer> lst = Arrays.asList(8191);
        int expected = 19;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test8() {
        List<Integer> lst = Arrays.asList(8191, 123456, 127, 7);
        int expected = 19;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test9() {
        List<Integer> lst = Arrays.asList(127, 97, 8192);
        int expected = 10;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void test10() {
        List<Integer> lst = Arrays.asList(4, 6, 8, 9, 10);
        int expected = 0;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
}