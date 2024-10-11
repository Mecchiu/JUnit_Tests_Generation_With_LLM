# id_47_Test.java
from scenario2.id_47 import median

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It contains ten unit test cases for the :func:`scenario2.id_47.median`.
    """


    def test_median_1(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5]) == 3

    def test_median_2(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6]) == 3.5

    def test_median_3(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7]) == 4

    def test_median_4(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8]) == 4.5

    def test_median_5(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 5

    def test_median_6(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 5.5

    def test_median_7(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 6

    def test_median_8(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 6.5

    def test_median_9(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 7

    def test_median_10(self):
        """
        Test case for the :func:`scenario2.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 7.5