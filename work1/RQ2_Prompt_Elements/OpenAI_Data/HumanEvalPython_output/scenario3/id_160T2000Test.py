# id_160_Test.java
from scenario3.id_160 import do_algebra

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`scenario3.id_160.do_algebra`.
    """


    def test_do_algebra_1(self):
        """
        Test case 1 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5]
        assert do_algebra(operator, operand) == 9

    def test_do_algebra_2(self):
        """
        Test case 2 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6]
        assert do_algebra(operator, operand) == 11

    def test_do_algebra_3(self):
        """
        Test case 3 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7]
        assert do_algebra(operator, operand) == 14

    def test_do_algebra_4(self):
        """
        Test case 4 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8]
        assert do_algebra(operator, operand) == 18

    def test_do_algebra_5(self):
        """
        Test case 5 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9]
        assert do_algebra(operator, operand) == 23

    def test_do_algebra_6(self):
        """
        Test case 6 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10]
        assert do_algebra(operator, operand) == 29

    def test_do_algebra_7(self):
        """
        Test case 7 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        assert do_algebra(operator, operand) == 36

    def test_do_algebra_8(self):
        """
        Test case 8 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        assert do_algebra(operator, operand) == 44

    def test_do_algebra_9(self):
        """
        Test case 9 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
        assert do_algebra(operator, operand) == 53

    def test_do_algebra_10(self):
        """
        Test case 10 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        assert do_algebra(operator, operand) == 63

# id_160.py

def do_algebra(operator, operand):
    """
    Given two lists operator, and operand. The first list has basic algebra operations, and 
    the second list is a list of integers. Use the two given lists to build the algebric 
    expression and return the evaluation of this expression.

    The basic algebra operations:
    Addition ( + ) 
    Subtraction ( - ) 
    Multiplication ( * ) 
    Floor division ( // ) 
    Exponentiation ( ** ) 

    Example:
    operator['+', '*', '-']
    array = [2, 3, 4, 5]
    result = 2 + 3 * 4 - 5
    => result = 9

    Note:
        The length of operator list is equal to the length of operand list minus one.
        Operand is a list of of non-negative integers.
        Operator list has at least one operator, and operand list has at least two operands.

    """

    pass
# id_160_Test.java
from scenario3.id_160 import do_algebra

import pytest

class id_160_Test:
    """
    Test class of id_160.py.
    It contains ten unit test cases for the :func:`scenario3.id_160.do_algebra`.
    """
		
    def test_do_algebra_1(self):
        """
        Test case 1 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5]
        assert do_algebra(operator, operand) == 9

    def test_do_algebra_2(self):
        """
        Test case 2 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6]
        assert do_algebra(operator, operand) == 11

    def test_do_algebra_3(self):
        """
        Test case 3 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7]
        assert do_algebra(operator, operand) == 14

    def test_do_algebra_4(self):
        """
        Test case 4 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8]
        assert do_algebra(operator, operand) == 18

    def test_do_algebra_5(self):
        """
        Test case 5 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9]
        assert do_algebra(operator, operand) == 23

    def test_do_algebra_6(self):
        """
        Test case 6 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10]
        assert do_algebra(operator, operand) == 29

    def test_do_algebra_7(self):
        """
        Test case 7 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        assert do_algebra(operator, operand) == 36

    def test_do_algebra_8(self):
        """
        Test case 8 for :func:`scenario3.id_160.do_algebra`.
        """
        operator = ['+', '*', '-']
        operand = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        assert do_algebra(operator, operand) == 44

