# id_125_Test.java
from scenario3.id_125 import split_words

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`scenario3.id_125.split_words`.
    """


    def test_split_words_1(self):
        """
        Test case 1 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("Hello world!") == ["Hello", "world!"]
		
    def test_split_words_2(self):
        """
        Test case 2 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("Hello,world!") == ["Hello", "world!"]
		
    def test_split_words_3(self):
        """
        Test case 3 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdef") == 3
		
    def test_split_words_4(self):
        """
        Test case 4 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz") == 13
		
    def test_split_words_5(self):
        """
        Test case 5 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_6(self):
        """
        Test case 6 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_7(self):
        """
        Test case 7 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_8(self):
        """
        Test case 8 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_9(self):
        """
        Test case 9 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_10(self):
        """
        Test case 10 for :func:`scenario3.id_125.split_words`.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
# id_126.py

def is_palindrome(txt):
    '''
    Given a string, return True if it is a palindrome, False otherwise.
    A palindrome is a string that is the same forwards and backwards.
    Examples
    is_palindrome("abba") ➞ True
    is_palindrome("abcdefg") ➞ False
    is_palindrome("") ➞ True
    Notes
    An empty string is a valid palindrome.
    '''

    pass
# id_126_Test.java
from scenario3.id_126 import is_palindrome

import pytest

class id_126_Test:
    """
    Test class of id_126.py.
    It contains ten unit test cases for the :func:`scenario3.id_126.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abba") == True
		
    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefg") == False
		
    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("") == True
		
    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario3.id_126.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == False
		
# id_127.py

def is_prime(num):
    '''
    Create a function that returns True if a number is prime and False if it's not.
    A prime number is any positive integer that is divisible by only two divisors: 1 and itself.
    The first ten prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    Examples
    is_prime(31) ➞ True
    is_prime(18) ➞ False
    is_prime(11) ➞ True
    Notes
    A prime number has no other factors except 1 and itself.
    If a number is odd it is not divisible by 2.
    1 is not considered a prime number.
    '''

    pass
# id_127_Test.java
from scenario3.id_127 import is_prime

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`scenario3.id_127.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(31) == True
		
    def test_is_prime_2(self):
        """
        Test case 2 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(18) == False
		
    def test_is_prime_3(self):
        """
        Test case 3 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(11) == True
		
    def test_is_prime_4(self):
        """
        Test case 4 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(2) == True
		
    def test_is_prime_5(self):
        """
        Test case 5 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(3) == True
		
    def test_is_prime_6(self):
        """
        Test case 6 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(5) == True
		
    def test_is_prime_7(self):
        """
        Test case 7 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(7) == True
		
    def test_is_prime_8(self):
        """
        Test case 8 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(13) == True
		
    def test_is_prime_9(self):
        """
        Test case 9 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(17) == True
		
    def test_is_prime_10(self):
        """
        Test case 10 for :func:`scenario3.id_127.is_prime`.
        """
        assert is_prime(19) == True
		
# id_128.py

def is_even(num):
    '''
    Create a function that takes a number as an argument and returns "even" for even numbers and "odd" for odd numbers.
    Examples
    is_even(3) ➞ "odd"
    is_even(146) ➞ "even"
    is_even(19) ➞ "odd"
    Notes
    Dont forget to return the result.
    Input will always be a valid integer.
    Expect negative integers (whole numbers).
    Tests are case sensitive (return "even" or "odd" in lowercase).
    '''

    pass
# id_128_Test.java
from scenario3.id_128 import is_even

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`scenario3.id_128.is_even`.
    """
		
    def test_is_even_1(self):
        """
        Test case 1 for :func:`scenario3.id_128.is_even`.
        """
        assert is_even(3) == "odd"
		
    def test_is_even_2(self):
        """
        Test case 2 for :func:`scenario3.id_128.is_even`.
        """
        assert is_even(146) == "even"
		
    def test_is_even_3(self):
        """
        Test case 3 for :func:`scenario3.id_128.is_even`.
        """
        assert is_even(19) == "odd"
		
    def test_is_even_4(self):
        """
        Test case 4 for :func:`scenario3.id_128.is_even`.
        """
        assert is_even(2) == "even"
		
    def test_is_even_5(self):
        """
        Test case 5 for :func:`scenario3.id_128.is_even`.
        """
        assert is_even(4) == "even"
		
    def test_is_even_6(self):
        """
        Test case 6 for :func:`scenario3.id_128.is_even`.
        """
       