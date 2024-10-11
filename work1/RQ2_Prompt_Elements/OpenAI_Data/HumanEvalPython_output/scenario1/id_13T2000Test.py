# id_13_Test.java
from scenario1.id_13 import greatest_common_divisor

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`scenario1.id_13.greatest_common_divisor`.
    """


    def test_greatest_common_divisor_1(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(1, 1) == 1

    def test_greatest_common_divisor_2(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(1, 2) == 1

    def test_greatest_common_divisor_3(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(2, 1) == 1

    def test_greatest_common_divisor_4(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(2, 2) == 2

    def test_greatest_common_divisor_5(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(2, 3) == 1

    def test_greatest_common_divisor_6(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(3, 2) == 1

    def test_greatest_common_divisor_7(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(3, 3) == 3

    def test_greatest_common_divisor_8(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(3, 4) == 1

    def test_greatest_common_divisor_9(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(4, 3) == 1

    def test_greatest_common_divisor_10(self):
        """
        Test case for the :func:`scenario1.id_13.greatest_common_divisor`.
        """
        assert greatest_common_divisor(4, 4) == 4