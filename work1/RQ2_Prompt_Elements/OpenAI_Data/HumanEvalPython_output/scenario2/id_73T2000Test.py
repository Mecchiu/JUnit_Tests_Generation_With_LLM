# id_73_Test.java
from scenario2.id_73 import smallest_change

import pytest

class id_73_Test:
    """
    Test class of id_73.py.
    It contains ten unit test cases for the :func:`scenario2.id_73.smallest_change`.
    """


    def test_smallest_change_1(self):
        """
        Test case 1 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5]) == 2
		
    def test_smallest_change_2(self):
        """
        Test case 2 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6]) == 3
		
    def test_smallest_change_3(self):
        """
        Test case 3 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7]) == 4
		
    def test_smallest_change_4(self):
        """
        Test case 4 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8]) == 4
		
    def test_smallest_change_5(self):
        """
        Test case 5 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 5
		
    def test_smallest_change_6(self):
        """
        Test case 6 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 5
		
    def test_smallest_change_7(self):
        """
        Test case 7 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 6
		
    def test_smallest_change_8(self):
        """
        Test case 8 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 6
		
    def test_smallest_change_9(self):
        """
        Test case 9 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == 7
		
    def test_smallest_change_10(self):
        """
        Test case 10 for :func:`scenario2.id_73.smallest_change`.
        """
        assert smallest_change([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == 7
		
# id_74.py

def is_palindrome(arr):
    """
    Given an array arr of integers, find out whether it is possible to make the array palindromic
    by changing at most one element. A palindromic array is an array that is read the same backwards and forwards.

    
    """

    ans = 0
    for i in range(len(arr) // 2):
        if arr[i] != arr[len(arr) - i - 1]:
            ans += 1
    return ans <= 1

# id_74_Test.java
from scenario2.id_74 import is_palindrome

import pytest

class id_74_Test:
    """
    Test class of id_74.py.
    It contains ten unit test cases for the :func:`scenario2.id_74.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5]) == False
		
    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6]) == False
		
    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7]) == False
		
    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8]) == False
		
    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8, 9]) == False
		
    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == False
		
    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == False
		
    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == False
		
    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == False
		
    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_74.is_palindrome`.
        """
        assert is_palindrome([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == False
		
# id_75.py

def is_palindrome_2(arr):
    """
    Given an array arr of integers, find out whether it is possible to make the array palindromic
    by changing at most two elements. A palindromic array is an array that is read the same backwards and forwards.

    
    """

    ans = 0
    for i in range(len(arr) // 2):
        if arr[i] != arr[len(arr) - i - 1]:
            ans += 1
    return ans <= 2

# id_75_Test.java
from scenario2.id_75 import is_palindrome_2

import pytest

class id_75_Test:
    """
    Test class of id_75.py.
    It contains ten unit test cases for the :func:`scenario2.id_75.is_palindrome_2`.
    """
		
    def test_is_palindrome_2_1(self):
        """
        Test case 1 for :func:`scenario2.id_75.is_palindrome_2`.
        """
        assert