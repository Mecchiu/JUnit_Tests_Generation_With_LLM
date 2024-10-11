# id_143_Test.java
from scenario1.id_143 import words_in_sentence

import pytest

class id_143_Test:
    """
    Test class of id_143.py.
    It contains ten unit test cases for the :func:`scenario1.id_143.words_in_sentence`.
    """


    def test_words_in_sentence_1(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am using HackerRank to improve programming") == "I am using to improve programming"

    def test_words_in_sentence_2(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_3(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_4(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_5(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_6(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_7(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_8(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_9(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_10(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

# id_143_Test.py
from scenario1.id_143 import words_in_sentence

import pytest

class id_143_Test:
    """
    Test class of id_143.py.
    It contains ten unit test cases for the :func:`scenario1.id_143.words_in_sentence`.
    """
		
    def test_words_in_sentence_1(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I am using HackerRank to improve programming") == "I am using to improve programming"

    def test_words_in_sentence_2(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_3(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_4(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_5(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_6(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_7(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_8(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_9(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_10(self):
        """
        Test case for the function :func:`scenario1.id_143.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

# id_144.py

def words_in_sentence(sentence):

    new_lst = []
    for word in sentence.split():
        flg = 0
        if len(word) == 1:
            flg = 1
        for i in range(2, len(word)):
            if len(word)%i == 0:
                flg = 1
        if flg == 0 or len(word) == 2:
            new_lst.append(word)
    return " ".join(new_lst)

# id_144_Test.java
from scenario1.id_144 import words_in_sentence

import pytest

class id_144_Test:
    """
    Test class of id_144.py.
    It contains ten unit test cases for the :func:`scenario1.id_144.words_in_sentence`.
    """
		
    def test_words_in_sentence_1(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I am using HackerRank to improve programming") == "I am using to improve programming"

    def test_words_in_sentence_2(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_3(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_4(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_5(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_6(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_7(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_8(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_9(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_10(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

# id_144_Test.py
from scenario1.id_144 import words_in_sentence

import pytest

class id_144_Test:
    """
    Test class of id_144.py.
    It contains ten unit test cases for the :func:`scenario1.id_144.words_in_sentence`.
    """
		
    def test_words_in_sentence_1(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I am using HackerRank to improve programming") == "I am using to improve programming"

    def test_words_in_sentence_2(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_3(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_4(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_5(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_6(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_7(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_8(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_9(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_10(self):
        """
        Test case for the function :func:`scenario1.id_144.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

# id_145.py

def words_in_sentence(sentence):

    new_lst = []
    for word in sentence.split():
        flg = 0
        if len(word) == 1:
            flg = 1
        for i in range(2, len(word)):
            if len(word)%i == 0:
                flg = 1
        if flg == 0 or len(word) == 2:
            new_lst.append(word)
    return " ".join(new_lst)

# id_145_Test.java
from scenario1.id_145 import words_in_sentence

import pytest

class id_145_Test:
    """
    Test class of id_145.py.
    It contains ten unit test cases for the :func:`scenario1.id_145.words_in_sentence`.
    """
		
    def test_words_in_sentence_1(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I am using HackerRank to improve programming") == "I am using to improve programming"

    def test_words_in_sentence_2(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_3(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_4(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_5(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_6(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_7(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_8(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in_sentence`.
        """
        assert words_in_sentence("I love to code") == "I love code"

    def test_words_in_sentence_9(self):
        """
        Test case for the function :func:`scenario1.id_145.words_in