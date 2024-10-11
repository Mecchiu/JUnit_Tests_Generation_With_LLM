# id_24_Test.java
from scenario2.id_24 import largest_divisor

import pytest

class id_24_Test:
    """
    Test class of id_24.py.
    It contains ten unit test cases for the :func:`scenario2.id_24.largest_divisor`.
    """


    def test_largest_divisor_1(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(10) == 5

    def test_largest_divisor_2(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(11) == 11

    def test_largest_divisor_3(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(12) == 6

    def test_largest_divisor_4(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(13) == 13

    def test_largest_divisor_5(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(14) == 7

    def test_largest_divisor_6(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(15) == 5

    def test_largest_divisor_7(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(16) == 8

    def test_largest_divisor_8(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(17) == 17

    def test_largest_divisor_9(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(18) == 9

    def test_largest_divisor_10(self):
        """
        Test case for the function :func:`scenario2.id_24.largest_divisor`.
        """
        assert largest_divisor(19) == 19