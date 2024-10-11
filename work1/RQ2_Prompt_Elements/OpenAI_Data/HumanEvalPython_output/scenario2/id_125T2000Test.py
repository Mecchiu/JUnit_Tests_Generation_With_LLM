# id_125_Test.java
from scenario2.id_125 import split_words

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`scenario2.id_125.split_words`.
    """


    def test_split_words_1(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("Hello World") == ["Hello", "World"]

    def test_split_words_2(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("Hello,World") == ["Hello", "World"]

    def test_split_words_3(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("HelloWorld") == 5

    def test_split_words_4(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("Hello,World") == ["Hello", "World"]

    def test_split_words_5(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("HelloWorld") == 5

    def test_split_words_6(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("Hello,World") == ["Hello", "World"]

    def test_split_words_7(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("HelloWorld") == 5

    def test_split_words_8(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("Hello,World") == ["Hello", "World"]

    def test_split_words_9(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("HelloWorld") == 5

    def test_split_words_10(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("Hello,World") == ["Hello", "World"]