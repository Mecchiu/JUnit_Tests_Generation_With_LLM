# id_136_Test.java
from scenario3.id_136 import largest_smallest_integers

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario3.id_136.largest_smallest_integers`.
    """


    def test_largest_smallest_integers_1(self):
        """
        Test case 1 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)

    def test_largest_smallest_integers_2(self):
        """
        Test case 2 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([]) == (None, None)

    def test_largest_smallest_integers_3(self):
        """
        Test case 3 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([0]) == (None, None)

    def test_largest_smallest_integers_4(self):
        """
        Test case 4 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5]) == (-1, None)

    def test_largest_smallest_integers_5(self):
        """
        Test case 5 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([1, 2, 3, 4, 5]) == (None, 1)

    def test_largest_smallest_integers_6(self):
        """
        Test case 6 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5]) == (-1, 1)

    def test_largest_smallest_integers_7(self):
        """
        Test case 7 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0]) == (-1, 1)

    def test_largest_smallest_integers_8(self):
        """
        Test case 8 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1]) == (-1, 1)

    def test_largest_smallest_integers_9(self):
        """
        Test case 9 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2]) == (-1, 1)

    def test_largest_smallest_integers_10(self):
        """
        Test case 10 for :func:`scenario3.id_136.largest_smallest_integers`.
        """
        assert largest_smallest_integers([-1, -2, -3, -4, -5, 1, 2, 3, 4, 5, 0, -1, -2, -3]) == (-1, 1)

# id_137.py

def is_palindrome(string):
    '''
    Create a function that returns True if a string is a palindrome,
    and False if it is not.

    Examples:
    is_palindrome("racecar") == True
    is_palindrome("stars") == False
    is_palindrome("토마토") == True
    is_palindrome("kayak") == True
    is_palindrome("hello") == False
    '''

    pass
# id_137_Test.java
from scenario3.id_137 import is_palindrome

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`scenario3.id_137.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("stars") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("토마토") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("kayak") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("hello") == False

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario3.id_137.is_palindrome`.
        """
        assert is_palindrome("aba") == True

# id_138.py

def is_anagram(string1, string2):
    '''
    Create a function that returns True if two strings are anagrams,
    and False if they are not.

    Examples:
    is_anagram("cristian", "Cristina") == True
    is_anagram("Dave Barry", "Ray Adverb") == True
    is_anagram("Nope", "Note") == False
    is_anagram("Apple", "Pabble") == False
    '''

    pass
# id_138_Test.java
from scenario3.id_138 import is_anagram

import pytest

class id_138_Test:
    """
    Test class of id_138.py.
    It contains ten unit test cases for the :func:`scenario3.id_138.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case 1 for :func:`scenario3.id_138.is_anagram`.
        """
        assert is_anagram("cristian", "Cristina") == True

    def test_is_anagram_2(self):
        """
        Test case 2 for :func:`scenario3.id_138.is_anagram`.
        """
        assert is_anagram("Dave Barry", "Ray Adverb") == True

    def test_is_anagram_3