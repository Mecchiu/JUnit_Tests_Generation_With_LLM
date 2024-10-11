# id_18_Test.java
from original.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`original.id_18.how_many_times`.
    """


    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('', 'a') == 0

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaa', 'a') == 3

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aa') == 3

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaa') == 2

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaa') == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaa') == 0

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaa') == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaa') == 0

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaa') == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaaa') == 0

# id_18_Test.py
from original.id_18 import how_many_times

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`original.id_18.how_many_times`.
    """
		
    def test_how_many_times_1(self):
        """
        Test case 1 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('', 'a') == 0

    def test_how_many_times_2(self):
        """
        Test case 2 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaa', 'a') == 3

    def test_how_many_times_3(self):
        """
        Test case 3 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aa') == 3

    def test_how_many_times_4(self):
        """
        Test case 4 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaa') == 2

    def test_how_many_times_5(self):
        """
        Test case 5 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaa') == 1

    def test_how_many_times_6(self):
        """
        Test case 6 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaa') == 0

    def test_how_many_times_7(self):
        """
        Test case 7 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaa') == 0

    def test_how_many_times_8(self):
        """
        Test case 8 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaa') == 0

    def test_how_many_times_9(self):
        """
        Test case 9 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaa') == 0

    def test_how_many_times_10(self):
        """
        Test case 10 for :func:`original.id_18.how_many_times`.
        """
        assert how_many_times('aaaa', 'aaaaaaaaaa') == 0

# id_19.py


def is_palindrome(string: str) -> bool:
    """ Check if a given string is a palindrome.
    >>> is_palindrome('')
    True
    >>> is_palindrome('a')
    True
    >>> is_palindrome('aa')
    True
    >>> is_palindrome('aba')
    True
    >>> is_palindrome('abba')
    True
    >>> is_palindrome('ab')
    False
    >>> is_palindrome('abc')
    False
    >>> is_palindrome('abca')
    False
    >>> is_palindrome('abcd')
    False
    """

    return string == string[::-1]

# id_19_Test.java
from original.id_19 import is_palindrome

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`original.id_19.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('') == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('a') == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('aa') == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('aba') == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abba') == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('ab') == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abc') == False

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abca') == False

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abcd') == False

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abcde') == False

# id_19_Test.py
from original.id_19 import is_palindrome

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`original.id_19.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('') == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('a') == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('aa') == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('aba') == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abba') == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('ab') == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abc') == False

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abca') == False

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abcd') == False

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`original.id_19.is_palindrome`.
        """
        assert is_palindrome('abcde') == False

# id_20.py


def is_anagram(string1: str, string2: str) -> bool:
    """ Check if two given strings are anagrams.
    >>> is_anagram('', '')
    True
    >>> is_anagram('a', 'a')
    True
    >>> is_anagram('ab', 'ab')
    True
    >>> is_anagram('abc', 'abc')
    True
    >>> is_anagram('abcd', 'abcd')
    True
    >>> is_anagram('abcde', 'abcde')
    True
    >>> is_anagram('abcdef', 'abcdef')
    True
    >>> is_anagram('abcdefg', 'abcdefg')
    True
    >>> is_anagram('abcdefgh', 'abcdefgh')
    True
    >>> is_anagram('abcdefghi', 'abcdefghi')
    True
    >>> is_anagram('abcdefghij', 'abcdefghij')
    True
    >>> is_anagram('abcdefghijk', 'abcdefghijk')
    True
    >>> is_anagram('abcdefghijkl', 'abcdefghijkl')
    True
    >>> is_anagram('abcdefghijklm', 'abcdefghijklm')
    True
    >>> is_anagram('abcdefghijklmn', 'abcdefghijklmn')
    True
    >>> is_anagram('abcdefghijklmno', 'abcdefghijklmno')
    True
    >>> is_anagram('abcdefghijklmnop', 'abcdefghijklmnop')
    True
    >>> is_anagram('abcdefghijklmnopq', 'abcdefghijklmnopq')
    True
    >>> is_anagram('abcdefghijklmnopqr', 'abcdefghijklmnopqr')
    True
    >>> is_anagram('abcdefghijklmnopqrs', 'abcdefghijklmnopqrs')
    True
    >>> is_anagram('abcdefghijklmnopqrst', 'abcdefghijklmnopqrst')
    True
    >>> is_anagram('abcdefghijklmnopqrstu', 'abcdefghijklmnopqrstu')
    True
    >>> is_anagram('abcdefghijklmnopqrstuv', 'abcdefghijklmnopqrstuv')
    True
    >>> is_anagram('abcdefghijklmnopqrstuvw', 'abcdefghijklmnopqrstuvw')
    True
    >>> is_anagram('abcdefghijklmnopqrstuvwx', 'abcdefghijklmnopqrstuvwx')
    True
    >>> is_anagram('abcdefghijklmnopqrstuvwxy', 'abcdefghijklmnopqrstuvwxy')
    True
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyz')
    True
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxy')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyza')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzz')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzza')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzz')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzza')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzzz')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzzza')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzzzz')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzzzza')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghijklmnopqrstuvwxyzzzzzz')
    False
    >>> is_anagram('abcdefghijklmnopqrstuvwxyz', 'abcdefghij