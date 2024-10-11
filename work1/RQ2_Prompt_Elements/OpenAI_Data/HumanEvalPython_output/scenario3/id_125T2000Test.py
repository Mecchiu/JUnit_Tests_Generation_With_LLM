# id_125_Test.java
from scenario3.id_125 import split_words

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`scenario3.id_125.split_words`.
    """


    def test_split_words_1(self):
        """
        Test case 1 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("Hello world!") == ["Hello", "world!"]
		
    def test_split_words_2(self):
        """
        Test case 2 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("Hello,world!") == ["Hello", "world!"]
		
    def test_split_words_3(self):
        """
        Test case 3 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdef") == 3
		
    def test_split_words_4(self):
        """
        Test case 4 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz") == 13
		
    def test_split_words_5(self):
        """
        Test case 5 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_6(self):
        """
        Test case 6 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_7(self):
        """
        Test case 7 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_8(self):
        """
        Test case 8 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_9(self):
        """
        Test case 9 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_10(self):
        """
        Test case 10 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
# id_126.py

def is_palindrome(txt):
    '''
    Given a string, return True if it is a palindrome, False otherwise.
    A palindrome is a string that reads the same forwards and backwards.
    Examples
    is_palindrome("racecar") ➞ True
    is_palindrome("stars") ➞ False
    is_palindrome("noon") ➞ True
    is_palindrome("horse") ➞ False
    is_palindrome("race CAR") ➞ False
    Notes
    Ignore casing and punctuation.
    '''

    pass
# id_126_Test.java
from scenario3.id_126 import is_palindrome

import pytest

class id_126_Test:
    """
    Test class of id_126.py.
    It contains ten unit test cases for the :func:`scenario3.id_126.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("racecar") == True
		
    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("stars") == False
		
    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("noon") == True
		
    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("horse") == False
		
    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("race CAR") == False
		
    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("racecar")