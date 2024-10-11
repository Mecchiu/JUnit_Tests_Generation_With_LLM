# id_120_Test.java
from scenario1.id_120 import maximum

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`scenario1.id_120.maximum`.
    """


    def test_maximum_1(self):
        """
        Test case 1 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 2
        expected = [4, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_2(self):
        """
        Test case 2 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 1
        expected = [5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_3(self):
        """
        Test case 3 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 0
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_4(self):
        """
        Test case 4 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 5
        expected = [1, 2, 3, 4, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_5(self):
        """
        Test case 5 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 6
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_6(self):
        """
        Test case 6 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -1
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_7(self):
        """
        Test case 7 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -2
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_8(self):
        """
        Test case 8 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -3
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_9(self):
        """
        Test case 9 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -4
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_10(self):
        """
        Test case 10 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -5
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

# id_120_Test.py
from scenario1.id_120 import maximum

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`scenario1.id_120.maximum`.
    """
		
    def test_maximum_1(self):
        """
        Test case 1 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 2
        expected = [4, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_2(self):
        """
        Test case 2 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 1
        expected = [5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_3(self):
        """
        Test case 3 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 0
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_4(self):
        """
        Test case 4 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 5
        expected = [1, 2, 3, 4, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_5(self):
        """
        Test case 5 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 6
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_6(self):
        """
        Test case 6 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -1
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_7(self):
        """
        Test case 7 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -2
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_8(self):
        """
        Test case 8 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -3
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_9(self):
        """
        Test case 9 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -4
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_10(self):
        """
        Test case 10 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = -5
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

# id_120_Test.java
from scenario1.id_120 import maximum

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`scenario1.id_120.maximum`.
    """
		
    def test_maximum_1(self):
        """
        Test case 1 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 2
        expected = [4, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_2(self):
        """
        Test case 2 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 1
        expected = [5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_maximum_3(self):
        """
        Test case 3 for :func:`scenario1.id_120.maximum`.
        """
        arr = [1, 2, 3, 4, 5]
        k = 0
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

   