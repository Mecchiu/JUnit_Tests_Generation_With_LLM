# id_44_Test.java
from scenario1.id_44 import change_base

import pytest

class id_44_Test:
    """
    Test class of id_44.py.
    It contains ten unit test cases for the :func:`scenario1.id_44.change_base`.
    """


    def test_change_base_1(self):
        """
        Test case 1 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 2) == "1010"

    def test_change_base_2(self):
        """
        Test case 2 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 3) == "101"

    def test_change_base_3(self):
        """
        Test case 3 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 4) == "22"

    def test_change_base_4(self):
        """
        Test case 4 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 5) == "20"

    def test_change_base_5(self):
        """
        Test case 5 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 6) == "14"

    def test_change_base_6(self):
        """
        Test case 6 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 7) == "13"

    def test_change_base_7(self):
        """
        Test case 7 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 8) == "12"

    def test_change_base_8(self):
        """
        Test case 8 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 9) == "11"

    def test_change_base_9(self):
        """
        Test case 9 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 10) == "10"

    def test_change_base_10(self):
        """
        Test case 10 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 11) == "a"


# id_44_Test.py
from scenario1.id_44 import change_base

import pytest

class id_44_Test:
    """
    Test class of id_44.py.
    It contains ten unit test cases for the :func:`scenario1.id_44.change_base`.
    """
		
    def test_change_base_1(self):
        """
        Test case 1 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 2) == "1010"

    def test_change_base_2(self):
        """
        Test case 2 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 3) == "101"

    def test_change_base_3(self):
        """
        Test case 3 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 4) == "22"

    def test_change_base_4(self):
        """
        Test case 4 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 5) == "20"

    def test_change_base_5(self):
        """
        Test case 5 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 6) == "14"

    def test_change_base_6(self):
        """
        Test case 6 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 7) == "13"

    def test_change_base_7(self):
        """
        Test case 7 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 8) == "12"

    def test_change_base_8(self):
        """
        Test case 8 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 9) == "11"

    def test_change_base_9(self):
        """
        Test case 9 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 10) == "10"

    def test_change_base_10(self):
        """
        Test case 10 for :func:`scenario1.id_44.change_base`.
        """
        assert change_base(10, 11) == "a"


# id_45.py


def change_base(x: int, base: int):

    ret = ""
    while x > 0:
        ret = str(x % base) + ret
        x //= base
    return ret


# id_45_Test.java
from scenario1.id_45 import change_base

import pytest

class id_45_Test:
    """
    Test class of id_45.py.
    It contains ten unit test cases for the :func:`scenario1.id_45.change_base`.
    """
		
    def test_change_base_1(self):
        """
        Test case 1 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 2) == "1010"

    def test_change_base_2(self):
        """
        Test case 2 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 3) == "101"

    def test_change_base_3(self):
        """
        Test case 3 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 4) == "22"

    def test_change_base_4(self):
        """
        Test case 4 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 5) == "20"

    def test_change_base_5(self):
        """
        Test case 5 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 6) == "14"

    def test_change_base_6(self):
        """
        Test case 6 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 7) == "13"

    def test_change_base_7(self):
        """
        Test case 7 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 8) == "12"

    def test_change_base_8(self):
        """
        Test case 8 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 9) == "11"

    def test_change_base_9(self):
        """
        Test case 9 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 10) == "10"

    def test_change_base_10(self):
        """
        Test case 10 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 11) == "a"


# id_45_Test.py
from scenario1.id_45 import change_base

import pytest

class id_45_Test:
    """
    Test class of id_45.py.
    It contains ten unit test cases for the :func:`scenario1.id_45.change_base`.
    """
		
    def test_change_base_1(self):
        """
        Test case 1 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 2) == "1010"

    def test_change_base_2(self):
        """
        Test case 2 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 3) == "101"

    def test_change_base_3(self):
        """
        Test case 3 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 4) == "22"

    def test_change_base_4(self):
        """
        Test case 4 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 5) == "20"

    def test_change_base_5(self):
        """
        Test case 5 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 6) == "14"

    def test_change_base_6(self):
        """
        Test case 6 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 7) == "13"

    def test_change_base_7(self):
        """
        Test case 7 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 8) == "12"

    def test_change_base_8(self):
        """
        Test case 8 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 9) == "11"

    def test_change_base_9(self):
        """
        Test case 9 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 10) == "10"

    def test_change_base_10(self):
        """
        Test case 10 for :func:`scenario1.id_45.change_base`.
        """
        assert change_base(10, 11) == "a"


# id_46.py


def change_base(x: int, base: int):

    ret = ""
    while x > 0:
        ret = str(x % base) + ret
        x //= base
    return ret


# id_46_Test.java
from scenario1.id_46 import change_base

import pytest

class id_46_Test:
    """
    Test class of id_46.py.
    It contains ten unit test cases for the :func:`scenario1.id_46.change_base`.
    """
		
    def test_change_base_1(self):
        """
        Test case 1 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 2) == "1010"

    def test_change_base_2(self):
        """
        Test case 2 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 3) == "101"

    def test_change_base_3(self):
        """
        Test case 3 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 4) == "22"

    def test_change_base_4(self):
        """
        Test case 4 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 5) == "20"

    def test_change_base_5(self):
        """
        Test case 5 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 6) == "14"

    def test_change_base_6(self):
        """
        Test case 6 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 7) == "13"

    def test_change_base_7(self):
        """
        Test case 7 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 8) == "12"

    def test_change_base_8(self):
        """
        Test case 8 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 9) == "11"

    def test_change_base_9(self):
        """
        Test case 9 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 10) == "10"

    def test_change_base_10(self):
        """
        Test case 10 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 11) == "a"


# id_46_Test.py
from scenario1.id_46 import change_base

import pytest

class id_46_Test:
    """
    Test class of id_46.py.
    It contains ten unit test cases for the :func:`scenario1.id_46.change_base`.
    """
		
    def test_change_base_1(self):
        """
        Test case 1 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 2) == "1010"

    def test_change_base_2(self):
        """
        Test case 2 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 3) == "101"

    def test_change_base_3(self):
        """
        Test case 3 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 4) == "22"

    def test_change_base_4(self):
        """
        Test case 4 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 5) == "20"

    def test_change_base_5(self):
        """
        Test case 5 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 6) == "14"

    def test_change_base_6(self):
        """
        Test case 6 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 7) == "13"

    def test_change_base_7(self):
        """
        Test case 7 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 8) == "12"

    def test_change_base_8(self):
        """
        Test case 8 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 9) == "11"

    def test_change_base_9(self):
        """
        Test case 9 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 10) == "10"

    def test_change_base_10(self):
        """
        Test case 10 for :func:`scenario1.id_46.change_base`.
        """
        assert change_base(10, 11) == "a"


# id_47.py


def change_base(x: int, base: int):

    ret = ""
    while x > 0:
        ret = str(x % base) + ret
        x //= base
    return ret


# id_47_Test.java
from scenario1.id_47 import change_base

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It