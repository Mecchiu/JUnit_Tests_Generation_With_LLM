# id_3_Test.java
from scenario2.id_3 import below_zero

import pytest

class id_3_Test:
    """
    Test class of id_3.py.
    It contains ten unit test cases for the :func:`scenario2.id_3.below_zero`.
    """


    def test_below_zero_1(self):
        """
        Test case 1 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case 2 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([-1, -2, -3, -4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case 3 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, -4, -5]) == True

    def test_below_zero_4(self):
        """
        Test case 4 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == False

    def test_below_zero_5(self):
        """
        Test case 5 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5, -6]) == True

    def test_below_zero_6(self):
        """
        Test case 6 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5, 6, -7]) == True

    def test_below_zero_7(self):
        """
        Test case 7 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5, 6, 7, -8]) == True

    def test_below_zero_8(self):
        """
        Test case 8 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5, 6, 7, 8, -9]) == True

    def test_below_zero_9(self):
        """
        Test case 9 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10]) == True

    def test_below_zero_10(self):
        """
        Test case 10 for :func:`scenario2.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11]) == True

# id_4.py
from typing import List


def is_palindrome(word: str) -> bool:
    """ You're given a string. Your task is to check if it's a palindrome.
    
    """

    return word == word[::-1]

# id_4_Test.java
from scenario2.id_4 import is_palindrome

import pytest

class id_4_Test:
    """
    Test class of id_4.py.
    It contains ten unit test cases for the :func:`scenario2.id_4.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecars") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarz") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzz") == False

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzzz") == False

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzzzz") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzzzzz") == False

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzzzzzz") == False

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzzzzzzz") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_4.is_palindrome`.
        """
        assert is_palindrome("racecarzzzzzzzz") == False

# id_5.py
from typing import List


def is_anagram(word1: str, word2: str) -> bool:
    """ You're given two strings. Your task is to check if they're anagrams.
    
    """

    return sorted(word1) == sorted(word2)

# id_5_Test.java
from scenario2.id_5 import is_anagram

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`scenario2.id_5.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case 1 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_anagram("racecar", "carrace") == True

    def test_is_anagram_2(self):
        """
        Test case 2 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_anagram("racecar", "carracez") == False

    def test_is_anagram_3(self):
        """
        Test case 3 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_anagram("racecar", "carracezz") == False

    def test_is_anagram_4(self):
        """
        Test case 4 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_anagram("racecar", "carracezzz") == False

    def test_is_anagram_5(self):
        """
        Test case 5 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_anagram("racecar", "carracezzzz") == False

    def test_is_anagram_6(self):
        """
        Test case 6 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_anagram("racecar", "carracezzzzz") == False

    def test_is_anagram_7(self):
        """
        Test case 7 for :func:`scenario2.id_5.is_anagram`.
        """
        assert is_