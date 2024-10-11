# id_39_Test.java
from scenario1.id_39 import prime_fib

import pytest

class id_39_Test:
    """
    Test class of id_39.py.
    It contains ten unit test cases for the :func:`scenario1.id_39.prime_fib`.
    """


    def test_prime_fib_1(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(1) == 2
		
    def test_prime_fib_2(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(2) == 3
		
    def test_prime_fib_3(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(3) == 5
		
    def test_prime_fib_4(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(4) == 13
		
    def test_prime_fib_5(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(5) == 89
		
    def test_prime_fib_6(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(6) == 233
		
    def test_prime_fib_7(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(7) == 1597
		
    def test_prime_fib_8(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(8) == 28657
		
    def test_prime_fib_9(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(9) == 514229
		
    def test_prime_fib_10(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(10) == 433494437
		
		
# id_40.py


def is_palindrome(s: str):

    return s == s[::-1]

# id_40_Test.java
from scenario1.id_40 import is_palindrome

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`scenario1.id_40.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("a") == True
		
    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("aa") == True
		
    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("ab") == False
		
    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("aba") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abba") == True
		
    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abcba") == True
		
    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abccba") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abcddcba") == True
		
    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abcdedcba") == True
		
		
# id_41.py


def is_pandigital(n: int):

    s = str(n)
    return len(s) == 9 and set(s) == set("123456789")

# id_41_Test.java
from scenario1.id_41 import is_pandigital

import pytest

class id_41_Test:
    """
    Test class of id_41.py.
    It contains ten unit test cases for the :func:`scenario1.id_41.is_pandigital`.
    """
		
    def test_is_pandigital_1(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(123456789) == True
		
    def test_is_pandigital_2(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(123456780) == False
		
    def test_is_pandigital_3(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(12345678) == False
		
    def test_is_pandigital_4(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(1234567) == False
		
    def test_is_pandigital_5(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(123456) == False
		
    def test_is_pandigital_6(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(12345) == False
		
    def test_is_pandigital_7(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(1234) == False
		
    def test_is_pandigital_8(self):
        """
        Test case for the :func:`scenario1.id_41.is_pandigital`.
        """
        assert is_pandigital(123) == False
		
    def test_is_p