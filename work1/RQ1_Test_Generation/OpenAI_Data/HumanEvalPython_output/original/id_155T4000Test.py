# id_155_Test.java
from original.id_155 import even_odd_count

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`original.id_155.even_odd_count`.
    """


    def test_even_odd_count_1(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(-12) == (1, 1)

    def test_even_odd_count_2(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(123) == (1, 2)

    def test_even_odd_count_3(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(0) == (1, 0)

    def test_even_odd_count_4(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(1) == (0, 1)

    def test_even_odd_count_5(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(2) == (1, 0)

    def test_even_odd_count_6(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(3) == (0, 1)

    def test_even_odd_count_7(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(4) == (1, 0)

    def test_even_odd_count_8(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(5) == (0, 1)

    def test_even_odd_count_9(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(6) == (1, 0)

    def test_even_odd_count_10(self):
        """
        Test case for the :func:`original.id_155.even_odd_count`.
        """
        assert even_odd_count(7) == (0, 1)

# id_156.py

def is_palindrome(num):
    """Given an integer. return True if it is a palindrome.

     Example:
        is_palindrome(1221) ==> True
        is_palindrome(123) ==> False
    """

    return str(num) == str(num)[::-1]

# id_156_Test.java
from original.id_156 import is_palindrome

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`original.id_156.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(1221) == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(123) == False

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(0) == True

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(2) == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(3) == True

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(4) == True

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(5) == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(6) == True

    def test_is_palindrome_10(self):
        """
        Test case for the :func:`original.id_156.is_palindrome`.
        """
        assert is_palindrome(7) == True

# id_157.py

def is_prime(num):
    """Given an integer. return True if it is a prime number.

     Example:
        is_prime(2) ==> True
        is_prime(4) ==> False
    """

    if num < 2:
        return False
    for i in range(2, num):
        if num%i==0:
            return False
    return True

# id_157_Test.java
from original.id_157 import is_prime

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`original.id_157.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_3(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(0) == False

    def test_is_prime_4(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(1) == False

    def test_is_prime_5(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_6(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_7(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_8(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(11) == True

    def test_is_prime_9(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(13) == True

    def test_is_prime_10(self):
        """
        Test case for the :func:`original.id_157.is_prime`.
        """
        assert is_prime(17) == True

# id_158.py

def is_even(num):
    """Given an integer. return True if it is even.

     Example:
        is_even(2) ==> True
        is_even(3) ==> False
    """

    return num%2==0

# id_158_Test.java
from original.id_158 import is_even

import pytest

class id_158_Test:
    """
    Test class of id_158.py.
    It contains ten unit test cases for the :func:`original.id_158.is_even`.
    """
		
    def test_is_even_1(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(2) == True

    def test_is_even_2(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(3) == False

    def test_is_even_3(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(0) == True

    def test_is_even_4(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(1) == False

    def test_is_even_5(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(4) == True

    def test_is_even_6(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(5) == False

    def test_is_even_7(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(6) == True

    def test_is_even_8(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(7) == False

    def test_is_even_9(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(8) == True

    def test_is_even_10(self):
        """
        Test case for the :func:`original.id_158.is_even`.
        """
        assert is_even(9) == False

# id_159.py

def is_odd(num):
    """Given an integer. return True if it is odd.

     Example:
        is_odd(2) ==> False
        is_odd(3) ==> True
    """

    return num%2!=0

# id_159_Test.java
from original.id_159 import is_odd

import pytest

class id_159_Test:
    """
    Test class of id_159.py.
    It contains ten unit test cases for the :func:`original.id_159.is_odd`.
    """
		
    def test_is_odd_1(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(2) == False

    def test_is_odd_2(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(3) == True

    def test_is_odd_3(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(0) == False

    def test_is_odd_4(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(1) == True

    def test_is_odd_5(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(4) == False

    def test_is_odd_6(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(5) == True

    def test_is_odd_7(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(6) == False

    def test_is_odd_8(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(7) == True

    def test_is_odd_9(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(8) == False

    def test_is_odd_10(self):
        """
        Test case for the :func:`original.id_159.is_odd`.
        """
        assert is_odd(9) == True

# id_160.py

def is_even_or_odd(num):
    """Given an integer. return a tuple that has the number of even and odd digits respectively.

     Example:
        is_even_or_odd(-12) ==> (1, 1)
        is_even_or_odd(123) ==> (1, 2)
    """

    if num%2==0:
        return "even"
    else:
        return "odd"

# id_160_Test.java
from original.id_160 import is_even_or_odd

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`original.id_160.is_even_or_odd`.
    """
		
    def test_is_even_or_odd_1(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(-12) == "even"

    def test_is_even_or_odd_2(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(123) == "odd"

    def test_is_even_or_odd_3(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(0) == "even"

    def test_is_even_or_odd_4(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(1) == "odd"

    def test_is_even_or_odd_5(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(2) == "even"

    def test_is_even_or_odd_6(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(3) == "odd"

    def test_is_even_or_odd_7(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
        assert is_even_or_odd(4) == "even"

    def test_is_even_or_odd_8(self):
        """
        Test case for the :func:`original.id_160.is_even_or_odd`.
        """
