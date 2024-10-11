# id_136_Test.java
from scenario1.id_136 import largest_smallest_integers

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario1.id_136.largest_smallest_integers`.
    """


    def test_largest_smallest_integers_1(self):
        """
        Test case 1 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5]) == (-1, None)

    def test_largest_smallest_integers_2(self):
        """
        Test case 2 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([1, 2, 3, 4, 5]) == (None, 1)

    def test_largest_smallest_integers_3(self):
        """
        Test case 3 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, 2, -3, 4, -5]) == (-1, 2)

    def test_largest_smallest_integers_4(self):
        """
        Test case 4 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_5(self):
        """
        Test case 5 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_6(self):
        """
        Test case 6 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_7(self):
        """
        Test case 7 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_8(self):
        """
        Test case 8 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_9(self):
        """
        Test case 9 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_10(self):
        """
        Test case 10 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

# id_136_Test.py
from scenario1.id_136 import largest_smallest_integers

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario1.id_136.largest_smallest_integers`.
    """
		
    def test_largest_smallest_integers_1(self):
        """
        Test case 1 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5]) == (-1, None)

    def test_largest_smallest_integers_2(self):
        """
        Test case 2 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([1, 2, 3, 4, 5]) == (None, 1)

    def test_largest_smallest_integers_3(self):
        """
        Test case 3 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, 2, -3, 4, -5]) == (-1, 2)

    def test_largest_smallest_integers_4(self):
        """
        Test case 4 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_5(self):
        """
        Test case 5 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_6(self):
        """
        Test case 6 for :func:`scenario1.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3,