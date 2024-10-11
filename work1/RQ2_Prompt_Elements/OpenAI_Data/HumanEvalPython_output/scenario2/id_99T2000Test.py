# id_99_Test.java
from scenario2.id_99 import closest_integer

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`scenario2.id_99.closest_integer`.
    """


    def test_closest_integer_1(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.4') == 1
        assert closest_integer('1.5') == 2
        assert closest_integer('1.6') == 2
        assert closest_integer('-1.4') == -1
        assert closest_integer('-1.5') == -2
        assert closest_integer('-1.6') == -2
        assert closest_integer('1.499999999999999') == 1
        assert closest_integer('1.500000000000001') == 2
        assert closest_integer('-1.499999999999999') == -1
        assert closest_integer('-1.500000000000001') == -2

    def test_closest_integer_2(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.0') == 1
        assert closest_integer('-1.0') == -1
        assert closest_integer('1.00000000000000000000') == 1
        assert closest_integer('-1.00000000000000000000') == -1
        assert closest_integer('1.00000000000000000001') == 1
        assert closest_integer('-1.00000000000000000001') == -1
        assert closest_integer('1.000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000001') == -1

    def test_closest_integer_3(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000001') == -1

    def test_closest_integer_4(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.0000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000001') == -1

    def test_closest_integer_5(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.00000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000001') == -1

    def test_closest_integer_6(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000001') == -1

    def test_closest_integer_7(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.0000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000000001') == -1

    def test_closest_integer_8(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.00000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000000000000001') == -1

    def test_closest_integer_9(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000000000000000001') == -1

    def test_closest_integer_10(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.0000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.000000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.000000000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.0000000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.0000000000000000000000000000000000000000000000000001') == -1
        assert closest_integer('1.00000000000000000000000000000000000000000000000000001') == 1
        assert closest_integer('-1.00000000000000000000000000000000000000000000000000001') == -1

    def test_closest_integer_11(self):
        """
        Test case for closest_integer.
        """
        assert closest_integer('1.00000000000000000000000000000000000000000000000000001') == 1
        assert