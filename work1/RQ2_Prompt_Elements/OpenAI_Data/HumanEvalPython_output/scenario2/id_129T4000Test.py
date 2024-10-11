# id_129_Test.java
from scenario2.id_129 import minPath

import pytest

class id_129_Test:
    """
    Test class of id_129.py.
    It contains ten unit test cases for the :func:`scenario2.id_129.minPath`.
    """


    def test_minPath_1(self):
        """
        Test case 1 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 3
        assert minPath(grid, k) == [1, 2, 3]

    def test_minPath_2(self):
        """
        Test case 2 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 4
        assert minPath(grid, k) == [1, 2, 3, 4]

    def test_minPath_3(self):
        """
        Test case 3 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 5
        assert minPath(grid, k) == [1, 2, 3, 4, 5]

    def test_minPath_4(self):
        """
        Test case 4 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 6
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6]

    def test_minPath_5(self):
        """
        Test case 5 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 7
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6, 7]

    def test_minPath_6(self):
        """
        Test case 6 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 8
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6, 7, 8]

    def test_minPath_7(self):
        """
        Test case 7 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 9
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

    def test_minPath_8(self):
        """
        Test case 8 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 10
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 1]

    def test_minPath_9(self):
        """
        Test case 9 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 11
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2]

    def test_minPath_10(self):
        """
        Test case 10 for :func:`scenario2.id_129.minPath`.
        """
        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        k = 12
        assert minPath(grid, k) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3]