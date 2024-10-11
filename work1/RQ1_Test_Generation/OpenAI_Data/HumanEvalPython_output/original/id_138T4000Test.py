# id_138_Test.java
from original.id_138 import is_equal_to_sum_even

import pytest

class id_138_Test:
    """
    Test class of id_138.py.
    It contains ten unit test cases for the :func:`original.id_138.is_equal_to_sum_even`.
    """


    def test_is_equal_to_sum_even_1(self):
        """
        Test case 1 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(4) == False
		
    def test_is_equal_to_sum_even_2(self):
        """
        Test case 2 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(6) == False
		
    def test_is_equal_to_sum_even_3(self):
        """
        Test case 3 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(8) == True
		
    def test_is_equal_to_sum_even_4(self):
        """
        Test case 4 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(10) == False
		
    def test_is_equal_to_sum_even_5(self):
        """
        Test case 5 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(12) == True
		
    def test_is_equal_to_sum_even_6(self):
        """
        Test case 6 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(14) == False
		
    def test_is_equal_to_sum_even_7(self):
        """
        Test case 7 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(16) == True
		
    def test_is_equal_to_sum_even_8(self):
        """
        Test case 8 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(18) == False
		
    def test_is_equal_to_sum_even_9(self):
        """
        Test case 9 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(20) == True
		
    def test_is_equal_to_sum_even_10(self):
        """
        Test case 10 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(22) == False
		
# id_138_Test.py
from original.id_138 import is_equal_to_sum_even

import pytest

class id_138_Test:
    """
    Test class of id_138.py.
    It contains ten unit test cases for the :func:`original.id_138.is_equal_to_sum_even`.
    """
		
    def test_is_equal_to_sum_even_1(self):
        """
        Test case 1 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(4) == False
		
    def test_is_equal_to_sum_even_2(self):
        """
        Test case 2 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(6) == False
		
    def test_is_equal_to_sum_even_3(self):
        """
        Test case 3 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(8) == True
		
    def test_is_equal_to_sum_even_4(self):
        """
        Test case 4 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(10) == False
		
    def test_is_equal_to_sum_even_5(self):
        """
        Test case 5 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(12) == True
		
    def test_is_equal_to_sum_even_6(self):
        """
        Test case 6 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(14) == False
		
    def test_is_equal_to_sum_even_7(self):
        """
        Test case 7 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(16) == True
		
    def test_is_equal_to_sum_even_8(self):
        """
        Test case 8 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(18) == False
		
    def test_is_equal_to_sum_even_9(self):
        """
        Test case 9 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(20) == True
		
    def test_is_equal_to_sum_even_10(self):
        """
        Test case 10 for :func:`original.id_138.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(22) == False
		
# id_139.java

public class id_139 {
    /**
     * Evaluate whether the given number n can be written as the sum of exactly 4 positive odd numbers
     * @param n the given number
     * @return true if the given number n can be written as the sum of exactly 4 positive odd numbers, false otherwise
     */
    public static boolean is_equal_to_sum_odd(int n) {
        return n%2 == 1 && n >= 9;
    }
}

# id_139.py

def is_equal_to_sum_odd(n):
    """Evaluate whether the given number n can be written as the sum of exactly 4 positive odd numbers
    Example
    is_equal_to_sum_odd(5) == False
    is_equal_to_sum_odd(7) == False
    is_equal_to_sum_odd(9) == True
    """

    return n%2 == 1 and n >= 9

# id_139_Test.java
from original.id_139 import is_equal_to_sum_odd

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`original.id_139.is_equal_to_sum_odd`.
    """
		
    def test_is_equal_to_sum_odd_1(self):
        """
        Test case 1 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(5) == False
		
    def test_is_equal_to_sum_odd_2(self):
        """
        Test case 2 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(7) == False
		
    def test_is_equal_to_sum_odd_3(self):
        """
        Test case 3 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(9) == True
		
    def test_is_equal_to_sum_odd_4(self):
        """
        Test case 4 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(11) == False
		
    def test_is_equal_to_sum_odd_5(self):
        """
        Test case 5 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(13) == True
		
    def test_is_equal_to_sum_odd_6(self):
        """
        Test case 6 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(15) == False
		
    def test_is_equal_to_sum_odd_7(self):
        """
        Test case 7 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(17) == True
		
    def test_is_equal_to_sum_odd_8(self):
        """
        Test case 8 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(19) == False
		
    def test_is_equal_to_sum_odd_9(self):
        """
        Test case 9 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(21) == True
		
    def test_is_equal_to_sum_odd_10(self):
        """
        Test case 10 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(23) == False
		
# id_139_Test.py
from original.id_139 import is_equal_to_sum_odd

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`original.id_139.is_equal_to_sum_odd`.
    """
		
    def test_is_equal_to_sum_odd_1(self):
        """
        Test case 1 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(5) == False
		
    def test_is_equal_to_sum_odd_2(self):
        """
        Test case 2 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(7) == False
		
    def test_is_equal_to_sum_odd_3(self):
        """
        Test case 3 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(9) == True
		
    def test_is_equal_to_sum_odd_4(self):
        """
        Test case 4 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(11) == False
		
    def test_is_equal_to_sum_odd_5(self):
        """
        Test case 5 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(13) == True
		
    def test_is_equal_to_sum_odd_6(self):
        """
        Test case 6 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(15) == False
		
    def test_is_equal_to_sum_odd_7(self):
        """
        Test case 7 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(17) == True
		
    def test_is_equal_to_sum_odd_8(self):
        """
        Test case 8 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(19) == False
		
    def test_is_equal_to_sum_odd_9(self):
        """
        Test case 9 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(21) == True
		
    def test_is_equal_to_sum_odd_10(self):
        """
        Test case 10 for :func:`original.id_139.is_equal_to_sum_odd`.
        """
        assert is_equal_to_sum_odd(23) == False
		
# id_140.java

public class id_140 {
    /**
     * Evaluate whether the given number n can be written as the sum of exactly 5 positive even numbers
     * @param n the given number
     * @return true if the given number n can be written as the sum of exactly 5 positive even numbers, false otherwise
     */
    public static boolean is_equal_to_sum_even(int n) {
        return n%2 == 0 && n >= 10;
    }
}

# id_140.py

def is_equal_to_sum_even(n):
    """Evaluate whether the given number n can be written as the sum of exactly 5 positive even numbers
    Example
    is_equal_to_sum_even(6) == False
    is_equal_to_sum_even(8) == False
    is_equal_to_sum_even(10) == True
    """

    return n%2 == 0 and n >= 10

# id_140_Test.java
from original.id_140 import is_equal_to_sum_even

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`original.id_140.is_equal_to_sum_even`.
    """
		
    def test_is_equal_to_sum_even_1(self):
        """
        Test case 1 for :func:`original.id_140.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(6) == False
		
    def test_is_equal_to_sum_even_2(self):
        """
        Test case 2 for :func:`original.id_140.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(8) == False
		
    def test_is_equal_to_sum_even_3(self):
        """
        Test case 3 for :func:`original.id_140.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(10) == True
		
    def test_is_equal_to_sum_even_4(self):
        """
        Test case 4 for :func:`original.id_140.is_equal_to_sum_even`.
        """
        assert is_equal_to_sum_even(12) == False
		
    def test_is_equal_to_sum_even_5(self):
        """
        Test case 5 for :func:`original.id_140.is_equal_to_sum_even`.
        """
        assert is_equal_to_