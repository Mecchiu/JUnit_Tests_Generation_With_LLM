# id_82_Test.java
from scenario2.id_82 import prime_length

import pytest

class id_82_Test:
    """
    Test class of id_82.py.
    It contains ten unit test cases for the :func:`scenario2.id_82.prime_length`.
    """


    def test_prime_length_1(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("") == False
		
    def test_prime_length_2(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("a") == False
		
    def test_prime_length_3(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("ab") == True
		
    def test_prime_length_4(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abc") == True
		
    def test_prime_length_5(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abcd") == False
		
    def test_prime_length_6(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abcde") == True
		
    def test_prime_length_7(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abcdef") == False
		
    def test_prime_length_8(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abcdefg") == True
		
    def test_prime_length_9(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abcdefgh") == False
		
    def test_prime_length_10(self):
        """
        Test case for the :func:`scenario2.id_82.prime_length`.
        """
        assert prime_length("abcdefghi") == False
		
# id_83.py

def is_palindrome(string):
    """Write a function that takes a string and returns True if the string
    is a palindrome or False otherwise
    
    """

    l = len(string)
    if l == 0 or l == 1:
        return True
    for i in range(l // 2):
        if string[i] != string[l - i - 1]:
            return False
    return True

# id_83_Test.java
from scenario2.id_83 import is_palindrome

import pytest

class id_83_Test:
    """
    Test class of id_83.py.
    It contains ten unit test cases for the :func:`scenario2.id_83.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("a") == True
		
    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("ab") == False
		
    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("aba") == True
		
    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("abba") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("abcba") == True
		
    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("abccba") == True
		
    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("abcddcba") == True
		
    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario2.id_83.is_palindrome`.
        """
        assert is_palindrome("abcdedcba") == True
		
# id_84.py

def is_anagram(string1, string2):
    """Write a function that takes two strings and returns True if the strings
    are anagrams or False otherwise
    
    """

    if len(string1) != len(string2):
        return False
    for i in range(len(string1)):
        if string1.count(string1[i]) != string2.count(string1[i]):
            return False
    return True

# id_84_Test.java
from scenario2.id_84 import is_anagram

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains ten unit test cases for the :func:`scenario2.id_84.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("", "") == True
		
    def test_is_anagram_2(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("a", "a") == True
		
    def test_is_anagram_3(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("ab", "ab") == True
		
    def test_is_anagram_4(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True
		
    def test_is_anagram_5(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("abc", "abc") == True
		
    def test_is_anagram_6(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("abc", "bac") == True
		
    def test_is_anagram_7(self):
        """
        Test case for the :func:`scenario2.id_84.is_anagram`.
        """
        assert is_anagram("abc", "cab") == True
		
