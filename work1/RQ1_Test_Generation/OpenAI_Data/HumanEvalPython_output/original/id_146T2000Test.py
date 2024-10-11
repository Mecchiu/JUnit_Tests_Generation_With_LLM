# id_146_Test.java
from original.id_146 import specialFilter

import pytest

class id_146_Test:
    """
    Test class of id_146.py.
    It contains ten unit test cases for the :func:`original.id_146.specialFilter`.
    """


    def test_specialFilter_1(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([15, -73, 14, -15]) == 1
		
    def test_specialFilter_2(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([33, -2, -3, 45, 21, 109]) == 2
		
    def test_specialFilter_3(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 0
		
    def test_specialFilter_4(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 0
		
    def test_specialFilter_5(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 0
		
    def test_specialFilter_6(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 0
		
    def test_specialFilter_7(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == 0
		
    def test_specialFilter_8(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == 0
		
    def test_specialFilter_9(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == 0
		
    def test_specialFilter_10(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([61, 62, 63, 64, 65, 66, 67, 68, 69, 70]) == 0
		
# id_147.py

def isPalindrome(word):
    """Write a function that takes a string as input and returns True if the 
    string is a palindrome, False otherwise.
    For example:
    isPalindrome("racecar") => True
    isPalindrome("hello") => False
    """
    
    return word == word[::-1]

# id_147_Test.java
from original.id_147 import isPalindrome

import pytest

class id_147_Test:
    """
    Test class of id_147.py.
    It contains ten unit test cases for the :func:`original.id_147.isPalindrome`.
    """
		
    def test_isPalindrome_1(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("racecar") == True
		
    def test_isPalindrome_2(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("hello") == False
		
    def test_isPalindrome_3(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("") == True
		
    def test_isPalindrome_4(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("a") == True
		
    def test_isPalindrome_5(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("aa") == True
		
    def test_isPalindrome_6(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("ab") == False
		
    def test_isPalindrome_7(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("aba") == True
		
    def test_isPalindrome_8(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("abba") == True
		
    def test_isPalindrome_9(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("abcba") == True
		
    def test_isPalindrome_10(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("abccba") == True
		
# id_148.py

def isPalindrome(word):
    """Write a function that takes a string as input and returns True if the 
    string is a palindrome, False otherwise.
    For example:
    isPalindrome("racecar") => True
    isPalindrome("hello") => False
    """
    
    return word == word[::-1]

# id_148_Test.java
from original.id_148 import isPalindrome

import pytest

class id_148_Test:
    """
    Test class of id_148.py.
    It contains ten unit test cases for the :func:`original.id_148.isPalindrome`.
    """
		
    def test_isPalindrome_1(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("racecar") == True
		
    def test_isPalindrome_2(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("hello") == False
		
    def test_isPalindrome_3(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("") == True
		
    def test_isPalindrome_4(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("a") == True
		
    def test_isPalindrome_5(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("aa") == True
		
    def test_isPalindrome_6(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("ab") == False
		
    def test_isPalindrome_7(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("aba") == True
		
    def test_isPalindrome_8(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("abba") == True
		
    def test_isPalindrome_9(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("abcba") == True
		
    def test_isPalindrome_10(self):
        """
        Test case for isPalindrome.
        """
        assert isPalindrome("abccba") == True
		
# id_149.py

def isPalindrome(word):
    """Write a function that takes a string as input and returns True if the 
    string is a palindrome, False otherwise.
    For example:
    isPalindrome("racecar") => True
    isPalindrome("hello") => False
    """
    
    return word == word[::-1]

# id_149_Test.java
from original.id_149 import isPalindrome

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`original.id_149.isPalindrome`.
    """
		
    def test_isPalindrome_1(self):