# id_40_Test.java
from scenario3.id_40 import triples_sum_to_zero

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`scenario3.id_40.triples_sum_to_zero`.
    """


    def test_triples_sum_to_zero_1(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, 5, 0]) == False

    def test_triples_sum_to_zero_2(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, -2, 1]) == True

    def test_triples_sum_to_zero_3(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 7]) == False

    def test_triples_sum_to_zero_4(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([2, 4, -5, 3, 9, 7]) == True

    def test_triples_sum_to_zero_5(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1]) == False

    def test_triples_sum_to_zero_6(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == False

    def test_triples_sum_to_zero_7(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == True

    def test_triples_sum_to_zero_8(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == True

    def test_triples_sum_to_zero_9(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == True

    def test_triples_sum_to_zero_10(self):
        """
        Test case for the :func:`scenario3.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == True

# id_41.py


def is_palindrome(s: str):
    """
    is_palindrome takes a string as an input.
    it returns True if the string is a palindrome, and False otherwise.

    >>> is_palindrome("racecar")
    True
    >>> is_palindrome("hello")
    False
    >>> is_palindrome("")
    True
    >>> is_palindrome("a")
    True
    >>> is_palindrome("aa")
    True
    >>> is_palindrome("ab")
    False
    >>> is_palindrome("aba")
    True
    >>> is_palindrome("abba")
    True
    >>> is_palindrome("abcba")
    True
    >>> is_palindrome("abccba")
    True
    >>> is_palindrome("abcdcba")
    True
    >>> is_palindrome("abcddcba")
    True
    >>> is_palindrome("abcdddcba")
    True
    >>> is_palindrome("abcddddcba")
    True
    >>> is_palindrome("abcdddddcba")
    True
    >>> is_palindrome("abcddddddcba")
    True
    >>> is_palindrome("abcdddddddcba")
    True
    >>> is_palindrome("abcddddddddcba")
    True
    >>> is_palindrome("abcdddddddddcba")
    True
    >>> is_palindrome("abcddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcddddddddddddddddddddddddddddddcba")
    True
    >>> is_palindrome("abcdddddddddd