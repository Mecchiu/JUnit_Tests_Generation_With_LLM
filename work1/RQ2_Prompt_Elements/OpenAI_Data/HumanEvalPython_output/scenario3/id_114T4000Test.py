# id_114_Test.java
from scenario3.id_114 import minSubArraySum

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`scenario3.id_114.minSubArraySum`.
    """


    def test_minSubArraySum_1(self):
        """
        Test case 1 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([2, 3, 4, 1, 2, 4]) == 1

    def test_minSubArraySum_2(self):
        """
        Test case 2 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3]) == -6

    def test_minSubArraySum_3(self):
        """
        Test case 3 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4]) == -10

    def test_minSubArraySum_4(self):
        """
        Test case 4 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5]) == -15

    def test_minSubArraySum_5(self):
        """
        Test case 5 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6]) == -21

    def test_minSubArraySum_6(self):
        """
        Test case 6 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -28

    def test_minSubArraySum_7(self):
        """
        Test case 7 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -36

    def test_minSubArraySum_8(self):
        """
        Test case 8 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9]) == -45

    def test_minSubArraySum_9(self):
        """
        Test case 9 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -55

    def test_minSubArraySum_10(self):
        """
        Test case 10 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == -66

# id_114_Test.py
from scenario3.id_114 import minSubArraySum

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`scenario3.id_114.minSubArraySum`.
    """
		
    def test_minSubArraySum_1(self):
        """
        Test case 1 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([2, 3, 4, 1, 2, 4]) == 1

    def test_minSubArraySum_2(self):
        """
        Test case 2 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3]) == -6

    def test_minSubArraySum_3(self):
        """
        Test case 3 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4]) == -10

    def test_minSubArraySum_4(self):
        """
        Test case 4 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5]) == -15

    def test_minSubArraySum_5(self):
        """
        Test case 5 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6]) == -21

    def test_minSubArraySum_6(self):
        """
        Test case 6 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -28

    def test_minSubArraySum_7(self):
        """
        Test case 7 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -36

    def test_minSubArraySum_8(self):
        """
        Test case 8 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9]) == -45

    def test_minSubArraySum_9(self):
        """
        Test case 9 for :func:`scenario3.id_114.minSubArraySum`.
        """
        assert minSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -55

    def test_minSubArraySum_10(self):
        """
        Test case 10 for :func:`scenario3.id_114.minSubArraySum`.
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

    pass
# id_115_Test.java
from scenario3.id_115 import maxSubArraySum

import pytest

class id_115_Test:
    """
    Test class of id_115.py.
    It contains ten unit test cases for the :func:`scenario3.id_115.maxSubArraySum`.
    """
		
    def test_maxSubArraySum_1(self):
        """
        Test case 1 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([2, 3, 4, 1, 2, 4]) == 13

    def test_maxSubArraySum_2(self):
        """
        Test case 2 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3]) == -1

    def test_maxSubArraySum_3(self):
        """
        Test case 3 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4]) == -1

    def test_maxSubArraySum_4(self):
        """
        Test case 4 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5]) == -1

    def test_maxSubArraySum_5(self):
        """
        Test case 5 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6]) == -1

    def test_maxSubArraySum_6(self):
        """
        Test case 6 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -1

    def test_maxSubArraySum_7(self):
        """
        Test case 7 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -1

    def test_maxSubArraySum_8(self):
        """
        Test case 8 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9]) == -1

    def test_maxSubArraySum_9(self):
        """
        Test case 9 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -1

    def test_maxSubArraySum_10(self):
        """
        Test case 10 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == -1

# id_115_Test.py
from scenario3.id_115 import maxSubArraySum

import pytest

class id_115_Test:
    """
    Test class of id_115.py.
    It contains ten unit test cases for the :func:`scenario3.id_115.maxSubArraySum`.
    """
		
    def test_maxSubArraySum_1(self):
        """
        Test case 1 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([2, 3, 4, 1, 2, 4]) == 13

    def test_maxSubArraySum_2(self):
        """
        Test case 2 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3]) == -1

    def test_maxSubArraySum_3(self):
        """
        Test case 3 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4]) == -1

    def test_maxSubArraySum_4(self):
        """
        Test case 4 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5]) == -1

    def test_maxSubArraySum_5(self):
        """
        Test case 5 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6]) == -1

    def test_maxSubArraySum_6(self):
        """
        Test case 6 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -1

    def test_maxSubArraySum_7(self):
        """
        Test case 7 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -1

    def test_maxSubArraySum_8(self):
        """
        Test case 8 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9]) == -1

    def test_maxSubArraySum_9(self):
        """
        Test case 9 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == -1

    def test_maxSubArraySum_10(self):
        """
        Test case 10 for :func:`scenario3.id_115.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11]) == -1

# id_116.py

def maxSubArraySum(nums):
    """
    Given an array of integers nums, find the maximum sum of any non-empty sub-array
    of nums.
    Example
    maxSubArraySum([2, 3, 4, 1, 2, 4]) == 13
    maxSubArraySum([-1, -2, -3]) == -1
    """

    pass
# id_116_Test.java
from scenario3.id_116 import maxSubArraySum

import pytest

class id_116_Test:
    """
    Test class of id_116.py.
    It contains ten unit test cases for the :func:`scenario3.id_116.maxSubArraySum`.
    """
		
    def test_maxSubArraySum_1(self):
        """
        Test case 1 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([2, 3, 4, 1, 2, 4]) == 13

    def test_maxSubArraySum_2(self):
        """
        Test case 2 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3]) == -1

    def test_maxSubArraySum_3(self):
        """
        Test case 3 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4]) == -1

    def test_maxSubArraySum_4(self):
        """
        Test case 4 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5]) == -1

    def test_maxSubArraySum_5(self):
        """
        Test case 5 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6]) == -1

    def test_maxSubArraySum_6(self):
        """
        Test case 6 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7]) == -1

    def test_maxSubArraySum_7(self):
        """
        Test case 7 for :func:`scenario3.id_116.maxSubArraySum`.
        """
        assert maxSubArraySum([-1, -2, -3, -4, -5, -6, -7, -8]) == -1

    def test_maxSubArraySum_8(self):
        """
        Test