# id_47_Test.java
from scenario1.id_47 import median

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It contains ten unit test cases for the :func:`scenario1.id_47.median`.
    """


    def test_median_1(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5]) == 3

    def test_median_2(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6]) == 3.5

    def test_median_3(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7]) == 4

    def test_median_4(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8]) == 4.5

    def test_median_5(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 5

    def test_median_6(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 5.5

    def test_median_7(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 6

    def test_median_8(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 6.5

    def test_median_9(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 7

    def test_median_10(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 7.5

# id_47_Test.py
from scenario1.id_47 import median

import pytest

class id_47_Test:
    """
    Test class of id_47.py.
    It contains ten unit test cases for the :func:`scenario1.id_47.median`.
    """
		
    def test_median_1(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5]) == 3

    def test_median_2(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6]) == 3.5

    def test_median_3(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7]) == 4

    def test_median_4(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8]) == 4.5

    def test_median_5(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 5

    def test_median_6(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 5.5

    def test_median_7(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 6

    def test_median_8(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 6.5

    def test_median_9(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 7

    def test_median_10(self):
        """
        Test case for the :func:`scenario1.id_47.median`.
        """
        assert median([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 7.5

# id_48.py


def mode(l: list):

    d = {}
    for i in l:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    max_value = max(d.values())
    return [k for k, v in d.items() if v == max_value]

# id_48_Test.java
from scenario1.id_48 import mode

import pytest

class id_48_Test:
    """
    Test class of id_48.py.
    It contains ten unit test cases for the :func:`scenario1.id_48.mode`.
    """
		
    def test_mode_1(self):
        """
        Test case for the :func:`scenario1.id_48.mode`.
        """
        assert mode([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_mode_2(self):
        """
        Test case for the :func:`scenario1.id_48.mode`.
        """
        assert mode([1, 2, 3, 4, 5, 6]) == [1, 2, 3, 4, 5, 6]

    def test_mode_3(self):
        """
        Test case for the :func:`scenario1.id_48.mode`.
        """
        assert mode([1, 2, 3, 4, 5, 6, 7]) == [1, 2, 3, 4, 5, 6, 7]

    def test_mode_4(self):
        """
        Test case for the :func:`scenario1.id_48.mode`.
        """
        assert mode([1, 2, 3, 4, 5, 6, 7, 8]) == [1, 2, 3, 4, 5, 6, 7, 8]

    def test_mode_5(self):
        """
        Test case for the :func:`scenario1.id_48.mode`.
        """
        assert mode([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 2, 3, 4, 5, 6, 7, 8, 9]

    def test_mode_6(self):
        """
        Test case for the :func:`scenario1.id_48.mode`.
        """
        assert mode([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 2, 3, 4, 5,