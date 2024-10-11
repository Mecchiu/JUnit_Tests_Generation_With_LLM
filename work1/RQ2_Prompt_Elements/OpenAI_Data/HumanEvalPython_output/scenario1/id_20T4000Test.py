# id_20_Test.java
from scenario1.id_20 import find_closest_elements

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario1.id_20.find_closest_elements`.
    """


    def test_find_closest_elements_1(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5]) == (1, 2)

    def test_find_closest_elements_2(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6]) == (1, 2)

    def test_find_closest_elements_3(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7]) == (1, 2)

    def test_find_closest_elements_4(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8]) == (1, 2)

    def test_find_closest_elements_5(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (1, 2)

    def test_find_closest_elements_6(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (1, 2)

    def test_find_closest_elements_7(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (1, 2)

    def test_find_closest_elements_8(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (1, 2)

    def test_find_closest_elements_9(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (1, 2)

    def test_find_closest_elements_10(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (1, 2)

# id_20_Test.py
from scenario1.id_20 import find_closest_elements

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario1.id_20.find_closest_elements`.
    """
		
    def test_find_closest_elements_1(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5]) == (1, 2)

    def test_find_closest_elements_2(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6]) == (1, 2)

    def test_find_closest_elements_3(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7]) == (1, 2)

    def test_find_closest_elements_4(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8]) == (1, 2)

    def test_find_closest_elements_5(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (1, 2)

    def test_find_closest_elements_6(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (1, 2)

    def test_find_closest_elements_7(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (1, 2)

    def test_find_closest_elements_8(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (1, 2)

    def test_find_closest_elements_9(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (1, 2)

    def test_find_closest_elements_10(self):
        """
        Test case for the :func:`scenario1.id_20.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (1, 2)

# id_21.py
from typing import List, Tuple


def find_closest_elements(numbers: List[float]) -> Tuple[float, float]:

    closest_pair = None
    distance = None

    for idx, elem in enumerate(numbers):
        for idx2, elem2 in enumerate(numbers):
            if idx != idx2:
                if distance is None:
                    distance = abs(elem - elem2)
                    closest_pair = tuple(sorted([elem, elem2]))
                else:
                    new_distance = abs(elem - elem2)
                    if new_distance < distance:
                        distance = new_distance
                        closest_pair = tuple(sorted([elem, elem2]))

    return closest_pair

# id_21_Test.java
from scenario1.id_21 import find_closest_elements

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains ten unit test cases for the :func:`scenario1.id_21.find_closest_elements`.
    """
		
    def test_find_closest_elements_1(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5]) == (1, 2)

    def test_find_closest_elements_2(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6]) == (1, 2)

    def test_find_closest_elements_3(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7]) == (1, 2)

    def test_find_closest_elements_4(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8]) == (1, 2)

    def test_find_closest_elements_5(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (1, 2)

    def test_find_closest_elements_6(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (1, 2)

    def test_find_closest_elements_7(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (1, 2)

    def test_find_closest_elements_8(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (1, 2)

    def test_find_closest_elements_9(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (1, 2)

    def test_find_closest_elements_10(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (1, 2)

# id_21_Test.py
from scenario1.id_21 import find_closest_elements

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains ten unit test cases for the :func:`scenario1.id_21.find_closest_elements`.
    """
		
    def test_find_closest_elements_1(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5]) == (1, 2)

    def test_find_closest_elements_2(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6]) == (1, 2)

    def test_find_closest_elements_3(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7]) == (1, 2)

    def test_find_closest_elements_4(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8]) == (1, 2)

    def test_find_closest_elements_5(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9]) == (1, 2)

    def test_find_closest_elements_6(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == (1, 2)

    def test_find_closest_elements_7(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == (1, 2)

    def test_find_closest_elements_8(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == (1, 2)

    def test_find_closest_elements_9(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == (1, 2)

    def test_find_closest_elements_10(self):
        """
        Test case for the :func:`scenario1.id_21.find_closest_elements`.
        """
        assert find_closest_elements([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == (1, 2)

# id_22.py