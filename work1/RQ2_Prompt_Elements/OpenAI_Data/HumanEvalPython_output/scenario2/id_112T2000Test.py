# id_112_Test.java
from scenario2.id_112 import reverse_delete

import pytest

class id_112_Test:
    """
    Test class of id_112.py.
    It contains ten unit test cases for the :func:`scenario2.id_112.reverse_delete`.
    """


    def test_reverse_delete_1(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","a") == ("bcbc",True)
		
    def test_reverse_delete_2(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","b") == ("acaca",True)
		
    def test_reverse_delete_3(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","c") == ("ababa",True)
		
    def test_reverse_delete_4(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","d") == ("abacaba",False)
		
    def test_reverse_delete_5(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","") == ("abacaba",False)
		
    def test_reverse_delete_6(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("","a") == ("",True)
		
    def test_reverse_delete_7(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("","") == ("",True)
		
    def test_reverse_delete_8(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","ab") == ("c",True)
		
    def test_reverse_delete_9(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","ba") == ("c",True)
		
    def test_reverse_delete_10(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
# id_113.py

def is_palindrome(s):
    """Task
    We are given a string s.
    You should return True if the string is palindrome and False otherwise.
    A string is called palindrome if it reads the same backward as forward.
    
    
    """

    return s == s[::-1]

# id_113_Test.java
from scenario2.id_113 import is_palindrome

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`scenario2.id_113.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario2.id_113.is_palindrome`.
        """
        assert is_palindrome("abacaba") == True
		
# id_114.py

def is_palindrome_2(s):
    """Task
    We are given a string s.
    You should return True if the string is palindrome and False otherwise.
    A string is called palindrome if it reads the same backward as forward.
    You should ignore all non-alphanumeric characters.
    
    
    """

    s = ''.join([char for char in s if char.isalnum()])
    return s.lower() == s[::-1].lower()

# id_114_Test.java
from scenario2.id_114 import is_palindrome_2

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`scenario2.id_114.is_palindrome_2`.
    """
		
    def test_is_palindrome_2_1(self):
        """
        Test case for the :func:`scenario2.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("A man, a plan, a canal, Panama.") == True
		
    def test_is_palindrome_2_2(self):
        """
        Test case for the :func:`scenario2.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("A man, a plan, a canal, Panama.") == True
		
    def test_is_palindrome_2_3(self):
        """
        Test case for the :func:`scenario2.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("A man, a plan, a canal, Panama.") == True
		
    def test_is_palindrome_2_4(self):
        """
        Test case for the :func:`scenario2.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("A man, a plan, a canal, Panama.") == True
		
    def test_is_palindrome_2_5(self):
        """
        Test case for the :func:`scenario2.id_114.is_palindrome_2`.
        """
        assert is_palind