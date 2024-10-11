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


# id_103_Test.py
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

def is_palindrome(s):
    """You are given a string s.
    Return True if s is a palindrome, and False otherwise.
    Example:
    is_palindrome("racecar") => True
    is_palindrome("rabbit") => False
    """

    return s == s[::-1]


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
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("rabbit") == False

    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("abcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("abccba") == True


# id_104_Test.py
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
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("rabbit") == False

    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("abcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_104.is_palindrome`.
        """
        assert is_palindrome("abccba") == True


# id_105.py

def is_anagram(s1, s2):
    """You are given two strings s1 and s2.
    Return True if s1 and s2 are anagrams, and False otherwise.
    Example:
    is_anagram("listen", "silent") => True
    is_anagram("listen", "silent") => True
    """

    return sorted(s1) == sorted(s2)


# id_105_Test.java
from original.id_105 import is_anagram

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`original.id_105.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("listen", "silent") == True

    def test_is_anagram_2(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("listen", "silent") == True

    def test_is_anagram_3(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("", "") == True

    def test_is_anagram_4(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("a", "a") == True

    def test_is_anagram_5(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ab") == True

    def test_is_anagram_6(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True

    def test_is_anagram_7(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("ab", "bc") == False

    def test_is_anagram_8(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("abc", "bca") == True

    def test_is_anagram_9(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("abc", "cba") == True

    def test_is_anagram_10(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("abc", "cab") == True


# id_105_Test.py
from original.id_105 import is_anagram

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`original.id_105.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("listen", "silent") == True

    def test_is_anagram_2(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("listen", "silent") == True

    def test_is_anagram_3(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("", "") == True

    def test_is_anagram_4(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("a", "a") == True

    def test_is_anagram_5(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ab") == True

    def test_is_anagram_6(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True

    def test_is_anagram_7(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("ab", "bc") == False

    def test_is_anagram_8(self):
        """
        Test case for the function :func:`original.id_105.is_anagram`.
        """
        assert is_anagram("abc", "bca") == True

    def test_is_anagram_9(self):
       