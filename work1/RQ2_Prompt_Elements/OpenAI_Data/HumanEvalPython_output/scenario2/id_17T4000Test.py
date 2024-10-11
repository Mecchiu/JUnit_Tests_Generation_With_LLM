# id_17_Test.java
from scenario2.id_17 import parse_music

import pytest

class id_17_Test:
    """
    Test class of id_17.py.
    It contains ten unit test cases for the :func:`scenario2.id_17.parse_music`.
    """


    def test_parse_music_1(self):
        """
        Test case for :func:`scenario2.id_17.parse_music`.
        """
        assert parse_music('o|.|o|.|o|.|o|.|') == [2, 1, 2, 1, 2, 1, 2, 1]

    def test_parse_music_2(self):
        """
        Test case for :func:`scenario2.id_17.parse_music`.
        """
        assert parse_music('o|o|o|o|o|o|o|o|') == [4, 4, 4, 4, 4, 4, 4, 4]

    def test_parse_music_3(self):
        """
        Test case for :func:`scenario2.id_17.parse_music`.
        """
        assert parse_music('o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|') == [2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1]

    def test_parse_music_4(self):
        """
        Test case for :func:`scenario2.id_17.parse_music`.
        """
        assert parse_music('o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|') == [4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4]

    def test_parse_music_5(self):
        """
        Test case for :func:`scenario2.id_17.parse_music`.
        """
        assert parse_music('o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o|.|o