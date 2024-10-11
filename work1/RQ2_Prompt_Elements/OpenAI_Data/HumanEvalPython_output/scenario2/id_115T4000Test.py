# id_115_Test.java
from scenario2.id_115 import max_fill

import pytest

class id_115_Test:
    """
    Test class of id_115.py.
    It contains ten unit test cases for the :func:`scenario2.id_115.max_fill`.
    """


    def test_max_fill_1(self):
        """
        Test case 1 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = 5
        assert max_fill(grid, capacity) == 5

    def test_max_fill_2(self):
        """
        Test case 2 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = 4
        assert max_fill(grid, capacity) == 6

    def test_max_fill_3(self):
        """
        Test case 3 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = 3
        assert max_fill(grid, capacity) == 7

    def test_max_fill_4(self):
        """
        Test case 4 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = 2
        assert max_fill(grid, capacity) == 8

    def test_max_fill_5(self):
        """
        Test case 5 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = 1
        assert max_fill(grid, capacity) == 9

    def test_max_fill_6(self):
        """
        Test case 6 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = 0
        assert max_fill(grid, capacity) == 0

    def test_max_fill_7(self):
        """
        Test case 7 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = -1
        assert max_fill(grid, capacity) == 0

    def test_max_fill_8(self):
        """
        Test case 8 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = -2
        assert max_fill(grid, capacity) == 0

    def test_max_fill_9(self):
        """
        Test case 9 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = -3
        assert max_fill(grid, capacity) == 0

    def test_max_fill_10(self):
        """
        Test case 10 for :func:`scenario2.id_115.max_fill`.
        """
        grid = [[1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1]]
        capacity = -4
        assert max_fill(grid, capacity) == 0