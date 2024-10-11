# id_72_Test.java
from scenario2.id_72 import will_it_fly

import pytest

class id_72_Test:
    """
    Test class of id_72.py.
    It contains ten unit test cases for the :func:`scenario2.id_72.will_it_fly`.
    """


    def test_will_it_fly_1(self):
        """
        Test case 1 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 100) == True

    def test_will_it_fly_2(self):
        """
        Test case 2 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 99) == False

    def test_will_it_fly_3(self):
        """
        Test case 3 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 101) == False

    def test_will_it_fly_4(self):
        """
        Test case 4 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 55) == True

    def test_will_it_fly_5(self):
        """
        Test case 5 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 54) == False

    def test_will_it_fly_6(self):
        """
        Test case 6 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 56) == False

    def test_will_it_fly_7(self):
        """
        Test case 7 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 55) == True

    def test_will_it_fly_8(self):
        """
        Test case 8 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 54) == False

    def test_will_it_fly_9(self):
        """
        Test case 9 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 56) == False

    def test_will_it_fly_10(self):
        """
        Test case 10 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 55) == True

# id_72_Test.py
from scenario2.id_72 import will_it_fly

import pytest

class id_72_Test:
    """
    Test class of id_72.py.
    It contains ten unit test cases for the :func:`scenario2.id_72.will_it_fly`.
    """
		
    def test_will_it_fly_1(self):
        """
        Test case 1 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 100) == True

    def test_will_it_fly_2(self):
        """
        Test case 2 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 99) == False

    def test_will_it_fly_3(self):
        """
        Test case 3 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 101) == False

    def test_will_it_fly_4(self):
        """
        Test case 4 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 55) == True

    def test_will_it_fly_5(self):
        """
        Test case 5 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 54) == False

    def test_will_it_fly_6(self):
        """
        Test case 6 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 56) == False

    def test_will_it_fly_7(self):
        """
        Test case 7 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 55) == True

    def test_will_it_fly_8(self):
        """
        Test case 8 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 54) == False

    def test_will_it_fly_9(self):
        """
        Test case 9 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 56) == False

    def test_will_it_fly_10(self):
        """
        Test case 10 for :func:`scenario2.id_72.will_it_fly`.
        """
        assert will_it_fly([1,2,3,4,5,6,7,8,9,10], 55) == True

# id_73.py

def is_it_a_palindrome(q):
    '''
    Write a function that returns True if the list q is a palindrome, and False otherwise.
    A list is a palindrome if it is the same when read from left to right and from right to left.

    
    '''

    i, j = 0, len(q)-1
    while i<j:
        if q[i] != q[j]:
            return False
        i+=1
        j-=1
    return True

# id_73_Test.java
from scenario2.id_73 import is_it_a_palindrome

import pytest

class id_73_Test:
    """
    Test class of id_73.py.
    It contains ten unit test cases for the :func:`scenario2.id_73.is_it_a_palindrome`.
    """
		
    def test_is_it_a_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,10]) == False

    def test_is_it_a_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1]) == True

    def test_is_it_a_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,2]) == False

    def test_is_it_a_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,0]) == False

    def test_is_it_a_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,0]) == False

    def test_is_it_a_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,1]) == True

    def test_is_it_a_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1]) == True

    def test_is_it_a_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,2]) == False

    def test_is_it_a_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,0]) == False

    def test_is_it_a_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,0]) == False

# id_73_Test.py
from scenario2.id_73 import is_it_a_palindrome

import pytest

class id_73_Test:
    """
    Test class of id_73.py.
    It contains ten unit test cases for the :func:`scenario2.id_73.is_it_a_palindrome`.
    """
		
    def test_is_it_a_palindrome_1(self):
        """
        Test case 1 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,10]) == False

    def test_is_it_a_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1]) == True

    def test_is_it_a_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,2]) == False

    def test_is_it_a_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,0]) == False

    def test_is_it_a_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,0]) == False

    def test_is_it_a_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,1]) == True

    def test_is_it_a_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1]) == True

    def test_is_it_a_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,2]) == False

    def test_is_it_a_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,0]) == False

    def test_is_it_a_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_73.is_it_a_palindrome`.
        """
        assert is_it_a_palindrome([1,2,3,4,5,6,7,