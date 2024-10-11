# id_155_Test.java
from scenario2.id_155 import even_odd_count

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario2.id_155.even_odd_count`.
    """


    def test_even_odd_count_1(self):
        """
        Test case 1 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(12345) == (2, 3)

    def test_even_odd_count_2(self):
        """
        Test case 2 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789) == (4, 5)

    def test_even_odd_count_3(self):
        """
        Test case 3 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(0) == (1, 0)

    def test_even_odd_count_4(self):
        """
        Test case 4 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(1) == (0, 1)

    def test_even_odd_count_5(self):
        """
        Test case 5 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(2) == (1, 0)

    def test_even_odd_count_6(self):
        """
        Test case 6 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(3) == (0, 1)

    def test_even_odd_count_7(self):
        """
        Test case 7 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(4) == (1, 0)

    def test_even_odd_count_8(self):
        """
        Test case 8 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(5) == (0, 1)

    def test_even_odd_count_9(self):
        """
        Test case 9 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(6) == (1, 0)

    def test_even_odd_count_10(self):
        """
        Test case 10 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(7) == (0, 1)

# id_156.py

def is_palindrome(num):
    """Given an integer. return True if it is a palindrome.



    """

    return str(num) == str(num)[::-1]

# id_156_Test.java
from scenario2.id_156 import is_palindrome

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario2.id_156.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(12345) == False

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(12321) == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(123321) == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(1234321) == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(123454321) == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(123456789) == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(0) == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(2) == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(3) == True

# id_157.py

def is_prime(num):
    """Given an integer. return True if it is a prime number.



    """

    if num < 2:
        return False
    for i in range(2, num):
        if num%i == 0:
            return False
    return True

# id_157_Test.java
from scenario2.id_157 import is_prime

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`scenario2.id_157.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case 9 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """