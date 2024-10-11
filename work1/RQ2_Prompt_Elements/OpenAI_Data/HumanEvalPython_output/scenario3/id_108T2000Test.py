# id_108_Test.java
from scenario3.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario3.id_108.count_nums`.
    """


    def test_count_nums_1(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([]) == 0

    def test_count_nums_2(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, 11, -11]) == 1

    def test_count_nums_3(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([1, 1, 2]) == 3

    def test_count_nums_4(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2]) == 0

    def test_count_nums_5(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2]) == 0

    def test_count_nums_6(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3]) == 0

    def test_count_nums_7(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3]) == 0

    def test_count_nums_8(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4]) == 0

    def test_count_nums_9(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4]) == 0

    def test_count_nums_10(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4, -5]) == 0

# id_108_Test.py
from scenario3.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario3.id_108.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([]) == 0

    def test_count_nums_2(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, 11, -11]) == 1

    def test_count_nums_3(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([1, 1, 2]) == 3

    def test_count_nums_4(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2]) == 0

    def test_count_nums_5(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2]) == 0

    def test_count_nums_6(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3]) == 0

    def test_count_nums_7(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3]) == 0

    def test_count_nums_8(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4]) == 0

    def test_count_nums_9(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4]) == 0

    def test_count_nums_10(self):
        """
        Test case for the function :func:`scenario3.id_108.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2, -3, -3, -4, -4, -5]) == 0

# id_109.py

def count_nums(arr):
    """
    Write a function count_nums which takes an array of integers and returns
    the number of elements which has a sum of digits > 0.
    If a number is negative, then its first signed digit will be negative:
    e.g. -123 has signed digits -1, 2, and 3.
    >>> count_nums([]) == 0
    >>> count_nums([-1, 11, -11]) == 1
    >>> count_nums([1, 1, 2]) == 3
    """

    pass
# id_109_Test.java
from scenario3.id_109 import count_nums

import pytest

class id_109_Test:
    """
    Test class of id_109.py.
    It contains ten unit test cases for the :func:`scenario3.id_109.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case for the function :func:`scenario3.id_109.count_nums`.
        """
        assert count_nums([]) == 0

    def test_count_nums_2(self):
        """
        Test case for the function :func:`scenario3.id_109.count_nums`.
        """
        assert count_nums([-1, 11, -11]) == 1

    def test_count_nums_3(self):
        """
        Test case for the function :func:`scenario3.id_109.count_nums`.
        """
        assert count_nums([1, 1, 2]) == 3

    def test_count_nums_4(self):
        """
        Test case for the function :func:`scenario3.id_109.count_nums`.
        """
        assert count_nums([-1, -1, -2]) == 0

    def test_count_nums_5(self):
        """
        Test case for the function :func:`scenario3.id_109.count_nums`.
        """
        assert count_nums([-1, -1, -2, -2]) == 0

    def test_count_nums_6(self):
        """
        Test case for the function :