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
		
# id_88.py

def get_column(lst, x):
    """
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of tuples, [(x1, y1), (x2, y2) ...] such that
    each tuple is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially by columns in ascending order.
    Also, sort coordinates of the column by rows in descending order.
    
    Examples:
    get_column([
      [1,2,3,4,5,6],
      [1,2,3,4,1,6],
      [1,2,3,4,5,1]
    ], 1) == [(1, 0), (0, 1), (2, 1)]
    get_column([], 1) == []
    get_column([[], [1], [1, 2, 3]], 3) == []
    """

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[0], reverse=True), key=lambda x: x[1])

# id_88_Test.java
from original.id_88 import get_column

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`original.id_88.get_column`.
    """
		
    def test_get_column_1(self):
        """
        Test case for get_column.
        """
        assert get_column([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(1, 0), (0, 1), (2, 1)]
		
    def test_get_column_2(self):
        """
        Test case for get_column.
        """
        assert get_column([], 1) == []
		
    def test_get_column_3(self):
        """
        Test case for get_column.
        """
        assert get_column([[], [1], [1, 2, 3]], 3) == []
		
    def test_get_column_4(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(1, 0), (0, 1), (2, 1)]
		
    def test_get_column_5(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(2, 0), (0, 2), (1, 2)]
		
    def test_get_column_6(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(2, 0), (0, 3), (1, 3)]
		
    def test_get_column_7(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(2, 0), (0, 4), (1, 4)]
		
    def test_get_column_8(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 5), (2, 5)]
		
    def test_get_column_9(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 6), (1, 6)]
		
    def test_get_column_10(self):
        """
        Test case for get_column.
        """
        assert get_column([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
		
# id_89.py

def get_diagonal(lst, x):
    """
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of tuples, [(x1, y1), (x2, y2) ...] such that
    each tuple is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially by rows in ascending order.
    Also, sort coordinates of the row by columns in descending order.
    
    Examples:
    get_diagonal([
      [1,2,3,4,5,6],
      [1,2,3,4,1,6],
      [1,2,3,4,5,1]
    ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
    get_diagonal([], 1) == []
    get_diagonal([[], [1], [1, 2, 3]], 3) == [(2, 2)]
    """

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[1], reverse=True), key=lambda x: x[0])

# id_89_Test.java
from original.id_89 import get_diagonal

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`original.id_89.get_diagonal`.
    """
		
    def test_get_diagonal_1(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]
        ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
		
    def test_get_diagonal_2(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([], 1) == []
		
    def test_get_diagonal_3(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[], [1], [1, 2, 3]], 3) == [(2, 2)]
		
    def test_get_diagonal_4(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
		
    def test_get_diagonal_5(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 2) == [(0, 1), (1, 1), (2, 1)]
		
    def test_get_diagonal_6(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 3) == [(0, 2), (1, 2), (2, 2)]
		
    def test_get_diagonal_7(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 4) == [(0, 3), (1, 3), (2, 3)]
		
    def test_get_diagonal_8(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 5) == [(0, 4), (2, 4)]
		
    def test_get_diagonal_9(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 6) == [(0, 5), (1, 5)]
		
    def test_get_diagonal_10(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 1, 6], [1, 2, 3, 4, 5, 1]], 7) == []
		
# id_90.py

def get_diagonal(lst, x):
    """
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of tuples, [(x1, y1), (x2, y2) ...] such that
    each tuple is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially by columns in ascending order.
    Also, sort coordinates of the column by rows in descending order.
    
    Examples:
    get_diagonal([
      [1,2,3,4,5,6],
      [1,2,3,4,1,6],
      [1,2,3,4,5,1]
    ], 1) == [(1, 0), (0, 1), (2, 1)]
    get_diagonal([], 1) == []
    get_diagonal([[], [1], [1, 2, 3]], 3) == []
    """

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[0], reverse=True), key=lambda x: x[1])

# id_90_Test.java
from original.id_90 import get_diagonal

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`original.id_90.get_diagonal`.
    """
		
    def test_get_diagonal_1(self):
        """
        Test case for get_diagonal.
        """
        assert get_diagonal([
          [1,2,3,4,5,6],
          [1,2,3,4,1,6],
          [1,2,3,4,5,1]