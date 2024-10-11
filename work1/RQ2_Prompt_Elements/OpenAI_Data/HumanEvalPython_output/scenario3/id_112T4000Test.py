# id_112_Test.java
from scenario3.id_112 import reverse_delete

import pytest

class id_112_Test:
    """
    Test class of id_112.py.
    It contains ten unit test cases for the :func:`scenario3.id_112.reverse_delete`.
    """


    def test_reverse_delete_1(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcde","ae") == ('bcd',False)
		
    def test_reverse_delete_2(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdef","b") == ('acdef',False)
		
    def test_reverse_delete_3(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_4(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_5(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_6(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_7(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_8(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_9(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
    def test_reverse_delete_10(self):
        """
        Test case for the function :func:`scenario3.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdedcba","ab") == ('cdedc',True)
		
# id_113.py

def is_palindrome(s):
    """Task
    Given a string s, check if it is a palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return True/False for the check.
    Example
    For s = "abcdcba", the result should be True
    For s = "abcd", the result should be False
    """

    pass
# id_113_Test.java
from scenario3.id_113 import is_palindrome

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`scenario3.id_113.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcd") == False
		
    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True
		
    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcd") == False
		
    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcd") == False
		
    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True
		
    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcd") == False
		
    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True
		
    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`scenario3.id_113.is_palindrome`.
        """
        assert is_palindrome("abcd") == False
		
# id_114.py

def is_palindrome_2(s):
    """Task
    Given a string s, check if it is a palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return True/False for the check.
    Example
    For s = "abcdcba", the result should be True
    For s = "abcd", the result should be False
    """

    pass
# id_114_Test.java
from scenario3.id_114 import is_palindrome_2

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`scenario3.id_114.is_palindrome_2`.
    """
		
    def test_is_palindrome_2_1(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcdcba") == True
		
    def test_is_palindrome_2_2(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcd") == False
		
    def test_is_palindrome_2_3(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcdcba") == True
		
    def test_is_palindrome_2_4(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcd") == False
		
    def test_is_palindrome_2_5(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcdcba") == True
		
    def test_is_palindrome_2_6(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcd") == False
		
    def test_is_palindrome_2_7(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcdcba") == True
		
    def test_is_palindrome_2_8(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcd") == False
		
    def test_is_palindrome_2_9(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcdcba") == True
		
    def test_is_palindrome_2_10(self):
        """
        Test case for the function :func:`scenario3.id_114.is_palindrome_2`.
        """
        assert is_palindrome_2("abcd") == False
		
# id_115.py

def is_palindrome_3(s):
    """Task
    Given a string s, check if it is a palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return True/False for the check.
    Example
    For s = "abcdcba", the result should be True
    For s = "abcd", the result should be False
    """

    pass
# id_115_Test.java
from scenario3.id_115 import is_palindrome_3

import pytest

class id_115_Test:
    """
    Test class of id_115.py.
    It contains ten unit test cases for the :func:`scenario3.id_115.is_palindrome_3`.
    """
		
    def test_is_palindrome_3_1(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcdcba") == True
		
    def test_is_palindrome_3_2(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcd") == False
		
    def test_is_palindrome_3_3(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcdcba") == True
		
    def test_is_palindrome_3_4(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcd") == False
		
    def test_is_palindrome_3_5(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcdcba") == True
		
    def test_is_palindrome_3_6(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcd") == False
		
    def test_is_palindrome_3_7(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcdcba") == True
		
    def test_is_palindrome_3_8(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcd") == False
		
    def test_is_palindrome_3_9(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcdcba") == True
		
    def test_is_palindrome_3_10(self):
        """
        Test case for the function :func:`scenario3.id_115.is_palindrome_3`.
        """
        assert is_palindrome_3("abcd") == False
		
# id_116.py

def is_palindrome_4(s):
    """Task
    Given a string s, check if it is a palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return True/False for the check.
    Example
    For s = "abcdcba", the result should be True
    For s = "abcd", the result should be False
    """

    pass
# id_116_Test.java
from scenario3.id_116 import is_palindrome_4

import pytest

class id_116_Test:
    """
    Test class of id_116.py.
    It contains ten unit test cases for the :func:`scenario3.id_116.is_palindrome_4`.
    """
		
    def test_is_palindrome_4_1(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcdcba") == True
		
    def test_is_palindrome_4_2(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcd") == False
		
    def test_is_palindrome_4_3(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcdcba") == True
		
    def test_is_palindrome_4_4(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcd") == False
		
    def test_is_palindrome_4_5(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcdcba") == True
		
    def test_is_palindrome_4_6(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcd") == False
		
    def test_is_palindrome_4_7(self):
        """
        Test case for the function :func:`scenario3.id_116.is_palindrome_4`.
        """
        assert is_palindrome_4("abcdcba") == True
		
    def test_is_palindrome_4_8(self):
       