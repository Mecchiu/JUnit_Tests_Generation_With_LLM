# id_92_Test.java
from scenario3.id_92 import any_int

import pytest

class id_92_Test:
    """
    Test class of id_92.py.
    It contains ten unit test cases for the :func:`scenario3.id_92.any_int`.
    """


    def test_any_int_1(self):
        """
        Test case 1 of id_92.py.
        """
        assert any_int(5, 2, 7) == True
		
    def test_any_int_2(self):
        """
        Test case 2 of id_92.py.
        """
        assert any_int(3, 2, 2) == False
		
    def test_any_int_3(self):
        """
        Test case 3 of id_92.py.
        """
        assert any_int(3, -2, 1) == True
		
    def test_any_int_4(self):
        """
        Test case 4 of id_92.py.
        """
        assert any_int(3.6, -2.2, 2) == False
		
    def test_any_int_5(self):
        """
        Test case 5 of id_92.py.
        """
        assert any_int(3, 2, 1) == False
		
    def test_any_int_6(self):
        """
        Test case 6 of id_92.py.
        """
        assert any_int(3, 2, 3) == True
		
    def test_any_int_7(self):
        """
        Test case 7 of id_92.py.
        """
        assert any_int(3, 2, 4) == False
		
    def test_any_int_8(self):
        """
        Test case 8 of id_92.py.
        """
        assert any_int(3, 2, 5) == True
		
    def test_any_int_9(self):
        """
        Test case 9 of id_92.py.
        """
        assert any_int(3, 2, 6) == False
		
    def test_any_int_10(self):
        """
        Test case 10 of id_92.py.
        """
        assert any_int(3, 2, 7) == True
		
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_92_Test.py'])
# id_93.py

def is_prime(num):
    '''
    Create a function that takes a number as an argument and returns True or False depending on whether the number is prime.
    
    Examples
    is_prime(7) ➞ True
    
    is_prime(9) ➞ False
    
    is_prime(10) ➞ False
    
    Notes
    A prime number is a whole number greater than 1, which is only evenly divisible by 1 and itself.
    The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    '''

    
    pass
# id_93_Test.java
from scenario3.id_93 import is_prime

import pytest

class id_93_Test:
    """
    Test class of id_93.py.
    It contains ten unit test cases for the :func:`scenario3.id_93.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 of id_93.py.
        """
        assert is_prime(7) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 of id_93.py.
        """
        assert is_prime(9) == False
		
    def test_is_prime_3(self):
        """
        Test case 3 of id_93.py.
        """
        assert is_prime(10) == False
		
    def test_is_prime_4(self):
        """
        Test case 4 of id_93.py.
        """
        assert is_prime(11) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 of id_93.py.
        """
        assert is_prime(12) == False
		
    def test_is_prime_6(self):
        """
        Test case 6 of id_93.py.
        """
        assert is_prime(13) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 of id_93.py.
        """
        assert is_prime(14) == False
		
    def test_is_prime_8(self):
        """
        Test case 8 of id_93.py.
        """
        assert is_prime(15) == False
		
    def test_is_prime_9(self):
        """
        Test case 9 of id_93.py.
        """
        assert is_prime(16) == False
		
    def test_is_prime_10(self):
        """
        Test case 10 of id_93.py.
        """
        assert is_prime(17) == True
		
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_93_Test.py'])
# id_94.py

def is_prime(num):
    '''
    Create a function that takes a number as an argument and returns True or False depending on whether the number is prime.
    
    Examples
    is_prime(7) ➞ True
    
    is_prime(9) ➞ False
    
    is_prime(10) ➞ False
    
    Notes
    A prime number is a whole number greater than 1, which is only evenly divisible by 1 and itself.
    The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    '''

    
    pass
# id_94_Test.java
from scenario3.id_94 import is_prime

import pytest

class id_94_Test:
    """
    Test class of id_94.py.
    It contains ten unit test cases for the :func:`scenario3.id_94.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 of id_94.py.
        """
        assert is_prime(7) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 of id_94.py.
        """
        assert is_prime(9) == False
		
    def test_is_prime_3(self):
        """
        Test case 3 of id_94.py.
        """
        assert is_prime(10) == False
		
    def test_is_prime_4(self):
        """
        Test case 4 of id_94.py.
        """
        assert is_prime(11) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 of id_94.py.
        """
        assert is_prime(12) == False
		
    def test_is_prime_6(self):
        """
        Test case 6 of id_94.py.
        """
        assert is_prime(13) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 of id_94.py.
        """
        assert is_prime(14) == False
		
    def test_is_prime_8(self):
        """
        Test case 8 of id_94.py.
        """
        assert is_prime(15) == False
		
    def test_is_prime_9(self):
        """
        Test case 9 of id_94.py.
        """
        assert is_prime(16) == False
		
    def test_is_prime_10(self):
        """
        Test case 10 of id_94.py.
        """
        assert is_prime(17) == True
		
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_94_Test.py'])
# id_95.py

def is_prime(num):
    '''
    Create a function that takes a number as an argument and returns True or False depending on whether the number is prime.
    
    Examples
    is_prime(7) ➞ True
    
    is_prime(9) ➞ False
    
    is_prime(10) ➞ False
    
    Notes
    A prime number is a whole number greater than 1, which is only evenly divisible by 1 and itself.
    The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    '''

    
    pass
# id_95_Test.java
from scenario3.id_95 import is_prime

import pytest

class id_95_Test:
    """
    Test class of id_95.py.
    It contains ten unit test cases for the :func:`scenario3.id_95.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 of id_95.py.
        """
        assert is_prime(7) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 of id_95.py.
        """
        assert is_prime(9) == False
		
    def test_is_prime_3(self):
        """
        Test case 3 of id_95.py.
        """
        assert is_prime(10) == False
		
    def test_is_prime_4(self):
        """
        Test case 4 of id_95.py.
        """
        assert is_prime(11) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 of id_95.py.
        """
        assert is_prime(12) == False
		
    def test_is_prime_6(self):
        """
        Test case 6 of id_95.py.
        """
        assert is_prime(13) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 of id_95.py.
        """
        assert is_prime(14) == False
		
    def test_is_prime_8(self):
        """
        Test case 8 of id_95.py.
        """
        assert is_prime(15) == False
		
    def test_is_prime_9(self):
        """
        Test case 9 of id_95.py.
        """
        assert is_prime(16) == False
		
    def test_is_prime_10(self):
        """
        Test case 10 of id_95.py.
        """
        assert is_prime(17) == True
		
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_95_Test.py'])
# id_96.py

