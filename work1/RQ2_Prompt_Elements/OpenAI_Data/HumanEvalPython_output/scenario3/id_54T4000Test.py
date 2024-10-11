# id_54_Test.java
from scenario3.id_54 import same_chars

import pytest

class id_54_Test:
    """
    Test class of id_54.py.
    It contains ten unit test cases for the :func:`scenario3.id_54.same_chars`.
    """


    def test_same_chars_1(self):
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc') == True

    def test_same_chars_2(self):
        assert same_chars('abcd', 'dddddddabc') == True

    def test_same_chars_3(self):
        assert same_chars('dddddddabc', 'abcd') == True

    def test_same_chars_4(self):
        assert same_chars('eabcd', 'dddddddabc') == False

    def test_same_chars_5(self):
        assert same_chars('abcd', 'dddddddabce') == False

    def test_same_chars_6(self):
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False

    def test_same_chars_7(self):
        assert same_chars('', '') == True

    def test_same_chars_8(self):
        assert same_chars('', 'a') == False

    def test_same_chars_9(self):
        assert same_chars('a', '') == False

    def test_same_chars_10(self):
        assert same_chars('a', 'a') == True


# id_54_Test.py
from scenario3.id_54 import same_chars

import pytest

class id_54_Test:
    """
    Test class of id_54.py.
    It contains ten unit test cases for the :func:`scenario3.id_54.same_chars`.
    """
		
    def test_same_chars_1(self):
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc') == True

    def test_same_chars_2(self):
        assert same_chars('abcd', 'dddddddabc') == True

    def test_same_chars_3(self):
        assert same_chars('dddddddabc', 'abcd') == True

    def test_same_chars_4(self):
        assert same_chars('eabcd', 'dddddddabc') == False

    def test_same_chars_5(self):
        assert same_chars('abcd', 'dddddddabce') == False

    def test_same_chars_6(self):
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False

    def test_same_chars_7(self):
        assert same_chars('', '') == True

    def test_same_chars_8(self):
        assert same_chars('', 'a') == False

    def test_same_chars_9(self):
        assert same_chars('a', '') == False

    def test_same_chars_10(self):
        assert same_chars('a', 'a') == True


# id_55.py


def is_palindrome(s: str):
    """
    Check if a word is a palindrome.
    >>> is_palindrome('abcba')
    True
    >>> is_palindrome('abccba')
    True
    >>> is_palindrome('abcdcba')
    True
    >>> is_palindrome('abcddcba')
    True
    >>> is_palindrome('abcddcb')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>> is_palindrome('abcddcbaa')
    False
    >>>