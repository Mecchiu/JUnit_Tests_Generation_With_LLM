# id_160_Test.java
from original.id_160 import do_algebra

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`original.id_160.do_algebra`.
    """


    def test_do_algebra_1(self):
        """
        Test case 1 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5]
        assert do_algebra(operator, operand) == 9

    def test_do_algebra_2(self):
        """
        Test case 2 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6]
        assert do_algebra(operator, operand) == 11

    def test_do_algebra_3(self):
        """
        Test case 3 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7]
        assert do_algebra(operator, operand) == 14

    def test_do_algebra_4(self):
        """
        Test case 4 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8]
        assert do_algebra(operator, operand) == 18

    def test_do_algebra_5(self):
        """
        Test case 5 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9]
        assert do_algebra(operator, operand) == 23

    def test_do_algebra_6(self):
        """
        Test case 6 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10]
        assert do_algebra(operator, operand) == 29

    def test_do_algebra_7(self):
        """
        Test case 7 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        assert do_algebra(operator, operand) == 36

    def test_do_algebra_8(self):
        """
        Test case 8 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        assert do_algebra(operator, operand) == 44

    def test_do_algebra_9(self):
        """
        Test case 9 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
        assert do_algebra(operator, operand) == 53

    def test_do_algebra_10(self):
        """
        Test case 10 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        assert do_algebra(operator, operand) == 63

# id_160_Test.py
from original.id_160 import do_algebra

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`original.id_160.do_algebra`.
    """
		
    def test_do_algebra_1(self):
        """
        Test case 1 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5]
        assert do_algebra(operator, operand) == 9

    def test_do_algebra_2(self):
        """
        Test case 2 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6]
        assert do_algebra(operator, operand) == 11

    def test_do_algebra_3(self):
        """
        Test case 3 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7]
        assert do_algebra(operator, operand) == 14

    def test_do_algebra_4(self):
        """
        Test case 4 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8]
        assert do_algebra(operator, operand) == 18

    def test_do_algebra_5(self):
        """
        Test case 5 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9]
        assert do_algebra(operator, operand) == 23

    def test_do_algebra_6(self):
        """
        Test case 6 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10]
        assert do_algebra(operator, operand) == 29

    def test_do_algebra_7(self):
        """
        Test case 7 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        assert do_algebra(operator, operand) == 36

    def test_do_algebra_8(self):
        """
        Test case 8 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        assert do_algebra(operator, operand) == 44

    def test_do_algebra_9(self):
        """
        Test case 9 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
        assert do_algebra(operator, operand) == 53

    def test_do_algebra_10(self):
        """
        Test case 10 for :func:`original.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        assert do_algebra(operator, operand) == 63

# id_161.py

def get_max_profit(stock_prices):
    """
    Given a list of stock prices, return the maximum profit that can be made by buying and 
    selling a single share of stock.

    Example:
    stock_prices = [10, 7, 5, 8, 11, 9]