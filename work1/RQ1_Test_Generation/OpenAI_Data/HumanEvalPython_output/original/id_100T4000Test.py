# id_100_Test.java
from original.id_100 import make_a_pile

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`original.id_100.make_a_pile`.
    """


    def test_make_a_pile_1(self):
        """
        Test case for make_a_pile(3).
        """
        assert make_a_pile(3) == [3, 5, 7]

    def test_make_a_pile_2(self):
        """
        Test case for make_a_pile(4).
        """
        assert make_a_pile(4) == [4, 6, 8, 10]

    def test_make_a_pile_3(self):
        """
        Test case for make_a_pile(5).
        """
        assert make_a_pile(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_4(self):
        """
        Test case for make_a_pile(6).
        """
        assert make_a_pile(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_5(self):
        """
        Test case for make_a_pile(7).
        """
        assert make_a_pile(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_6(self):
        """
        Test case for make_a_pile(8).
        """
        assert make_a_pile(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_7(self):
        """
        Test case for make_a_pile(9).
        """
        assert make_a_pile(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_8(self):
        """
        Test case for make_a_pile(10).
        """
        assert make_a_pile(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

    def test_make_a_pile_9(self):
        """
        Test case for make_a_pile(11).
        """
        assert make_a_pile(11) == [11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31]

    def test_make_a_pile_10(self):
        """
        Test case for make_a_pile(12).
        """
        assert make_a_pile(12) == [12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34]

# id_100_Test.py
from original.id_100 import make_a_pile

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`original.id_100.make_a_pile`.
    """
		
    def test_make_a_pile_1(self):
        """
        Test case for make_a_pile(3).
        """
        assert make_a_pile(3) == [3, 5, 7]

    def test_make_a_pile_2(self):
        """
        Test case for make_a_pile(4).
        """
        assert make_a_pile(4) == [4, 6, 8, 10]

    def test_make_a_pile_3(self):
        """
        Test case for make_a_pile(5).
        """
        assert make_a_pile(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_4(self):
        """
        Test case for make_a_pile(6).
        """
        assert make_a_pile(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_5(self):
        """
        Test case for make_a_pile(7).
        """
        assert make_a_pile(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_6(self):
        """
        Test case for make_a_pile(8).
        """
        assert make_a_pile(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_7(self):
        """
        Test case for make_a_pile(9).
        """
        assert make_a_pile(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_8(self):
        """
        Test case for make_a_pile(10).
        """
        assert make_a_pile(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

    def test_make_a_pile_9(self):
        """
        Test case for make_a_pile(11).
        """
        assert make_a_pile(11) == [11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31]

    def test_make_a_pile_10(self):
        """
        Test case for make_a_pile(12).
        """
        assert make_a_pile(12) == [12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34]

# id_101.py

def make_a_pile(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> make_a_pile(3)
    [3, 5, 7]
    """

    return [n + 2*i for i in range(n)]

# id_101_Test.java
from original.id_101 import make_a_pile

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`original.id_101.make_a_pile`.
    """
		
    def test_make_a_pile_1(self):
        """
        Test case for make_a_pile(3).
        """
        assert make_a_pile(3) == [3, 5, 7]

    def test_make_a_pile_2(self):
        """
        Test case for make_a_pile(4).
        """
        assert make_a_pile(4) == [4, 6, 8, 10]

    def test_make_a_pile_3(self):
        """
        Test case for make_a_pile(5).
        """
        assert make_a_pile(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_4(self):
        """
        Test case for make_a_pile(6).
        """
        assert make_a_pile(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_5(self):
        """
        Test case for make_a_pile(7).
        """
        assert make_a_pile(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_6(self):
        """
        Test case for make_a_pile(8).
        """
        assert make_a_pile(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_7(self):
        """
        Test case for make_a_pile(9).
        """
        assert make_a_pile(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_8(self):
        """
        Test case for make_a_pile(10).
        """
        assert make_a_pile(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

    def test_make_a_pile_9(self):
        """
        Test case for make_a_pile(11).
        """
        assert make_a_pile(11) == [11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31]

    def test_make_a_pile_10(self):
        """
        Test case for make_a_pile(12).
        """
        assert make_a_pile(12) == [12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34]

# id_101_Test.py
from original.id_101 import make_a_pile

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`original.id_101.make_a_pile`.
    """
		
    def test_make_a_pile_1(self):
        """
        Test case for make_a_pile(3).
        """
        assert make_a_pile(3) == [3, 5, 7]

    def test_make_a_pile_2(self):
        """
        Test case for make_a_pile(4).
        """
        assert make_a_pile(4) == [4, 6, 8, 10]

    def test_make_a_pile_3(self):
        """
        Test case for make_a_pile(5).
        """
        assert make_a_pile(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_4(self):
        """
        Test case for make_a_pile(6).
        """
        assert make_a_pile(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_5(self):
        """
        Test case for make_a_pile(7).
        """
        assert make_a_pile(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_6(self):
        """
        Test case for make_a_pile(8).
        """
        assert make_a_pile(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_7(self):
        """
        Test case for make_a_pile(9).
        """
        assert make_a_pile(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_8(self):
        """
        Test case for make_a_pile(10).
        """
        assert make_a_pile(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

    def test_make_a_pile_9(self):
        """
        Test case for make_a_pile(11).
        """
        assert make_a_pile(11) == [11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31]

    def test_make_a_pile_10(self):
        """
        Test case for make_a_pile(12).
        """
        assert make_a_pile(12) == [12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34]

# id_102.py

def make_a_pile(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> make_a_pile(3)
    [3, 5, 7]
    """

    return [n + 2*i for i in range(n)]

# id_102_Test.java
from original.id_102 import make_a_pile

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`original.id_102.make_a_pile`.
    """
		
    def test_make_a_pile_1(self):
        """
        Test case for make_a_pile(3).
        """
        assert make_a_pile(3) == [3, 5, 7]

    def test_make_a_pile_2(self):
        """
        Test case for make_a_pile(4).
        """
        assert make_a_pile(4) == [4, 6, 8, 10]

    def test_make_a_pile_3(self):
        """
        Test case for make_a_pile(5).
        """
        assert make_a_pile(5) == [5, 7, 9, 11, 13]

    def test_make_a_pile_4(self):
        """
        Test case for make_a_pile(6).
        """
        assert make_a_pile(6) == [6, 8, 10, 12, 14, 16]

    def test_make_a_pile_5(self):
        """
        Test case for make_a_pile(7).
        """
        assert make_a_pile(7) == [7, 9, 11, 13, 15, 17, 19]

    def test_make_a_pile_6(self):
        """
        Test case for make_a_pile(8).
        """
        assert make_a_pile(8) == [8, 10, 12, 14, 16, 18, 20, 22]

    def test_make_a_pile_7(self):
        """
        Test case for make_a_pile(9).
        """
        assert make_a_pile(9) == [9, 11, 13, 15, 17, 19, 21, 23, 25]

    def test_make_a_pile_8(self):
        """
        Test case for make_a_pile(10).
        """
        assert make_a_pile(10) == [10, 12, 14, 16, 18, 20, 22, 24, 26, 28]

    def test_make_a_pile_9(self):
        """
        Test case for make_a_pile(11).
        """
        assert make_a_pile(11) == [11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31]

    def test_make_a_pile_10(self):
        """
        Test case for make_a_pile(12).
        """
        assert make_a_pile(12) == [12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34]

# id_102_Test.py
from original.id_102 import make_a_pile

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`original.id_102.make_a_pile