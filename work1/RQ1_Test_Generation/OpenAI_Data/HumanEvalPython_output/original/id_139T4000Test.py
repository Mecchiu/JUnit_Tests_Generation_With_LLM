# id_139_Test.java
from original.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`original.id_139.special_factorial`.
    """


    def test_special_factorial_1(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(1) == 1

    def test_special_factorial_2(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(2) == 2

    def test_special_factorial_3(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(3) == 12

    def test_special_factorial_4(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288

    def test_special_factorial_5(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560

    def test_special_factorial_6(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(6) == 24883200

    def test_special_factorial_7(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(7) == 12541132800

    def test_special_factorial_8(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(8) == 5159780352

    def test_special_factorial_9(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(9) == 180108854112

    def test_special_factorial_10(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(10) == 56693912375296

# id_139_Test.py
from original.id_139 import special_factorial

import pytest

class id_139_Test:
    """
    Test class of id_139.py.
    It contains ten unit test cases for the :func:`original.id_139.special_factorial`.
    """
		
    def test_special_factorial_1(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(1) == 1

    def test_special_factorial_2(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(2) == 2

    def test_special_factorial_3(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(3) == 12

    def test_special_factorial_4(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(4) == 288

    def test_special_factorial_5(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(5) == 34560

    def test_special_factorial_6(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(6) == 24883200

    def test_special_factorial_7(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(7) == 12541132800

    def test_special_factorial_8(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(8) == 5159780352

    def test_special_factorial_9(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(9) == 180108854112

    def test_special_factorial_10(self):
        """
        Test case for the function :func:`original.id_139.special_factorial`.
        """
        assert special_factorial(10) == 56693912375296

# id_140.py

def is_palindrome(s):
    """A palindrome is a word, phrase, number, or other sequence of characters
    which reads the same backward as forward, such as madam or racecar.

    The function will receive a string as input and should return True if the
    string is a palindrome and False if it is not.

    For example:
    >>> is_palindrome("racecar")
    True
    >>> is_palindrome("not a palindrome")
    False
    """

    return s == s[::-1]

# id_140_Test.java
from original.id_140 import is_palindrome

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`original.id_140.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("not a palindrome") == False

    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal, Panama!") == True

    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Was it a car or a cat I saw?") == True

    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("No 'x' in Nixon") == True

    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Abba Zabba, you're my only friend") == False

    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Are we not drawn onward, we few, drawn onward to new era?") == False

    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.") == True

    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Go hang a salami, I'm a lasagna hog") == True

    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("A Toyota's a Toyota") == True

# id_140_Test.py
from original.id_140 import is_palindrome

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`original.id_140.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("not a palindrome") == False

    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal, Panama!") == True

    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Was it a car or a cat I saw?") == True

    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("No 'x' in Nixon") == True

    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Abba Zabba, you're my only friend") == False

    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Are we not drawn onward, we few, drawn onward to new era?") == False

    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.") == True

    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("Go hang a salami, I'm a lasagna hog") == True

    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_140.is_palindrome`.
        """
        assert is_palindrome("A Toyota's a Toyota") == True

# id_141.py

def is_anagram(s1, s2):
    """An anagram is a word or phrase formed by rearranging the letters of a
    different word or phrase, typically using all the original letters exactly
    once.

    The function will receive two strings as input and should return True if
    the strings are anagrams and False if they are not.

    For example:
    >>> is_anagram("silent", "listen")
    True
    >>> is_anagram("torchwood", "doctor who")
    True
    >>> is_anagram("anagram", "nag a ram")
    True
    >>> is_anagram("funeral", "real fun")
    True
    >>> is_anagram("elvis", "lives")
    True
    >>> is_anagram("silent", "listen!")
    False
    >>> is_anagram("aabbcc", "aabbc")
    False
    >>> is_anagram("abbba", "ababa")
    False
    """

    return sorted(s1.replace(" ", "")) == sorted(s2.replace(" ", ""))

# id_141_Test.java
from original.id_141 import is_anagram

import pytest

class id_141_Test:
    """
    Test class of id_141.py.
    It contains ten unit test cases for the :func:`original.id_141.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("silent", "listen") == True

    def test_is_anagram_2(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("torchwood", "doctor who") == True

    def test_is_anagram_3(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("anagram", "nag a ram") == True

    def test_is_anagram_4(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("funeral", "real fun") == True

    def test_is_anagram_5(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("elvis", "lives") == True

    def test_is_anagram_6(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("silent", "listen!") == False

    def test_is_anagram_7(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("aabbcc", "aabbc") == False

    def test_is_anagram_8(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("abbba", "ababa") == False

    def test_is_anagram_9(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("", "") == True

    def test_is_anagram_10(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("a", "a") == True

# id_141_Test.py
from original.id_141 import is_anagram

import pytest

class id_141_Test:
    """
    Test class of id_141.py.
    It contains ten unit test cases for the :func:`original.id_141.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("silent", "listen") == True

    def test_is_anagram_2(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.
        """
        assert is_anagram("torchwood", "doctor who") == True

    def test_is_anagram_3(self):
        """
        Test case for the function :func:`original.id_141.is_anagram`.