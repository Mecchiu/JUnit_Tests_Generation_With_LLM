# id_117_Test.java
from original.id_117 import select_words

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`original.id_117.select_words`.
    """


    def test_select_words_1(self):
        """
        Test case 1 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 4) == ["little"]

    def test_select_words_2(self):
        """
        Test case 2 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 3) == ["Mary", "lamb"]

    def test_select_words_3(self):
        """
        Test case 3 for :func:`original.id_117.select_words`.
        """
        assert select_words("simple white space", 2) == []

    def test_select_words_4(self):
        """
        Test case 4 for :func:`original.id_117.select_words`.
        """
        assert select_words("Hello world", 4) == ["world"]

    def test_select_words_5(self):
        """
        Test case 5 for :func:`original.id_117.select_words`.
        """
        assert select_words("Uncle sam", 3) == ["Uncle"]

    def test_select_words_6(self):
        """
        Test case 6 for :func:`original.id_117.select_words`.
        """
        assert select_words("", 3) == []

    def test_select_words_7(self):
        """
        Test case 7 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 1) == ["a"]

    def test_select_words_8(self):
        """
        Test case 8 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 0) == []

    def test_select_words_9(self):
        """
        Test case 9 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 2) == []

    def test_select_words_10(self):
        """
        Test case 10 for :func:`original.id_117.select_words`.
        """
        assert select_words("a a", 1) == ["a", "a"]

# id_117_Test.py
from original.id_117 import select_words

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`original.id_117.select_words`.
    """
		
    def test_select_words_1(self):
        """
        Test case 1 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 4) == ["little"]

    def test_select_words_2(self):
        """
        Test case 2 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 3) == ["Mary", "lamb"]

    def test_select_words_3(self):
        """
        Test case 3 for :func:`original.id_117.select_words`.
        """
        assert select_words("simple white space", 2) == []

    def test_select_words_4(self):
        """
        Test case 4 for :func:`original.id_117.select_words`.
        """
        assert select_words("Hello world", 4) == ["world"]

    def test_select_words_5(self):
        """
        Test case 5 for :func:`original.id_117.select_words`.
        """
        assert select_words("Uncle sam", 3) == ["Uncle"]

    def test_select_words_6(self):
        """
        Test case 6 for :func:`original.id_117.select_words`.
        """
        assert select_words("", 3) == []

    def test_select_words_7(self):
        """
        Test case 7 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 1) == ["a"]

    def test_select_words_8(self):
        """
        Test case 8 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 0) == []

    def test_select_words_9(self):
        """
        Test case 9 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 2) == []

    def test_select_words_10(self):
        """
        Test case 10 for :func:`original.id_117.select_words`.
        """
        assert select_words("a a", 1) == ["a", "a"]

# id_117_Test.java
from original.id_117 import select_words

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`original.id_117.select_words`.
    """
		
    def test_select_words_1(self):
        """
        Test case 1 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 4) == ["little"]

    def test_select_words_2(self):
        """
        Test case 2 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 3) == ["Mary", "lamb"]

    def test_select_words_3(self):
        """
        Test case 3 for :func:`original.id_117.select_words`.
        """
        assert select_words("simple white space", 2) == []

    def test_select_words_4(self):
        """
        Test case 4 for :func:`original.id_117.select_words`.
        """
        assert select_words("Hello world", 4) == ["world"]

    def test_select_words_5(self):
        """
        Test case 5 for :func:`original.id_117.select_words`.
        """
        assert select_words("Uncle sam", 3) == ["Uncle"]

    def test_select_words_6(self):
        """
        Test case 6 for :func:`original.id_117.select_words`.
        """
        assert select_words("", 3) == []

    def test_select_words_7(self):
        """
        Test case 7 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 1) == ["a"]

    def test_select_words_8(self):
        """
        Test case 8 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 0) == []

    def test_select_words_9(self):
        """
        Test case 9 for :func:`original.id_117.select_words`.
        """
        assert select_words("a", 2) == []

    def test_select_words_10(self):
        """
        Test case 10 for :func:`original.id_117.select_words`.
        """
        assert select_words("a a", 1) == ["a", "a"]

# id_117_Test.py
from original.id_117 import select_words

import pytest

class id_117_Test:
    """
    Test class of id_117.py.
    It contains ten unit test cases for the :func:`original.id_117.select_words`.
    """
		
    def test_select_words_1(self):
        """
        Test case 1 for :func:`original.id_117.select_words`.
        """
        assert select_words("Mary had a little lamb", 4) == ["little"]

    def test_select_words_2(self):
        """
        Test case 2 for :func:`original.id_117.select_words`.
        """
        assert select_words("