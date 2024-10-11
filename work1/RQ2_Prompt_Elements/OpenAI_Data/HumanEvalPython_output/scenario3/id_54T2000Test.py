# id_54_Test.java
from scenario3.id_54 import same_chars

import pytest

class id_54_Test:
    """
    Test class of id_54.py.
    It contains ten unit test cases for the :func:`scenario3.id_54.same_chars`.
    """


    def test_same_chars_1(self):
        """
        Test case 1 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc') == True

    def test_same_chars_2(self):
        """
        Test case 2 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('abcd', 'dddddddabc') == True

    def test_same_chars_3(self):
        """
        Test case 3 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('dddddddabc', 'abcd') == True

    def test_same_chars_4(self):
        """
        Test case 4 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcd', 'dddddddabc') == False

    def test_same_chars_5(self):
        """
        Test case 5 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('abcd', 'dddddddabce') == False

    def test_same_chars_6(self):
        """
        Test case 6 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False

    def test_same_chars_7(self):
        """
        Test case 7 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False

    def test_same_chars_8(self):
        """
        Test case 8 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False

    def test_same_chars_9(self):
        """
        Test case 9 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False

    def test_same_chars_10(self):
        """
        Test case 10 for :func:`scenario3.id_54.same_chars`.
        """
        assert same_chars('eabcdzzzz', 'dddzzzzzzzddddabc') == False