# id_101_Test.java
from scenario2.id_101 import words_string

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`scenario2.id_101.words_string`.
    """


    def test_words_string_1(self):
        """
        Test case 1 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("") == []

    def test_words_string_2(self):
        """
        Test case 2 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello") == ["Hello"]

    def test_words_string_3(self):
        """
        Test case 3 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello,World") == ["Hello", "World"]

    def test_words_string_4(self):
        """
        Test case 4 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello World") == ["Hello", "World"]

    def test_words_string_5(self):
        """
        Test case 5 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello, World") == ["Hello", "World"]

    def test_words_string_6(self):
        """
        Test case 6 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello,World") == ["Hello", "World"]

    def test_words_string_7(self):
        """
        Test case 7 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello , World") == ["Hello", "World"]

    def test_words_string_8(self):
        """
        Test case 8 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello ,World") == ["Hello", "World"]

    def test_words_string_9(self):
        """
        Test case 9 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello, World") == ["Hello", "World"]

    def test_words_string_10(self):
        """
        Test case 10 for :func:`scenario2.id_101.words_string`.
        """
        assert words_string("Hello,World") == ["Hello", "World"]