# id_10_Test.java
from scenario2.id_10 import make_palindrome

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario2.id_10.make_palindrome`.
    """


    def test_empty_string(self):
        """
        Test case for empty string.
        """
        assert make_palindrome('') == ''

    def test_single_character_string(self):
        """
        Test case for single character string.
        """
        assert make_palindrome('a') == 'a'

    def test_two_character_string(self):
        """
        Test case for two character string.
        """
        assert make_palindrome('ab') == 'aba'

    def test_three_character_string(self):
        """
        Test case for three character string.
        """
        assert make_palindrome('abc') == 'abcba'

    def test_four_character_string(self):
        """
        Test case for four character string.
        """
        assert make_palindrome('abcd') == 'abcdcba'

    def test_five_character_string(self):
        """
        Test case for five character string.
        """
        assert make_palindrome('abcde') == 'abcdedcba'

    def test_six_character_string(self):
        """
        Test case for six character string.
        """
        assert make_palindrome('abcdef') == 'abcdefedcba'

    def test_seven_character_string(self):
        """
        Test case for seven character string.
        """
        assert make_palindrome('abcdefg') == 'abcdefggfedcba'

    def test_eight_character_string(self):
        """
        Test case for eight character string.
        """
        assert make_palindrome('abcdefgh') == 'abcdefghgfedcba'

    def test_nine_character_string(self):
        """
        Test case for nine character string.
        """
        assert make_palindrome('abcdefghi') == 'abcdefghihgfedcba'