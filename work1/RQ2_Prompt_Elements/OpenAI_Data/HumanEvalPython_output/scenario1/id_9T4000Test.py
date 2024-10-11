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
        assert rolling_max([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_5(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_6(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_7(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_8(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_9(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

    def test_rolling_max_10(self):
        """
        Test case for the :func:`scenario1.id_9.rolling_max`.
        """
        assert rolling_max([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

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
        assert rolling_min([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_5(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_6(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_7(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_8(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_9(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    def test_rolling_min_10(self):
        """
        Test case for the :func:`scenario1.id_10.rolling_min`.
        """
        assert rolling_min([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

# id_11.py
from typing import List, Tuple


def rolling_sum(numbers: List[int]) -> List[int]:

    running_sum = None
    result = []

    for n in numbers:
        if running_sum is None:
            running_sum = n
        else:
            running_sum += n

        result.append(running_sum)

    return result

# id_11_Test.java
from scenario1.id_11 import rolling_sum

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`scenario1.id_11.rolling_sum`.
    """
		
    def test_rolling_sum_1(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5]) == [1, 3, 6, 10, 15]

    def test_rolling_sum_2(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([5, 4, 3, 2, 1]) == [5, 9, 12, 14, 15]

    def test_rolling_sum_3(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 19, 22, 24, 25]

    def test_rolling_sum_4(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 24, 27, 29, 30]

    def test_rolling_sum_5(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 25, 29, 32, 34, 35]

    def test_rolling_sum_6(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 25, 30, 34, 37, 39, 40]

    def test_rolling_sum_7(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 25, 30, 35, 39, 42, 44, 45]

    def test_rolling_sum_8(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 25, 30, 35, 40, 44, 47, 49, 50]

    def test_rolling_sum_9(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 25, 30, 35, 40, 45, 49, 52, 54, 55]

    def test_rolling_sum_10(self):
        """
        Test case for the :func:`scenario1.id_11.rolling_sum`.
        """
        assert rolling_sum([1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 3, 6, 10, 15, 20, 25, 30, 35, 40, 45, 50, 54, 57, 59, 60]

# id_12.py
from typing import List, Tuple


def rolling_product(numbers: List[int]) -> List[int]:

    running_product = None
    result = []

    for n in numbers:
        if running_product is None:
            running_product = n
        else:
            running_product *= n

        result.append(running_product)

    return result

# id_12_Test.java
from scenario1.id_12 import rolling_product

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario1.id_12.rolling_product`.
    """
		
    def test_rolling_product_1(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([1, 2, 3, 4, 5]) == [1, 2, 6, 24, 120]

    def test_rolling_product_2(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([5, 4, 3, 2, 1]) == [5, 20, 60, 120, 120]

    def test_rolling_product_3(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([1, 2, 3, 4, 5, 4, 3, 2, 1]) == [1, 2, 6, 24, 120, 480, 1440, 2880, 2880]

    def test_rolling_product_4(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([1, 2, 3, 4, 5, 5, 4, 3, 2, 1]) == [1, 2, 6, 24, 120, 600, 2400, 7200, 14400, 14400]

    def test_rolling_product_5(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([1, 2, 3, 4, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 6, 24, 120, 600, 3000, 12000, 36000, 72000, 72000]

    def test_rolling_product_6(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([1, 2, 3, 4, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 6, 24, 120, 600, 3000, 15000, 60000, 180000, 360000, 360000]

    def test_rolling_product_7(self):
        """
        Test case for the :func:`scenario1.id_12.rolling_product`.
        """
        assert rolling_product([1, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1]) == [1, 2, 6, 24, 120, 600, 3000, 15000, 75000, 300000, 900000, 1800000, 1800000]

    def test_rolling_product_8(