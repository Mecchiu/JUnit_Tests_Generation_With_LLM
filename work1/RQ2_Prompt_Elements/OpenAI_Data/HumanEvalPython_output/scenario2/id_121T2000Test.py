# id_121_Test.java
from scenario2.id_121 import solution

import pytest

class id_121_Test:
    """
    Test class of id_121.py.
    It contains ten unit test cases for the :func:`scenario2.id_121.solution`.
    """


    def test_id_121_1(self):
        """
        Test case 1 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 16

    def test_id_121_2(self):
        """
        Test case 2 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 16

    def test_id_121_3(self):
        """
        Test case 3 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 28

    def test_id_121_4(self):
        """
        Test case 4 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 28

    def test_id_121_5(self):
        """
        Test case 5 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 40

    def test_id_121_6(self):
        """
        Test case 6 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == 40

    def test_id_121_7(self):
        """
        Test case 7 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == 52

    def test_id_121_8(self):
        """
        Test case 8 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == 52

    def test_id_121_9(self):
        """
        Test case 9 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == 64

    def test_id_121_10(self):
        """
        Test case 10 for :func:`scenario2.id_121.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == 64


# id_122.py

def solution(lst):
    """Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
    

    """

    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])


# id_122_Test.java
from scenario2.id_122 import solution

import pytest

class id_122_Test:
    """
    Test class of id_122.py.
    It contains ten unit test cases for the :func:`scenario2.id_122.solution`.
    """
		
    def test_id_122_1(self):
        """
        Test case 1 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 16

    def test_id_122_2(self):
        """
        Test case 2 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 16

    def test_id_122_3(self):
        """
        Test case 3 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 28

    def test_id_122_4(self):
        """
        Test case 4 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 28

    def test_id_122_5(self):
        """
        Test case 5 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 40

    def test_id_122_6(self):
        """
        Test case 6 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == 40

    def test_id_122_7(self):
        """
        Test case 7 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == 52

    def test_id_122_8(self):
        """
        Test case 8 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == 52

    def test_id_122_9(self):
        """
        Test case 9 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == 64

    def test_id_122_10(self):
        """
        Test case 10 for :func:`scenario2.id_122.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == 64


# id_123.py

def solution(lst):
    """Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
    

    """

    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])


# id_123_Test.java
from scenario2.id_123 import solution

import pytest

class id_123_Test:
    """
    Test class of id_123.py.
    It contains ten unit test cases for the :func:`scenario2.id_123.solution`.
    """
		
    def test_id_123_1(self):
        """
        Test case 1 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 16

    def test_id_123_2(self):
        """
        Test case 2 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 16

    def test_id_123_3(self):
        """
        Test case 3 for :func:`