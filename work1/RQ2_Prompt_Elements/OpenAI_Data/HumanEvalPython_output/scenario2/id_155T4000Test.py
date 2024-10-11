# id_155_Test.java
from scenario2.id_155 import even_odd_count

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario2.id_155.even_odd_count`.
    """


    def test_even_odd_count_1(self):
        """
        Test case 1 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(12345) == (2, 3)

    def test_even_odd_count_2(self):
        """
        Test case 2 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789) == (4, 5)

    def test_even_odd_count_3(self):
        """
        Test case 3 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(0) == (1, 0)

    def test_even_odd_count_4(self):
        """
        Test case 4 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(1) == (0, 1)

    def test_even_odd_count_5(self):
        """
        Test case 5 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(2) == (1, 0)

    def test_even_odd_count_6(self):
        """
        Test case 6 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(3) == (0, 1)

    def test_even_odd_count_7(self):
        """
        Test case 7 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(4) == (1, 0)

    def test_even_odd_count_8(self):
        """
        Test case 8 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(5) == (0, 1)

    def test_even_odd_count_9(self):
        """
        Test case 9 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(6) == (1, 0)

    def test_even_odd_count_10(self):
        """
        Test case 10 for :func:`scenario2.id_155.even_odd_count`.
        """
        assert even_odd_count(7) == (0, 1)

# id_156.py

def is_palindrome(num):
    """Given an integer. return True if it is a palindrome.



    """

    return str(num) == str(num)[::-1]

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
        Test case 1 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(12345) == False

    def test_is_palindrome_2(self):
        """
        Test case 2 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(12321) == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(123321) == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(1234321) == True

    def test_is_palindrome_5(self):
        """
        Test case 5 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(123454321) == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(123456789) == False

    def test_is_palindrome_7(self):
        """
        Test case 7 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(0) == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(2) == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for :func:`scenario2.id_156.is_palindrome`.
        """
        assert is_palindrome(3) == True

# id_157.py

def is_prime(num):
    """Given an integer. return True if it is a prime number.



    """

    if num < 2:
        return False
    for i in range(2, num):
        if num%i == 0:
            return False
    return True

# id_157_Test.java
from scenario2.id_157 import is_prime

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`scenario2.id_157.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case 1 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case 2 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case 3 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case 4 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case 5 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case 6 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case 7 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case 8 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case 9 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """
        Test case 10 for :func:`scenario2.id_157.is_prime`.
        """
        assert is_prime(11) == True

# id_158.py

def is_perfect_square(num):
    """Given an integer. return True if it is a perfect square.



    """

    if num < 0:
        return False
    if num == 0:
        return True
    for i in range(1, num+1):
        if i*i == num:
            return True
    return False

# id_158_Test.java
from scenario2.id_158 import is_perfect_square

import pytest

class id_158_Test:
    """
    Test class of id_158.py.
    It contains ten unit test cases for the :func:`scenario2.id_158.is_perfect_square`.
    """
		
    def test_is_perfect_square_1(self):
        """
        Test case 1 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(0) == True

    def test_is_perfect_square_2(self):
        """
        Test case 2 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(1) == True

    def test_is_perfect_square_3(self):
        """
        Test case 3 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(2) == False

    def test_is_perfect_square_4(self):
        """
        Test case 4 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(3) == False

    def test_is_perfect_square_5(self):
        """
        Test case 5 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(4) == True

    def test_is_perfect_square_6(self):
        """
        Test case 6 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(5) == False

    def test_is_perfect_square_7(self):
        """
        Test case 7 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(6) == False

    def test_is_perfect_square_8(self):
        """
        Test case 8 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(7) == False

    def test_is_perfect_square_9(self):
        """
        Test case 9 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(8) == False

    def test_is_perfect_square_10(self):
        """
        Test case 10 for :func:`scenario2.id_158.is_perfect_square`.
        """
        assert is_perfect_square(9) == True

# id_159.py

def is_perfect_cube(num):
    """Given an integer. return True if it is a perfect cube.



    """

    if num < 0:
        return False
    if num == 0:
        return True
    for i in range(1, num+1):
        if i*i*i == num:
            return True
    return False

# id_159_Test.java
from scenario2.id_159 import is_perfect_cube

import pytest

class id_159_Test:
    """
    Test class of id_159.py.
    It contains ten unit test cases for the :func:`scenario2.id_159.is_perfect_cube`.
    """
		
    def test_is_perfect_cube_1(self):
        """
        Test case 1 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(0) == True

    def test_is_perfect_cube_2(self):
        """
        Test case 2 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(1) == True

    def test_is_perfect_cube_3(self):
        """
        Test case 3 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(2) == False

    def test_is_perfect_cube_4(self):
        """
        Test case 4 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(3) == False

    def test_is_perfect_cube_5(self):
        """
        Test case 5 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(4) == False

    def test_is_perfect_cube_6(self):
        """
        Test case 6 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(5) == False

    def test_is_perfect_cube_7(self):
        """
        Test case 7 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(6) == False

    def test_is_perfect_cube_8(self):
        """
        Test case 8 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(7) == False

    def test_is_perfect_cube_9(self):
        """
        Test case 9 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(8) == False

    def test_is_perfect_cube_10(self):
        """
        Test case 10 for :func:`scenario2.id_159.is_perfect_cube`.
        """
        assert is_perfect_cube(9) == False

# id_160.py

def is_armstrong(num):
    """Given an integer. return True if it is an Armstrong number.



    """

    return num == sum([int(i)**len(str(num)) for i in str(num)])

# id_160_Test.java
from scenario2.id_160 import is_armstrong

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`scenario2.id_160.is_armstrong`.
    """
		
    def test_is_armstrong_1(self):
        """
        Test case 1 for :func:`scenario2.id_160.is_armstrong`.
        """
        assert is_armstrong(153) == True

    def test_is_armstrong_2(self):
        """
        Test case 2 for :func:`scenario2.id_160.is_armstrong`.
        """
        assert is_armstrong(370) == True

    def test_is_armstrong_3(self):
        """
        Test case 3 for :func:`scenario2.id_160.is_armstrong`.
        """
        assert is_armstrong(371) == True

    def test_is_armstrong_4(self):
        """
        Test case 4 for :func:`scenario2.id_160.is_armstrong`.
        """
        assert is_armstrong(407) == True

    def test_is_armstrong_5(self):
        """
        Test case 5 for :func:`scenario2.id_160.is_armstrong`.
        """
        assert is_armstrong(0) == True

    def test_is_armstrong_6(self):
        """
        Test case 6 for :func