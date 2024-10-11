# id_135_Test.java
from scenario3.id_135 import can_arrange

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario3.id_135.can_arrange`.
    """


    def test_can_arrange_1(self):
        """
        Test case 1 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5]) == 3

    def test_can_arrange_2(self):
        """
        Test case 2 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3]) == -1

    def test_can_arrange_3(self):
        """
        Test case 3 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10]) == 9

    def test_can_arrange_4(self):
        """
        Test case 4 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11]) == -1

    def test_can_arrange_5(self):
        """
        Test case 5 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12]) == 11

    def test_can_arrange_6(self):
        """
        Test case 6 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13]) == -1

    def test_can_arrange_7(self):
        """
        Test case 7 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14]) == 13

    def test_can_arrange_8(self):
        """
        Test case 8 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15]) == -1

    def test_can_arrange_9(self):
        """
        Test case 9 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16]) == 15

    def test_can_arrange_10(self):
        """
        Test case 10 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16,17]) == -1

# id_135_Test.py
from scenario3.id_135 import can_arrange

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario3.id_135.can_arrange`.
    """
		
    def test_can_arrange_1(self):
        """
        Test case 1 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5]) == 3

    def test_can_arrange_2(self):
        """
        Test case 2 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3]) == -1

    def test_can_arrange_3(self):
        """
        Test case 3 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10]) == 9

    def test_can_arrange_4(self):
        """
        Test case 4 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11]) == -1

    def test_can_arrange_5(self):
        """
        Test case 5 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12]) == 11

    def test_can_arrange_6(self):
        """
        Test case 6 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13]) == -1

    def test_can_arrange_7(self):
        """
        Test case 7 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14]) == 13

    def test_can_arrange_8(self):
        """
        Test case 8 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15]) == -1

    def test_can_arrange_9(self):
        """
        Test case 9 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16]) == 15

    def test_can_arrange_10(self):
        """
        Test case 10 for :func:`scenario3.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16,17]) == -1

# id_136.py

def is_valid_triangle(a, b, c):
    """Create a function which returns True if the given three values can form
    a triangle and False otherwise.

    Examples:
    is_valid_triangle(1,2,3) = False
    is_valid_triangle(3,4,5) = True
    """

    pass
# id_136_Test.java
from scenario3.id_136 import is_valid_triangle

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario3.id_136.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,3) == False

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,5) == True

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,4) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,6) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,5) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,7) == False

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,6) == False

    def test_is_valid_triangle_8(self):
        """
        Test case 8 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,8) == False

    def test_is_valid_triangle_9(self):
        """
        Test case 9 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,7) == False

    def test_is_valid_triangle_10(self):
        """
        Test case 10 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,9) == False

# id_136_Test.py
from scenario3.id_136 import is_valid_triangle

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario3.id_136.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,3) == False

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,5) == True

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,4) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,6) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,5) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,7) == False

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,6) == False

    def test_is_valid_triangle_8(self):
        """
        Test case 8 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,8) == False

    def test_is_valid_triangle_9(self):
        """
        Test case 9 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,7) == False

    def test_is_valid_triangle_10(self):
        """
        Test case 10 for :func:`scenario3.id_136.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,9) == False

# id_137.py

def is_valid_triangle(a, b, c):
    """Create a function which returns True if the given three values can form
    a triangle and False otherwise.

    Examples:
    is_valid_triangle(1,2,3) = False
    is_valid_triangle(3,4,5) = True
    """

    pass
# id_137_Test.java
from scenario3.id_137 import is_valid_triangle

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`scenario3.id_137.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,3) == False

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,5) == True

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,4) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,6) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,5) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,7) == False

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,6) == False

    def test_is_valid_triangle_8(self):
        """
        Test case 8 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(3,4,8) == False

    def test_is_valid_triangle_9(self):
        """
        Test case 9 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is_valid_triangle(1,2,7) == False

    def test_is_valid_triangle_10(self):
        """
        Test case 10 for :func:`scenario3.id_137.is_valid_triangle`.
        """
        assert is