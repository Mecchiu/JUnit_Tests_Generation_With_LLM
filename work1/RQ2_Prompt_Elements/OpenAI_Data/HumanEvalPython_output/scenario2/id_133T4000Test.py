# id_133_Test.java
from scenario2.id_133 import sum_squares

import pytest

class id_133_Test:
    """
    Test class of id_133.py.
    It contains ten unit test cases for the :func:`scenario2.id_133.sum_squares`.
    """


    def test_sum_squares_1(self):
        """
        Test case 1 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case 2 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4]) == 30
		
    def test_sum_squares_3(self):
        """
        Test case 3 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5]) == 55
		
    def test_sum_squares_4(self):
        """
        Test case 4 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6]) == 91
		
    def test_sum_squares_5(self):
        """
        Test case 5 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7]) == 140
		
    def test_sum_squares_6(self):
        """
        Test case 6 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8]) == 204
		
    def test_sum_squares_7(self):
        """
        Test case 7 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9]) == 285
		
    def test_sum_squares_8(self):
        """
        Test case 8 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1]) == 385
		
    def test_sum_squares_9(self):
        """
        Test case 9 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2]) == 506
		
    def test_sum_squares_10(self):
        """
        Test case 10 for :func:`scenario2.id_133.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2, 12.3]) == 650
		
		
# id_134.py


def sum_squares(lst):
    """You are given a list of numbers.
    You need to return the sum of squared numbers in the given list,
    round each element in the list to the upper int(Ceiling) first.
    
    
    

    """

    import math
    squared = 0
    for i in lst:
        squared += math.ceil(i)**2
    return squared


# id_134_Test.java
from scenario2.id_134 import sum_squares

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario2.id_134.sum_squares`.
    """
		
    def test_sum_squares_1(self):
        """
        Test case 1 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case 2 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4]) == 30
		
    def test_sum_squares_3(self):
        """
        Test case 3 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5]) == 55
		
    def test_sum_squares_4(self):
        """
        Test case 4 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6]) == 91
		
    def test_sum_squares_5(self):
        """
        Test case 5 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7]) == 140
		
    def test_sum_squares_6(self):
        """
        Test case 6 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8]) == 204
		
    def test_sum_squares_7(self):
        """
        Test case 7 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9]) == 285
		
    def test_sum_squares_8(self):
        """
        Test case 8 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1]) == 385
		
    def test_sum_squares_9(self):
        """
        Test case 9 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2]) == 506
		
    def test_sum_squares_10(self):
        """
        Test case 10 for :func:`scenario2.id_134.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2, 12.3]) == 650
		
		
# id_135.py


def sum_squares(lst):
    """You are given a list of numbers.
    You need to return the sum of squared numbers in the given list,
    round each element in the list to the upper int(Ceiling) first.
    
    
    

    """

    import math
    squared = 0
    for i in lst:
        squared += math.ceil(i)**2
    return squared


# id_135_Test.java
from scenario2.id_135 import sum_squares

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario2.id_135.sum_squares`.
    """
		
    def test_sum_squares_1(self):
        """
        Test case 1 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case 2 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4]) == 30
		
    def test_sum_squares_3(self):
        """
        Test case 3 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5]) == 55
		
    def test_sum_squares_4(self):
        """
        Test case 4 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6]) == 91
		
    def test_sum_squares_5(self):
        """
        Test case 5 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7]) == 140
		
    def test_sum_squares_6(self):
        """
        Test case 6 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8]) == 204
		
    def test_sum_squares_7(self):
        """
        Test case 7 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9]) == 285
		
    def test_sum_squares_8(self):
        """
        Test case 8 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1]) == 385
		
    def test_sum_squares_9(self):
        """
        Test case 9 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2]) == 506
		
    def test_sum_squares_10(self):
        """
        Test case 10 for :func:`scenario2.id_135.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2, 12.3]) == 650
		
		
# id_136.py


def sum_squares(lst):
    """You are given a list of numbers.
    You need to return the sum of squared numbers in the given list,
    round each element in the list to the upper int(Ceiling) first.
    
    
    

    """

    import math
    squared = 0
    for i in lst:
        squared += math.ceil(i)**2
    return squared


# id_136_Test.java
from scenario2.id_136 import sum_squares

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario2.id_136.sum_squares`.
    """
		
    def test_sum_squares_1(self):
        """
        Test case 1 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case 2 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4]) == 30
		
    def test_sum_squares_3(self):
        """
        Test case 3 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5]) == 55
		
    def test_sum_squares_4(self):
        """
        Test case 4 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6]) == 91
		
    def test_sum_squares_5(self):
        """
        Test case 5 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7]) == 140
		
    def test_sum_squares_6(self):
        """
        Test case 6 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8]) == 204
		
    def test_sum_squares_7(self):
        """
        Test case 7 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9]) == 285
		
    def test_sum_squares_8(self):
        """
        Test case 8 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1]) == 385
		
    def test_sum_squares_9(self):
        """
        Test case 9 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1, 11.2]) == 506
		
    def test_sum_squares_10(self):
        """
        Test case 10 for :func:`scenario2.id_136.sum_squares`.
        """
        assert sum_squares([1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7