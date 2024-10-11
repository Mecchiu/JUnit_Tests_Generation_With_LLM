# id_131_Test.java
from scenario2.id_131 import digits

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario2.id_131.digits`.
    """


    def test_digits_1(self):
        """
        Test case 1 for :func:`scenario2.id_131.digits`.
        """
        assert digits(123456) == 0
		
    def test_digits_2(self):
        """
        Test case 2 for :func:`scenario2.id_131.digits`.
        """
        assert digits(1357) == 35
		
    def test_digits_3(self):
        """
        Test case 3 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579) == 315
		
    def test_digits_4(self):
        """
        Test case 4 for :func:`scenario2.id_131.digits`.
        """
        assert digits(24680) == 0
		
    def test_digits_5(self):
        """
        Test case 5 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579024680) == 0
		
    def test_digits_6(self):
        """
        Test case 6 for :func:`scenario2.id_131.digits`.
        """
        assert digits(1357913579024680) == 315
		
    def test_digits_7(self):
        """
        Test case 7 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579135790246801) == 315
		
    def test_digits_8(self):
        """
        Test case 8 for :func:`scenario2.id_131.digits`.
        """
        assert digits(135791357902468013579) == 315
		
    def test_digits_9(self):
        """
        Test case 9 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 315
		
    def test_digits_10(self):
        """
        Test case 10 for :func:`scenario2.id_131.digits`.
        """
        assert digits(135791357902468013579135790246801) == 315
		
# id_131_Test.py
from scenario2.id_131 import digits

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario2.id_131.digits`.
    """
		
    def test_digits_1(self):
        """
        Test case 1 for :func:`scenario2.id_131.digits`.
        """
        assert digits(123456) == 0
		
    def test_digits_2(self):
        """
        Test case 2 for :func:`scenario2.id_131.digits`.
        """
        assert digits(1357) == 35
		
    def test_digits_3(self):
        """
        Test case 3 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579) == 315
		
    def test_digits_4(self):
        """
        Test case 4 for :func:`scenario2.id_131.digits`.
        """
        assert digits(24680) == 0
		
    def test_digits_5(self):
        """
        Test case 5 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579024680) == 0
		
    def test_digits_6(self):
        """
        Test case 6 for :func:`scenario2.id_131.digits`.
        """
        assert digits(1357913579024680) == 315
		
    def test_digits_7(self):
        """
        Test case 7 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579135790246801) == 315
		
    def test_digits_8(self):
        """
        Test case 8 for :func:`scenario2.id_131.digits`.
        """
        assert digits(135791357902468013579) == 315
		
    def test_digits_9(self):
        """
        Test case 9 for :func:`scenario2.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 315
		
    def test_digits_10(self):
        """
        Test case 10 for :func:`scenario2.id_131.digits`.
        """
        assert digits(135791357902468013579135790246801) == 315
		
# id_132.py

def is_palindrome(n):
    """Given a positive integer n, return True if n is a palindrome,
    otherwise return False.
    
    """

    n_str = str(n)
    n_str_reverse = n_str[::-1]
    if n_str == n_str_reverse:
        return True
    else:
        return False

# id_132_Test.java
from scenario2.id_132 import is_palindrome

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario2.id_132.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(123) == False
		
    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(121) == True
		
    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(1221) == True
		
    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(1231) == False
		
    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(12321) == True
		
    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(12331) == False
		
    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(123321) == True
		
    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(123331) == False
		
    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(1233321) == True
		
    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_132.is_palind