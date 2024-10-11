# id_132_Test.java
from scenario2.id_132 import is_nested

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario2.id_132.is_nested`.
    """


    def test_is_nested_1(self):
        """
        Test case 1 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][]') == True

    def test_is_nested_2(self):
        """
        Test case 2 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][]') == True

    def test_is_nested_3(self):
        """
        Test case 3 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][]') == True

    def test_is_nested_4(self):
        """
        Test case 4 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][]') == True

    def test_is_nested_5(self):
        """
        Test case 5 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][]') == True

    def test_is_nested_6(self):
        """
        Test case 6 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][]') == True

    def test_is_nested_7(self):
        """
        Test case 7 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][]') == True

    def test_is_nested_8(self):
        """
        Test case 8 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][][]') == True

    def test_is_nested_9(self):
        """
        Test case 9 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][][][]') == True

    def test_is_nested_10(self):
        """
        Test case 10 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][][][][]') == True


# id_132_Test.py
from scenario2.id_132 import is_nested

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario2.id_132.is_nested`.
    """
		
    def test_is_nested_1(self):
        """
        Test case 1 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][]') == True

    def test_is_nested_2(self):
        """
        Test case 2 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][]') == True

    def test_is_nested_3(self):
        """
        Test case 3 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][]') == True

    def test_is_nested_4(self):
        """
        Test case 4 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][]') == True

    def test_is_nested_5(self):
        """
        Test case 5 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][]') == True

    def test_is_nested_6(self):
        """
        Test case 6 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][]') == True

    def test_is_nested_7(self):
        """
        Test case 7 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][]') == True

    def test_is_nested_8(self):
        """
        Test case 8 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][][]') == True

    def test_is_nested_9(self):
        """
        Test case 9 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][][][]') == True

    def test_is_nested_10(self):
        """
        Test case 10 for :func:`scenario2.id_132.is_nested`.
        """
        assert is_nested('[][][][][][][][][][][]') == True


# id_133.py

def is_nested(string):
    '''
    Create a function that takes a string as input which contains only square brackets.
    The function should return True if and only if there is a valid subsequence of brackets 
    where at least one bracket in the subsequence is nested.

    
    
    '''

    opening_bracket_index = []
    closing_bracket_index = []
    for i in range(len(string)):
        if string[i] == '[':
            opening_bracket_index.append(i)
        else:
            closing_bracket_index.append(i)
    closing_bracket_index.reverse()
    cnt = 0
    i = 0
    l = len(closing_bracket_index)
    for idx in opening_bracket_index:
        if i < l and idx < closing_bracket_index[i]:
            cnt += 1
            i += 1
    return cnt >= 2



# id_133_Test.java
from scenario2.id_133 import is_nested

import pytest

class id_133_Test:
    """
    Test class of id_133.py.
    It contains ten unit test cases for the :func:`scenario2.id_133.is_nested`.
    """
		
    def test_is_nested_1(self):
        """
        Test case 1 for :func:`scenario2.id_133.is_nested`.
        """
        assert is_nested('[][]') == True

    def test_is_nested_2(self):
        """
        Test case 2 for :func:`scenario2.id_133.is_nested`.
        """
        assert is_nested('[][][]') == True

    def test_is_nested_3(self):
        """
        Test case 3 for :func:`scenario2.id_133.is_nested`.
        """
        assert is_nested('[][][][]') == True

    def test_is_nested_4(self):
        """
        Test case 4 for :func:`scenario2.id_133.is_nested`.
        """
        assert is_nested('[][][][][]') == True

    def test_is_nested_5(self):
        """
        Test case 5 for :func:`scenario2.id_133.is_nested`.
        """
        assert is_nested('[][][][][][]') == True

    def test_is_nested_6(self):
        """
        Test case 6 for :func:`scenario2.id_133.is_nested`.
        """
        assert is_nested('[][][][][][][]') == True

    def test_