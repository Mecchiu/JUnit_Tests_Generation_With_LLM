# id_145_Test.java
from scenario1.id_145 import order_by_points

import pytest

class id_145_Test:
    """
    Test class of id_145.py.
    It contains ten unit test cases for the :func:`scenario1.id_145.order_by_points`.
    """


    def test_order_by_points_1(self):
        """
        Test case 1 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, 150, 190, 170, -1, -1, 160, 180]) == [-1, 150, 160, 170, -1, -1, 180, 190]

    def test_order_by_points_2(self):
        """
        Test case 2 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -1, -1, -1, -1]) == [-1, -1, -1, -1, -1]

    def test_order_by_points_3(self):
        """
        Test case 3 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -1, -1, -1, -1, 1]) == [-1, -1, -1, -1, -1, 1]

    def test_order_by_points_4(self):
        """
        Test case 4 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([4, 8, 12, 16, 20, 24]) == [4, 8, 12, 16, 20, 24]

    def test_order_by_points_5(self):
        """
        Test case 5 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([0, -1, 1, -2, 2, -3, 3]) == [0, -1, 1, -2, 2, -3, 3]

    def test_order_by_points_6(self):
        """
        Test case 6 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]

    def test_order_by_points_7(self):
        """
        Test case 7 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]

    def test_order_by_points_8(self):
        """
        Test case 8 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12]

    def test_order_by_points_9(self):
        """
        Test case 9 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13]

    def test_order_by_points_10(self):
        """
        Test case 10 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14]

# id_145_Test.py
from scenario1.id_145 import order_by_points

import pytest

class id_145_Test:
    """
    Test class of id_145.py.
    It contains ten unit test cases for the :func:`scenario1.id_145.order_by_points`.
    """
		
    def test_order_by_points_1(self):
        """
        Test case 1 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, 150, 190, 170, -1, -1, 160, 180]) == [-1, 150, 160, 170, -1, -1, 180, 190]

    def test_order_by_points_2(self):
        """
        Test case 2 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -1, -1, -1, -1]) == [-1, -1, -1, -1, -1]

    def test_order_by_points_3(self):
        """
        Test case 3 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -1, -1, -1, -1, 1]) == [-1, -1, -1, -1, -1, 1]

    def test_order_by_points_4(self):
        """
        Test case 4 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([4, 8, 12, 16, 20, 24]) == [4, 8, 12, 16, 20, 24]

    def test_order_by_points_5(self):
        """
        Test case 5 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([0, -1, 1, -2, 2, -3, 3]) == [0, -1, 1, -2, 2, -3, 3]

    def test_order_by_points_6(self):
        """
        Test case 6 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]

    def test_order_by_points_7(self):
        """
        Test case 7 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]

    def test_order_by_points_8(self):
        """
        Test case 8 for :func:`scenario1.id_145.order_by_points`.
        """
        assert order_by_points([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12]) == [-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12]

    def test_order_by_points_9(self):
        """
        Test case 9 for :func:`scenario1.id_145.order_by_points`.