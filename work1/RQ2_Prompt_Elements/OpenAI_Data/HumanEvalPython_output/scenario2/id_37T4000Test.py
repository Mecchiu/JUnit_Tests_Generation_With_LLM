# id_37_Test.java
from scenario2.id_37 import sort_even

import pytest

class id_37_Test:
    """
    Test class of id_37.py.
    It contains ten unit test cases for the :func:`scenario2.id_37.sort_even`.
    """


    def test_sort_even_1(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]

    def test_sort_even_2(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 11]

    def test_sort_even_3(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11]

    def test_sort_even_4(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 13]

    def test_sort_even_5(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13]

    def test_sort_even_6(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 15]

    def test_sort_even_7(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15]

    def test_sort_even_8(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 17]

    def test_sort_even_9(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17]

    def test_sort_even_10(self):
        """
        Test case for the :func:`scenario2.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 19]