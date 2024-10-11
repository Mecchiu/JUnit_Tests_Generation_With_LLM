# id_150_Test.java
from scenario3.id_150 import x_or_y

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`scenario3.id_150.x_or_y`.
    """


    def test_x_or_y_1(self):
        """
        Test case for x_or_y(7, 34, 12) == 34
        """
        assert x_or_y(7, 34, 12) == 34

    def test_x_or_y_2(self):
        """
        Test case for x_or_y(15, 8, 5) == 5
        """
        assert x_or_y(15, 8, 5) == 5

    def test_x_or_y_3(self):
        """
        Test case for x_or_y(2, 3, 4) == 3
        """
        assert x_or_y(2, 3, 4) == 3

    def test_x_or_y_4(self):
        """
        Test case for x_or_y(3, 5, 6) == 5
        """
        assert x_or_y(3, 5, 6) == 5

    def test_x_or_y_5(self):
        """
        Test case for x_or_y(4, 7, 8) == 8
        """
        assert x_or_y(4, 7, 8) == 8

    def test_x_or_y_6(self):
        """
        Test case for x_or_y(5, 9, 10) == 9
        """
        assert x_or_y(5, 9, 10) == 9

    def test_x_or_y_7(self):
        """
        Test case for x_or_y(6, 11, 12) == 12
        """
        assert x_or_y(6, 11, 12) == 12

    def test_x_or_y_8(self):
        """
        Test case for x_or_y(7, 13, 14) == 13
        """
        assert x_or_y(7, 13, 14) == 13

    def test_x_or_y_9(self):
        """
        Test case for x_or_y(8, 15, 16) == 16
        """
        assert x_or_y(8, 15, 16) == 16

    def test_x_or_y_10(self):
        """
        Test case for x_or_y(9, 17, 18) == 17
        """
        assert x_or_y(9, 17, 18) == 17

# id_150_Test.py
from scenario3.id_150 import x_or_y

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`scenario3.id_150.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for x_or_y(7, 34, 12) == 34
        """
        assert x_or_y(7, 34, 12) == 34

    def test_x_or_y_2(self):
        """
        Test case for x_or_y(15, 8, 5) == 5
        """
        assert x_or_y(15, 8, 5) == 5

    def test_x_or_y_3(self):
        """
        Test case for x_or_y(2, 3, 4) == 3
        """
        assert x_or_y(2, 3, 4) == 3

    def test_x_or_y_4(self):
        """
        Test case for x_or_y(3, 5, 6) == 5
        """
        assert x_or_y(3, 5, 6) == 5

    def test_x_or_y_5(self):
        """
        Test case for x_or_y(4, 7, 8) == 8
        """
        assert x_or_y(4, 7, 8) == 8

    def test_x_or_y_6(self):
        """
        Test case for x_or_y(5, 9, 10) == 9
        """
        assert x_or_y(5, 9, 10) == 9

    def test_x_or_y_7(self):
        """
        Test case for x_or_y(6, 11, 12) == 12
        """
        assert x_or_y(6, 11, 12) == 12

    def test_x_or_y_8(self):
        """
        Test case for x_or_y(7, 13, 14) == 13
        """
        assert x_or_y(7, 13, 14) == 13

    def test_x_or_y_9(self):
        """
        Test case for x_or_y(8, 15, 16) == 16
        """
        assert x_or_y(8, 15, 16) == 16

    def test_x_or_y_10(self):
        """
        Test case for x_or_y(9, 17, 18) == 17
        """
        assert x_or_y(9, 17, 18) == 17

# id_151.py

def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """

    pass
# id_151_Test.java
from scenario3.id_151 import x_or_y

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario3.id_151.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for x_or_y(7, 34, 12) == 34
        """
        assert x_or_y(7, 34, 12) == 34

    def test_x_or_y_2(self):
        """
        Test case for x_or_y(15, 8, 5) == 5
        """
        assert x_or_y(15, 8, 5) == 5

    def test_x_or_y_3(self):
        """
        Test case for x_or_y(2, 3, 4) == 3
        """
        assert x_or_y(2, 3, 4) == 3

    def test_x_or_y_4(self):
        """
        Test case for x_or_y(3, 5, 6) == 5
        """
        assert x_or_y(3, 5, 6) == 5

    def test_x_or_y_5(self):
        """
        Test case for x_or_y(4, 7, 8) == 8
        """
        assert x_or_y(4, 7, 8) == 8

    def test_x_or_y_6(self):
        """
        Test case for x_or_y(5, 9, 10) == 9
        """
        assert x_or_y(5, 9, 10) == 9

    def test_x_or_y_7(self):
        """
        Test case for x_or_y(6, 11, 12) == 12
        """
        assert x_or_y(6, 11, 12) == 12

    def test_x_or_y_8(self):
        """
        Test case for x_or_y(7, 13, 14) == 13
        """
        assert x_or_y(7, 13, 14) == 13

    def test_x_or_y_9(self):
        """
        Test case for x_or_y(8, 15, 16) == 16
        """
        assert x_or_y(8, 15, 16) == 16

    def test_x_or_y_10(self):
        """
        Test case for x_or_y(9, 17, 18) == 17
        """
        assert x_or_y(9, 17, 18) == 17

