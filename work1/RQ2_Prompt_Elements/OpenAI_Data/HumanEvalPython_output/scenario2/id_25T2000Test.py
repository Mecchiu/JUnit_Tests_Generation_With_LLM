# id_25_Test.java
from scenario2.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario2.id_25.factorize`.
    """


    def test_factorize_1(self):
        """
        Test case for factorize function.
        """
        assert factorize(1) == []

    def test_factorize_2(self):
        """
        Test case for factorize function.
        """
        assert factorize(2) == [2]

    def test_factorize_3(self):
        """
        Test case for factorize function.
        """
        assert factorize(3) == [3]

    def test_factorize_4(self):
        """
        Test case for factorize function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_5(self):
        """
        Test case for factorize function.
        """
        assert factorize(5) == [5]

    def test_factorize_6(self):
        """
        Test case for factorize function.
        """
        assert factorize(6) == [2, 3]

    def test_factorize_7(self):
        """
        Test case for factorize function.
        """
        assert factorize(7) == [7]

    def test_factorize_8(self):
        """
        Test case for factorize function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_9(self):
        """
        Test case for factorize function.
        """
        assert factorize(9) == [3, 3]

    def test_factorize_10(self):
        """
        Test case for factorize function.
        """
        assert factorize(10) == [2, 5]

# id_26.py
def is_prime(n: int) -> bool:
    """ Return True if given integer is prime, False otherwise.
    """

    import math
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n) + 1), 2):
        if n % i == 0:
            return False
    return True

# id_26_Test.java
from scenario2.id_26 import is_prime

import pytest

class id_26_Test:
    """
    Test class of id_26.py.
    It contains ten unit test cases for the :func:`scenario2.id_26.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(1) == False

    def test_is_prime_2(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(2) == True

    def test_is_prime_3(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(3) == True

    def test_is_prime_4(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(4) == False

    def test_is_prime_5(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(5) == True

    def test_is_prime_6(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(6) == False

    def test_is_prime_7(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(7) == True

    def test_is_prime_8(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(8) == False

    def test_is_prime_9(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(9) == False

    def test_is_prime_10(self):
        """
        Test case for is_prime function.
        """
        assert is_prime(10) == False

# id_27.py
def is_palindrome(n: int) -> bool:
    """ Return True if given integer is palindrome, False otherwise.
    """

    return str(n) == str(n)[::-1]

# id_27_Test.java
from scenario2.id_27 import is_palindrome

import pytest

class id_27_Test:
    """
    Test class of id_27.py.
    It contains ten unit test cases for the :func:`scenario2.id_27.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_2(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(2) == True

    def test_is_palindrome_3(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(3) == True

    def test_is_palindrome_4(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(4) == True

    def test_is_palindrome_5(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(5) == True

    def test_is_palindrome_6(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(6) == True

    def test_is_palindrome_7(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(7) == True

    def test_is_palindrome_8(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(8) == True

    def test_is_palindrome_9(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(9) == True

    def test_is_palindrome_10(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome(10) == False

# id_28.py
def is_pythagorean_triplet(a: int, b: int, c: int) -> bool:
    """ Return True if given integers form pythagorean triplet, False otherwise.
    """

    return a ** 2 + b ** 2 == c ** 2

# id_28_Test.java
from scenario2.id_28 import is_pythagorean_triplet

import pytest

class id_28_Test:
    """
    Test class of id_28.py.
    It contains ten unit test cases for the :func:`scenario2.id_28.is_pythagorean_triplet`.
    """
		
    def test_is_pythagorean_triplet_1(self):
        """
        Test case for is_pythagorean_triplet function.
        """
        assert is_pythagorean_triplet(3, 4, 5) == True

    def test_is_pythagorean_triplet_2(self):
        """
        Test case for is_pythagorean_triplet function.
        """
        assert is_pythagorean_triplet(5, 12, 13) == True

    def test_is_pythagorean_triplet_3(self):
        """
        Test case for is_pythagorean_triplet function.
        """
        assert is_pythagorean_triplet(8, 15, 17) == True

    def test_is_pythagorean_triplet_4(self):
        """
        Test case for is_pythagorean_triplet function.
        """
        assert is_