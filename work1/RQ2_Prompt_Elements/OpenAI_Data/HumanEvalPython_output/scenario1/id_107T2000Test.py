# id_107_Test.java
from scenario1.id_107 import even_odd_palindrome

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`scenario1.id_107.even_odd_palindrome`.
    """


    def test_even_odd_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1) == (0, 1)

    def test_even_odd_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(2) == (1, 1)

    def test_even_odd_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(3) == (1, 2)

    def test_even_odd_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(4) == (2, 2)

    def test_even_odd_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(5) == (2, 3)

    def test_even_odd_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(6) == (3, 3)

    def test_even_odd_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(7) == (3, 4)

    def test_even_odd_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(8) == (4, 4)

    def test_even_odd_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(9) == (4, 5)

    def test_even_odd_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10) == (5, 5)

# id_108.py

def is_prime(n):
    """
    This function checks whether a number is prime or not.
    :param n: The number to be checked.
    :return: True if the number is prime, False otherwise.
    """
    if n <= 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def prime_factors(n):
    """
    This function returns the prime factors of a number.
    :param n: The number whose prime factors are to be found.
    :return: A list containing the prime factors of the number.
    """
    prime_factors = []
    for i in range(2, n+1):
        if n % i == 0 and is_prime(i):
            prime_factors.append(i)
    return prime_factors

# id_108_Test.java
from scenario1.id_108 import is_prime, prime_factors

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario1.id_108.is_prime` and :func:`scenario1.id_108.prime_factors`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario1.id_108.is_prime`.
        """
        assert is_prime(10) == False

    def test_prime_factors_1(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(1) == []

    def test_prime_factors_2(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(2) == [2]

    def test_prime_factors_3(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(3) == [3]

    def test_prime_factors_4(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(4) == [2, 2]

    def test_prime_factors_5(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(5) == [5]

    def test_prime_factors_6(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(6) == [2, 3]

    def test_prime_factors_7(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(7) == [7]

    def test_prime_factors_8(self):
        """
        Test case for the :func:`scenario1.id_108.prime_factors`.
        """
        assert prime_factors(8) == [2, 2, 2]

    def test_prime_factors_9(self):
        """
