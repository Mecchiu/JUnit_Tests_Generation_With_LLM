# id_75_Test.java
from original.id_75 import is_multiply_prime

import pytest

class id_75_Test:
    """
    Test class of id_75.py.
    It contains ten unit test cases for the :func:`original.id_75.is_multiply_prime`.
    """


    def test_is_multiply_prime_1(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(30) == True
		
    def test_is_multiply_prime_2(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(31) == False
		
    def test_is_multiply_prime_3(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(32) == False
		
    def test_is_multiply_prime_4(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(33) == False
		
    def test_is_multiply_prime_5(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(34) == False
		
    def test_is_multiply_prime_6(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(35) == True
		
    def test_is_multiply_prime_7(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(36) == False
		
    def test_is_multiply_prime_8(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(37) == False
		
    def test_is_multiply_prime_9(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(38) == False
		
    def test_is_multiply_prime_10(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(39) == False
		
# id_75_Test.py
from original.id_75 import is_multiply_prime

import pytest

class id_75_Test:
    """
    Test class of id_75.py.
    It contains ten unit test cases for the :func:`original.id_75.is_multiply_prime`.
    """
		
    def test_is_multiply_prime_1(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(30) == True
		
    def test_is_multiply_prime_2(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(31) == False
		
    def test_is_multiply_prime_3(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(32) == False
		
    def test_is_multiply_prime_4(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(33) == False
		
    def test_is_multiply_prime_5(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(34) == False
		
    def test_is_multiply_prime_6(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(35) == True
		
    def test_is_multiply_prime_7(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(36) == False
		
    def test_is_multiply_prime_8(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(37) == False
		
    def test_is_multiply_prime_9(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(38) == False
		
    def test_is_multiply_prime_10(self):
        """
        Test case for the :func:`original.id_75.is_multiply_prime`.
        """
        assert is_multiply_prime(39) == False
		
# id_76.py

def is_prime(n):
    """Write a function that returns true if the given number is prime and false otherwise.
    Example:
    is_prime(7) == True
    """
    for i in range(2,n):
        if n%i == 0:
            return False
    return True

# id_76_Test.java
from original.id_76 import is_prime

import pytest

class id_76_Test:
    """
    Test class of id_76.py.
    It contains ten unit test cases for the :func:`original.id_76.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(2) == True
		
    def test_is_prime_2(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(3) == True
		
    def test_is_prime_3(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(4) == False
		
    def test_is_prime_4(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(5) == True
		
    def test_is_prime_5(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(6) == False
		
    def test_is_prime_6(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(7) == True
		
    def test_is_prime_7(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(8) == False
		
    def test_is_prime_8(self):
        """
        Test case for the :func:`original.id_76.is_prime`.
        """
        assert is_prime(9) == False
		
    def test_is_prime_9(self):
        """
        Test case for the :func:`original.id_76