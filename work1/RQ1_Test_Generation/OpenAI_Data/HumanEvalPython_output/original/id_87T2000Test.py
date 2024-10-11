# id_87_Test.java
from original.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`original.id_87.get_row`.
    """


    def test_get_row_1(self):
        """
        Test case for get_row.
        """
        assert get_row([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
		
    def test_get_row_2(self):
        """
        Test case for get_row.
        """
        assert get_row([], 1) == []
		
    def test_get_row_3(self):
        """
        Test case for get_row.
        """
        assert get_row([[], [1], [1, 2, 3]], 3) == [(2, 2)]
		
    def test_get_row_4(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
		
    def test_get_row_5(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]
		
    def test_get_row_6(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]
		
    def test_get_row_7(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]
		
    def test_get_row_8(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]
		
    def test_get_row_9(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 5), (1, 5)]
		
    def test_get_row_10(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
		
# id_87_Test.py
from original.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`original.id_87.get_row`.
    """
		
    def test_get_row_1(self):
        """
        Test case for get_row.
        """
        assert get_row([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
		
    def test_get_row_2(self):
        """
        Test case for get_row.
        """
        assert get_row([], 1) == []
		
    def test_get_row_3(self):
        """
        Test case for get_row.
        """
        assert get_row([[], [1], [1, 2, 3]], 3) == [(2, 2)]
		
    def test_get_row_4(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
		
    def test_get_row_5(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]
		
    def test_get_row_6(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]
		
    def test_get_row_7(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]
		
    def test_get_row_8(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]
		
    def test_get_row_9(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 5), (1, 5)]
		
    def test_get_row_10(self):
        """
        Test case for get_row.
        """
        assert get_row([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
		
# id_88.py

def get_column(lst, x):
    """
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of tuples, [(x1, y1), (x2, y2) ...] such that
    each tuple is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially by rows in ascending order.
    Also, sort coordinates of the row by columns in ascending order.
    
    Examples:
    get_column([
      [1,2,3,4,5