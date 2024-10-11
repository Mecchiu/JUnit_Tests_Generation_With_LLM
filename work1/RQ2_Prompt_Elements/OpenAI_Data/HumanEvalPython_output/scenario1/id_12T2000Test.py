# id_12_Test.java
from scenario1.id_12 import longest

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario1.id_12.longest`.
    """


    def test_longest_1(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc"]) == "abc"

    def test_longest_2(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd"]) == "abcd"

    def test_longest_3(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde"]) == "abcde"

    def test_longest_4(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef"]) == "abcdef"

    def test_longest_5(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg"]) == "abcdefg"

    def test_longest_6(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh"]) == "abcdefgh"

    def test_longest_7(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi"]) == "abcdefghi"

    def test_longest_8(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij"]) == "abcdefghij"

    def test_longest_9(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk"]) == "abcdefghijk"

    def test_longest_10(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl"]) == "abcdefghijkl"

# id_12_Test.py
from scenario1.id_12 import longest

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario1.id_12.longest`.
    """
		
    def test_longest_1(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc"]) == "abc"

    def test_longest_2(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd"]) == "abcd"

    def test_longest_3(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde"]) == "abcde"

    def test_longest_4(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef"]) == "abcdef"

    def test_longest_5(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg"]) == "abcdefg"

    def test_longest_6(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh"]) == "abcdefgh"

    def test_longest_7(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi"]) == "abcdefghi"

    def test_longest_8(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij"]) == "abcdefghij"

    def test_longest_9(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk"]) == "abcdefghijk"

    def test_longest_10(self):
        """
        Test case for the :func:`scenario1.id_12.longest` function.
        """
        assert longest(["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij", "abcdefghijk", "abcdefghijkl"]) == "abcdefghijkl"

# id_13.py
from typing import List, Optional


def longest(strings: List[str]) -> Optional[str]:

    if not strings:
        return None

    maxlen = max(len(x) for x in strings)
    for s in strings:
        if len(s) == maxlen:
            return s

# id_13_Test.java
from scenario1.id_13 import longest

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`scenario1.id_13.longest`.
    """
		
    def test_longest_1(self):
        """
        Test case for the :func:`scenario1.id_13.longest` function.
        """
        assert longest(["a", "ab", "abc"]) == "abc"

    def test_longest_2(self):
        """
        Test case for the :func:`scenario1.id_13.longest` function.
