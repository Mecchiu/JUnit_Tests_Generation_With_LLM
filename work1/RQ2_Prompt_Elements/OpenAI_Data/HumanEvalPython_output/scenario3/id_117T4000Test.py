# id_117_Test.java
from scenario3.id_117 import select_words

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`scenario3.id_117.select_words`.
    """


    def test_select_words_1(self):
        """
        Test case 1 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 4) == ["little"]

    def test_select_words_2(self):
        """
        Test case 2 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 3) == ["Mary", "lamb"]

    def test_select_words_3(self):
        """
        Test case 3 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("simple white space", 2) == []

    def test_select_words_4(self):
        """
        Test case 4 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("Hello world", 4) == ["world"]

    def test_select_words_5(self):
        """
        Test case 5 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("Uncle sam", 3) == ["Uncle"]

    def test_select_words_6(self):
        """
        Test case 6 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("", 3) == []

    def test_select_words_7(self):
        """
        Test case 7 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("", 0) == []

    def test_select_words_8(self):
        """
        Test case 8 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("a", 0) == ["a"]

    def test_select_words_9(self):
        """
        Test case 9 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("a", 1) == []

    def test_select_words_10(self):
        """
        Test case 10 for :func:`scenario3.id_117.select_words`.
        """
        assert select_words("a b", 1) == ["b"]

# id_118.py

def is_valid_triangle(a, b, c):
    """Given three natural numbers a, b and c, you have been tasked to implement 
    a function that returns True if the three numbers can form a triangle, 
    and False otherwise.
    Examples:
    is_valid_triangle(3, 4, 5) ==> True
    is_valid_triangle(3, 4, 6) ==> False
    is_valid_triangle(3, 4, 7) ==> False
    is_valid_triangle(3, 4, 8) ==> False
    is_valid_triangle(3, 4, 9) ==> False
    """

    pass
# id_118_Test.java
from scenario3.id_118 import is_valid_triangle

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`scenario3.id_118.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 5) == True

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 6) == False

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 7) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 8) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 9) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 1, 1) == True

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 3) == False

    def test_is_valid_triangle_8(self):
        """
        Test case 8 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 2) == True

    def test_is_valid_triangle_9(self):
        """
        Test case 9 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 2, 2) == True

    def test_is_valid_triangle_10(self):
        """
        Test case 10 for :func:`scenario3.id_118.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 2, 3) == True

# id_119.py

def is_valid_triangle(a, b, c):
    """Given three natural numbers a, b and c, you have been tasked to implement 
    a function that returns True if the three numbers can form a triangle, 
    and False otherwise.
    Examples:
    is_valid_triangle(3, 4, 5) ==> True
    is_valid_triangle(3, 4, 6) ==> False
    is_valid_triangle(3, 4, 7) ==> False
    is_valid_triangle(3, 4, 8) ==> False
    is_valid_triangle(3, 4, 9) ==> False
    """

    pass
# id_119_Test.java
from scenario3.id_119 import is_valid_triangle

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`scenario3.id_119.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 5) == True

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 6) == False

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 7) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 8) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 9) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 1, 1) == True

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 3) == False

    def test_is_valid_triangle_8(self):
        """
        Test case 8 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 2) == True

    def test_is_valid_triangle_9(self):
        """
        Test case 9 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 2, 2) == True

    def test_is_valid_triangle_10(self):
        """
        Test case 10 for :func:`scenario3.id_119.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 2, 3) == True

# id_120.py

def is_valid_triangle(a, b, c):
    """Given three natural numbers a, b and c, you have been tasked to implement 
    a function that returns True if the three numbers can form a triangle, 
    and False otherwise.
    Examples:
    is_valid_triangle(3, 4, 5) ==> True
    is_valid_triangle(3, 4, 6) ==> False
    is_valid_triangle(3, 4, 7) ==> False
    is_valid_triangle(3, 4, 8) ==> False
    is_valid_triangle(3, 4, 9) ==> False
    """

    pass
# id_120_Test.java
from scenario3.id_120 import is_valid_triangle

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`scenario3.id_120.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 5) == True

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 6) == False

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 7) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 8) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 9) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 1, 1) == True

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 3) == False

    def test_is_valid_triangle_8(self):
        """
        Test case 8 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 2) == True

    def test_is_valid_triangle_9(self):
        """
        Test case 9 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 2, 2) == True

    def test_is_valid_triangle_10(self):
        """
        Test case 10 for :func:`scenario3.id_120.is_valid_triangle`.
        """
        assert is_valid_triangle(2, 2, 3) == True

# id_121.py

def is_valid_triangle(a, b, c):
    """Given three natural numbers a, b and c, you have been tasked to implement 
    a function that returns True if the three numbers can form a triangle, 
    and False otherwise.
    Examples:
    is_valid_triangle(3, 4, 5) ==> True
    is_valid_triangle(3, 4, 6) ==> False
    is_valid_triangle(3, 4, 7) ==> False
    is_valid_triangle(3, 4, 8) ==> False
    is_valid_triangle(3, 4, 9) ==> False
    """

    pass
# id_121_Test.java
from scenario3.id_121 import is_valid_triangle

import pytest

class id_121_Test:
    """
    Test class of id_121.py.
    It contains ten unit test cases for the :func:`scenario3.id_121.is_valid_triangle`.
    """
		
    def test_is_valid_triangle_1(self):
        """
        Test case 1 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 5) == True

    def test_is_valid_triangle_2(self):
        """
        Test case 2 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 6) == False

    def test_is_valid_triangle_3(self):
        """
        Test case 3 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 7) == False

    def test_is_valid_triangle_4(self):
        """
        Test case 4 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 8) == False

    def test_is_valid_triangle_5(self):
        """
        Test case 5 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(3, 4, 9) == False

    def test_is_valid_triangle_6(self):
        """
        Test case 6 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 1, 1) == True

    def test_is_valid_triangle_7(self):
        """
        Test case 7 for :func:`scenario3.id_121.is_valid_triangle`.
        """
        assert is_valid_triangle(1, 2, 3) == False

    def test_is_valid_tri