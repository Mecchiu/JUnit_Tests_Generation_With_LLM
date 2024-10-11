# id_10_Test.java
from scenario1.id_10 import make_palindrome

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario1.id_10.make_palindrome`.
    """


    def test_make_palindrome_1(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('') == ''

    def test_make_palindrome_2(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('a') == 'a'

    def test_make_palindrome_3(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('ab') == 'aba'

    def test_make_palindrome_4(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('aba') == 'aba'

    def test_make_palindrome_5(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abba') == 'abba'

    def test_make_palindrome_6(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abcd') == 'abcdcba'

    def test_make_palindrome_7(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abcda') == 'abcda'

    def test_make_palindrome_8(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abcde') == 'abcdedcba'

    def test_make_palindrome_9(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abcdef') == 'abcdefedcba'

    def test_make_palindrome_10(self):
        """
        Test case for the :func:`scenario1.id_10.make_palindrome` function.
        """
        assert make_palindrome('abcdefg') == 'abcdefggfedcba'