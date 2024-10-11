# id_77_Test.java
from scenario2.id_77 import iscube

import pytest

class id_77_Test:
    """
    Test class of id_77.py.
    It contains ten unit test cases for the :func:`scenario2.id_77.iscube`.
    """


    def test_iscube_1(self):
        """
        Test case 1 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(27) == True
		
    def test_iscube_2(self):
        """
        Test case 2 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(0) == True
		
    def test_iscube_3(self):
        """
        Test case 3 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(1) == True
		
    def test_iscube_4(self):
        """
        Test case 4 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(-1) == True
		
    def test_iscube_5(self):
        """
        Test case 5 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(8) == False
		
    def test_iscube_6(self):
        """
        Test case 6 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(26) == False
		
    def test_iscube_7(self):
        """
        Test case 7 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(125) == True
		
    def test_iscube_8(self):
        """
        Test case 8 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(-125) == True
		
    def test_iscube_9(self):
        """
        Test case 9 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(64) == True
		
    def test_iscube_10(self):
        """
        Test case 10 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(-64) == True
		
# id_77_Test.py
from scenario2.id_77 import iscube

import pytest

class id_77_Test:
    """
    Test class of id_77.py.
    It contains ten unit test cases for the :func:`scenario2.id_77.iscube`.
    """
		
    def test_iscube_1(self):
        """
        Test case 1 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(27) == True
		
    def test_iscube_2(self):
        """
        Test case 2 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(0) == True
		
    def test_iscube_3(self):
        """
        Test case 3 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(1) == True
		
    def test_iscube_4(self):
        """
        Test case 4 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(-1) == True
		
    def test_iscube_5(self):
        """
        Test case 5 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(8) == False
		
    def test_iscube_6(self):
        """
        Test case 6 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(26) == False
		
    def test_iscube_7(self):
        """
        Test case 7 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(125) == True
		
    def test_iscube_8(self):
        """
        Test case 8 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(-125) == True
		
    def test_iscube_9(self):
        """
        Test case 9 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(64) == True
		
    def test_iscube_10(self):
        """
        Test case 10 for :func:`scenario2.id_77.iscube`.
        """
        assert iscube(-64) == True
		
# id_78.py

def is_prime(n):
    '''
    Write a function that takes an integer n and returns True 
    if this integer is a prime number.
    Note: you may assume the input is always valid.
    
    '''

    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(n ** 0.5) + 1, 2):
        if n % i == 0:
            return False
    return True

# id_78_Test.java
from scenario2.id_78 import is_prime

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`scenario2.id_78.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(2) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(3) == True
		
    def test_is_prime_3(self):
        """
        Test case 3 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(5) == True
		
    def test_is_prime_4(self):
        """
        Test case 4 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(7) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(11) == True
		
    def test_is_prime_6(self):
        """
        Test case 6 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(13) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(17) == True
		
    def test_is_prime_8(self):
        """
        Test case 8 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(19) == True
		
    def test_is_prime_9(self):
        """
        Test case 9 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(23) == True
		
    def test_is_prime_10(self):
        """
        Test case 10 for :func:`scenario2.id_78.is_prime`.
        """
        assert is_prime(29) == True
		
# id_78_Test.py
from scenario2.id_78 import is_prime

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`scenario2.id_78.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id