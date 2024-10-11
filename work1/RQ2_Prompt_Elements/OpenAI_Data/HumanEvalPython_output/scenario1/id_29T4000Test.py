# id_29_Test.java
from scenario1.id_29 import filter_by_prefix

import pytest

class id_29_Test:
    """
    Test class of id_29.py.
    It contains ten unit test cases for the :func:`scenario1.id_29.filter_by_prefix`.
    """


    def test_filter_by_prefix_1(self):
        """
        Test case 1 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "ab") == ["abc", "abcd", "abcde"]

    def test_filter_by_prefix_2(self):
        """
        Test case 2 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "abc") == ["abc", "abcd", "abcde"]

    def test_filter_by_prefix_3(self):
        """
        Test case 3 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "abcd") == ["abcd"]

    def test_filter_by_prefix_4(self):
        """
        Test case 4 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "abcde") == ["abcde"]

    def test_filter_by_prefix_5(self):
        """
        Test case 5 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "abcdef") == []

    def test_filter_by_prefix_6(self):
        """
        Test case 6 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "") == ["abc", "abcd", "abcde"]

    def test_filter_by_prefix_7(self):
        """
        Test case 7 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "a") == ["abc", "abcd", "abcde"]

    def test_filter_by_prefix_8(self):
        """
        Test case 8 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "b") == []

    def test_filter_by_prefix_9(self):
        """
        Test case 9 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "c") == []

    def test_filter_by_prefix_10(self):
        """
        Test case 10 for :func:`scenario1.id_29.filter_by_prefix`.
        """
        assert filter_by_prefix(["abc", "abcd", "abcde"], "d") == []