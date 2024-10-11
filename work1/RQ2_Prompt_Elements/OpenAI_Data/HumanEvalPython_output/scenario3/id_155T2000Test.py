# id_155_Test.java
from scenario3.id_155 import even_odd_count

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario3.id_155.even_odd_count`.
    """


    def test_even_odd_count_1(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(-12) == (1, 1)

    def test_even_odd_count_2(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(123) == (1, 2)

    def test_even_odd_count_3(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(0) == (1, 0)

    def test_even_odd_count_4(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(1) == (0, 1)

    def test_even_odd_count_5(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(2) == (1, 0)

    def test_even_odd_count_6(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(3) == (0, 1)

    def test_even_odd_count_7(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(4) == (1, 0)

    def test_even_odd_count_8(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(5) == (0, 1)

    def test_even_odd_count_9(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(6) == (1, 0)

    def test_even_odd_count_10(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(7) == (0, 1)

# id_155_Test.py
from scenario3.id_155 import even_odd_count

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario3.id_155.even_odd_count`.
    """
		
    def test_even_odd_count_1(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(-12) == (1, 1)

    def test_even_odd_count_2(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(123) == (1, 2)

    def test_even_odd_count_3(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(0) == (1, 0)

    def test_even_odd_count_4(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(1) == (0, 1)

    def test_even_odd_count_5(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(2) == (1, 0)

    def test_even_odd_count_6(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(3) == (0, 1)

    def test_even_odd_count_7(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(4) == (1, 0)

    def test_even_odd_count_8(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(5) == (0, 1)

    def test_even_odd_count_9(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(6) == (1, 0)

    def test_even_odd_count_10(self):
        """
        Test case for the :func:`scenario3.id_155.even_odd_count`.
        """
        assert even_odd_count(7) == (0, 1)

# id_156.py

def is_palindrome(num):
    """Given an integer. return True if it is a palindrome.

     Example:
        is_palindrome(1221) ==> True
        is_palindrome(123) ==> False
    """

    pass
# id_156_Test.java
from scenario3.id_156 import is_palindrome

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario3.id_156.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(1221) == True

    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(123) == False

    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(0) == True

    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(1) == True

    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(2) == True

    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(3) == True

    def test_is_palindrome_7(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(4) == True

    def test_is_palindrome_8(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_palindrome(5) == True

    def test_is_palindrome_9(self):
        """
        Test case for the :func:`scenario3.id_156.is_palindrome`.
        """
        assert is_pal