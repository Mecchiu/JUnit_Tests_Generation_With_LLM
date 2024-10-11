# id_37_Test.java
from original.id_37 import sort_even

import pytest

class id_37_Test:
    """
    Test class of id_37.py.
    It contains ten unit test cases for the :func:`original.id_37.sort_even`.
    """


    def test_sort_even_1(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3]) == [1, 2, 3]

    def test_sort_even_2(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([5, 6, 3, 4]) == [3, 6, 5, 4]

    def test_sort_even_3(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    def test_sort_even_4(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

    def test_sort_even_5(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_sort_even_6(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

    def test_sort_even_7(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]

    def test_sort_even_8(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

    def test_sort_even_9(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]

    def test_sort_even_10(self):
        """
        Test case for the function :func:`original.id_37.sort_even`.
        """
        assert sort_even([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]


# id_38.py


def sort_even_odd(l: list):
    """This function takes a list l and returns a list l' such that
    l' is identical to l in the odd indicies, while its values at the even indicies are equal
    to the values of the even indicies of l, but sorted.
    >>> sort_even_odd([1, 2, 3])
    [1, 2, 3]
    >>> sort_even_odd([5, 6, 3, 4])
    [3, 6, 5, 4]
    """

    evens = l[::2]
    odds = l[1::2]
    evens.sort()
    ans = []
    for e, o in zip(evens, odds):
        ans.extend([e, o])
    if len(evens) > len(odds):
        ans.append(evens[-1])
    return ans


# id_38_Test.java
from original.id_38 import sort_even_odd

import pytest

class id_38_Test:
    """
    Test class of id_38.py.
    It contains ten unit test cases for the :func:`original.id_38.sort_even_odd`.
    """
		
    def test_sort_even_odd_1(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3]) == [1, 2, 3]

    def test_sort_even_odd_2(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([5, 6, 3, 4]) == [3, 6, 5, 4]

    def test_sort_even_odd_3(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    def test_sort_even_odd_4(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

    def test_sort_even_odd_5(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_sort_even_odd_6(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

    def test_sort_even_odd_7(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]

    def test_sort_even_odd_8(self):
        """
        Test case for the function :func:`original.id_38.sort_even_odd`.
        """
        assert sort_even_odd([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5