# id_39_Test.java
from scenario1.id_39 import prime_fib

import pytest

class id_39_Test:
    """
    Test class of id_39.py.
    It contains ten unit test cases for the :func:`scenario1.id_39.prime_fib`.
    """


    def test_prime_fib_1(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(1) == 2
		
    def test_prime_fib_2(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(2) == 3
		
    def test_prime_fib_3(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(3) == 5
		
    def test_prime_fib_4(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(4) == 13
		
    def test_prime_fib_5(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(5) == 89
		
    def test_prime_fib_6(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(6) == 233
		
    def test_prime_fib_7(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(7) == 1597
		
    def test_prime_fib_8(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(8) == 28657
		
    def test_prime_fib_9(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(9) == 514229
		
    def test_prime_fib_10(self):
        """
        Test case for the :func:`scenario1.id_39.prime_fib`.
        """
        assert prime_fib(10) == 433494437
		
		
# id_40.py


def is_palindrome(s: str):

    return s == s[::-1]

# id_40_Test.java
from scenario1.id_40 import is_palindrome

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`scenario1.id_40.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("a") == True
		
    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("aa") == True
		
    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("ab") == False
		
    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("aba") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abba") == True
		
    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abcba") == True
		
    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abccba") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz") == False
		
    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_40.is_palindrome`.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba") == True
		
		
# id_41.py


def is_pangram(s: str):

    return len(set(s.lower())) == 26

# id_41_Test.java
from scenario1.id_41 import is_pangram

import pytest

class id_41_Test:
    """
    Test class of id_41.py.
    It contains ten unit test cases for the :func:`scenario1.id_41.is_pangram`.
    """
		
    def test_is_pangram_1(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("") == False
		
    def test_is_pangram_2(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("a") == False
		
    def test_is_pangram_3(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_4(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_5(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_6(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_7(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_8(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_9(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
    def test_is_pangram_10(self):
        """
        Test case for the :func:`scenario1.id_41.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True
		
		
# id_42.py


def is_anagram(s1: str, s2: str):

    return sorted(s1.lower()) == sorted(s2.lower())

# id_42_Test.java
from scenario1.id_42 import is_anagram

import pytest

class id_42_Test:
    """
    Test class of id_42.py.
    It contains ten unit test cases for the :func:`scenario1.id_42.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("", "") == True
		
    def test_is_anagram_2(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("a", "a") == True
		
    def test_is_anagram_3(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("ab", "ab") == True
		
    def test_is_anagram_4(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True
		
    def test_is_anagram_5(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("abc", "abc") == True
		
    def test_is_anagram_6(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("abc", "acb") == True
		
    def test_is_anagram_7(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("abc", "bac") == True
		
    def test_is_anagram_8(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("abc", "bca") == True
		
    def test_is_anagram_9(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("abc", "cab") == True
		
    def test_is_anagram_10(self):
        """
        Test case for the :func:`scenario1.id_42.is_anagram`.
        """
        assert is_anagram("abc", "cba") == True
		
		
# id_43.py


def is_anagram_of_palindrome(s: str):

    return sum(s.lower().count(c) % 2 for c in set(s.lower())) <= 1

# id_43_Test.java
from scenario1.id_43 import is_anagram_of_palindrome

import pytest

class id_43_Test:
    """
    Test class of id_43.py.
    It contains ten unit test cases for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
    """
		
    def test_is_anagram_of_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram_of_palindrome("") == True
		
    def test_is_anagram_of_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram_of_palindrome("a") == True
		
    def test_is_anagram_of_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram_of_palindrome("ab") == False
		
    def test_is_anagram_of_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram_of_palindrome("aba") == True
		
    def test_is_anagram_of_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram_of_palindrome("abba") == True
		
    def test_is_anagram_of_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram_of_palindrome("abcd") == False
		
    def test_is_anagram_of_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_43.is_anagram_of_palindrome`.
        """
        assert is_anagram