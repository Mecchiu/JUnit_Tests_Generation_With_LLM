# id_110_Test.java
from original.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`original.id_110.exchange`.
    """


    def test_exchange_1(self):
        """
        Test case 1 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 5, 3, 4]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6]) == "YES"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7]) == "NO"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8]) == "YES"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9]) == "NO"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == "YES"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == "NO"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == "YES"

# id_110_Test.py
from original.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`original.id_110.exchange`.
    """
		
    def test_exchange_1(self):
        """
        Test case 1 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 5, 3, 4]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6]) == "YES"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7]) == "NO"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8]) == "YES"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9]) == "NO"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == "YES"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == "NO"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == "YES"

# id_110_Test.java
from original.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`original.id_110.exchange`.
    """
		
    def test_exchange_1(self):
        """
        Test case 1 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 5, 3, 4]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6]) == "YES"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7]) == "NO"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8]) == "YES"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9]) == "NO"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == "YES"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == "NO"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == "YES"

# id_110_Test.py
from original.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`original.id_110.exchange`.
    """
		
    def test_exchange_1(self):
        """
        Test case 1 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 5, 3, 4]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6]) == "YES"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7]) == "NO"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8]) == "YES"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9]) == "NO"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == "YES"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == "NO"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == "YES"

# id_110_Test.java
from original.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`original.id_110.exchange`.
    """
		
    def test_exchange_1(self):
        """
        Test case 1 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 5, 3, 4]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6]) == "YES"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7]) == "NO"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8]) == "YES"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9]) == "NO"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == "YES"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == "NO"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == "YES"

# id_110_Test.py
from original.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`original.id_110.exchange`.
    """
		
    def test_exchange_1(self):
        """
        Test case 1 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3, 4], [1, 2, 3, 4]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`original.id_110.exchange`.
        """
        assert exchange([1, 2, 3