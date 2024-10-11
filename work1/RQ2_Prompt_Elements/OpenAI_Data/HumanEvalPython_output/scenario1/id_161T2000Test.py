# id_161_Test.java
from scenario1.id_161 import solve

import pytest

class id_161_Test:
    """
    Test class of id_161.py.
    It contains ten unit test cases for the :func:`scenario1.id_161.solve`.
    """


    def test_id_161_1(self):
        """
        Test case 1.
        """
        assert solve("a") == "A"

    def test_id_161_2(self):
        """
        Test case 2.
        """
        assert solve("A") == "a"

    def test_id_161_3(self):
        """
        Test case 3.
        """
        assert solve("z") == "Z"

    def test_id_161_4(self):
        """
        Test case 4.
        """
        assert solve("Z") == "z"

    def test_id_161_5(self):
        """
        Test case 5.
        """
        assert solve("ab") == "AB"

    def test_id_161_6(self):
        """
        Test case 6.
        """
        assert solve("AB") == "ab"

    def test_id_161_7(self):
        """
        Test case 7.
        """
        assert solve("aB") == "Ab"

    def test_id_161_8(self):
        """
        Test case 8.
        """
        assert solve("Ab") == "aB"

    def test_id_161_9(self):
        """
        Test case 9.
        """
        assert solve("12") == "21"

    def test_id_161_10(self):
        """
        Test case 10.
        """
        assert solve("21") == "12"

# id_161_Test.py
from scenario1.id_161 import solve

import pytest

class id_161_Test:
    """
    Test class of id_161.py.
    It contains ten unit test cases for the :func:`scenario1.id_161.solve`.
    """
		
    def test_id_161_1(self):
        """
        Test case 1.
        """
        assert solve("a") == "A"

    def test_id_161_2(self):
        """
        Test case 2.
        """
        assert solve("A") == "a"

    def test_id_161_3(self):
        """
        Test case 3.
        """
        assert solve("z") == "Z"

    def test_id_161_4(self):
        """
        Test case 4.
        """
        assert solve("Z") == "z"

    def test_id_161_5(self):
        """
        Test case 5.
        """
        assert solve("ab") == "AB"

    def test_id_161_6(self):
        """
        Test case 6.
        """
        assert solve("AB") == "ab"

    def test_id_161_7(self):
        """
        Test case 7.
        """
        assert solve("aB") == "Ab"

    def test_id_161_8(self):
        """
        Test case 8.
        """
        assert solve("Ab") == "aB"

    def test_id_161_9(self):
        """
        Test case 9.
        """
        assert solve("12") == "21"

    def test_id_161_10(self):
        """
        Test case 10.
        """
        assert solve("21") == "12"

# id_162.py

def solve(s):

    flg = 0
    idx = 0
    new_str = list(s)
    for i in s:
        if i.isalpha():
            new_str[idx] = i.swapcase()
            flg = 1
        idx += 1
    s = ""
    for i in new_str:
        s += i
    if flg == 0:
        return s[len(s)::-1]
    return s

# id_162_Test.java
from scenario1.id_162 import solve

import pytest

class id_162_Test:
    """
    Test class of id_162.py.
    It contains ten unit test cases for the :func:`scenario1.id_162.solve`.
    """
		
    def test_id_162_1(self):
        """
        Test case 1.
        """
        assert solve("a") == "A"

    def test_id_162_2(self):
        """
        Test case 2.
        """
        assert solve("A") == "a"

    def test_id_162_3(self):
        """
        Test case 3.
        """
        assert solve("z") == "Z"

    def test_id_162_4(self):
        """
        Test case 4.
        """
        assert solve("Z") == "z"

    def test_id_162_5(self):
        """
        Test case 5.
        """
        assert solve("ab") == "AB"

    def test_id_162_6(self):
        """
        Test case 6.
        """
        assert solve("AB") == "ab"

    def test_id_162_7(self):
        """
        Test case 7.
        """
        assert solve("aB") == "Ab"

    def test_id_162_8(self):
        """
        Test case 8.
        """
        assert solve("Ab") == "aB"

    def test_id_162_9(self):
        """
        Test case 9.
        """
        assert solve("12") == "21"

    def test_id_162_10(self):
        """
        Test case 10.
        """
        assert solve("21") == "12"

# id_162_Test.py
from scenario1.id_162 import solve

import pytest

class id_162_Test:
    """
    Test class of id_162.py.
    It contains ten unit test cases for the :func:`scenario1.id_162.solve`.
    """
		
    def test_id_162_1(self):
        """
        Test case 1.
        """
        assert solve("a") == "A"

    def test_id_162_2(self):
        """
        Test case 2.
        """
        assert solve("A") == "a"

    def test_id_162_3(self):
        """
        Test case 3.
        """
        assert solve("z") == "Z"

    def test_id_162_4(self):
        """
        Test case 4.
        """
        assert solve("Z") == "z"

    def test_id_162_5(self):
        """
        Test case 5.
        """
        assert solve("ab") == "AB"

    def test_id_162_6(self):
        """
        Test case 6.
        """
        assert solve("AB") == "ab"

    def test_id_162_7(self):
        """
        Test case 7.
        """
        assert solve("aB") == "Ab"

    def test_id_162_8(self):
        """
        Test case 8.
        """
        assert solve("Ab") == "aB"

    def test_id_162_9(self):
        """
        Test case 9.
        """
        assert solve("12") == "21"

    def test_id_162_10(self):
        """
        Test case 10.
        """
        assert solve("21") == "12"

# id_163.py

def solve(s):

    flg = 0
    idx = 0
    new_str = list(s)
    for i in s:
        if i.isalpha():
            new_str[idx] = i.swapcase()
            flg = 1
        idx += 1
    s = ""
    for i in new_str:
        s += i
    if flg == 0:
        return s[len(s)::-1]
    return s

# id_163_Test.java
from scenario1.id_163 import solve

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario1.id_163