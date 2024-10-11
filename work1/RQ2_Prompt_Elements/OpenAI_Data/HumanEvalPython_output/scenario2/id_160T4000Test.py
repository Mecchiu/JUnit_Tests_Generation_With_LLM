# id_160_Test.java
from scenario2.id_160 import do_algebra

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`scenario2.id_160.do_algebra`.
    """


    def test_do_algebra_1(self):
        """
        Test case 1 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_2(self):
        """
        Test case 2 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_3(self):
        """
        Test case 3 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_4(self):
        """
        Test case 4 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_5(self):
        """
        Test case 5 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_6(self):
        """
        Test case 6 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_7(self):
        """
        Test case 7 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_8(self):
        """
        Test case 8 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_9(self):
        """
        Test case 9 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
    def test_do_algebra_10(self):
        """
        Test case 10 for :func:`scenario2.id_160.do_algebra`.
        """
        assert do_algebra(['+', '-', '*', '//', '**'], [1, 2, 3, 4, 5]) == -1
		
		
# id_161.py

def get_max_profit(stock_prices):
    """
    Given a list of stock prices, return the maximum profit that can be made by buying and 
    selling a single share of stock.

    """

    max_profit = 0
    for i in range(len(stock_prices)):
        for j in range(i+1, len(stock_prices)):
            if stock_prices[j] - stock_prices[i] > max_profit:
                max_profit = stock_prices[j] - stock_prices[i]
    return max_profit

# id_161_Test.java
from scenario2.id_161 import get_max_profit

import pytest

class id_161_Test:
    """
    Test class of id_161.py.
    It contains ten unit test cases for the :func:`scenario2.id_161.get_max_profit`.
    """
		
    def test_get_max_profit_1(self):
        """
        Test case 1 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2(self):
        """
        Test case 2 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3(self):
        """
        Test case 3 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_4(self):
        """
        Test case 4 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_5(self):
        """
        Test case 5 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_6(self):
        """
        Test case 6 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_7(self):
        """
        Test case 7 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_8(self):
        """
        Test case 8 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_9(self):
        """
        Test case 9 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_10(self):
        """
        Test case 10 for :func:`scenario2.id_161.get_max_profit`.
        """
        assert get_max_profit([10, 7, 5, 8, 11, 9]) == 6
		
		
# id_162.py

def get_max_profit_2(stock_prices):
    """
    Given a list of stock prices, return the maximum profit that can be made by buying and 
    selling a single share of stock.

    """

    max_profit = 0
    min_price = stock_prices[0]
    for price in stock_prices:
        min_price = min(min_price, price)
        max_profit = max(max_profit, price - min_price)
    return max_profit

# id_162_Test.java
from scenario2.id_162 import get_max_profit_2

import pytest

class id_162_Test:
    """
    Test class of id_162.py.
    It contains ten unit test cases for the :func:`scenario2.id_162.get_max_profit_2`.
    """
		
    def test_get_max_profit_2_1(self):
        """
        Test case 1 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_2(self):
        """
        Test case 2 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_3(self):
        """
        Test case 3 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_4(self):
        """
        Test case 4 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_5(self):
        """
        Test case 5 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_6(self):
        """
        Test case 6 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_7(self):
        """
        Test case 7 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_8(self):
        """
        Test case 8 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_9(self):
        """
        Test case 9 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_2_10(self):
        """
        Test case 10 for :func:`scenario2.id_162.get_max_profit_2`.
        """
        assert get_max_profit_2([10, 7, 5, 8, 11, 9]) == 6
		
		
# id_163.py

def get_max_profit_3(stock_prices):
    """
    Given a list of stock prices, return the maximum profit that can be made by buying and 
    selling a single share of stock.

    """

    max_profit = 0
    min_price = stock_prices[0]
    for price in stock_prices:
        min_price = min(min_price, price)
        max_profit = max(max_profit, price - min_price)
    return max_profit

# id_163_Test.java
from scenario2.id_163 import get_max_profit_3

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario2.id_163.get_max_profit_3`.
    """
		
    def test_get_max_profit_3_1(self):
        """
        Test case 1 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_2(self):
        """
        Test case 2 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_3(self):
        """
        Test case 3 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_4(self):
        """
        Test case 4 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_5(self):
        """
        Test case 5 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_6(self):
        """
        Test case 6 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_7(self):
        """
        Test case 7 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_8(self):
        """
        Test case 8 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_9(self):
        """
        Test case 9 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
    def test_get_max_profit_3_10(self):
        """
        Test case 10 for :func:`scenario2.id_163.get_max_profit_3`.
        """
        assert get_max_profit_3([10, 7, 5, 8, 11, 9]) == 6
		
		
# id_164.py

def get_max_profit_4(stock_prices):
    """
    Given a list of stock prices, return the maximum profit that can be made by buying and 
    selling a single share of stock.

    """

    max_profit = 0
    min_price = stock_prices[0]
    for price in stock_prices:
        min_price = min(min_price, price)
        max_profit = max(max_profit, price - min_price)
    return max_profit

# id_164_Test.java
from scenario2.id_164 import get_max_profit_4

import pytest

class id_164_Test:
    """
    Test class of id_164.py.
    It contains ten unit test cases for the :func:`scenario2.id_164.get_max_profit_4`.
    """
		
    def test_get_max_profit_4_