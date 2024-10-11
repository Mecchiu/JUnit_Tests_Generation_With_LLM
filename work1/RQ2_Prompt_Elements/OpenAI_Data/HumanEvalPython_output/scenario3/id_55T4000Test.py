# id_55_Test.java
from scenario3.id_55 import fib

import pytest

class id_55_Test:
    """
    Test class of id_55.py.
    It contains ten unit test cases for the :func:`scenario3.id_55.fib`.
    """


    def test_fib_1(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(10) == 55

    def test_fib_2(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(1) == 1

    def test_fib_3(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(8) == 21

    def test_fib_4(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(2) == 1

    def test_fib_5(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(3) == 2

    def test_fib_6(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(4) == 3

    def test_fib_7(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(5) == 5

    def test_fib_8(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(6) == 8

    def test_fib_9(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(7) == 13

    def test_fib_10(self):
        """
        Test case for the :func:`scenario3.id_55.fib`.
        """
        assert fib(9) == 34