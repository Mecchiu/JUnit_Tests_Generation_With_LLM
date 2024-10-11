# id_6_Test.java
from scenario2.id_6 import parse_nested_parens

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario2.id_6.parse_nested_parens`.
    """


    def test_parse_nested_parens_1(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(())') == [2]

    def test_parse_nested_parens_2(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('((()))') == [3]

    def test_parse_nested_parens_3(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(((())))') == [4]

    def test_parse_nested_parens_4(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('()') == [1]

    def test_parse_nested_parens_5(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()())') == [2]

    def test_parse_nested_parens_6(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(())(())') == [2, 2]

    def test_parse_nested_parens_7(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(())(())(())') == [2, 2, 2]

    def test_parse_nested_parens_8(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('(()((())))') == [3, 4]

    def test_parse_nested_parens_9(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('((())((())))') == [3, 4]

    def test_parse_nested_parens_10(self):
        """
        Test case for the :func:`scenario2.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens('((())((())))(((())))') == [3, 4, 5]