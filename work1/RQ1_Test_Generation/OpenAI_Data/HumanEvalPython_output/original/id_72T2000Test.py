# id_72_Test.java
from original.id_72 import will_it_fly

import pytest

class id_72_Test:
    """
    Test class of id_72.py.
    It contains ten unit test cases for the :func:`original.id_72.will_it_fly`.
    """


    def test_will_it_fly_1(self):
        """
        Test case 1 of id_72.py.
        """
        assert will_it_fly([1, 2], 5) == False

    def test_will_it_fly_2(self):
        """
        Test case 2 of id_72.py.
        """
        assert will_it_fly([3, 2, 3], 1) == False

    def test_will_it_fly_3(self):
        """
        Test case 3 of id_72.py.
        """
        assert will_it_fly([3, 2, 3], 9) == True

    def test_will_it_fly_4(self):
        """
        Test case 4 of id_72.py.
        """
        assert will_it_fly([3], 5) == True

    def test_will_it_fly_5(self):
        """
        Test case 5 of id_72.py.
        """
        assert will_it_fly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100], 100) == True

    def test_will_it_fly_6(self):
        """
        Test case 6 of id_72.py.
        """
        assert will_it_fly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100], 99) == False

    def test_will_it_fly_7(self):
        """
        Test case 7 of id_72.py.
        """
        assert will_it_fly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100], 101) == False

    def test_will_it_fly_8(self):
        """
        Test case 8 of id_72.py.
        """
        assert will_it_fly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100], 100) == True

    def test_will_it_fly_9(self):
        """
        Test case 9 of id_72.py.
        """
        assert will_it_fly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100], 99) == False

    def test_will_it_fly_10(self):
        """
        Test case 10 of id_72.py.
        """
        assert will_it_fly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100], 101) == False

# id_73.py

def is_it_symmetric(q):
    '''
    Write a function that returns True if the given list is symmetric, and False otherwise.
    A list is symmetric if it is the same forwards as backwards.

    Example:
    is_it_symmetric([1, 2, 3, 3, 2, 1]) ➞ True
    is_it_symmetric([1, 2, 3, 4, 5, 6]) ➞ False
    is_it_symmetric([1]) ➞ True
    '''

    i, j = 0, len(q)-1
    while i<j:
        if q[i] != q[j]:
            return False
        i+=1
        j-=1
    return True

# id_73_Test.java
from original.id_73 import is_it_symmetric

import pytest

class id_73_Test:
    """
    Test class of id_73.py.
    It contains ten unit test cases for the :func:`original.id_73.is_it_symmetric`.
    """
		
    def test_is_it_symmetric_1(self):
        """
        Test case 1 of id_73.py.
        """
        assert is_it_symmetric([1