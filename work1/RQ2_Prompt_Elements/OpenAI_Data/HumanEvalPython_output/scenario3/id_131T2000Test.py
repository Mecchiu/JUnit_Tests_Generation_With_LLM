# id_131_Test.java
from scenario3.id_131 import digits

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario3.id_131.digits`.
    """


    def test_digits_1(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(1) == 1

    def test_digits_2(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(4) == 0

    def test_digits_3(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(235) == 15

    def test_digits_4(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(0) == 0

    def test_digits_5(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(123456789) == 945

    def test_digits_6(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(2468) == 0

    def test_digits_7(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(1357) == 35

    def test_digits_8(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(2) == 0

    def test_digits_9(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(3) == 3

    def test_digits_10(self):
        """
        Test case for the :func:`scenario3.id_131.digits`.
        """
        assert digits(5) == 5

# id_132.py

def is_prime(n):
    """Given a positive integer n, return True if it is a prime number,
    otherwise return False.
    For example:
    is_prime(1)  == False
    is_prime(2)  == True
    is_prime(3)  == True
    is_prime(4)  == False
    is_prime(5)  == True
    is_prime(6)  == False
    is_prime(7)  == True
    is_prime(8)  == False
    is_prime(9)  == False
    is_prime(10) == False
    is_prime(11) == True
    is_prime(12) == False
    is_prime(13) == True
    is_prime(14) == False
    is_prime(15) == False
    is_prime(16) == False
    is_prime(17) == True
    is_prime(18) == False
    is_prime(19) == True
    is_prime(20) == False
    is_prime(21) == False
    is_prime(22) == False
    is_prime(23) == True
    is_prime(24) == False
    is_prime(25) == False
    is_prime(26) == False
    is_prime(27) == False
    is_prime(28) == False
    is_prime(29) == True
    is_prime(30) == False
    is_prime(31) == True
    is_prime(32) == False
    is_prime(33) == False
    is_prime(34) == False
    is_prime(35) == False
    is_prime(36) == False
    is_prime(37) == True
    is_prime(38) == False
    is_prime(39) == False
    is_prime(40) == False
    is_prime(41) == True
    is_prime(42) == False
    is_prime(43) == True
    is_prime(44) == False
    is_prime(45) == False
    is_prime(46) == False
    is_prime(47) == True
    is_prime(48) == False
    is_prime(49) == False
    is_prime(50) == False
    is_prime(51) == False
    is_prime(52) == False
    is_prime(53) == True
    is_prime(54) == False
    is_prime(55) == False
    is_prime(56) == False
    is_prime(57) == False
    is_prime(58) == False
    is_prime(59) == True
    is_prime(60) == False
    is_prime(61) == True
    is_prime(62) == False
    is_prime(63) == False
    is_prime(64) == False
    is_prime(65) == False
    is_prime(66) == False
    is_prime(67) == True
    is_prime(68) == False
    is_prime(69) == False
    is_prime(70) == False
    is_prime(71) == True
    is_prime(72) == False
    is_prime(73) == True
    is_prime(74) == False
    is_prime(75) == False
    is_prime(76) == False
    is_prime(77) == False
    is_prime(78) == False
    is_prime(79) == True
    is_prime(80) == False
    is_prime(81) == False
    is_prime(82) == False
    is_prime(83) == True
    is_prime(84) == False
    is_prime(85) == False
    is_prime(86) == False
    is_prime(87) == False
    is_prime(88) == False
    is_prime(89) == True
    is_prime(90) == False
    is_prime(91) == False
    is_prime(92) == False
    is_prime(93) == False
    is_prime(94) == False
    is_prime(95) == False
    is_prime(96) == False
    is_prime(97) == True
    is_prime(98) == False
    is_prime(99) == False
    is_prime(100) == False
    """

    pass

# id_132_Test.java
from scenario3.id_132 import is_prime

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario3.id_132.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario3.id_132.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_