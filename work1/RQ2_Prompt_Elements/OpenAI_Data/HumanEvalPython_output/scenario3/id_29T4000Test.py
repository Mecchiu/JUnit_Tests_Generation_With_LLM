# id_29_Test.java
from scenario3.id_29 import filter_by_prefix

import pytest

class id_29_Test:
    """
    Test class of id_29.py.
    It contains ten unit test cases for the :func:`scenario3.id_29.filter_by_prefix`.
    """


    def test_filter_by_prefix_empty_list(self):
        """
        Test case for an empty list.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix(self):
        """
        Test case for a list with prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_without_prefix(self):
        """
        Test case for a list without prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string(self):
        """
        Test case for a list with prefix and empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], '') == ['abc', 'bcd', 'cde', 'array', '']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty.
        """
        assert filter_by_prefix([], '') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty_and_prefix_is_not_in_list(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty and prefix is not in list.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty_and_prefix_is_not_in_list_and_list_is_not_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty and prefix is not in list and list is not empty.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'z') == []

# id_29_Test.py
from scenario3.id_29 import filter_by_prefix

import pytest

class id_29_Test:
    """
    Test class of id_29.py.
    It contains ten unit test cases for the :func:`scenario3.id_29.filter_by_prefix`.
    """
		
    def test_filter_by_prefix_empty_list(self):
        """
        Test case for an empty list.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix(self):
        """
        Test case for a list with prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_without_prefix(self):
        """
        Test case for a list without prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string(self):
        """
        Test case for a list with prefix and empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], '') == ['abc', 'bcd', 'cde', 'array', '']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty.
        """
        assert filter_by_prefix([], '') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty_and_prefix_is_not_in_list(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty and prefix is not in list.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty_and_prefix_is_not_in_list_and_list_is_not_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty and prefix is not in list and list is not empty.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'z') == []

# id_30.py
from typing import List


def filter_by_prefix(strings: List[str], prefix: str) -> List[str]:
    """ Filter an input list of strings only for ones that start with a given prefix.
    >>> filter_by_prefix([], 'a')
    []
    >>> filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a')
    ['abc', 'array']
    """

    pass

# id_30_Test.java
from scenario3.id_30 import filter_by_prefix

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario3.id_30.filter_by_prefix`.
    """
		
    def test_filter_by_prefix_empty_list(self):
        """
        Test case for an empty list.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix(self):
        """
        Test case for a list with prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_without_prefix(self):
        """
        Test case for a list without prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string(self):
        """
        Test case for a list with prefix and empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], '') == ['abc', 'bcd', 'cde', 'array', '']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty.
        """
        assert filter_by_prefix([], '') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty_and_prefix_is_not_in_list(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty and prefix is not in list.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string_and_list_is_not_empty_and_prefix_is_not_in_list_and_list_is_not_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string and list is not empty and prefix is not in list and list is not empty.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'z') == []

# id_30_Test.py
from scenario3.id_30 import filter_by_prefix

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario3.id_30.filter_by_prefix`.
    """
		
    def test_filter_by_prefix_empty_list(self):
        """
        Test case for an empty list.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix(self):
        """
        Test case for a list with prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_without_prefix(self):
        """
        Test case for a list without prefix.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array'], 'z') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string(self):
        """
        Test case for a list with prefix and empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], 'a') == ['abc', 'array']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string.
        """
        assert filter_by_prefix(['abc', 'bcd', 'cde', 'array', ''], '') == ['abc', 'bcd', 'cde', 'array', '']

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty.
        """
        assert filter_by_prefix([], '') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_string(self):
        """
        Test case for a list with prefix and empty string and prefix is empty string and list is empty and prefix is not empty string.
        """
        assert filter_by_prefix([], 'a') == []

    def test_filter_by_prefix_list_with_prefix_and_empty_string_and_prefix_is_empty_string_and_list_is_empty_and_prefix_is_not_empty_