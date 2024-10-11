# id_157_Test.java
from scenario2.id_157 import right_angle_triangle

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`scenario2.id_157.right_angle_triangle`.
    """


    def test_right_angle_triangle_1(self):
        """
        Test case 1 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 4, 5) == True

    def test_right_angle_triangle_2(self):
        """
        Test case 2 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 5, 4) == True

    def test_right_angle_triangle_3(self):
        """
        Test case 3 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(4, 3, 5) == True

    def test_right_angle_triangle_4(self):
        """
        Test case 4 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(4, 5, 3) == True

    def test_right_angle_triangle_5(self):
        """
        Test case 5 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(5, 3, 4) == True

    def test_right_angle_triangle_6(self):
        """
        Test case 6 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(5, 4, 3) == True

    def test_right_angle_triangle_7(self):
        """
        Test case 7 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 3, 3) == False

    def test_right_angle_triangle_8(self):
        """
        Test case 8 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 4, 6) == False

    def test_right_angle_triangle_9(self):
        """
        Test case 9 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(0, 0, 0) == False

    def test_right_angle_triangle_10(self):
        """
        Test case 10 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(1, 1, 1) == False

# id_157_Test.py
from scenario2.id_157 import right_angle_triangle

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`scenario2.id_157.right_angle_triangle`.
    """
		
    def test_right_angle_triangle_1(self):
        """
        Test case 1 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 4, 5) == True

    def test_right_angle_triangle_2(self):
        """
        Test case 2 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 5, 4) == True

    def test_right_angle_triangle_3(self):
        """
        Test case 3 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(4, 3, 5) == True

    def test_right_angle_triangle_4(self):
        """
        Test case 4 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(4, 5, 3) == True

    def test_right_angle_triangle_5(self):
        """
        Test case 5 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(5, 3, 4) == True

    def test_right_angle_triangle_6(self):
        """
        Test case 6 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(5, 4, 3) == True

    def test_right_angle_triangle_7(self):
        """
        Test case 7 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 3, 3) == False

    def test_right_angle_triangle_8(self):
        """
        Test case 8 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 4, 6) == False

    def test_right_angle_triangle_9(self):
        """
        Test case 9 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(0, 0, 0) == False

    def test_right_angle_triangle_10(self):
        """
        Test case 10 for :func:`scenario2.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(1, 1, 1) == False

# id_158.py

def is_prime(n):
    '''
    Given a positive integer n, return True if n is a prime number, False otherwise.
    A prime number is a natural number greater than 1 that has no positive divisors 
    other than 1 and itself.

    '''

    if n <= 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

# id_158_Test.java
from scenario2.id_158 import is_prime

import pytest

class id_158_Test:
    """
    Test class of id_158.py.
    It contains ten unit test cases for the :func:`scenario2.id_158.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`scenario2.id_158.is_prime`.
        """
        assert is_prime(9) == False

   