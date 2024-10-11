# id_105_Test.java
from scenario2.id_105 import by_length

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario2.id_105.by_length`.
    """


    def test_by_length_1(self):
        """
        Test case 1 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_2(self):
        """
        Test case 2 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_3(self):
        """
        Test case 3 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_4(self):
        """
        Test case 4 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_5(self):
        """
        Test case 5 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_6(self):
        """
        Test case 6 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_7(self):
        """
        Test case 7 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_8(self):
        """
        Test case 8 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_9(self):
        """
        Test case 9 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]

    def test_by_length_10(self):
        """
        Test case 10 for :func:`scenario2.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == ["Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"]