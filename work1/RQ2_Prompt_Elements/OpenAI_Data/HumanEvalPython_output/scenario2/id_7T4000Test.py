# id_7_Test.java
from scenario2.id_7 import filter_by_substring

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`scenario2.id_7.filter_by_substring`.
    """


    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello") == ["hello", "hello world"]

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "world") == ["world", "hello world"]

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world") == ["hello world"]

    def test_filter_by_substring_4(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world!") == []

    def test_filter_by_substring_5(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "") == ["hello", "world", "hello world"]

    def test_filter_by_substring_6(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], " ") == ["hello world"]

    def test_filter_by_substring_7(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "l") == ["hello", "hello world"]

    def test_filter_by_substring_8(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "o") == ["hello", "world", "hello world"]

    def test_filter_by_substring_9(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "d") == ["world"]

    def test_filter_by_substring_10(self):
        """
        Test case for the :func:`scenario2.id_7.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "r") == ["world", "hello world"]

# id_8.py
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    
    """

    return [x for x in strings if substring in x]

# id_8_Test.java
from scenario2.id_8 import filter_by_substring

import pytest

class id_8_Test:
    """
    Test class of id_8.py.
    It contains ten unit test cases for the :func:`scenario2.id_8.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello") == ["hello", "hello world"]

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "world") == ["world", "hello world"]

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world") == ["hello world"]

    def test_filter_by_substring_4(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world!") == []

    def test_filter_by_substring_5(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "") == ["hello", "world", "hello world"]

    def test_filter_by_substring_6(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], " ") == ["hello world"]

    def test_filter_by_substring_7(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "l") == ["hello", "hello world"]

    def test_filter_by_substring_8(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "o") == ["hello", "world", "hello world"]

    def test_filter_by_substring_9(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "d") == ["world"]

    def test_filter_by_substring_10(self):
        """
        Test case for the :func:`scenario2.id_8.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "r") == ["world", "hello world"]

# id_9.py
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    
    """

    return [x for x in strings if substring in x]

# id_9_Test.java
from scenario2.id_9 import filter_by_substring

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario2.id_9.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello") == ["hello", "hello world"]

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "world") == ["world", "hello world"]

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world") == ["hello world"]

    def test_filter_by_substring_4(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world!") == []

    def test_filter_by_substring_5(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "") == ["hello", "world", "hello world"]

    def test_filter_by_substring_6(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], " ") == ["hello world"]

    def test_filter_by_substring_7(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "l") == ["hello", "hello world"]

    def test_filter_by_substring_8(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "o") == ["hello", "world", "hello world"]

    def test_filter_by_substring_9(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "d") == ["world"]

    def test_filter_by_substring_10(self):
        """
        Test case for the :func:`scenario2.id_9.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "r") == ["world", "hello world"]

# id_10.py
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    
    """

    return [x for x in strings if substring in x]

# id_10_Test.java
from scenario2.id_10 import filter_by_substring

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario2.id_10.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello") == ["hello", "hello world"]

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "world") == ["world", "hello world"]

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world") == ["hello world"]

    def test_filter_by_substring_4(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world!") == []

    def test_filter_by_substring_5(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "") == ["hello", "world", "hello world"]

    def test_filter_by_substring_6(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], " ") == ["hello world"]

    def test_filter_by_substring_7(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "l") == ["hello", "hello world"]

    def test_filter_by_substring_8(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "o") == ["hello", "world", "hello world"]

    def test_filter_by_substring_9(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "d") == ["world"]

    def test_filter_by_substring_10(self):
        """
        Test case for the :func:`scenario2.id_10.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "r") == ["world", "hello world"]

# id_11.py
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    
    """

    return [x for x in strings if substring in x]

# id_11_Test.java
from scenario2.id_11 import filter_by_substring

import pytest

class id_11_Test:
    """
    Test class of id_11.py.
    It contains ten unit test cases for the :func:`scenario2.id_11.filter_by_substring`.
    """
		
    def test_filter_by_substring_1(self):
        """
        Test case for the :func:`scenario2.id_11.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello") == ["hello", "hello world"]

    def test_filter_by_substring_2(self):
        """
        Test case for the :func:`scenario2.id_11.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "world") == ["world", "hello world"]

    def test_filter_by_substring_3(self):
        """
        Test case for the :func:`scenario2.id_11.filter_by_substring`.
        """
        assert filter_by_substring(["hello", "world", "hello world"], "hello world") == ["hello world"]

    def test_filter_by_substring_4(self):
        """
        Test case for