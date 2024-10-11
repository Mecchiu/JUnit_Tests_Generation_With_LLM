# id_5_Test.java
from original.id_5 import intersperse

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`original.id_5.intersperse`.
    """


    def test_intersperse_empty_list(self):
        """
        Test case for empty list.
        """
        assert intersperse([], 4) == []

    def test_intersperse_one_element_list(self):
        """
        Test case for one element list.
        """
        assert intersperse([1], 4) == [1]

    def test_intersperse_two_element_list(self):
        """
        Test case for two element list.
        """
        assert intersperse([1, 2], 4) == [1, 4, 2]

    def test_intersperse_three_element_list(self):
        """
        Test case for three element list.
        """
        assert intersperse([1, 2, 3], 4) == [1, 4, 2, 4, 3]

    def test_intersperse_four_element_list(self):
        """
        Test case for four element list.
        """
        assert intersperse([1, 2, 3, 4], 4) == [1, 4, 2, 4, 3, 4, 4]

    def test_intersperse_five_element_list(self):
        """
        Test case for five element list.
        """
        assert intersperse([1, 2, 3, 4, 5], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5]

    def test_intersperse_six_element_list(self):
        """
        Test case for six element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6]

    def test_intersperse_seven_element_list(self):
        """
        Test case for seven element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7]

    def test_intersperse_eight_element_list(self):
        """
        Test case for eight element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8]

    def test_intersperse_nine_element_list(self):
        """
        Test case for nine element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9]

# id_5_Test.py
from original.id_5 import intersperse

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`original.id_5.intersperse`.
    """
		
    def test_intersperse_empty_list(self):
        """
        Test case for empty list.
        """
        assert intersperse([], 4) == []

    def test_intersperse_one_element_list(self):
        """
        Test case for one element list.
        """
        assert intersperse([1], 4) == [1]

    def test_intersperse_two_element_list(self):
        """
        Test case for two element list.
        """
        assert intersperse([1, 2], 4) == [1, 4, 2]

    def test_intersperse_three_element_list(self):
        """
        Test case for three element list.
        """
        assert intersperse([1, 2, 3], 4) == [1, 4, 2, 4, 3]

    def test_intersperse_four_element_list(self):
        """
        Test case for four element list.
        """
        assert intersperse([1, 2, 3, 4], 4) == [1, 4, 2, 4, 3, 4, 4]

    def test_intersperse_five_element_list(self):
        """
        Test case for five element list.
        """
        assert intersperse([1, 2, 3, 4, 5], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5]

    def test_intersperse_six_element_list(self):
        """
        Test case for six element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6]

    def test_intersperse_seven_element_list(self):
        """
        Test case for seven element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7]

    def test_intersperse_eight_element_list(self):
        """
        Test case for eight element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8]

    def test_intersperse_nine_element_list(self):
        """
        Test case for nine element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7, 8, 9], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9]

# id_5_Test.java
from original.id_5 import intersperse

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`original.id_5.intersperse`.
    """
		
    def test_intersperse_empty_list(self):
        """
        Test case for empty list.
        """
        assert intersperse([], 4) == []

    def test_intersperse_one_element_list(self):
        """
        Test case for one element list.
        """
        assert intersperse([1], 4) == [1]

    def test_intersperse_two_element_list(self):
        """
        Test case for two element list.
        """
        assert intersperse([1, 2], 4) == [1, 4, 2]

    def test_intersperse_three_element_list(self):
        """
        Test case for three element list.
        """
        assert intersperse([1, 2, 3], 4) == [1, 4, 2, 4, 3]

    def test_intersperse_four_element_list(self):
        """
        Test case for four element list.
        """
        assert intersperse([1, 2, 3, 4], 4) == [1, 4, 2, 4, 3, 4, 4]

    def test_intersperse_five_element_list(self):
        """
        Test case for five element list.
        """
        assert intersperse([1, 2, 3, 4, 5], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5]

    def test_intersperse_six_element_list(self):
        """
        Test case for six element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6]

    def test_intersperse_seven_element_list(self):
        """
        Test case for seven element list.
        """
        assert intersperse([1, 2, 3, 4, 5, 6, 7], 4) == [1, 4, 2, 4, 3, 4, 4, 4, 5, 4, 6, 4, 7]

    def test_intersperse_eight_element_list(self):