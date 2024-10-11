# id_103_Test.java
from original.id_103 import rounded_avg

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`original.id_103.rounded_avg`.
    """


    def test_rounded_avg_1(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 5) == "0b11"

    def test_rounded_avg_2(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(7, 5) == -1

    def test_rounded_avg_3(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(10, 20) == "0b1111"

    def test_rounded_avg_4(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(20, 33) == "0b11010"

    def test_rounded_avg_5(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 1) == "0b1"

    def test_rounded_avg_6(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 2) == "0b10"

    def test_rounded_avg_7(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 3) == "0b10"

    def test_rounded_avg_8(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 4) == "0b11"

    def test_rounded_avg_9(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 5) == "0b11"

    def test_rounded_avg_10(self):
        """
        Test case for the function :func:`original.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 6) == "0b11"


# id_104.py

def is_palindrome(n):
    """You are given a positive integer n.
    Return True if n is a palindrome, and False otherwise.
    Example:
    is_palindrome(1) => True
    is_palindrome(42) => False
    is_palindrome(100001) => True
    is_palindrome(999) => True
    is_palindrome(123) => False
    """

    return str(n) == str(n)[::-1]


# id_104_Test.java
from original.id_104 import is_palindrome

import pytest

class id_104_Test:
    """
    Test class of id_104.py.
    It contains ten unit test cases for the :func:`original.id_104.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(42) == False

    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(100001) == True

    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(999) == True

    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(123) == False

    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(1221) == True

    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(123321) == True

    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(1234321) == True

    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(123454321) == True

    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome(123456789) == False


# id_105.py

def is_prime(n):
    """You are given a positive integer n.
    Return True if n is a prime number, and False otherwise.
    Example:
    is_prime(1) => False
    is_prime(2) => True
    is_prime(8) => False
    is_prime(11) => True
    is_prime(-10) => False
    """

    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


# id_105_Test.java
from original.id_105 import is_prime

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`original.id_105.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_2(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_3(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_4(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_5(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(-10) == False

    def test_is_prime_6(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_7(self):
        """
        Test case for the function :func:`original.id_105.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_8(self):
        """
        Test case for the function :func:`original.id_105