def is_prime(num):
    '''
    Create a function that takes a number as an argument and returns True or False depending on whether the number is prime.
    
    Examples
    is_prime(7) ➞ True
    
    is_prime(9) ➞ False
    
    is_prime(10) ➞ False
    
    Notes
    A prime number is a whole number greater than 1, which is only evenly divisible by 1 and itself.
    The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    '''

    
    pass
# id_96_Test.java
from scenario3.id_96 import is_prime

import pytest

class id_96_Test:
    """
    Test class of id_96.py.
    It contains ten unit test cases for the :func:`scenario3.id_96.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 of id_96.py.
        """
        assert is_prime(7) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 of id_96.py.
        """
        assert is_prime(9) == False
		
    def test_is_prime_3(self):
        """
        Test case 3 of id_96.py.
        """
        assert is_prime(10) == False
		
    def test_is_prime_4(self):
        """
        Test case 4 of id_96.py.
        """
        assert is_prime(11) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 of id_96.py.
        """
        assert is_prime(12) == False
		
    def test_is_prime_6(self):
        """
        Test case 6 of id_96.py.
        """
        assert is_prime(13) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 of id_96.py.
        """
        assert is_prime(14) == False
		
    def test_is_prime_8(self):
        """
        Test case 8 of id_96.py.
        """
        assert is_prime(15) == False
		
    def test_is_prime_9(self):
        """
        Test case 9 of id_96.py.
        """
        assert is_prime(16) == False
		
    def test_is_prime_10(self):
        """
        Test case 10 of id_96.py.
        """
        assert is_prime(17) == True
		
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_96_Test.py'])
# id_97.py

def is_prime(num):
    '''
    Create a function that takes a number as an argument and returns True or False depending on whether the number is prime.
    
    Examples
    is_prime(7) ➞ True
    
    is_prime(9) ➞ False
    
    is_prime(10) ➞ False
    
    Notes
    A prime number is a whole number greater than 1, which is only evenly divisible by 1 and itself.
    The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    '''

    
    pass
# id_97_Test.java
from scenario3.id_97 import is_prime

import pytest

class id_97_Test:
    """
    Test class of id_97.py.
    It contains ten unit test cases for the :func:`scenario3.id_97.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 of id_97.py.
        """
        assert is_prime(7) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 of id_97.py.
        """
        assert is_prime(9) == False
		
    def test_is_prime_3(self):
        """
        Test case 3 of id_97.py.
        """
        assert is_prime(10) == False
		
    def test_is_prime_4(self):
        """
        Test case 4 of id_97.py.
        """
        assert is_prime(11) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 of id_97.py.
        """
        assert is_prime(12) == False
		
    def test_is_prime_6(self):
        """
        Test case 6 of id_97.py.
        """
        assert is_prime(13) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 of id_97.py.
        """
        assert is_prime(14) == False
		
    def test_is_prime_