# id_35_Test.java
from scenario3.id_35 import max_element

import pytest

class id_35_Test:
    """
    Test class of id_35.py.
    It contains ten unit test cases for the :func:`scenario3.id_35.max_element`.
    """


    def test_max_element_1(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3]) == 3

    def test_max_element_2(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]) == 123

    def test_max_element_3(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_4(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -1

    def test_max_element_5(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 10

    def test_max_element_6(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_7(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 10

    def test_max_element_8(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_9(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 10

    def test_max_element_10(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

# id_35_Test.py
from scenario3.id_35 import max_element

import pytest

class id_35_Test:
    """
    Test class of id_35.py.
    It contains ten unit test cases for the :func:`scenario3.id_35.max_element`.
    """
		
    def test_max_element_1(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3]) == 3

    def test_max_element_2(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]) == 123

    def test_max_element_3(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_4(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -1

    def test_max_element_5(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 10

    def test_max_element_6(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_7(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 10

    def test_max_element_8(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

    def test_max_element_9(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 10

    def test_max_element_10(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 10

# id_35_Test.java
from scenario3.id_35 import max_element

import pytest

class id_35_Test:
    """
    Test class of id_35.py.
    It contains ten unit test cases for the :func:`scenario3.id_35.max_element`.
    """
		
    def test_max_element_1(self):
        """
        Test case for the :func:`scenario3.id_35.max_element`.
        """
        assert max_element([1, 2, 3]) == 3

    def test_max_element_2(self):
        """