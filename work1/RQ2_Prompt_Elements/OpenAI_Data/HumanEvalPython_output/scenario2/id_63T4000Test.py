# id_63_Test.java
from scenario2.id_63 import fibfib

import pytest

class id_63_Test:
    """
    Test class of id_63.py.
    It contains ten unit test cases for the :func:`scenario2.id_63.fibfib`.
    """


    def test_fibfib_1(self):
        """
        Test case for the :func:`scenario2.id_63.fibfib`.
        """
        assert fibfib(0) == 0
        assert fibfib(1) == 0
        assert fibfib(2) == 1
        assert fibfib(3) == 1
        assert fibfib(4) == 2
        assert fibfib(5) == 4
        assert fibfib(6) == 7
        assert fibfib(7) == 13
        assert fibfib(8) == 24
        assert fibfib(9) == 44

# id_63_Test.py
from scenario2.id_63 import fibfib

import pytest

class id_63_Test:
    """
    Test class of id_63.py.
    It contains ten unit test cases for the :func:`scenario2.id_63.fibfib`.
    """
		
    def test_fibfib_1(self):
        """
        Test case for the :func:`scenario2.id_63.fibfib`.
        """
        assert fibfib(0) == 0
        assert fibfib(1) == 0
        assert fibfib(2) == 1
        assert fibfib(3) == 1
        assert fibfib(4) == 2
        assert fibfib(5) == 4
        assert fibfib(6) == 7
        assert fibfib(7) == 13
        assert fibfib(8) == 24
        assert fibfib(9) == 44

# id_64.java

import java.util.ArrayList;
import java.util.List;

public class id_64 {
    /**
     * Given a list of integers, return a list of the integers, omitting any that are less than 0.
     *
     * @param nums a list of integers
     * @return a list of the integers, omitting any that are less than 0
     */
    public static List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= 0) {
                result.add(nums.get(i));
            }
        }
        return result;
    }
}

# id_64.py


def no_neg(nums: list) -> list:
    """Given a list of integers, return a list of the integers, omitting any that are less than 0.
    
    """
    result = []
    for i in range(len(nums)):
        if nums[i] >= 0:
            result.append(nums[i])
    return result

# id_64_Test.java
from scenario2.id_64 import id_64

import pytest

class id_64_Test:
    """
    Test class of id_64.py.
    It contains ten unit test cases for the :func:`scenario2.id_64.id_64`.
    """
		
    def test_id_64_1(self):
        """
        Test case for the :func:`scenario2.id_64.id_64`.
        """
        assert id_64.noNeg([1, -2]) == [1]
        assert id_64.noNeg([-3, -3, 3, 3]) == [3, 3]
        assert id_64.noNeg([-1, -1, -1]) == []
        assert id_64.noNeg([1, 2, 3]) == [1, 2, 3]
        assert id_64.noNeg([-1, -1, 3, 3]) == [3, 3]
        assert id_64.noNeg([7, -3, -3]) == [7]
        assert id_64.noNeg([7, -3, -3, -3]) == [7]
        assert id_64.noNeg([-3, -3, -3, -3]) == []
        assert id_64.noNeg([1, -1]) == [1]
        assert id_64.noNeg([-1, -1, 1, 1]) == [1, 1]

# id_64_Test.py
from scenario2.id_64 import no_neg

import pytest

class id_64_Test:
    """
    Test class of id_64.py.
    It contains ten unit test cases for the :func:`scenario2.id_64.no_neg`.
    """
		
    def test_no_neg_1(self):
        """
        Test case for the :func:`scenario2.id_64.no_neg`.
        """
        assert no_neg([1, -2]) == [1]
        assert no_neg([-3, -3, 3, 3]) == [3, 3]
        assert no_neg([-1, -1, -1]) == []
        assert no_neg([1, 2, 3]) == [1, 2, 3]
        assert no_neg([-1, -1, 3, 3]) == [3, 3]
        assert no_neg([7, -3, -3]) == [7]
        assert no_neg([7, -3, -3, -3]) == [7]
        assert no_neg([-3, -3, -3, -3]) == []
        assert no_neg([1, -1]) == [1]
        assert no_neg([-1, -1, 1, 1]) == [1, 1]

# id_65.java

import java.util.ArrayList;
import java.util.List;

public class id_65 {
    /**
     * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
     * (Note: % by 10)
     *
     * @param nums a list of non-negative integers
     * @return a list of those numbers except omitting any that end with 9
     */
    public static List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 10 != 9) {
                result.add(nums.get(i));
            }
        }
        return result;
    }
}

# id_65.py


