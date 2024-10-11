# id_19_Test.java
from scenario3.id_19 import sort_numbers

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario3.id_19.sort_numbers`.
    """


    def test_sort_numbers_1(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five') == 'one three five'
		
    def test_sort_numbers_2(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five') == 'one five nine'
		
    def test_sort_numbers_3(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven') == 'one five seven nine'
		
    def test_sort_numbers_4(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two') == 'one two five seven nine'
		
    def test_sort_numbers_5(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four') == 'one two four five seven nine'
		
    def test_sort_numbers_6(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six') == 'one two four five six seven nine'
		
    def test_sort_numbers_7(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight') == 'one two four five six seven eight nine'
		
    def test_sort_numbers_8(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight zero') == 'zero one two four five six seven eight nine'
		
    def test_sort_numbers_9(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight zero three') == 'zero one two three four five six seven eight nine'
		
    def test_sort_numbers_10(self):
        """
        Test case for the :func:`scenario3.id_19.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight zero three one') == 'zero one one two three four five six seven eight nine'
		
# id_20.py
from typing import List


def sort_numbers(numbers: str) -> str:
    """ Input is a space-delimited string of numberals from 'zero' to 'nine'.
    Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    Return the string with numbers sorted from smallest to largest
    >>> sort_numbers('three one five')
    'one three five'
    """

    pass
# id_20_Test.java
from scenario3.id_20 import sort_numbers

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario3.id_20.sort_numbers`.
    """
		
    def test_sort_numbers_1(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('three one five') == 'one three five'
		
    def test_sort_numbers_2(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five') == 'one five nine'
		
    def test_sort_numbers_3(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven') == 'one five seven nine'
		
    def test_sort_numbers_4(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two') == 'one two five seven nine'
		
    def test_sort_numbers_5(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four') == 'one two four five seven nine'
		
    def test_sort_numbers_6(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six') == 'one two four five six seven nine'
		
    def test_sort_numbers_7(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight') == 'one two four five six seven eight nine'
		
    def test_sort_numbers_8(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight zero') == 'zero one two four five six seven eight nine'
		
    def test_sort_numbers_9(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight zero three') == 'zero one two three four five six seven eight nine'
		
    def test_sort_numbers_10(self):
        """
        Test case for the :func:`scenario3.id_20.sort_numbers`.
        """
        assert sort_numbers('nine one five seven two four six eight zero three one') == 'zero one one two three four five six seven eight nine'
		
# id_21.py
from typing import List


def sort_numbers(numbers: str) -> str:
    """ Input is a space-delimited string of numberals from 'zero' to 'nine'.
    Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    Return the string with numbers sorted from smallest to largest
    >>> sort_numbers('three one five')
    'one three five'
    """

    pass
# id_21_Test.java
from scenario3.id_21 import sort_numbers

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains ten unit test cases for the :func:`scenario3.id_21.sort_numbers`.
    """
		
    def test_sort_numbers_1(self):
        """
        Test case for the :func:`scenario3.id_21.sort_numbers`.
        """
        assert sort_numbers('three one five') == 'one three five'
		
    def test_sort_numbers_2(self):
        """
        Test case for the :func:`scenario3.id_21.sort_numbers`.
        """
        assert sort_numbers('nine one five') == 'one five nine'
		
    def test_sort_numbers_3(self):
        """
        Test case for the :func:`scenario3.id_21