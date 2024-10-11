# id_16_Test.java
from original.id_16 import count_distinct_characters

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`original.id_16.count_distinct_characters`.
    """


    def test_count_distinct_characters_1(self):
        """
        Test case 1 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('xyzXYZ') == 3

    def test_count_distinct_characters_2(self):
        """
        Test case 2 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('Jerry') == 4

    def test_count_distinct_characters_3(self):
        """
        Test case 3 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('Tom') == 2

    def test_count_distinct_characters_4(self):
        """
        Test case 4 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyz') == 26

    def test_count_distinct_characters_5(self):
        """
        Test case 5 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('ABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_6(self):
        """
        Test case 6 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_7(self):
        """
        Test case 7 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789') == 36

    def test_count_distinct_characters_8(self):
        """
        Test case 8 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 70

    def test_count_distinct_characters_9(self):
        """
        Test case 9 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 70

    def test_count_distinct_characters_10(self):
        """
        Test case 10 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 70

# id_16_Test.py
from original.id_16 import count_distinct_characters

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`original.id_16.count_distinct_characters`.
    """
		
    def test_count_distinct_characters_1(self):
        """
        Test case 1 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('xyzXYZ') == 3

    def test_count_distinct_characters_2(self):
        """
        Test case 2 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('Jerry') == 4

    def test_count_distinct_characters_3(self):
        """
        Test case 3 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('Tom') == 2

    def test_count_distinct_characters_4(self):
        """
        Test case 4 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyz') == 26

    def test_count_distinct_characters_5(self):
        """
        Test case 5 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('ABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_6(self):
        """
        Test case 6 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_7(self):
        """
        Test case 7 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789') == 36

    def test_count_distinct_characters_8(self):
        """
        Test case 8 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 70

    def test_count_distinct_characters_9(self):
        """
        Test case 9 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 70

    def test_count_distinct_characters_10(self):
        """
        Test case 10 for :func:`original.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 70

# id_17.java

/**
 * Given a string, find out how many distinct characters (regardless of case) does it consist of
 * @param string
 * @return
 */
public static int countDistinctCharacters(String string) {
    return (int) string.chars().map(Character::toLowerCase).distinct().count();
}

# id_17.py


def count_distinct_characters(string: str) -> int:
    """ Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> count_distinct_characters('xyzXYZ')
    3
    >>> count