# id_110_Test.java
from scenario1.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`scenario1.id_110.exchange`.
    """


    def test_exchange_1(self):
        """
        Test case 1 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13]) == "NO"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14]) == "YES"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]) == "NO"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]) == "YES"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]) == "NO"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]) == "YES"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19]) == "NO"

# id_110_Test.py
from scenario1.id_110 import exchange

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`scenario1.id_110.exchange`.
    """
		
    def test_exchange_1(self):
        """
        Test case 1 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]) == "YES"

    def test_exchange_2(self):
        """
        Test case 2 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11]) == "NO"

    def test_exchange_3(self):
        """
        Test case 3 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12]) == "YES"

    def test_exchange_4(self):
        """
        Test case 4 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13]) == "NO"

    def test_exchange_5(self):
        """
        Test case 5 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14]) == "YES"

    def test_exchange_6(self):
        """
        Test case 6 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]) == "NO"

    def test_exchange_7(self):
        """
        Test case 7 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]) == "YES"

    def test_exchange_8(self):
        """
        Test case 8 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]) == "NO"

    def test_exchange_9(self):
        """
        Test case 9 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]) == "YES"

    def test_exchange_10(self):
        """
        Test case 10 for :func:`scenario1.id_110.exchange`.
        """
        assert exchange([1,2,3,4,5,6,7,8,9,10], [1,2