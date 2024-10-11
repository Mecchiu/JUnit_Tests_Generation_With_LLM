# id_8_Test.java
from scenario1.id_8 import sum_product

import pytest

class id_8_Test:
    """
    Test class of id_8.py.
    It contains ten unit test cases for the :func:`scenario1.id_8.sum_product`.
    """


    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6]) == (21, 720)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7]) == (28, 5040)

    def test_sum_product_4(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8]) == (36, 40320)

    def test_sum_product_5(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (45, 362880)

    def test_sum_product_6(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (55, 3628800)

    def test_sum_product_7(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (66, 39916800)

    def test_sum_product_8(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (78, 479001600)

    def test_sum_product_9(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (91, 6227020800)

    def test_sum_product_10(self):
        """
        Test case for the :func:`scenario1.id_8.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (105, 87178291200)

# id_9.py
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:

    sum_value = 0
    prod_value = 1

    for n in numbers:
        sum_value += n
        prod_value *= n
    return sum_value, prod_value

# id_9_Test.java
from scenario1.id_9 import sum_product

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario1.id_9.sum_product`.
    """
		
    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6]) == (21, 720)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7]) == (28, 5040)

    def test_sum_product_4(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8]) == (36, 40320)

    def test_sum_product_5(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (45, 362880)

    def test_sum_product_6(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (55, 3628800)

    def test_sum_product_7(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (66, 39916800)

    def test_sum_product_8(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (78, 479001600)

    def test_sum_product_9(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (91, 6227020800)

    def test_sum_product_10(self):
        """
        Test case for the :func:`scenario1.id_9.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (105, 87178291200)

# id_10.py
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:

    sum_value = 0
    prod_value = 1

    for n in numbers:
        sum_value += n
        prod_value *= n
    return sum_value, prod_value

# id_10_Test.java
from scenario1.id_10 import sum_product

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario1.id_10.sum_product`.
    """
		
    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6]) == (21, 720)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7]) == (28, 5040)

    def test_sum_product_4(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8]) == (36, 40320)

    def test_sum_product_5(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (45, 362880)

    def test_sum_product_6(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (55, 3628800)

    def test_sum_product_7(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (66, 39916800)

    def test_sum_product_8(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (78, 479001600)

    def test_sum_product_9(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (91, 6227020800)

    def test_sum_product_10(self):
        """
        Test case for the :func:`scenario1.id_10.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (105, 87178291200)

# id_11.py
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:

    sum_value = 0
    prod_value = 1

    for n in numbers:
        sum_value += n
        prod_value *= n
    return sum_value, prod_value

# id_11_Test.java
from scenario1.id_11 import sum_product

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`scenario1.id_11.sum_product`.
    """
		
    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6]) == (21, 720)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7]) == (28, 5040)

    def test_sum_product_4(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8]) == (36, 40320)

    def test_sum_product_5(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (45, 362880)

    def test_sum_product_6(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (55, 3628800)

    def test_sum_product_7(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (66, 39916800)

    def test_sum_product_8(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (78, 479001600)

    def test_sum_product_9(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (91, 6227020800)

    def test_sum_product_10(self):
        """
        Test case for the :func:`scenario1.id_11.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (105, 87178291200)

# id_12.py
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:

    sum_value = 0
    prod_value = 1

    for n in numbers:
        sum_value += n
        prod_value *= n
    return sum_value, prod_value

# id_12_Test.java
from scenario1.id_12 import sum_product

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario1.id_12.sum_product`.
    """
		
    def test_sum_product_1(self):
        """
        Test case for the :func:`scenario1.id_12.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5]) == (15, 120)

    def test_sum_product_2(self):
        """
        Test case for the :func:`scenario1.id_12.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6]) == (21, 720)

    def test_sum_product_3(self):
        """
        Test case for the :func:`scenario1.id_12.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7]) == (28, 5040)

    def test_sum_product_4(self):
        """
        Test case for the :func:`scenario1.id_12.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8]) == (36, 40320)

    def test_sum_product_5(self):
        """
        Test case for the :func:`scenario1.id_12.sum_product`.
        """
        assert sum_product([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (45, 362880)