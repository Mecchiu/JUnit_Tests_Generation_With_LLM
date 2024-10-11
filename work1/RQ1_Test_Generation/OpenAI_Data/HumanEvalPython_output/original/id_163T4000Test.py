# id_163_Test.java
from original.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`original.id_163.generate_integers`.
    """


    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(8, 8) == [8]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 12) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(12, 2) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 14) == [2, 4, 6, 8, 10, 12, 14]

# id_163_Test.py
from original.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`original.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(8, 8) == [8]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 12) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(12, 2) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_163.generate_integers`.
        """
        assert generate_integers(2, 14) == [2, 4, 6, 8, 10, 12, 14]

# id_164.py

def generate_integers(a, b):
    """
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generate_integers(2, 8) => [2, 4, 6, 8]
    generate_integers(8, 2) => [2, 4, 6, 8]
    generate_integers(10, 14) => []
    """

    lower = max(2, min(a, b))
    upper = min(8, max(a, b))

    return [i for i in range(lower, upper+1) if i % 2 == 0]

# id_164_Test.java
from original.id_164 import generate_integers

import pytest

class id_164_Test:
    """
    Test class of id_164.py.
    It contains ten unit test cases for the :func:`original.id_164.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(8, 8) == [8]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 12) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(12, 2) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 14) == [2, 4, 6, 8, 10, 12, 14]

# id_164_Test.py
from original.id_164 import generate_integers

import pytest

class id_164_Test:
    """
    Test class of id_164.py.
    It contains ten unit test cases for the :func:`original.id_164.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(8, 8) == [8]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 12) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(12, 2) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_164.generate_integers`.
        """
        assert generate_integers(2, 14) == [2, 4, 6, 8, 10, 12, 14]

# id_165.py

def generate_integers(a, b):
    """
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generate_integers(2, 8) => [2, 4, 6, 8]
    generate_integers(8, 2) => [2, 4, 6, 8]
    generate_integers(10, 14) => []
    """

    lower = max(2, min(a, b))
    upper = min(8, max(a, b))

    return [i for i in range(lower, upper+1) if i % 2 == 0]

# id_165_Test.java
from original.id_165 import generate_integers

import pytest

class id_165_Test:
    """
    Test class of id_165.py.
    It contains ten unit test cases for the :func:`original.id_165.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(2, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(8, 8) == [8]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(2, 10) == [2, 4, 6, 8, 10]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(10, 2) == [2, 4, 6, 8, 10]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(2, 12) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(12, 2) == [2, 4, 6, 8, 10, 12]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`original.id_165.generate_integers`.
        """
        assert generate_integers(2, 14) == [2, 4, 6, 8, 10, 12, 14]

# id_165_Test.py
from original.id_165 import generate_integers

import pytest

class id_165_Test:
    """
    Test class of id_165.py.
    It contains ten unit test cases for the :func:`original.id_165.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func