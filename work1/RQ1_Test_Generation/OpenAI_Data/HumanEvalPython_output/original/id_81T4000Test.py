# id_81_Test.java
from original.id_81 import numerical_letter_grade

import pytest

class id_81_Test:
    """
    Test class of id_81.py.
    It contains ten unit test cases for the :func:`original.id_81.numerical_letter_grade`.
    """


    def test_numerical_letter_grade_1(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5]) == ['A+', 'B', 'C-', 'C', 'A-']

    def test_numerical_letter_grade_2(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-']

    def test_numerical_letter_grade_3(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-']

    def test_numerical_letter_grade_4(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E']

    def test_numerical_letter_grade_5(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E']

    def test_numerical_letter_grade_6(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E']

    def test_numerical_letter_grade_7(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E']

    def test_numerical_letter_grade_8(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E', 'E']

    def test_numerical_letter_grade_9(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E', 'E', 'E']

    def test_numerical_letter_grade_10(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E', 'E', 'E', 'E']


# id_82.py

def is_prime(n):
    """
    Write a function that takes a number n and returns True if n is a prime number,
    otherwise it returns False.
    A prime number is a number that is only divisible by 1 and itself.
    For example, the first five prime numbers are 2, 3, 5, 7, and 11.

    Example:
    is_prime(7) ==> True
    is_prime(10) ==> False
    """

    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


# id_82_Test.java
from original.id_82 import is_prime

import pytest

class id_82_Test:
    """
    Test class of id_82.py.
    It contains ten unit test cases for the :func:`original.id_82.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_2(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_3(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_4(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(12) == False

    def test_is_prime_5(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(13) == True

    def test_is_prime_6(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(14) == False

    def test_is_prime_7(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(15) == False

    def test_is_prime_8(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(16) == False

    def test_is_prime_9(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(17) == True

    def test_is_prime_10(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(18) == False


# id_83.py

def is_palindrome(s):
    """
    Write a function that takes a string s and returns True if s is a palindrome,
    otherwise it returns False.
    A palindrome is a string that is spelled the same both forwards and backwards,
    like "racecar" and "tacocat".

    Example:
    is_palindrome("racecar") ==> True
    is_palindrome("tacocat") ==> True
    is_palindrome("cat") ==> False
    """

    return s == s[::-1]


# id_83_Test.java
from original.id_83 import is_palindrome

import pytest

class id_83_Test:
    """
    Test class of id_83.py.
    It contains ten unit test cases for the :func:`original.id_83.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("tacocat") == True

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("cat") == False

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("tacocat") == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("cat") == False

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("racecar") == True

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("tacocat") == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("cat") == False

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`original.id_83.is_palindrome`.
        """
        assert is_palindrome("racecar") == True


# id_84.py

def is_anagram(s1, s2):
    """
    Write a function that takes two strings s1 and s2 and returns True if they are anagrams,
    otherwise it returns False.
    Two strings are anagrams if they are made up of exactly the same letters,
    ignoring space, punctuation and capitalization.
    For example, "Public relations" and "crap built on lies." are anagrams.

    Example:
    is_anagram("Public relations", "crap built on lies.") ==> True
    is_anagram("clint eastwood", "old west action") ==> True
    is_anagram("hello", "goodbye") ==> False
    """

    return sorted(s1.replace(" ", "").lower()) == sorted(s2.replace(" ", "").lower())


# id_84_Test.java
from original.id_84 import is_anagram

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains ten unit test cases for the :func:`original.id_84.is_anagram`.
    """
		
    def test_is_anagram_1(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("Public relations", "crap built on lies.") == True

    def test_is_anagram_2(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("clint eastwood", "old west action") == True

    def test_is_anagram_3(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("hello", "goodbye") == False

    def test_is_anagram_4(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("Public relations", "crap built on lies.") == True

    def test_is_anagram_5(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("clint eastwood", "old west action") == True

    def test_is_anagram_6(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("hello", "goodbye") == False

    def test_is_anagram_7(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("Public relations", "crap built on lies.") == True

    def test_is_anagram_8(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("clint eastwood", "old west action") == True

    def test_is_anagram_9(self):
        """
        Test case for the :func:`original.id_84.is_anagram`.
        """
        assert is_anagram("hello", "goodbye") == False

    def test_is_anagram_10(self):
        """
        Test case for the :func:`original.