# id_4_Test.java
from scenario2.id_4 import mean_absolute_deviation

import pytest

class id_4_Test:
    """
    Test class of id_4.py.
    It contains ten unit test cases for the :func:`scenario2.id_4.mean_absolute_deviation`.
    """


    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == pytest.approx(1.4)

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == pytest.approx(1.1666666666666667)

    def test_mean_absolute_deviation_3(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7]) == pytest.approx(1.0)

    def test_mean_absolute_deviation_4(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8]) == pytest.approx(0.875)

    def test_mean_absolute_deviation_5(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9]) == pytest.approx(0.7777777777777778)

    def test_mean_absolute_deviation_6(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == pytest.approx(0.7)

    def test_mean_absolute_deviation_7(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == pytest.approx(0.6363636363636364)

    def test_mean_absolute_deviation_8(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == pytest.approx(0.5833333333333334)

    def test_mean_absolute_deviation_9(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == pytest.approx(0.5384615384615384)

    def test_mean_absolute_deviation_10(self):
        """
        Test case for the :func:`scenario2.id_4.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == pytest.approx(0.5)

# id_5.py
from typing import List

def mean_absolute_deviation(numbers: List[float]) -> float:
    """ For a given list of input numbers, calculate Mean Absolute Deviation
    around the mean of this dataset.
    Mean Absolute Deviation is the average absolute difference between each
    element and a centerpoint (mean in this case):
    MAD = average | x - x_mean |
    
    """

    mean = sum(numbers) / len(numbers)
    return sum(abs(x - mean) for x in numbers) / len(numbers)

def median_absolute_deviation(numbers: List[float]) -> float:
    """ For a given list of input numbers, calculate Median Absolute Deviation
    around the median of this dataset.
    Median Absolute Deviation is the average absolute difference between each
    element and a centerpoint (median in this case):
    MAD = average | x - x_median |
    
    """

    numbers.sort()
    median = numbers[len(numbers) // 2]
    return sum(abs(x - median) for x in numbers) / len(numbers)

# id_5_Test.java
from scenario2.id_5 import mean_absolute_deviation, median_absolute_deviation

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`scenario2.id_5.mean_absolute_deviation` and :func:`scenario2.id_5.median_absolute_deviation`.
    """
		
    def test_mean_absolute_deviation_1(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5]) == pytest.approx(1.4)

    def test_mean_absolute_deviation_2(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6]) == pytest.approx(1.1666666666666667)

    def test_mean_absolute_deviation_3(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7]) == pytest.approx(1.0)

    def test_mean_absolute_deviation_4(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8]) == pytest.approx(0.875)

    def test_mean_absolute_deviation_5(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9]) == pytest.approx(0.7777777777777778)

    def test_mean_absolute_deviation_6(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == pytest.approx(0.7)

    def test_mean_absolute_deviation_7(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == pytest.approx(0.6363636363636364)

    def test_mean_absolute_deviation_8(self):
        """
        Test case for the :func:`scenario2.id_5.mean_absolute_deviation`.
        """
        assert mean_absolute_deviation([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == pytest.approx(0.5833333333333334)

    def test_mean_absolute_deviation_9(self):