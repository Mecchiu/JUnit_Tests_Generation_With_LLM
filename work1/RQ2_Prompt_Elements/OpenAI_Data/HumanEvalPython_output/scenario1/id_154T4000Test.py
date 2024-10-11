# id_154_Test.java
from scenario1.id_154 import cycpattern_check

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`scenario1.id_154.cycpattern_check`.
    """


    def test_cycpattern_check_1(self):
        """
        Test case 1 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "abc") == True

    def test_cycpattern_check_2(self):
        """
        Test case 2 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "abc") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bca") == True

    def test_cycpattern_check_4(self):
        """
        Test case 4 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bca") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cab") == True

    def test_cycpattern_check_6(self):
        """
        Test case 6 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cab") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cba") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cba") == False

    def test_cycpattern_check_9(self):
        """
        Test case 9 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bac") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bac") == False

# id_154_Test.py
from scenario1.id_154 import cycpattern_check

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`scenario1.id_154.cycpattern_check`.
    """
		
    def test_cycpattern_check_1(self):
        """
        Test case 1 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "abc") == True

    def test_cycpattern_check_2(self):
        """
        Test case 2 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "abc") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bca") == True

    def test_cycpattern_check_4(self):
        """
        Test case 4 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bca") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cab") == True

    def test_cycpattern_check_6(self):
        """
        Test case 6 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cab") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cba") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cba") == False

    def test_cycpattern_check_9(self):
        """
        Test case 9 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bac") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for :func:`scenario1.id_154.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bac") == False

# id_155.py

def cycpattern_check(a , b):

    l = len(b)
    pat = b + b
    for i in range(len(a) - l + 1):
        for j in range(l + 1):
            if a[i:i+l] == pat[j:j+l]:
                return True
    return False

# id_155_Test.java
from scenario1.id_155 import cycpattern_check

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario1.id_155.cycpattern_check`.
    """
		
    def test_cycpattern_check_1(self):
        """
        Test case 1 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "abc") == True

    def test_cycpattern_check_2(self):
        """
        Test case 2 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "abc") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bca") == True

    def test_cycpattern_check_4(self):
        """
        Test case 4 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bca") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cab") == True

    def test_cycpattern_check_6(self):
        """
        Test case 6 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cab") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cba") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cba") == False

    def test_cycpattern_check_9(self):
        """
        Test case 9 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bac") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bac") == False

# id_155_Test.py
from scenario1.id_155 import cycpattern_check

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario1.id_155.cycpattern_check`.
    """
		
    def test_cycpattern_check_1(self):
        """
        Test case 1 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "abc") == True

    def test_cycpattern_check_2(self):
        """
        Test case 2 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "abc") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bca") == True

    def test_cycpattern_check_4(self):
        """
        Test case 4 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bca") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cab") == True

    def test_cycpattern_check_6(self):
        """
        Test case 6 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cab") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cba") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cba") == False

    def test_cycpattern_check_9(self):
        """
        Test case 9 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bac") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for :func:`scenario1.id_155.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bac") == False

# id_156.py

def cycpattern_check(a , b):

    l = len(b)
    pat = b + b
    for i in range(len(a) - l + 1):
        for j in range(l + 1):
            if a[i:i+l] == pat[j:j+l]:
                return True
    return False

# id_156_Test.java
from scenario1.id_156 import cycpattern_check

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario1.id_156.cycpattern_check`.
    """
		
    def test_cycpattern_check_1(self):
        """
        Test case 1 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "abc") == True

    def test_cycpattern_check_2(self):
        """
        Test case 2 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "abc") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bca") == True

    def test_cycpattern_check_4(self):
        """
        Test case 4 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bca") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cab") == True

    def test_cycpattern_check_6(self):
        """
        Test case 6 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cab") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "cba") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "cba") == False

    def test_cycpattern_check_9(self):
        """
        Test case 9 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "bac") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "bac") == False

# id_156_Test.py
from scenario1.id_156 import cycpattern_check

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario1.id_156.cycpattern_check`.
    """
		
    def test_cycpattern_check_1(self):
        """
        Test case 1 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("abcabcabc", "abc") == True

    def test_cycpattern_check_2(self):
        """
        Test case 2 for :func:`scenario1.id_156.cycpattern_check`.
        """
        assert cycpattern_check("bcabcaabc", "abc") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for :func:`scenario1.id_156.cycpattern_check`.
        """
