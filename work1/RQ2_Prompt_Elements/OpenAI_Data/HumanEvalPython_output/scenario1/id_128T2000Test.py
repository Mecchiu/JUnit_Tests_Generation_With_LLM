# id_128_Test.java
from scenario1.id_128 import prod_signs

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`scenario1.id_128.prod_signs`.
    """


    def test_prod_signs_1(self):
        """
        Test case 1 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([]) == None

    def test_prod_signs_2(self):
        """
        Test case 2 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4, 5]) == 120

    def test_prod_signs_3(self):
        """
        Test case 3 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, -5]) == 120

    def test_prod_signs_4(self):
        """
        Test case 4 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, 5]) == -120

    def test_prod_signs_5(self):
        """
        Test case 5 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4, -5]) == -120

    def test_prod_signs_6(self):
        """
        Test case 6 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, 3, -4, -5]) == 120

    def test_prod_signs_7(self):
        """
        Test case 7 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([1, 2, -3, -4, -5]) == -120

    def test_prod_signs_8(self):
        """
        Test case 8 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([1, -2, -3, -4, -5]) == 120

    def test_prod_signs_9(self):
        """
        Test case 9 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, -5]) == 120

    def test_prod_signs_10(self):
        """
        Test case 10 for :func:`scenario1.id_128.prod_signs`.
        """
        assert prod_signs([0, -2, -3, -4, -5]) == 0

# id_129.py

def prod_signs(arr):

    if not arr: return None
    prod = 0 if 0 in arr else (-1) ** len(list(filter(lambda x: x < 0, arr)))
    return prod * sum([abs(i) for i in arr])

# id_129_Test.java
from scenario1.id_129 import prod_signs

import pytest

class id_129_Test:
    """
    Test class of id_129.py.
    It contains ten unit test cases for the :func:`scenario1.id_129.prod_signs`.
    """
		
    def test_prod_signs_1(self):
        """
        Test case 1 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([]) == None

    def test_prod_signs_2(self):
        """
        Test case 2 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4, 5]) == 120

    def test_prod_signs_3(self):
        """
        Test case 3 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, -5]) == 120

    def test_prod_signs_4(self):
        """
        Test case 4 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, 5]) == -120

    def test_prod_signs_5(self):
        """
        Test case 5 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4, -5]) == -120

    def test_prod_signs_6(self):
        """
        Test case 6 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([1, 2, 3, -4, -5]) == 120

    def test_prod_signs_7(self):
        """
        Test case 7 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([1, 2, -3, -4, -5]) == -120

    def test_prod_signs_8(self):
        """
        Test case 8 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([1, -2, -3, -4, -5]) == 120

    def test_prod_signs_9(self):
        """
        Test case 9 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, -5]) == 120

    def test_prod_signs_10(self):
        """
        Test case 10 for :func:`scenario1.id_129.prod_signs`.
        """
        assert prod_signs([0, -2, -3, -4, -5]) == 0

# id_130.py

def prod_signs(arr):

    if not arr: return None
    prod = 0 if 0 in arr else (-1) ** len(list(filter(lambda x: x < 0, arr)))
    return prod * sum([abs(i) for i in arr])

# id_130_Test.java
from scenario1.id_130 import prod_signs

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario1.id_130.prod_signs`.
    """
		
    def test_prod_signs_1(self):
        """
        Test case 1 for :func:`scenario1.id_130.prod_signs`.
        """
        assert prod_signs([]) == None

    def test_prod_signs_2(self):
        """
        Test case 2 for :func:`scenario1.id_130.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4, 5]) == 120

    def test_prod_signs_3(self):
        """
        Test case 3 for :func:`scenario1.id_130.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, -5]) == 120

    def test_prod_signs_4(self):
        """
        Test case 4 for :func:`scenario1.id_130.prod_signs`.
        """
        assert prod_signs([-1, -2, -3, -4, 5]) == -120

    def test_prod_signs_5(self):
        """
        Test case 5 for :func:`scenario1.id_130.prod_signs`.
        """
        assert prod_signs([1, 2, 3, 4, -5]) == -120

    def test_prod_signs_6(self):
