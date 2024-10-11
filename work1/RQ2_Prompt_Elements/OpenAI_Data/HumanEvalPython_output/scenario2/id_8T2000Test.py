# id_8_Test.java
from scenario2.id_8 import sum_product

import pytest

class id_8_Test:
    """
    Test class of id_8.py.
    It contains ten unit test cases for the :func:`scenario2.id_8.sum_product`.
    """


    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (55, 3628800)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == (210, 2432902008176640000)

    def test_sum_product_4(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == (465, 265252859812191058636308480000000)

    def test_sum_product_5(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == (820, 815915283247897734345611269596115894272000000000)

    def test_sum_product_6(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == (1275, 30414093201713378043612608166064768844377641568960512000000000000)

    def test_sum_product_7(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == (2025, 8841761993739701954543616000000000)

    def test_sum_product_8(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70]) == (3060, 265252859812191058636308480000000)

    def test_sum_product_9(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80]) == (4695, 815915283247897734345611269596115894272000000000)

    def test_sum_product_10(self):
        """
        Test case for the :func:`scenario2.id_8.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90]) == (6930, 265252859812191058636308480000000)

# id_9.py
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:
    """ For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    
    """

    sum_value = 0
    prod_value = 1

    for n in numbers:
        sum_value += n
        prod_value *= n
    return sum_value, prod_value

# id_9_Test.java
from scenario2.id_9 import sum_product

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario2.id_9.sum_product`.
    """
		
    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario2.id_9.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario2.id_9.sum_product` function.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (55, 3628800)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario2.id_9.sum_product` function.
        """
        assert sum_product([1,