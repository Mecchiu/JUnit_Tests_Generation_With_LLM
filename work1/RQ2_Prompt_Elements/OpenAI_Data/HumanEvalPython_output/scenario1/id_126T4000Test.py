# id_126_Test.java
from scenario1.id_126 import is_sorted

import pytest

class id_126_Test:
    """
    Test class of id_126.py.
    It contains ten unit test cases for the :func:`scenario1.id_126.is_sorted`.
    """


    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 2, 3]) == True

    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 3]) == True

    def test_is_sorted_3(self):
        """
        Test case 3 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4]) == True

    def test_is_sorted_4(self):
        """
        Test case 4 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 4]) == True

    def test_is_sorted_5(self):
        """
        Test case 5 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5]) == True

    def test_is_sorted_6(self):
        """
        Test case 6 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5]) == True

    def test_is_sorted_7(self):
        """
        Test case 7 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6]) == True

    def test_is_sorted_8(self):
        """
        Test case 8 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 6]) == True

    def test_is_sorted_9(self):
        """
        Test case 9 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7]) == True

    def test_is_sorted_10(self):
        """
        Test case 10 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7, 7]) == True

# id_126_Test.py
from scenario1.id_126 import is_sorted

import pytest

class id_126_Test:
    """
    Test class of id_126.py.
    It contains ten unit test cases for the :func:`scenario1.id_126.is_sorted`.
    """
		
    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 2, 3]) == True

    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 3]) == True

    def test_is_sorted_3(self):
        """
        Test case 3 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4]) == True

    def test_is_sorted_4(self):
        """
        Test case 4 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 4]) == True

    def test_is_sorted_5(self):
        """
        Test case 5 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5]) == True

    def test_is_sorted_6(self):
        """
        Test case 6 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5]) == True

    def test_is_sorted_7(self):
        """
        Test case 7 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6]) == True

    def test_is_sorted_8(self):
        """
        Test case 8 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 6]) == True

    def test_is_sorted_9(self):
        """
        Test case 9 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7]) == True

    def test_is_sorted_10(self):
        """
        Test case 10 for :func:`scenario1.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7, 7]) == True

# id_127.py

def is_sorted(lst):

    count_digit = dict([(i, 0) for i in lst])
    for i in lst:
        count_digit[i]+=1 
    if any(count_digit[i] > 2 for i in lst):
        return False
    if all(lst[i-1] <= lst[i] for i in range(1, len(lst))):
        return True
    else:
        return False

# id_127_Test.java
from scenario1.id_127 import is_sorted

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`scenario1.id_127.is_sorted`.
    """
		
    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 2, 3]) == True

    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 3]) == True

    def test_is_sorted_3(self):
        """
        Test case 3 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4]) == True

    def test_is_sorted_4(self):
        """
        Test case 4 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 4]) == True

    def test_is_sorted_5(self):
        """
        Test case 5 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5]) == True

    def test_is_sorted_6(self):
        """
        Test case 6 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5]) == True

    def test_is_sorted_7(self):
        """
        Test case 7 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6]) == True

    def test_is_sorted_8(self):
        """
        Test case 8 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 6]) == True

    def test_is_sorted_9(self):
        """
        Test case 9 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7]) == True

    def test_is_sorted_10(self):
        """
        Test case 10 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7, 7]) == True

# id_127_Test.py
from scenario1.id_127 import is_sorted

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`scenario1.id_127.is_sorted`.
    """
		
    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 2, 3]) == True

    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 3]) == True

    def test_is_sorted_3(self):
        """
        Test case 3 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4]) == True

    def test_is_sorted_4(self):
        """
        Test case 4 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 4]) == True

    def test_is_sorted_5(self):
        """
        Test case 5 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5]) == True

    def test_is_sorted_6(self):
        """
        Test case 6 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5]) == True

    def test_is_sorted_7(self):
        """
        Test case 7 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6]) == True

    def test_is_sorted_8(self):
        """
        Test case 8 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 6]) == True

    def test_is_sorted_9(self):
        """
        Test case 9 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7]) == True

    def test_is_sorted_10(self):
        """
        Test case 10 for :func:`scenario1.id_127.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7, 7]) == True

# id_128.py

def is_sorted(lst):

    count_digit = dict([(i, 0) for i in lst])
    for i in lst:
        count_digit[i]+=1 
    if any(count_digit[i] > 2 for i in lst):
        return False
    if all(lst[i-1] <= lst[i] for i in range(1, len(lst))):
        return True
    else:
        return False

# id_128_Test.java
from scenario1.id_128 import is_sorted

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`scenario1.id_128.is_sorted`.
    """
		
    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 2, 3]) == True

    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 3]) == True

    def test_is_sorted_3(self):
        """
        Test case 3 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4]) == True

    def test_is_sorted_4(self):
        """
        Test case 4 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 4]) == True

    def test_is_sorted_5(self):
        """
        Test case 5 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5]) == True

    def test_is_sorted_6(self):
        """
        Test case 6 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5]) == True

    def test_is_sorted_7(self):
        """
        Test case 7 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6]) == True

    def test_is_sorted_8(self):
        """
        Test case 8 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 6]) == True

    def test_is_sorted_9(self):
        """
        Test case 9 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7]) == True

    def test_is_sorted_10(self):
        """
        Test case 10 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 6, 7, 7]) == True

# id_128_Test.py
from scenario1.id_128 import is_sorted

import pytest

class id_128_Test:
    """
    Test class of id_128.py.
    It contains ten unit test cases for the :func:`scenario1.id_128.is_sorted`.
    """
		
    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 2, 3]) == True

    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario1.id_128.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 3]) == True

   