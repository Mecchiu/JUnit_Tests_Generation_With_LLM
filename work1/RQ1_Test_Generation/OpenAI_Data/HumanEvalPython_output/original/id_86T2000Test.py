# id_86_Test.java
from original.id_86 import anti_shuffle

import pytest

class id_86_Test:
    """
    Test class of id_86.py.
    It contains ten unit test cases for the :func:`original.id_86.anti_shuffle`.
    """


    def test_anti_shuffle_1(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hi') == 'Hi'

    def test_anti_shuffle_2(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('hello') == 'ehllo'

    def test_anti_shuffle_3(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_4(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_5(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_6(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_7(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_8(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_9(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

    def test_anti_shuffle_10(self):
        """
        Test case for anti_shuffle.
        """
        assert anti_shuffle('Hello World!!!') == 'Hello !!!Wdlor'

# id_87.py

def is_palindrome(s):
    """
    Write a function that takes a string and returns True if it is a palindrome
    and False otherwise.

    For example:
    is_palindrome('racecar') returns True
    is_palindrome('hello') returns False
    """

    return s == s[::-1]

# id_87_Test.java
from original.id_87 import is_palindrome

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`original.id_87.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_2(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('hello') == False

    def test_is_palindrome_3(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_4(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('hello') == False

    def test_is_palindrome_5(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_6(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('hello') == False

    def test_is_palindrome_7(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_8(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('hello') == False

    def test_is_palindrome_9(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_10(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome('hello') == False

# id_88.py

def is_anagram(s1, s2):
    """
    Write a function that takes two strings and returns True if they are anagrams
    and False otherwise.

    For example:
    is_anagram('listen', 'silent') returns True
    is_anagram('listen', 'silent') returns True
    """

    return sorted(s1) == sorted(s2)

# id_88_Test.java
from original.id_88 import is_anagram

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`original.id_88.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_2(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_3(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_4(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_5(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_6(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_7(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_8(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_9(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

    def test_is_anagram_10(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram('listen', 'silent') == True

# id_89.py

def is_pangram(s):
    """
    Write a function that takes a string and returns True if it is a pangram and
    False otherwise.

    For example:
    is_pangram('The quick brown fox jumps over the lazy dog') returns True
    is_pangram('The quick brown fox jumps over the lazy dog') returns True
    """

    return len(set(s.lower())) == 26

# id_89_Test.java
from original.id_89 import is_pangram

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`original.id_89.is_pangram`.
    """
		
    def test_is_pangram_1(self):
        """
        Test case for is_pangram