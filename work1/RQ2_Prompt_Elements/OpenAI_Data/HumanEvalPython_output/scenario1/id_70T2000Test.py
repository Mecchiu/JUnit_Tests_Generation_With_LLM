# id_70_Test.java
from scenario1.id_70 import strange_sort_list

import pytest

class id_70_Test:
    """
    Test class of id_70.py.
    It contains ten unit test cases for the :func:`scenario1.id_70.strange_sort_list`.
    """


    def test_strange_sort_list_1(self):
        """
        Test case 1 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5]) == [1, 5, 2, 4, 3]

    def test_strange_sort_list_2(self):
        """
        Test case 2 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6]) == [1, 6, 2, 5, 3, 4]

    def test_strange_sort_list_3(self):
        """
        Test case 3 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7]) == [1, 7, 2, 6, 3, 5, 4]

    def test_strange_sort_list_4(self):
        """
        Test case 4 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8]) == [1, 8, 2, 7, 3, 6, 4, 5]

    def test_strange_sort_list_5(self):
        """
        Test case 5 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 9, 2, 8, 3, 7, 4, 6, 5]

    def test_strange_sort_list_6(self):
        """
        Test case 6 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 10, 2, 9, 3, 8, 4, 7, 5, 6]

    def test_strange_sort_list_7(self):
        """
        Test case 7 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [1, 11, 2, 10, 3, 9, 4, 8, 5, 7, 6]

    def test_strange_sort_list_8(self):
        """
        Test case 8 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 12, 2, 11, 3, 10, 4, 9, 5, 8, 6, 7]

    def test_strange_sort_list_9(self):
        """
        Test case 9 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 13, 2, 12, 3, 11, 4, 10, 5, 9, 6, 8, 7]

    def test_strange_sort_list_10(self):
        """
        Test case 10 for :func:`scenario1.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == [1, 14, 2, 13, 3, 12, 4, 11, 5, 10, 6, 9, 7, 8]

# id_71.py

def is_palindrome(s):

    return s == s[::-1]

# id_71_Test.java
from scenario1.id_71 import is_palindrome

import pytest

class id_71_Test:
    """
    Test class of id_71.py.
    It contains ten unit test cases for the :func:`scenario1.id_71.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcba") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abccba") == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcde") == False

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdef") == False

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdefg") == False

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdefgh") == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdefghi") == False

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdefghij") == False

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdefghijk") == False

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario1.id_71.is_palindrome`.
        """
        assert is_palindrome("abcdefghijkl") == False

# id_72.py

def is_palindrome_list(lst):

    return lst == lst[::-1]

# id_72_Test.java
from scenario1.id_72 import is_palindrome_list

import pytest

class id_72_Test:
    """
    Test class of id_72.py.
    It contains ten unit test cases for the :func:`scenario1.id_72.is_palindrome_list`.
    """
		
    def test_is_palindrome_list_1(self):
        """
        Test case 1 for :func:`scenario1.id_72.is_palindrome_list`.
        """
        assert is_palindrome_list([1, 2, 3, 2, 1]) == True

    def test_is_palindrome_list_2(self):
        """
        Test case 2 for :func:`scenario1.id_72.is_palindrome_list`.
        """
        assert is_palindrome_list([1, 2, 3, 3, 2, 1]) == True

    def test_is_palindrome_list_3(self):
        """
        Test case 3 for :func:`scenario1.id_72.is_palindrome_list`.
        """
       