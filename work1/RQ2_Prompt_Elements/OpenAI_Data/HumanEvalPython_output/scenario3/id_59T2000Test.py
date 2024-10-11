# id_59_Test.java
from scenario3.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario3.id_59.largest_prime_factor`.
    """


    def test_largest_prime_factor_1(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2048) == 2

    def test_largest_prime_factor_3(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_4(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_5(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_6(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_7(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(11) == 11

    def test_largest_prime_factor_8(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13) == 13

    def test_largest_prime_factor_9(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(17) == 17

    def test_largest_prime_factor_10(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(19) == 19

# id_59_Test.py
from scenario3.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario3.id_59.largest_prime_factor`.
    """
		
    def test_largest_prime_factor_1(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2048) == 2

    def test_largest_prime_factor_3(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_4(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_5(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_6(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_7(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(11) == 11

    def test_largest_prime_factor_8(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13) == 13

    def test_largest_prime_factor_9(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(17) == 17

    def test_largest_prime_factor_10(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(19) == 19

# id_60.py


def prime_permutations(n: int):
    """Return the number of prime permutations of n.
    >>> prime_permutations(13)
    6
    >>> prime_permutations(1487)
    3
    """

    pass

# id_60_Test.java
from scenario3.id_60 import prime_permutations

import pytest

class id_60_Test:
    """
    Test class of id_60.py.
    It contains ten unit test cases for the :func:`scenario3.id_60.prime_permutations`.
    """
		
    def test_prime_permutations_1(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(13) == 6

    def test_prime_permutations_2(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(1487) == 3

    def test_prime_permutations_3(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(2) == 1

    def test_prime_permutations_4(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(3) == 1

    def test_prime_permutations_5(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(5) == 1

    def test_prime_permutations_6(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(7) == 1

    def test_prime_permutations_7(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(11) == 1

    def test_prime_permutations_8(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(13) == 6

    def test_prime_permutations_9(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(17) == 1

    def test_prime_permutations_10(self):
        """
        Test case for the :func:`scenario3.id_60.prime_permutations`.
        """
        assert prime_permutations(19) == 1

# id_60_Test.py
from scenario3.id_60 import prime_permutations

import pytest

class id_60_Test:
    """
    Test class of id_60.