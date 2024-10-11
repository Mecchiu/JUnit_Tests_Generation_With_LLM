# id_88_Test.java
from scenario2.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario2.id_88.sort_array`.
    """


    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5]) == [1,3,5,2,4]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6]) == [5,3,1,2,4,6]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7]) == [1,3,5,7,2,4,6]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8]) == [5,3,1,7,2,4,6,8]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9]) == [1,3,5,7,9,2,4,6,8]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10]) == [9,7,5,3,1,2,4,6,8,10]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11]) == [1,3,5,7,9,11,2,4,6,8,10]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11,12]) == [11,9,7,5,3,1,2,4,6,8,10,12]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11,12,13]) == [1,3,5,7,9,11,13,2,4,6,8,10,12]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario2.id_88.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11,12,13,14]) == [13,11,9,7,5,3,1,2,4,6,8,10,12,14]

# id_89.py

def sort_array(array):
    """
    Given an array of non-negative integers, return a copy of the given array after sorting,
    you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
    or sort it in descending order if the sum( first index value, last index value) is even.

    Note:
    * don't change the given array.

    
    """

    return [] if len(array) == 0 else sorted(array, reverse= (array[0]+array[-1]) % 2 == 0) 

# id_89_Test.java
from scenario2.id_89 import sort_array

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario2.id_89.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5]) == [1,3,5,2,4]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6]) == [5,3,1,2,4,6]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7]) == [1,3,5,7,2,4,6]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8]) == [5,3,1,7,2,4,6,8]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9]) == [1,3,5,7,9,2,4,6,8]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10]) == [9,7,5,3,1,2,4,6,8,10]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11]) == [1,3,5,7,9,11,2,4,6,8,10]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11,12]) == [11,9,7,5,3,1,2,4,6,8,10,12]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11,12,13]) == [1,3,5,7,9,11,13,2,4,6,8,10,12]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario2.id_89.sort_array`.
        """
        assert sort_array([1,2,3,4,5,6,7,8,9,10,11,12,13,14]) == [13,11,9,7,5,3,1,2,4,6,8,10,12,14]

# id_90.py

def sort_array(