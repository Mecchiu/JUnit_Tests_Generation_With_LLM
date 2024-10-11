# id_108_Test.java
from scenario1.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario1.id_108.count_nums`.
    """


    def test_count_nums_1(self):
        """
        Test case 1 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10
		
    def test_count_nums_2(self):
        """
        Test case 2 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 0
		
    def test_count_nums_3(self):
        """
        Test case 3 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, 9, -10]) == 9
		
    def test_count_nums_4(self):
        """
        Test case 4 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, -7, -8, -9, 10]) == 1
		
    def test_count_nums_5(self):
        """
        Test case 5 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, -9, -10]) == 8
		
    def test_count_nums_6(self):
        """
        Test case 6 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, -7, -8, 9, 10]) == 2
		
    def test_count_nums_7(self):
        """
        Test case 7 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, -8, -9, -10]) == 7
		
    def test_count_nums_8(self):
        """
        Test case 8 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, 7, 8, 9, 10]) == 3
		
    def test_count_nums_9(self):
        """
        Test case 9 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, -6, -7, -8, -9, -10]) == 5
		
    def test_count_nums_10(self):
        """
        Test case 10 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, 5, 6, 7, 8, 9, 10]) == 4
		
		
# id_108_Test.py
from scenario1.id_108 import count_nums

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario1.id_108.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case 1 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10
		
    def test_count_nums_2(self):
        """
        Test case 2 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 0
		
    def test_count_nums_3(self):
        """
        Test case 3 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, 9, -10]) == 9
		
    def test_count_nums_4(self):
        """
        Test case 4 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, -7, -8, -9, 10]) == 1
		
    def test_count_nums_5(self):
        """
        Test case 5 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, -9, -10]) == 8
		
    def test_count_nums_6(self):
        """
        Test case 6 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, -7, -8, 9, 10]) == 2
		
    def test_count_nums_7(self):
        """
        Test case 7 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, -8, -9, -10]) == 7
		
    def test_count_nums_8(self):
        """
        Test case 8 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, -5, -6, 7, 8, 9, 10]) == 3
		
    def test_count_nums_9(self):
        """
        Test case 9 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, -6, -7, -8, -9, -10]) == 5
		
    def test_count_nums_10(self):
        """
        Test case 10 for :func:`scenario1.id_108.count_nums`.
        """
        assert count_nums([-1, -2, -3, -4, 5, 6, 7, 8, 9, 10]) == 4
		
		
# id_109.py

def count_nums(arr):
    

    def digits_sum(n):
        neg = 1
        if n < 0: n, neg = -1 * n, -1 
        n = [int(i) for i in str(n)]
        n[0] = n[0] * neg
        return sum(n)
    return len(list(filter(lambda x: x > 0, [digits_sum(i) for i in arr])))

# id_109_Test.java
from scenario1.id_109 import count_nums

import pytest

class id_109_Test:
    """
    Test class of id_109.py.
    It contains ten unit test cases for the :func:`scenario1.id_109.count_nums`.
    """
		
    def test_count_nums_1(self):
        """
        Test case 1 for :func:`scenario1.id_109.count_nums`.
        """
        assert count_nums([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10
		
    def test_count_nums_2(self):
        """