# id_88_Test.java
from original.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`original.id_88.sort_array`.
    """


    def test_sort_array_1(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_2(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([5]) == [5]

    def test_sort_array_3(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5]) == [0, 1, 2, 3, 4, 5]

    def test_sort_array_4(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6]) == [6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_5(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7]) == [6, 5, 4, 3, 2, 1, 0, 7]

    def test_sort_array_6(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8]) == [8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_7(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9]) == [8, 7, 6, 5, 4, 3, 2, 1, 0, 9]

    def test_sort_array_8(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_9(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 11]

    def test_sort_array_10(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11, 12]) == [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

# id_88_Test.py
from original.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`original.id_88.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_2(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([5]) == [5]

    def test_sort_array_3(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5]) == [0, 1, 2, 3, 4, 5]

    def test_sort_array_4(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6]) == [6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_5(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7]) == [6, 5, 4, 3, 2, 1, 0, 7]

    def test_sort_array_6(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8]) == [8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_7(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9]) == [8, 7, 6, 5, 4, 3, 2, 1, 0, 9]

    def test_sort_array_8(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    def test_sort_array_9(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
        """
        assert sort_array([2, 4, 3, 0, 1, 5, 6, 7, 8, 9, 10, 11]) == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 11]

    def test_sort_array_10(self):
        """
        Test case for the :func:`original.id_88.sort_array`.
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

    return [] if len(array) == 0 else sorted(array, reverse= (array[0]+array[-1]) % 2 == 0) 

# id_89_Test.java
from original.id_89 import sort_array

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`original.id_89.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case for the :func:`