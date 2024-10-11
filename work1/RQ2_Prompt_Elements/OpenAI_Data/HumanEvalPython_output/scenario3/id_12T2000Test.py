# id_12_Test.java
from scenario3.id_12 import longest

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario3.id_12.longest`.
    """


    def test_longest_empty_list(self):
        """
        Test case for empty list.
        """
        assert longest([]) is None

    def test_longest_single_element(self):
        """
        Test case for single element.
        """
        assert longest(['a']) == 'a'

    def test_longest_multiple_elements(self):
        """
        Test case for multiple elements.
        """
        assert longest(['a', 'bb', 'ccc']) == 'ccc'

    def test_longest_multiple_elements_same_length(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd']) == 'a'

    def test_longest_multiple_elements_same_length_2(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee']) == 'a'

    def test_longest_multiple_elements_same_length_3(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff']) == 'a'

    def test_longest_multiple_elements_same_length_4(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg']) == 'a'

    def test_longest_multiple_elements_same_length_5(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg', 'hhhhhhhh']) == 'a'

    def test_longest_multiple_elements_same_length_6(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg', 'hhhhhhhh', 'iiiiiiiii']) == 'a'

    def test_longest_multiple_elements_same_length_7(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg', 'hhhhhhhh', 'iiiiiiiii', 'jjjjjjjjjj']) == 'a'
# id_12_Test.py
from scenario3.id_12 import longest

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario3.id_12.longest`.
    """
		
    def test_longest_empty_list(self):
        """
        Test case for empty list.
        """
        assert longest([]) is None

    def test_longest_single_element(self):
        """
        Test case for single element.
        """
        assert longest(['a']) == 'a'

    def test_longest_multiple_elements(self):
        """
        Test case for multiple elements.
        """
        assert longest(['a', 'bb', 'ccc']) == 'ccc'

    def test_longest_multiple_elements_same_length(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd']) == 'a'

    def test_longest_multiple_elements_same_length_2(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee']) == 'a'

    def test_longest_multiple_elements_same_length_3(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff']) == 'a'

    def test_longest_multiple_elements_same_length_4(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg']) == 'a'

    def test_longest_multiple_elements_same_length_5(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg', 'hhhhhhhh']) == 'a'

    def test_longest_multiple_elements_same_length_6(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg', 'hhhhhhhh', 'iiiiiiiii']) == 'a'

    def test_longest_multiple_elements_same_length_7(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg', 'hhhhhhhh', 'iiiiiiiii', 'jjjjjjjjjj']) == 'a'
# id_13.py
from typing import List, Optional


def longest(strings: List[str]) -> Optional[str]:
    """ Out of list of strings, return the longest one. Return the first one in case of multiple
    strings of the same length. Return None in case the input list is empty.
    >>> longest([])

    >>> longest(['a', 'b', 'c'])
    'a'
    >>> longest(['a', 'bb', 'ccc'])
    'ccc'
    """

    pass
# id_13_Test.java
from scenario3.id_13 import longest

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`scenario3.id_13.longest`.
    """
		
    def test_longest_empty_list(self):
        """
        Test case for empty list.
        """
        assert longest([]) is None

    def test_longest_single_element(self):
        """
        Test case for single element.
        """
        assert longest(['a']) == 'a'

    def test_longest_multiple_elements(self):
        """
        Test case for multiple elements.
        """
        assert longest(['a', 'bb', 'ccc']) == 'ccc'

    def test_longest_multiple_elements_same_length(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd']) == 'a'

    def test_longest_multiple_elements_same_length_2(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee']) == 'a'

    def test_longest_multiple_elements_same_length_3(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff']) == 'a'

    def test_longest_multiple_elements_same_length_4(self):
        """
        Test case for multiple elements of same length.
        """
        assert longest(['a', 'bb', 'ccc', 'dddd', 'eeeee', 'ffffff', 'ggggggg']) == 'a'

    def test_