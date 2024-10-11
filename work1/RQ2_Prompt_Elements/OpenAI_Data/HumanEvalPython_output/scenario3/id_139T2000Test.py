# id_139_Test.java
from scenario3.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`scenario3.id_139.special_factorial`.
    """


    def test_special_factorial_1(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288
		
    def test_special_factorial_2(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560
		
    def test_special_factorial_3(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(6) == 2419200
		
    def test_special_factorial_4(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(7) == 29030400
		
    def test_special_factorial_5(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(8) == 645120000
		
    def test_special_factorial_6(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(9) == 20756736000
		
    def test_special_factorial_7(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(10) == 958003200000
		
    def test_special_factorial_8(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(11) == 55854528000000
		
    def test_special_factorial_9(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(12) == 4461857280000000
		
    def test_special_factorial_10(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(13) == 4461857280000000000
		
# id_139.py

def special_factorial(n):
    """The Brazilian factorial is defined as:
    brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    where n > 0

    For example:
    >>> special_factorial(4)
    288

    The function will receive an integer as input and should return the special
    factorial of this integer.
    """
    if n == 1:
        return 1
    else:
        return n * special_factorial(n-1)
# id_139_Test.java
from scenario3.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`scenario3.id_139.special_factorial`.
    """
		
    def test_special_factorial_1(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288
		
    def test_special_factorial_2(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560
		
    def test_special_factorial_3(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(6) == 2419200
		
    def test_special_factorial_4(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(7) == 29030400
		
    def test_special_factorial_5(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(8) == 645120000
		
    def test_special_factorial_6(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(9) == 20756736000
		
    def test_special_factorial_7(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(10) == 958003200000
		
    def test_special_factorial_8(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(11) == 55854528000000
		
    def test_special_factorial_9(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(12) == 4461857280000000
		
    def test_special_factorial_10(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(13) == 4461857280000000000
		
# id_139.py

def special_factorial(n):
    """The Brazilian factorial is defined as:
    brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    where n > 0

    For example:
    >>> special_factorial(4)
    288

    The function will receive an integer as input and should return the special
    factorial of this integer.
    """
    if n == 1:
        return 1
    else:
        return n * special_factorial(n-1)
# id_139_Test.java
from scenario3.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`scenario3.id_139.special_factorial`.
    """
		
    def test_special_factorial_1(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288
		
    def test_special_factorial_2(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560
		
    def test_special_factorial_3(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(6) == 2419200
		
    def test_special_factorial_4(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(7) == 29030400
		
    def test_special_factorial_5(self):
        """
        Test case for the function :func:`scenario3.id_139.special_factorial`.
        """
        assert special_factorial(8) == 645120000
		
    def test_special_factorial_6(self):
