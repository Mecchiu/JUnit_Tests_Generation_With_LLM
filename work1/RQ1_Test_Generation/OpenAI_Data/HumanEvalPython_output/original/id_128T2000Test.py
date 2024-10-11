# id_128_Test.java
from original.id_128 import prod_signs

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`original.id_128.prod_signs`.
    """


    def test_prod_signs_1(self):
        """
        Test case 1 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 2, -4]) == -9

    def test_prod_signs_2(self):
        """
        Test case 2 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([0, 1]) == 0

    def test_prod_signs_3(self):
        """
        Test case 3 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([]) == None

    def test_prod_signs_4(self):
        """
        Test case 4 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4]) == -24

    def test_prod_signs_5(self):
        """
        Test case 5 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4]) == 24

    def test_prod_signs_6(self):
        """
        Test case 6 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, 4]) == -24

    def test_prod_signs_7(self):
        """
        Test case 7 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, -4]) == -24

    def test_prod_signs_8(self):
        """
        Test case 8 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([-1, 2, 3, -4]) == -24

    def test_prod_signs_9(self):
        """
        Test case 9 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, -2, 3, -4]) == -24

    def test_prod_signs_10(self):
        """
        Test case 10 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, -3, -4]) == -24

# id_128_Test.py
from original.id_128 import prod_signs

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`original.id_128.prod_signs`.
    """
		
    def test_prod_signs_1(self):
        """
        Test case 1 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 2, -4]) == -9

    def test_prod_signs_2(self):
        """
        Test case 2 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([0, 1]) == 0

    def test_prod_signs_3(self):
        """
        Test case 3 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([]) == None

    def test_prod_signs_4(self):
        """
        Test case 4 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4]) == -24

    def test_prod_signs_5(self):
        """
        Test case 5 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4]) == 24

    def test_prod_signs_6(self):
        """
        Test case 6 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, 4]) == -24

    def test_prod_signs_7(self):
        """
        Test case 7 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, -4]) == -24

    def test_prod_signs_8(self):
        """
        Test case 8 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([-1, 2, 3, -4]) == -24

    def test_prod_signs_9(self):
        """
        Test case 9 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, -2, 3, -4]) == -24

    def test_prod_signs_10(self):
        """
        Test case 10 for :func:`original.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, -3, -4]) == -24

# id_129.py

def is_palindrome(s):
    """
    You are given a string s.
    Return True if s is a palindrome, False otherwise.

    Example:
    >>> is_palindrome("abba") == True
    >>> is_palindrome("abc") == False
    """

    return s == s[::-1]

# id_129_Test.java
from original.id_129 import is_palindrome

import pytest

class id_129_Test:
    """
    Test class of id_129.py.
    It contains ten unit test cases for the :func:`original.id_129.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("abc") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("abab") == False

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`original.id_129.is_palindrome`.
        """
        assert is_palindrome("ababa")