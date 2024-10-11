# id_122_Test.java
from scenario2.id_122 import add_elements

import pytest

class id_122_Test:
    """
    Test class of id_122.py.
    It contains ten unit test cases for the :func:`scenario2.id_122.add_elements`.
    """


    def test_add_elements_1(self):
        """
        Test case 1 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 5
        assert add_elements(arr, k) == 10

    def test_add_elements_2(self):
        """
        Test case 2 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 10
        assert add_elements(arr, k) == 55

    def test_add_elements_3(self):
        """
        Test case 3 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 0
        assert add_elements(arr, k) == 0

    def test_add_elements_4(self):
        """
        Test case 4 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = -1
        assert add_elements(arr, k) == 0

    def test_add_elements_5(self):
        """
        Test case 5 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 11
        assert add_elements(arr, k) == 55

    def test_add_elements_6(self):
        """
        Test case 6 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 100
        assert add_elements(arr, k) == 55

    def test_add_elements_7(self):
        """
        Test case 7 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = -100
        assert add_elements(arr, k) == 0

    def test_add_elements_8(self):
        """
        Test case 8 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 1
        assert add_elements(arr, k) == 1

    def test_add_elements_9(self):
        """
        Test case 9 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 2
        assert add_elements(arr, k) == 3

    def test_add_elements_10(self):
        """
        Test case 10 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 3
        assert add_elements(arr, k) == 6


# id_122_Test.py
from scenario2.id_122 import add_elements

import pytest

class id_122_Test:
    """
    Test class of id_122.py.
    It contains ten unit test cases for the :func:`scenario2.id_122.add_elements`.
    """
		
    def test_add_elements_1(self):
        """
        Test case 1 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 5
        assert add_elements(arr, k) == 10

    def test_add_elements_2(self):
        """
        Test case 2 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 10
        assert add_elements(arr, k) == 55

    def test_add_elements_3(self):
        """
        Test case 3 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 0
        assert add_elements(arr, k) == 0

    def test_add_elements_4(self):
        """
        Test case 4 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = -1
        assert add_elements(arr, k) == 0

    def test_add_elements_5(self):
        """
        Test case 5 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 11
        assert add_elements(arr, k) == 55

    def test_add_elements_6(self):
        """
        Test case 6 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 100
        assert add_elements(arr, k) == 55

    def test_add_elements_7(self):
        """
        Test case 7 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = -100
        assert add_elements(arr, k) == 0

    def test_add_elements_8(self):
        """
        Test case 8 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 1
        assert add_elements(arr, k) == 1

    def test_add_elements_9(self):
        """
        Test case 9 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 2
        assert add_elements(arr, k) == 3

    def test_add_elements_10(self):
        """
        Test case 10 for :func:`scenario2.id_122.add_elements`.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        k = 3
        assert add_elements(arr, k) == 6


# id_123.py

def add_elements(arr, k):
    """
    Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.

    
    """

    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)


# id_123_Test.java
from scenario2.id_123 import add_elements

import pytest

class id_123_Test:
    """
    Test class of id_123.py.
    It contains ten unit test cases for the :func:`scenario2.id_123.add_elements`.
   