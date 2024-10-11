# id_48_Test.java
from scenario2.id_48 import is_palindrome

import pytest

class id_48_Test:
    """
    Test class of id_48.py.
    It contains ten unit test cases for the :func:`scenario2.id_48.is_palindrome`.
    """


    def test_is_palindrome_1(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_2(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_3(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("aa") == True

    def test_is_palindrome_4(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("ab") == False

    def test_is_palindrome_5(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("aba") == True

    def test_is_palindrome_6(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_7(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("abcdcba") == True

    def test_is_palindrome_8(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyz") == False

    def test_is_palindrome_9(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba") == True

    def test_is_palindrome_10(self):
        """
        Test case for is_palindrome function.
        """
        assert is_palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcb") == False