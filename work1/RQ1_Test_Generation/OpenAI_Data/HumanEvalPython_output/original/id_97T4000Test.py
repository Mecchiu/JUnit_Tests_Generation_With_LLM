# id_97_Test.java
from original.id_97 import multiply

import pytest

class id_97_Test:
    """
    Test class of id_97.py.
    It contains ten unit test cases for the :func:`original.id_97.multiply`.
    """


    def test_multiply_1(self):
        """
        Test case 1 for :func:`original.id_97.multiply`.
        """
        assert multiply(148, 412) == 16

    def test_multiply_2(self):
        """
        Test case 2 for :func:`original.id_97.multiply`.
        """
        assert multiply(19, 28) == 72

    def test_multiply_3(self):
        """
        Test case 3 for :func:`original.id_97.multiply`.
        """
        assert multiply(2020, 1851) == 0

    def test_multiply_4(self):
        """
        Test case 4 for :func:`original.id_97.multiply`.
        """
        assert multiply(14,-15) == 20

    def test_multiply_5(self):
        """
        Test case 5 for :func:`original.id_97.multiply`.
        """
        assert multiply(0, 0) == 0

    def test_multiply_6(self):
        """
        Test case 6 for :func:`original.id_97.multiply`.
        """
        assert multiply(0, 1) == 0

    def test_multiply_7(self):
        """
        Test case 7 for :func:`original.id_97.multiply`.
        """
        assert multiply(1, 0) == 0

    def test_multiply_8(self):
        """
        Test case 8 for :func:`original.id_97.multiply`.
        """
        assert multiply(1, 1) == 1

    def test_multiply_9(self):
        """
        Test case 9 for :func:`original.id_97.multiply`.
        """
        assert multiply(1, 2) == 2

    def test_multiply_10(self):
        """
        Test case 10 for :func:`original.id_97.multiply`.
        """
        assert multiply(2, 1) == 2

# id_97_Test.py
from original.id_97 import multiply

import pytest

class id_97_Test:
    """
    Test class of id_97.py.
    It contains ten unit test cases for the :func:`original.id_97.multiply`.
    """
		
    def test_multiply_1(self):
        """
        Test case 1 for :func:`original.id_97.multiply`.
        """
        assert multiply(148, 412) == 16

    def test_multiply_2(self):
        """
        Test case 2 for :func:`original.id_97.multiply`.
        """
        assert multiply(19, 28) == 72

    def test_multiply_3(self):
        """
        Test case 3 for :func:`original.id_97.multiply`.
        """
        assert multiply(2020, 1851) == 0

    def test_multiply_4(self):
        """
        Test case 4 for :func:`original.id_97.multiply`.
        """
        assert multiply(14,-15) == 20

    def test_multiply_5(self):
        """
        Test case 5 for :func:`original.id_97.multiply`.
        """
        assert multiply(0, 0) == 0

    def test_multiply_6(self):
        """
        Test case 6 for :func:`original.id_97.multiply`.
        """
        assert multiply(0, 1) == 0

    def test_multiply_7(self):
        """
        Test case 7 for :func:`original.id_97.multiply`.
        """
        assert multiply(1, 0) == 0

    def test_multiply_8(self):
        """
        Test case 8 for :func:`original.id_97.multiply`.
        """
        assert multiply(1, 1) == 1

    def test_multiply_9(self):
        """
        Test case 9 for :func:`original.id_97.multiply`.
        """
        assert multiply(1, 2) == 2

    def test_multiply_10(self):
        """
        Test case 10 for :func:`original.id_97.multiply`.
        """
        assert multiply(2, 1) == 2

# id_98.py

def is_prime(num):
    """Complete the function that takes one integer argument, 
    and returns true if the integer is a prime number, 
    otherwise false.
    Assume the input is always a non-negative integer.
    Examples:
    is_prime(5) should return True.
    is_prime(10) should return False.
    is_prime(11) should return True.
    """

    if num < 2:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

# id_98_Test.java
from original.id_98 import is_prime

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`original.id_98.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_9(self):
        """
        Test case 9 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_10(self):
        """
        Test case 10 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(6) == False

# id_98_Test.py
from original.id_98 import is_prime

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`original.id_98.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_9(self):
        """
        Test case 9 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_10(self):
        """
        Test case 10 for :func:`original.id_98.is_prime`.
        """
        assert is_prime(6) == False

# id_99.py

def is_prime(num):
    """Complete the function that takes one integer argument, 
    and returns true if the integer is a prime number, 
    otherwise false.
    Assume the input is always a non-negative integer.
    Examples:
    is_prime(5) should return True.
    is_prime(10) should return False.
    is_prime(11) should return True.
    """

    if num < 2:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

# id_99_Test.java
from original.id_99 import is_prime

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`original.id_99.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_9(self):
        """
        Test case 9 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_10(self):
        """
        Test case 10 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(6) == False

# id_99_Test.py
from original.id_99 import is_prime

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`original.id_99.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_9(self):
        """
        Test case 9 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_10(self):
        """
        Test case 10 for :func:`original.id_99.is_prime`.
        """
        assert is_prime(6) == False

# id_100.py

def is_prime(num):
    """Complete the function that takes one integer argument, 
    and returns true if the integer is a prime number, 
    otherwise false.
    Assume the input is always a non-negative integer.
    Examples:
    is_prime(5) should return True.
    is_prime(10) should return False.
    is_prime(11) should return True.
    """

    if num < 2:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

# id_100_Test.java
from original.id_100 import is_prime

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`original.id_100.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`original.id_100.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`original.id_100.is_prime`.
        """
       