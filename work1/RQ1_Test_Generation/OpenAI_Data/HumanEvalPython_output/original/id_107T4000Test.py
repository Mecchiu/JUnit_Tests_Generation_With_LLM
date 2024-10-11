# id_107_Test.java
from original.id_107 import even_odd_palindrome

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`original.id_107.even_odd_palindrome`.
    """


    def test_even_odd_palindrome_1(self):
        """
        Test case 1 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(3) == (1, 2)

    def test_even_odd_palindrome_2(self):
        """
        Test case 2 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(12) == (4, 6)

    def test_even_odd_palindrome_3(self):
        """
        Test case 3 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1) == (0, 1)

    def test_even_odd_palindrome_4(self):
        """
        Test case 4 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(2) == (1, 0)

    def test_even_odd_palindrome_5(self):
        """
        Test case 5 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10) == (4, 4)

    def test_even_odd_palindrome_6(self):
        """
        Test case 6 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(100) == (18, 18)

    def test_even_odd_palindrome_7(self):
        """
        Test case 7 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1000) == (91, 91)

    def test_even_odd_palindrome_8(self):
        """
        Test case 8 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(10000) == (913, 913)

    def test_even_odd_palindrome_9(self):
        """
        Test case 9 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(100000) == (9137, 9137)

    def test_even_odd_palindrome_10(self):
        """
        Test case 10 for :func:`original.id_107.even_odd_palindrome`.
        """
        assert even_odd_palindrome(1000000) == (91373, 91373)