# id_105_Test.java
from scenario3.id_105 import by_length

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario3.id_105.by_length`.
    """


    def test_by_length_1(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([2, 1, 1, 4, 5, 8, 2, 3]) == ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]

    def test_by_length_2(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([]) == []

    def test_by_length_3(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, -1 , 55]) == ['One']

    def test_by_length_4(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

    def test_by_length_5(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([9, 8, 7, 6, 5, 4, 3, 2, 1]) == ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine']

    def test_by_length_6(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

    def test_by_length_7(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine']

    def test_by_length_8(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

    def test_by_length_9(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine']

    def test_by_length_10(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

# id_105_Test.py
from scenario3.id_105 import by_length

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario3.id_105.by_length`.
    """
		
    def test_by_length_1(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([2, 1, 1, 4, 5, 8, 2, 3]) == ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]

    def test_by_length_2(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([]) == []

    def test_by_length_3(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, -1 , 55]) == ['One']

    def test_by_length_4(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

    def test_by_length_5(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([9, 8, 7, 6, 5, 4, 3, 2, 1]) == ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine']

    def test_by_length_6(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

    def test_by_length_7(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine']

    def test_by_length_8(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

    def test_by_length_9(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == ['One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine']

    def test_by_length_10(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == ['Nine', 'Eight', 'Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One']

# id_105_Test.java
from scenario3.id_105 import by_length

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario3.id_105.by_length`.
    """
		
    def test_by_length_1(self):
        """
        Test case for the :func:`scenario3.id_105.by_length`.
        """
        assert by_length([2, 1, 1, 4, 5, 8, 2, 3]) == ["Eight", "Five", "Four", "Three", "Two", "Two", "One",