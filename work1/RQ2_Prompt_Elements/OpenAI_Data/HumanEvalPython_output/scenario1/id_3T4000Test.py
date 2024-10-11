# id_3_Test.java
from scenario1.id_3 import below_zero

import pytest

class id_3_Test:
    """
    Test class of id_3.py.
    It contains ten unit test cases for the :func:`scenario1.id_3.below_zero`.
    """


    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below_zero_9(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12]) == True

    def test_below_zero_10(self):
        """
        Test case for the :func:`scenario1.id_3.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == True

# id_4.py
from typing import List


def below_zero(operations: List[int]) -> bool:

    balance = 0

    for op in operations:
        balance += op
        if balance < 0:
            return True

    return False

# id_4_Test.java
from scenario1.id_4 import below_zero

import pytest

class id_4_Test:
    """
    Test class of id_4.py.
    It contains ten unit test cases for the :func:`scenario1.id_4.below_zero`.
    """
		
    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below_zero_9(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12]) == True

    def test_below_zero_10(self):
        """
        Test case for the :func:`scenario1.id_4.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == True

# id_5.py
from typing import List


def below_zero(operations: List[int]) -> bool:

    balance = 0

    for op in operations:
        balance += op
        if balance < 0:
            return True

    return False

# id_5_Test.java
from scenario1.id_5 import below_zero

import pytest

class id_5_Test:
    """
    Test class of id_5.py.
    It contains ten unit test cases for the :func:`scenario1.id_5.below_zero`.
    """
		
    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below_zero_9(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12]) == True

    def test_below_zero_10(self):
        """
        Test case for the :func:`scenario1.id_5.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == True

# id_6.py
from typing import List


def below_zero(operations: List[int]) -> bool:

    balance = 0

    for op in operations:
        balance += op
        if balance < 0:
            return True

    return False

# id_6_Test.java
from scenario1.id_6 import below_zero

import pytest

class id_6_Test:
    """
    Test class of id_6.py.
    It contains ten unit test cases for the :func:`scenario1.id_6.below_zero`.
    """
		
    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below_zero_9(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12]) == True

    def test_below_zero_10(self):
        """
        Test case for the :func:`scenario1.id_6.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11, -12, -13]) == True

# id_7.py
from typing import List


def below_zero(operations: List[int]) -> bool:

    balance = 0

    for op in operations:
        balance += op
        if balance < 0:
            return True

    return False

# id_7_Test.java
from scenario1.id_7 import below_zero

import pytest

class id_7_Test:
    """
    Test class of id_7.py.
    It contains ten unit test cases for the :func:`scenario1.id_7.below_zero`.
    """
		
    def test_below_zero_1(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, 5]) == False

    def test_below_zero_2(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5]) == True

    def test_below_zero_3(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6]) == True

    def test_below_zero_4(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7]) == True

    def test_below_zero_5(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8]) == True

    def test_below_zero_6(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9]) == True

    def test_below_zero_7(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10]) == True

    def test_below_zero_8(self):
        """
        Test case for the :func:`scenario1.id_7.below_zero`.
        """
        assert below_zero([1, 2, 3, 4, -5, -6, -7, -8, -9, -10, -11]) == True

    def test_below