# id_151_Test.py
from scenario3.id_151 import x_or_y

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario3.id_151.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for x_or_y(7, 34, 12) == 34
        """
        assert x_or_y(7, 34, 12) == 34

    def test_x_or_y_2(self):
        """
        Test case for x_or_y(15, 8, 5) == 5
        """
        assert x_or_y(15, 8, 5) == 5

    def test_x_or_y_3(self):
        """
        Test case for x_or_y(2, 3, 4) == 3
        """
        assert x_or_y(2, 3, 4) == 3

    def test_x_or_y_4(self):
        """
        Test case for x_or_y(3, 5, 6) == 5
        """
        assert x_or_y(3, 5, 6) == 5

    def test_x_or_y_5(self):
        """
        Test case for x_or_y(4, 7, 8) == 8
        """
        assert x_or_y(4, 7, 8) == 8

    def test_x_or_y_6(self):
        """
        Test case for x_or_y(5, 9, 10) == 9
        """
        assert x_or_y(5, 9, 10) == 9

    def test_x_or_y_7(self):
        """
        Test case for x_or_y(6, 11, 12) == 12
        """
        assert x_or_y(6, 11, 12) == 12

    def test_x_or_y_8(self):
        """
        Test case for x_or_y(7, 13, 14) == 13
        """
        assert x_or_y(7, 13, 14) == 13

    def test_x_or_y_9(self):
        """
        Test case for x_or_y(8, 15, 16) == 16
        """
        assert x_or_y(8, 15, 16) == 16

    def test_x_or_y_10(self):
        """
        Test case for x_or_y(9, 17, 18) == 17
        """
        assert x_or_y(9, 17, 18) == 17

# id_152.py

def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """

    pass
# id_152_Test.java
from scenario3.id_152 import x_or_y

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario3.id_152.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for x_or_y(7, 34, 12) == 34
        """
        assert x_or_y(7, 34, 12) == 34

    def test_x_or_y_2(self):
        """
        Test case for x_or_y(15, 8, 5) == 5
        """
        assert x_or_y(15, 8, 5) == 5

    def test_x_or_y_3(self):
        """
        Test case for x_or_y(2, 3, 4) == 3
        """
        assert x_or_y(2, 3, 4) == 3

    def test_x_or_y_4(self):
        """
        Test case for x_or_y(3, 5, 6) == 5
        """
        assert x_or_y(3, 5, 6) == 5

    def test_x_or_y_5(self):
        """
        Test case for x_or_y(4, 7, 8) == 8
        """
        assert x_or_y(4, 7, 8) == 8

    def test_x_or_y_6(self):
        """
        Test case for x_or_y(5, 9, 10) == 9
        """
        assert x_or_y(5, 9, 10) == 9

    def test_x_or_y_7(self):
        """
        Test case for x_or_y(6, 11, 12) == 12
        """
        assert x_or_y(6, 11, 12) == 12

    def test_x_or_y_8(self):
        """
        Test case for x_or_y(7, 13, 14) == 13
        """
        assert x_or_y(7, 13, 14) == 13

    def test_x_or_y_9(self):
        """
        Test case for x_or_y(8, 15, 16) == 16
        """
        assert x_or_y(8, 15, 16) == 16

    def test_x_or_y_10(self):
        """
        Test case for x_or_y(9, 17, 18) == 17
        """
        assert x_or_y(9, 17, 18) == 17

# id_152_Test.py
from scenario3.id_152 import x_or_y

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario3.id_152.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for x_or_y(7, 34, 12) == 34
        """
        assert x_or_y(7, 34, 12) == 34

    def test_x_or_y_2(self):
        """
        Test case for x_or_y(15, 8, 5) == 5
        """
        assert x_or_y(15, 8, 5) == 5

    def test_x_or_y_3(self):
        """
        Test case for x_or_y(2, 3, 4) == 3
        """
        assert x_or_y(2, 3, 4) == 3

    def test_x_or_y_4(self):
        """
        Test case for x_or_y(3, 5, 6) == 5
        """
        assert x_or_y(3, 5, 6) == 5

    def test_x_or_y_5(self):
        """
        Test case for x_or_y(4, 7, 8) == 8
        """
        assert x_or_y(4, 7, 8) == 8

    def test_x_or_y_6(self):
        """
        Test case for x_or_y(5, 9, 10) == 9
        """
        assert x_or_y(5, 9, 10) == 9

    def test_x_or_y_7(self):
        """
        Test case for x_or_y(6, 11, 12) == 12
        """
        assert x_or_y(6, 11, 12) == 12

    def test_x_or_y_8(self):
        """
        Test case for x_or_y(7, 13, 14) == 13
        """
        assert x_or_y(7, 13, 14) == 13

    def test_x_or_y_9(self):
        """
        Test case for x_or_y(8, 15, 16) == 16
        """
        assert x_or_y(8, 15, 16) == 16

    def test_x_or_