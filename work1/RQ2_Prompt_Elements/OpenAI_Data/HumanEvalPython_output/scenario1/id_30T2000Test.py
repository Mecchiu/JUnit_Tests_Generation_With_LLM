# id_30_Test.java
from scenario1.id_30 import get_positive

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario1.id_30.get_positive`.
    """


    def test_get_positive_1(self):
        """
        Test case 1 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_2(self):
        """
        Test case 2 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -3, -4, -5]) == []

    def test_get_positive_3(self):
        """
        Test case 3 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 0, 0, 0, 0]) == []

    def test_get_positive_4(self):
        """
        Test case 4 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, -2, 3, -4, 5]) == [1, 3, 5]

    def test_get_positive_5(self):
        """
        Test case 5 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -3, 4, -5]) == [2, 4]

    def test_get_positive_6(self):
        """
        Test case 6 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_7(self):
        """
        Test case 7 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -3, -4, -5, 0]) == []

    def test_get_positive_8(self):
        """
        Test case 8 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 0, 0, 0, 0, 0]) == []

    def test_get_positive_9(self):
        """
        Test case 9 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, -2, 3, -4, 5, 0]) == [1, 3, 5]

    def test_get_positive_10(self):
        """
        Test case 10 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -3, 4, -5, 0]) == [2, 4]

# id_30_Test.py
from scenario1.id_30 import get_positive

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario1.id_30.get_positive`.
    """
		
    def test_get_positive_1(self):
        """
        Test case 1 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_2(self):
        """
        Test case 2 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -3, -4, -5]) == []

    def test_get_positive_3(self):
        """
        Test case 3 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 0, 0, 0, 0]) == []

    def test_get_positive_4(self):
        """
        Test case 4 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, -2, 3, -4, 5]) == [1, 3, 5]

    def test_get_positive_5(self):
        """
        Test case 5 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -3, 4, -5]) == [2, 4]

    def test_get_positive_6(self):
        """
        Test case 6 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_7(self):
        """
        Test case 7 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -3, -4, -5, 0]) == []

    def test_get_positive_8(self):
        """
        Test case 8 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 0, 0, 0, 0, 0]) == []

    def test_get_positive_9(self):
        """
        Test case 9 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, -2, 3, -4, 5, 0]) == [1, 3, 5]

    def test_get_positive_10(self):
        """
        Test case 10 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -3, 4, -5, 0]) == [2, 4]

# id_30_Test.java
from scenario1.id_30 import get_positive

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario1.id_30.get_positive`.
    """
		
    def test_get_positive_1(self):
        """
        Test case 1 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_2(self):
        """
        Test case 2 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -3, -4, -5]) == []

    def test_get_positive_3(self):
        """
        Test case 3 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 0, 0, 0, 0]) == []

    def test_get_positive_4(self):
        """
        Test case 4 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([1, -2, 3, -4, 5]) == [1, 3, 5]

    def test_get_positive_5(self):
        """
        Test case 5 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -3, 4, -5]) == [2, 4]

    def test_get_positive_6(self):
        """
        Test case 6 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([0, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_7(self):
        """
        Test case 7 for :func:`scenario1.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -3, -4, -5, 0]) == []

    def test_get_positive_8(self):
        """
        Test case 8 for :func:`sc