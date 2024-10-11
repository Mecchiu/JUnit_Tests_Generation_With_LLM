# id_74_Test.java
from original.id_74 import total_match

import pytest

class id_74_Test:
    """
    Test class of id_74.py.
    It contains ten unit test cases for the :func:`original.id_74.total_match`.
    """


    def test_total_match_1(self):
        """
        Test case 1 of id_74.py.
        """
        assert total_match([], []) == []
    
    def test_total_match_2(self):
        """
        Test case 2 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'Hi']) == ['hI', 'Hi']
    
    def test_total_match_3(self):
        """
        Test case 3 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) == ['hi', 'admin']
    
    def test_total_match_4(self):
        """
        Test case 4 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) == ['hI', 'hi', 'hi']
    
    def test_total_match_5(self):
        """
        Test case 5 of id_74.py.
        """
        assert total_match(['4'], ['1', '2', '3', '4', '5']) == ['4']
    
    def test_total_match_6(self):
        """
        Test case 6 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'Hi']) == ['hI', 'Hi']
    
    def test_total_match_7(self):
        """
        Test case 7 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) == ['hi', 'admin']
    
    def test_total_match_8(self):
        """
        Test case 8 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) == ['hI', 'hi', 'hi']
    
    def test_total_match_9(self):
        """
        Test case 9 of id_74.py.
        """
        assert total_match(['4'], ['1', '2', '3', '4', '5']) == ['4']
    
    def test_total_match_10(self):
        """
        Test case 10 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'Hi']) == ['hI', 'Hi']

# id_74_Test.py
from original.id_74 import total_match

import pytest

class id_74_Test:
    """
    Test class of id_74.py.
    It contains ten unit test cases for the :func:`original.id_74.total_match`.
    """
		
    def test_total_match_1(self):
        """
        Test case 1 of id_74.py.
        """
        assert total_match([], []) == []
    
    def test_total_match_2(self):
        """
        Test case 2 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'Hi']) == ['hI', 'Hi']
    
    def test_total_match_3(self):
        """
        Test case 3 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) == ['hi', 'admin']
    
    def test_total_match_4(self):
        """
        Test case 4 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) == ['hI', 'hi', 'hi']
    
    def test_total_match_5(self):
        """
        Test case 5 of id_74.py.
        """
        assert total_match(['4'], ['1', '2', '3', '4', '5']) == ['4']
    
    def test_total_match_6(self):
        """
        Test case 6 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'Hi']) == ['hI', 'Hi']
    
    def test_total_match_7(self):
        """
        Test case 7 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) == ['hi', 'admin']
    
    def test_total_match_8(self):
        """
        Test case 8 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) == ['hI', 'hi', 'hi']
    
    def test_total_match_9(self):
        """
        Test case 9 of id_74.py.
        """
        assert total_match(['4'], ['1', '2', '3', '4', '5']) == ['4']
    
    def test_total_match_10(self):
        """
        Test case 10 of id_74.py.
        """
        assert total_match(['hi', 'admin'], ['hI', 'Hi']) == ['hI', 'Hi']

# id_75.py

def is_palindrome(txt):
    '''
    Write a function that returns True if a string is a palindrome, and False otherwise.

    Examples
    is_palindrome("racecar") ➞ True
    is_palindrome("stars") ➞ False
    is_palindrome("kayak") ➞ True
    is_palindrome("madam") ➞ True
    is_palindrome("Madam") ➞ False
    is_palindrome("") ➞ True
    '''

    return txt == txt[::-1]


# id_75_Test.java
from original.id_75 import is_palindrome

import pytest

class id_75_Test:
    """
    Test class of id_75.py.
    It contains ten unit test cases for the :func:`original.id_75.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 of id_75.py.
        """
        assert is_palindrome("racecar") == True
    
    def test_is_palindrome_2(self):
        """
        Test case 2 of id_75.py.
        """
        assert is_palindrome("stars") == False
    
    def test_is_palindrome_3(self):
        """
        Test case 3 of id_75.py.
        """
        assert is_palindrome("kayak") == True
    
    def test_is_palindrome_4(self):
        """
        Test case 4 of id_75.py.
        """
        assert is_palindrome("madam") == True
    
    def test_is_palindrome_5(self):
        """
        Test case 5 of id_75.py.
        """
        assert is_palindrome("Madam") == False
    
    def test_is_palindrome_6(self):
        """
        Test case 6 of id_75.py.
        """
        assert is_palindrome("") == True
    
    def test_is_palindrome_7(self):
        """
        Test case 7 of id_75.py.
        """
        assert is_palindrome("racecar") == True
    
    def test_is_palindrome_8(self):
        """
        Test case 8 of id_75.py.
        """
        assert is_palindrome("stars") == False
    
    def test_is_palindrome_9(self):
        """
        Test case 9 of id_75.py.
        """
       