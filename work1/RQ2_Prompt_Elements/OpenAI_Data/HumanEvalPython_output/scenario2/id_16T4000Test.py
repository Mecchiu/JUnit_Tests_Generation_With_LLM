# id_16_Test.java
from scenario2.id_16 import count_distinct_characters

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`scenario2.id_16.count_distinct_characters`.
    """


    def test_count_distinct_characters_1(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("") == 0
		
    def test_count_distinct_characters_2(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("a") == 1
		
    def test_count_distinct_characters_3(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("aa") == 1
		
    def test_count_distinct_characters_4(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("ab") == 2
		
    def test_count_distinct_characters_5(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("abc") == 3
		
    def test_count_distinct_characters_6(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("aBc") == 3
		
    def test_count_distinct_characters_7(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("aBcD") == 4
		
    def test_count_distinct_characters_8(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("aBcDd") == 4
		
    def test_count_distinct_characters_9(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("aBcDdE") == 5
		
    def test_count_distinct_characters_10(self):
        """
        Test case for the :func:`scenario2.id_16.count_distinct_characters` function.
        """
        assert count_distinct_characters("aBcDdEe") == 5
		
# id_17.py


def count_distinct_characters_in_string_list(string_list: list) -> int:
    """ Given a list of strings, find out how many distinct characters (regardless of case) does it consist of
    
    
    """

    return len(set("".join(string_list).lower()))

# id_17_Test.java
from scenario2.id_17 import count_distinct_characters_in_string_list

import pytest

class id_17_Test:
    """
    Test class of id_17.py.
    It contains ten unit test cases for the :func:`scenario2.id_17.count_distinct_characters_in_string_list`.
    """
		
    def test_count_distinct_characters_in_string_list_1(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list([]) == 0
		
    def test_count_distinct_characters_in_string_list_2(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a"]) == 1
		
    def test_count_distinct_characters_in_string_list_3(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "a"]) == 1
		
    def test_count_distinct_characters_in_string_list_4(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b"]) == 2
		
    def test_count_distinct_characters_in_string_list_5(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b", "c"]) == 3
		
    def test_count_distinct_characters_in_string_list_6(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b", "c", "d"]) == 4
		
    def test_count_distinct_characters_in_string_list_7(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b", "c", "d", "e"]) == 5
		
    def test_count_distinct_characters_in_string_list_8(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b", "c", "d", "e", "f"]) == 6
		
    def test_count_distinct_characters_in_string_list_9(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b", "c", "d", "e", "f", "g"]) == 7
		
    def test_count_distinct_characters_in_string_list_10(self):
        """
        Test case for the :func:`scenario2.id_17.count_distinct_characters_in_string_list` function.
        """
        assert count_distinct_characters_in_string_list(["a", "b", "c", "d", "e", "f", "g", "h"]) == 8
		
# id_18.py


def count_distinct_characters_in_string_list_with_length_greater_than_n(string_list: list, n: int) -> int:
    """ Given a list of strings, find out how many distinct characters (regardless of case) does it consist of
    
    
    """

    return len(set("".join([string for string in string_list if len(string) > n]).lower()))

# id_18_Test.java
from scenario2.id_18 import count_distinct_characters_in_string_list_with_length_greater_than_n

import pytest

class id_18_Test:
    """
    Test class of id_18.py.
    It contains ten unit test cases for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n`.
    """
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_1(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n([], 0) == 0
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_2(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a"], 0) == 1
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_3(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "a"], 0) == 1
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_4(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b"], 0) == 2
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_5(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b", "c"], 0) == 3
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_6(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b", "c", "d"], 0) == 4
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_7(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b", "c", "d", "e"], 0) == 5
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_8(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b", "c", "d", "e", "f"], 0) == 6
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_9(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b", "c", "d", "e", "f", "g"], 0) == 7
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_10(self):
        """
        Test case for the :func:`scenario2.id_18.count_distinct_characters_in_string_list_with_length_greater_than_n` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n(["a", "b", "c", "d", "e", "f", "g", "h"], 0) == 8
		
# id_19.py


def count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a(string_list: list, n: int) -> int:
    """ Given a list of strings, find out how many distinct characters (regardless of case) does it consist of
    
    
    """

    return len(set("".join([string for string in string_list if len(string) > n and string.startswith("a")]).lower()))

# id_19_Test.java
from scenario2.id_19 import count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`scenario2.id_19.count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a`.
    """
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a_1(self):
        """
        Test case for the :func:`scenario2.id_19.count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a([], 0) == 0
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a_2(self):
        """
        Test case for the :func:`scenario2.id_19.count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a` function.
        """
        assert count_distinct_characters_in_string_list_with_length_greater_than_n_and_starting_with_a(["a"], 0) == 1
		
    def test_count_distinct_characters_in_string_list_with_length_greater_than_n