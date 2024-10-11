# id_40_Test.java
from original.id_40 import triples_sum_to_zero

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`original.id_40.triples_sum_to_zero`.
    """


    def test_triples_sum_to_zero_1(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, 5, 0]) == False

    def test_triples_sum_to_zero_2(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, -2, 1]) == True

    def test_triples_sum_to_zero_3(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 7]) == False

    def test_triples_sum_to_zero_4(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([2, 4, -5, 3, 9, 7]) == True

    def test_triples_sum_to_zero_5(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1]) == False

    def test_triples_sum_to_zero_6(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == False

    def test_triples_sum_to_zero_7(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == False

    def test_triples_sum_to_zero_8(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([-1, -2, -3, -4, -5, -6, -7, -8, -9, 10]) == True

    def test_triples_sum_to_zero_9(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10]) == True

    def test_triples_sum_to_zero_10(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([0, 0, 0, 0, 0, 0, 0, 0, 0, 0]) == True

# id_40_Test.py
from original.id_40 import triples_sum_to_zero

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`original.id_40.triples_sum_to_zero`.
    """
		
    def test_triples_sum_to_zero_1(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, 5, 0]) == False

    def test_triples_sum_to_zero_2(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, -2, 1]) == True

    def test_triples_sum_to_zero_3(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 7]) == False

    def test_triples_sum_to_zero_4(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([2, 4, -5, 3, 9, 7]) == True

    def test_triples_sum_to_zero_5(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1]) == False

    def test_triples_sum_to_zero_6(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == False

    def test_triples_sum_to_zero_7(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == False

    def test_triples_sum_to_zero_8(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([-1, -2, -3, -4, -5, -6, -7, -8, -9, 10]) == True

    def test_triples_sum_to_zero_9(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10]) == True

    def test_triples_sum_to_zero_10(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([0, 0, 0, 0, 0, 0, 0, 0, 0, 0]) == True

# id_40_Test.java
from original.id_40 import triples_sum_to_zero

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`original.id_40.triples_sum_to_zero`.
    """
		
    def test_triples_sum_to_zero_1(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, 5, 0]) == False

    def test_triples_sum_to_zero_2(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 3, -2, 1]) == True

    def test_triples_sum_to_zero_3(self):
        """
        Test case for the :func:`original.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 7]) == False

    def test_triples_sum_to_zero_4(self):
        """
        Test case for the :