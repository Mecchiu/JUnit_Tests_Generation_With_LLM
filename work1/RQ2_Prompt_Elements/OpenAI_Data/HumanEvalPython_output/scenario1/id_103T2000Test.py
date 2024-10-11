# id_103_Test.java
from scenario1.id_103 import rounded_avg

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario1.id_103.rounded_avg`.
    """


    def test_rounded_avg_1(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 2) == '0b1'

    def test_rounded_avg_2(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 3) == '0b10'

    def test_rounded_avg_3(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 4) == '0b11'

    def test_rounded_avg_4(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 5) == '0b100'

    def test_rounded_avg_5(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 6) == '0b101'

    def test_rounded_avg_6(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 7) == '0b110'

    def test_rounded_avg_7(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 8) == '0b111'

    def test_rounded_avg_8(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 9) == '0b1000'

    def test_rounded_avg_9(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 10) == '0b1001'

    def test_rounded_avg_10(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 11) == '0b1010'

# id_103_Test.py
from scenario1.id_103 import rounded_avg

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario1.id_103.rounded_avg`.
    """
		
    def test_rounded_avg_1(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 2) == '0b1'

    def test_rounded_avg_2(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 3) == '0b10'

    def test_rounded_avg_3(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 4) == '0b11'

    def test_rounded_avg_4(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 5) == '0b100'

    def test_rounded_avg_5(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 6) == '0b101'

    def test_rounded_avg_6(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 7) == '0b110'

    def test_rounded_avg_7(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 8) == '0b111'

    def test_rounded_avg_8(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 9) == '0b1000'

    def test_rounded_avg_9(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 10) == '0b1001'

    def test_rounded_avg_10(self):
        """
        Test case for the :func:`scenario1.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 11) == '0b1010'

# id_104.py

def is_prime(n):
    """
    This function checks if a number is prime or not.
    :param n: The number to be checked.
    :return: True if the number is prime, False otherwise.
    """
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

# id_104_Test.java
from scenario1.id_104 import is_prime

import pytest

class id_104_Test:
    """
    Test class of id_104.py.
    It contains ten unit test cases for the :func:`scenario1.id_104.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario1.id_104.is_prime`.
        """
