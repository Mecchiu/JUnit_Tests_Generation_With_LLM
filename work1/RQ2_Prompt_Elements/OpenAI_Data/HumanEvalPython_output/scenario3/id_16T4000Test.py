# id_16_Test.java
from scenario3.id_16 import count_distinct_characters

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`scenario3.id_16.count_distinct_characters`.
    """


    def test_count_distinct_characters_1(self):
        """
        Test case 1 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('xyzXYZ') == 3

    def test_count_distinct_characters_2(self):
        """
        Test case 2 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('Jerry') == 4

    def test_count_distinct_characters_3(self):
        """
        Test case 3 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('Tom') == 2

    def test_count_distinct_characters_4(self):
        """
        Test case 4 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyz') == 26

    def test_count_distinct_characters_5(self):
        """
        Test case 5 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('ABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_6(self):
        """
        Test case 6 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ') == 52

    def test_count_distinct_characters_7(self):
        """
        Test case 7 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789') == 62

    def test_count_distinct_characters_8(self):
        """
        Test case 8 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

    def test_count_distinct_characters_9(self):
        """
        Test case 9 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

    def test_count_distinct_characters_10(self):
        """
        Test case 10 for :func:`scenario3.id_16.count_distinct_characters`.
        """
        assert count_distinct_characters('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

# id_17.py


def count_distinct_characters_in_a_string(string: str) -> int:
    """ Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> count_distinct_characters_in_a_string('xyzXYZ')
    3
    >>> count_distinct_characters_in_a_string('Jerry')
    4
    """

    pass

# id_17_Test.java
from scenario3.id_17 import count_distinct_characters_in_a_string

import pytest

class id_17_Test:
    """
    Test class of id_17.py.
    It contains ten unit test cases for the :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
    """
		
    def test_count_distinct_characters_in_a_string_1(self):
        """
        Test case 1 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('xyzXYZ') == 3

    def test_count_distinct_characters_in_a_string_2(self):
        """
        Test case 2 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('Jerry') == 4

    def test_count_distinct_characters_in_a_string_3(self):
        """
        Test case 3 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('Tom') == 2

    def test_count_distinct_characters_in_a_string_4(self):
        """
        Test case 4 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyz') == 26

    def test_count_distinct_characters_in_a_string_5(self):
        """
        Test case 5 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('ABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_in_a_string_6(self):
        """
        Test case 6 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ') == 52

    def test_count_distinct_characters_in_a_string_7(self):
        """
        Test case 7 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789') == 62

    def test_count_distinct_characters_in_a_string_8(self):
        """
        Test case 8 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

    def test_count_distinct_characters_in_a_string_9(self):
        """
        Test case 9 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

    def test_count_distinct_characters_in_a_string_10(self):
        """
        Test case 10 for :func:`scenario3.id_17.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

# id_18.py


def count_distinct_characters_in_a_string(string: str) -> int:
    """ Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> count_distinct_characters_in_a_string('xyzXYZ')
    3
    >>> count_distinct_characters_in_a_string('Jerry')
    4
    """

    pass

# id_18_Test.java
from scenario3.id_18 import count_distinct_characters_in_a_string

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
    """
		
    def test_count_distinct_characters_in_a_string_1(self):
        """
        Test case 1 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('xyzXYZ') == 3

    def test_count_distinct_characters_in_a_string_2(self):
        """
        Test case 2 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('Jerry') == 4

    def test_count_distinct_characters_in_a_string_3(self):
        """
        Test case 3 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('Tom') == 2

    def test_count_distinct_characters_in_a_string_4(self):
        """
        Test case 4 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyz') == 26

    def test_count_distinct_characters_in_a_string_5(self):
        """
        Test case 5 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('ABCDEFGHIJKLMNOPQRSTUVWXYZ') == 26

    def test_count_distinct_characters_in_a_string_6(self):
        """
        Test case 6 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ') == 52

    def test_count_distinct_characters_in_a_string_7(self):
        """
        Test case 7 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789') == 62

    def test_count_distinct_characters_in_a_string_8(self):
        """
        Test case 8 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

    def test_count_distinct_characters_in_a_string_9(self):
        """
        Test case 9 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

    def test_count_distinct_characters_in_a_string_10(self):
        """
        Test case 10 for :func:`scenario3.id_18.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?`~') == 94

# id_19.py


def count_distinct_characters_in_a_string(string: str) -> int:
    """ Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> count_distinct_characters_in_a_string('xyzXYZ')
    3
    >>> count_distinct_characters_in_a_string('Jerry')
    4
    """

    pass

# id_19_Test.java
from scenario3.id_19 import count_distinct_characters_in_a_string

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario3.id_19.count_distinct_characters_in_a_string`.
    """
		
    def test_count_distinct_characters_in_a_string_1(self):
        """
        Test case 1 for :func:`scenario3.id_19.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('xyzXYZ') == 3

    def test_count_distinct_characters_in_a_string_2(self):
        """
        Test case 2 for :func:`scenario3.id_19.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('Jerry') == 4

    def test_count_distinct_characters_in_a_string_3(self):
        """
        Test case 3 for :func:`scenario3.id_19.count_distinct_characters_in_a_string`.
        """
        assert count_distinct_characters_in_a_string('Tom') == 2

    def test_count_distinct_characters_in_a_string_4(self):
        """
        Test case 4 for :func:`scenario3.id_19.count_distinct_characters_in_a_string`.
        """
        assert