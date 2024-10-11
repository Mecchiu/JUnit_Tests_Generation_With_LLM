# id_90_Test.java
from original.id_90 import next_smallest

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`original.id_90.next_smallest`.
    """


    def test_next_smallest_1(self):
        """
        Test case for next_smallest([1, 2, 3, 4, 5]) == 2
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2

    def test_next_smallest_2(self):
        """
        Test case for next_smallest([5, 1, 4, 3, 2]) == 2
        """
        assert next_smallest([5, 1, 4, 3, 2]) == 2

    def test_next_smallest_3(self):
        """
        Test case for next_smallest([]) == None
        """
        assert next_smallest([]) == None

    def test_next_smallest_4(self):
        """
        Test case for next_smallest([1, 1]) == None
        """
        assert next_smallest([1, 1]) == None

    def test_next_smallest_5(self):
        """
        Test case for next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2

    def test_next_smallest_6(self):
        """
        Test case for next_smallest([10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2
        """
        assert next_smallest([10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2

    def test_next_smallest_7(self):
        """
        Test case for next_smallest([1, 1, 1, 1, 1, 1, 1, 1, 1, 1]) == None
        """
        assert next_smallest([1, 1, 1, 1, 1, 1, 1, 1, 1, 1]) == None

    def test_next_smallest_8(self):
        """
        Test case for next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 2
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 2

    def test_next_smallest_9(self):
        """
        Test case for next_smallest([20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2
        """
        assert next_smallest([20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2

    def test_next_smallest_10(self):
        """
        Test case for next_smallest([1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]) == None
        """
        assert next_smallest([1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]) == None

# id_91.py

def is_palindrome(s):
    """
    You are given a string s.
    Write a function is_palindrome() that returns True if s is a palindrome and False otherwise.
    
    is_palindrome("abba") == True
    is_palindrome("abcba") == True
    is_palindrome("") == True
    is_palindrome("ab") == False
    """

    return s == s[::-1]

# id_91_Test.java
from original.id_91 import is_palindrome

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`original.id_91.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for is_palindrome("abba") == True
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_2(self):
        """
        Test case for is_palindrome("abcba") == True
        """
        assert is_palindrome("abcba") == True

    def test_is_palindrome_3(self):
        """
        Test case for is_palindrome("") == True
        """
        assert is_palindrome("") == True

    def test_is_palindrome_4(self):
        """
        Test case for is_palindrome("ab") == False
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_5(self):
        """
        Test case for is_palindrome("abcdefghijklmnopqrstuvwxyz") == False
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz") == False

    def test_is_palindrome_6(self):
        """
        Test case for is_palindrome("zyxwvutsrqponmlkjihgfedcba") == False
        """
        assert is_palindrome("zyxwvutsrqponmlkjihgfedcba") == False

    def test_is_palindrome_7(self):
        """
        Test case for is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba") == True
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba") == True

    def test_is_palindrome_8(self):
        """
        Test case for is_palindrome("zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True
        """
        assert is_palindrome("zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True

    def test_is_palindrome_9(self):
        """
        Test case for is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for is_palindrome("zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True
        """
        assert is_palindrome("zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True

# id_92.py

def is_anagram(s1, s2):
    """
    You are given two strings s1 and s2.
    Write a function is_anagram() that returns True if s1 and s2 are anagrams and False otherwise.
    
    is_anagram("abba", "baba") == True
    is_anagram("abba", "bbaa") == True
    is_anagram("abba", "abb") == False
    is_anagram("abba", "abab") == False
    """

    return sorted(s1) == sorted(s2)

# id_92_Test.java
from original.id_92 import is_anagram

import pytest

class id_92_Test:
    """
    Test class of id_92.py.
    It contains ten unit test cases for the :func:`original.id_92.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for is_anagram("abba", "baba") == True
        """
        assert is_anagram("abba", "baba") == True

    def test_is_anagram_2(self):
        """
        Test case for is_anagram("abba", "bbaa") == True
        """
        assert is_anagram("abba", "bbaa") == True

    def test_is_anagram_3(self):
        """
        Test case for is_anagram("abba", "abb") == False
        """
        assert is_anagram("abba", "abb") == False

    def test_is_anagram_4(self):
        """
        Test case for is_anagram("abba", "abab") == False
        """
        assert is_anagram("abba", "abab") == False

    def test_is_anagram_5(self):
        """
        Test case for is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba") == True
        """
        assert is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba") == True

    def test_is_anagram_6(self):
        """
        Test case for is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcb") == False
        """
        assert is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcb") == False

    def test_is_anagram_7(self):
        """
        Test case for is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbaa") == False
        """
        assert is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbaa") == False

    def test_is_anagram_8(self):
        """
        Test case for is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True
        """
        assert is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == True

    def test_is_anagram_9(self):
        """
        Test case for is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcb") == False
        """
        assert is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcb") == False

    def test_is_anagram_10(self):
        """
        Test case for is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcbaa") == False
        """
        assert is_anagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcbaa") == False

# id_93.py

def is_substring(s1, s2):
    """
    You are given two strings s1 and s2.
    Write a function is_substring() that returns True if s1 is a substring of s2 and False otherwise.
    
    is_substring("abba", "baba") == True
    is_substring("abba", "bbaa") == False
    is_substring("abba", "abb") == True
    is_substring("abba", "abab") == False
    """

    return s1 in s2

# id_93_Test.java
from original.id_93 import is_substring

import pytest

class id_93_Test:
    """
    Test class of id_93.py.
    It contains ten unit test cases for the :func:`original.id_93.is_substring`.
    """
		
    def test_is_substring_1(self):
        """
        Test case for is_substring("abba", "baba") == True
        """
        assert is_substring("abba", "baba") == True

    def test_is_substring_2(self):
        """
        Test case for is_substring("abba", "bbaa") == False
        """
        assert is_substring("abba", "bbaa") == False

    def test_is_substring_3(self):
        """
        Test case for is_substring("abba", "abb") == True
        """
        assert is_substring("abba", "abb") == True

    def test_is_substring_4(self):
        """
        Test case for is_substring("abba", "abab") == False
        """
        assert is_substring("abba", "abab") == False

    def test_is_substring_5(self):
        """
        Test case for is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba") == False
        """
        assert is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba") == False

    def test_is_substring_6(self):
        """
        Test case for is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcb") == False
        """
        assert is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcb") == False

    def test_is_substring_7(self):
        """
        Test case for is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbaa") == False
        """
        assert is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbaa") == False

    def test_is_substring_8(self):
        """
        Test case for is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == False
        """
        assert is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba") == False

    def test_is_substring_9(self):
        """
        Test case for is_substring("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponml