# id_119_Test.java
from scenario3.id_119 import match_parens

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`scenario3.id_119.match_parens`.
    """


    def test_match_parens_1(self):
        """
        Test case 1 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['()(', ')']) == 'Yes'

    def test_match_parens_2(self):
        """
        Test case 2 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens([')', ')']) == 'No'

    def test_match_parens_3(self):
        """
        Test case 3 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(', ')']) == 'Yes'

    def test_match_parens_4(self):
        """
        Test case 4 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(', '(']) == 'No'

    def test_match_parens_5(self):
        """
        Test case 5 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(()', ')']) == 'Yes'

    def test_match_parens_6(self):
        """
        Test case 6 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(()', '()']) == 'Yes'

    def test_match_parens_7(self):
        """
        Test case 7 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(()', '()(']) == 'No'

    def test_match_parens_8(self):
        """
        Test case 8 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()']) == 'Yes'

    def test_match_parens_9(self):
        """
        Test case 9 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()(']) == 'No'

    def test_match_parens_10(self):
        """
        Test case 10 for :func:`scenario3.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()()']) == 'Yes'

# id_120.py

def find_max_subarray(lst):
    '''
    You are given a list of integers.
    Your job is to find the maximum sum of a contiguous subarray within the list.
    For example, given the list [34, -50, 42, 14, -5, 86], the maximum sum would be 137,
    since we would take elements 42, 14, -5, and 86.
    Given the list [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.
    Your task is to write a function that finds the maximum sum of a contiguous subarray within the list.
    Return the maximum sum.

    Examples:
    find_max_subarray([34, -50, 42, 14, -5, 86]) == 137
    find_max_subarray([-5, -1, -8, -9]) == 0
    '''

    pass
# id_120_Test.java
from scenario3.id_120 import find_max_subarray

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`scenario3.id_120.find_max_subarray`.
    """
		
    def test_find_max_subarray_1(self):
        """
        Test case 1 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([34, -50, 42, 14, -5, 86]) == 137

    def test_find_max_subarray_2(self):
        """
        Test case 2 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9]) == 0

    def test_find_max_subarray_3(self):
        """
        Test case 3 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10]) == 0

    def test_find_max_subarray_4(self):
        """
        Test case 4 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11]) == 0

    def test_find_max_subarray_5(self):
        """
        Test case 5 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11, -12]) == 0

    def test_find_max_subarray_6(self):
        """
        Test case 6 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11, -12, -13]) == 0

    def test_find_max_subarray_7(self):
        """
        Test case 7 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11, -12, -13, -14]) == 0

    def test_find_max_subarray_8(self):
        """
        Test case 8 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15]) == 0

    def test_find_max_subarray_9(self):
        """
        Test case 9 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15, -16]) == 0

    def test_find_max_subarray_10(self):
        """
        Test case 10 for :func:`scenario3.id_120.find_max_subarray`.
        """
        assert find_max_subarray([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17]) == 0

# id_121.py

def find_max_subarray_2(lst):
    '''
    You are given a list of integers.
    Your job is to find the maximum sum of a contiguous subarray within the list.
    For example, given the list [34, -50, 42, 14, -5, 86], the maximum sum would be 137,
    since we would take elements 42, 14, -5, and 86.
    Given the list [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.
    Your task is to write a function that finds the maximum sum of a contiguous subarray within the list.
    Return the maximum sum.

    Examples:
    find_max_subarray_2([34, -50, 42, 14, -5, 86]) == 137
    find_max_subarray_2([-5, -1, -8, -9]) == 0
    '''

    pass
# id_121_Test.java
from scenario3.id_121 import find_max_subarray_2

import pytest

class id_121_Test:
    """
    Test class of id_121.py.
    It contains ten unit test cases for the :func:`scenario3.id_121.find_max_subarray_2`.
    """
		
    def test_find_max_subarray_2_1(self):
        """
        Test case 1 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([34, -50, 42, 14, -5, 86]) == 137

    def test_find_max_subarray_2_2(self):
        """
        Test case 2 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9]) == 0

    def test_find_max_subarray_2_3(self):
        """
        Test case 3 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10]) == 0

    def test_find_max_subarray_2_4(self):
        """
        Test case 4 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11]) == 0

    def test_find_max_subarray_2_5(self):
        """
        Test case 5 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11, -12]) == 0

    def test_find_max_subarray_2_6(self):
        """
        Test case 6 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11, -12, -13]) == 0

    def test_find_max_subarray_2_7(self):
        """
        Test case 7 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11, -12, -13, -14]) == 0

    def test_find_max_subarray_2_8(self):
        """
        Test case 8 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15]) == 0

    def test_find_max_subarray_2_9(self):
        """
        Test case 9 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15, -16]) == 0

    def test_find_max_subarray_2_10(self):
        """
        Test case 10 for :func:`scenario3.id_121.find_max_subarray_2`.
        """
        assert find_max_subarray_2([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17]) == 0

# id_122.py

def find_max_subarray_3(lst):
    '''
    You are given a list of integers.
    Your job is to find the maximum sum of a contiguous subarray within the list.
    For example, given the list [34, -50, 42, 14, -5, 86], the maximum sum would be 137,
    since we would take elements 42, 14, -5, and 86.
    Given the list [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.
    Your task is to write a function that finds the maximum sum of a contiguous subarray within the list.
    Return the maximum sum.

    Examples:
    find_max_subarray_3([34, -50, 42, 14, -5, 86]) == 137
    find_max_subarray_3([-5, -1, -8, -9]) == 0
    '''

    pass
# id_122_Test.java
from scenario3.id_122 import find_max_subarray_3

import pytest

class id_122_Test:
    """
    Test class of id_122.py.
    It contains ten unit test cases for the :func:`scenario3.id_122.find_max_subarray_3`.
    """
		
    def test_find_max_subarray_3_1(self):
        """
        Test case 1 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([34, -50, 42, 14, -5, 86]) == 137

    def test_find_max_subarray_3_2(self):
        """
        Test case 2 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9]) == 0

    def test_find_max_subarray_3_3(self):
        """
        Test case 3 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9, -10]) == 0

    def test_find_max_subarray_3_4(self):
        """
        Test case 4 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9, -10, -11]) == 0

    def test_find_max_subarray_3_5(self):
        """
        Test case 5 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9, -10, -11, -12]) == 0

    def test_find_max_subarray_3_6(self):
        """
        Test case 6 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9, -10, -11, -12, -13]) == 0

    def test_find_max_subarray_3_7(self):
        """
        Test case 7 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9, -10, -11, -12, -13, -14]) == 0

    def test_find_max_subarray_3_8(self):
        """
        Test case 8 for :func:`scenario3.id_122.find_max_subarray_3`.
        """
        assert find_max_subarray_3([-5, -1, -8, -9, -10, -11, -12, -13, -14, -15]) == 0

    def test_find_max_subarray_3_9(self):
        """
        Test case 9 for :func:`scenario3.id_122.find_max_subarray_3