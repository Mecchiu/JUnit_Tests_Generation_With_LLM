# id_163_Test.java
from original.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`original.id_163.generate_integers`.
    """


    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 4) == [2, 4]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(4, 2) == [2, 4]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 6) == [2, 4, 6]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(6, 2) == [2, 4, 6]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

# id_163_Test.py
from original.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`original.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 4) == [2, 4]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(4, 2) == [2, 4]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 6) == [2, 4, 6]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(6, 2) == [2, 4, 6]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

# id_164.py

def is_valid_triangle(a, b, c):
    """
    Given three positive integers a, b and c, return True if they can form
    the side lengths of a triangle and False otherwise.

    For example:
    is_valid_triangle(2, 3, 4) => True
    is_valid_triangle(2, 4, 3) => True
    is_valid_triangle(3, 4, 2) => True
    is_valid_triangle(4, 2, 3) => True
    is_valid_triangle(4, 3, 2) => True
    is_valid_triangle(3, 2, 4) => True
    is_valid_triangle(2, 3, 5) => False
    is_valid_triangle(2, 5, 3) => False
    is_valid_triangle(5, 3, 2) => False
    is_valid_triangle(3, 2, 5) => False
    is_valid_triangle(2, 5, 3) => False
    is_valid_triangle(5, 2, 3) => False
    """

    return a + b > c and a + c > b and b + c > a

# id_164_Test.java
from original.id_164 import is_valid_triangle

import pytest

class id_164_Test:
    """
    Test class of id_164.py.
    It contains ten unit test cases for the :func:`original.id_164.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`original.id_164.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 3, 4) == True

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`original.id_164.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 4, 3) == True

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`original.id_164.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 2) == True

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`original.id_164.is_valid_triangle`.
        """
        assert is_valid_triangle(4, 2, 3) == True

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`original.id_164.is