# id_26_Test.java
from scenario1.id_26 import remove_duplicates

import pytest

class id_26_Test:
    """
    Test class of id_26.py.
    It contains ten unit test cases for the :func:`scenario1.id_26.remove_duplicates`.
    """


    def test_remove_duplicates_1(self):
        """
        Test case 1 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_2(self):
        """
        Test case 2 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 1, 2, 2, 3, 3, 4, 4, 5, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_3(self):
        """
        Test case 3 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_4(self):
        """
        Test case 4 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_5(self):
        """
        Test case 5 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_6(self):
        """
        Test case 6 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_7(self):
        """
        Test case 7 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_8(self):
        """
        Test case 8 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_9(self):
        """
        Test case 9 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_10(self):
        """
        Test case 10 for :func:`scenario1.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5]) == [1, 2, 3, 4, 5]