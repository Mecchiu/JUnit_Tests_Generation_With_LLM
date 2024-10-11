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
        assert id_64.noNeg([]) == []
        assert id_64.noNeg([-1]) == []
        assert id_64.noNeg([0]) == [0]
        assert id_64.noNeg([-1, 0, 1]) == [0, 1]
        assert id_64.noNeg([1, 2, 3]) == [1, 2, 3]
        assert id_64.noNeg([-1, -2, -3]) == []
        assert id_64.noNeg([-1, 0, -1]) == [0]

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
        assert no_neg([]) == []
        assert no_neg([-1]) == []
        assert no_neg([0]) == [0]
        assert no_neg([-1, 0, 1]) == [0, 1]
        assert no_neg([1, 2, 3]) == [1, 2, 3]
        assert no_neg([-1, -2, -3]) == []
        assert no_neg([-1, 0, -1]) == [0]

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
        assert id_65.no9([4, 5]) == [4, 5]
        assert id_65.no9([9]) == []
        assert id_65.no9([]) == []
        assert id_65.no9([9, 9]) == []
        assert id_65.no9([9, 19, 99]) == []
        assert id_65.no9([1, 9, 9]) == [1]
        assert id_65.no9([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 2, 3, 4, 5, 6, 7, 8]

# id_65_Test.py
from scenario2.id_65 import no_9

import pytest

class id_65_Test:
    """
    Test class of id_