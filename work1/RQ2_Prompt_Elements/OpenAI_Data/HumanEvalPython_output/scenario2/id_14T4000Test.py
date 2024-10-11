# id_14_Test.java
from scenario2.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`scenario2.id_14.all_prefixes`.
    """


    def test_all_prefixes_1(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("") == []

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("a") == ["a"]

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("ab") == ["a", "ab"]

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abc") == ["a", "ab", "abc"]

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abcd") == ["a", "ab", "abc", "abcd"]

    def test_all_prefixes_6(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abcde") == ["a", "ab", "abc", "abcd", "abcde"]

    def test_all_prefixes_7(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abcdef") == ["a", "ab", "abc", "abcd", "abcde", "abcdef"]

    def test_all_prefixes_8(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abcdefg") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg"]

    def test_all_prefixes_9(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abcdefgh") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh"]

    def test_all_prefixes_10(self):
        """
        Test case for the :func:`scenario2.id_14.all_prefixes` function.
        """
        assert all_prefixes("abcdefghi") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi"]

# id_15.py
from typing import List


def all_suffixes(string: str) -> List[str]:
    """ Return list of all suffixes from shortest to longest of the input string
    
    """

    result = []

    for i in range(len(string)):
        result.append(string[i:])
    return result

# id_15_Test.java
from scenario2.id_15 import all_suffixes

import pytest

class id_15_Test:
    """
    Test class of id_15.py.
    It contains ten unit test cases for the :func:`scenario2.id_15.all_suffixes`.
    """
		
    def test_all_suffixes_1(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("") == []

    def test_all_suffixes_2(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("a") == ["a"]

    def test_all_suffixes_3(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("ab") == ["ab", "b"]

    def test_all_suffixes_4(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abc") == ["abc", "bc", "c"]

    def test_all_suffixes_5(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abcd") == ["abcd", "bcd", "cd", "d"]

    def test_all_suffixes_6(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abcde") == ["abcde", "bcde", "cde", "de", "e"]

    def test_all_suffixes_7(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abcdef") == ["abcdef", "bcdef", "cdef", "def", "ef", "f"]

    def test_all_suffixes_8(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abcdefg") == ["abcdefg", "bcdefg", "cdefg", "defg", "efg", "fg", "g"]

    def test_all_suffixes_9(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abcdefgh") == ["abcdefgh", "bcdefgh", "cdefgh", "defgh", "efgh", "fgh", "gh", "h"]

    def test_all_suffixes_10(self):
        """
        Test case for the :func:`scenario2.id_15.all_suffixes` function.
        """
        assert all_suffixes("abcdefghi") == ["abcdefghi", "bcdefghi", "cdefghi", "defghi", "efghi", "fghi", "ghi", "hi", "i"]

# id_16.py
from typing import List


def all_substrings(string: str) -> List[str]:
    """ Return list of all substrings from shortest to longest of the input string
    
    """

    result = []

    for i in range(len(string)):
        for j in range(i+1, len(string)+1):
            result.append(string[i:j])
    return result

# id_16_Test.java
from scenario2.id_16 import all_substrings

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`scenario2.id_16.all_substrings`.
    """
		
    def test_all_substrings_1(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("") == []

    def test_all_substrings_2(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("a") == ["a"]

    def test_all_substrings_3(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("ab") == ["a", "ab", "b"]

    def test_all_substrings_4(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abc") == ["a", "ab", "abc", "b", "bc", "c"]

    def test_all_substrings_5(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abcd") == ["a", "ab", "abc", "abcd", "b", "bc", "bcd", "c", "cd", "d"]

    def test_all_substrings_6(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abcde") == ["a", "ab", "abc", "abcd", "abcde", "b", "bc", "bcd", "bcde", "c", "cd", "cde", "d", "de", "e"]

    def test_all_substrings_7(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abcdef") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "b", "bc", "bcd", "bcde", "bcdef", "c", "cd", "cde", "cdef", "d", "de", "def", "e", "ef", "f"]

    def test_all_substrings_8(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abcdefg") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "b", "bc", "bcd", "bcde", "bcdef", "bcdefg", "c", "cd", "cde", "cdef", "cdefg", "d", "de", "def", "defg", "e", "ef", "efg", "f", "fg", "g"]

    def test_all_substrings_9(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abcdefgh") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "b", "bc", "bcd", "bcde", "bcdef", "bcdefg", "bcdefgh", "c", "cd", "cde", "cdef", "cdefg", "cdefgh", "d", "de", "def", "defg", "defgh", "e", "ef", "efg", "efgh", "f", "fg", "fgh", "g", "gh", "h"]

    def test_all_substrings_10(self):
        """
        Test case for the :func:`scenario2.id_16.all_substrings` function.
        """
        assert all_substrings("abcdefghi") == ["a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "b", "bc", "bcd", "bcde", "bcdef", "bcdefg", "bcdefgh", "bcdefghi", "c", "cd", "cde", "cdef", "cdefg", "cdefgh", "cdefghi", "d", "de", "def", "defg", "defgh", "defghi", "e", "ef", "efg", "efgh", "efghi", "f", "fg", "fgh", "fghi", "g", "gh", "ghi", "h", "hi", "i"]

# id_17.py
from typing import List


def all_substrings_with_length(string: str, length: int) -> List[str]:
    """ Return list of all substrings of the input string with the given length
    
    """

    result = []

    for i in range(len(string)):
        if i+length <= len(string):
            result.append(string[i:i+length])
    return result

# id_17_Test.java
from scenario2.id_17 import all_substrings_with_length

import pytest

class id_17_Test:
    """
    Test class of id_17.py.
    It contains ten unit test cases for the :func:`scenario2.id_17.all_substrings_with_length`.
    """
		
    def test_all_substrings_with_length_1(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("", 0) == []

    def test_all_substrings_with_length_2(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("a", 0) == []

    def test_all_substrings_with_length_3(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("ab", 0) == []

    def test_all_substrings_with_length_4(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abc", 0) == []

    def test_all_substrings_with_length_5(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abcd", 0) == []

    def test_all_substrings_with_length_6(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abcde", 0) == []

    def test_all_substrings_with_length_7(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abcdef", 0) == []

    def test_all_substrings_with_length_8(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abcdefg", 0) == []

    def test_all_substrings_with_length_9(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abcdefgh", 0) == []

    def test_all_substrings_with_length_10(self):
        """
        Test case for the :func:`scenario2.id_17.all_substrings_with_length` function.
        """
        assert all_substrings_with_length("abcdefghi", 0) == []

# id_18.py
from typing import List


def all_substrings_with_length_at_least(string: str, length: int) -> List[str]:
    """ Return list of all substrings of the input