# id_152_Test.java
from scenario2.id_152 import compare

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario2.id_152.compare`.
    """


    def test_compare_1(self):
        """
        Test case 1 of id_152.py.
        """
        assert compare([1,2,3],[1,2,3]) == [0,0,0]

    def test_compare_2(self):
        """
        Test case 2 of id_152.py.
        """
        assert compare([1,2,3],[2,2,3]) == [1,0,0]

    def test_compare_3(self):
        """
        Test case 3 of id_152.py.
        """
        assert compare([1,2,3],[3,2,1]) == [2,0,2]

    def test_compare_4(self):
        """
        Test case 4 of id_152.py.
        """
        assert compare([5,6,7],[3,6,10]) == [2,0,3]

    def test_compare_5(self):
        """
        Test case 5 of id_152.py.
        """
        assert compare([5,7,9],[5,7,9]) == [0,0,0]

    def test_compare_6(self):
        """
        Test case 6 of id_152.py.
        """
        assert compare([5,7,9],[6,7,10]) == [1,0,1]

    def test_compare_7(self):
        """
        Test case 7 of id_152.py.
        """
        assert compare([5,7,9],[9,7,5]) == [4,0,4]

    def test_compare_8(self):
        """
        Test case 8 of id_152.py.
        """
        assert compare([5,7,9],[3,7,10]) == [2,0,1]

    def test_compare_9(self):
        """
        Test case 9 of id_152.py.
        """
        assert compare([5,7,9],[5,7,9]) == [0,0,0]

    def test_compare_10(self):
        """
        Test case 10 of id_152.py.
        """
        assert compare([5,7,9],[6,7,10]) == [1,0,1]

# id_153.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    """
    s = s.lower()
    s = [x for x in s if x.isalnum()]
    return s == s[::-1]

# id_153_Test.java
from scenario2.id_153 import is_palindrome

import pytest

class id_153_Test:
    """
    Test class of id_153.py.
    It contains ten unit test cases for the :func:`scenario2.id_153.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 of id_153.py.
        """
        assert is_palindrome("A man, a plan, a canal: Panama") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 of id_153.py.
        """
        assert is_palindrome("race a car") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 of id_153.py.
        """
        assert is_palindrome("0P") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 of id_153.py.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 of id_153.py.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 of id_153.py.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 of id_153.py.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 of id_153.py.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 of id_153.py.
        """
        assert is_palindrome("abca") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 of id_153.py.
        """
        assert is_palindrome("abcba") == True

# id_154.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    """
    s = s.lower()
    s = [x for x in s if x.isalnum()]
    return s == s[::-1]

# id_154_Test.java
from scenario2.id_154 import is_palindrome

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`scenario2.id_154.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 of id_154.py.
        """
        assert is_palindrome("A man, a plan, a canal: Panama") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 of id_154.py.
        """
        assert is_palindrome("race a car") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 of id_154.py.
        """
        assert is_palindrome("0P") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 of id_154.py.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 of id_154.py.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 of id_154.py.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 of id_154.py.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 of id_154.py.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 of id_154.py.
        """
        assert is_palindrome("abca") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 of id_154.py.
        """
        assert is_palindrome("abcba") == True

# id_155.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    """
    s = s.lower()
    s = [x for x in s if x.isalnum()]
    return s == s[::-1]

# id_155_Test.java
from scenario2.id_155 import is_palindrome

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario2.id_155.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 of id_155.py.
        """
        assert is_palindrome("A man, a plan, a canal: Panama") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 of id_155.py.
        """
        assert is_palindrome("race a car") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 of id_155.py.
        """
        assert is_palindrome("0P") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 of id_155.py.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 of id_155.py.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 of id_155.py.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 of id_155.py.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 of id_155.py.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 of id_155.py.
        """
        assert is_palindrome("abca") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 of id_155.py.
        """
        assert is_palindrome("abcba") == True

# id_156.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    """
    s = s.lower()
    s = [x for x in s if x.isalnum()]
    return s == s[::-1]

# id_156_Test.java
from scenario2.id_156 import is_palindrome

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario2.id_156.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 of id_156.py.
        """
        assert is_palindrome("A man, a plan, a canal: Panama") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 of id_156.py.
        """
        assert is_palindrome("race a car") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 of id_156.py.
        """
        assert is_palindrome("0P") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 of id_156.py.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 of id_156.py.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 of id_156.py.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 of id_156.py.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 of id_156.py.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 of id_156.py.
        """
        assert is_palindrome("abca") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 of id_156.py.
        """
        assert is_palindrome("abcba") == True

# id_157.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    """
    s = s.lower()
    s = [x for x in s if x.isalnum()]
    return s == s[::-1]

# id_157_Test.java
from scenario2.id_157 import is_palindrome

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`scenario2.id_157.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 of id_157.py.
        """
        assert is_palindrome("A man, a plan, a canal: Panama") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 of id_157.py.
        """
        assert is_palindrome("race a car") == False

    def test_is_palindrome_3(self):
        """
        Test case 3 of id_157.py.
        """
        assert is_palindrome("0P") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 of id_157.py.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_5(self):
        """
        Test case 5 of id_157.py.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 of id_157.py.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 of id_157.py.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 of id_157.py.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 of id_157.py.
        """
        assert is_palindrome("abca") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 of id_157.py.
        """
        assert is_palindrome("abcba") == True

# id_158.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    """
    s = s.lower()
    s = [x for x in s if x.isalnum()]
    return s == s[::-1]

# id_158_Test.java
from scenario