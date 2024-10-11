# id_10_Test.java
from scenario3.id_10 import make_palindrome

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario3.id_10.make_palindrome`.
    """


    def test_make_palindrome_empty_string(self):
        """
        Test case for empty string.
        """
        assert make_palindrome('') == ''

    def test_make_palindrome_single_character_string(self):
        """
        Test case for single character string.
        """
        assert make_palindrome('a') == 'a'

    def test_make_palindrome_two_character_string(self):
        """
        Test case for two character string.
        """
        assert make_palindrome('ab') == 'aba'

    def test_make_palindrome_three_character_string(self):
        """
        Test case for three character string.
        """
        assert make_palindrome('abc') == 'abcba'

    def test_make_palindrome_four_character_string(self):
        """
        Test case for four character string.
        """
        assert make_palindrome('abcd') == 'abcdcba'

    def test_make_palindrome_five_character_string(self):
        """
        Test case for five character string.
        """
        assert make_palindrome('abcde') == 'abcdedcba'

    def test_make_palindrome_six_character_string(self):
        """
        Test case for six character string.
        """
        assert make_palindrome('abcdef') == 'abcdefedcba'

    def test_make_palindrome_seven_character_string(self):
        """
        Test case for seven character string.
        """
        assert make_palindrome('abcdefg') == 'abcdefggfedcba'

    def test_make_palindrome_eight_character_string(self):
        """
        Test case for eight character string.
        """
        assert make_palindrome('abcdefgh') == 'abcdefghgfedcba'

    def test_make_palindrome_nine_character_string(self):
        """
        Test case for nine character string.
        """
        assert make_palindrome('abcdefghi') == 'abcdefghihgfedcba'

# id_10_Test.py
from scenario3.id_10 import make_palindrome

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario3.id_10.make_palindrome`.
    """
		
    def test_make_palindrome_empty_string(self):
        """
        Test case for empty string.
        """
        assert make_palindrome('') == ''

    def test_make_palindrome_single_character_string(self):
        """
        Test case for single character string.
        """
        assert make_palindrome('a') == 'a'

    def test_make_palindrome_two_character_string(self):
        """
        Test case for two character string.
        """
        assert make_palindrome('ab') == 'aba'

    def test_make_palindrome_three_character_string(self):
        """
        Test case for three character string.
        """
        assert make_palindrome('abc') == 'abcba'

    def test_make_palindrome_four_character_string(self):
        """
        Test case for four character string.
        """
        assert make_palindrome('abcd') == 'abcdcba'

    def test_make_palindrome_five_character_string(self):
        """
        Test case for five character string.
        """
        assert make_palindrome('abcde') == 'abcdedcba'

    def test_make_palindrome_six_character_string(self):
        """
        Test case for six character string.
        """
        assert make_palindrome('abcdef') == 'abcdefedcba'

    def test_make_palindrome_seven_character_string(self):
        """
        Test case for seven character string.
        """
        assert make_palindrome('abcdefg') == 'abcdefggfedcba'

    def test_make_palindrome_eight_character_string(self):
        """
        Test case for eight character string.
        """
        assert make_palindrome('abcdefgh') == 'abcdefghgfedcba'

    def test_make_palindrome_nine_character_string(self):
        """
        Test case for nine character string.
        """
        assert make_palindrome('abcdefghi') == 'abcdefghihgfedcba'

# id_11.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that contains a method that returns a list of all the prime numbers
 * that are less than or equal to a supplied number.
 *
 * @author aivaras
 */
public class id_11 {

    /**
     * Returns a list of all the prime numbers that are less than or equal to a
     * supplied number.
     *
     * @param n the number to which prime numbers are searched
     * @return a list of all the prime numbers that are less than or equal to a
     * supplied number
     */
    public static List<Integer> getPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * Tests if a number is prime.
     *
     * @param n the number to be tested
     * @return true if the number is prime, false otherwise
     */
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
# id_11.py


def get_primes(n: int) -> list:
    """ Returns a list of all the prime numbers that are less than or equal to a supplied number. """
    primes = []
    for i in range(2, n + 1):
        if is_prime(i):
            primes.append(i)
    return primes


def is_prime(n: int) -> bool:
    """ Tests if a number is prime. """
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
# id_11_Test.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class of id_11.java.
 * It contains ten unit test cases for the :func:`scenario3.id_11.getPrimes`.
 *
 * @author aivaras
 */
public class id_11_Test {

    /**
     * Test case for zero.
     */
    @Test
    public void test_getPrimes_zero() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = id_11.getPrimes(0);
        assertEquals(expected, actual);
    }

    /**
     * Test case for one.
     */
    @Test
    public void test_getPrimes_one() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = id_11.getPrimes(1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for two.
     */
    @Test
    public void test_getPrimes_two() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = id_11.getPrimes(2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for three.
     */
    @Test
    public void test_getPrimes_three() {
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = id_11.getPrimes(3);
        assertEquals(expected, actual);
    }

    /**
     * Test case for four.
     */
    @Test
    public void test_getPrimes_four() {
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = id_11.getPrimes(4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for five.
     */
    @Test
    public void test_getPrimes_five() {
        List<Integer> expected = Arrays.asList(2, 3, 5);
        List<Integer> actual = id_11.getPrimes(5);
        assertEquals(expected, actual);
    }

    /**
     * Test case for six.
     */
    @Test
    public void test_getPrimes_six() {
        List<Integer> expected = Arrays.asList(2, 3, 5);
        List<Integer> actual = id_11.getPrimes(6);
        assertEquals(expected, actual);
    }

    /**
     * Test case for seven.
     */
    @Test
    public void test_getPrimes_seven() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        List<Integer> actual = id_11.getPrimes(7);
        assertEquals(expected, actual);
    }

    /**
     * Test case for eight.
     */
    @Test
    public void test_getPrimes_eight() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        List<Integer> actual = id_11.getPrimes(8);
        assertEquals(expected, actual);
    }

    /**
     * Test case for nine.
     */
    @Test
    public void test_getPrimes_nine() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        List<Integer> actual = id_11.getPrimes(9);
        assertEquals(expected, actual);
    }
}
# id_11_Test.py
from scenario3.id_11 import get_primes

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`scenario3.id_11.get_primes`.
    """
		
    def test_get_primes_zero(self):
        """
        Test case for zero.
        """
        assert get_primes(0) == []

    def test_get_primes_one(self):
        """
        Test case for one.
        """
        assert get_primes(1) == []

    def test_get_primes_two(self):
        """
        Test case for two.
        """
        assert get_primes(2) == [2]

    def test_get_primes_three(self):
        """
        Test case for three.
        """
        assert get_primes(3) == [2, 3]

    def test_get_primes_four(self):
        """
        Test case for four.
        """
        assert get_primes(4) == [2, 3]

    def test_get_primes_five(self):
        """
        Test case for five.
        """
        assert get_primes(5) == [2, 3, 5]

    def test_get_primes_six(self):
        """
        Test case for six.
        """
        assert get_primes(6) == [2, 3, 5]

    def test_get_primes_seven(self):
        """
        Test case for seven.
        """
        assert get_primes(7) == [2, 3, 5, 7]

    def test_get_primes_eight(self):
        """
        Test case for eight.
        """
        assert get_primes(8) == [2, 3, 5, 7]

    def test_get_primes_nine(self):
        """
        Test case for nine.
        """
        assert get_primes(9) == [2, 3, 5, 7]

