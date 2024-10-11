# id_9_Test.java
from original.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`original.id_9.rolling_max`.
    """


    def test_rolling_max_1(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2]) == [1, 2, 3, 3, 3, 4, 4]

    def test_rolling_max_2(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5]) == [1, 2, 3, 3, 3, 4, 4, 5]

    def test_rolling_max_3(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6]) == [1, 2, 3, 3, 3, 4, 4, 5, 6]

    def test_rolling_max_4(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7]

    def test_rolling_max_5(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8]

    def test_rolling_max_6(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9]

    def test_rolling_max_7(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10]

    def test_rolling_max_8(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11]

    def test_rolling_max_9(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_rolling_max_10(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

# id_9_Test.py
from original.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`original.id_9.rolling_max`.
    """
		
    def test_rolling_max_1(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2]) == [1, 2, 3, 3, 3, 4, 4]

    def test_rolling_max_2(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5]) == [1, 2, 3, 3, 3, 4, 4, 5]

    def test_rolling_max_3(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6]) == [1, 2, 3, 3, 3, 4, 4, 5, 6]

    def test_rolling_max_4(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7]

    def test_rolling_max_5(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8]

    def test_rolling_max_6(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9]

    def test_rolling_max_7(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10]

    def test_rolling_max_8(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11]

    def test_rolling_max_9(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_rolling_max_10(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

# id_9_Test.java
from original.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`original.id_9.rolling_max`.
    """
		
    def test_rolling_max_1(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2]) == [1, 2, 3, 3, 3, 4, 4]

    def test_rolling_max_2(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5]) == [1, 2, 3, 3, 3, 4, 4, 5]

    def test_rolling_max_3(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6]) == [1, 2, 3, 3, 3, 4, 4, 5, 6]

    def test_rolling_max_4(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7]

    def test_rolling_max_5(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8]

    def test_rolling_max_6(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9]

    def test_rolling_max_7(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10]

    def test_rolling_max_8(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11]

    def test_rolling_max_9(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_rolling_max_10(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

# id_9_Test.py
from original.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`original.id_9.rolling_max`.
    """
		
    def test_rolling_max_1(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2]) == [1, 2, 3, 3, 3, 4, 4]

    def test_rolling_max_2(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5]) == [1, 2, 3, 3, 3, 4, 4, 5]

    def test_rolling_max_3(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6]) == [1, 2, 3, 3, 3, 4, 4, 5, 6]

    def test_rolling_max_4(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7]

    def test_rolling_max_5(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8]

    def test_rolling_max_6(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9]

    def test_rolling_max_7(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10]

    def test_rolling_max_8(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11]

    def test_rolling_max_9(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function.
        """
        assert rolling_max([1, 2, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_rolling_max_10(self):
        """
        Test case for the :func:`original.id_9.rolling_max` function