# id_131_Test.java
from scenario1.id_131 import digits

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario1.id_131.digits`.
    """


    def test_digits_1(self):
        """
        Test case 1 for :func:`scenario1.id_131.digits`.
        """
        assert digits(123456) == 0

    def test_digits_2(self):
        """
        Test case 2 for :func:`scenario1.id_131.digits`.
        """
        assert digits(1357) == 35

    def test_digits_3(self):
        """
        Test case 3 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579) == 135

    def test_digits_4(self):
        """
        Test case 4 for :func:`scenario1.id_131.digits`.
        """
        assert digits(24680) == 0

    def test_digits_5(self):
        """
        Test case 5 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579024680) == 0

    def test_digits_6(self):
        """
        Test case 6 for :func:`scenario1.id_131.digits`.
        """
        assert digits(1357913579024680) == 0

    def test_digits_7(self):
        """
        Test case 7 for :func:`scenario1.id_131.digits`.
        """
        assert digits(135791357902468013579) == 0

    def test_digits_8(self):
        """
        Test case 8 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

    def test_digits_9(self):
        """
        Test case 9 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

    def test_digits_10(self):
        """
        Test case 10 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

# id_131_Test.py
from scenario1.id_131 import digits

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario1.id_131.digits`.
    """
		
    def test_digits_1(self):
        """
        Test case 1 for :func:`scenario1.id_131.digits`.
        """
        assert digits(123456) == 0

    def test_digits_2(self):
        """
        Test case 2 for :func:`scenario1.id_131.digits`.
        """
        assert digits(1357) == 35

    def test_digits_3(self):
        """
        Test case 3 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579) == 135

    def test_digits_4(self):
        """
        Test case 4 for :func:`scenario1.id_131.digits`.
        """
        assert digits(24680) == 0

    def test_digits_5(self):
        """
        Test case 5 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579024680) == 0

    def test_digits_6(self):
        """
        Test case 6 for :func:`scenario1.id_131.digits`.
        """
        assert digits(1357913579024680) == 0

    def test_digits_7(self):
        """
        Test case 7 for :func:`scenario1.id_131.digits`.
        """
        assert digits(135791357902468013579) == 0

    def test_digits_8(self):
        """
        Test case 8 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

    def test_digits_9(self):
        """
        Test case 9 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

    def test_digits_10(self):
        """
        Test case 10 for :func:`scenario1.id_131.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

# id_132.py

def digits(n):

    product = 1
    odd_count = 0
    for digit in str(n):
        int_digit = int(digit)
        if int_digit%2 == 1:
            product= product*int_digit
            odd_count+=1
    if odd_count ==0:
        return 0
    else:
        return product

# id_132_Test.java
from scenario1.id_132 import digits

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario1.id_132.digits`.
    """
		
    def test_digits_1(self):
        """
        Test case 1 for :func:`scenario1.id_132.digits`.
        """
        assert digits(123456) == 0

    def test_digits_2(self):
        """
        Test case 2 for :func:`scenario1.id_132.digits`.
        """
        assert digits(1357) == 35

    def test_digits_3(self):
        """
        Test case 3 for :func:`scenario1.id_132.digits`.
        """
        assert digits(13579) == 135

    def test_digits_4(self):
        """
        Test case 4 for :func:`scenario1.id_132.digits`.
        """
        assert digits(24680) == 0

    def test_digits_5(self):
        """
        Test case 5 for :func:`scenario1.id_132.digits`.
        """
        assert digits(13579024680) == 0

    def test_digits_6(self):
        """
        Test case 6 for :func:`scenario1.id_132.digits`.
        """
        assert digits(1357913579024680) == 0

    def test_digits_7(self):
        """
        Test case 7 for :func:`scenario1.id_132.digits`.
        """
        assert digits(135791357902468013579) == 0

    def test_digits_8(self):
        """
        Test case 8 for :func:`scenario1.id_132.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

    def test_digits_9(self):
        """
        Test case 9 for :func:`scenario1.id_132.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

    def test_digits_10(self):
        """
        Test case 10 for :func:`scenario1.id_132.digits`.
        """
        assert digits(13579135790246801357913579024680) == 0

# id_132_Test.py
from scenario1.id_132 import digits

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario1.id_132.digits`.
    """
		
    def test_digits_1(self):
        """
        Test case 1 for :func:`scenario1.id_132.dig