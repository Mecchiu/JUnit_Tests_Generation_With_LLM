# id_64_Test.java
from original.id_64 import vowels_count

import pytest

class id_64_Test:
    """
    Test class of id_64.py.
    It contains ten unit test cases for the :func:`original.id_64.vowels_count`.
    """


    def test_vowels_count_1(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("abcde") == 2
		
    def test_vowels_count_2(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("ACEDY") == 3
		
    def test_vowels_count_3(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("") == 0
		
    def test_vowels_count_4(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("bcd") == 0
		
    def test_vowels_count_5(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("aeiou") == 5
		
    def test_vowels_count_6(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("AEIOU") == 5
		
    def test_vowels_count_7(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("aeiouy") == 6
		
    def test_vowels_count_8(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("AEIOUY") == 6
		
    def test_vowels_count_9(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("aeiouyAEIOUY") == 12
		
    def test_vowels_count_10(self):
        """
        Test case for the function :func:`original.id_64.vowels_count`.
        """
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUY") == 24
		
# id_65.py
def is_palindrome(s):
    """Write a function is_palindrome which takes a string representing
    a word as input and returns True if the word is a palindrome,
    and False otherwise.

    Example:
    >>> is_palindrome("abcba")
    True
    >>> is_palindrome("abcd")
    False
    """

    return s == s[::-1]

# id_65_Test.java
from original.id_65 import is_palindrome

import pytest

class id_65_Test:
    """
    Test class of id_65.py.
    It contains ten unit test cases for the :func:`original.id_65.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("abcba") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("abcd") == False
		
    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("") == True
		
    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("a") == True
		
    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("aa") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("ab") == False
		
    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("aba") == True
		
    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("abba") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("abcbaabcba") == True
		
    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_65.is_palindrome`.
        """
        assert is_palindrome("abcbaabcbaabcba") == True
		
# id_66.py
def is_anagram(s1, s2):
    """Write a function is_anagram which takes two strings representing
    words as input and returns True if the words are anagrams of each
    other, and False otherwise.

    Example:
    >>> is_anagram("abc", "cba")
    True
    >>> is_anagram("abc", "cbd")
    False
    """

    return sorted(s1) == sorted(s2)

# id_66_Test.java
from original.id_66 import is_anagram

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`original.id_66.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the function :func:`original.id_66.is_anagram`.
        """
        assert is_anagram("abc", "cba") == True
		
    def test_is_anagram_2(self):
        """
        Test case for the function :func:`original.id_66.is_anagram`.
        """
        assert is_anagram("abc", "cbd") == False
		
    def test_is_anagram_3(self):
        """
        Test case for the function :func:`original.id_66.is_anagram`.
        """
        assert is_anagram("", "") == True
		
    def test_is_anagram_4(self):
        """
        Test case for the function :func:`original.id_66.is_anagram`.
        """
        assert is_anagram("a", "a") == True
		
    def test_is_anagram_5(self):
        """
        Test case for the function :func:`original.id_66.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True
		
    def test_is_anagram_6(self):
        """
        Test case for the function :func:`original.id_66.is_anagram`.
        """
        assert is_anagram("ab", "bc") == False
		
    def test_is_anagram_7(self):
        """
        Test case for