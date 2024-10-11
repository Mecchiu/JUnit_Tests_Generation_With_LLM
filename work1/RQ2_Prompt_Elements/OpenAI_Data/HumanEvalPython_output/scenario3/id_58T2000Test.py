# id_58_Test.java
from scenario3.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario3.id_58.common`.
    """


    def test_common_1(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121]) == [1, 5, 653]

    def test_common_2(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([5, 3, 2, 8], [3, 2]) == [2, 3]

    def test_common_3(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], []) == []

    def test_common_5(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([], [1, 2, 3, 4, 5]) == []

    def test_common_6(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([], []) == []

    def test_common_7(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_9(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    def test_common_10(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], []) == []


# id_58_Test.py
from scenario3.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario3.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121]) == [1, 5, 653]

    def test_common_2(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([5, 3, 2, 8], [3, 2]) == [2, 3]

    def test_common_3(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], []) == []

    def test_common_5(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([], [1, 2, 3, 4, 5]) == []

    def test_common_6(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([], []) == []

    def test_common_7(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_9(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    def test_common_10(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], []) == []


# id_58_Test.java
from scenario3.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario3.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121]) == [1, 5, 653]

    def test_common_2(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([5, 3, 2, 8], [3, 2]) == [2, 3]

    def test_common_3(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], []) == []

    def test_common_5(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([], [1, 2, 3, 4, 5]) == []

    def test_common_6(self):
        """
        Test case for the :func:`scenario3.id_58.common`.
        """
        assert common([], []) == []

    def test_common_7(self):
        """
        Test case for the :func:`scenario3.id_58