# id_58_Test.java
from scenario1.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario1.id_58.common`.
    """


    def test_common_1(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]) == [3, 4, 5]

    def test_common_2(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

    def test_common_5(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 3, 5, 7, 9]) == [1, 3, 5]

    def test_common_6(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [2, 4, 6, 8, 10]) == [2, 4]

    def test_common_7(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == []

    def test_common_9(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5]

    def test_common_10(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5]) == [1, 2, 3, 4, 5]

# id_58_Test.py
from scenario1.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario1.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]) == [3, 4, 5]

    def test_common_2(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

    def test_common_5(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 3, 5, 7, 9]) == [1, 3, 5]

    def test_common_6(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [2, 4, 6, 8, 10]) == [2, 4]

    def test_common_7(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == []

    def test_common_9(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5]

    def test_common_10(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5]) == [1, 2, 3, 4, 5]

# id_58_Test.py
from scenario1.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario1.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]) == [3, 4, 5]

    def test_common_2(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

    def test_common_5(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 3, 5, 7, 9]) == [1, 3, 5]

    def test_common_6(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [2, 4, 6, 8, 10]) == [2, 4]

    def test_common_7(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == []

    def test_common_9(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5]

    def test_common_10(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5]) == [1, 2, 3, 4, 5]

# id_58_Test.py
from scenario1.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario1.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]) == [3, 4, 5]

    def test_common_2(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

    def test_common_5(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 3, 5, 7, 9]) == [1, 3, 5]

    def test_common_6(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [2, 4, 6, 8, 10]) == [2, 4]

    def test_common_7(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == []

    def test_common_9(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5]

    def test_common_10(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5]) == [1, 2, 3, 4, 5]

# id_58_Test.py
from scenario1.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario1.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]) == [3, 4, 5]

    def test_common_2(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_common_4(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]

    def test_common_5(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 3, 5, 7, 9]) == [1, 3, 5]

    def test_common_6(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [2, 4, 6, 8, 10]) == [2, 4]

    def test_common_7(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5]

    def test_common_8(self):
        """
        Test case for the :func:`scenario1.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == []

    def test_common_9(self