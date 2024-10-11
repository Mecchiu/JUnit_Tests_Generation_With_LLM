# id_24_Test.java
from original.id_24 import largest_divisor

import pytest

class id_24_Test:
    """
    Test class of id_24.py.
    It contains ten unit test cases for the :func:`original.id_24.largest_divisor`.
    """


    def test_largest_divisor_1(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(15) == 5

    def test_largest_divisor_2(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(16) == 8

    def test_largest_divisor_3(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(17) == 1

    def test_largest_divisor_4(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(18) == 9

    def test_largest_divisor_5(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(19) == 1

    def test_largest_divisor_6(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(20) == 10

    def test_largest_divisor_7(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(21) == 7

    def test_largest_divisor_8(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(22) == 11

    def test_largest_divisor_9(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(23) == 1

    def test_largest_divisor_10(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(24) == 12

# id_24_Test.py
from original.id_24 import largest_divisor

import pytest

class id_24_Test:
    """
    Test class of id_24.py.
    It contains ten unit test cases for the :func:`original.id_24.largest_divisor`.
    """
		
    def test_largest_divisor_1(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(15) == 5

    def test_largest_divisor_2(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(16) == 8

    def test_largest_divisor_3(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(17) == 1

    def test_largest_divisor_4(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(18) == 9

    def test_largest_divisor_5(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(19) == 1

    def test_largest_divisor_6(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(20) == 10

    def test_largest_divisor_7(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(21) == 7

    def test_largest_divisor_8(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(22) == 11

    def test_largest_divisor_9(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(23) == 1

    def test_largest_divisor_10(self):
        """
        Test case for the function :func:`original.id_24.largest_divisor`.
        """
        assert largest_divisor(24) == 12

# id_25.py


def is_prime(n: int) -> bool:
    """ For a given number n, return True if n is prime, False otherwise
    >>> is_prime(2)
    True
    >>> is_prime(3)
    True
    >>> is_prime(4)
    False
    >>> is_prime(5)
    True
    >>> is_prime(6)
    False
    >>> is_prime(7)
    True
    >>> is_prime(8)
    False
    >>> is_prime(9)
    False
    >>> is_prime(10)
    False
    >>> is_prime(11)
    True
    >>> is_prime(12)
    False
    >>> is_prime(13)
    True
    >>> is_prime(14)
    False
    >>> is_prime(15)
    False
    >>> is_prime(16)
    False
    >>> is_prime(17)
    True
    >>> is_prime(18)
    False
    >>> is_prime(19)
    True
    >>> is_prime(20)
    False
    >>> is_prime(21)
    False
    >>> is_prime(22)
    False
    >>> is_prime(23)
    True
    >>> is_prime(24)
    False
    >>> is_prime(25)
    False
    >>> is_prime(26)
    False
    >>> is_prime(27)
    False
    >>> is_prime(28)
    False
    >>> is_prime(29)
    True
    >>> is_prime(30)
    False
    >>> is_prime(31)
    True
    >>> is_prime(32)
    False
    >>> is_prime(33)
    False
    >>> is_prime(34)
    False
    >>> is_prime(35)
    False
    >>> is_prime(36)
    False
    >>> is_prime(37)
    True
    >>> is_prime(38)
    False
    >>> is_prime(39)
    False
    >>> is_prime(40)
    False
    >>> is_prime(41)
    True
    >>> is_prime(42)
    False
    >>> is_prime(43)
    True
    >>> is_prime(44)
    False
    >>> is_prime(45)
    False
    >>> is_prime(46)
    False
    >>> is_prime(47)
    True
    >>> is_prime(48)
    False
    >>> is_prime(49)
    False
    >>> is_prime(50)
    False
    >>> is_prime(51)
    False
    >>> is_prime(52)
    False
    >>> is_prime(53)
    True
    >>> is_prime(54)
    False
    >>> is_prime(55)
    False
    >>> is_prime(56)
    False
    >>> is_prime(57)
    False
    >>> is_prime(58)
    False
    >>> is_prime(59)
    True
    >>> is_prime(60)
    False
    >>> is_prime(61)
    True
    >>> is_prime(62)
    False
    >>> is_