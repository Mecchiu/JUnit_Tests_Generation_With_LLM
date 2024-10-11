# id_6_Test.java
from scenario1.id_6 import parse_nested_parens

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario1.id_6.parse_nested_parens`.
    """


    def test_parse_nested_parens_1(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("(())") == [1, 1]

    def test_parse_nested_parens_2(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("((()))") == [2, 2]

    def test_parse_nested_parens_3(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_4(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("()") == [0, 0]

    def test_parse_nested_parens_5(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("") == []

    def test_parse_nested_parens_6(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("()()") == [0, 0, 0, 0]

    def test_parse_nested_parens_7(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("(()())") == [1, 1, 1, 1]

    def test_parse_nested_parens_8(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_9(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("((()()()))") == [3, 3, 3]

    def test_parse_nested_parens_10(self):
        """
        Test case for the :func:`scenario1.id_6.parse_nested_parens`.
        """
        assert parse_nested_parens("(((()()())))") == [4, 4]

# id_7.py
from typing import List


def parse_nested_parens(paren_string: str) -> List[int]:

    def parse_paren_group(s):
        depth = 0
        max_depth = 0
        for c in s:
            if c == '(':
                depth += 1
                max_depth = max(depth, max_depth)
            else:
                depth -= 1

        return max_depth

    return [parse_paren_group(x) for x in paren_string.split(' ') if x]

# id_7_Test.java
from scenario1.id_7 import parse_nested_parens

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`scenario1.id_7.parse_nested_parens`.
    """
		
    def test_parse_nested_parens_1(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("(())") == [1, 1]

    def test_parse_nested_parens_2(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("((()))") == [2, 2]

    def test_parse_nested_parens_3(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_4(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("()") == [0, 0]

    def test_parse_nested_parens_5(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("") == []

    def test_parse_nested_parens_6(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("()()") == [0, 0, 0, 0]

    def test_parse_nested_parens_7(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("(()())") == [1, 1, 1, 1]

    def test_parse_nested_parens_8(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_9(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("((()()()))") == [3, 3, 3]

    def test_parse_nested_parens_10(self):
        """
        Test case for the :func:`scenario1.id_7.parse_nested_parens`.
        """
        assert parse_nested_parens("(((()()())))") == [4, 4]

# id_8.py
from typing import List


def parse_nested_parens(paren_string: str) -> List[int]:

    def parse_paren_group(s):
        depth = 0
        max_depth = 0
        for c in s:
            if c == '(':
                depth += 1
                max_depth = max(depth, max_depth)
            else:
                depth -= 1

        return max_depth

    return [parse_paren_group(x) for x in paren_string.split(' ') if x]

# id_8_Test.java
from scenario1.id_8 import parse_nested_parens

import pytest

class id_8_Test:
    """
    Test class of id_8.py.
    It contains ten unit test cases for the :func:`scenario1.id_8.parse_nested_parens`.
    """
		
    def test_parse_nested_parens_1(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("(())") == [1, 1]

    def test_parse_nested_parens_2(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("((()))") == [2, 2]

    def test_parse_nested_parens_3(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_4(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("()") == [0, 0]

    def test_parse_nested_parens_5(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("") == []

    def test_parse_nested_parens_6(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("()()") == [0, 0, 0, 0]

    def test_parse_nested_parens_7(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("(()())") == [1, 1, 1, 1]

    def test_parse_nested_parens_8(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_9(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("((()()()))") == [3, 3, 3]

    def test_parse_nested_parens_10(self):
        """
        Test case for the :func:`scenario1.id_8.parse_nested_parens`.
        """
        assert parse_nested_parens("(((()()())))") == [4, 4]

# id_9.py
from typing import List


def parse_nested_parens(paren_string: str) -> List[int]:

    def parse_paren_group(s):
        depth = 0
        max_depth = 0
        for c in s:
            if c == '(':
                depth += 1
                max_depth = max(depth, max_depth)
            else:
                depth -= 1

        return max_depth

    return [parse_paren_group(x) for x in paren_string.split(' ') if x]

# id_9_Test.java
from scenario1.id_9 import parse_nested_parens

import pytest

class id_9_Test:
    """
    Test class of id_9.py.
    It contains ten unit test cases for the :func:`scenario1.id_9.parse_nested_parens`.
    """
		
    def test_parse_nested_parens_1(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("(())") == [1, 1]

    def test_parse_nested_parens_2(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("((()))") == [2, 2]

    def test_parse_nested_parens_3(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_4(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("()") == [0, 0]

    def test_parse_nested_parens_5(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("") == []

    def test_parse_nested_parens_6(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("()()") == [0, 0, 0, 0]

    def test_parse_nested_parens_7(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("(()())") == [1, 1, 1, 1]

    def test_parse_nested_parens_8(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_9(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("((()()()))") == [3, 3, 3]

    def test_parse_nested_parens_10(self):
        """
        Test case for the :func:`scenario1.id_9.parse_nested_parens`.
        """
        assert parse_nested_parens("(((()()())))") == [4, 4]

# id_10.py
from typing import List


def parse_nested_parens(paren_string: str) -> List[int]:

    def parse_paren_group(s):
        depth = 0
        max_depth = 0
        for c in s:
            if c == '(':
                depth += 1
                max_depth = max(depth, max_depth)
            else:
                depth -= 1

        return max_depth

    return [parse_paren_group(x) for x in paren_string.split(' ') if x]

# id_10_Test.java
from scenario1.id_10 import parse_nested_parens

import pytest

class id_10_Test:
    """
    Test class of id_10.py.
    It contains ten unit test cases for the :func:`scenario1.id_10.parse_nested_parens`.
    """
		
    def test_parse_nested_parens_1(self):
        """
        Test case for the :func:`scenario1.id_10.parse_nested_parens`.
        """
        assert parse_nested_parens("(())") == [1, 1]

    def test_parse_nested_parens_2(self):
        """
        Test case for the :func:`scenario1.id_10.parse_nested_parens`.
        """
        assert parse_nested_parens("((()))") == [2, 2]

    def test_parse_nested_parens_3(self):
        """
        Test case for the :func:`scenario1.id_10.parse_nested_parens`.
        """
        assert parse_nested_parens("(((())))") == [3, 3]

    def test_parse_nested_parens_4(self):
        """
        Test case for the :func:`scenario1.id_10.parse_nested_parens`.
        """
        assert parse_nested_parens("()") == [0, 0]

    def test_parse