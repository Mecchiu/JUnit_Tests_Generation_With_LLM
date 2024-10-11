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


def all_