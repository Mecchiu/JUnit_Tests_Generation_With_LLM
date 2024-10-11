# id_4_Test.java
from scenario1.id_4 import mean_absolute_deviation

import pytest

class id_4_Test:
    """
    Test class of id_4.py.
    It contains ten unit test cases for the :func:`scenario1.id_4.mean_absolute_deviation`.
    """


    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == 1.0

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == 1.0

    def test_mean_absolute_deviation_3(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7]) == 1.0

    def test_mean_absolute_deviation_4(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8]) == 1.0

    def test_mean_absolute_deviation_5(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 1.0

    def test_mean_absolute_deviation_6(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1.0

    def test_mean_absolute_deviation_7(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 1.0

    def test_mean_absolute_deviation_8(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 1.0

    def test_mean_absolute_deviation_9(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 1.0

    def test_mean_absolute_deviation_10(self):
        """
        Test case for the :func:`scenario1.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 1.0

# id_5.py
from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:

    mean = sum(numbers) / len(numbers)
    return sum(abs(x - mean) for x in numbers) / len(numbers)

# id_5_Test.java
from scenario1.id_5 import mean_absolute_deviation

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`scenario1.id_5.mean_absolute_deviation`.
    """
		
    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == 1.0

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == 1.0

    def test_mean_absolute_deviation_3(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7]) == 1.0

    def test_mean_absolute_deviation_4(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8]) == 1.0

    def test_mean_absolute_deviation_5(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 1.0

    def test_mean_absolute_deviation_6(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1.0

    def test_mean_absolute_deviation_7(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 1.0

    def test_mean_absolute_deviation_8(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 1.0

    def test_mean_absolute_deviation_9(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 1.0

    def test_mean_absolute_deviation_10(self):
        """
        Test case for the :func:`scenario1.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 1.0

# id_6.py
from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:

    mean = sum(numbers) / len(numbers)
    return sum(abs(x - mean) for x in numbers) / len(numbers)

# id_6_Test.java
from scenario1.id_6 import mean_absolute_deviation

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario1.id_6.mean_absolute_deviation`.
    """
		
    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == 1.0

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == 1.0

    def test_mean_absolute_deviation_3(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7]) == 1.0

    def test_mean_absolute_deviation_4(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8]) == 1.0

    def test_mean_absolute_deviation_5(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 1.0

    def test_mean_absolute_deviation_6(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1.0

    def test_mean_absolute_deviation_7(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 1.0

    def test_mean_absolute_deviation_8(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 1.0

    def test_mean_absolute_deviation_9(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 1.0

    def test_mean_absolute_deviation_10(self):
        """
        Test case for the :func:`scenario1.id_6.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 1.0

# id_7.py
from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:

    mean = sum(numbers) / len(numbers)
    return sum(abs(x - mean) for x in numbers) / len(numbers)

# id_7_Test.java
from scenario1.id_7 import mean_absolute_deviation

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`scenario1.id_7.mean_absolute_deviation`.
    """
		
    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == 1.0

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == 1.0

    def test_mean_absolute_deviation_3(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7]) == 1.0

    def test_mean_absolute_deviation_4(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8]) == 1.0

    def test_mean_absolute_deviation_5(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 1.0

    def test_mean_absolute_deviation_6(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1.0

    def test_mean_absolute_deviation_7(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 1.0

    def test_mean_absolute_deviation_8(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 1.0

    def test_mean_absolute_deviation_9(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 1.0

    def test_mean_absolute_deviation_10(self):
        """
        Test case for the :func:`scenario1.id_7.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 1.0

# id_8.py
from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:

    mean = sum(numbers) / len(numbers)
    return sum(abs(x - mean) for x in numbers) / len(numbers)

# id_8_Test.java
from scenario1.id_8 import mean_absolute_deviation

import pytest

class id_8_Test:
    """
    Test class of id_8.py.
    It contains ten unit test cases for the :func:`scenario1.id_8.mean_absolute_deviation`.
    """
		
    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario1.id_8.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == 1.0

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario1.id_8.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == 1.0

    def test_mean_absolute_deviation_3(self):
        """
        Test case for