# id_118_Test.java
from scenario1.id_118 import get_closest_vowel

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`scenario1.id_118.get_closest_vowel`.
    """


    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("") == ""

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abc") == "a"

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcd") == "a"

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcde") == "e"

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdef") == "e"

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdefg") == "e"

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdefgh") == "e"

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdefghi") == "e"

# id_118_Test.py
from scenario1.id_118 import get_closest_vowel

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`scenario1.id_118.get_closest_vowel`.
    """
		
    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("") == ""

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abc") == "a"

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcd") == "a"

    def test_get_closest_vowel_6(self):
        """
        Test case 6 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcde") == "e"

    def test_get_closest_vowel_7(self):
        """
        Test case 7 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdef") == "e"

    def test_get_closest_vowel_8(self):
        """
        Test case 8 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdefg") == "e"

    def test_get_closest_vowel_9(self):
        """
        Test case 9 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdefgh") == "e"

    def test_get_closest_vowel_10(self):
        """
        Test case 10 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcdefghi") == "e"

# id_118_Test.java
from scenario1.id_118 import get_closest_vowel

import pytest

class id_118_Test:
    """
    Test class of id_118.py.
    It contains ten unit test cases for the :func:`scenario1.id_118.get_closest_vowel`.
    """
		
    def test_get_closest_vowel_1(self):
        """
        Test case 1 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("") == ""

    def test_get_closest_vowel_2(self):
        """
        Test case 2 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("a") == ""

    def test_get_closest_vowel_3(self):
        """
        Test case 3 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("ab") == ""

    def test_get_closest_vowel_4(self):
        """
        Test case 4 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abc") == "a"

    def test_get_closest_vowel_5(self):
        """
        Test case 5 for :func:`scenario1.id_118.get_closest_vowel`.
        """
        assert get_closest_vowel("abcd") == "a"

    def test_get_closest_v