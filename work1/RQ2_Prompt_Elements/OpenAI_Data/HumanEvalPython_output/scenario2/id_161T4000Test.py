# id_161_Test.java
from scenario2.id_161 import solve

import pytest

class id_161_Test:
    """
    Test class of id_161.py.
    It contains ten unit test cases for the :func:`scenario2.id_161.solve`.
    """


    def test_solve_1(self):
        """
        Test case 1 for :func:`scenario2.id_161.solve`.
        """
        assert solve("abc") == "ABC"

    def test_solve_2(self):
        """
        Test case 2 for :func:`scenario2.id_161.solve`.
        """
        assert solve("ABC") == "abc"

    def test_solve_3(self):
        """
        Test case 3 for :func:`scenario2.id_161.solve`.
        """
        assert solve("123") == "123"

    def test_solve_4(self):
        """
        Test case 4 for :func:`scenario2.id_161.solve`.
        """
        assert solve("abc123") == "ABC123"

    def test_solve_5(self):
        """
        Test case 5 for :func:`scenario2.id_161.solve`.
        """
        assert solve("ABC123") == "abc123"

    def test_solve_6(self):
        """
        Test case 6 for :func:`scenario2.id_161.solve`.
        """
        assert solve("abcABC") == "ABCabc"

    def test_solve_7(self):
        """
        Test case 7 for :func:`scenario2.id_161.solve`.
        """
        assert solve("ABCabc") == "abcABC"

    def test_solve_8(self):
        """
        Test case 8 for :func:`scenario2.id_161.solve`.
        """
        assert solve("123abc") == "123ABC"

    def test_solve_9(self):
        """
        Test case 9 for :func:`scenario2.id_161.solve`.
        """
        assert solve("123ABC") == "123abc"

    def test_solve_10(self):
        """
        Test case 10 for :func:`scenario2.id_161.solve`.
        """
        assert solve("123") == "321"