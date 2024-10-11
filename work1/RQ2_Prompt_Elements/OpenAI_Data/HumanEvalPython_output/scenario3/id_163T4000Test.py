# id_163_Test.java
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """


    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.py
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.java
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.py
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.java
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 3) == [0, 2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 4) == [0, 2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 5) == [0, 2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 6) == [0, 2, 4, 6]

# id_163_Test.py
from scenario3.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario3.id_163.generate_integers`.
    """
		
    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(10, 14) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 0) == [0]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 1) == [0]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_163.generate_integers`.
        """
        assert generate_integers(0, 2) == [0, 2]

    def test_generate