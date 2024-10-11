# id_9_Test.java
from scenario1.id_9 import rolling_max

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario1.id_9.rolling_max`.
    """


    def test_rolling_max_1(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_rolling_max_2(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([5, 4, 3, 2, 1]) == [5, 5, 5, 5, 5]

    def test_rolling_max_3(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5]

    def test_rolling_max_4(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5]) == [1, 2, 3, 4, 5, 5, 5, 5, 5]

    def test_rolling_max_5(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_6(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_7(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_8(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_9(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_10(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

# id_10.py
from typing import List, Tuple


def rolling_min(numbers: List[int]) -> List[int]:

    running_min = None
    result = []

    for n in numbers:
        if running_min is None:
            running_min = n
        else:
            running_min = min(running_min, n)

        result.append(running_min)

    return result

# id_10_Test.java
from scenario1.id_10 import rolling_min

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario1.id_10.rolling_min`.
    """
		
    def test_rolling_min_1(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5]) == [1, 1, 1, 1, 1]

    def test_rolling_min_2(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([5, 4, 3, 2, 1]) == [5, 4, 3, 2, 1]

    def test_rolling_min_3(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_4(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5]) == [1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_5(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_6(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_7(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_8(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_9(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert