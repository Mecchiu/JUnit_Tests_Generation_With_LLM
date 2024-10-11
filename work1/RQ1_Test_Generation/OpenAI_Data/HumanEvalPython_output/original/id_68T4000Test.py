# id_68_Test.java
from original.id_68 import pluck

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`original.id_68.pluck`.
    """


    def test_pluck_1(self):
        """
        Test case 1 for :func:`original.id_68.pluck`.
        """
        assert pluck([4,2,3]) == [2, 1]

    def test_pluck_2(self):
        """
        Test case 2 for :func:`original.id_68.pluck`.
        """
        assert pluck([1,2,3]) == [2, 1]

    def test_pluck_3(self):
        """
        Test case 3 for :func:`original.id_68.pluck`.
        """
        assert pluck([]) == []

    def test_pluck_4(self):
        """
        Test case 4 for :func:`original.id_68.pluck`.
        """
        assert pluck([5, 0, 3, 0, 4, 2]) == [0, 1]

    def test_pluck_5(self):
        """
        Test case 5 for :func:`original.id_68.pluck`.
        """
        assert pluck([0, 0, 0, 0, 0, 0]) == [0, 0]

    def test_pluck_6(self):
        """
        Test case 6 for :func:`original.id_68.pluck`.
        """
        assert pluck([1, 1, 1, 1, 1, 1]) == []

    def test_pluck_7(self):
        """
        Test case 7 for :func:`original.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6]) == [2, 1]

    def test_pluck_8(self):
        """
        Test case 8 for :func:`original.id_68.pluck`.
        """
        assert pluck([2, 4, 6, 8, 10, 12]) == [2, 0]

    def test_pluck_9(self):
        """
        Test case 9 for :func:`original.id_68.pluck`.
        """
        assert pluck([2, 4, 6, 8, 10, 12, 14, 16, 18, 20]) == [2, 0]

    def test_pluck_10(self):
        """
        Test case 10 for :func:`original.id_68.pluck`.
        """
        assert pluck([2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]) == [2, 0]

# id_68_Test.py
from original.id_68 import pluck

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`original.id_68.pluck`.
    """
		
    def test_pluck_1(self):
        """
        Test case 1 for :func:`original.id_68.pluck`.
        """
        assert pluck([4,2,3]) == [2, 1]

    def test_pluck_2(self):
        """
        Test case 2 for :func:`original.id_68.pluck`.
        """
        assert pluck([1,2,3]) == [2, 1]

    def test_pluck_3(self):
        """
        Test case 3 for :func:`original.id_68.pluck`.
        """
        assert pluck([]) == []

    def test_pluck_4(self):
        """
        Test case 4 for :func:`original.id_68.pluck`.
        """
        assert pluck([5, 0, 3, 0, 4, 2]) == [0, 1]

    def test_pluck_5(self):
        """
        Test case 5 for :func:`original.id_68.pluck`.
        """
        assert pluck([0, 0, 0, 0, 0, 0]) == [0, 0]

    def test_pluck_6(self):
        """
        Test case 6 for :func:`original.id_68.pluck`.
        """
        assert pluck([1, 1, 1, 1, 1, 1]) == []

    def test_pluck_7(self):
        """
        Test case 7 for :func:`original.id_68.pluck`.
        """
        assert pluck([1, 2, 3, 4, 5, 6]) == [2, 1]

    def test_pluck_8(self):
        """
        Test case 8 for :func:`original.id_68.pluck`.
        """
        assert pluck([2, 4, 6, 8, 10, 12]) == [2, 0]

    def test_pluck_9(self):
        """
        Test case 9 for :func:`original.id_68.pluck`.
        """
        assert pluck([2, 4, 6, 8, 10, 12, 14, 16, 18, 20]) == [2, 0]

    def test_pluck_10(self):
        """
        Test case 10 for :func:`original.id_68.pluck`.
        """
        assert pluck([2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]) == [2, 0]

# id_69.py

def is_valid_braces(string):
    """
    "Given a string of braces, determine if the order of the braces is valid.
    It should return true if the string is valid, and false if it's invalid.

    This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.
    Thanks to @arnedag for the idea!

    All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

    What is considered Valid?
    A string of braces is considered valid if all braces are matched with the correct brace.

    Examples:
        "(){}[]"   =>  True
        "([{}])"   =>  True
        "(}"       =>  False
        "[(])"     =>  False
        "[({})](]" =>  False
    """

    stack = []
    for char in string:
        if(char == '(' or char == '[' or char == '{'):
            stack.append(char)
        elif(char == ')'):
            if(len(stack) == 0 or stack.pop() != '('): return False
        elif(char == ']'):
            if(len(stack) == 0 or stack.pop() != '['): return False
        elif(char == '}'):
            if(len(stack) == 0 or stack.pop() != '{'): return False
    return len(stack) == 0

# id_69_Test.java
from original.id_69 import is_valid_braces

import pytest

class id_69_Test:
    """
    Test class of id_69.py.
    It contains ten unit test cases for the :func:`original.id_69.is_valid_braces`.
    """
		
    def test_is_valid_braces_1(self):
        """
        Test case 1 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("(){}[]") == True

    def test_is_valid_braces_2(self):
        """
        Test case 2 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("([{}])") == True

    def test_is_valid_braces_3(self):
        """
        Test case 3 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("(}") == False

    def test_is_valid_braces_4(self):
        """
        Test case 4 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[(])") == False

    def test_is_valid_braces_5(self):
        """
        Test case 5 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](]") == False

    def test_is_valid_braces_6(self):
        """
        Test case 6 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})]") == True

    def test_is_valid_braces_7(self):
        """
        Test case 7 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](") == False

    def test_is_valid_braces_8(self):
        """
        Test case 8 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](]") == False

    def test_is_valid_braces_9(self):
        """
        Test case 9 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](])") == False

    def test_is_valid_braces_10(self):
        """
        Test case 10 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](])[") == False

# id_69_Test.py
from original.id_69 import is_valid_braces

import pytest

class id_69_Test:
    """
    Test class of id_69.py.
    It contains ten unit test cases for the :func:`original.id_69.is_valid_braces`.
    """
		
    def test_is_valid_braces_1(self):
        """
        Test case 1 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("(){}[]") == True

    def test_is_valid_braces_2(self):
        """
        Test case 2 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("([{}])") == True

    def test_is_valid_braces_3(self):
        """
        Test case 3 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("(}") == False

    def test_is_valid_braces_4(self):
        """
        Test case 4 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[(])") == False

    def test_is_valid_braces_5(self):
        """
        Test case 5 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](]") == False

    def test_is_valid_braces_6(self):
        """
        Test case 6 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})]") == True

    def test_is_valid_braces_7(self):
        """
        Test case 7 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](") == False

    def test_is_valid_braces_8(self):
        """
        Test case 8 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](]") == False

    def test_is_valid_braces_9(self):
        """
        Test case 9 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](])") == False

    def test_is_valid_braces_10(self):
        """
        Test case 10 for :func:`original.id_69.is_valid_braces`.
        """
        assert is_valid_braces("[({})](])[") == False

# id_70.py

def is_valid_braces(string):
    """
    "Given a string of braces, determine if the order of the braces is valid.
    It should return true if the string is valid, and false if it's invalid.

    This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.
    Thanks to @arnedag for the idea!

    All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

    What is considered Valid?
    A string of braces is considered valid if all braces are matched with the correct brace.

    Examples:
        "(){}[]"   =>  True
        "([{}])"   =>  True
        "(}"       =>  False
        "[(])"     =>  False
        "[({})](]" =>  False
    """

    stack = []
    for char in string:
        if(char == '(' or char == '[' or char == '{'):
            stack.append(char)
        elif(char == ')'):
            if(len(stack) == 0 or stack.pop() != '('): return False
        elif(char == ']'):
            if(len(stack) == 0 or stack.pop() != '['): return False
        elif(char == '}'):
            if(len(stack) == 0 or stack.pop() != '{'): return False
    return len(stack) == 0

# id_70_Test.java
from original.id_70 import is_valid_braces

import pytest

class id_70_Test:
    """
    Test class of id_70.py.
    It contains ten unit test cases for the :func:`original.id_70.is_valid_braces`.
    """
		
    def test_is_valid_braces_1(self):
        """
        Test case 1 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("(){}[]") == True

    def test_is_valid_braces_2(self):
        """
        Test case 2 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("([{}])") == True

    def test_is_valid_braces_3(self):
        """
        Test case 3 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("(}") == False

    def test_is_valid_braces_4(self):
        """
        Test case 4 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("[(])") == False

    def test_is_valid_braces_5(self):
        """
        Test case 5 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("[({})](]") == False

    def test_is_valid_braces_6(self):
        """
        Test case 6 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("[({})]") == True

    def test_is_valid_braces_7(self):
        """
        Test case 7 for :func:`original.id_70.is_valid_braces`.
        """
        assert is_valid_braces("[({})](") == False

    def test_is_valid_braces_8(self):
        """
        Test case 8 for :func:`original.id_70.is_valid_braces