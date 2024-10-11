# id_139_Test.java
from original.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`original.id_139.special_factorial`.
    """


    def test_special_factorial_1(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(1) == 1

    def test_special_factorial_2(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(2) == 2

    def test_special_factorial_3(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(3) == 12

    def test_special_factorial_4(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288

    def test_special_factorial_5(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560

    def test_special_factorial_6(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(6) == 24883200

    def test_special_factorial_7(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(7) == 12541132800

    def test_special_factorial_8(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(8) == 5159780352

    def test_special_factorial_9(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(9) == 180108854112

    def test_special_factorial_10(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(10) == 56693912375296

# id_139_Test.py
from original.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`original.id_139.special_factorial`.
    """
		
    def test_special_factorial_1(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(1) == 1

    def test_special_factorial_2(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(2) == 2

    def test_special_factorial_3(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(3) == 12

    def test_special_factorial_4(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288

    def test_special_factorial_5(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560

    def test_special_factorial_6(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(6) == 24883200

    def test_special_factorial_7(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(7) == 12541132800

    def test_special_factorial_8(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(8) == 5159780352

    def test_special_factorial_9(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(9) == 180108854112

    def test_special_factorial_10(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(10) == 56693912375296

# id_140.py

def is_palindrome(s):
    """A palindrome is a word, phrase, number, or other sequence of characters
    which reads the same backward as forward, such as madam or racecar.

    Write a function that takes a string as input and returns True if the string
    is a palindrome, and False otherwise.

    For example:
    >>> is_palindrome('madam')
    True
    >>> is_palindrome('racecar')
    True
    >>> is_palindrome('hello')
    False
    """

    return s == s[::-1]

# id_140_Test.java
from original.id_140 import is_palindrome

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`original.id_140.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('madam') == True

    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('hello') == False

    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('a') == True

    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('aa') == True

    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('ab') == False

    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('aba') == True

    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('abba') == True

    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome('abcd') == False

    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_