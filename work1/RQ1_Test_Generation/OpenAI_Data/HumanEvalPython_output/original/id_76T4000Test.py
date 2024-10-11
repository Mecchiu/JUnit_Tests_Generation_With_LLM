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
        Test case for is_power_of_two.
        """
        assert is_power_of_two(64) == True
		
# id_79.py

def is_power_of_three(x):
    """Your task is to write a function that returns true if a number x is a power of three and false in other cases.
    x is a power of three if 3**int=x
    For example:
    is_power_of_three(1) => true
    is_power_of_three(2) => false
    is_power_of_three(8) => false
    is_power_of_three(3) => true
    is_power_of_three(5) => false
    """

    if (x == 0): 
        return False
    while (x != 1): 
        if (x % 3 != 0): 
            return False
        x = x // 3
    return True

# id_79_Test.java
from original.id_79 import is_power_of_three

import pytest

class id_79_Test:
    """
    Test class of id_79.py.
    It contains ten unit test cases for the :func:`original.id_79.is_power_of_three`.
    """
		
    def test_is_power_of_three_1(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(1) == True
		
    def test_is_power_of_three_2(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(2) == False
		
    def test_is_power_of_three_3(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(8) == False
		
    def test_is_power_of_three_4(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(3) == True
		
    def test_is_power_of_three_5(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(5) == False
		
    def test_is_power_of_three_6(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(0) == False
		
    def test_is_power_of_three_7(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(9) == True
		
    def test_is_power_of_three_8(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(27) == True
		
    def test_is_power_of_three_9(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(81) == True
		
    def test_is_power_of_three_10(self):
        """
        Test case for is_power_of_three.
        """
        assert is_power_of_three(243) == True
		
# id_80.py

def is_power_of_four(x):
    """Your task is to write a function that returns true if a number x is a power of four and false in other cases.
    x is a power of four if 4**int=x
    For example:
    is_power_of_four(1) => true
    is_power_of_four(2) => false
    is_power_of_four(8) => false
    is_power_of_four(3) => false
    is_power_of_four(5) => false
    """

    if (x == 0): 
        return False
    while (x != 1): 
        if (x % 4 != 0): 
            return False
        x = x // 4
    return True

# id_80_Test.java
from original.id_80 import is_power_of_four

import pytest

class id_80_Test:
    """
    Test class of id_80.py.
    It contains ten unit test cases for the :func:`original.id_80.is_power_of_four`.
    """
		
    def test_is_power_of_four_1(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(1) == True
		
    def test_is_power_of_four_2(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(2) == False
		
    def test_is_power_of_four_3(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(8) == False
		
    def test_is_power_of_four_4(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(3) == False
		
    def test_is_power_of_four_5(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(5) == False
		
    def test_is_power_of_four_6(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(0) == False
		
    def test_is_power_of_four_7(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(4) == True
		
    def test_is_power_of_four_8(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(16) == True
		
    def test_is_power_of_four_9(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(64) == True
		
    def test_is_power_of_four_10(self):
        """
        Test case for is_power_of_four.
        """
        assert is_power_of_four(256) == True
		
# id_81.py

def is_power_of_five(x):
    """Your task is to write a function that returns true if a number x is a power of five and false in other cases.
    x is a power of five if 5**int=x
    For example:
    is_power_of_five(1) => true
    is_power_of_five(2) => false
    is_power_of_five(8) => false
    is_power_of_five(3) => false
    is_power_of_five(5) => true
    """

    if (x == 0): 
        return False
    while (x != 1): 
        if (x % 5 != 0): 
            return False
        x = x // 5
    return True

# id_81_Test.java
from original.id_81 import is_power_of_five

import pytest

class id_81_Test:
    """
    Test class of id_81.py.
    It contains ten unit test cases for the :func:`original.id_81.is_power_of_five`.
    """
		
    def test_is_power_of_five_1(self):
        """
        Test case for is_power_of_five.
        """
        assert is_power_of_five(1) == True
		
    def test_is_power_of_five_2(self):
