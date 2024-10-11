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
        assert reverse_delete("google", "gle") == ("goo", False)

    def test_reverse_delete_5(self):
        """
        Test case 5 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "goo") == ("gle", True)

    def test_reverse_delete_6(self):
        """
        Test case 6 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "g") == ("oogle", True)

    def test_reverse_delete_7(self):
        """
        Test case 7 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "o") == ("gogle", True)

    def test_reverse_delete_8(self):
        """
        Test case 8 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "l") == ("gooe", True)

    def test_reverse_delete_9(self):
        """
        Test case 9 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "e") == ("googl", True)

    def test_reverse_delete_10(self):
        """
        Test case 10 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "z") == ("google", True)

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
        assert reverse_delete("google", "gle") == ("goo", False)

    def test_reverse_delete_5(self):
        """
        Test case 5 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "goo") == ("gle", True)

    def test_reverse_delete_6(self):
        """
        Test case 6 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "g") == ("oogle", True)

    def test_reverse_delete_7(self):
        """
        Test case 7 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "o") == ("gogle", True)

    def test_reverse_delete_8(self):
        """
        Test case 8 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "l") == ("gooe", True)

    def test_reverse_delete_9(self):
        """
        Test case 9 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "e") == ("googl", True)

    def test_reverse_delete_10(self):
        """
        Test case 10 for :func:`scenario1.id_112.reverse_delete`.
        """
        assert reverse_delete("google", "z") == ("google", True)

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
        assert reverse_delete_2("google", "gle") == ("goo", False)

    def test_reverse_delete_2_5(self):
        """
        Test case 5 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "goo") == ("gle", True)

    def test_reverse_delete_2_6(self):
        """
        Test case 6 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "g") == ("oogle", True)

    def test_reverse_delete_2_7(self):
        """
        Test case 7 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "o") == ("gogle", True)

    def test_reverse_delete_2_8(self):
        """
        Test case 8 for :func:`scenario1.id_113.reverse_delete_2`.
        """
        assert reverse_delete_2("google", "l") == ("gooe", True)

    def test_reverse_delete_2_9(self):
        """
        Test case 9 for :func:`