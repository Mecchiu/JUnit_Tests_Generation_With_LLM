# id_103_Test.java
from scenario3.id_103 import rounded_avg

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario3.id_103.rounded_avg`.
    """


    def test_rounded_avg_1(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 5) == "0b11"

    def test_rounded_avg_2(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(7, 5) == -1

    def test_rounded_avg_3(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(10, 20) == "0b1111"

    def test_rounded_avg_4(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(20, 33) == "0b11010"

    def test_rounded_avg_5(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 1) == "0b1"

    def test_rounded_avg_6(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 2) == "0b1"

    def test_rounded_avg_7(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 3) == "0b10"

    def test_rounded_avg_8(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 4) == "0b10"

    def test_rounded_avg_9(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 6) == "0b11"

    def test_rounded_avg_10(self):
        """
        Test case for the :func:`scenario3.id_103.rounded_avg`.
        """
        assert rounded_avg(1, 7) == "0b11"

# id_104.py

def is_palindrome(s):
    """You are given a string s.
    Return True if s is a palindrome, and False otherwise.
    Example:
    is_palindrome("racecar") => True
    is_palindrome("rabbit") => False
    """

    pass
# id_104_Test.java
from scenario3.id_104 import is_palindrome

import pytest

class id_104_Test:
    """
    Test class of id_104.py.
    It contains ten unit test cases for the :func:`scenario3.id_104.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("rabbit") == False

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("abcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario3.id_104.is_palindrome`.
        """
        assert is_palindrome("abccba") == True

# id_105.py

def is_anagram(s1, s2):
    """You are given two strings s1 and s2.
    Return True if s1 and s2 are anagrams, and False otherwise.
    Example:
    is_anagram("listen", "silent") => True
    is_anagram("listen", "silent") => True
    """

    pass
# id_105_Test.java
from scenario3.id_105 import is_anagram

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario3.id_105.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("listen", "silent") == True

    def test_is_anagram_2(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("listen", "silent") == True

    def test_is_anagram_3(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("", "") == True

    def test_is_anagram_4(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("a", "a") == True

    def test_is_anagram_5(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("a", "b") == False

    def test_is_anagram_6(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True

    def test_is_anagram_7(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ab") == True

    def test_is_anagram_8(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("ab", "ac") == False

    def test_is_anagram_9(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("abc", "bca") == True

    def test_is_anagram_10(self):
        """
        Test case for the :func:`scenario3.id_105.is_anagram`.
        """
        assert is_anagram("abc", "bac") == True

# id_106.py

def is_pangram(s):
    """You are given a string s.
    Return True if s is a pangram, and False otherwise.
    Example:
    is_pangram("The quick brown fox jumps over the lazy dog") => True
    is_pangram("The quick brown fox jumped over the lazy dog") => False
    """

    pass
# id_106_Test.java
from scenario3.id_106 import is_pangram

import pytest

class id_106_Test:
    """
    Test class of id_106.py.
    It contains ten unit test cases for the :func:`scenario3.id_106.is_pangram`.
    """
		
    def test_is_pangram_1(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("The quick brown fox jumps over the lazy dog") == True

    def test_is_pangram_2(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("The quick brown fox jumped over the lazy dog") == False

    def test_is_pangram_3(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("") == False

    def test_is_pangram_4(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("a") == False

    def test_is_pangram_5(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_6(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz ") == True

    def test_is_pangram_7(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz  ") == True

    def test_is_pangram_8(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz   ") == True

    def test_is_pangram_9(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz    ") == True

    def test_is_pangram_10(self):
        """
        Test case for the :func:`scenario3.id_106.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz     ") == True

# id_107.py

def is_perfect_square(n):
    """You are given a positive integer n.
    Return True if n is a perfect square, and False otherwise.
    Example:
    is_perfect_square(16) => True
    is_perfect_square(17) => False
    """

    pass
# id_107_Test.java
from scenario3.id_107 import is_perfect_square

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`scenario3.id_107.is_perfect_square`.
    """
		
    def test_is_perfect_square_1(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(16) == True

    def test_is_perfect_square_2(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(17) == False

    def test_is_perfect_square_3(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(1) == True

    def test_is_perfect_square_4(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(2) == False

    def test_is_perfect_square_5(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(3) == False

    def test_is_perfect_square_6(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(4) == True

    def test_is_perfect_square_7(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(5) == False

    def test_is_perfect_square_8(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(6) == False

    def test_is_perfect_square_9(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(7) == False

    def test_is_perfect_square_10(self):
        """
        Test case for the :func:`scenario3.id_107.is_perfect_square`.
        """
        assert is_perfect_square(8) == False

# id_108.py

def is_prime(n):
    """You are given a positive integer n.
    Return True if n is a prime, and False otherwise.
    Example:
    is_prime(2) => True
    is_prime(3) => True
    is_prime(4) => False
    """

    pass
# id_108_Test.java
from scenario3.id_108 import is_prime

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario3.id_108.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario3.id_108.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario3.id_108.is_prime`.
        """
        assert is_prime(3) == True

    def test_