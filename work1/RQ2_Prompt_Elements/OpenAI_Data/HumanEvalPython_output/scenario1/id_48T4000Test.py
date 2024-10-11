# id_48_Test.java
from scenario1.id_48 import is_palindrome

import pytest

class id_48_Test:
    """
    Test class of id_48.py.
    It contains ten unit test cases for the :func:`scenario1.id_48.is_palindrome`.
    """


    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("abab") == False

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("abcdcba") == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("abcdefghhgfedcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_48.is_palindrome`.
        """
        assert is_palindrome("abcdefghihgfedcba") == True

# id_49.py


def is_pangram(text: str):

    alphabet = "abcdefghijklmnopqrstuvwxyz"
    for i in range(len(alphabet)):
        if alphabet[i] not in text.lower():
            return False
    return True

# id_49_Test.java
from scenario1.id_49 import is_pangram

import pytest

class id_49_Test:
    """
    Test class of id_49.py.
    It contains ten unit test cases for the :func:`scenario1.id_49.is_pangram`.
    """
		
    def test_is_pangram_1(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("") == False

    def test_is_pangram_2(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("a") == False

    def test_is_pangram_3(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_4(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz.") == True

    def test_is_pangram_5(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz. ") == True

    def test_is_pangram_6(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_7(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz.") == True

    def test_is_pangram_8(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz. ") == True

    def test_is_pangram_9(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz") == True

    def test_is_pangram_10(self):
        """
        Test case for the :func:`scenario1.id_49.is_pangram`.
        """
        assert is_pangram("abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz. abcdefghijklmnopqrstuvwxyz.") == True

# id_50.py


def is_perfect_number(number: int):

    if number <= 0:
        return False
    sum = 0
    for i in range(1, number):
        if number % i == 0:
            sum += i
    return sum == number

# id_50_Test.java
from scenario1.id_50 import is_perfect_number

import pytest

class id_50_Test:
    """
    Test class of id_50.py.
    It contains ten unit test cases for the :func:`scenario1.id_50.is_perfect_number`.
    """
		
    def test_is_perfect_number_1(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(0) == False

    def test_is_perfect_number_2(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(1) == False

    def test_is_perfect_number_3(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(2) == False

    def test_is_perfect_number_4(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(3) == False

    def test_is_perfect_number_5(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(4) == False

    def test_is_perfect_number_6(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(5) == False

    def test_is_perfect_number_7(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(6) == True

    def test_is_perfect_number_8(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(7) == False

    def test_is_perfect_number_9(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(8) == False

    def test_is_perfect_number_10(self):
        """
        Test case for the :func:`scenario1.id_50.is_perfect_number`.
        """
        assert is_perfect_number(9) == False

# id_51.py


def is_prime(number: int):

    if number <= 1:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
    return True

# id_51_Test.java
from scenario1.id_51 import is_prime

import pytest

class id_51_Test:
    """
    Test class of id_51.py.
    It contains ten unit test cases for the :func:`scenario1.id_51.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario1.id_51.is_prime`.
        """
        assert is_prime(9) == False

# id_52.py


def is_vowel(character: str):

    if len(character) != 1:
        return False
    if character.lower() in "aeiou":
        return True
    return False

# id_52_Test.java
from scenario1.id_52 import is_vowel

import pytest

class id_52_Test:
    """
    Test class of id_52.py.
    It contains ten unit test cases for the :func:`scenario1.id_52.is_vowel`.
    """
		
    def test_is_vowel_1(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("") == False

    def test_is_vowel_2(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("a") == True

    def test_is_vowel_3(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("e") == True

    def test_is_vowel_4(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("i") == True

    def test_is_vowel_5(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("o") == True

    def test_is_vowel_6(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("u") == True

    def test_is_vowel_7(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("A") == True

    def test_is_vowel_8(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("E") == True

    def test_is_vowel_9(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("I") == True

    def test_is_vowel_10(self):
        """
        Test case for the :func:`scenario1.id_52.is_vowel`.
        """
        assert is_vowel("O") == True

# id_53.py


def is_vowel_2(character: str):

    if len(character) != 1:
        return False
    if character.lower() in "aeiou":
        return True
    return False

# id_53_Test.java
from scenario1.id_53 import is_vowel_2

import pytest

class id_53_Test:
    """
    Test class of id_53.py.
    It contains ten unit test cases for the :func:`scenario1.id_53.is_vowel_2`.
    """
		
    def test_is_vowel_2_1(self):
        """
        Test case for the :func:`scenario1.id_53.is_vowel_2`.
        """
        assert is_vowel_2("") == False

    def test_is_vowel_2_2(self):
        """
        Test case for the :func:`scenario1.id_53.is_vowel_2`.
        """
        assert is_vowel_2("a") == True

    def test_is_vowel_2_3(self):
        """
        Test case for the :func:`scenario1.id_53.is_vowel_2`.
        """
        assert is