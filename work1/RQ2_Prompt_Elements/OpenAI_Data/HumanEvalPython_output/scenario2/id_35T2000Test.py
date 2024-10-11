# id_35_Test.java
from scenario2.id_35 import max_element

import pytest

class id_35_Test:
    """
    Test class of id_35.py.
    It contains ten unit test cases for the :func:`scenario2.id_35.max_element`.
    """


    def test_max_element_1(self):
        """
        Test case 1 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5]) == 5

    def test_max_element_2(self):
        """
        Test case 2 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_3(self):
        """
        Test case 3 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 20

    def test_max_element_4(self):
        """
        Test case 4 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 30

    def test_max_element_5(self):
        """
        Test case 5 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == 40

    def test_max_element_6(self):
        """
        Test case 6 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == 50

    def test_max_element_7(self):
        """
        Test case 7 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == 60

    def test_max_element_8(self):
        """
        Test case 8 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70]) == 70

    def test_max_element_9(self):
        """
        Test case 9 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80]) == 80

    def test_max_element_10(self):
        """
        Test case 10 for :func:`scenario2.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90]) == 90


# id_36.py


def min_element(l: list):
    """Return minimum element in the list.
    
    """

    m = l[0]
    for e in l:
        if e < m:
            m = e
    return m


# id_36_Test.java
from scenario2.id_36 import min_element

import pytest

class id_36_Test:
    """
    Test class of id_36.py.
    It contains ten unit test cases for the :func:`scenario2.id_36.min_element`.
    """
		
    def test_min_element_1(self):
        """
        Test case 1 for :func:`scenario2.id_36.min_element`.
        """
        assert min_element([1, 2, 3, 4, 5]) == 1

    def test_min_element_2(self):
        """
        Test case 2 for :func:`scenario2.id_36.min_element`.
        """
        assert min_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1

    def test_min_element_3(self):
        """
        Test case 3 for :func:`scenario2.id_36.min_element`.
        """
        assert min_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 1

    def test_min_element_4(self):
        """
        Test case 4 for :func:`scenario2.id_36.min_element`.
        """
        assert min_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 1

    def test_min_element_5(self):
        """
        Test case 5 for :func:`scenario2.id_36.min_element`.
        """
        assert min_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33