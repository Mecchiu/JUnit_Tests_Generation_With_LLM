# id_83_Test.java
from original.id_83 import starts_one_ends

import pytest

class id_83_Test:
    """
    Test class of id_83.py.
    It contains ten unit test cases for the :func:`original.id_83.starts_one_ends`.
    """


    def test_starts_one_ends_1(self):
        """
        Test case for the function :func:`original.id_83.starts_one_ends`.
        """
        assert starts_one_ends(1) == 1
        assert starts_one_ends(2) == 19
        assert starts_one_ends(3) == 190
        assert starts_one_ends(4) == 1900
        assert starts_one_ends(5) == 19000
        assert starts_one_ends(6) == 190000
        assert starts_one_ends(7) == 1900000
        assert starts_one_ends(8) == 19000000
        assert starts_one_ends(9) == 190000000
        assert starts_one_ends(10) == 1900000000

# id_84.py

def is_prime(n):
    """
    Given a positive integer n, return True if n is a prime number,
    otherwise return False.
    """

    if n == 1: return False
    if n == 2: return True
    if n % 2 == 0: return False
    for i in range(3, int(n ** 0.5) + 1, 2):
        if n % i == 0: return False
    return True

def prime_factors(n):
    """
    Given a positive integer n, return a list of its prime factors.
    """

    factors = []
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0 and is_prime(i):
            factors.append(i)
    return factors

def prime_factor_count(n):
    """
    Given a positive integer n, return the count of its prime factors.
    """

    return len(prime_factors(n))

def prime_factor_count_sum(n):
    """
    Given a positive integer n, return the sum of the count of its prime factors.
    """

    return sum(prime_factor_count(i) for i in range(1, n + 1))

# id_84_Test.java
from original.id_84 import is_prime, prime_factors, prime_factor_count, prime_factor_count_sum

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains four unit test cases for the :func:`original.id_84.is_prime`,
    :func:`original.id_84.prime_factors`, :func:`original.id_84.prime_factor_count`,
    and :func:`original.id_84.prime_factor_count_sum`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_84.is_prime`.
        """
        assert is_prime(1) == False
        assert is_prime(2) == True
        assert is_prime(3) == True
        assert is_prime(4) == False
        assert is_prime(5) == True
        assert is_prime(6) == False
        assert is_prime(7) == True
        assert is_prime(8) == False
        assert is_prime(9) == False
        assert is_prime(10) == False
        assert is_prime(11) == True
        assert is_prime(12) == False
        assert is_prime(13) == True
        assert is_prime(14) == False
        assert is_prime(15) == False
        assert is_prime(16) == False
        assert is_prime(17) == True
        assert is_prime(18) == False
        assert is_prime(19) == True
        assert is_prime(20) == False
        assert is_prime(21) == False
        assert is_prime(22) == False
        assert is_prime(23) == True
        assert is_prime(24) == False
        assert is_prime(25) == False
        assert is_prime(26) == False
        assert is_prime(27) == False
        assert is_prime(28) == False
        assert is_prime(29) == True
        assert is_prime(30) == False
        assert is_prime(31) == True
        assert is_prime(32) == False
        assert is_prime(33) == False
        assert is_prime(34) == False
        assert is_prime(35) == False
        assert is_prime(36) == False
        assert is_prime(37) == True
        assert is_prime(38) == False
        assert is_prime(39) == False
        assert is_prime(40) == False
        assert is_prime(41) == True
        assert is_prime(42) == False
        assert is_prime(43) == True
        assert is_prime(44) == False
        assert is_prime(45) == False
        assert is_prime(46) == False
        assert is_prime(47) == True
        assert is_prime(48) == False
        assert is_prime(49) == False
        assert is_prime(50) == False
        assert is_prime(51) == False
        assert is_prime(52) == False
        assert is_prime(53) == True
        assert is_prime(54) == False
        assert is_prime(55) == False
        assert is_prime(56) == False
        assert is_prime(57) == False
        assert is_prime(58) == False
        assert is_prime(59) == True
        assert is_prime(60) == False
        assert is_prime(61) == True
        assert is_prime(62) == False
        assert is_prime(63) == False
        assert is_prime(64) == False
        assert is_prime(65) == False
        assert is_prime(66) == False
        assert is_prime(67) == True
        assert is_prime(68) == False
        assert is_prime(69) == False
        assert is_prime(70) == False
        assert is_prime(71) == True
        assert is_prime(72) == False
        assert is_prime(73) == True
        assert is_prime(74) == False
        assert is_prime(75) == False
        assert is_prime(76) == False
        assert is_prime(77) == False
        assert is_prime(78) == False
        assert is_prime(79) == True
        assert is_prime(80) == False
        assert is_prime(81) == False
        assert is_prime(82) == False
        assert is_prime(83) == True
        assert is_prime(84) == False
        assert is_prime(85) == False
        assert is_prime(86) == False
        assert is_prime(87) == False
        assert is_prime(88) == False
        assert is_prime(89) == True
        assert is_prime(90) == False
        assert is_prime(91) == False
        assert is_prime(92) == False
        assert is_prime(93) == False
        assert is_prime(94) == False
        assert is_prime(95) == False
        assert is_prime(96) == False
        assert is_prime(97) == True
        assert is_prime(98) == False
        assert is_prime(99) == False
        assert is_prime(100) == False
        assert is_prime(101) == True
        assert is_prime(102) == False
        assert is_prime(103) == True
        assert is_prime(104) == False
        assert is_prime(105) == False
        assert is_prime(106) == False
        assert is_prime(107) == True
        assert is_prime(108) == False
        assert is_prime(109) == True
        assert is_prime(110) == False
        assert is_prime(111) == False
        assert is_prime(112) == False
        assert is_prime(113) == True
        assert is_prime(114) == False
        assert is_prime(115) == False
        assert is_prime(116) == False
        assert is_prime(117) == False
        assert is_prime(118) == False
        assert is_prime(119) == False
        assert is_prime(120) == False
        assert