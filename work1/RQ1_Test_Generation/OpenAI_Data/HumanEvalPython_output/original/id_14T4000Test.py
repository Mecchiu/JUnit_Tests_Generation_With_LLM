# id_14_Test.java
from original.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`original.id_14.all_prefixes`.
    """


    def test_all_prefixes_1(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abc') == ['a', 'ab', 'abc']

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcd') == ['a', 'ab', 'abc', 'abcd']

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde']

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef']

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefg') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg']

    def test_all_prefixes_6(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefgh') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh']

    def test_all_prefixes_7(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghi') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi']

    def test_all_prefixes_8(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghij') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij']

    def test_all_prefixes_9(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijk') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk']

    def test_all_prefixes_10(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijkl') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl']

# id_14_Test.py
from original.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`original.id_14.all_prefixes`.
    """
		
    def test_all_prefixes_1(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abc') == ['a', 'ab', 'abc']

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcd') == ['a', 'ab', 'abc', 'abcd']

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde']

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef']

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefg') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg']

    def test_all_prefixes_6(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefgh') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh']

    def test_all_prefixes_7(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghi') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi']

    def test_all_prefixes_8(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghij') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij']

    def test_all_prefixes_9(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijk') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk']

    def test_all_prefixes_10(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijkl') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl']

# id_14_Test.java
from original.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`original.id_14.all_prefixes`.
    """
		
    def test_all_prefixes_1(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abc') == ['a', 'ab', 'abc']

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcd') == ['a', 'ab', 'abc', 'abcd']

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde']

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef']

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefg') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg']

    def test_all_prefixes_6(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefgh') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh']

    def test_all_prefixes_7(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghi') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi']

    def test_all_prefixes_8(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghij') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij']

    def test_all_prefixes_9(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijk') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk']

    def test_all_prefixes_10(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijkl') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl']

# id_14_Test.py
from original.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`original.id_14.all_prefixes`.
    """
		
    def test_all_prefixes_1(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abc') == ['a', 'ab', 'abc']

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcd') == ['a', 'ab', 'abc', 'abcd']

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde']

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef']

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefg') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg']

    def test_all_prefixes_6(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefgh') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh']

    def test_all_prefixes_7(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghi') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi']

    def test_all_prefixes_8(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghij') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij']

    def test_all_prefixes_9(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijk') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk']

    def test_all_prefixes_10(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdefghijkl') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef', 'abcdefg', 'abcdefgh', 'abcdefghi', 'abcdefghij', 'abcdefghijk', 'abcdefghijkl']

# id_14_Test.java
from original.id_14 import all_prefixes

import pytest

class id_14_Test:
    """
    Test class of id_14.py.
    It contains ten unit test cases for the :func:`original.id_14.all_prefixes`.
    """
		
    def test_all_prefixes_1(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abc') == ['a', 'ab', 'abc']

    def test_all_prefixes_2(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcd') == ['a', 'ab', 'abc', 'abcd']

    def test_all_prefixes_3(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcde') == ['a', 'ab', 'abc', 'abcd', 'abcde']

    def test_all_prefixes_4(self):
        """
        Test case for the :func:`original.id_14.all_prefixes`.
        """
        assert all_prefixes('abcdef') == ['a', 'ab', 'abc', 'abcd', 'abcde', 'abcdef']

    def test_all_prefixes_5(self):
        """
        Test case for the :func:`original.id_14.all_prefixes