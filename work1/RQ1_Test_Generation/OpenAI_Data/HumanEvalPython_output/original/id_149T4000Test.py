# id_149_Test.java
from original.id_149 import sorted_list_sum

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`original.id_149.sorted_list_sum`.
    """


    def test_sorted_list_sum_1(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["aa", "a", "aaa"]) == ["aa"]

    def test_sorted_list_sum_2(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd"]) == ["ab", "cd"]

    def test_sorted_list_sum_3(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b"]) == ["ab", "b", "cd"]

    def test_sorted_list_sum_4(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c"]) == ["ab", "b", "c", "cd"]

    def test_sorted_list_sum_5(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d"]) == ["ab", "b", "c", "cd", "d"]

    def test_sorted_list_sum_6(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e"]) == ["ab", "b", "c", "cd", "d", "e"]

    def test_sorted_list_sum_7(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f"]) == ["ab", "b", "c", "cd", "d", "e", "f"]

    def test_sorted_list_sum_8(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g"]

    def test_sorted_list_sum_9(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g", "h"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g", "h"]

    def test_sorted_list_sum_10(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g", "h", "i"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g", "h", "i"]

# id_149_Test.py
from original.id_149 import sorted_list_sum

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`original.id_149.sorted_list_sum`.
    """
		
    def test_sorted_list_sum_1(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["aa", "a", "aaa"]) == ["aa"]

    def test_sorted_list_sum_2(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd"]) == ["ab", "cd"]

    def test_sorted_list_sum_3(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b"]) == ["ab", "b", "cd"]

    def test_sorted_list_sum_4(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c"]) == ["ab", "b", "c", "cd"]

    def test_sorted_list_sum_5(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d"]) == ["ab", "b", "c", "cd", "d"]

    def test_sorted_list_sum_6(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e"]) == ["ab", "b", "c", "cd", "d", "e"]

    def test_sorted_list_sum_7(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f"]) == ["ab", "b", "c", "cd", "d", "e", "f"]

    def test_sorted_list_sum_8(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g"]

    def test_sorted_list_sum_9(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g", "h"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g", "h"]

    def test_sorted_list_sum_10(self):
        """
        Test case for the :func:`original.id_149.sorted_list_sum`.
        """
        assert sorted_list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g", "h", "i"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g", "h", "i"]

# id_150.py

def list_sum(lst):
    """Write a function that accepts a list of strings as a parameter,
    deletes the strings that have odd lengths from it,
    and returns the resulted list with a sorted order,
    The list is always a list of strings and never an array of numbers,
    and it may contain duplicates.
    The order of the list should be ascending by length of each word, and you
    should return the list sorted by that rule.
    If two words have the same length, sort the list alphabetically.
    The function should return a list of strings in sorted order.
    You may assume that all words will have the same length.
    For example:
    assert list_sort(["aa", "a", "aaa"]) => ["aa"]
    assert list_sort(["ab", "a", "aaa", "cd"]) => ["ab", "cd"]
    """

    lst.sort()
    new_lst = []
    for i in lst:
        if len(i)%2 == 0:
            new_lst.append(i)
    return sorted(new_lst, key=len)

# id_150_Test.java
from original.id_150 import list_sum

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`original.id_150.list_sum`.
    """
		
    def test_list_sum_1(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["aa", "a", "aaa"]) == ["aa"]

    def test_list_sum_2(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd"]) == ["ab", "cd"]

    def test_list_sum_3(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b"]) == ["ab", "b", "cd"]

    def test_list_sum_4(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c"]) == ["ab", "b", "c", "cd"]

    def test_list_sum_5(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d"]) == ["ab", "b", "c", "cd", "d"]

    def test_list_sum_6(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e"]) == ["ab", "b", "c", "cd", "d", "e"]

    def test_list_sum_7(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f"]) == ["ab", "b", "c", "cd", "d", "e", "f"]

    def test_list_sum_8(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g"]

    def test_list_sum_9(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g", "h"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g", "h"]

    def test_list_sum_10(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g", "h", "i"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g", "h", "i"]

# id_150_Test.py
from original.id_150 import list_sum

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`original.id_150.list_sum`.
    """
		
    def test_list_sum_1(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["aa", "a", "aaa"]) == ["aa"]

    def test_list_sum_2(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd"]) == ["ab", "cd"]

    def test_list_sum_3(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b"]) == ["ab", "b", "cd"]

    def test_list_sum_4(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c"]) == ["ab", "b", "c", "cd"]

    def test_list_sum_5(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d"]) == ["ab", "b", "c", "cd", "d"]

    def test_list_sum_6(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e"]) == ["ab", "b", "c", "cd", "d", "e"]

    def test_list_sum_7(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f"]) == ["ab", "b", "c", "cd", "d", "e", "f"]

    def test_list_sum_8(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d", "e", "f", "g"]) == ["ab", "b", "c", "cd", "d", "e", "f", "g"]

    def test_list_sum_9(self):
        """
        Test case for the :func:`original.id_150.list_sum`.
        """
        assert list_sum(["ab", "a", "aaa", "cd", "b", "c", "d