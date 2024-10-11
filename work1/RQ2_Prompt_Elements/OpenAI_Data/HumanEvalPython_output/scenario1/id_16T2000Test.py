# id_16_Test.java
from scenario1.id_16 import count_distinct_characters

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`scenario1.id_16.count_distinct_characters`.
    """


    def test_count_distinct_characters_1(self):
        """
        Test case 1 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("") == 0

    def test_count_distinct_characters_2(self):
        """
        Test case 2 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("a") == 1

    def test_count_distinct_characters_3(self):
        """
        Test case 3 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("aa") == 1

    def test_count_distinct_characters_4(self):
        """
        Test case 4 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("ab") == 2

    def test_count_distinct_characters_5(self):
        """
        Test case 5 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("abc") == 3

    def test_count_distinct_characters_6(self):
        """
        Test case 6 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("abcd") == 4

    def test_count_distinct_characters_7(self):
        """
        Test case 7 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("abcde") == 5

    def test_count_distinct_characters_8(self):
        """
        Test case 8 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("abcdef") == 6

    def test_count_distinct_characters_9(self):
        """
        Test case 9 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("abcdefg") == 7

    def test_count_distinct_characters_10(self):
        """
        Test case 10 for :func:`scenario1.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters("abcdefgh") == 8

# id_17.py


def count_distinct_words(string: str) -> int:

    return len(set(string.lower().split()))

# id_17_Test.java
from scenario1.id_17 import count_distinct_words

import pytest

class id_17_Test:
    """
    Test class of id_17.py.
    It contains ten unit test cases for the :func:`scenario1.id_17.count_distinct_words`.
    """
		
    def test_count_distinct_words_1(self):
        """
        Test case 1 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("") == 0

    def test_count_distinct_words_2(self):
        """
        Test case 2 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a") == 1

    def test_count_distinct_words_3(self):
        """
        Test case 3 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a a") == 1

    def test_count_distinct_words_4(self):
        """
        Test case 4 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b") == 2

    def test_count_distinct_words_5(self):
        """
        Test case 5 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b c") == 3

    def test_count_distinct_words_6(self):
        """
        Test case 6 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b c d") == 4

    def test_count_distinct_words_7(self):
        """
        Test case 7 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b c d e") == 5

    def test_count_distinct_words_8(self):
        """
        Test case 8 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b c d e f") == 6

    def test_count_distinct_words_9(self):
        """
        Test case 9 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b c d e f g") == 7

    def test_count_distinct_words_10(self):
        """
        Test case 10 for :func:`scenario1.id_17.count_distinct_words`.
        """
        assert count_distinct_words("a b c d e f g h") == 8

# id_18.py


def count_distinct_words_and_characters(string: str) -> int:

    return len(set(string.lower().split())) + len(set(string.lower()))

# id_18_Test.java
from scenario1.id_18 import count_distinct_words_and_characters

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario1.id_18.count_distinct_words_and_characters`.
    """
		
    def test_count_distinct_words_and_characters_1(self):
        """
        Test case 1 for :func:`scenario1.id_18.count_distinct_words_and_characters`.
        """
        assert count_distinct_words_and_characters("") == 0

    def test_count_distinct_words_and_characters_2(self):
        """
        Test case 2 for :func:`scenario1.id_18.count_distinct_words_and_characters`.
        """
        assert count_distinct_words_and_characters("a") == 1

    def test_count_distinct_words_and_characters_3(self):
        """
        Test case 3 for :func:`scenario1.id_18.count_distinct_words_and_characters`.
        """
        assert count_distinct_words_and_characters("a a") == 2

    def test_count_distinct_words_and_characters_4(self):
        """
        Test case 4 for :func:`scenario1.id_18.count_distinct_words_and_characters`.
        """
        assert count_distinct_words_and_characters("a b") == 3

    def test_count_distinct_words_and_characters_5(self):
        """
        Test case 5 for :func:`scenario1.id_18.count_distinct_words_and_characters`.
        """
        assert count_distinct_words_and_characters("a b c") == 5

    def test_count_distinct_words_and_characters_6(self):
        """
        Test case 6 for :func:`scenario1.id_18.count_distinct_words_and_characters`.