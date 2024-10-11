# id_7_Test.java
from original.id_7 import filter_by_substring

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`original.id_7.filter_by_substring`.
    """


    def test_filter_by_substring_1(self):
        """
        Test case for empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_2(self):
        """
        Test case for empty substring.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], '') == ['abc', 'bacd', 'cde', 'array']

    def test_filter_by_substring_3(self):
        """
        Test case for empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

    def test_filter_by_substring_4(self):
        """
        Test case for list with one element.
        """
        assert filter_by_substring(['abc'], 'a') == ['abc']

    def test_filter_by_substring_5(self):
        """
        Test case for list with one element and empty substring.
        """
        assert filter_by_substring(['abc'], '') == ['abc']

    def test_filter_by_substring_6(self):
        """
        Test case for list with one element and empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_7(self):
        """
        Test case for list with one element and empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

    def test_filter_by_substring_8(self):
        """
        Test case for list with two elements.
        """
        assert filter_by_substring(['abc', 'bacd'], 'a') == ['abc', 'bacd']

    def test_filter_by_substring_9(self):
        """
        Test case for list with two elements and empty substring.
        """
        assert filter_by_substring(['abc', 'bacd'], '') == ['abc', 'bacd']

    def test_filter_by_substring_10(self):
        """
        Test case for list with two elements and empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_11(self):
        """
        Test case for list with two elements and empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

# id_7_Test.py
from original.id_7 import filter_by_substring

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`original.id_7.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_2(self):
        """
        Test case for empty substring.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], '') == ['abc', 'bacd', 'cde', 'array']

    def test_filter_by_substring_3(self):
        """
        Test case for empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

    def test_filter_by_substring_4(self):
        """
        Test case for list with one element.
        """
        assert filter_by_substring(['abc'], 'a') == ['abc']

    def test_filter_by_substring_5(self):
        """
        Test case for list with one element and empty substring.
        """
        assert filter_by_substring(['abc'], '') == ['abc']

    def test_filter_by_substring_6(self):
        """
        Test case for list with one element and empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_7(self):
        """
        Test case for list with one element and empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

    def test_filter_by_substring_8(self):
        """
        Test case for list with two elements.
        """
        assert filter_by_substring(['abc', 'bacd'], 'a') == ['abc', 'bacd']

    def test_filter_by_substring_9(self):
        """
        Test case for list with two elements and empty substring.
        """
        assert filter_by_substring(['abc', 'bacd'], '') == ['abc', 'bacd']

    def test_filter_by_substring_10(self):
        """
        Test case for list with two elements and empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_11(self):
        """
        Test case for list with two elements and empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

# id_7_Test.java
from original.id_7 import filter_by_substring

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`original.id_7.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_2(self):
        """
        Test case for empty substring.
        """
        assert filter_by_substring(['abc', 'bacd', 'cde', 'array'], '') == ['abc', 'bacd', 'cde', 'array']

    def test_filter_by_substring_3(self):
        """
        Test case for empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

    def test_filter_by_substring_4(self):
        """
        Test case for list with one element.
        """
        assert filter_by_substring(['abc'], 'a') == ['abc']

    def test_filter_by_substring_5(self):
        """
        Test case for list with one element and empty substring.
        """
        assert filter_by_substring(['abc'], '') == ['abc']

    def test_filter_by_substring_6(self):
        """
        Test case for list with one element and empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_7(self):
        """
        Test case for list with one element and empty list and empty substring.
        """
        assert filter_by_substring([], '') == []

    def test_filter_by_substring_8(self):
        """
        Test case for list with two elements.
        """
        assert filter_by_substring(['abc', 'bacd'], 'a') == ['abc', 'bacd']

    def test_filter_by_substring_9(self):
        """
        Test case for list with two elements and empty substring.
        """
        assert filter_by_substring(['abc', 'bacd'], '') == ['abc', 'bacd']

    def test_filter_by_substring_10(self):
        """
        Test case for list with two elements and empty list.
        """
        assert filter_by_substring([], 'a') == []

    def test_filter_by_substring_11(self):
        """
        Test case for list with two elements and empty