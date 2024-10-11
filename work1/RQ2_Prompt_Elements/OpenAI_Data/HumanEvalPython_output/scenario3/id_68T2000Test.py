# id_68_Test.java
from scenario3.id_68 import pluck

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario3.id_68.pluck`.
    """


    def test_pluck_1(self):
        """
        Test case 1 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([4,2,3]) == [2, 1]

    def test_pluck_2(self):
        """
        Test case 2 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1,2,3]) == [2, 1]

    def test_pluck_3(self):
        """
        Test case 3 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([]) == []

    def test_pluck_4(self):
        """
        Test case 4 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([5, 0, 3, 0, 4, 2]) == [0, 1]

    def test_pluck_5(self):
        """
        Test case 5 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [2, 1]

    def test_pluck_6(self):
        """
        Test case 6 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == [2, 1]

    def test_pluck_7(self):
        """
        Test case 7 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == [2, 1]

    def test_pluck_8(self):
        """
        Test case 8 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == [2, 1]

    def test_pluck_9(self):
        """
        Test case 9 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == [2, 1]

    def test_pluck_10(self):
        """
        Test case 10 for :func:`scenario3.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == [2, 1]