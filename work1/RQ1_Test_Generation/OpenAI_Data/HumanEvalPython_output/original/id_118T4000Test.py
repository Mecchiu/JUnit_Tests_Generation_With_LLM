# id_118_Test.java
from original.id_118 import get_closest_vowel

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`original.id_118.get_closest_vowel`.
    """


    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("yogurt") == "u"

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("FULL") == "U"

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("quick") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("b") == ""

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("c") == ""

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("d") == ""

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("e") == ""

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("f") == ""

# id_118_Test.py
from original.id_118 import get_closest_vowel

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`original.id_118.get_closest_vowel`.
    """
		
    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("yogurt") == "u"

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("FULL") == "U"

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("quick") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("b") == ""

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("c") == ""

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("d") == ""

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("e") == ""

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`original.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("f") == ""

# id_119.py

def get_closest_vowel(word):
    """You are given a word. Your task is to find the closest vowel that stands between 
    two consonants from the right side of the word (case sensitive).
    
    Vowels in the beginning and ending doesn't count. Return empty string if you didn't
    find any vowel met the above condition. 

    You may assume that the given string contains English letter only.

    Example:
    get_closest_vowel("yogurt") ==> "u"
    get_closest_vowel("FULL") ==> "U"
    get_closest_vowel("quick") ==> ""
    get_closest_vowel("ab") ==> ""
    """

    if len(word) < 3:
        return ""

    vowels = {"a", "e", "i", "o", "u", "A", "E", 'O', 'U', 'I'}
    for i in range(len(word)-2, 0, -1):
        if word[i] in vowels:
            if (word[i+1] not in vowels) and (word[i-1] not in vowels):
                return word[i]
    return ""

# id_119_Test.java
from original.id_119 import get_closest_vowel

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`original.id_119.get_closest_vowel`.
    """
		
    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("yogurt") == "u"

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("FULL") == "U"

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("quick") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("b") == ""

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("c") == ""

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("d") == ""

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("e") == ""

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("f") == ""

# id_119_Test.py
from original.id_119 import get_closest_vowel

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`original.id_119.get_closest_vowel`.
    """
		
    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("yogurt") == "u"

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("FULL") == "U"

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("quick") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("b") == ""

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("c") == ""

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("d") == ""

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("e") == ""

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`original.id_119.get_closest_vowel`.
        """
        assert get_closest_vowel("f") == ""

# id_120.py

def get_closest_vowel(word):
    """You are given a word. Your task is to find the closest vowel that stands between 
    two consonants from the right side of the word (case sensitive).
    
    Vowels in the beginning and ending doesn't count. Return empty string if you didn't
    find any vowel met the above condition. 

    You may assume that the given string contains English letter only.

    Example:
    get_closest_vowel("yogurt") ==> "u"
    get_closest_vowel("FULL") ==> "U"
    get_closest_vowel("quick") ==> ""
    get_closest_vowel("ab") ==> ""
    """

    if len(word) < 3:
        return ""

    vowels = {"a", "e", "i", "o", "u", "A", "E", 'O', 'U', 'I'}
    for i in range(len(word)-2, 0, -1):
        if word[i] in vowels:
            if (word[i+1] not in vowels) and (word[i-1] not in vowels):
                return word[i]
    return ""

# id_120_Test.java
from original.id_120 import get_closest_vowel

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`original.id_120.get_closest_vowel`.
    """
		
    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`original.id_120.get_closest_vowel`.
        """
        assert get_closest_vowel("yogurt") == "u"

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`original.id_120.get_closest_vowel`.
        """
        assert get_closest_vowel("FULL") == "U"

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`original.id_120.get_closest_vowel`.
        """
        assert get_closest_vowel("quick") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`original.id_120.get_closest_vowel`.
        """
        assert get_closest_v