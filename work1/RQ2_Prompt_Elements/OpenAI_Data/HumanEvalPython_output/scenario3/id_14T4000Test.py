# id_14_Test.java
from scenario3.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`scenario3.id_14.all_prefixes`.
    """


    def test_all_prefixes_1(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abc') == ['a', 'ab', 'abc']

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcd') == ['a', 'ab', 'abc', 'abcd']

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde']

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef']

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefg') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg']

    def test_all_prefixes_6(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefgh') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh']

    def test_all_prefixes_7(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghi') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi']

    def test_all_prefixes_8(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghij') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij']

    def test_all_prefixes_9(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijk') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk']

    def test_all_prefixes_10(self):
        """
        Test case for the :func:`scenario3.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijkl') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl']

# id_15.py
from typing import List


def all_suffixes(string: str) -> List[str]:
    """ Return list of all suffixes from shortest to longest of the input string
    >>> all_suffixes('abc')
    ['c', 'bc', 'abc']
    """

    pass

# id_15_Test.java
from scenario3.id_15 import all_suffixes

import pytest

class id_15_Test:
    """
    Test class of id_15.py.
    It contains ten unit test cases for the :func:`scenario3.id_15.all_suffixes`.
    """
		
    def test_all_suffixes_1(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abc') == ['c', 'bc', 'abc']

    def test_all_suffixes_2(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcd') == ['d', 'cd', 'bcd', 'abcd']

    def test_all_suffixes_3(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcde') == ['e', 'de', 'cde', 'bde', 'abde', 'abcde']

    def test_all_suffixes_4(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdef') == ['f', 'ef', 'def', 'cdef', 'bdef', 'abdef', 'abcdef']

    def test_all_suffixes_5(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdefg') == ['g', 'fg', 'efg', 'defg', 'cdefg', 'bdefg', 'abdefg', 'abcdefg']

    def test_all_suffixes_6(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdefgh') == ['h', 'gh', 'fgh', 'efgh', 'defgh', 'cdefgh', 'bdefgh', 'abdefgh', 'abcdefgh']

    def test_all_suffixes_7(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdefghi') == ['i', 'hi', 'ghi', 'fghi', 'efghi', 'defghi', 'cdefghi', 'bdefghi', 'abdefghi', 'abcdefghi']

    def test_all_suffixes_8(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdefghij') == ['j', 'ij', 'hij', 'gij', 'fgij', 'efgij', 'defgij', 'cdefgij', 'bdefgij', 'abdefgij', 'abcdefgij']

    def test_all_suffixes_9(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdefghijk') == ['k', 'jk', 'ijk', 'hijk', 'gijk', 'fgijk', 'efgijk', 'defgijk', 'cdefgijk', 'bdefgijk', 'abdefgijk', 'abcdefgijk']

    def test_all_suffixes_10(self):
        """
        Test case for the :func:`scenario3.id_15.all_suffixes`.
        """
        assert all_suffixes('abcdefghijkl') == ['l', 'kl', 'jkl', 'ijkl', 'hijkl', 'gijkl', 'fgijkl', 'efgijkl', 'defgijkl', 'cdefgijkl', 'bdefgijkl', 'abdefgijkl', 'abcdefgijkl']

# id_16.py
from typing import List


def all_substrings(string: str) -> List[str]:
    """ Return list of all substrings from shortest to longest of the input string
    >>> all_substrings('abc')
    ['a', 'ab', 'abc', 'b', 'bc', 'c']
    """

    pass

# id_16_Test.java
from scenario3.id_16 import all_substrings

import pytest

class id_16_Test:
    """
    Test class of id_16.py.
    It contains ten unit test cases for the :func:`scenario3.id_16.all_substrings`.
    """
		
    def test_all_substrings_1(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abc') == ['a', 'ab', 'abc', 'b', 'bc', 'c']

    def test_all_substrings_2(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcd') == ['a', 'ab', 'abc', 'abcd', 'b', 'bc', 'bcd', 'c', 'cd', 'd']

    def test_all_substrings_3(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'b', 'bc', 'bcd', 'bcde', 'c', 'cd', 'cde', 'd', 'de', 'e']

    def test_all_substrings_4(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'c', 'cd', 'cde', 'cdef', 'd', 'de', 'def', 'e', 'ef', 'f']

    def test_all_substrings_5(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdefg') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'bcdefg', 'c', 'cd', 'cde', 'cdef', 'cdefg', 'd', 'de', 'def', 'defg', 'e', 'ef', 'efg', 'f', 'fg', 'g']

    def test_all_substrings_6(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdefgh') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'bcdefg', 'bcdefgh', 'c', 'cd', 'cde', 'cdef', 'cdefg', 'cdefgh', 'd', 'de', 'def', 'defg', 'defgh', 'e', 'ef', 'efg', 'efgh', 'f', 'fg', 'fgh', 'g', 'gh', 'h']

    def test_all_substrings_7(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdefghi') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'bcdefg', 'bcdefgh', 'bcdefghi', 'c', 'cd', 'cde', 'cdef', 'cdefg', 'cdefgh', 'cdefghi', 'd', 'de', 'def', 'defg', 'defgh', 'defghi', 'e', 'ef', 'efg', 'efgh', 'efghi', 'f', 'fg', 'fgh', 'fghi', 'g', 'gh', 'ghi', 'h', 'hi', 'i']

    def test_all_substrings_8(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdefghij') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'bcdefg', 'bcdefgh', 'bcdefghi', 'bcdefghij', 'c', 'cd', 'cde', 'cdef', 'cdefg', 'cdefgh', 'cdefghi', 'cdefghij', 'd', 'de', 'def', 'defg', 'defgh', 'defghi', 'defghij', 'e', 'ef', 'efg', 'efgh', 'efghi', 'efghij', 'f', 'fg', 'fgh', 'fghi', 'fghij', 'g', 'gh', 'ghi', 'ghij', 'h', 'hi', 'hij', 'i', 'ij', 'j']

    def test_all_substrings_9(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdefghijk') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'bcdefg', 'bcdefgh', 'bcdefghi', 'bcdefghij', 'bcdefghijk', 'c', 'cd', 'cde', 'cdef', 'cdefg', 'cdefgh', 'cdefghi', 'cdefghij', 'cdefghijk', 'd', 'de', 'def', 'defg', 'defgh', 'defghi', 'defghij', 'defghijk', 'e', 'ef', 'efg', 'efgh', 'efghi', 'efghij', 'efghijk', 'f', 'fg', 'fgh', 'fghi', 'fghij', 'fghijk', 'g', 'gh', 'ghi', 'ghij', 'ghijk', 'h', 'hi', 'hij', 'hijk', 'i', 'ij', 'ijk', 'j', 'jk', 'k']

    def test_all_substrings_10(self):
        """
        Test case for the :func:`scenario3.id_16.all_substrings`.
        """
        assert all_substrings('abcdefghijkl') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl', 'b', 'bc', 'bcd', 'bcde', 'bcdef', 'bcdefg', 'bcdefgh', 'bcdefghi', 'bcdefghij', 'bcdefghijk', 'bcdefghijkl', 'c', 'cd', 'cde', 'cdef', 'cdefg', 'cdefgh', 'cdefghi', 'cdefghij', 'cdefghijk', 'cdefghijkl', 'd', 'de', 'def', 'defg', 'defgh', 'defghi', 'defghij', 'defghijk', 'defghijkl', 'e', 'ef', 'efg', 'efgh', 'efghi