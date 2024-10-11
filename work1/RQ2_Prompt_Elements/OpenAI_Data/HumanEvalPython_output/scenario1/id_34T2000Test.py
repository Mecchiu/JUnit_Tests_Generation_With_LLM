# id_34_Test.java
from scenario1.id_34 import unique

import pytest

class id_34_Test:
    """
    Test class of id_34.py.
    It contains ten unit test cases for the :func:`scenario1.id_34.unique`.
    """


    def test_unique_1(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_2(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_3(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_4(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_5(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_6(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_7(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_8(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_9(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_10(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

# id_34_Test.py
from scenario1.id_34 import unique

import pytest

class id_34_Test:
    """
    Test class of id_34.py.
    It contains ten unit test cases for the :func:`scenario1.id_34.unique`.
    """
		
    def test_unique_1(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_2(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_3(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_4(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_5(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_6(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_7(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_8(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert unique([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_unique_9(self):
        """
        Test case for the :func:`scenario1.id_34.unique`.
        """
        assert