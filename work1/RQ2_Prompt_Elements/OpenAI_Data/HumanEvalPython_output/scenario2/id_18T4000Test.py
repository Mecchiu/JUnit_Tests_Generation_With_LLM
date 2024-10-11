# id_18_Test.java
from scenario2.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario2.id_18.how_many_times`.
    """


    def test_how_many_times_1(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "abc") == 1

    def test_how_many_times_2(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "ab") == 1

    def test_how_many_times_3(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "bc") == 1

    def test_how_many_times_4(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "c") == 1

    def test_how_many_times_5(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "a") == 1

    def test_how_many_times_6(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "b") == 1

    def test_how_many_times_7(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "abcd") == 0

    def test_how_many_times_8(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "abcc") == 0

    def test_how_many_times_9(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "abca") == 0

    def test_how_many_times_10(self):
        """
        Test case for how_many_times.
        """
        assert how_many_times("abc", "abcb") == 0

# id_19.py


def is_palindrome(string: str) -> bool:
    """ Check if a given string is a palindrome.
    
    
    """

    return string == string[::-1]

# id_19_Test.java
from scenario2.id_19 import is_palindrome

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario2.id_19.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("abc") == False

    def test_is_palindrome_2(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_3(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_4(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("abab") == False

    def test_is_palindrome_5(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababa") == True

    def test_is_palindrome_6(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababb") == False

    def test_is_palindrome_7(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababba") == True

    def test_is_palindrome_8(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababbb") == False

    def test_is_palindrome_9(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababbba") == True

    def test_is_palindrome_10(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababbbb") == False

# id_20.py


def is_anagram(string1: str, string2: str) -> bool:
    """ Check if two given strings are anagrams.
    
    
    """

    return sorted(string1) == sorted(string2)

# id_20_Test.java
from scenario2.id_20 import is_anagram

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario2.id_20.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "abc") == True

    def test_is_anagram_2(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "acb") == True

    def test_is_anagram_3(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "bac") == True

    def test_is_anagram_4(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "bca") == True

    def test_is_anagram_5(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "cab") == True

    def test_is_anagram_6(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "cba") == True

    def test_is_anagram_7(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "abcd") == False

    def test_is_anagram_8(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "abcc") == False

    def test_is_anagram_9(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "abca") == False

    def test_is_anagram_10(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "abcb") == False

# id_21.py


def is_pangram(string: str) -> bool:
    """ Check if a given string is a pangram.
    
    
    """

    return len(set(string.lower())) == 26

# id_21_Test.java
from scenario2.id_21 import is_pangram

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains ten unit test cases for the :func:`scenario2.id_21.is_pangram`.
    """
		
    def test_is_pangram_1(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abc") == False

    def test_is_pangram_2(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_3(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_4(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_5(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_6(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_7(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_8(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_9(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_10(self):
        """
        Test case for is_pangram.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

# id_22.py


def is_isogram(string: str) -> bool:
    """ Check if a given string is an isogram.
    
    
    """

    return len(set(string.lower())) == len(string)

# id_22_Test.java
from scenario2.id_22 import is_isogram

import pytest

class id_22_Test:
    """
    Test class of id_22.py.
    It contains ten unit test cases for the :func:`scenario2.id_22.is_isogram`.
    """
		
    def test_is_isogram_1(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abc") == True

    def test_is_isogram_2(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyz") == True

    def test_is_isogram_3(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_4(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_5(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_6(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_7(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_8(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_9(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == False

    def test_is_isogram_10(self):
        """
        Test case for is_isogram.
        """
        assert is_isogram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopq