# id_120_Test.java
from original.id_120 import maximum

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`original.id_120.maximum`.
    """


    def test_case_1(self):
        """
        Test case 1 for :func:`original.id_120.maximum`.
        """
        arr = [-3, -4, 5]
        k = 3
        expected = [-4, -3, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_2(self):
        """
        Test case 2 for :func:`original.id_120.maximum`.
        """
        arr = [4, -4, 4]
        k = 2
        expected = [4, 4]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_3(self):
        """
        Test case 3 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 1
        expected = [2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_4(self):
        """
        Test case 4 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 2
        expected = [1, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_5(self):
        """
        Test case 5 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 3
        expected = [1, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_6(self):
        """
        Test case 6 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 4
        expected = [1, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_7(self):
        """
        Test case 7 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 5
        expected = [1, 2, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_8(self):
        """
        Test case 8 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 6
        expected = [1, 2, 2, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_9(self):
        """
        Test case 9 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 7
        expected = [1, 2, 2, 2, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_10(self):
        """
        Test case 10 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 0
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

# id_120_Test.py
from original.id_120 import maximum

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`original.id_120.maximum`.
    """
		
    def test_case_1(self):
        """
        Test case 1 for :func:`original.id_120.maximum`.
        """
        arr = [-3, -4, 5]
        k = 3
        expected = [-4, -3, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_2(self):
        """
        Test case 2 for :func:`original.id_120.maximum`.
        """
        arr = [4, -4, 4]
        k = 2
        expected = [4, 4]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_3(self):
        """
        Test case 3 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 1
        expected = [2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_4(self):
        """
        Test case 4 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 2
        expected = [1, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_5(self):
        """
        Test case 5 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 3
        expected = [1, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_6(self):
        """
        Test case 6 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 4
        expected = [1, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_7(self):
        """
        Test case 7 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 5
        expected = [1, 2, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_8(self):
        """
        Test case 8 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 6
        expected = [1, 2, 2, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_9(self):
        """
        Test case 9 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 7
        expected = [1, 2, 2, 2, 2, 2, 2]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_10(self):
        """
        Test case 10 for :func:`original.id_120.maximum`.
        """
        arr = [-3, 2, 1, 2, -1, -2, 1]
        k = 0
        expected = []
        actual = maximum(arr, k)
        assert actual == expected

# id_120_Test.py
from original.id_120 import maximum

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`original.id_120.maximum`.
    """
		
    def test_case_1(self):
        """
        Test case 1 for :func:`original.id_120.maximum`.
        """
        arr = [-3, -4, 5]
        k = 3
        expected = [-4, -3, 5]
        actual = maximum(arr, k)
        assert actual == expected

    def test_case_2(self):
        """
        Test case 2 for :func:`original.id_120.maximum`.