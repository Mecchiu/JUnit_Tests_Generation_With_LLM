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
       