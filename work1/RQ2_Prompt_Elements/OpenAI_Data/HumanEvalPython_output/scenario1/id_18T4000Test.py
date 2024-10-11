# id_18_Test.java
from scenario1.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario1.id_18.how_many_times`.
    """


    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "a") == 1

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "b") == 1

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "c") == 1

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "ab") == 1

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "bc") == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abc") == 1

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abcd") == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "") == 4

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "a") == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "") == 1

# id_18_Test.py
from scenario1.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario1.id_18.how_many_times`.
    """
		
    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "a") == 1

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "b") == 1

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "c") == 1

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "ab") == 1

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "bc") == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abc") == 1

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "abcd") == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("abc", "") == 4

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "a") == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`scenario1.id_18.how_many_times`.
        """
        assert how_many_times("", "") == 1

# id_19.java

public class id_19 {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                count++;
            }
        }
        int newLength = length + 2 * count;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[newLength - 1] = '0';
                string[newLength - 2] = '2';
                string[newLength - 3] = '%';
                newLength -= 3;
            } else {
                string[newLength - 1] = string[i];
                newLength--;
            }
        }
        return length + 2 * count;
    }
}

# id_19.py


def replace_blank(string: str, length: int) -> int:

    count = 0

    for i in range(length):
        if string[i] == ' ':
            count += 1

    new_length = length + 2 * count

    for i in range(length - 1, -1, -1):
        if string[i] == ' ':
            string[new_length - 1] = '0'
            string[new_length - 2] = '2'
            string[new_length - 3] = '%'
            new_length -= 3
        else:
            string[new_length - 1] = string[i]
            new_length -= 1

    return length + 2 * count

# id_19_Test.java
from scenario1.id_19 import replace_blank

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario1.id_19.replace_blank`.
    """
		
    def test_replace_blank_1(self):
        """
        Test case 1 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("Mr John Smith", 13) == 17

    def test_replace_blank_2(self):
        """
        Test case 2 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("Hello  World", 11) == 13

    def test_replace_blank_3(self):
        """
        Test case 3 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("", 0) == 0

    def test_replace_blank_4(self):
        """
        Test case 4 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("a", 1) == 1

    def test_replace_blank_5(self):
        """
        Test case 5 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("a ", 2) == 3

    def test_replace_blank_6(self):
        """
        Test case 6 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank(" a", 2) == 3

    def test_replace_blank_7(self):
        """
        Test case 7 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank(" a ", 3) == 5

    def test_replace_blank_8(self):
        """
        Test case 8 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("  ", 2) == 6

    def test_replace_blank_9(self):
        """
        Test case 9 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("a  ", 3) == 5

    def test_replace_blank_10(self):
        """
        Test case 10 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("  a", 3) == 5

# id_19_Test.py
from scenario1.id_19 import replace_blank

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario1.id_19.replace_blank`.
    """
		
    def test_replace_blank_1(self):
        """
        Test case 1 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("Mr John Smith", 13) == 17

    def test_replace_blank_2(self):
        """
        Test case 2 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("Hello  World", 11) == 13

    def test_replace_blank_3(self):
        """
        Test case 3 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("", 0) == 0

    def test_replace_blank_4(self):
        """
        Test case 4 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("a", 1) == 1

    def test_replace_blank_5(self):
        """
        Test case 5 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("a ", 2) == 3

    def test_replace_blank_6(self):
        """
        Test case 6 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank(" a", 2) == 3

    def test_replace_blank_7(self):
        """
        Test case 7 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank(" a ", 3) == 5

    def test_replace_blank_8(self):
        """
        Test case 8 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("  ", 2) == 6

    def test_replace_blank_9(self):
        """
        Test case 9 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("a  ", 3) == 5

    def test_replace_blank_10(self):
        """
        Test case 10 for :func:`scenario1.id_19.replace_blank`.
        """
        assert replace_blank("  a", 3) == 5

# id_20.java

public class id_20 {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                result.add(map.get(sum) + 1);
                result.add(i);
                return result;
            }
            map.put(sum, i);
        }
        return result;
    }
}

# id_20.py


def subarray_sum(nums: list) -> list:

    result = []

    if nums is None or len(nums) == 0:
        return result

    map = {}
    map[0] = -1
    sum = 0

    for i in range(len(nums)):
        sum += nums[i]
        if sum in map:
            result.append(map[sum] + 1)
            result.append(i)
            return result
        map[sum] = i

    return result

# id_20_Test.java
from scenario1.id_20 import subarray_sum

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario1.id_20.subarray_sum`.
    """
		
    def test_subarray_sum_1(self):
        """
        Test case 1 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, 2, -3, 4]) == [0, 2]

    def test_subarray_sum_2(self):
        """
        Test case 2 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, -4, 2, -3, 4]) == [1, 5]

    def test_subarray_sum_3(self):
        """
        Test case 3 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, -4, 2, -3, 4, -1]) == [1, 5]

    def test_subarray_sum_4(self):
        """
        Test case 4 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, -4, 2, -3, 4, -1, -2]) == [1, 5]

    def test_subarray_sum_5(self):
        """
        Test case 5 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, -4, 2, -3, 4, -1, -2, 1]) == [1, 5]

    def test_subarray_sum_6(self):
        """
        Test case 6 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, -4, 2, -3, 4, -1, -2, 1, -1]) == [1, 5]

    def test_subarray_sum_7(self):
        """
        Test case 7 for :func:`scenario1.id_20.subarray_sum`.
        """
        assert subarray_sum([-3, 1, -4, 2, -3, 4, -1, -