# id_158_Test.java
from scenario2.id_158 import find_max

import pytest

class id_158_Test:
    """
    Test class of id_158.py.
    It contains ten unit test cases for the :func:`scenario2.id_158.find_max`.
    """


    def test_find_max_1(self):
        """
        Test case 1 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef']) == 'abcdef'

    def test_find_max_2(self):
        """
        Test case 2 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg']) == 'abcdefg'

    def test_find_max_3(self):
        """
        Test case 3 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh']) == 'abcdefgh'

    def test_find_max_4(self):
        """
        Test case 4 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi']) == 'abcdefghi'

    def test_find_max_5(self):
        """
        Test case 5 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij']) == 'abcdefghij'

    def test_find_max_6(self):
        """
        Test case 6 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk']) == 'abcdefghijk'

    def test_find_max_7(self):
        """
        Test case 7 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl']) == 'abcdefghijkl'

    def test_find_max_8(self):
        """
        Test case 8 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl', 'abcdefghijklm']) == 'abcdefghijklm'

    def test_find_max_9(self):
        """
        Test case 9 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl', 'abcdefghijklm', 'abcdefghijklmn']) == 'abcdefghijklmn'

    def test_find_max_10(self):
        """
        Test case 10 for :func:`scenario2.id_158.find_max`.
        """
        assert find_max(['abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl', 'abcdefghijklm', 'abcdefghijklmn', 'abcdefghijklmno']) == 'abcdefghijklmno'