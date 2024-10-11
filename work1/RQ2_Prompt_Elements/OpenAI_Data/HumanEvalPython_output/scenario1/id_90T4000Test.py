# id_90_Test.java
from scenario1.id_90 import next_smallest

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario1.id_90.next_smallest`.
    """


    def test_next_smallest_1(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2
		
    def test_next_smallest_2(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6]) == 2
		
    def test_next_smallest_3(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7]) == 2
		
    def test_next_smallest_4(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8]) == 2
		
    def test_next_smallest_5(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 2
		
    def test_next_smallest_6(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
		
    def test_next_smallest_7(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 2
		
    def test_next_smallest_8(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 2
		
    def test_next_smallest_9(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 2
		
    def test_next_smallest_10(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 2
		
# id_90_Test.py
from scenario1.id_90 import next_smallest

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario1.id_90.next_smallest`.
    """
		
    def test_next_smallest_1(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2
		
    def test_next_smallest_2(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6]) == 2
		
    def test_next_smallest_3(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7]) == 2
		
    def test_next_smallest_4(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8]) == 2
		
    def test_next_smallest_5(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 2
		
    def test_next_smallest_6(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
		
    def test_next_smallest_7(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 2
		
    def test_next_smallest_8(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 2
		
    def test_next_smallest_9(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 2
		
    def test_next_smallest_10(self):
        """
        Test case for the :func:`scenario1.id_90.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 2
		
# id_91.py

def next_smallest(lst):
    

    lst = sorted(set(lst))
    return None if len(lst) < 2 else lst[1]

# id_91_Test.java
from scenario1.id_91 import next_smallest

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario1.id_91.next_smallest`.
    """
		
    def test_next_smallest_1(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2
		
    def test_next_smallest_2(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6]) == 2
		
    def test_next_smallest_3(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7]) == 2
		
    def test_next_smallest_4(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8]) == 2
		
    def test_next_smallest_5(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 2
		
    def test_next_smallest_6(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
		
    def test_next_smallest_7(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 2
		
    def test_next_smallest_8(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 2
		
    def test_next_smallest_9(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 2
		
    def test_next_smallest_10(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 2
		
# id_91_Test.py
from scenario1.id_91 import next_smallest

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario1.id_91.next_smallest`.
    """
		
    def test_next_smallest_1(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2
		
    def test_next_smallest_2(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6]) == 2
		
    def test_next_smallest_3(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7]) == 2
		
    def test_next_smallest_4(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8]) == 2
		
    def test_next_smallest_5(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 2
		
    def test_next_smallest_6(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
		
    def test_next_smallest_7(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 2
		
    def test_next_smallest_8(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 2
		
    def test_next_smallest_9(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 2
		
    def test_next_smallest_10(self):
        """
        Test case for the :func:`scenario1.id_91.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 2
		
# id_92.py

def next_smallest(lst):
    

    lst = sorted(set(lst))
    return None if len(lst) < 2 else lst[1]

# id_92_Test.java
from scenario1.id_92 import next_smallest

import pytest

class id_92_Test:
    """
    Test class of id_92.py.
    It contains ten unit test cases for the :func:`scenario1.id_92.next_smallest`.
    """
		
    def test_next_smallest_1(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2
		
    def test_next_smallest_2(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6]) == 2
		
    def test_next_smallest_3(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7]) == 2
		
    def test_next_smallest_4(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8]) == 2
		
    def test_next_smallest_5(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 2
		
    def test_next_smallest_6(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
		
    def test_next_smallest_7(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 2
		
    def test_next_smallest_8(self):
        """
        Test case for the :func:`scenario1.id_92.next_smallest`.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6