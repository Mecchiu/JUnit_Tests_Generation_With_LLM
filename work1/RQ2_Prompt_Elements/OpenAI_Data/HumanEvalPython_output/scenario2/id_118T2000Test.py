# id_118_Test.java
from scenario2.id_118 import get_closest_vowel

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`scenario2.id_118.get_closest_vowel`.
    """


    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello") == "e"

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world") == "o"

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!") == "o"

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world! ") == "o"

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!  ") == "o"

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!   ") == "o"

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!    ") == "o"

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!     ") == "o"

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!      ") == "o"

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`scenario2.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("hello world!       ") == "o"