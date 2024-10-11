# id_47_Test.java
from scenario3.id_47 import median

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It contains ten unit test cases for the :func:`scenario3.id_47.median`.
    """


    def test_median_1(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([3, 1, 2, 4, 5]) == 3

    def test_median_2(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_3(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_4(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_5(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_6(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_7(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_8(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_9(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_10(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

# id_47_Test.py
from scenario3.id_47 import median

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It contains ten unit test cases for the :func:`scenario3.id_47.median`.
    """
		
    def test_median_1(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([3, 1, 2, 4, 5]) == 3

    def test_median_2(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_3(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_4(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_5(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_6(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_7(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_8(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20]) == 15.0

    def test_median_9(self):
        """
        Test case for the :func:`scenario3.id_47.median`.
        """
        assert median([-10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000, 10, 20, -10, 4, 6, 1000,