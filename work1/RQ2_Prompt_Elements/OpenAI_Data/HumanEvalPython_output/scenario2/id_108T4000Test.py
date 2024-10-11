# id_108_Test.java
from scenario2.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario2.id_108.count_nums`.
    """


    def test_count_nums_1(self):
        """
        Test case 1 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5]) == 5
		
    def test_count_nums_2(self):
        """
        Test case 2 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5]) == 0
		
    def test_count_nums_3(self):
        """
        Test case 3 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == 5
		
    def test_count_nums_4(self):
        """
        Test case 4 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_5(self):
        """
        Test case 5 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_6(self):
        """
        Test case 6 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_7(self):
        """
        Test case 7 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_8(self):
        """
        Test case 8 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_9(self):
        """
        Test case 9 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_10(self):
        """
        Test case 10 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
		
# id_108_Test.py
from scenario2.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario2.id_108.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case 1 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5]) == 5
		
    def test_count_nums_2(self):
        """
        Test case 2 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5]) == 0
		
    def test_count_nums_3(self):
        """
        Test case 3 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == 5
		
    def test_count_nums_4(self):
        """
        Test case 4 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_5(self):
        """
        Test case 5 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_6(self):
        """
        Test case 6 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_7(self):
        """
        Test case 7 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_8(self):
        """
        Test case 8 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_9(self):
        """
        Test case 9 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_10(self):
        """
        Test case 10 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
		
# id_108_Test.py
from scenario2.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario2.id_108.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case 1 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5]) == 5
		
    def test_count_nums_2(self):
        """
        Test case 2 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5]) == 0
		
    def test_count_nums_3(self):
        """
        Test case 3 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == 5
		
    def test_count_nums_4(self):
        """
        Test case 4 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_5(self):
        """
        Test case 5 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_6(self):
        """
        Test case 6 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_7(self):
        """
        Test case 7 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_8(self):
        """
        Test case 8 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == 5
		
    def test_count_nums_9(self):
        """
        Test case 9 for :func:`scenario2.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -