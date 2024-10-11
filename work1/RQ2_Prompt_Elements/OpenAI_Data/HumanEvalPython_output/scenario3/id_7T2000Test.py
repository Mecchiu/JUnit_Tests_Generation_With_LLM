# id_7_Test.java
from scenario3.id_7 import filter_by_substring

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`scenario3.id_7.filter_by_substring`.
    """


    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a') == ['abc', 'bacd', 'array']

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'b') == ['abc', 'bacd']

    def test_filter_by_substring_4(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'c') == ['abc', 'bacd', 'cde']

    def test_filter_by_substring_5(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'd') == ['bacd']

    def test_filter_by_substring_6(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'e') == ['cde']

    def test_filter_by_substring_7(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'r') == ['array']

    def test_filter_by_substring_8(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'y') == ['array']

    def test_filter_by_substring_9(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'z') == []

    def test_filter_by_substring_10(self):
        """
        Test case for the :func:`scenario3.id_7.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'ab') == ['abc', 'bacd', 'array']

# id_8.py
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    >>> filter_by_substring([], 'a')
    []
    >>> filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a')
    ['abc', 'bacd', 'array']
    """

    pass

# id_8_Test.java
from scenario3.id_8 import filter_by_substring

import pytest

class id_8_Test:
    """
    Test class of id_8.py.
    It contains ten unit test cases for the :func:`scenario3.id_8.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a') == ['abc', 'bacd', 'array']

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'b') == ['abc', 'bacd']

    def test_filter_by_substring_4(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'c') == ['abc', 'bacd', 'cde']

    def test_filter_by_substring_5(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'd') == ['bacd']

    def test_filter_by_substring_6(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'e') == ['cde']

    def test_filter_by_substring_7(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'r') == ['array']

    def test_filter_by_substring_8(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'y') == ['array']

    def test_filter_by_substring_9(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'z') == []

    def test_filter_by_substring_10(self):
        """
        Test case for the :func:`scenario3.id_8.filter_by_substring`.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'ab') == ['abc', 'bacd', 'array']

# id_9.py
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    >>> filter_by_substring([], 'a')
    []
    >>> filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a')
    ['abc', 'bacd', 'array']
    """

    pass

# id_9_Test.java
from scenario3.id_9 import filter_by_substring

import pytest

class id_9_Test:
    """