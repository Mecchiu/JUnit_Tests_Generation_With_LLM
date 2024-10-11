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
        Test case 3 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 28

    def test_id_123_4(self):
        """
        Test case 4 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 28

    def test_id_123_5(self):
        """
        Test case 5 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 40

    def test_id_123_6(self):
        """
        Test case 6 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == 40

    def test_id_123_7(self):
        """
        Test case 7 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == 52

    def test_id_123_8(self):
        """
        Test case 8 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == 52

    def test_id_123_9(self):
        """
        Test case 9 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == 64

    def test_id_123_10(self):
        """
        Test case 10 for :func:`scenario2.id_123.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == 64


# id_124.py

def solution(lst):
    """Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
    

    """

    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])


# id_124_Test.java
from scenario2.id_124 import solution

import pytest

class id_124_Test:
    """
    Test class of id_124.py.
    It contains ten unit test cases for the :func:`scenario2.id_124.solution`.
    """
		
    def test_id_124_1(self):
        """
        Test case 1 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 16

    def test_id_124_2(self):
        """
        Test case 2 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 16

    def test_id_124_3(self):
        """
        Test case 3 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 28

    def test_id_124_4(self):
        """
        Test case 4 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 28

    def test_id_124_5(self):
        """
        Test case 5 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 40

    def test_id_124_6(self):
        """
        Test case 6 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == 40

    def test_id_124_7(self):
        """
        Test case 7 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == 52

    def test_id_124_8(self):
        """
        Test case 8 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == 52

    def test_id_124_9(self):
        """
        Test case 9 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == 64

    def test_id_124_10(self):
        """
        Test case 10 for :func:`scenario2.id_124.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == 64


# id_125.py

def solution(lst):
    """Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
    

    """

    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])


# id_125_Test.java
from scenario2.id_125 import solution

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`scenario2.id_125.solution`.
    """
		
    def test_id_125_1(self):
        """
        Test case 1 for :func:`scenario2.id_125.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 16

    def test_id_125_2(self):
        """
        Test case 2 for :func:`scenario2.id_125.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 16

    def test_id_125_3(self):
        """
        Test case 3 for :func:`scenario2.id_125.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 28

    def test_id_125_4(self):
        """
        Test case 4 for :func:`scenario2.id_125.solution`.
        """
        assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 28

    def test_id_125_5(self):
        """
        Test case 5 for :func:`scenario2.id_125.solution`.
        """
        assert solution