# id_114_Test.java
from original.id_114 import minSubArraySum

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`original.id_114.minSubArraySum`.
    """


    def test_minSubArraySum_1(self):
        """
        Test case 1 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([2, 3, 4, 1, 2, 4]) == 1

    def test_minSubArraySum_2(self):
        """
        Test case 2 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3]) == -6

    def test_minSubArraySum_3(self):
        """
        Test case 3 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4]) == -10

    def test_minSubArraySum_4(self):
        """
        Test case 4 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5]) == -15

    def test_minSubArraySum_5(self):
        """
        Test case 5 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6]) == -21

    def test_minSubArraySum_6(self):
        """
        Test case 6 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -28

    def test_minSubArraySum_7(self):
        """
        Test case 7 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -36

    def test_minSubArraySum_8(self):
        """
        Test case 8 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9]) == -45

    def test_minSubArraySum_9(self):
        """
        Test case 9 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -55

    def test_minSubArraySum_10(self):
        """
        Test case 10 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == -66

# id_114_Test.py
from original.id_114 import minSubArraySum

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`original.id_114.minSubArraySum`.
    """
		
    def test_minSubArraySum_1(self):
        """
        Test case 1 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([2, 3, 4, 1, 2, 4]) == 1

    def test_minSubArraySum_2(self):
        """
        Test case 2 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3]) == -6

    def test_minSubArraySum_3(self):
        """
        Test case 3 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4]) == -10

    def test_minSubArraySum_4(self):
        """
        Test case 4 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5]) == -15

    def test_minSubArraySum_5(self):
        """
        Test case 5 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6]) == -21

    def test_minSubArraySum_6(self):
        """
        Test case 6 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -28

    def test_minSubArraySum_7(self):
        """
        Test case 7 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -36

    def test_minSubArraySum_8(self):
        """
        Test case 8 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9]) == -45

    def test_minSubArraySum_9(self):
        """
        Test case 9 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -55

    def test_minSubArraySum_10(self):
        """
        Test case 10 for :func:`original.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == -66

# id_115.py

def maxSubArraySum(nums):
    """
    Given an array of integers nums, find the maximum sum of any non-empty sub-array
    of nums.
    Example
    maxSubArraySum([2, 3, 4, 1, 2, 4]) == 13
    maxSubArraySum([-1, -2, -3]) == -1
    """

    max_sum = 0
    s = 0
    for num in nums:
        s += num
        if (s < 0):
            s = 0
        max_sum = max(s, max_sum)
    if max_sum == 0:
        max_sum = max(i for i in nums)
    return max_sum

# id_115_Test.java
from original.id_115 import maxSubArraySum

import pytest

class id_115_Test:
    """
    Test class of id_115.py.
    It contains ten unit test cases for the :func:`original.id_115.maxSubArraySum`.
    """
		
    def test_maxSubArraySum_1(self):
        """
        Test case 1 for :func:`original.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([2, 3, 4, 1, 2, 4]) == 13

    def test_maxSubArraySum_2(self):
        """
        Test case 2 for :func:`original.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3]) == -1

    def test_maxSubArraySum_3(self):
        """
        Test case 3 for :func:`original.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4]) == -1

    def test_maxSubArraySum_4(self):
        """
        Test case 4 for :func:`original.id_115