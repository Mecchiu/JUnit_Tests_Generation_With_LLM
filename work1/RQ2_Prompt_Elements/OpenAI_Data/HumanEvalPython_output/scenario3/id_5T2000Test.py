# id_5_Test.java
from scenario3.id_5 import intersperse

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`scenario3.id_5.intersperse`.
    """


    def test_intersperse_1(self):
        """
        Test case 1 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([], 4) == []

    def test_intersperse_2(self):
        """
        Test case 2 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3], 4) == [1, 4, 2, 4, 3]

    def test_intersperse_3(self):
        """
        Test case 3 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5]

    def test_intersperse_4(self):
        """
        Test case 4 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6]

    def test_intersperse_5(self):
        """
        Test case 5 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7]

    def test_intersperse_6(self):
        """
        Test case 6 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8]

    def test_intersperse_7(self):
        """
        Test case 7 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9]

    def test_intersperse_8(self):
        """
        Test case 8 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10]

    def test_intersperse_9(self):
        """
        Test case 9 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10, 4, 11]

    def test_intersperse_10(self):
        """
        Test case 10 for :func:`scenario3.id_5.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10, 4, 11, 4, 12]

# id_6.py
from typing import List


def intersperse(numbers: List[int], delimeter: int) -> List[int]:
    """ Insert a number 'delimeter' between every two consecutive elements of input list `numbers'
    >>> intersperse([], 4)
    []
    >>> intersperse([1, 2, 3], 4)
    [1, 4, 2, 4, 3]
    """

    pass

# id_6_Test.java
from scenario3.id_6 import intersperse

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario3.id_6.intersperse`.
    """
		
    def test_intersperse_1(self):
        """
        Test case 1 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([], 4) == []

    def test_intersperse_2(self):
        """
        Test case 2 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3], 4) == [1, 4, 2, 4, 3]

    def test_intersperse_3(self):
        """
        Test case 3 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5]

    def test_intersperse_4(self):
        """
        Test case 4 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6]

    def test_intersperse_5(self):
        """
        Test case 5 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7]

    def test_intersperse_6(self):
        """
        Test case 6 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8]

    def test_intersperse_7(self):
        """
        Test case 7 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9]

    def test_intersperse_8(self):
        """
        Test case 8 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10]

    def test_intersperse_9(self):
        """
        Test case 9 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10, 4, 11]

    def test_intersperse_10(self):
        """
        Test case 10 for :func:`scenario3.id_6.intersperse`.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10, 4, 11