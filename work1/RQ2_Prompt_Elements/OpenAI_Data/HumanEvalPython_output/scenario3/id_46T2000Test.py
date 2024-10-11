# id_46_Test.java
from scenario3.id_46 import fib4

import pytest

class id_46_Test:
    """
    Test class of id_46.py.
    It contains ten unit test cases for the :func:`scenario3.id_46.fib4`.
    """


    def test_fib4_1(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(5) == 4
		
    def test_fib4_2(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(6) == 8
		
    def test_fib4_3(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(7) == 14
		
    def test_fib4_4(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(8) == 26
		
    def test_fib4_5(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(9) == 48
		
    def test_fib4_6(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(10) == 88
		
    def test_fib4_7(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(11) == 162
		
    def test_fib4_8(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(12) == 296
		
    def test_fib4_9(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(13) == 544
		
    def test_fib4_10(self):
        """
        Test case for the :func:`scenario3.id_46.fib4`.
        """
        assert fib4(14) == 1000
		
		
# id_47.py


def is_palindrome(s: str):
    """
    Given a string, return True if the string is a palindrome or False if it is not.
    Palindromes are strings that form the same word if it is reversed.
    Include spaces and punctuation in determining if the string is a palindrome.
    >>> is_palindrome("racecar")
    True
    >>> is_palindrome("race car")
    True
    >>> is_palindrome("racecars")
    False
    """

    pass

# id_47_Test.java
from scenario3.id_47 import is_palindrome

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It contains ten unit test cases for the :func:`scenario3.id_47.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("racecar") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("race car") == True
		
    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("racecars") == False
		
    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("race car") == True
		
    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("racecars") == False
		
    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("race car") == True
		
    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("racecars") == False
		
    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("race car") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("racecars") == False
		
    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario3.id_47.is_palindrome`.
        """
        assert is_palindrome("race car") == True
		
		
# id_48.py


def is_anagram(s1: str, s2: str):
    """
    Given two strings, return True if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: s.lower() returns the lowercase version of a string.
    >>> is_anagram("foefet", "toffee")
    True
    >>> is_anagram("Buckethead", "DeathCubeK")
    True
    >>> is_anagram("Twoo", "WooT")
    True
    """

    pass

# id_48_Test.java
from scenario3.id_48 import is_anagram

import pytest

class id_48_Test:
    """
    Test class of id_48.py.
    It contains ten unit test cases for the :func:`scenario3.id_48.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the :func:`scenario3.id_48.is_anagram`.
        """
        assert is_anagram("foefet", "toffee") == True
		
    def test_is_anagram_2(self):
        """
        Test case for the :func:`scenario3.id_48.is_anagram`.
        """
        assert is_anagram("Buckethead", "DeathCubeK") == True
		
    def test_is_anagram_3(self):
        """
        Test case for the :func:`scenario3.id_48.is_anagram`.
        """
        assert is_anagram("Twoo", "WooT") == True
		
    def test_is_anagram_4(self):
        """
        Test case for the :func:`scenario3.id_48.is_anagram`.
        """
        assert is_anagram("dumble", "bumble") == False
		
    def test_is_anagram_5(self):
        """
        Test case for the :func:`scenario3.id_48.is_anagram`.
        """
        assert is_anagram("ound", "round") == False
		
    def test_is_anagram_6(self):
        """
        Test case for the :func:`scenario3.id_48.is_anagram`.
        """
        assert is_anagram("apple", "pale") == False