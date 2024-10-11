# id_87_Test.java
from scenario1.id_87 import get_row

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario1.id_87.get_row`.
    """


    def test_get_row_1(self):
        """
        Test case 1 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [(0, 0)]

    def test_get_row_2(self):
        """
        Test case 2 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 2) == [(0, 1)]

    def test_get_row_3(self):
        """
        Test case 3 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3) == [(0, 2)]

    def test_get_row_4(self):
        """
        Test case 4 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4) == [(1, 0)]

    def test_get_row_5(self):
        """
        Test case 5 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5) == [(1, 1)]

    def test_get_row_6(self):
        """
        Test case 6 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6) == [(1, 2)]

    def test_get_row_7(self):
        """
        Test case 7 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 7) == [(2, 0)]

    def test_get_row_8(self):
        """
        Test case 8 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 8) == [(2, 1)]

    def test_get_row_9(self):
        """
        Test case 9 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9) == [(2, 2)]

    def test_get_row_10(self):
        """
        Test case 10 for :func:`scenario1.id_87.get_row`.
        """
        assert get_row([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 10) == []

# id_88.py

def get_col(lst, x):

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[0], reverse=True), key=lambda x: x[1])

# id_88_Test.java
from scenario1.id_88 import get_col

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario1.id_88.get_col`.
    """
		
    def test_get_col_1(self):
        """
        Test case 1 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [(0, 0)]

    def test_get_col_2(self):
        """
        Test case 2 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 2) == [(0, 1)]

    def test_get_col_3(self):
        """
        Test case 3 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3) == [(0, 2)]

    def test_get_col_4(self):
        """
        Test case 4 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4) == [(1, 0)]

    def test_get_col_5(self):
        """
        Test case 5 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5) == [(1, 1)]

    def test_get_col_6(self):
        """
        Test case 6 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6) == [(1, 2)]

    def test_get_col_7(self):
        """
        Test case 7 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 7) == [(2, 0)]

    def test_get_col_8(self):
        """
        Test case 8 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 8) == [(2, 1)]

    def test_get_col_9(self):
        """
        Test case 9 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9) == [(2, 2)]

    def test_get_col_10(self):
        """
        Test case 10 for :func:`scenario1.id_88.get_col`.
        """
        assert get_col([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 10) == []

# id_89.py

def get_diag(lst, x):

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[0], reverse=True), key=lambda x: x[1])

# id_89_Test.java
from scenario1.id_89 import get_diag

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario1.id_89.get_diag`.
    """
		
    def test_get_diag_1(self):
        """
        Test case 1 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [(0, 0)]

    def test_get_diag_2(self):
        """
        Test case 2 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 2) == [(0, 1)]

    def test_get_diag_3(self):
        """
        Test case 3 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3) == [(0, 2)]

    def test_get_diag_4(self):
        """
        Test case 4 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4) == [(1, 0)]

    def test_get_diag_5(self):
        """
        Test case 5 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5) == [(1, 1)]

    def test_get_diag_6(self):
        """
        Test case 6 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6) == [(1, 2)]

    def test_get_diag_7(self):
        """
        Test case 7 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 7) == [(2, 0)]

    def test_get_diag_8(self):
        """
        Test case 8 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 8) == [(2, 1)]

    def test_get_diag_9(self):
        """
        Test case 9 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9) == [(2, 2)]

    def test_get_diag_10(self):
        """
        Test case 10 for :func:`scenario1.id_89.get_diag`.
        """
        assert get_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 10) == []

# id_90.py

def get_anti_diag(lst, x):

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[0], reverse=True), key=lambda x: x[1])

# id_90_Test.java
from scenario1.id_90 import get_anti_diag

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario1.id_90.get_anti_diag`.
    """
		
    def test_get_anti_diag_1(self):
        """
        Test case 1 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 1) == [(0, 0)]

    def test_get_anti_diag_2(self):
        """
        Test case 2 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 2) == [(0, 1)]

    def test_get_anti_diag_3(self):
        """
        Test case 3 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 3) == [(0, 2)]

    def test_get_anti_diag_4(self):
        """
        Test case 4 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4) == [(1, 0)]

    def test_get_anti_diag_5(self):
        """
        Test case 5 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5) == [(1, 1)]

    def test_get_anti_diag_6(self):
        """
        Test case 6 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6) == [(1, 2)]

    def test_get_anti_diag_7(self):
        """
        Test case 7 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 7) == [(2, 0)]

    def test_get_anti_diag_8(self):
        """
        Test case 8 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 8) == [(2, 1)]

    def test_get_anti_diag_9(self):
        """
        Test case 9 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9) == [(2, 2)]

    def test_get_anti_diag_10(self):
        """
        Test case 10 for :func:`scenario1.id_90.get_anti_diag`.
        """
        assert get_anti_diag([[1, 2, 3], [4, 5, 6], [7, 8, 9]], 10) == []

# id_91.py

def get_row_col(lst, x):

    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]
    return sorted(sorted(coords, key=lambda x: x[1], reverse=True), key=lambda x: x[0])

# id_91_Test.java
from scenario1.id_91 import get_row_col

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario1.id_91.get_row_col`.
    """
		
    def test_get_row_col_1(self):
        """
        Test case 1 for :func:`scenario1.id_91.get_row_col`.