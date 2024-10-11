# id_99_Test.java
from original.id_99 import closest_integer

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`original.id_99.closest_integer`.
    """


    def test_closest_integer_1(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("10") == 10

    def test_closest_integer_2(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.3") == 15

    def test_closest_integer_3(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("-15.3") == -15

    def test_closest_integer_4(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("-15.5") == -16

    def test_closest_integer_5(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.5") == 16

    def test_closest_integer_6(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.6") == 16

    def test_closest_integer_7(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.4") == 15

    def test_closest_integer_8(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.0") == 15

    def test_closest_integer_9(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.00") == 15

    def test_closest_integer_10(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer("15.000") == 15