# id_71_Test.java
from scenario1.id_71 import triangle_area

import pytest

class id_71_Test:
    """
    Test class of id_71.py.
    It contains ten unit test cases for the :func:`scenario1.id_71.triangle_area`.
    """


    def test_triangle_area_1(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(3, 4, 5) == 6.0
		
    def test_triangle_area_2(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(13, 14, 15) == 84.0
		
    def test_triangle_area_3(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
    def test_triangle_area_4(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 3) == -1
		
    def test_triangle_area_5(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 2) == -1
		
    def test_triangle_area_6(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 2) == -1
		
    def test_triangle_area_7(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(2, 2, 2) == 1.73
		
    def test_triangle_area_8(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(2, 2, 3) == -1
		
    def test_triangle_area_9(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(2, 3, 3) == -1
		
    def test_triangle_area_10(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(3, 3, 3) == 3.89
		
		
# id_71_Test.py
from scenario1.id_71 import triangle_area

import pytest

class id_71_Test:
    """
    Test class of id_71.py.
    It contains ten unit test cases for the :func:`scenario1.id_71.triangle_area`.
    """
		
    def test_triangle_area_1(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(3, 4, 5) == 6.0
		
    def test_triangle_area_2(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(13, 14, 15) == 84.0
		
    def test_triangle_area_3(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
    def test_triangle_area_4(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 3) == -1
		
    def test_triangle_area_5(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 2) == -1
		
    def test_triangle_area_6(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 2) == -1
		
    def test_triangle_area_7(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(2, 2, 2) == 1.73
		
    def test_triangle_area_8(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(2, 2, 3) == -1
		
    def test_triangle_area_9(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(2, 3, 3) == -1
		
    def test_triangle_area_10(self):
        """
        Test case for the :func:`scenario1.id_71.triangle_area`.
        """
        assert triangle_area(3, 3, 3) == 3.89
		
		
# id_72.py

def is_prime(n):

    if n <= 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

# id_72_Test.java
from scenario1.id_72 import is_prime

import pytest

class id_72_Test:
    """
    Test class of id_72.py.
    It contains ten unit test cases for the :func:`scenario1.id_72.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(1) == False
		
    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(2) == True
		
    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(3) == True
		
    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(4) == False
		
    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(5) == True
		
    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(6) == False
		
    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(7) == True
		
    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(8) == False
		
    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario1.id_72.is_prime`.
        """
        assert is_prime(9) == False
		
    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario1.