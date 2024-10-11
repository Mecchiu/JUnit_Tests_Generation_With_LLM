# id_5_Test.java
from scenario1.id_5 import intersperse

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`scenario1.id_5.intersperse`.
    """


    def test_intersperse_1(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([], 0) == []

    def test_intersperse_2(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1], 0) == [1]

    def test_intersperse_3(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2], 0) == [1, 0, 2]

    def test_intersperse_4(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3], 0) == [1, 0, 2, 0, 3]

    def test_intersperse_5(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4], 0) == [1, 0, 2, 0, 3, 0, 4]

    def test_intersperse_6(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5]

    def test_intersperse_7(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6]

    def test_intersperse_8(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7]

    def test_intersperse_9(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8]

    def test_intersperse_10(self):
        """
        Test case for the :func:`scenario1.id_5.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9]

# id_6.py
from typing import List


def intersperse(numbers: List[int], delimeter: int) -> List[int]:

    if not numbers:
        return []

    result = []

    for n in numbers[:-1]:
        result.append(n)
        result.append(delimeter)

    result.append(numbers[-1])

    return result

# id_6_Test.java
from scenario1.id_6 import intersperse

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario1.id_6.intersperse`.
    """
		
    def test_intersperse_1(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([], 0) == []

    def test_intersperse_2(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1], 0) == [1]

    def test_intersperse_3(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2], 0) == [1, 0, 2]

    def test_intersperse_4(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3], 0) == [1, 0, 2, 0, 3]

    def test_intersperse_5(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4], 0) == [1, 0, 2, 0, 3, 0, 4]

    def test_intersperse_6(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5]

    def test_intersperse_7(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6]

    def test_intersperse_8(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7]

    def test_intersperse_9(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8]

    def test_intersperse_10(self):
        """
        Test case for the :func:`scenario1.id_6.intersperse` function.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9], 0) == [1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9]

# id_7.py
from typing import List


def intersperse(numbers: List[int], delimeter: int) -> List[int]:

    if not numbers:
        return []

    result = []

    for n in numbers[:-1]:
        result.append(n)
        result.append(delimeter)

    result.append(numbers[-1])

    return result

# id_7_Test.java
from scenario1.id_7 import intersperse

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`scenario1.id_7.intersperse`.
    """
		
    def test_intersperse_1(self):
        """
        Test case for the :func:`scenario1.id_7.intersperse` function.
        """
        assert intersperse([], 0) == []

    def test_intersperse_2(self):
        """
        Test case for the :func:`scenario1.id_7.intersperse` function.
        """
        assert intersperse([1