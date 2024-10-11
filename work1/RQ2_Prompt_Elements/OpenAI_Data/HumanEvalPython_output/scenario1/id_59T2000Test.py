# id_59_Test.java
from scenario1.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario1.id_59.largest_prime_factor`.
    """


    def test_largest_prime_factor_1(self):
        """
        Test case 1 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case 2 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(600851475143) == 6857

    def test_largest_prime_factor_3(self):
        """
        Test case 3 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(1) == 1

    def test_largest_prime_factor_4(self):
        """
        Test case 4 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_5(self):
        """
        Test case 5 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_6(self):
        """
        Test case 6 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(4) == 2

    def test_largest_prime_factor_7(self):
        """
        Test case 7 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_8(self):
        """
        Test case 8 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(6) == 3

    def test_largest_prime_factor_9(self):
        """
        Test case 9 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_10(self):
        """
        Test case 10 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(8) == 2

# id_59_Test.py
from scenario1.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario1.id_59.largest_prime_factor`.
    """
		
    def test_largest_prime_factor_1(self):
        """
        Test case 1 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case 2 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(600851475143) == 6857

    def test_largest_prime_factor_3(self):
        """
        Test case 3 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(1) == 1

    def test_largest_prime_factor_4(self):
        """
        Test case 4 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_5(self):
        """
        Test case 5 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_6(self):
        """
        Test case 6 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(4) == 2

    def test_largest_prime_factor_7(self):
        """
        Test case 7 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_8(self):
        """
        Test case 8 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(6) == 3

    def test_largest_prime_factor_9(self):
        """
        Test case 9 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_10(self):
        """
        Test case 10 for :func:`scenario1.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(8) == 2

# id_60.py


def sum_of_primes_below(n: int):
    """
    Returns the sum of all the primes below n.
    :param n: an integer
    :return: the sum of all the primes below n
    """
    def is_prime(k):
        if k < 2:
            return False
        for i in range(2, k - 1):
            if k % i == 0:
                return False
        return True
    sum = 0
    for j in range(2, n):
        if is_prime(j):
            sum += j
    return sum

# id_60_Test.java
from scenario1.id_60 import sum_of_primes_below

import pytest

class id_60_Test:
    """
    Test class of id_60.py.
    It contains ten unit test cases for the :func:`scenario1.id_60.sum_of_primes_below`.
    """
		
    def test_sum_of_primes_below_1(self):
        """
        Test case 1 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(10) == 17

    def test_sum_of_primes_below_2(self):
        """
        Test case 2 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(100) == 1060

    def test_sum_of_primes_below_3(self):
        """
        Test case 3 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(1000) == 76127

    def test_sum_of_primes_below_4(self):
        """
        Test case 4 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(10000) == 5736396

    def test_sum_of_primes_below_5(self):
        """
        Test case 5 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(100000) == 454396537

    def test_sum_of_primes_below_6(self):
        """
        Test case 6 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(1000000) == 37550402023

    def test_sum_of_primes_below_7(self):
        """
        Test case 7 for :func:`scenario1.id_60.sum_of_primes_below`.
        """
        assert sum_of_primes_below(10000000) == 3203324994356

    def test_sum_of_primes_below