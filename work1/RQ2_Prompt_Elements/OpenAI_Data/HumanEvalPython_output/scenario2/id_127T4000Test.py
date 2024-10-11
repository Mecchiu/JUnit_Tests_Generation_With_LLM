# id_127_Test.java
from scenario2.id_127 import intersection

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`scenario2.id_127.intersection`.
    """


    def test_intersection_1(self):
        """
        Test case 1 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (2, 4)) == "NO"

    def test_intersection_2(self):
        """
        Test case 2 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (2, 3)) == "YES"

    def test_intersection_3(self):
        """
        Test case 3 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (3, 4)) == "NO"

    def test_intersection_4(self):
        """
        Test case 4 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (4, 5)) == "NO"

    def test_intersection_5(self):
        """
        Test case 5 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (1, 3)) == "YES"

    def test_intersection_6(self):
        """
        Test case 6 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (1, 2)) == "YES"

    def test_intersection_7(self):
        """
        Test case 7 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (2, 2)) == "NO"

    def test_intersection_8(self):
        """
        Test case 8 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (3, 3)) == "NO"

    def test_intersection_9(self):
        """
        Test case 9 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (4, 4)) == "NO"

    def test_intersection_10(self):
        """
        Test case 10 for :func:`scenario2.id_127.intersection`.
        """
        assert intersection((1, 3), (0, 0)) == "NO"