def no_9(nums: list) -> list:
    """Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
    (Note: % by 10)
    
    """
    result = []
    for i in range(len(nums)):
        if nums[i] % 10 != 9:
            result.append(nums[i])
    return result

# id_65_Test.java
from scenario2.id_65 import id_65

import pytest

class id_65_Test:
    """
    Test class of id_65.py.
    It contains ten unit test cases for the :func:`scenario2.id_65.id_65`.
    """
		
    def test_id_65_1(self):
        """
        Test case for the :func:`scenario2.id_65.id_65`.
        """
        assert id_65.no9([1, 2, 19]) == [1, 2]
        assert id_65.no9([9, 19, 29, 3]) == [3]
        assert id_65.no9([1, 2, 3]) == [1, 2, 3]
        assert id_65.no9([45, 99, 90, 28, 13, 999, 0]) == [45, 90, 28, 13, 0]
        assert id_65.no9([9]) == []
        assert id_65.no9([0]) == [0]
        assert id_65.no9([8, 9]) == [8]
        assert id_65.no9([9, 8]) == [8]
        assert id_65.no9([9, 9]) == []
        assert id_65.no9([1, 9, 9]) == [1]

# id_65_Test.py
from scenario2.id_65 import no_9

import pytest

class id_65_Test:
    """
    Test class of id_65.py.
    It contains ten unit test cases for the :func:`scenario2.id_65.no_9`.
    """
		
    def test_no_9_1(self):
        """
        Test case for the :func:`scenario2.id_65.no_9`.
        """
        assert no_9([1, 2, 19]) == [1, 2]
        assert no_9([9, 19, 29, 3]) == [3]
        assert no_9([1, 2, 3]) == [1, 2, 3]
        assert no_9([45, 99, 90, 28, 13, 999, 0]) == [45, 90, 28, 13, 0]
        assert no_9([9]) == []
        assert no_9([0]) == [0]
        assert no_9([8, 9]) == [8]
        assert no_9([9, 8]) == [8]
        assert no_9([9, 9]) == []
        assert no_9([1, 9, 9]) == [1]

# id_66.java

import java.util.ArrayList;
import java.util.List;

public class id_66 {
    /**
     * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
     *
     * @param nums a list of integers
     * @return a list of those numbers, omitting any that are between 13 and 19 inclusive
     */
    public static List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 13 || nums.get(i) > 19) {
                result.add(nums.get(i));
            }
        }
        return result;
    }
}

# id_66.py


def no_teen(nums: list) -> list:
    """Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
    
    """
    result = []
    for i in range(len(nums)):
        if nums[i] < 13 or nums[i] > 19:
            result.append(nums[i])
    return result

# id_66_Test.java
from scenario2.id_66 import id_66

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`scenario2.id_66.id_66`.
    """
		
    def test_id_66_1(self):
        """
        Test case for the :func:`scenario2.id_66.id_66`.
        """
        assert id_66.noTeen([12, 13, 19, 20]) == [12]
        assert id_66.noTeen([1, 14, 1]) == [1, 1]
        assert id_66.noTeen([15]) == []
        assert id_66.noTeen([-16, 2, 15, 3]) == [-16, 2, 3]
        assert id_66.noTeen([16, 17, 18]) == []
        assert id_66.noTeen([12, 13, 14, 15]) == [12]
        assert id_66.noTeen([-15]) == [-15]
        assert id_66.noTeen([-17, -16, -15, -14]) == [-17, -16, -15, -14]
        assert id_66.noTeen([-17, -16, -15, -14, -13]) == [-17, -16, -15, -14, -13]
        assert id_66.noTeen([-17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == [-17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]

# id_66_Test.py
from scenario2.id_66 import no_teen

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`scenario2.id_66.no_teen`.
    """
		
    def test_no_teen_1(self):
        """
        Test case for the :func:`scenario2.id_66.no_teen`.
        """
        assert no_teen([12, 13, 19, 20]) == [12]
        assert no_teen([1, 14, 1]) == [1, 1]
        assert no_teen([15]) == []
        assert no_teen([-16, 2, 15, 3]) == [-16, 2, 3]
        assert no_teen([16, 17, 18]) == []
        assert no_teen([12, 13, 14, 15]) == [12]
        assert no_teen([-15]) == [-15]
        assert no_teen([-17, -16, -15, -14]) == [-17, -16, -15, -14]
        assert no_teen([-17, -16, -15, -14, -13]) == [-17, -16, -15, -14, -13]
        assert no_teen([-17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == [-17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]

# id_67.java

import java.util.ArrayList;
import java.util.List;

public class id_67 {
    /**
     * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
     *
     * @param nums a list of integers
     * @return a list of those numbers, omitting