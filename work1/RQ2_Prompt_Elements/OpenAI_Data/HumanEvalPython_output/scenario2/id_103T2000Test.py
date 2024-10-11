# id_103_Test.java
from scenario2.id_103 import rounded_avg

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario2.id_103.rounded_avg`.
    """


    def test_rounded_avg_1(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 2) == '0b1'

    def test_rounded_avg_2(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 3) == '0b2'

    def test_rounded_avg_3(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 4) == '0b2'

    def test_rounded_avg_4(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 5) == '0b3'

    def test_rounded_avg_5(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 6) == '0b3'

    def test_rounded_avg_6(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 7) == '0b4'

    def test_rounded_avg_7(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 8) == '0b4'

    def test_rounded_avg_8(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 9) == '0b5'

    def test_rounded_avg_9(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 10) == '0b5'

    def test_rounded_avg_10(self):
        """
        Test case for the :func:`scenario2.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 11) == '0b6'


# id_104.py

def is_palindrome(s):
    """You are given a string s. 
    Return True if s is a palindrome, and False otherwise.
    """

    return s == s[::-1]


# id_104_Test.java
from scenario2.id_104 import is_palindrome

import pytest

class id_104_Test:
    """
    Test class of id_104.py.
    It contains ten unit test cases for the :func:`scenario2.id_104.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('racecar') == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raccar') == False

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecar') == False

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecarr') == True

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecar') == False

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecarr') == True

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecar') == False

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecarr') == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecar') == False

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario2.id_104.is_palindrome`.
        """
        assert is_palindrome('raceecarr') == True


# id_105.py

def is_palindrome_2(s):
    """You are given a string s. 
    Return True if s is a palindrome, and False otherwise.
    """

    return s == s[::-1]


# id_105_Test.java
from scenario2.id_105 import is_palindrome_2

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario2.id_105.is_palindrome_2`.
    """
		
    def test_is_palindrome_2_1(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('racecar') == True

    def test_is_palindrome_2_2(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('raccar') == False

    def test_is_palindrome_2_3(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('raceecar') == False

    def test_is_palindrome_2_4(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('raceecarr') == True

    def test_is_palindrome_2_5(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('raceecar') == False

    def test_is_palindrome_2_6(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('raceecarr') == True

    def test_is_palindrome_2_7(self):
        """
        Test case for the :func:`scenario2.id_105.is_palindrome_2`.
        """
        assert is_palindrome_2('raceecar') == False

    def test_is_palindrome_2_8(self):
        """
        Test case for the :func:`scenario