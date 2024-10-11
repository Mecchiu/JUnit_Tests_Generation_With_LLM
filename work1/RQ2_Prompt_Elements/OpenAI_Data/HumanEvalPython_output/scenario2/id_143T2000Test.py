# id_143_Test.java
from scenario2.id_143 import words_in_sentence

import pytest

class id_143_Test:
    """
    Test class of id_143.py.
    It contains ten unit test cases for the :func:`scenario2.id_143.words_in_sentence`.
    """


    def test_words_in_sentence_1(self):
        """
        Test case 1 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student") == "I am student"

    def test_words_in_sentence_2(self):
        """
        Test case 2 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student.") == "I am student"

    def test_words_in_sentence_3(self):
        """
        Test case 3 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_4(self):
        """
        Test case 4 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_5(self):
        """
        Test case 5 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_6(self):
        """
        Test case 6 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student. I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_7(self):
        """
        Test case 7 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_8(self):
        """
        Test case 8 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_9(self):
        """
        Test case 9 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student.") == "I am student"

    def test_words_in_sentence_10(self):
        """
        Test case 10 for :func:`scenario2.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student.") == "I am student"