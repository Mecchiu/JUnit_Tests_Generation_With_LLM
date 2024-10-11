# id_1_Test.java
from scenario1.id_1 import separate_paren_groups

import pytest

class id_1_Test:
    """
    Test class of id_1.py.
    It contains ten unit test cases for the :func:`scenario1.id_1.separate_paren_groups`.
    """


    def test_case_1(self):
        """
        Test case 1.
        """
        assert separate_paren_groups("()") == ["()"]

    def test_case_2(self):
        """
        Test case 2.
        """
        assert separate_paren_groups("(())") == ["(())"]

    def test_case_3(self):
        """
        Test case 3.
        """
        assert separate_paren_groups("()()") == ["()", "()"]

    def test_case_4(self):
        """
        Test case 4.
        """
        assert separate_paren_groups("(()())") == ["(()())"]

    def test_case_5(self):
        """
        Test case 5.
        """
        assert separate_paren_groups("(())(())") == ["(())", "(())"]

    def test_case_6(self):
        """
        Test case 6.
        """
        assert separate_paren_groups("(()()())") == ["(()())", "()"]

    def test_case_7(self):
        """
        Test case 7.
        """
        assert separate_paren_groups("(()()()())") == ["(()()())", "()"]

    def test_case_8(self):
        """
        Test case 8.
        """
        assert separate_paren_groups("(()()()()())") == ["(()()()())", "()"]

    def test_case_9(self):
        """
        Test case 9.
        """
        assert separate_paren_groups("(()()()()()())") == ["(()()()())", "(())"]

    def test_case_10(self):
        """
        Test case 10.
        """
        assert separate_paren_groups("(()()()()()()())") == ["(()()()())", "(())", "()"]

# id_2.py
from typing import List


def separate_paren_groups(paren_string: str) -> List[str]:

    result = []
    current_string = []
    current_depth = 0

    for c in paren_string:
        if c == '(':
            current_depth += 1
            current_string.append(c)
        elif c == ')':
            current_depth -= 1
            current_string.append(c)

            if current_depth == 0:
                result.append(''.join(current_string))
                current_string.clear()

    return result

# id_2_Test.java
from scenario1.id_2 import separate_paren_groups

import pytest

class id_2_Test:
    """
    Test class of id_2.py.
    It contains ten unit test cases for the :func:`scenario1.id_2.separate_paren_groups`.
    """
		
    def test_case_1(self):
        """
        Test case 1.
        """
        assert separate_paren_groups("()") == ["()"]

    def test_case_2(self):
        """
        Test case 2.
        """
        assert separate_paren_groups("(())") == ["(())"]

    def test_case_3(self):
        """
        Test case 3.
        """
        assert separate_paren_groups("()()") == ["()", "()"]

    def test_case_4(self):
        """
        Test case 4.
        """
        assert separate_paren_groups("(()())") == ["(()())"]

    def test_case_5(self):
        """
        Test case 5.
        """
        assert separate_paren_groups("(())(())") == ["(())", "(())"]

    def test_case_6(self):
        """
        Test case 6.
        """
        assert separate_paren_groups("(()()())") == ["(()())", "()"]

    def test_case_7(self):
        """
        Test case 7.
        """
        assert separate_paren_groups("(()()()())") == ["(()()())", "()"]

    def test_case_8(self):
        """
        Test case 8.
        """
        assert separate_paren_groups("(()()()()())") == ["(()()()())", "()"]

    def test_case_9(self):
        """
        Test case 9.
        """
        assert separate_paren_groups("(()()()()()())") == ["(()()()())", "(())"]

    def test_case_10(self):
        """
        Test case 10.
        """
        assert separate_paren_groups("(()()()()()()())") == ["(()()()())", "(())", "()"]

# id_3.py
from typing import List


def separate_paren_groups(paren_string: str) -> List[str]:

    result = []
    current_string = []
    current_depth = 0

    for c in paren_string:
        if c == '(':
            current_depth += 1
            current_string.append(c)
        elif c == ')':
            current_depth -= 1
            current_string.append(c)

            if current_depth == 0:
                result.append(''.join(current_string))
                current_string.clear()

    return result

# id_3_Test.java
from scenario1.id_3 import separate_paren_groups

import pytest

class id_3_Test:
    """
    Test class of id_3.py.
    It contains ten unit test cases for the :func:`scenario1.id_3.separate_paren_groups`.
    """
		
    def test_case_1(self):
        """
        Test case 1.
        """
        assert separate_paren_groups("()") == ["()"]

    def test_case_2(self):
        """
        Test case 2.
        """
        assert separate_paren_groups("(())") == ["(())"]

    def test_case_3(self):
        """
        Test case 3.
        """
        assert separate_paren_groups("()()") == ["()", "()"]

    def test_case_4(self):
        """
        Test case 4.
        """
        assert separate_paren_groups("(()())") == ["(()())"]

    def test_case_5(self):
        """
        Test case 5.
        """
        assert separate_paren_groups("(())(())") == ["(())", "(())"]

    def test_case_6(self):
        """
        Test case 6.
        """
        assert separate_paren_groups("(()()())") == ["(()())", "()"]

    def test_case_7(self):
        """
        Test case 7.
        """
        assert separate_paren_groups("(()()()())") == ["(()()())", "()"]

    def test_case_8(self):
        """
        Test case 8.
        """
        assert separate_paren_groups("(()()()()())") == ["(()()()())", "()"]

    def test_case_9(self):
        """
        Test case 9.
        """
        assert separate_paren_groups("(()()()()()())") == ["(()()()())", "(())"]

    def test_case_10(self):
        """
        Test case 10.
        """
        assert separate_paren_groups("(()()()()()()())") == ["(()()()())", "(())", "()"]

# id_4.py
from typing import List


def separate_paren_groups(paren_string: str) -> List[str]:

    result = []
    current_string = []
    current_depth = 0

    for c in paren_string:
        if c == '(':
            current_depth += 1
            current_string.append(c)
        elif c == ')':
            current_depth -= 1
            current_string.append(c)

            if current_depth == 0:
                result.append(''.join(current_string))
                current_string.clear()

    return result

# id_4_Test.java
from scenario1.id_