# id_12.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that contains a method that returns a list of all the prime numbers
 * that are less than or equal to a supplied number.
 *
 * @author aivaras
 */
public class id_12 {

    /**
     * Returns a list of all the prime numbers that are less than or equal to a
     * supplied number.
     *
     * @param n the number to which prime numbers are searched
     * @return a list of all the prime numbers that are less than or equal to a
     * supplied number
     */
    public static List<Integer> getPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * Tests if a number is prime.
     *
     * @param n the number to be tested
     * @return true if the number is prime, false otherwise
     */
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
# id_12.py


def get_primes(n: int) -> list:
    """ Returns a list of all the prime numbers that are less than or equal to a supplied number. """
    primes = []
    for i in range(2, n + 1):
        if is_prime(i):
            primes.append(i)
    return primes


def is_prime(n: int) -> bool:
    """ Tests if a number is prime. """
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
# id_12_Test.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class of id_12.java.
 * It contains ten unit test cases for the :func:`scenario3.id_12.getPrimes`.
 *
 * @author aivaras
 */
public class id_12_Test {

    /**
     * Test case for zero.
     */
    @Test
    public void test_getPrimes_zero() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = id_12.getPrimes(0);
        assertEquals(expected, actual);
    }

    /**
     * Test case for one.
     */
    @Test
    public void test_getPrimes_one() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = id_12.getPrimes(1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for two.
     */
    @Test
    public void test_getPrimes_two() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = id_12.getPrimes(2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for three.
     */
    @Test
    public void test_getPrimes_three() {
        List<Integer>