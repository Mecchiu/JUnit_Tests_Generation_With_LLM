# id_61_Test.java
from scenario2.id_61 import correct_bracketing

import pytest

class id_61_Test:
    """
    Test class of id_61.py.
    It contains ten unit test cases for the :func:`scenario2.id_61.correct_bracketing`.
    """


    def test_correct_bracketing_1(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("()") == True

    def test_correct_bracketing_2(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("(()())") == True

    def test_correct_bracketing_3(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("(()") == False

    def test_correct_bracketing_4(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("())") == False

    def test_correct_bracketing_5(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("(()()(()") == False

    def test_correct_bracketing_6(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("())()") == False

    def test_correct_bracketing_7(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("(())((()())())") == True

    def test_correct_bracketing_8(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("())(") == False

    def test_correct_bracketing_9(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("((()())(()(()())))()") == True

    def test_correct_bracketing_10(self):
        """
        Test case for the :func:`scenario2.id_61.correct_bracketing`.
        """
        assert correct_bracketing("((()())(()((()())))()") == False

# id_62.py


def is_prime(n: int):
    """
    return True if n is a prime number.
    """
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

# id_62_Test.java
from scenario2.id_62 import is_prime

import pytest

class id_62_Test:
    """
    Test class of id_62.py.
    It contains ten unit test cases for the :func:`scenario2.id_62.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario2.id_62.is_prime`.
        """
        assert is_prime(11) == True

# id_63.py


def is_palindrome(s: str):
    """
    return True if s is a palindrome.
    """
    return s == s[::-1]

# id_63_Test.java
from scenario2.id_63 import is_palindrome

import pytest

class id_63_Test:
    """
    Test class of id_63.py.
    It contains ten unit test cases for the :func:`scenario2.id_63.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("abab") == False

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("abcdefghhgfedcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario2.id_63.is_palindrome`.
        """
        assert is_palindrome("abcdefghihgfedcba") == True

# id_64.py


def is_anagram(s1: str, s2: str):
    """
    return True if s1 and s2 are anagrams.
    """
    return sorted(s1) == sorted(s2)

# id_64_Test.java
from scenario2.id_64 import is_anagram

import pytest

class id_64_Test:
    """
    Test class of id_64.py.
    It contains ten unit test cases for the :func:`scenario2.id_64.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("", "") == True

    def test_is_anagram_2(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("a", "a") == True

    def test_is_anagram_3(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("ab", "ab") == True

    def test_is_anagram_4(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("ab", "ba") == True

    def test_is_anagram_5(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("abc", "cba") == True

    def test_is_anagram_6(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("abcd", "dcba") == True

    def test_is_anagram_7(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("abcd", "abce") == False

    def test_is_anagram_8(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("anagram", "nagaram") == True

    def test_is_anagram_9(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("rat", "car") == False

    def test_is_anagram_10(self):
        """
        Test case for the :func:`scenario2.id_64.is_anagram`.
        """
        assert is_anagram("awesome", "awesom") == False

# id_65.py


def is_pangram(s: str):
    """
    return True if s is a pangram.
    """
    return set(s.lower()) >= set("abcdefghijklmnopqrstuvwxyz")

# id_65_Test.java
from scenario2.id_65 import is_pangram

import pytest

class id_65_Test:
    """
    Test class of id_65.py.
    It contains ten unit test cases for the :func:`scenario2.id_65.is_pangram`.
    """
		
    def test_is_pangram_1(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("") == False

    def test_is_pangram_2(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("a") == False

    def test_is_pangram_3(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abc") == False

    def test_is_pangram_4(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_5(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_6(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_7(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_8(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_9(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_10(self):
        """
        Test case for the :func:`scenario2.id_65.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz") == True

# id_66.py


def is_perfect_square(n: int):
    """
    return True if n is a perfect square.
    """
    if n < 0:
        return False
    if n == 0:
        return True
    for i in range(1, n):
        if i * i == n:
            return True
    return False

# id_66_Test.java
from scenario2.id_66 import is_perfect_square

import pytest

class id_66_Test:
