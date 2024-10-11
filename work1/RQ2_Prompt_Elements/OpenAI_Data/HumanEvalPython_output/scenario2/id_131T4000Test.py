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
		
# id_132.py

def is_palindrome(n):
    """Given a positive integer n, return True if n is a palindrome,
    otherwise return False.
    
    """

    return str(n) == str(n)[::-1]

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
        Test case 10 for :func:`scenario2.id_132.is_palindrome`.
        """
        assert is_palindrome(1233331) == False
		
# id_133.py

def is_prime(n):
    """Given a positive integer n, return True if n is a prime,
    otherwise return False.
    
    """

    if n == 1:
        return False
    for i in range(2, n):
        if n%i == 0:
            return False
    return True

# id_133_Test.java
from scenario2.id_133 import is_prime

import pytest

class id_133_Test:
    """
    Test class of id_133.py.
    It contains ten unit test cases for the :func:`scenario2.id_133.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(1) == False
		
    def test_is_prime_2(self):
        """
        Test case 2 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(2) == True
		
    def test_is_prime_3(self):
        """
        Test case 3 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(3) == True
		
    def test_is_prime_4(self):
        """
        Test case 4 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(4) == False
		
    def test_is_prime_5(self):
        """
        Test case 5 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(5) == True
		
    def test_is_prime_6(self):
        """
        Test case 6 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(6) == False
		
    def test_is_prime_7(self):
        """
        Test case 7 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(7) == True
		
    def test_is_prime_8(self):
        """
        Test case 8 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(8) == False
		
    def test_is_prime_9(self):
        """
        Test case 9 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(9) == False
		
    def test_is_prime_10(self):
        """
        Test case 10 for :func:`scenario2.id_133.is_prime`.
        """
        assert is_prime(10) == False
		
# id_134.py

def is_palindrome_prime(n):
    """Given a positive integer n, return True if n is a palindrome prime,
    otherwise return False.
    
    """

    return is_palindrome(n) and is_prime(n)

# id_134_Test.java
from scenario2.id_134 import is_palindrome_prime

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario2.id_134.is_palindrome_prime`.
    """
		
    def test_is_palindrome_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(1) == False
		
    def test_is_palindrome_prime_2(self):
        """
        Test case 2 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(2) == True
		
    def test_is_palindrome_prime_3(self):
        """
        Test case 3 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(3) == True
		
    def test_is_palindrome_prime_4(self):
        """
        Test case 4 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(4) == False
		
    def test_is_palindrome_prime_5(self):
        """
        Test case 5 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(5) == True
		
    def test_is_palindrome_prime_6(self):
        """
        Test case 6 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(6) == False
		
    def test_is_palindrome_prime_7(self):
        """
        Test case 7 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(7) == True
		
    def test_is_palindrome_prime_8(self):
        """
        Test case 8 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(8) == False
		
    def test_is_palindrome_prime_9(self):
        """
        Test case 9 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(9) == False
		
    def test_is_palindrome_prime_10(self):
        """
        Test case 10 for :func:`scenario2.id_134.is_palindrome_prime`.
        """
        assert is_palindrome_prime(10) == False
		
# id_135.py

def is_palindrome_prime_pair(n):
    """Given a positive integer n, return True if n is a palindrome prime pair,
    otherwise return False.
    
    """

    if n < 10:
        return False
    if is_palindrome_prime(n) and is_palindrome_prime(n//10):
        return True
    else:
        return False

# id_135_Test.java
from scenario2.id_135 import is_palindrome_prime_pair

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario2.id_135.is_palindrome_prime_pair`.
    """
		
    def test_is_palindrome_prime_pair_1(self):
        """
        Test case 1 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(1) == False
		
    def test_is_palindrome_prime_pair_2(self):
        """
        Test case 2 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(2) == False
		
    def test_is_palindrome_prime_pair_3(self):
        """
        Test case 3 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(3) == False
		
    def test_is_palindrome_prime_pair_4(self):
        """
        Test case 4 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(4) == False
		
    def test_is_palindrome_prime_pair_5(self):
        """
        Test case 5 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(5) == False
		
    def test_is_palindrome_prime_pair_6(self):
        """
        Test case 6 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(6) == False
		
    def test_is_palindrome_prime_pair_7(self):
        """
        Test case 7 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(7) == False
		
    def test_is_palindrome_prime_pair_8(self):
        """
        Test case 8 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(8) == False
		
    def test_is_palindrome_prime_pair_9(self):
        """
        Test case 9 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(9) == False
		
    def test_is_palindrome_prime_pair_10(self):
        """
        Test case 10 for :func:`scenario2.id_135.is_palindrome_prime_pair`.
        """
        assert is_palindrome_prime_pair(10) == False
		
# id_136.py

def is_palindrome_prime_pair_pair(n):
    """Given a positive integer n, return True if n is a palindrome prime pair pair,
    otherwise return False.
    
    """

    if n < 100:
        return False
    if is_palindrome_prime_pair(n) and is_palindrome_prime_pair(n//100):
        return True
    else:
        return False

# id_136_Test.java
from scenario2.id_136 import is_palindrome_prime_pair_pair

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario2.id_