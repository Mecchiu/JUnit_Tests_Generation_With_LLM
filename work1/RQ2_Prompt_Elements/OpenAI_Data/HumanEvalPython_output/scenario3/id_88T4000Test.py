# id_88_Test.java
from scenario3.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario3.id_88.sort_array`.
    """


    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([5]) == [5]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5]) == [0, 1, 2, 3, 4, 5]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6]) == [6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7]) == [7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8]) == [8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9]) == [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11]) == [11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11, 12]) == [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

# id_88_Test.py
from scenario3.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario3.id_88.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([5]) == [5]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5]) == [0, 1, 2, 3, 4, 5]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6]) == [6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7]) == [7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8]) == [8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9]) == [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11]) == [11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario3.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11, 12]) == [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

# id_89.py

def sort_array(array):
    """
    Given an array of non-negative integers, return a copy of the given array after sorting,
    you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
    or sort it in descending order if the sum( first index value, last index value) is even.

    Note:
    * don't change the given array.

    Examples:
    * sort_array([]) => []
    * sort_array([5]) => [5]
    * sort_array([2, 4, 3, 0, 1, 5]) => [0, 1, 2, 3, 4, 5]
    * sort_array([2, 4, 3, 0, 1, 5, 6]) => [6, 5, 4, 3, 2, 1, 0]
    """

    pass

# id_89_Test.java
from scenario3.id_89 import sort_array

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario3.id_89.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([5]) == [5]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5]) == [0, 1, 2, 3, 4, 5]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6]) == [6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7]) == [7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8]) == [8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9]) == [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11]) == [11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11, 12]) == [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

# id_89_Test.py
from scenario3.id_89 import sort_array

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario3.id_89.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([5]) == [5]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5]) == [0, 1, 2, 3, 4, 5]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6]) == [6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7]) == [7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8]) == [8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9]) == [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11]) == [11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario3.id_89.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11, 12]) == [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

# id_90.py

def sort_array(array):
    """
    Given an array of non-negative integers, return a copy of the given array after sorting,
    you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
    or sort it in descending order if the sum( first index value, last index value) is even.

    Note:
    * don't change the given array.

    Examples:
    * sort_array([]) => []
    * sort_array([5]) => [5]
    * sort_array([2, 4, 3, 0, 1, 5]) => [0, 1, 2, 3, 4, 5]
    * sort_array([2, 4, 3, 0, 1, 5, 6]) => [6, 5, 4, 3, 2, 1, 0]
    """

    pass

# id_90_Test.java
from scenario3.id_90 import sort_array

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario3.id_90.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for