# id_76_Test.java
from original.id_76 import is_simple_power

import pytest

class id_76_Test:
    """
    Test class of id_76.py.
    It contains ten unit test cases for the :func:`original.id_76.is_simple_power`.
    """


    def test_is_simple_power_1(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 4) == True
		
    def test_is_simple_power_2(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(3, 2) == False
		
    def test_is_simple_power_5(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(3, 1) == False
		
    def test_is_simple_power_6(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(5, 3) == False
		
    def test_is_simple_power_7(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_8(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 2) == True
		
    def test_is_simple_power_9(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 3) == True
		
    def test_is_simple_power_10(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 5) == True
		
# id_77.py

def is_power(x, n):
    """Your task is to write a function that returns true if a number x is a power of n and false in other cases.
    x is a power of n if n**int=x
    For example:
    is_power(1, 4) => true
    is_power(2, 2) => true
    is_power(8, 2) => true
    is_power(3, 2) => false
    is_power(3, 1) => false
    is_power(5, 3) => false
    """

    if (n == 1): 
        return (x == 1) 
    power = 1
    while (power < x): 
        power = power * n 
    return (power == x) 

# id_77_Test.java
from original.id_77 import is_power

import pytest

class id_77_Test:
    """
    Test class of id_77.py.
    It contains ten unit test cases for the :func:`original.id_77.is_power`.
    """
		
    def test_is_power_1(self):
        """
        Test case for is_power.
        """
        assert is_power(1, 4) == True
		
    def test_is_power_2(self):
        """
        Test case for is_power.
        """
        assert is_power(2, 2) == True
		
    def test_is_power_3(self):
        """
        Test case for is_power.
        """
        assert is_power(8, 2) == True
		
    def test_is_power_4(self):
        """
        Test case for is_power.
        """
        assert is_power(3, 2) == False
		
    def test_is_power_5(self):
        """
        Test case for is_power.
        """
        assert is_power(3, 1) == False
		
    def test_is_power_6(self):
        """
        Test case for is_power.
        """
        assert is_power(5, 3) == False
		
    def test_is_power_7(self):
        """
        Test case for is_power.
        """
        assert is_power(1, 1) == True
		
    def test_is_power_8(self):
        """
        Test case for is_power.
        """
        assert is_power(1, 2) == True
		
    def test_is_power_9(self):
        """
        Test case for is_power.
        """
        assert is_power(1, 3) == True
		
    def test_is_power_10(self):
        """
        Test case for is_power.
        """
        assert is_power(1, 5) == True
		
# id_78.py

def is_power_of_two(x):
    """Your task is to write a function that returns true if a number x is a power of two and false in other cases.
    x is a power of two if 2**int=x
    For example:
    is_power_of_two(1) => true
    is_power_of_two(2) => true
    is_power_of_two(8) => true
    is_power_of_two(3) => false
    is_power_of_two(5) => false
    """

    if (x == 0): 
        return False
    while (x != 1): 
        if (x % 2 != 0): 
            return False
        x = x // 2
    return True

# id_78_Test.java
from original.id_78 import is_power_of_two

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`original.id_78.is_power_of_two`.
    """
		
    def test_is_power_of_two_1(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(1) == True
		
    def test_is_power_of_two_2(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(2) == True
		
    def test_is_power_of_two_3(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(8) == True
		
    def test_is_power_of_two_4(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(3) == False
		
    def test_is_power_of_two_5(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(5) == False
		
    def test_is_power_of_two_6(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(0) == False
		
    def test_is_power_of_two_7(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(4) == True
		
    def test_is_power_of_two_8(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(16) == True
		
    def test_is_power_of_two_9(self):
        """
        Test case for is_power_of_two.
        """
        assert is_power_of_two(32) == True
		
    def test_is_power_of_two_10(self):
        """
        Test case for is_power_of_