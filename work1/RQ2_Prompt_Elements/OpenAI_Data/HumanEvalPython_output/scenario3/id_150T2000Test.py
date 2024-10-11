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

def is_prime(n):
    """A simple program which should return True if n is a prime number and 
    should return False otherwise.

    Examples:
    for is_prime(7) == True
    for is_prime(15) == False
    
    """

    pass
# id_151_Test.java
from scenario3.id_151 import is_prime

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario3.id_151.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for is_prime(7) == True
        """
        assert is_prime(7) == True

    def test_is_prime_2(self):
        """
        Test case for is_prime(15) == False
        """
        assert is_prime(15) == False

    def test_is_prime_3(self):
        """
        Test case for is_prime(2) == True
        """
        assert is_prime(2) == True

    def test_is_prime_4(self):
        """
        Test case for is_prime(3) == True
        """
        assert is_prime(3) == True

    def test_is_prime_5(self):
        """
        Test case for is_prime(4) == False
        """
        assert is_prime(4) == False

    def test_is_prime_6(self):
        """
        Test case for is_prime(5) == True
        """
        assert is_prime(5) == True

    def test_is_prime_7(self):
        """
        Test case for is_prime(6) == False
        """
        assert is_prime(6) == False

    def test_is_prime_8(self):
        """
        Test case for is_prime(7) == True
        """
        assert is_prime(7) == True

    def test_is_prime_9(self):
        """
        Test case for is_prime(8) == False
        """
        assert is_prime(8) == False

    def test_is_prime_10(self):
        """
        Test case for is_prime(9) == False
        """
        assert is_prime(9) == False

# id_151_Test.py
from scenario3.id_151 import is_prime

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario3.id_151.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for is_prime(7) == True
        """
        assert is_prime(7) == True

    def test_is_prime_2(self):
        """
        Test case for is_prime(15) == False
        """
        assert is_prime(15) == False

    def test_is_prime_3(self):
        """
        Test