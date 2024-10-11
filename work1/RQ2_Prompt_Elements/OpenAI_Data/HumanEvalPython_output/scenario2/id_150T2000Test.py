# id_150_Test.java
from scenario2.id_150 import x_or_y

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`scenario2.id_150.x_or_y`.
    """


    def test_x_or_y_1(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(1, 1, 2) == 2

    def test_x_or_y_2(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(2, 1, 2) == 1

    def test_x_or_y_3(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(3, 1, 2) == 1

    def test_x_or_y_4(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(4, 1, 2) == 2

    def test_x_or_y_5(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(5, 1, 2) == 1

    def test_x_or_y_6(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(6, 1, 2) == 2

    def test_x_or_y_7(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(7, 1, 2) == 1

    def test_x_or_y_8(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(8, 1, 2) == 2

    def test_x_or_y_9(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(9, 1, 2) == 2

    def test_x_or_y_10(self):
        """
        Test case for the function :func:`scenario2.id_150.x_or_y`.
        """
        assert x_or_y(10, 1, 2) == 2


# id_151.py

def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.



    
    """

    if n == 1:
        return y
    for i in range(2, n):
        if n % i == 0:
            return y
            break
    else:
        return x


# id_151_Test.java
from scenario2.id_151 import x_or_y

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario2.id_151.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(1, 1, 2) == 2

    def test_x_or_y_2(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(2, 1, 2) == 1

    def test_x_or_y_3(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(3, 1, 2) == 1

    def test_x_or_y_4(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(4, 1, 2) == 2

    def test_x_or_y_5(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(5, 1, 2) == 1

    def test_x_or_y_6(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(6, 1, 2) == 2

    def test_x_or_y_7(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(7, 1, 2) == 1

    def test_x_or_y_8(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(8, 1, 2) == 2

    def test_x_or_y_9(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(9, 1, 2) == 2

    def test_x_or_y_10(self):
        """
        Test case for the function :func:`scenario2.id_151.x_or_y`.
        """
        assert x_or_y(10, 1, 2) == 2


# id_152.py

def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.



    
    """

    if n == 1:
        return y
    for i in range(2, n):
        if n % i == 0:
            return y
            break
    else:
        return x


# id_152_Test.java
from scenario2.id_152 import x_or_y

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario2.id_152.x_or_y`.
    """
		
    def test_x_or_y_1(self):
        """
        Test case for the function :func:`scenario2.id_152.x_or_y`.
        """
        assert x_or_y(1, 1, 2) == 2

    def test_x_or_y_2(self):
        """
        Test case for the function :func:`scenario2.id_152.x_or_y`.
        """
        assert x_or_y(2, 1, 2) == 1

    def test_x_or_y_3(self):
        """
        Test case for the function :func:`scenario2.id_152.x_or_y`.
        """
        assert x_or_y(3, 1, 2) == 1

    def test_x_or_y_4(self):
        """
        Test case for the function :func:`scenario2.id_152.x_or_y`.
        """
        assert x_or_y(4, 1, 2) == 2

    def test_x_or_y_5(self):
        """
        Test case for the function :func:`scenario2.id_152.x_or_y`.
        """
        assert x_or_y(5, 1, 2) == 1

    def test_x_or_y_6(self):
        """
        Test case for the function :func:`scenario2.id_152.x_or_