# id_127_Test.java
from original.id_127 import intersection

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`original.id_127.intersection`.
    """


    def test_intersection_1(self):
        """
        Test case 1 for :func:`original.id_127.intersection`.
        """
        assert intersection((1, 2), (2, 3)) == "NO"

    def test_intersection_2(self):
        """
        Test case 2 for :func:`original.id_127.intersection`.
        """
        assert intersection((-1, 1), (0, 4)) == "NO"

    def test_intersection_3(self):
        """
        Test case 3 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 5)) == "YES"

    def test_intersection_4(self):
        """
        Test case 4 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, -4)) == "NO"

    def test_intersection_5(self):
        """
        Test case 5 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, -2)) == "YES"

    def test_intersection_6(self):
        """
        Test case 6 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, -1)) == "NO"

    def test_intersection_7(self):
        """
        Test case 7 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 0)) == "NO"

    def test_intersection_8(self):
        """
        Test case 8 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 1)) == "NO"

    def test_intersection_9(self):
        """
        Test case 9 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 2)) == "YES"

    def test_intersection_10(self):
        """
        Test case 10 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 3)) == "YES"

# id_127_Test.py
from original.id_127 import intersection

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`original.id_127.intersection`.
    """
		
    def test_intersection_1(self):
        """
        Test case 1 for :func:`original.id_127.intersection`.
        """
        assert intersection((1, 2), (2, 3)) == "NO"

    def test_intersection_2(self):
        """
        Test case 2 for :func:`original.id_127.intersection`.
        """
        assert intersection((-1, 1), (0, 4)) == "NO"

    def test_intersection_3(self):
        """
        Test case 3 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 5)) == "YES"

    def test_intersection_4(self):
        """
        Test case 4 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, -4)) == "NO"

    def test_intersection_5(self):
        """
        Test case 5 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, -2)) == "YES"

    def test_intersection_6(self):
        """
        Test case 6 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, -1)) == "NO"

    def test_intersection_7(self):
        """
        Test case 7 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 0)) == "NO"

    def test_intersection_8(self):
        """
        Test case 8 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 1)) == "NO"

    def test_intersection_9(self):
        """
        Test case 9 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 2)) == "YES"

    def test_intersection_10(self):
        """
        Test case 10 for :func:`original.id_127.intersection`.
        """
        assert intersection((-3, -1), (-5, 3)) == "YES"

# id_128.py

def is_prime(num):
    """You are given a positive integer.
    Your task is to determine whether the number is a prime number.
    If the number is a prime number, return "YES", otherwise, return "NO".

    [input/output] samples:
    is_prime(1) ==> "NO"
    is_prime(2) ==> "YES"
    is_prime(3) ==> "YES"
    is_prime(4) ==> "NO"
    is_prime(5) ==> "YES"
    is_prime(6) ==> "NO"
    is_prime(7) ==> "YES"
    is_prime(8) ==> "NO"
    is_prime(9) ==> "NO"
    is_prime(10) ==> "NO"
    is_prime(11) ==> "YES"
    is_prime(12) ==> "NO"
    is_prime(13) ==> "YES"
    is_prime(14) ==> "NO"
    is_prime(15) ==> "NO"
    is_prime(16) ==> "NO"
    is_prime(17) ==> "YES"
    is_prime(18) ==> "NO"
    is_prime(19) ==> "YES"
    is_prime(20) ==> "NO"
    is_prime(21) ==> "NO"
    is_prime(22) ==> "NO"
    is_prime(23) ==> "YES"
    is_prime(24) ==> "NO"
    is_prime(25) ==> "NO"
    is_prime(26) ==> "NO"
    is_prime(27) ==> "NO"
    is_prime(28) ==> "NO"
    is_prime(29) ==> "YES"
    is_prime(30) ==> "NO"
    is_prime(31) ==> "YES"
    is_prime(32) ==> "NO"
    is_prime(33) ==> "NO"
    is_prime(34) ==> "NO"
    is_prime(35) ==> "NO"
    is_prime(36) ==> "NO"
    is_prime(37) ==> "YES"
    is_prime(38) ==> "NO"
    is_prime(39) ==> "NO"
    is_prime(40) ==> "NO"
    is_prime(41) ==> "YES"
    is_prime(42) ==> "NO"
    is_prime(43) ==> "YES"
    is_prime(44) ==> "NO"
    is_prime(45) ==> "NO"
    is_prime(46) ==> "NO"
    is_prime(47) ==> "YES"
    is_prime(48) ==> "NO"
    is_prime(49) ==> "NO"
    is_prime(50) ==> "NO"
    is_prime(51) ==> "NO"
    is_prime(52) ==> "NO"
    is_prime(53) ==> "YES"
    is_prime(54) ==> "NO"
    is_prime(55) ==> "