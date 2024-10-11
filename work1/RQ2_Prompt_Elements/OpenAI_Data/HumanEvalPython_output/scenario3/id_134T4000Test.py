# id_134_Test.java
from scenario3.id_134 import check_if_last_char_is_a_letter

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
    """


    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case 1 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pie") == False
		
    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case 2 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e") == True
		
    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case 3 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e ") == False
		
    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case 4 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("") == False
		
    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case 5 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a") == True
		
    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case 6 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a ") == False
		
    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case 7 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b") == True
		
    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case 8 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b ") == False
		
    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case 9 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b c") == True
		
    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case 10 for :func:`scenario3.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b c ") == False
		
# id_135.py

def check_if_last_char_is_a_letter(txt):
    '''
    Create a function that returns True if the last character
    of a given string is an alphabetical character and is not
    a part of a word, and False otherwise.
    Note: "word" is a group of characters separated by space.

    Examples:
    check_if_last_char_is_a_letter("apple pie") ➞ False
    check_if_last_char_is_a_letter("apple pi e") ➞ True
    check_if_last_char_is_a_letter("apple pi e ") ➞ False
    check_if_last_char_is_a_letter("") ➞ False 
    '''

    if txt == "":
        return False
    else:
        if txt[-1] == " ":
            return False
        else:
            if txt[-2] == " ":
                return True
            else:
                return False
# id_135_Test.java
from scenario3.id_135 import check_if_last_char_is_a_letter

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
    """
		
    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case 1 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pie") == False
		
    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case 2 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e") == True
		
    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case 3 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e ") == False
		
    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case 4 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("") == False
		
    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case 5 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a") == True
		
    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case 6 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a ") == False
		
    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case 7 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b") == True
		
    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case 8 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b ") == False
		
    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case 9 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b c") == True
		
    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case 10 for :func:`scenario3.id_135.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b c ") == False
		
# id_136.py

def check_if_last_char_is_a_letter(txt):
    '''
    Create a function that returns True if the last character
    of a given string is an alphabetical character and is not
    a part of a word, and False otherwise.
    Note: "word" is a group of characters separated by space.

    Examples:
    check_if_last_char_is_a_letter("apple pie") ➞ False
    check_if_last_char_is_a_letter("apple pi e") ➞ True
    check_if_last_char_is_a_letter("apple pi e ") ➞ False
    check_if_last_char_is_a_letter("") ➞ False 
    '''

    if txt == "":
        return False
    else:
        if txt[-1] == " ":
            return False
        else:
            if txt[-2] == " ":
                return True
            else:
                return False
# id_136_Test.java
from scenario3.id_136 import check_if_last_char_is_a_letter

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
    """
		
    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case 1 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pie") == False
		
    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case 2 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e") == True
		
    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case 3 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e ") == False
		
    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case 4 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("") == False
		
    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case 5 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a") == True
		
    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case 6 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a ") == False
		
    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case 7 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b") == True
		
    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case 8 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b ") == False
		
    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case 9 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b c") == True
		
    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case 10 for :func:`scenario3.id_136.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("a b c ") == False
		
# id_137.py

def check_if_last_char_is_a_letter(txt):
    '''
    Create a function that returns True if the last character
    of a given string is an alphabetical character and is not
    a part of a word, and False otherwise.
    Note: "word" is a group of characters separated by space.

    Examples:
    check_if_last_char_is_a_letter("apple pie") ➞ False
    check_if_last_char_is_a_letter("apple pi e") ➞ True
    check_if_last_char_is_a_letter("apple pi e ") ➞ False
    check_if_last_char_is_a_letter("") ➞ False 
    '''

    if txt == "":
        return False
    else:
        if txt[-1] == " ":
            return False
        else:
            if txt[-2] == " ":
                return True
            else:
                return False
# id_137_Test.java
from scenario3.id_137 import check_if_last_char_is_a_letter

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`scenario3.id_137.check_if_last_char_is_a_letter`.
    """
		
    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case 1 for :func:`scenario3.id_137.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pie") == False
		
    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case 2 for :func:`scenario3.id_137.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e") == True
		
    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case 3 for :func:`scenario3.id_137.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("apple pi e ") == False
		
    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case 4 for :func:`scenario3.id_137.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("") == False
		
    def test_check_if_last_char_is_a