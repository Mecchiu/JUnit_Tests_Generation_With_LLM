# id_68_Test.java
from scenario1.id_68 import pluck

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario1.id_68.pluck`.
    """


    def test_pluck_1(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([]) == []

    def test_pluck_2(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5]) == [2,1]

    def test_pluck_3(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6]) == [2,1]

    def test_pluck_4(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7]) == [2,1]

    def test_pluck_5(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8]) == [2,1]

    def test_pluck_6(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9]) == [2,1]

    def test_pluck_7(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10]) == [2,1]

    def test_pluck_8(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10,11]) == [2,1]

    def test_pluck_9(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10,11,12]) == [2,1]

    def test_pluck_10(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10,11,12,13]) == [2,1]

# id_68_Test.py
from scenario1.id_68 import pluck

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario1.id_68.pluck`.
    """
		
    def test_pluck_1(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([]) == []

    def test_pluck_2(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5]) == [2,1]

    def test_pluck_3(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6]) == [2,1]

    def test_pluck_4(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7]) == [2,1]

    def test_pluck_5(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8]) == [2,1]

    def test_pluck_6(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9]) == [2,1]

    def test_pluck_7(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10]) == [2,1]

    def test_pluck_8(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10,11]) == [2,1]

    def test_pluck_9(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10,11,12]) == [2,1]

    def test_pluck_10(self):
        """
        Test case for the :func:`scenario1.id_68.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9,10,11,12,13]) == [2,1]

# id_69.py

def pluck(arr):

    if(len(arr) == 0): return []
    evens = list(filter(lambda x: x%2 == 0, arr))
    if(evens == []): return []
    return [min(evens), arr.index(min(evens))]

# id_69_Test.java
from scenario1.id_69 import pluck

import pytest

class id_69_Test:
    """
    Test class of id_69.py.
    It contains ten unit test cases for the :func:`scenario1.id_69.pluck`.
    """
		
    def test_pluck_1(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([]) == []

    def test_pluck_2(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([1,2,3,4,5]) == [2,1]

    def test_pluck_3(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([1,2,3,4,5,6]) == [2,1]

    def test_pluck_4(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7]) == [2,1]

    def test_pluck_5(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8]) == [2,1]

    def test_pluck_6(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([1,2,3,4,5,6,7,8,9]) == [2,1]

    def test_pluck_7(self):
        """
        Test case for the :func:`scenario1.id_69.pluck`.
        """
        assert pluck([1,2,3