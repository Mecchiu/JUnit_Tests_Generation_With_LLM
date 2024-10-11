# id_107_Test.java
from scenario2.id_107 import even_odd_palindrome

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`scenario2.id_107.even_odd_palindrome`.
    """


    def test_even_odd_palindrome_1(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(1) == (0, 1)

    def test_even_odd_palindrome_2(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(2) == (1, 1)

    def test_even_odd_palindrome_3(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(3) == (1, 2)

    def test_even_odd_palindrome_4(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(4) == (2, 2)

    def test_even_odd_palindrome_5(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(5) == (2, 3)

    def test_even_odd_palindrome_6(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(6) == (3, 3)

    def test_even_odd_palindrome_7(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(7) == (3, 4)

    def test_even_odd_palindrome_8(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(8) == (4, 4)

    def test_even_odd_palindrome_9(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(9) == (4, 5)

    def test_even_odd_palindrome_10(self):
        """
        Test case for even_odd_palindrome(n)
        """
        assert even_odd_palindrome(10) == (5, 5)