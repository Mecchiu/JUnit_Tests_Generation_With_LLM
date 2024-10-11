# id_129_Test.java
from scenario3.id_129 import minPath

import pytest

class id_129_Test:
    """
    Test class of id_129.py.
    It contains ten unit test cases for the :func:`scenario3.id_129.minPath`.
    """


    def test_minPath_1(self):
        """
        Test case 1 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [1,2,3], [4,5,6], [7,8,9] ]
        k = 3
        expected = [1, 2, 1]
        assert minPath(grid, k) == expected

    def test_minPath_2(self):
        """
        Test case 2 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 1
        expected = [1]
        assert minPath(grid, k) == expected

    def test_minPath_3(self):
        """
        Test case 3 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 2
        expected = [1, 2]
        assert minPath(grid, k) == expected

    def test_minPath_4(self):
        """
        Test case 4 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 3
        expected = [1, 2, 1]
        assert minPath(grid, k) == expected

    def test_minPath_5(self):
        """
        Test case 5 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 4
        expected = [1, 2, 1, 2]
        assert minPath(grid, k) == expected

    def test_minPath_6(self):
        """
        Test case 6 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 5
        expected = [1, 2, 1, 2, 1]
        assert minPath(grid, k) == expected

    def test_minPath_7(self):
        """
        Test case 7 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 6
        expected = [1, 2, 1, 2, 1, 2]
        assert minPath(grid, k) == expected

    def test_minPath_8(self):
        """
        Test case 8 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 7
        expected = [1, 2, 1, 2, 1, 2, 1]
        assert minPath(grid, k) == expected

    def test_minPath_9(self):
        """
        Test case 9 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 8
        expected = [1, 2, 1, 2, 1, 2, 1, 2]
        assert minPath(grid, k) == expected

    def test_minPath_10(self):
        """
        Test case 10 for :func:`scenario3.id_129.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 9
        expected = [1, 2, 1, 2, 1, 2, 1, 2, 1]
        assert minPath(grid, k) == expected

# id_130.py

def minPath(grid, k):
    """
    Given a grid with N rows and N columns (N >= 2) and a positive integer k, 
    each cell of the grid contains a value. Every integer in the range [1, N * N]
    inclusive appears exactly once on the cells of the grid.

    You have to find the minimum path of length k in the grid. You can start
    from any cell, and in each step you can move to any of the neighbor cells,
    in other words, you can go to cells which share an edge with you current
    cell.
    Please note that a path of length k means visiting exactly k cells (not
    necessarily distinct).
    You CANNOT go off the grid.
    A path A (of length k) is considered less than a path B (of length k) if
    after making the ordered lists of the values on the cells that A and B go
    through (let's call them lst_A and lst_B), lst_A is lexicographically less
    than lst_B, in other words, there exist an integer index i (1 <= i <= k)
    such that lst_A[i] < lst_B[i] and for any j (1 <= j < i) we have
    lst_A[j] = lst_B[j].
    It is guaranteed that the answer is unique.
    Return an ordered list of the values on the cells that the minimum path go through.

    Examples:

        Input: grid = [ [1,2,3], [4,5,6], [7,8,9]], k = 3
        Output: [1, 2, 1]

        Input: grid = [ [5,9,3], [4,1,6], [7,8,2]], k = 1
        Output: [1]
    """

    pass
# id_130_Test.java
from scenario3.id_130 import minPath

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario3.id_130.minPath`.
    """
		
    def test_minPath_1(self):
        """
        Test case 1 for :func:`scenario3.id_130.minPath`.
        """
        grid = [ [1,2,3], [4,5,6], [7,8,9] ]
        k = 3
        expected = [1, 2, 1]
        assert minPath(grid, k) == expected

    def test_minPath_2(self):
        """
        Test case 2 for :func:`scenario3.id_130.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 1
        expected = [1]
        assert minPath(grid, k) == expected

    def test_minPath_3(self):
        """
        Test case 3 for :func:`scenario3.id_130.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 2
        expected = [1, 2]
        assert minPath(grid, k) == expected

    def test_minPath_4(self):
        """
        Test case 4 for :func:`scenario3.id_130.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 3
        expected = [1, 2, 1]
        assert minPath(grid, k) == expected

    def test_minPath_5(self):
        """
        Test case 5 for :func:`scenario3.id_130.minPath`.
        """
        grid = [ [5,9,3], [4,1,6], [7,8,2] ]
        k = 4
        expected = [1, 2, 1, 2]
        assert minPath(grid, k) == expected

    def test_minPath_6(self):
        """
        Test case 6 for :func:`scenario3.id_130.minPath`.
        """
        grid