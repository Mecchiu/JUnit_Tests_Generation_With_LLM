# id_112_Test.java
from scenario1.id_112 import reverse_delete

import pytest

class id_112_Test:
    """
    Test class of id_112.py.
    It contains ten unit test cases for the :func:`scenario1.id_112.reverse_delete`.
    """


    def test_reverse_delete_1(self):
        """
        Test case 1 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdcba", "abc") == ("dc", True)

    def test_reverse_delete_2(self):
        """
        Test case 2 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("abracadabra", "abr") == ("acad", False)

    def test_reverse_delete_3(self):
        """
        Test case 3 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "goog") == ("le", True)

    def test_reverse_delete_4(self):
        """
        Test case 4 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "go") == ("gle", True)

    def test_reverse_delete_5(self):
        """
        Test case 5 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "g") == ("oogle", True)

    def test_reverse_delete_6(self):
        """
        Test case 6 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "o") == ("gle", True)

    def test_reverse_delete_7(self):
        """
        Test case 7 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "l") == ("goe", True)

    def test_reverse_delete_8(self):
        """
        Test case 8 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "e") == ("gogl", True)

    def test_reverse_delete_9(self):
        """
        Test case 9 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "gle") == ("o", True)

    def test_reverse_delete_10(self):
        """
        Test case 10 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "goog") == ("le", True)

# id_112_Test.py
from scenario1.id_112 import reverse_delete

import pytest

class id_112_Test:
    """
    Test class of id_112.py.
    It contains ten unit test cases for the :func:`scenario1.id_112.reverse_delete`.
    """
		
    def test_reverse_delete_1(self):
        """
        Test case 1 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("abcdcba", "abc") == ("dc", True)

    def test_reverse_delete_2(self):
        """
        Test case 2 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("abracadabra", "abr") == ("acad", False)

    def test_reverse_delete_3(self):
        """
        Test case 3 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "goog") == ("le", True)

    def test_reverse_delete_4(self):
        """
        Test case 4 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "go") == ("gle", True)

    def test_reverse_delete_5(self):
        """
        Test case 5 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "g") == ("oogle", True)

    def test_reverse_delete_6(self):
        """
        Test case 6 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "o") == ("gle", True)

    def test_reverse_delete_7(self):
        """
        Test case 7 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "l") == ("goe", True)

    def test_reverse_delete_8(self):
        """
        Test case 8 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "e") == ("gogl", True)

    def test_reverse_delete_9(self):
        """
        Test case 9 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "gle") == ("o", True)

    def test_reverse_delete_10(self):
        """
        Test case 10 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "goog") == ("le", True)

# id_113.py

def reverse_delete_2(s,c):
    

    s = ''.join([char for char in s if char not in c])
    return (s,s[::-1] == s)

# id_113_Test.java
from scenario1.id_113 import reverse_delete_2

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`scenario1.id_113.reverse_delete_2`.
    """
		
    def test_reverse_delete_2_1(self):
        """
        Test case 1 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("abcdcba", "abc") == ("dc", True)

    def test_reverse_delete_2_2(self):
        """
        Test case 2 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("abracadabra", "abr") == ("acad", False)

    def test_reverse_delete_2_3(self):
        """
        Test case 3 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "goog") == ("le", True)

    def test_reverse_delete_2_4(self):
        """
        Test case 4 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "go") == ("gle", True)

    def test_reverse_delete_2_5(self):
        """
        Test case 5 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "g") == ("oogle", True)

    def test_reverse_delete_2_6(self):
        """
        Test case 6 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "o") == ("gle", True)

    def test_reverse_delete_2_7(self):
        """
        Test case 7 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "l") == ("goe", True)

    def test_reverse_delete_2_8(self):
        """
        Test case 8 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "e") == ("gogl", True)

    def test_reverse_delete_2_9(self):
        """
        Test case 9 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "gle") == ("o", True)

    def test_reverse_delete_2_10(self):
        """
        Test case 10 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "goog") == ("le", True)

# id_113_Test.py
from scenario1.id_113 import reverse_delete_2

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`scenario1.id_113.reverse_delete_2`.
    """
		
    def test_reverse_delete_2_1(self):
        """
        Test case 1 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("abcdcba", "abc") == ("dc", True)

    def test_reverse_delete_2_2(self):
        """
        Test case 2 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("abracadabra", "abr") == ("acad", False)

    def test_reverse_delete_2_3(self):
        """
        Test case 3 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "goog") == ("le", True)

    def test_reverse_delete_2_4(self):
        """
        Test case 4 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "go") == ("gle", True)

    def test_reverse_delete_2_5(self):
        """
        Test case 5 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "g") == ("oogle", True)

    def test_reverse_delete_2_6(self):
        """
        Test case 6 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "o") == ("gle", True)

    def test_reverse_delete_2_7(self):
        """
        Test case 7 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "l") == ("goe", True)

    def test_reverse_delete_2_8(self):
        """
        Test case 8 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "e") == ("gogl", True)

    def test_reverse_delete_2_9(self):
        """
        Test case 9 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "gle") == ("o", True)

    def test_reverse_delete_2_10(self):
        """
        Test case 10 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "goog") == ("le", True)

# id_114.py

def reverse_delete_3(s,c):
    

    s = ''.join([char for char in s if char not in c])
    return (s,s[::-1] == s)

# id_114_Test.java
from scenario1.id_114 import reverse_delete_3

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`scenario1.id_114.reverse_delete_3`.
    """
		
    def test_reverse_delete_3_1(self):
        """
        Test case 1 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("abcdcba", "abc") == ("dc", True)

    def test_reverse_delete_3_2(self):
        """
        Test case 2 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("abracadabra", "abr") == ("acad", False)

    def test_reverse_delete_3_3(self):
        """
        Test case 3 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "goog") == ("le", True)

    def test_reverse_delete_3_4(self):
        """
        Test case 4 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "go") == ("gle", True)

    def test_reverse_delete_3_5(self):
        """
        Test case 5 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "g") == ("oogle", True)

    def test_reverse_delete_3_6(self):
        """
        Test case 6 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "o") == ("gle", True)

    def test_reverse_delete_3_7(self):
        """
        Test case 7 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "l") == ("goe", True)

    def test_reverse_delete_3_8(self):
        """
        Test case 8 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "e") == ("gogl", True)

    def test_reverse_delete_3_9(self):
        """
        Test case 9 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "gle") == ("o", True)

    def test_reverse_delete_3_10(self):
        """
        Test case 10 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "goog") == ("le", True)

# id_114_Test.py
from scenario1.id_114 import reverse_delete_3

import pytest

class id_114_Test:
    """
    Test class of id_114.py.
    It contains ten unit test cases for the :func:`scenario1.id_114.reverse_delete_3`.
    """
		
    def test_reverse_delete_3_1(self):
        """
        Test case 1 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("abcdcba", "abc") == ("dc", True)

    def test_reverse_delete_3_2(self):
        """
        Test case 2 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("abracadabra", "abr") == ("acad", False)

    def test_reverse_delete_3_3(self):
        """
        Test case 3 for :func:`scenario1.id_114.reverse_delete_3`.
        """
        assert reverse_delete_3("google", "goog") == ("le", True)

    def test_reverse_delete_3_4(self):
        """
        Test case 4 for :func:`scenario1.id_114.reverse_delete_