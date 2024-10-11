# id_104_Test.java
from original.id_104 import unique_digits

import pytest

class id_104_Test:
    """
    Test class of id_104.py.
    It contains ten unit test cases for the :func:`original.id_104.unique_digits`.
    """


    def test_unique_digits_1(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([15, 33, 1422, 1]) == [1, 15, 33]

    def test_unique_digits_2(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([152, 323, 1422, 10]) == []

    def test_unique_digits_3(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 3, 5, 7, 9]

    def test_unique_digits_4(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

    def test_unique_digits_5(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29]

    def test_unique_digits_6(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39]

    def test_unique_digits_7(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]

    def test_unique_digits_8(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59]

    def test_unique_digits_9(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69]

    def test_unique_digits_10(self):
        """
        Test case for the function :func:`original.id_104.unique_digits`.
        """
        assert unique_digits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80]) == [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79]

# id_105.py

def unique_digits(x):
    """Given a list of positive integers x. return a sorted list of all 
    elements that hasn't any even digit.

    Note: Returned list should be sorted in increasing order.
    
    For example:
    >>> unique_digits([15, 33, 1422, 1])
    [1, 15, 33]
    >>> unique_digits([152, 323, 1422, 10])
    []
    """

    odd_digit_elements = []
    for i in x:
        if all (int(c) % 2 == 1 for c in str(i)):
            odd_digit_elements.append(i)
    return sorted(odd_digit_elements)

# id_105_Test.java
from original.id_105 import unique_digits

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`original.id_105.unique_digits`.
    """
		
    def test_unique_digits_1(self):
        """
        Test case for the function :func:`original.id_105.unique_digits`.
        """
        assert unique_digits([15, 33, 1422, 1]) == [1, 15, 33]

    def test_unique_digits_2(self):
        """
        Test case for the function :func:`original.id_105.unique_digits`.
        """
        assert unique_digits