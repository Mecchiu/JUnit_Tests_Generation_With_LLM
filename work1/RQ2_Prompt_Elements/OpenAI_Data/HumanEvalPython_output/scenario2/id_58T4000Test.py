# id_58_Test.java
from scenario2.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario2.id_58.common`.
    """


    def test_common_1(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [2, 3, 4]) == [2, 3]

    def test_common_2(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [4, 5, 6]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [3, 2, 1]) == [1, 2, 3]

    def test_common_4(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3]) == [1, 2, 3]

    def test_common_5(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5]) == [1, 2, 3]

    def test_common_6(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3]) == [1, 2, 3]

    def test_common_7(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3]

    def test_common_8(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3]) == [1, 2, 3]

    def test_common_9(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], []) == []

    def test_common_10(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([], [1, 2, 3]) == []

# id_58_Test.py
from scenario2.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario2.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [2, 3, 4]) == [2, 3]

    def test_common_2(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [4, 5, 6]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [3, 2, 1]) == [1, 2, 3]

    def test_common_4(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3]) == [1, 2, 3]

    def test_common_5(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5]) == [1, 2, 3]

    def test_common_6(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3]) == [1, 2, 3]

    def test_common_7(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3]

    def test_common_8(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3]) == [1, 2, 3]

    def test_common_9(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], []) == []

    def test_common_10(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([], [1, 2, 3]) == []

# id_58_Test.java
from scenario2.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario2.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [2, 3, 4]) == [2, 3]

    def test_common_2(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [4, 5, 6]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [3, 2, 1]) == [1, 2, 3]

    def test_common_4(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3]) == [1, 2, 3]

    def test_common_5(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5]) == [1, 2, 3]

    def test_common_6(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3]) == [1, 2, 3]

    def test_common_7(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3]

    def test_common_8(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3]) == [1, 2, 3]

    def test_common_9(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], []) == []

    def test_common_10(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([], [1, 2, 3]) == []

# id_58_Test.py
from scenario2.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario2.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [2, 3, 4]) == [2, 3]

    def test_common_2(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [4, 5, 6]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [3, 2, 1]) == [1, 2, 3]

    def test_common_4(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3]) == [1, 2, 3]

    def test_common_5(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5]) == [1, 2, 3]

    def test_common_6(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3]) == [1, 2, 3]

    def test_common_7(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3]

    def test_common_8(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3]) == [1, 2, 3]

    def test_common_9(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], []) == []

    def test_common_10(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([], [1, 2, 3]) == []

# id_58_Test.java
from scenario2.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario2.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [2, 3, 4]) == [2, 3]

    def test_common_2(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [4, 5, 6]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [3, 2, 1]) == [1, 2, 3]

    def test_common_4(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3]) == [1, 2, 3]

    def test_common_5(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5]) == [1, 2, 3]

    def test_common_6(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3]) == [1, 2, 3]

    def test_common_7(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3]

    def test_common_8(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [1, 2, 3]) == [1, 2, 3]

    def test_common_9(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], []) == []

    def test_common_10(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([], [1, 2, 3]) == []

# id_58_Test.py
from scenario2.id_58 import common

import pytest

class id_58_Test:
    """
    Test class of id_58.py.
    It contains ten unit test cases for the :func:`scenario2.id_58.common`.
    """
		
    def test_common_1(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [2, 3, 4]) == [2, 3]

    def test_common_2(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [4, 5, 6]) == []

    def test_common_3(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [3, 2, 1]) == [1, 2, 3]

    def test_common_4(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3]) == [1, 2, 3]

    def test_common_5(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2, 3, 4, 5]) == [1, 2, 3]

    def test_common_6(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3, 4, 5], [1, 2, 3]) == [1, 2, 3]

    def test_common_7(self):
        """
        Test case for the :func:`scenario2.id_58.common`.
        """
        assert common([1, 2, 3], [1, 2