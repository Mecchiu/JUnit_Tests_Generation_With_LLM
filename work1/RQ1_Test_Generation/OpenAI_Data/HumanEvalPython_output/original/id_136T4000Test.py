# id_136_Test.java
from original.id_136 import largest_smallest_integers

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`original.id_136.largest_smallest_integers`.
    """


    def test_largest_smallest_integers_1(self):
        """
        Test case 1 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)

    def test_largest_smallest_integers_2(self):
        """
        Test case 2 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([]) == (None, None)

    def test_largest_smallest_integers_3(self):
        """
        Test case 3 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([0]) == (None, None)

    def test_largest_smallest_integers_4(self):
        """
        Test case 4 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5]) == (-1, None)

    def test_largest_smallest_integers_5(self):
        """
        Test case 5 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([1, 2, 3, 4, 5]) == (None, 1)

    def test_largest_smallest_integers_6(self):
        """
        Test case 6 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_7(self):
        """
        Test case 7 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == (-1, 1)

    def test_largest_smallest_integers_8(self):
        """
        Test case 8 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1]) == (-1, 1)

    def test_largest_smallest_integers_9(self):
        """
        Test case 9 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, 1]) == (-1, 1)

    def test_largest_smallest_integers_10(self):
        """
        Test case 10 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, 1, -1]) == (-1, 1)

# id_136_Test.py
from original.id_136 import largest_smallest_integers

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`original.id_136.largest_smallest_integers`.
    """
		
    def test_largest_smallest_integers_1(self):
        """
        Test case 1 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)

    def test_largest_smallest_integers_2(self):
        """
        Test case 2 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([]) == (None, None)

    def test_largest_smallest_integers_3(self):
        """
        Test case 3 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([0]) == (None, None)

    def test_largest_smallest_integers_4(self):
        """
        Test case 4 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5]) == (-1, None)

    def test_largest_smallest_integers_5(self):
        """
        Test case 5 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([1, 2, 3, 4, 5]) == (None, 1)

    def test_largest_smallest_integers_6(self):
        """
        Test case 6 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_7(self):
        """
        Test case 7 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == (-1, 1)

    def test_largest_smallest_integers_8(self):
        """
        Test case 8 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1]) == (-1, 1)

    def test_largest_smallest_integers_9(self):
        """
        Test case 9 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, 1]) == (-1, 1)

    def test_largest_smallest_integers_10(self):
        """
        Test case 10 for :func:`original.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, 1, -1]) == (-1, 1)

# id_137.py

def is_palindrome(txt):
    '''
    Create a function that returns True if a string is a palindrome,
    and False if it is not.
    A palindrome is a string that is spelled the same both forwards and backwards,
    usually without considering punctuation or word breaks:
    "Anna", "Civic", "Kayak" and "Level" are all examples of palindromes.
    Your function should be able to take in a string with special characters.

    Examples:
    is_palindrome("Anna") == True
    is_palindrome("walter") == False
    is_palindrome("A man, a plan, a canal. Panama") == True
    '''

    txt = txt.lower()
    txt = ''.join(filter(lambda x: x.isalpha(), txt))
    return txt == txt[::-1]

# id_137_Test.java
from original.id_137 import is_palindrome

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`original.id_137.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("Anna") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("walter") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama!") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama?") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama.") == True

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama,") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama;") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama:") == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama'") == True

# id_137_Test.py
from original.id_137 import is_palindrome

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`original.id_137.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("Anna") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("walter") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama!") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama?") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama.") == True

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama,") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama;") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama:") == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`original.id_137.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama'") == True

# id_138.py

def is_palindrome(txt):
    '''
    Create a function that returns True if a string is a palindrome,
    and False if it is not.
    A palindrome is a string that is spelled the same both forwards and backwards,
    usually without considering punctuation or word breaks:
    "Anna", "Civic", "Kayak" and "Level" are all examples of palindromes.
    Your function should be able to take in a string with special characters.

    Examples:
    is_palindrome("Anna") == True
    is_palindrome("walter") == False
    is_palindrome("A man, a plan, a canal. Panama") == True
    '''

    txt = txt.lower()
    txt = ''.join(filter(lambda x: x.isalpha(), txt))
    return txt == txt[::-1]

# id_138_Test.java
from original.id_138 import is_palindrome

import pytest

class id_138_Test:
    """
    Test class of id_138.py.
    It contains ten unit test cases for the :func:`original.id_138.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_138.is_palindrome`.
        """
        assert is_palindrome("Anna") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_138.is_palindrome`.
        """
        assert is_palindrome("walter") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_138.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_138.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal. Panama!") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_138.is_palindrome`.
        """
