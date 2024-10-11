# id_133_Test.java
from scenario1.id_133 import sum_squares

import pytest

class id_133_Test:
    """
    Test class of id_133.py.
    It contains ten unit test cases for the :func:`scenario1.id_133.sum_squares`.
    """


    def test_sum_squares_1(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4]) == 30
		
    def test_sum_squares_3(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5]) == 55
		
    def test_sum_squares_4(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6]) == 91
		
    def test_sum_squares_5(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7]) == 140
		
    def test_sum_squares_6(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8]) == 204
		
    def test_sum_squares_7(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 285
		
    def test_sum_squares_8(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 385
		
    def test_sum_squares_9(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 506
		
    def test_sum_squares_10(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 650
		
		
# id_134.py


def sum_cubes(lst):
   
    

    import math
    cubed = 0
    for i in lst:
        cubed += math.ceil(i)**3
    return cubed

# id_134_Test.java
from scenario1.id_134 import sum_cubes

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario1.id_134.sum_cubes`.
    """
		
    def test_sum_cubes_1(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3]) == 36
		
    def test_sum_cubes_2(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4]) == 100
		
    def test_sum_cubes_3(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5]) == 225
		
    def test_sum_cubes_4(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6]) == 391
		
    def test_sum_cubes_5(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7]) == 585
		
    def test_sum_cubes_6(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8]) == 816
		
    def test_sum_cubes_7(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 1089
		
    def test_sum_cubes_8(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1404
		
    def test_sum_cubes_9(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 1763
		
    def test_sum_cubes_10(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 2167
		
		
# id_135.py


def sum_factorials(lst):
   
    

    import math
    factorial = 0
    for i in lst:
        factorial += math.factorial(i)
    return factorial

# id_135_Test.java
from scenario1.id_135 import sum_factorials

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario1.id_135.sum_factorials`.
    """
		
    def test_sum_factorials_1(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3]) == 9
		
    def test_sum_factorials_2(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4]) == 33
		
    def test_sum_factorials_3(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5]) == 153
		
    def test_sum_factorials_4(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6]) == 873
		
    def test_sum