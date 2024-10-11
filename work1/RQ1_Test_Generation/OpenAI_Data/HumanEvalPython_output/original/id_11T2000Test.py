# id_11_Test.java
from original.id_11 import string_xor

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`original.id_11.string_xor`.
    """


    def test_string_xor_1(self):
        """
        Test case 1 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('010', '110') == '100'

    def test_string_xor_2(self):
        """
        Test case 2 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_3(self):
        """
        Test case 3 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_4(self):
        """
        Test case 4 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('111', '111') == '000'

    def test_string_xor_5(self):
        """
        Test case 5 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('000', '000') == '000'

    def test_string_xor_6(self):
        """
        Test case 6 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('001', '001') == '000'

    def test_string_xor_7(self):
        """
        Test case 7 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('010', '010') == '000'

    def test_string_xor_8(self):
        """
        Test case 8 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('100', '100') == '000'

    def test_string_xor_9(self):
        """
        Test case 9 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('011', '011') == '000'

    def test_string_xor_10(self):
        """
        Test case 10 for :func:`original.id_11.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_12.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_12_Test.java
from original.id_12 import string_xor

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`original.id_12.string_xor`.
    """
		
    def test_string_xor_1(self):
        """
        Test case 1 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('010', '110') == '100'

    def test_string_xor_2(self):
        """
        Test case 2 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_3(self):
        """
        Test case 3 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_4(self):
        """
        Test case 4 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('111', '111') == '000'

    def test_string_xor_5(self):
        """
        Test case 5 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('000', '000') == '000'

    def test_string_xor_6(self):
        """
        Test case 6 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('001', '001') == '000'

    def test_string_xor_7(self):
        """
        Test case 7 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('010', '010') == '000'

    def test_string_xor_8(self):
        """
        Test case 8 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('100', '100') == '000'

    def test_string_xor_9(self):
        """
        Test case 9 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('011', '011') == '000'

    def test_string_xor_10(self):
        """
        Test case 10 for :func:`original.id_12.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_13.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    >>> string_xor('010', '110')
    '100'
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_13_Test.java
from original.id_13 import string_xor

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`original.id_13.string_xor`.
    """
		
    def test_string_xor_1(self):
        """
        Test case 1 for :func:`original.id_13.string_xor`.
        """
        assert string_xor('010', '110') == '100'

    def test_string_xor_2(self):
        """
        Test case 2 for :func:`original.id_13.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_3(self):
        """
        Test case 3 for :func:`original.id_13.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_4(self):
        """
        Test case 4 for :func:`original.id_13.string_xor`.
        """
        assert string_xor('111', '111') == '000'

    def test_string_xor_5(self):
        """
        Test case 5 for :func:`original.id_13.string_xor`.
        """
        assert string_xor('000', '000') == '000'

    def test_string_xor_6(self):
        """
        Test case 6 for :func:`original.id_13.string_xor`.
        """
        assert string_xor('001', '001') == '000'

    def test_string_xor_7(self):
        """
        Test case 7 for :func:`original.id_13.string_x