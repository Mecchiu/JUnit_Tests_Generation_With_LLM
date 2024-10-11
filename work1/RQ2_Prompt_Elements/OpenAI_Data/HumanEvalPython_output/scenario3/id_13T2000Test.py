# id_13_Test.java
from scenario3.id_13 import greatest_common_divisor

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`scenario3.id_13.greatest_common_divisor`.
    """


    def test_greatest_common_divisor_1(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(3, 5) == 1

    def test_greatest_common_divisor_2(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(25, 15) == 5

    def test_greatest_common_divisor_3(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(0, 0) == 0

    def test_greatest_common_divisor_4(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(0, 1) == 1

    def test_greatest_common_divisor_5(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(1, 0) == 1

    def test_greatest_common_divisor_6(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(1, 1) == 1

    def test_greatest_common_divisor_7(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(1, 2) == 1

    def test_greatest_common_divisor_8(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(2, 1) == 1

    def test_greatest_common_divisor_9(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(2, 2) == 2

    def test_greatest_common_divisor_10(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(2, 3) == 1

# id_13_Test.py
from scenario3.id_13 import greatest_common_divisor

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`scenario3.id_13.greatest_common_divisor`.
    """
		
    def test_greatest_common_divisor_1(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(3, 5) == 1

    def test_greatest_common_divisor_2(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(25, 15) == 5

    def test_greatest_common_divisor_3(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(0, 0) == 0

    def test_greatest_common_divisor_4(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(0, 1) == 1

    def test_greatest_common_divisor_5(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(1, 0) == 1

    def test_greatest_common_divisor_6(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(1, 1) == 1

    def test_greatest_common_divisor_7(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(1, 2) == 1

    def test_greatest_common_divisor_8(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(2, 1) == 1

    def test_greatest_common_divisor_9(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(2, 2) == 2

    def test_greatest_common_divisor_10(self):
        """
        Test case for the :func:`scenario3.id_13.greatest_common_divisor` function.
        """
        assert greatest_common_divisor(2, 3) == 1

# id_14.py


def least_common_multiple(a: int, b: int) -> int:
    """ Return a least common multiple of two integers a and b
    >>> least_common_multiple(3, 5)
    15
    >>> least_common_multiple(25, 15)
    75
    """

    pass
# id_14_Test.java
from scenario3.id_14 import least_common_multiple

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`scenario3.id_14.least_common_multiple`.
    """
		
    def test_least_common_multiple_1(self):
        """
        Test case for the :func:`scenario3.id_14.least_common_multiple` function.
        """
        assert least_common_multiple(3, 5) == 15

    def test_least_common_multiple_2(self):
        """
        Test case for the :func:`scenario3.id_14.least_common_multiple` function.
        """
        assert least_common_multiple(25, 15) == 75

    def test_least_common_multiple_3(self):
        """
        Test case for the :func:`scenario3.id_14.least_common_multiple` function.
        """
        assert least_common_multiple(0, 0) == 0

    def test_least_common_multiple_4(self):
        """
        Test case for the :func:`scenario3.id_14.least_common_multiple` function.
        """
        assert least_common_multiple(0, 1) == 0

    def test_least_common_multiple_5(self):
        """
        Test case for the :func:`scenario3.id_14.least_common_multiple` function.
        """
        assert least_common_multiple(1, 0) == 0

    def test_least_common_multiple_6(self):
        """
        Test case