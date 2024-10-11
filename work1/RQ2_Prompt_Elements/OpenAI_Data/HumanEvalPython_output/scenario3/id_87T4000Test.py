# id_87_Test.java
from scenario3.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario3.id_87.get_row`.
    """


    def test_get_row_1(self):
        """
        Test case 1 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_2(self):
        """
        Test case 2 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([], 1) == []

    def test_get_row_3(self):
        """
        Test case 3 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[], [1], [1, 2, 3]], 3) == [(2, 2)]

    def test_get_row_4(self):
        """
        Test case 4 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_5(self):
        """
        Test case 5 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]

    def test_get_row_6(self):
        """
        Test case 6 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]

    def test_get_row_7(self):
        """
        Test case 7 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]

    def test_get_row_8(self):
        """
        Test case 8 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]

    def test_get_row_9(self):
        """
        Test case 9 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 5), (1, 5)]

    def test_get_row_10(self):
        """
        Test case 10 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
# id_87_Test.py
from scenario3.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario3.id_87.get_row`.
    """
		
    def test_get_row_1(self):
        """
        Test case 1 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_2(self):
        """
        Test case 2 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([], 1) == []

    def test_get_row_3(self):
        """
        Test case 3 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[], [1], [1, 2, 3]], 3) == [(2, 2)]

    def test_get_row_4(self):
        """
        Test case 4 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_5(self):
        """
        Test case 5 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]

    def test_get_row_6(self):
        """
        Test case 6 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]

    def test_get_row_7(self):
        """
        Test case 7 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]

    def test_get_row_8(self):
        """
        Test case 8 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]

    def test_get_row_9(self):
        """
        Test case 9 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 5), (1, 5)]

    def test_get_row_10(self):
        """
        Test case 10 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
# id_87_Test.py
from scenario3.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario3.id_87.get_row`.
    """
		
    def test_get_row_1(self):
        """
        Test case 1 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_2(self):
        """
        Test case 2 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([], 1) == []

    def test_get_row_3(self):
        """
        Test case 3 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[], [1], [1, 2, 3]], 3) == [(2, 2)]

    def test_get_row_4(self):
        """
        Test case 4 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_5(self):
        """
        Test case 5 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]

    def test_get_row_6(self):
        """
        Test case 6 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]

    def test_get_row_7(self):
        """
        Test case 7 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]

    def test_get_row_8(self):
        """
        Test case 8 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]

    def test_get_row_9(self):
        """
        Test case 9 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 5), (1, 5)]

    def test_get_row_10(self):
        """
        Test case 10 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
# id_87_Test.py
from scenario3.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario3.id_87.get_row`.
    """
		
    def test_get_row_1(self):
        """
        Test case 1 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_2(self):
        """
        Test case 2 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([], 1) == []

    def test_get_row_3(self):
        """
        Test case 3 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[], [1], [1, 2, 3]], 3) == [(2, 2)]

    def test_get_row_4(self):
        """
        Test case 4 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]

    def test_get_row_5(self):
        """
        Test case 5 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]

    def test_get_row_6(self):
        """
        Test case 6 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]

    def test_get_row_7(self):
        """
        Test case 7 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]

    def test_get_row_8(self):
        """
        Test case 8 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]

    def test_get_row_9(self):
        """
        Test case 9 for :func:`scenario3.id_87.get_row`.
        """
        assert get_row([[1, 2, 3