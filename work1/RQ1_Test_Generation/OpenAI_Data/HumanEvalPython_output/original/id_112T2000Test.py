# id_112_Test.java
from original.id_112 import reverse_delete

import pytest

class id_112_Test:
    """
    Test class of id_112.py.
    It contains ten unit test cases for the :func:`original.id_112.reverse_delete`.
    """


    def test_reverse_delete_1(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcde","ae") == ('bcd',False)

    def test_reverse_delete_2(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdef","b") == ('acdef',False)

    def test_reverse_delete_3(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)

    def test_reverse_delete_4(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdef","abcdef") == ('',True)

    def test_reverse_delete_5(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdef","") == ('abcdef',False)

    def test_reverse_delete_6(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("","abcdef") == ('',True)

    def test_reverse_delete_7(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("","") == ('',True)

    def test_reverse_delete_8(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdef","abcdefg") == ('abcdef',False)

    def test_reverse_delete_9(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdefg","abcdef") == ('g',True)

    def test_reverse_delete_10(self):
        """
        Test case for the function :func:`original.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdefg","abcdefg") == ('',True)

# id_113.py

def is_prime(n):
    """Task
    We are given a number n.
    You should check if it is prime.
    A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    You should return True/False for the check.
    Example
    For n = 2, the result should be True
    For n = 3, the result should be True
    For n = 4, the result should be False
    """

    if n <= 1:
        return False
    for i in range(2,n):
        if n % i == 0:
            return False
    return True

# id_113_Test.java
from original.id_113 import is_prime

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`original.id_113.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """
        Test case for the function :func:`original.id_113.is_prime`.
        """
        assert is_prime(11) == True

# id_114.py

def is_prime_2(n):
    """Task
    We are given a number n.
    You should check if it is prime.
    A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    You should return True/False for the check.
    Example
    For n = 2, the result should be True
    For n = 3, the result should be True
    For n = 4, the result should be False
    """

    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3,n,2):
        if n % i == 0:
            return False
    return True

# id_114_Test.java
from original.id_114 import is_prime_2

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`original.id_114.is_prime_2`.
    """
		
    def test_is_prime_2_1(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(2) == True

    def test_is_prime_2_2(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(3) == True

    def test_is_prime_2_3(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(4) == False

    def test_is_prime_2_4(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(5) == True

    def test_is_prime_2_5(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(6) == False

    def test_is_prime_2_6(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(7) == True

    def test_is_prime_2_7(self):
        """
        Test case for the function :func:`original.id_114.is_prime_2`.
        """
        assert is_prime_2(8)