# id_138_Test.java
from scenario2.id_138 import is_equal_to_sum_even

import pytest

class id_138_Test:
    """
    Test class of id_138.py.
    It contains ten unit test cases for the :func:`scenario2.id_138.is_equal_to_sum_even`.
    """


    def test_is_equal_to_sum_even_1(self):
        """
        Test case 1 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(8) == True
		
    def test_is_equal_to_sum_even_2(self):
        """
        Test case 2 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(10) == False
		
    def test_is_equal_to_sum_even_3(self):
        """
        Test case 3 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(12) == True
		
    def test_is_equal_to_sum_even_4(self):
        """
        Test case 4 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(14) == False
		
    def test_is_equal_to_sum_even_5(self):
        """
        Test case 5 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(16) == True
		
    def test_is_equal_to_sum_even_6(self):
        """
        Test case 6 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(18) == False
		
    def test_is_equal_to_sum_even_7(self):
        """
        Test case 7 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(20) == True
		
    def test_is_equal_to_sum_even_8(self):
        """
        Test case 8 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(22) == False
		
    def test_is_equal_to_sum_even_9(self):
        """
        Test case 9 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(24) == True
		
    def test_is_equal_to_sum_even_10(self):
        """
        Test case 10 for :func:`scenario2.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(26) == False
		
		
# id_139.py

def is_equal_to_sum_odd(n):
    """Evaluate whether the given number n can be written as the sum of exactly 4 positive odd numbers
    

    """

    return n%2 == 1 and n >= 9

# id_139_Test.java
from scenario2.id_139 import is_equal_to_sum_odd

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`scenario2.id_139.is_equal_to_sum_odd`.
    """
		
    def test_is_equal_to_sum_odd_1(self):
        """
        Test case 1 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(9) == True
		
    def test_is_equal_to_sum_odd_2(self):
        """
        Test case 2 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(11) == False
		
    def test_is_equal_to_sum_odd_3(self):
        """
        Test case 3 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(13) == True
		
    def test_is_equal_to_sum_odd_4(self):
        """
        Test case 4 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(15) == False
		
    def test_is_equal_to_sum_odd_5(self):
        """
        Test case 5 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(17) == True
		
    def test_is_equal_to_sum_odd_6(self):
        """
        Test case 6 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(19) == False
		
    def test_is_equal_to_sum_odd_7(self):
        """
        Test case 7 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(21) == True
		
    def test_is_equal_to_sum_odd_8(self):
        """
        Test case 8 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(23) == False
		
    def test_is_equal_to_sum_odd_9(self):
        """
        Test case 9 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(25) == True
		
    def test_is_equal_to_sum_odd_10(self):
        """
        Test case 10 for :func:`scenario2.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(27) == False
		
		
# id_140.py

def is_equal_to_sum_even_odd(n):
    """Evaluate whether the given number n can be written as the sum of exactly 4 positive even and odd numbers
    

    """

    return n%2 == 0 and n >= 10

# id_140_Test.java
from scenario2.id_140 import is_equal_to_sum_even_odd

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`scenario2.id_140.is_equal_to_sum_even_odd`.
    """
		
    def test_is_equal_to_sum_even_odd_1(self):
        """
        Test case 1 for :func:`scenario2.id_140.is_equal_to_sum_even_odd`.
        """
        assert is_equal_to_sum_even_odd(10) == True
		
    def test_is_equal_to_sum_even_odd_2(self):
        """
        Test case 2 for :func:`scenario2.id_140.is_equal_to_sum_even_odd`.
        """
        assert is_equal_to_sum_even_odd(12) == False
		
    def test_is_equal_to_sum_even_odd_3(self):
        """
        Test case 3 for :func:`scenario2.id_140.is_equal_to_sum_even_odd`.
       