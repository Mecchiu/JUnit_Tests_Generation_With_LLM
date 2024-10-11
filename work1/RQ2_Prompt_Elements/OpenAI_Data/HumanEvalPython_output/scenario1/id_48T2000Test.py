# id_48_Test.java
from scenario1.id_48 import is_palindrome

import pytest

class id_48_Test:
    """
    Test class of id_48.py.
    It contains ten unit test cases for the :func:`scenario1.id_48.is_palindrome`.
    """


    def test_is_palindrome_1(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_2(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_3(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_4(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_5(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_6(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_7(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("abab") == False

    def test_is_palindrome_8(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababa") == True

    def test_is_palindrome_9(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababba") == True

    def test_is_palindrome_10(self):
        """
        Test case for is_palindrome.
        """
        assert is_palindrome("ababbab") == False

# id_49.py


def is_anagram(text1: str, text2: str):

    if len(text1) != len(text2):
        return False

    for i in range(len(text1)):
        if text1.count(text1[i]) != text2.count(text1[i]):
            return False
    return True

# id_49_Test.java
from scenario1.id_49 import is_anagram

import pytest

class id_49_Test:
    """
    Test class of id_49.py.
    It contains ten unit test cases for the :func:`scenario1.id_49.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("", "") == True

    def test_is_anagram_2(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("a", "a") == True

    def test_is_anagram_3(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("ab", "ab") == True

    def test_is_anagram_4(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("ab", "ba") == True

    def test_is_anagram_5(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("ab", "ac") == False

    def test_is_anagram_6(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "abc") == True

    def test_is_anagram_7(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "acb") == True

    def test_is_anagram_8(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "bac") == True

    def test_is_anagram_9(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "bca") == True

    def test_is_anagram_10(self):
        """
        Test case for is_anagram.
        """
        assert is_anagram("abc", "cab") == True

# id_50.py


def is_anagram_2(text1: str, text2: str):

    if len(text1) != len(text2):
        return False

    text1 = sorted(text1)
    text2 = sorted(text2)

    for i in range(len(text1)):
        if text1[i] != text2[i]:
            return False
    return True

# id_50_Test.java
from scenario1.id_50 import is_anagram_2

import pytest

class id_50_Test:
    """
    Test class of id_50.py.
    It contains ten unit test cases for the :func:`scenario1.id_50.is_anagram_2`.
    """
		
    def test_is_anagram_2_1(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("", "") == True

    def test_is_anagram_2_2(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("a", "a") == True

    def test_is_anagram_2_3(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("ab", "ab") == True

    def test_is_anagram_2_4(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("ab", "ba") == True

    def test_is_anagram_2_5(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("ab", "ac") == False

    def test_is_anagram_2_6(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("abc", "abc") == True

    def test_is_anagram_2_7(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("abc", "acb") == True

    def test_is_anagram_2_8(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("abc", "bac") == True

    def test_is_anagram_2_9(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("abc", "bca") == True

    def test_is_anagram_2_10(self):
        """
        Test case for is_anagram_2.
        """
        assert is_anagram_2("abc", "cab") == True

# id_51.py


def is_anagram_3(text1: str, text2: str):

    if len(text1) != len(text2):
        return False

    text1 = sorted(text1)
    text2 = sorted(text2)

    return text1 == text2

# id_51_Test.java
from scenario1.id_51 import is_anagram_3

import pytest

class id_51_Test:
    """
    Test class of id_51.py.
    It contains ten unit test cases for the :func:`scenario1.id_51.is_anagram_3`.
    """
		
    def test_is_anagram_3_1(self):
        """
        Test case for is_anagram_3.
        """
        assert is_anagram_3("", "") == True

    def test_is_an