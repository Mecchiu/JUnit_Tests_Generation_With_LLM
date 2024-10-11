# id_9_Test.java
from scenario2.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario2.id_9.rolling_max`.
    """


    def test_rolling_max_1(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_rolling_max_2(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([5, 4, 3, 2, 1]) == [5, 5, 5, 5, 5]

    def test_rolling_max_3(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5]

    def test_rolling_max_4(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_5(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_6(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_7(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_8(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_9(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_10(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

# id_9_Test.py
from scenario2.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario2.id_9.rolling_max`.
    """
		
    def test_rolling_max_1(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_rolling_max_2(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([5, 4, 3, 2, 1]) == [5, 5, 5, 5, 5]

    def test_rolling_max_3(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5]

    def test_rolling_max_4(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_5(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_6(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_7(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_8(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_9(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_10(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

# id_9_Test.java
from scenario2.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario2.id_9.rolling_max`.
    """
		
    def test_rolling_max_1(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_rolling_max_2(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([5, 4, 3, 2, 1]) == [5, 5, 5, 5, 5]

    def test_rolling_max_3(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5]

    def test_rolling_max_4(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_5(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_6(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_7(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_8(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_9(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_10(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

# id_9_Test.py
from scenario2.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario2.id_9.rolling_max`.
    """
		
    def test_rolling_max_1(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_rolling_max_2(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([5, 4, 3, 2, 1]) == [5, 5, 5, 5, 5]

    def test_rolling_max_3(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5]

    def test_rolling_max_4(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_5(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_6(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_7(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_8(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_9(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_10(self):
        """
        Test case for :func:`scenario2.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

# id_9_Test.java
from scenario2.id_9 import rolling_max

import pytest

class id_9_