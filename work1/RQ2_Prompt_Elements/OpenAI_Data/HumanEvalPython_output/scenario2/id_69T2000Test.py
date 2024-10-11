# id_69_Test.java
from scenario2.id_69 import search

import pytest

class id_69_Test:
    """
    Test class of id_69.py.
    It contains ten unit test cases for the :func:`scenario2.id_69.search`.
    """


    def test_search_1(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == -1
    
    def test_search_2(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10]) == 10
    
    def test_search_3(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10]) == 10
    
    def test_search_4(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10]) == 10
    
    def test_search_5(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10]) == 10
    
    def test_search_6(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_7(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_8(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_9(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_10(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10]) == 10

# id_69_Test.py
from scenario2.id_69 import search

import pytest

class id_69_Test:
    """
    Test class of id_69.py.
    It contains ten unit test cases for the :func:`scenario2.id_69.search`.
    """
		
    def test_search_1(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == -1
    
    def test_search_2(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10]) == 10
    
    def test_search_3(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10]) == 10
    
    def test_search_4(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10]) == 10
    
    def test_search_5(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10]) == 10
    
    def test_search_6(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_7(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_8(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_9(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10]) == 10
    
    def test_search_10(self):
        """
        Test case for the :func:`scenario2.id_69.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10]) == 10

# id_70.py

def search(lst):
    '''
    You are given a non-empty list of positive integers. Return the greatest integer that is greater than 
    zero, and has a frequency greater than or equal to the value of the integer itself. 
    The frequency of an integer is the number of times it appears in the list.
    If no such a value exist, return -1.
    
    '''

    frq = [0] * (max(lst) + 1)
    for i in lst:
        frq[i] += 1;

    ans = -1
    for i in range(1, len(frq)):
        if frq[i] >= i:
            ans = i
    
    return ans

# id_70_Test.java
from scenario2.id_70 import search

import pytest

class id_70_Test:
    """
    Test class of id_70.py.
    It contains ten unit test cases for the :func:`scenario2.id_70.search`.
    """
		
    def test_search_1(self):
        """
        Test case for the :func:`scenario2.id_70.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == -1
    
    def test_search_2(self):
        """
        Test case for the :func:`scenario2.id_70.search`.
        """
        assert search([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10]) == 10
    
    def test_search_3(self):
        """
        Test case for the :func:`scenario2.id_70