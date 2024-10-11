# id_116_Test.java
from scenario2.id_116 import sort_array

import pytest

class id_116_Test:
    """
    Test class of id_116.py.
    It contains ten unit test cases for the :func:`scenario2.id_116.sort_array`.
    """


    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

# id_116_Test.py
from scenario2.id_116 import sort_array

import pytest

class id_116_Test:
    """
    Test class of id_116.py.
    It contains ten unit test cases for the :func:`scenario2.id_116.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario2.id_116.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

# id_117.py

def sort_array(arr):
    """
    In this Kata, you have to sort an array of non-negative integers according to
    number of ones in their binary representation in ascending order.
    For similar number of ones, sort based on decimal value.

    
    """

    return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))

# id_117_Test.java
from scenario2.id_117 import sort_array

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`scenario2.id_117.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

# id_117_Test.py
from scenario2.id_117 import sort_array

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`scenario2.id_117.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario2.id_117.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

# id_118.py

def sort_array(arr):
    """
    In this Kata, you have to sort an array of non-negative integers according to
    number of ones in their binary representation in ascending order.
    For similar number of ones, sort based on decimal value.

    
    """

    return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))

# id_118_Test.java
from scenario2.id_118 import sort_array

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`scenario2.id_118.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario2.id_118.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario2.id_118.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario2.id_118.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 4, 8, 3, 5, 6, 7, 9, 10]

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario2.id_118.sort_array`.
        """
        assert sort_array([10, 100, 1000, 10000]) == [10, 100, 10000, 1000]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario2.id_118.sort_array`.
        """
