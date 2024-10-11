# id_101_Test.java
from original.id_101 import words_string

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`original.id_101.words_string`.
    """


    def test_words_string_1(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]

    def test_words_string_2(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]

    def test_words_string_3(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("") == []

    def test_words_string_4(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student"]

    def test_words_string_5(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student, and I am studying in the university") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student", "and", "I", "am", "studying", "in", "the", "university"]

    def test_words_string_6(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student, and I am studying in the university, and I am studying in the university, and I am studying in the university") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university"]

    def test_words_string_7(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university"]

    def test_words_string_8(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university"]

    def test_words_string_9(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university"]

    def test_words_string_10(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university, and I am studying in the university") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university", "and", "I", "am", "studying", "in", "the", "university"]


# id_101_Test.py
from original.id_101 import words_string

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`original.id_101.words_string`.
    """
		
    def test_words_string_1(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]

    def test_words_string_2(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]

    def test_words_string_3(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("") == []

    def test_words_string_4(self):
        """
        Test case for the :func:`original.id_101.words_string`.
        """
        assert words_string("Hi, my name is John, and I am a student") == ["Hi", "my", "name", "is", "John", "and", "I", "am", "a", "student"]

    def test_