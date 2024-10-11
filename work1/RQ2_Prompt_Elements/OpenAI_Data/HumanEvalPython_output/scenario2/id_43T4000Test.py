# id_43_Test.java
from scenario2.id_43 import pairs_sum_to_zero

import pytest

class id_43_Test:
    """
    Test class of id_43.py.
    It contains ten unit test cases for the :func:`scenario2.id_43.pairs_sum_to_zero`.
    """


    def test_pairs_sum_to_zero_1(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([1, 2, 3, -2]) == True

    def test_pairs_sum_to_zero_2(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([8, 2, 6, -2]) == True

    def test_pairs_sum_to_zero_3(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([1, 2, 3, 4]) == False

    def test_pairs_sum_to_zero_4(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([]) == False

    def test_pairs_sum_to_zero_5(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([1]) == False

    def test_pairs_sum_to_zero_6(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([0, 0]) == True

    def test_pairs_sum_to_zero_7(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([-1, 1]) == True

    def test_pairs_sum_to_zero_8(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([-1, 1, 0]) == True

    def test_pairs_sum_to_zero_9(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([-1, 1, 0, 0]) == True

    def test_pairs_sum_to_zero_10(self):
        """
        Test case for the :func:`scenario2.id_43.pairs_sum_to_zero`.
        """
        assert pairs_sum_to_zero([-1, 1, 0, 0, 0]) == True