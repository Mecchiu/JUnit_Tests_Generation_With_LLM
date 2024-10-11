# id_6_Test.java
from scenario2.id_6 import parse_nested_parens

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario2.id_6.parse_nested_parens`.
    """


    def test_case_1(self):
        """
        Test case 1 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(())') == [2]

    def test_case_2(self):
        """
        Test case 2 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('((()))') == [3]

    def test_case_3(self):
        """
        Test case 3 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(((())))') == [4]

    def test_case_4(self):
        """
        Test case 4 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('()') == [1]

    def test_case_5(self):
        """
        Test case 5 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()())') == [2]

    def test_case_6(self):
        """
        Test case 6 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(())(())') == [2, 2]

    def test_case_7(self):
        """
        Test case 7 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()(()))') == [3]

    def test_case_8(self):
        """
        Test case 8 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()((())))') == [4]

    def test_case_9(self):
        """
        Test case 9 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()(((()))))') == [5]

    def test_case_10(self):
        """
        Test case 10 for :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()((((())))))(((())))') == [5, 3]