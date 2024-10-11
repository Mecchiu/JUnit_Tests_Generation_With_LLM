# id_107_Test.java
from scenario3.id_107 import even_odd_palindrome

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`scenario3.id_107.even_odd_palindrome`.
    """


    def test_even_odd_palindrome_1(self):
        """
        Test case 1 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(3) == (1, 2)

    def test_even_odd_palindrome_2(self):
        """
        Test case 2 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(12) == (4, 6)

    def test_even_odd_palindrome_3(self):
        """
        Test case 3 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1) == (0, 1)

    def test_even_odd_palindrome_4(self):
        """
        Test case 4 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(2) == (1, 1)

    def test_even_odd_palindrome_5(self):
        """
        Test case 5 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10) == (3, 5)

    def test_even_odd_palindrome_6(self):
        """
        Test case 6 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(100) == (18, 82)

    def test_even_odd_palindrome_7(self):
        """
        Test case 7 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1000) == (180, 820)

    def test_even_odd_palindrome_8(self):
        """
        Test case 8 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10000) == (1818, 8182)

    def test_even_odd_palindrome_9(self):
        """
        Test case 9 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(100000) == (18180, 81820)

    def test_even_odd_palindrome_10(self):
        """
        Test case 10 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1000000) == (181818, 818182)

# id_107_Test.py
from scenario3.id_107 import even_odd_palindrome

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`scenario3.id_107.even_odd_palindrome`.
    """
		
    def test_even_odd_palindrome_1(self):
        """
        Test case 1 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(3) == (1, 2)

    def test_even_odd_palindrome_2(self):
        """
        Test case 2 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(12) == (4, 6)

    def test_even_odd_palindrome_3(self):
        """
        Test case 3 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1) == (0, 1)

    def test_even_odd_palindrome_4(self):
        """
        Test case 4 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(2) == (1, 1)

    def test_even_odd_palindrome_5(self):
        """
        Test case 5 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10) == (3, 5)

    def test_even_odd_palindrome_6(self):
        """
        Test case 6 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(100) == (18, 82)

    def test_even_odd_palindrome_7(self):
        """
        Test case 7 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1000) == (180, 820)

    def test_even_odd_palindrome_8(self):
        """
        Test case 8 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10000) == (1818, 8182)

    def test_even_odd_palindrome_9(self):
        """
        Test case 9 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(100000) == (18180, 81820)

    def test_even_odd_palindrome_10(self):
        """
        Test case 10 for :func:`scenario3.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1000000) == (181818, 818182)

# id_108.py

def find_max_sum_subarray(arr):
    """
    Given an array of integers, return the maximum sum of subarray.

    Example 1:

        Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        Output: 6
        Explanation: [4, -1, 2, 1] has the largest sum = 6.

    Note:
        1. If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
    """

    pass
# id_108_Test.java
from scenario3.id_108 import find_max_sum_subarray

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario3.id_108.find_max_sum_subarray`.
    """
		
    def test_find_max_sum_subarray_1(self):
        """
        Test case 1 for :func:`scenario3.id_108.find_max_sum_subarray`.
        """
        assert find_max_sum_subarray([-2, 1, -3, 4, -1, 2, 1, -5, 4]) == 6

    def test_find_max_sum_subarray_2(self):
        """
        Test case 2 for :func:`scenario3.id_108.find_max_sum_subarray`.
        """
        assert find_max_sum_subarray([-2, -1, -3, -4, -1, -2, -1, -5, -4]) == -1

    def test_find_max_sum_subarray_3(self):
        """
        Test case 3 for :func:`scenario3.id_108.find_max_sum_subarray`.
        """
        assert find_max_sum_subarray([-2, 1, -3, 4, -1, 2, 1, -5, 4, -1, 2, 1, -5, 4]) == 10

    def test_find_max_sum_subarray_4(self