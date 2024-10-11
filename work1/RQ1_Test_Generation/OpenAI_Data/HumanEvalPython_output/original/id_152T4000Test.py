# id_152_Test.java
from original.id_152 import compare

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`original.id_152.compare`.
    """


    def test_compare_1(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([1,2,3,4,5,1],[1,2,3,4,2,-2]) == [0,0,0,0,3,3]
		
    def test_compare_2(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,5,0,0,0,4],[4,1,1,0,0,-2]) == [4,4,1,0,0,6]
		
    def test_compare_3(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_4(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_5(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_6(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_7(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_8(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_9(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
    def test_compare_10(self):
        """
        Test case for the function :func:`original.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]
		
# id_153.py

def is_palindrome(s):
    """A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
    Allowances may be made for adjustments to capital letters, punctuation, and word dividers.
    Your task is to determine if a given string is a palindrome.
    Return true if it is, and false if it is not.
    
    
    example:

    is_palindrome("anna") -> true
    is_palindrome("walter") -> false
    """

    return s == s[::-1]

# id_153_Test.java
from original.id_153 import is_palindrome

import pytest

class id_153_Test:
    """
    Test class of id_153.py.
    It contains ten unit test cases for the :func:`original.id_153.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("anna") == True
		
    def test_is_palindrome_2(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("walter") == False
		
    def test_is_palindrome_3(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("racecar") == True
		
    def test_is_palindrome_4(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("") == True
		
    def test_is_palindrome_5(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("a") == True
		
    def test_is_palindrome_6(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("aa") == True
		
    def test_is_palindrome_7(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("ab") == False
		
    def test_is_palindrome_8(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("aba") == True
		
    def test_is_palindrome_9(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("abba") == True
		
    def test_is_palindrome_10(self):
        """
        Test case for the function :func:`original.id_153.is_palindrome`.
        """
        assert is_palindrome("abcba") == True
		
# id_154.py

def is_prime(n):
    """A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    Your task is to determine if a given number is prime.
    Return true if it is, and false if it is not.
    
    
    example:

    is_prime(1) -> false
    is_prime(2) -> true
    """

    if n <= 1:
        return False
    for i in range(2,n):
        if n % i == 0:
            return False
    return True

# id_154_Test.java
from original.id_154 import is_prime

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`original.id_154.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(1) == False
		
    def test_is_prime_2(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(2) == True
		
    def test_is_prime_3(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(3) == True
		
    def test_is_prime_4(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(4) == False
		
    def test_is_prime_5(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(5) == True
		
    def test_is_prime_6(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(6) == False
		
    def test_is_prime_7(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(7) == True
		
    def test_is_prime_8(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(8) == False
		
    def test_is_prime_9(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(9) == False
		
    def test_is_prime_10(self):
        """
        Test case for the function :func:`original.id_154.is_prime`.
        """
        assert is_prime(10) == False
		
# id_155.py

def is_square(n):
    """A square number is an integer that is the square of an integer.
    Your task is to determine if a given number is a square number.
    Return true if it is, and false if it is not.
    
    
    example:

    is_square(1) -> true
    is_square(2) -> false
    """

    return n**0.5 == int(n**0.5)

# id_155_Test.java
from original.id_155 import is_square

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`original.id_155.is_square`.
    """
		
    def test_is_square_1(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(1) == True
		
    def test_is_square_2(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(2) == False
		
    def test_is_square_3(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(3) == False
		
    def test_is_square_4(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(4) == True
		
    def test_is_square_5(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(5) == False
		
    def test_is_square_6(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(6) == False
		
    def test_is_square_7(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(7) == False
		
    def test_is_square_8(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(8) == False
		
    def test_is_square_9(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(9) == True
		
    def test_is_square_10(self):
        """
        Test case for the function :func:`original.id_155.is_square`.
        """
        assert is_square(10) == False
		
# id_156.py

def is_triangle(a,b,c):
    """A triangle is a polygon with three edges and three vertices.
    It is one of the basic shapes in geometry.
    A triangle with vertices A, B, and C is denoted .
    Your task is to determine if a given triangle is equilateral, isosceles, or scalene.
    Return the type of triangle as a string.
    
    
    example:

    is_triangle(1,2,3) -> "scalene"
    is_triangle(2,2,2) -> "equilateral"
    """

    if a == b == c:
        return "equilateral"
    elif a == b or a == c or b == c:
        return "isosceles"
    else:
        return "scalene"

# id_156_Test.java
from original.id_156 import is_triangle

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`original.id_156.is_triangle`.
    """
		
    def test_is_triangle_1(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(1,2,3) == "scalene"
		
    def test_is_triangle_2(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(2,2,2) == "equilateral"
		
    def test_is_triangle_3(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(3,3,3) == "equilateral"
		
    def test_is_triangle_4(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(4,4,4) == "equilateral"
		
    def test_is_triangle_5(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(5,5,5) == "equilateral"
		
    def test_is_triangle_6(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(6,6,6) == "equilateral"
		
    def test_is_triangle_7(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(7,7,7) == "equilateral"
		
    def test_is_triangle_8(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
        """
        assert is_triangle(8,8,8) == "equilateral"
		
    def test_is_triangle_9(self):
        """
        Test case for the function :func:`original.id_156.is_triangle`.
       