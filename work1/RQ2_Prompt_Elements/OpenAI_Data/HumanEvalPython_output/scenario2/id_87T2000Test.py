# id_87_Test.java
from scenario2.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario2.id_87.get_row`.
    """


    def test_get_row_1(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [(0, 0)]

    def test_get_row_2(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 2) == [(0, 1)]

    def test_get_row_3(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3) == [(0, 2)]

    def test_get_row_4(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4) == [(1, 0)]

    def test_get_row_5(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5) == [(1, 1)]

    def test_get_row_6(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6) == [(1, 2)]

    def test_get_row_7(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 7) == [(2, 0)]

    def test_get_row_8(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 8) == [(2, 1)]

    def test_get_row_9(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9) == [(2, 2)]

    def test_get_row_10(self):
        """
        Test case for the :func:`scenario2.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 10) == []

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
    
    
    """

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[0], reverse=True), key=lambda x: x[1])

# id_88_Test.java
from scenario2.id_88 import get_column

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario2.id_88.get_column`.
    """
		
    def test_get_column_1(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [(0, 0)]

    def test_get_column_2(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 2) == [(0, 1)]

    def test_get_column_3(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3) == [(0, 2)]

    def test_get_column_4(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4) == [(1, 0)]

    def test_get_column_5(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5) == [(1, 1)]

    def test_get_column_6(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6) == [(1, 2)]

    def test_get_column_7(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 7) == [(2, 0)]

    def test_get_column_8(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 8) == [(2, 1)]

    def test_get_column_9(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9) == [(2, 2)]

    def test_get_column_10(self):
        """
        Test case for the :func:`scenario2.id_88.get_column`.
        """
        assert get_column([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 10) == []

# id_89.py

def get_diagonal(lst, x):
    """
    You are given a 2 dimensional data, as a nested lists,
    which is similar to matrix, however, unlike matrices,
    each row may contain a different number of columns.
    Given lst, and integer x, find integers x in the list,
    and return list of tuples, [(x1, y1), (x2, y2) ...] such that
    each tuple is a coordinate - (row, columns), starting with 0.
    Sort coordinates initially