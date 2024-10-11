# id_128_Test.java
from scenario2.id_128 import prod_signs

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`scenario2.id_128.prod_signs`.
    """


    def test_prod_signs_1(self):
        """
        Test case 1 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([]) == None

    def test_prod_signs_2(self):
        """
        Test case 2 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3]) == 6

    def test_prod_signs_3(self):
        """
        Test case 3 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3]) == -6

    def test_prod_signs_4(self):
        """
        Test case 4 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([-1, 2, -3]) == -6

    def test_prod_signs_5(self):
        """
        Test case 5 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([1, -2, 3]) == 6

    def test_prod_signs_6(self):
        """
        Test case 6 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, -3]) == -6

    def test_prod_signs_7(self):
        """
        Test case 7 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, 3]) == 6

    def test_prod_signs_8(self):
        """
        Test case 8 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([-1, 2, 3]) == -6

    def test_prod_signs_9(self):
        """
        Test case 9 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([1, -2, -3]) == 6

    def test_prod_signs_10(self):
        """
        Test case 10 for :func:`scenario2.id_128.prod_signs`.
        """
        assert prod_signs([0, 1, 2, 3]) == 6


# id_129.py

def is_palindrome(s):
    """
    You are given a string s.
    Return True if s is a palindrome, False otherwise.
    Note: a palindrome is a string that reads the same from left to right as it does from right to left.
    """

    return s == s[::-1]


# id_129_Test.java
from scenario2.id_129 import is_palindrome

import pytest

class id_129_Test:
    """
    Test class of id_129.py.
    It contains ten unit test cases for the :func:`scenario2.id_129.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("abcd") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("abcba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("abccba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("abcddcba") == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_129.is_palindrome`.
        """
        assert is_palindrome("abcddcb") == False


# id_130.py

def is_palindrome_2(s):
    """
    You are given a string s.
    Return True if s is a palindrome, False otherwise.
    Note: a palindrome is a string that reads the same from left to right as it does from right to left.
    """

    return s == s[::-1]


# id_130_Test.java
from scenario2.id_130 import is_palindrome_2

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario2.id_130.is_palindrome_2`.
    """
		
    def test_is_palindrome_2_1(self):
        """
        Test case 1 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is_palindrome_2("") == True

    def test_is_palindrome_2_2(self):
        """
        Test case 2 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is_palindrome_2("a") == True

    def test_is_palindrome_2_3(self):
        """
        Test case 3 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is_palindrome_2("aa") == True

    def test_is_palindrome_2_4(self):
        """
        Test case 4 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is_palindrome_2("aba") == True

    def test_is_palindrome_2_5(self):
        """
        Test case 5 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is_palindrome_2("abba") == True

    def test_is_palindrome_2_6(self):
        """
        Test case 6 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is_palindrome_2("abcd") == False

    def test_is_palindrome_2_7(self):
        """
        Test case 7 for :func:`scenario2.id_130.is_palindrome_2`.
        """
        assert is