# id_88_Test.java
from scenario1.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario1.id_88.sort_array`.
    """


    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([5, 3, 1, 8, 0]) == [1, 3, 5, 8, 0]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1]) == [1]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([2, 1]) == [1, 2]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 2]) == [1, 2]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 3, 5, 7, 9]) == [1, 3, 5, 7, 9]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 3, 5, 7, 9, 2, 4, 6, 8]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 3, 5, 7, 9, 2, 4, 6, 8]) == [1, 3, 5, 7, 9, 2, 4, 6, 8]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) == [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]

# id_88_Test.py
from scenario1.id_88 import sort_array

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario1.id_88.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([5, 3, 1, 8, 0]) == [1, 3, 5, 8, 0]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1]) == [1]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([2, 1]) == [1, 2]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 2]) == [1, 2]

    def test_sort_array_7(self):
        """
        Test case 7 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 3, 5, 7, 9]) == [1, 3, 5, 7, 9]

    def test_sort_array_8(self):
        """
        Test case 8 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 3, 5, 7, 9, 2, 4, 6, 8]

    def test_sort_array_9(self):
        """
        Test case 9 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 3, 5, 7, 9, 2, 4, 6, 8]) == [1, 3, 5, 7, 9, 2, 4, 6, 8]

    def test_sort_array_10(self):
        """
        Test case 10 for :func:`scenario1.id_88.sort_array`.
        """
        assert sort_array([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) == [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]

# id_89.py

def sort_array(array):
    

    return [] if len(array) == 0 else sorted(array, reverse= (array[0]+array[-1]) % 2 == 0) 

# id_89_Test.java
from scenario1.id_89 import sort_array

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario1.id_89.sort_array`.
    """
		
    def test_sort_array_1(self):
        """
        Test case 1 for :func:`scenario1.id_89.sort_array`.
        """
        assert sort_array([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

    def test_sort_array_2(self):
        """
        Test case 2 for :func:`scenario1.id_89.sort_array`.
        """
        assert sort_array([5, 3, 1, 8, 0]) == [1, 3, 5, 8, 0]

    def test_sort_array_3(self):
        """
        Test case 3 for :func:`scenario1.id_89.sort_array`.
        """
        assert sort_array([]) == []

    def test_sort_array_4(self):
        """
        Test case 4 for :func:`scenario1.id_89.sort_array`.
        """
        assert sort_array([1]) == [1]

    def test_sort_array_5(self):
        """
        Test case 5 for :func:`scenario1.id_89.sort_array`.
        """
        assert sort_array([2, 1]) == [1, 2]

    def test_sort_array_6(self):
        """
        Test case 6 for :func:`scenario1.id_89.sort_array`.
        """
        assert sort_array([1, 2]) == [1, 2]

    def test_sort_array_7(self):
        """
        Test case 7 for :func