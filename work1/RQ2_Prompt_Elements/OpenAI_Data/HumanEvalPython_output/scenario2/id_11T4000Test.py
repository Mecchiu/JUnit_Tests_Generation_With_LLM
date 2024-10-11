# id_11_Test.java
from scenario2.id_11 import string_xor

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`scenario2.id_11.string_xor`.
    """


    def test_string_xor_1(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_2(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_3(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_4(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '000') == '101'

    def test_string_xor_5(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '100') == '001'

    def test_string_xor_6(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '001') == '100'

    def test_string_xor_7(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '110') == '011'

    def test_string_xor_8(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '011') == '110'

    def test_string_xor_9(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_10(self):
        """
        Test case for the :func:`scenario2.id_11.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_12.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_12_Test.java
from scenario2.id_12 import string_xor

import pytest

class id_12_Test:
    """
    Test class of id_12.py.
    It contains ten unit test cases for the :func:`scenario2.id_12.string_xor`.
    """
		
    def test_string_xor_1(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_2(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_3(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_4(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '000') == '101'

    def test_string_xor_5(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '100') == '001'

    def test_string_xor_6(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '001') == '100'

    def test_string_xor_7(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '110') == '011'

    def test_string_xor_8(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '011') == '110'

    def test_string_xor_9(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_10(self):
        """
        Test case for the :func:`scenario2.id_12.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_13.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_13_Test.java
from scenario2.id_13 import string_xor

import pytest

class id_13_Test:
    """
    Test class of id_13.py.
    It contains ten unit test cases for the :func:`scenario2.id_13.string_xor`.
    """
		
    def test_string_xor_1(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_2(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_3(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_4(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '000') == '101'

    def test_string_xor_5(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '100') == '001'

    def test_string_xor_6(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '001') == '100'

    def test_string_xor_7(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '110') == '011'

    def test_string_xor_8(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '011') == '110'

    def test_string_xor_9(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_10(self):
        """
        Test case for the :func:`scenario2.id_13.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_14.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_14_Test.java
from scenario2.id_14 import string_xor

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`scenario2.id_14.string_xor`.
    """
		
    def test_string_xor_1(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_2(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_3(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_4(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '000') == '101'

    def test_string_xor_5(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '100') == '001'

    def test_string_xor_6(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '001') == '100'

    def test_string_xor_7(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '110') == '011'

    def test_string_xor_8(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '011') == '110'

    def test_string_xor_9(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_10(self):
        """
        Test case for the :func:`scenario2.id_14.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_15.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_15_Test.java
from scenario2.id_15 import string_xor

import pytest

class id_15_Test:
    """
    Test class of id_15.py.
    It contains ten unit test cases for the :func:`scenario2.id_15.string_xor`.
    """
		
    def test_string_xor_1(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '010') == '111'

    def test_string_xor_2(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '101') == '000'

    def test_string_xor_3(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_4(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '000') == '101'

    def test_string_xor_5(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '100') == '001'

    def test_string_xor_6(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '001') == '100'

    def test_string_xor_7(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '110') == '011'

    def test_string_xor_8(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '011') == '110'

    def test_string_xor_9(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '111') == '010'

    def test_string_xor_10(self):
        """
        Test case for the :func:`scenario2.id_15.string_xor`.
        """
        assert string_xor('101', '010') == '111'

# id_16.py
from typing import List


def string_xor(a: str, b: str) -> str:
    """ Input are two strings a and b consisting only of 1s and 0s.
    Perform binary XOR on these inputs and return result also as a string.
    
    """

    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

# id_16_Test.