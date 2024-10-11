# id_117_Test.java
from scenario1.id_117 import select_words

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`scenario1.id_117.select_words`.
    """


    def test_select_words_1(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 2) == ["love"]

    def test_select_words_2(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 1) == ["I", "love"]

    def test_select_words_3(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 0) == ["I", "love", "Python"]

    def test_select_words_4(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 3) == []

    def test_select_words_5(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 4) == []

    def test_select_words_6(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 5) == []

    def test_select_words_7(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 6) == []

    def test_select_words_8(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 7) == []

    def test_select_words_9(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 8) == []

    def test_select_words_10(self):
        """
        Test case for the :func:`scenario1.id_117.select_words`.
        """
        assert select_words("I love Python", 9) == []