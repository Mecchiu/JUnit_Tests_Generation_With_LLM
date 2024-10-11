# id_83_Test.java
from scenario2.id_83 import starts_one_ends

import pytest

class id_83_Test:
    """
    Test class of id_83.py.
    It contains ten unit test cases for the :func:`scenario2.id_83.starts_one_ends`.
    """


    def test_starts_one_ends_1(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 1.
        """
        assert starts_one_ends(1) == 1

    def test_starts_one_ends_2(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 2.
        """
        assert starts_one_ends(2) == 19

    def test_starts_one_ends_3(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 3.
        """
        assert starts_one_ends(3) == 180

    def test_starts_one_ends_4(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 4.
        """
        assert starts_one_ends(4) == 1701

    def test_starts_one_ends_5(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 5.
        """
        assert starts_one_ends(5) == 16180

    def test_starts_one_ends_6(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 6.
        """
        assert starts_one_ends(6) == 151701

    def test_starts_one_ends_7(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 7.
        """
        assert starts_one_ends(7) == 1416180

    def test_starts_one_ends_8(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 8.
        """
        assert starts_one_ends(8) == 13151701

    def test_starts_one_ends_9(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 9.
        """
        assert starts_one_ends(9) == 121416180

    def test_starts_one_ends_10(self):
        """
        Test case for the :func:`scenario2.id_83.starts_one_ends` with n = 10.
        """
        assert starts_one_ends(10) == 1114151701

# id_84.py

def is_prime(n):
    """
    Given a positive integer n, return True if n is a prime number, otherwise
    return False.
    """

    if n == 1: return False
    if n == 2: return True
    if n % 2 == 0: return False
    for i in range(3, int(n ** 0.5) + 1, 2):
        if n % i == 0: return False
    return True

# id_84_Test.java
from scenario2.id_84 import is_prime

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains ten unit test cases for the :func:`scenario2.id_84.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 1.
        """
        assert is_prime(1) == False

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 2.
        """
        assert is_prime(2) == True

    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 3.
        """
        assert is_prime(3) == True

    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 4.
        """
        assert is_prime(4) == False

    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 5.
        """
        assert is_prime(5) == True

    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 6.
        """
        assert is_prime(6) == False

    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 7.
        """
        assert is_prime(7) == True

    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 8.
        """
        assert is_prime(8) == False

    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 9.
        """
        assert is_prime(9) == False

    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario2.id_84.is_prime` with n = 10.
        """
        assert is_prime(10) == False

# id_85.py

def is_palindrome(n):
    """
    Given a positive integer n, return True if n is a palindrome number,
    otherwise return False.
    """

    return str(n) == str(n)[::-1]

# id_85_Test.java
from scenario2.id_85 import is_palindrome

import pytest

class id_85_Test:
    """
    Test class of id_85.py.
    It contains ten unit test cases for the :func:`scenario2.id_85.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 1.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 2.
        """
        assert is_palindrome(2) == True

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 3.
        """
        assert is_palindrome(3) == True

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 4.
        """
        assert is_palindrome(4) == True

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 5.
        """
        assert is_palindrome(5) == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 6.
        """
        assert is_palindrome(6) == True

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 7.
        """
        assert is_palindrome(7) == True

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 8.
        """
        assert is_palindrome(8) == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 9.
        """
        assert is_palindrome(9) == True

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario2.id_85.is_palindrome` with n = 10.
        """
        assert is_palindrome(10) == False

# id_86.py

def is_palindrome_2(n):
    """
    Given a positive integer n, return True if n is a palindrome number,
    otherwise return False.
    """

    if n < 0: return False
    if n < 10: return True
    if n % 10 == 0: return False
    rev = 0
    while n > rev:
        rev = rev * 10 + n % 10
        n //= 10
    return n == rev or n == rev // 10

# id_86_Test.java
from scenario2.id_86 import is_palindrome_2

import pytest

class id_86_Test:
    """
    Test class of id_86.py.
    It contains ten unit test cases for the :func:`scenario2.id_86.is_palindrome_2`.
    """
		
    def test_is_palindrome_2_1(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 1.
        """
        assert is_palindrome_2(1) == True

    def test_is_palindrome_2_2(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 2.
        """
        assert is_palindrome_2(2) == True

    def test_is_palindrome_2_3(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 3.
        """
        assert is_palindrome_2(3) == True

    def test_is_palindrome_2_4(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 4.
        """
        assert is_palindrome_2(4) == True

    def test_is_palindrome_2_5(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 5.
        """
        assert is_palindrome_2(5) == True

    def test_is_palindrome_2_6(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 6.
        """
        assert is_palindrome_2(6) == True

    def test_is_palindrome_2_7(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 7.
        """
        assert is_palindrome_2(7) == True

    def test_is_palindrome_2_8(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 8.
        """
        assert is_palindrome_2(8) == True

    def test_is_palindrome_2_9(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 9.
        """
        assert is_palindrome_2(9) == True

    def test_is_palindrome_2_10(self):
        """
        Test case for the :func:`scenario2.id_86.is_palindrome_2` with n = 10.
        """
        assert is_palindrome_2(10) == False

# id_87.py

def is_palindrome_3(n):
    """
    Given a positive integer n, return True if n is a palindrome number,
    otherwise return False.
    """

    if n < 0: return False
    if n < 10: return True
    if n % 10 == 0: return False
    rev = 0
    while n > rev:
        rev = rev * 10 + n % 10
        n //= 10
    return n == rev or n == rev // 10

# id_87_Test.java
from scenario2.id_87 import is_palindrome_3

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario2.id_87.is_palindrome_3`.
    """
		
    def test_is_palindrome_3_1(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 1.
        """
        assert is_palindrome_3(1) == True

    def test_is_palindrome_3_2(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 2.
        """
        assert is_palindrome_3(2) == True

    def test_is_palindrome_3_3(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 3.
        """
        assert is_palindrome_3(3) == True

    def test_is_palindrome_3_4(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 4.
        """
        assert is_palindrome_3(4) == True

    def test_is_palindrome_3_5(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 5.
        """
        assert is_palindrome_3(5) == True

    def test_is_palindrome_3_6(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 6.
        """
        assert is_palindrome_3(6) == True

    def test_is_palindrome_3_7(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 7.
        """
        assert is_palindrome_3(7) == True

    def test_is_palindrome_3_8(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 8.
        """
        assert is_palindrome_3(8) == True

    def test_is_palindrome_3_9(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 9.
        """
        assert is_palindrome_3(9) == True

    def test_is_palindrome_3_10(self):
        """
        Test case for the :func:`scenario2.id_87.is_palindrome_3` with n = 10.
        """