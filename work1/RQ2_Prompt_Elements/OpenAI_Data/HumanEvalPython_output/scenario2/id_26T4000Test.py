# id_26_Test.java
from scenario2.id_26 import remove_duplicates

import pytest

class id_26_Test:
    """
    Test class of id_26.py.
    It contains ten unit test cases for the :func:`scenario2.id_26.remove_duplicates`.
    """


    def test_remove_duplicates_1(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_2(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_3(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_4(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_5(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_6(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_7(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_8(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_9(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_10(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

# id_26_Test.py
from scenario2.id_26 import remove_duplicates

import pytest

class id_26_Test:
    """
    Test class of id_26.py.
    It contains ten unit test cases for the :func:`scenario2.id_26.remove_duplicates`.
    """
		
    def test_remove_duplicates_1(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_2(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_3(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_4(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_5(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_6(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_7(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_8(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_9(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_10(self):
        """
        Test case for the :func:`scenario2.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

# id_27.py
from typing import List


def remove_duplicates(numbers: List[int]) -> List[int]:
    """ From a list of integers, remove all elements that occur more than once.
    Keep order of elements left the same as in the input.
   
    
    
    """

    import collections
    c = collections.Counter(numbers)
    return [n for n in numbers if c[n] <= 1]

# id_27_Test.java
from scenario2.id_27 import remove_duplicates

import pytest

class id_27_Test:
    """
    Test class of id_27.py.
    It contains ten unit test cases for the :func:`scenario2.id_27.remove_duplicates`.
    """
		
    def test_remove_duplicates_1(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_2(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_3(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_4(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_5(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_6(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_7(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_8(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_9(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_remove_duplicates_10(self):
        """
        Test case for the :func:`scenario2.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

# id_27_Test.py
from scenario2.id_27 import remove_duplicates

import pytest

class id_27_Test:
    """
    Test class of id_27.py.
    It contains ten unit test cases for the :func:`scenario2.id_27.remove_duplicates`.
    """
		
    def test_