# id_100_Test.java
from scenario2.id_100 import make_a_pile

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`scenario2.id_100.make_a_pile`.
    """


    def test_make_a_pile_1(self):
        """
        Test case for make_a_pile(1).
        """
        assert make_a_pile(1) == [1]

    def test_make_a_pile_2(self):
        """
        Test case for make_a_pile(2).
        """
        assert make_a_pile(2) == [2, 4]

    def test_make_a_pile_3(self):
        """
        Test case for make_a_pile(3).
        """
        assert make_a_pile(3) == [3, 5, 7]

    def test_make_a_pile_4(self):
        """
        Test case for make_a_pile(4).
        """
        assert make_a_pile(4) == [4, 6, 8, 10]

    def test_make_a_pile_5(self):
        """
        Test case for make_a_pile(5).
        """
        assert make_a_pile(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_6(self):
        """
        Test case for make_a_pile(6).
        """
        assert make_a_pile(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_7(self):
        """
        Test case for make_a_pile(7).
        """
        assert make_a_pile(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_8(self):
        """
        Test case for make_a_pile(8).
        """
        assert make_a_pile(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_9(self):
        """
        Test case for make_a_pile(9).
        """
        assert make_a_pile(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_10(self):
        """
        Test case for make_a_pile(10).
        """
        assert make_a_pile(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

# id_101.py

def make_a_pile_2(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    
    """

    return [n + 2*i for i in range(n)]

# id_101_Test.java
from scenario2.id_101 import make_a_pile_2

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`scenario2.id_101.make_a_pile_2`.
    """
		
    def test_make_a_pile_2_1(self):
        """
        Test case for make_a_pile_2(1).
        """
        assert make_a_pile_2(1) == [1]

    def test_make_a_pile_2_2(self):
        """
        Test case for make_a_pile_2(2).
        """
        assert make_a_pile_2(2) == [2, 4]

    def test_make_a_pile_2_3(self):
        """
        Test case for make_a_pile_2(3).
        """
        assert make_a_pile_2(3) == [3, 5, 7]

    def test_make_a_pile_2_4(self):
        """
        Test case for make_a_pile_2(4).
        """
        assert make_a_pile_2(4) == [4, 6, 8, 10]

    def test_make_a_pile_2_5(self):
        """
        Test case for make_a_pile_2(5).
        """
        assert make_a_pile_2(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_2_6(self):
        """
        Test case for make_a_pile_2(6).
        """
        assert make_a_pile_2(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_2_7(self):
        """
        Test case for make_a_pile_2(7).
        """
        assert make_a_pile_2(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_2_8(self):
        """
        Test case for make_a_pile_2(8).
        """
        assert make_a_pile_2(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_2_9(self):
        """
        Test case for make_a_pile_2(9).
        """
        assert make_a_pile_2(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_2_10(self):
        """
        Test case for make_a_pile_2(10).
        """
        assert make_a_pile_2(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

# id_102.py

def make_a_pile_3(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    
    """

    return [n + 2*i for i in range(n)]

# id_102_Test.java
from scenario2.id_102 import make_a_pile_3

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario2.id_102.make_a_pile_3`.
    """
		
    def test_make_a_pile_3_1(self):
        """
        Test case for make_a_pile_3(1).
        """
        assert make_a_pile_3(1) == [1]

    def test_make_a_pile_3_2(self):
        """
        Test case for make_a_pile_3(2).
        """
        assert make_a_pile_3(2) == [2, 4]

    def test_make_a_pile_3_3(self):
        """
        Test case for make_a_pile_3(3).
        """
        assert make_a_pile_3(3) == [3, 5, 7]

    def test_make_a_pile_3_4(self):
        """
        Test case for make_a_pile_3(4).
        """
        assert make_a_pile_3(4) == [4, 6, 8, 10]

   