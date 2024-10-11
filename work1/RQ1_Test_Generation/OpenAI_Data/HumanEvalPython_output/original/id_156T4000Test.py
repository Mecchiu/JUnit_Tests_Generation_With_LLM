# id_156_Test.java
from original.id_156 import int_to_mini_roman

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`original.id_156.int_to_mini_roman`.
    """


    def test_int_to_mini_roman_1(self):
        """
        Test case 1 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(19) == 'xix'

    def test_int_to_mini_roman_2(self):
        """
        Test case 2 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(152) == 'clii'

    def test_int_to_mini_roman_3(self):
        """
        Test case 3 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(426) == 'cdxxvi'

    def test_int_to_mini_roman_4(self):
        """
        Test case 4 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1) == 'i'

    def test_int_to_mini_roman_5(self):
        """
        Test case 5 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1000) == 'm'

    def test_int_to_mini_roman_6(self):
        """
        Test case 6 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(999) == 'cmxcix'

    def test_int_to_mini_roman_7(self):
        """
        Test case 7 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(500) == 'd'

    def test_int_to_mini_roman_8(self):
        """
        Test case 8 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(499) == 'cdxcix'

    def test_int_to_mini_roman_9(self):
        """
        Test case 9 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(100) == 'c'

    def test_int_to_mini_roman_10(self):
        """
        Test case 10 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(99) == 'xcix'

# id_156_Test.py
from original.id_156 import int_to_mini_roman

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`original.id_156.int_to_mini_roman`.
    """
		
    def test_int_to_mini_roman_1(self):
        """
        Test case 1 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(19) == 'xix'

    def test_int_to_mini_roman_2(self):
        """
        Test case 2 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(152) == 'clii'

    def test_int_to_mini_roman_3(self):
        """
        Test case 3 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(426) == 'cdxxvi'

    def test_int_to_mini_roman_4(self):
        """
        Test case 4 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1) == 'i'

    def test_int_to_mini_roman_5(self):
        """
        Test case 5 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1000) == 'm'

    def test_int_to_mini_roman_6(self):
        """
        Test case 6 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(999) == 'cmxcix'

    def test_int_to_mini_roman_7(self):
        """
        Test case 7 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(500) == 'd'

    def test_int_to_mini_roman_8(self):
        """
        Test case 8 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(499) == 'cdxcix'

    def test_int_to_mini_roman_9(self):
        """
        Test case 9 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(100) == 'c'

    def test_int_to_mini_roman_10(self):
        """
        Test case 10 for :func:`original.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(99) == 'xcix'

# id_157.py

def int_to_mini_roman(number):
    """
    Given a positive integer, obtain its roman numeral equivalent as a string,
    and return it in lowercase.
    Restrictions: 1 <= num <= 1000

    Examples:
    >>> int_to_mini_roman(19) == 'xix'
    >>> int_to_mini_roman(152) == 'clii'
    >>> int_to_mini_roman(426) == 'cdxxvi'
    """

    num = [1, 4, 5, 9, 10, 40, 50, 90,  
           100, 400, 500, 900, 1000] 
    sym = ["I", "IV", "V", "IX", "X", "XL",  
           "L", "XC", "C", "CD", "D", "CM", "M"] 
    i = 12
    res = ''
    while number: 
        div = number // num[i] 
        number %= num[i] 
        while div: 
            res += sym[i] 
            div -= 1
        i -= 1
    return res.lower()

# id_157_Test.java
from original.id_157 import int_to_mini_roman

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`original.id_157.int_to_mini_roman`.
    """
		
    def test_int_to_mini_roman_1(self):
        """
        Test case 1 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(19) == 'xix'

    def test_int_to_mini_roman_2(self):
        """
        Test case 2 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(152) == 'clii'

    def test_int_to_mini_roman_3(self):
        """
        Test case 3 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(426) == 'cdxxvi'

    def test_int_to_mini_roman_4(self):
        """
        Test case 4 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1) == 'i'

    def test_int_to_mini_roman_5(self):
        """
        Test case 5 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1000) == 'm'

    def test_int_to_mini_roman_6(self):
        """
        Test case 6 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(999) == 'cmxcix'

    def test_int_to_mini_roman_7(self):
        """
        Test case 7 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(500) == 'd'

    def test_int_to_mini_roman_8(self):
        """
        Test case 8 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(499) == 'cdxcix'

    def test_int_to_mini_roman_9(self):
        """
        Test case 9 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(100) == 'c'

    def test_int_to_mini_roman_10(self):
        """
        Test case 10 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(99) == 'xcix'

# id_157_Test.py
from original.id_157 import int_to_mini_roman

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`original.id_157.int_to_mini_roman`.
    """
		
    def test_int_to_mini_roman_1(self):
        """
        Test case 1 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(19) == 'xix'

    def test_int_to_mini_roman_2(self):
        """
        Test case 2 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(152) == 'clii'

    def test_int_to_mini_roman_3(self):
        """
        Test case 3 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(426) == 'cdxxvi'

    def test_int_to_mini_roman_4(self):
        """
        Test case 4 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1) == 'i'

    def test_int_to_mini_roman_5(self):
        """
        Test case 5 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1000) == 'm'

    def test_int_to_mini_roman_6(self):
        """
        Test case 6 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(999) == 'cmxcix'

    def test_int_to_mini_roman_7(self):
        """
        Test case 7 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(500) == 'd'

    def test_int_to_mini_roman_8(self):
        """
        Test case 8 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(499) == 'cdxcix'

    def test_int_to_mini_roman_9(self):
        """
        Test case 9 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(100) == 'c'

    def test_int_to_mini_roman_10(self):
        """
        Test case 10 for :func:`original.id_157.int_to_mini_roman`.
        """
        assert int_to_mini_roman(99) == 'xcix'

# id_158.py

def int_to_mini_roman(number):
    """
    Given a positive integer, obtain its roman numeral equivalent as a string,
    and return it in lowercase.
    Restrictions: 1 <= num <= 1000

    Examples:
    >>> int_to_mini_roman(19) == 'xix'
    >>> int_to_mini_roman(152) == 'clii'
    >>> int_to_mini_roman(426) == 'cdxxvi'
    """

    num = [1, 4, 5, 9, 10, 40, 50, 90,  
           100, 400, 500, 900, 1000] 
    sym = ["I", "IV", "V", "IX", "X", "XL",  
           "L", "XC", "C", "CD", "D", "CM", "M"] 
    i = 12
    res = ''
    while number: 
        div = number // num[i] 
        number %= num[i] 
        while div: 
            res += sym[i] 
            div -= 1
        i -= 1
    return res.lower()

# id_158_Test.java
from original.id_158 import int_to_mini_roman

import pytest

class id_158_Test:
    """
    Test class of id_158.py.
    It contains ten unit test cases for the :func:`original.id_158.int_to_mini_roman`.
    """
		
    def test_int_to_mini_roman_1(self):
        """
        Test case 1 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(19) == 'xix'

    def test_int_to_mini_roman_2(self):
        """
        Test case 2 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(152) == 'clii'

    def test_int_to_mini_roman_3(self):
        """
        Test case 3 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(426) == 'cdxxvi'

    def test_int_to_mini_roman_4(self):
        """
        Test case 4 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1) == 'i'

    def test_int_to_mini_roman_5(self):
        """
        Test case 5 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1000) == 'm'

    def test_int_to_mini_roman_6(self):
        """
        Test case 6 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(999) == 'cmxcix'

    def test_int_to_mini_roman_7(self):
        """
        Test case 7 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_to_mini_roman(500) == 'd'

    def test_int_to_mini_roman_8(self):
        """
        Test case 8 for :func:`original.id_158.int_to_mini_roman`.
        """
        assert int_