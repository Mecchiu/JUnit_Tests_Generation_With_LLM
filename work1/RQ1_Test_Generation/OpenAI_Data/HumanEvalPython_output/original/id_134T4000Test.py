# id_134_Test.java
from original.id_134 import check_if_last_char_is_a_letter

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`original.id_134.check_if_last_char_is_a_letter`.
    """


    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case 1 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pie") == False
		
    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case 2 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e") == True
		
    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case 3 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e ") == False
		
    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case 4 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("") == False
		
    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case 5 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a") == True
		
    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case 6 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a ") == False
		
    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case 7 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a a") == False
		
    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case 8 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a a ") == False
		
    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case 9 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a a a") == False
		
    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case 10 for :func:`original.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a a a ") == False
		
# id_135.py

def get_sum_of_digits(num):
    '''
    Create a function that takes a number as an argument,
    adds up all the digits in the number, and returns it.

    Examples:
    get_sum_of_digits(29) ➞ 11
    get_sum_of_digits(0) ➞ 0
    get_sum_of_digits(-32) ➞ 5
    '''

    return sum([int(i) for i in str(abs(num))])

# id_135_Test.java
from original.id_135 import get_sum_of_digits

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`original.id_135.get_sum_of_digits`.
    """
		
    def test_get_sum_of_digits_1(self):
        """
        Test case 1 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(29) == 11
		
    def test_get_sum_of_digits_2(self):
        """
        Test case 2 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(0) == 0
		
    def test_get_sum_of_digits_3(self):
        """
        Test case 3 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(-32) == 5
		
    def test_get_sum_of_digits_4(self):
        """
        Test case 4 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(123) == 6
		
    def test_get_sum_of_digits_5(self):
        """
        Test case 5 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(1234) == 10
		
    def test_get_sum_of_digits_6(self):
        """
        Test case 6 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(12345) == 15
		
    def test_get_sum_of_digits_7(self):
        """
        Test case 7 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(123456) == 21
		
    def test_get_sum_of_digits_8(self):
        """
        Test case 8 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(1234567) == 28
		
    def test_get_sum_of_digits_9(self):
        """
        Test case 9 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(12345678) == 36
		
    def test_get_sum_of_digits_10(self):
        """
        Test case 10 for :func:`original.id_135.get_sum_of_digits`.
        """
        assert get_sum_of_digits(123456789) == 45
		
# id_136.py

def get_sum_of_digits_2(num):
    '''
    Create a function that takes a number as an argument,
    adds up all the digits in the number, and returns it.

    Examples:
    get_sum_of_digits(29) ➞ 11
    get_sum_of_digits(0) ➞ 0
    get_sum_of_digits(-32) ➞ 5
    '''

    return sum([int(i) for i in str(abs(num))])

# id_136_Test.java
from original.id_136 import get_sum_of_digits_2

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`original.id_136.get_sum_of_digits_2`.
    """
		
    def test_get_sum_of_digits_2_1(self):
        """
        Test case 1 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(29) == 11
		
    def test_get_sum_of_digits_2_2(self):
        """
        Test case 2 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(0) == 0
		
    def test_get_sum_of_digits_2_3(self):
        """
        Test case 3 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(-32) == 5
		
    def test_get_sum_of_digits_2_4(self):
        """
        Test case 4 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(123) == 6
		
    def test_get_sum_of_digits_2_5(self):
        """
        Test case 5 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(1234) == 10
		
    def test_get_sum_of_digits_2_6(self):
        """
        Test case 6 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(12345) == 15
		
    def test_get_sum_of_digits_2_7(self):
        """
        Test case 7 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(123456) == 21
		
    def test_get_sum_of_digits_2_8(self):
        """
        Test case 8 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(1234567) == 28
		
    def test_get_sum_of_digits_2_9(self):
        """
        Test case 9 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(12345678) == 36
		
    def test_get_sum_of_digits_2_10(self):
        """
        Test case 10 for :func:`original.id_136.get_sum_of_digits_2`.
        """
        assert get_sum_of_digits_2(123456789) == 45
		
# id_137.py

def get_sum_of_digits_3(num):
    '''
    Create a function that takes a number as an argument,
    adds up all the digits in the number, and returns it.

    Examples:
    get_sum_of_digits(29) ➞ 11
    get_sum_of_digits(0) ➞ 0
    get_sum_of_digits(-32) ➞ 5
    '''

    return sum([int(i) for i in str(abs(num))])

# id_137_Test.java
from original.id_137 import get_sum_of_digits_3

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`original.id_137.get_sum_of_digits_3`.
    """
		
    def test_get_sum_of_digits_3_1(self):
        """
        Test case 1 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(29) == 11
		
    def test_get_sum_of_digits_3_2(self):
        """
        Test case 2 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(0) == 0
		
    def test_get_sum_of_digits_3_3(self):
        """
        Test case 3 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(-32) == 5
		
    def test_get_sum_of_digits_3_4(self):
        """
        Test case 4 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(123) == 6
		
    def test_get_sum_of_digits_3_5(self):
        """
        Test case 5 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(1234) == 10
		
    def test_get_sum_of_digits_3_6(self):
        """
        Test case 6 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(12345) == 15
		
    def test_get_sum_of_digits_3_7(self):
        """
        Test case 7 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(123456) == 21
		
    def test_get_sum_of_digits_3_8(self):
        """
        Test case 8 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(1234567) == 28
		
    def test_get_sum_of_digits_3_9(self):
        """
        Test case 9 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(12345678) == 36
		
    def test_get_sum_of_digits_3_10(self):
        """
        Test case 10 for :func:`original.id_137.get_sum_of_digits_3`.
        """
        assert get_sum_of_digits_3(123456789) == 45
		
# id_138.py

def get_sum_of_digits_4(num):
    '''
    Create a function that takes a number as an argument,
    adds up all the digits in the number, and returns it.

    Examples:
    get_sum_of_digits(29) ➞ 11
    get_sum_of_digits(0) ➞ 0
    get_sum_of_digits(-32) ➞ 5
    '''

    return sum([int(i) for i in str(abs(num))])

# id_138_Test.java
from original.id_138 import get_sum_of_digits_4

import pytest

class id_138_Test:
    """
    Test class of id_138.py.
    It contains ten unit test cases for the :func:`original.id_138.get_sum_of_digits_4`.
    """
		
    def test_get_sum_of_digits_4_1(self):
        """
        Test case 1 for :func:`original.id_138.get_sum_of_digits_4`.
        """
        assert get_sum_of_digits_4(29