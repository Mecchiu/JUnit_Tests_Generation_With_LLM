# id_33_Test.java
from scenario2.id_33 import sort_third

import pytest

class id_33_Test:
    """
    Test class of id_33.py.
    It contains ten unit test cases for the :func:`scenario2.id_33.sort_third`.
    """


    def test_sort_third_1(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

    def test_sort_third_2(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_sort_third_3(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

    def test_sort_third_4(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

    def test_sort_third_5(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]

    def test_sort_third_6(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]

    def test_sort_third_7(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]

    def test_sort_third_8(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]

    def test_sort_third_9(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33]

    def test_sort_third_10(self):
        """
        Test case for the :func:`scenario2.id_33.sort_third` function.
        """
        assert sort_third([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36]

# id_34.py


def sort_third_2(l: list):
    """This function takes a list l and returns a list l' such that
    l' is identical to l in the indicies that are not divisible by three, while its values at the indicies that are divisible by three are equal
    to the values of the corresponding indicies of l, but sorted.
    
    """

    l = list(l)
    l[::3] = sorted(l[::3])
    return l

# id_34_Test.java
from scenario2.id_34 import sort_third_2

import pytest

class id_34_Test:
    """
    Test class of id_34.py.
    It contains ten unit test cases for the :func:`scenario2.id_34.sort_third_2`.
    """
		
    def test_sort_third_2_1(self):
        """
        Test case for the :func:`scenario2.id_34.sort_third_2` function.
        """
        assert sort_third_2([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

    def test_sort_third_2_2(self):
        """
        Test case for the :func:`scenario2.id_34.sort_third_2` function.
        """
        assert sort_third_2([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    def test_sort_third_2_3(self):
        """
        Test case for the :func:`scenario2.id_34.sort_third_2` function.
        """
        assert sort_third_2([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

    def test_sort_third_2_4(self):
        """
        Test case for the :func:`scenario2.id_34.sort_third_2` function.
        """
        assert sort_third_2