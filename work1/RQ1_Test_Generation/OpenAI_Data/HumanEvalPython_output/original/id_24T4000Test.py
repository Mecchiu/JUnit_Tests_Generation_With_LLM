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
    >>> is_prime(63)
    False
    >>> is_prime(64)
    False
    >>> is_prime(65)
    False
    >>> is_prime(66)
    False
    >>> is_prime(67)
    True
    >>> is_prime(68)
    False
    >>> is_prime(69)
    False
    >>> is_prime(70)
    False
    >>> is_prime(71)
    True
    >>> is_prime(72)
    False
    >>> is_prime(73)
    True
    >>> is_prime(74)
    False
    >>> is_prime(75)
    False
    >>> is_prime(76)
    False
    >>> is_prime(77)
    False
    >>> is_prime(78)
    False
    >>> is_prime(79)
    True
    >>> is_prime(80)
    False
    >>> is_prime(81)
    False
    >>> is_prime(82)
    False
    >>> is_prime(83)
    True
    >>> is_prime(84)
    False
    >>> is_prime(85)
    False
    >>> is_prime(86)
    False
    >>> is_prime(87)
    False
    >>> is_prime(88)
    False
    >>> is_prime(89)
    True
    >>> is_prime(90)
    False
    >>> is_prime(91)
    False
    >>> is_prime(92)
    False
    >>> is_prime(93)
    False
    >>> is_prime(94)
    False
    >>> is_prime(95)
    False
    >>> is_prime(96)
    False
    >>> is_prime(97)
    True
    >>> is_prime(98)
    False
    >>> is_prime(99)
    False
    >>> is_prime(100)
    False
    """

    if n <= 1:
        return False
    elif n <= 3:
        return True
    elif n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

# id_25_Test.java
from original.id_25 import is_prime

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`original.id_25.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(11) == True

# id_25_Test.py
from original.id_25 import is_prime

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`original.id_25.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """
        Test case for the function :func:`original.id_25.is_prime`.
        """
        assert is_prime(11) == True

# id_26.py


def is_palindrome(s: str) -> bool:
    """ For a given string s, return True if s is a palindrome, False otherwise
    >>> is_palindrome("racecar")
    True
    >>> is_palindrome("hello")
    False
    >>> is_palindrome("")
    True
    >>> is_palindrome("a")
    True
    >>> is_palindrome("aa")
    True
    >>> is_palindrome("ab")
    False
    >>> is_palindrome("aba")
    True
    >>> is_palindrome("abba")
    True
    >>> is_palindrome("abcba")
    True
    >>> is_palindrome("abccba")
    True
    >>> is_palindrome("abcdcba")
    True
    >>> is_palindrome("abcddcba")
    True
    >>> is_palindrome("abcdedcba")
    True
    >>> is_palindrome("abcdefedcba")
    True
    >>> is_palindrome("abcdefgfedcba")
    True
    >>>