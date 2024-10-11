# id_152_Test.java
from scenario3.id_152 import compare

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario3.id_152.compare`.
    """


    def test_compare_1(self):
        """
        Test case 1 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,1],[1,2,3,4,2,-2]) == [0,0,0,0,3,3]

    def test_compare_2(self):
        """
        Test case 2 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,5,0,0,0,4],[4,1,1,0,0,-2]) == [4,4,1,0,0,6]

    def test_compare_3(self):
        """
        Test case 3 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_4(self):
        """
        Test case 4 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[1,1,1,1,1,1]) == [1,1,1,1,1,1]

    def test_compare_5(self):
        """
        Test case 5 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,1,1,1,1,1],[0,0,0,0,0,0]) == [1,1,1,1,1,1]

    def test_compare_6(self):
        """
        Test case 6 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,1,1,1,1,1],[1,1,1,1,1,1]) == [0,0,0,0,0,0]

    def test_compare_7(self):
        """
        Test case 7 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,1,1,1,1,1],[2,2,2,2,2,2]) == [1,1,1,1,1,1]

    def test_compare_8(self):
        """
        Test case 8 for :func:`scenario3.id_152.compare`.
        """
        assert compare([2,2,2,2,2,2],[1,1,1,1,1,1]) == [1,1,1,1,1,1]

    def test_compare_9(self):
        """
        Test case 9 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,6],[1,2,3,4,5,6]) == [0,0,0,0,0,0]

    def test_compare_10(self):
        """
        Test case 10 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,6],[6,5,4,3,2,1]) == [5,3,1,1,3,5]

# id_152_Test.py
from scenario3.id_152 import compare

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario3.id_152.compare`.
    """
		
    def test_compare_1(self):
        """
        Test case 1 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,1],[1,2,3,4,2,-2]) == [0,0,0,0,3,3]

    def test_compare_2(self):
        """
        Test case 2 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,5,0,0,0,4],[4,1,1,0,0,-2]) == [4,4,1,0,0,6]

    def test_compare_3(self):
        """
        Test case 3 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_4(self):
        """
        Test case 4 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[1,1,1,1,1,1]) == [1,1,1,1,1,1]

    def test_compare_5(self):
        """
        Test case 5 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,1,1,1,1,1],[0,0,0,0,0,0]) == [1,1,1,1,1,1]

    def test_compare_6(self):
        """
        Test case 6 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,1,1,1,1,1],[1,1,1,1,1,1]) == [0,0,0,0,0,0]

    def test_compare_7(self):
        """
        Test case 7 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,1,1,1,1,1],[2,2,2,2,2,2]) == [1,1,1,1,1,1]

    def test_compare_8(self):
        """
        Test case 8 for :func:`scenario3.id_152.compare`.
        """
        assert compare([2,2,2,2,2,2],[1,1,1,1,1,1]) == [1,1,1,1,1,1]

    def test_compare_9(self):
        """
        Test case 9 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,6],[1,2,3,4,5,6]) == [0,0,0,0,0,0]

    def test_compare_10(self):
        """
        Test case 10 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,6],[6,5,4,3,2,1]) == [5,3,1,1,3,5]

# id_153.py

def is_palindrome(s):
    """
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
    Note: For the purpose of this problem, we define empty string as valid palindrome.
    
    example:

    is_palindrome("A man, a plan, a canal: Panama") -> True
    is_palindrome("race a car") -> False
    """

    pass

# id_153_Test.java
from scenario3.id_153 import is_palindrome

import pytest

class id_153_Test:
    """
    Test class of id_153.py.
    It contains ten unit test cases for the :func:`scenario3.id_153.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario3.id_153.is_palindrome`.
        """
        assert is_palindrome("A man, a plan, a canal: Panama") == True

    def test_is_palindrome_2(