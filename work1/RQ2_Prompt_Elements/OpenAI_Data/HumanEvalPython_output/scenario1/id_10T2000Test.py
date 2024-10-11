# id_10_Test.java
from scenario1.id_10 import make_palindrome

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario1.id_10.make_palindrome`.
    """


    def test_make_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('') == ''

    def test_make_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('a') == 'a'

    def test_make_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ab') == 'aba'

    def test_make_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('aba') == 'aba'

    def test_make_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abab') == 'ababa'

    def test_make_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ababa') == 'ababa'

    def test_make_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ababab') == 'abababa'

    def test_make_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abababa') == 'abababa'

    def test_make_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abababab') == 'ababababa'

    def test_make_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ababababa') == 'ababababa'

# id_10_Test.py
from scenario1.id_10 import make_palindrome

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario1.id_10.make_palindrome`.
    """
		
    def test_make_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('') == ''

    def test_make_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('a') == 'a'

    def test_make_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ab') == 'aba'

    def test_make_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('aba') == 'aba'

    def test_make_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abab') == 'ababa'

    def test_make_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ababa') == 'ababa'

    def test_make_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ababab') == 'abababa'

    def test_make_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abababa') == 'abababa'

    def test_make_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abababab') == 'ababababa'

    def test_make_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ababababa') == 'ababababa'

# id_11.java

package scenario1;

import java.util.ArrayList;
import java.util.List;

public class id_11 {

    public static List<Integer> get_primes(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (is_prime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean is_prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}

# id_11.py


def get_primes(n: int) -> list:
    primes = []

    for i in range(2, n + 1):
        if is_prime(i):
            primes.append(i)

    return primes


def is_prime(n: int) -> bool:
    for i in range(2, n):
        if n % i == 0:
            return False

    return True

# id_11_Test.java
from scenario1.id_11 import get_primes

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`scenario1.id_11.get_primes`.
    """
		
    def test_get_primes_1(self):
        """
        Test case for the :func:`scenario1.id_11.get_primes` function.
        """
        assert get_primes(1) == []

    def test_get_primes_2(self):
        """
        Test case for the :func:`scenario1.id_11.get_primes` function.
        """
        assert get_primes(2) == [2]

    def test_get_primes_3(self):
        """
        Test case for the :func:`scenario1.id_11.get_primes` function.
        """
        assert get_primes(3) == [2, 3]

    def test_get_primes_4(self):
        """
        Test case for the :func:`scenario1.id_11.get_primes` function.
        """
        assert get_primes(4) == [2, 3]

    def test_get_primes_5(self):
       