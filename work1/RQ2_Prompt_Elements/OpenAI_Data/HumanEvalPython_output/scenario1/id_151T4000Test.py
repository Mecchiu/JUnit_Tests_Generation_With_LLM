# id_151_Test.java
from scenario1.id_151 import double_the_difference

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario1.id_151.double_the_difference`.
    """


    def test_double_the_difference_1(self):
        """
        Test case 1 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10]) == 0

    def test_double_the_difference_2(self):
        """
        Test case 2 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]) == 0

    def test_double_the_difference_3(self):
        """
        Test case 3 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]) == 0

    def test_double_the_difference_4(self):
        """
        Test case 4 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40]) == 0

    def test_double_the_difference_5(self):
        """
        Test case 5 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50]) == 0

    def test_double_the_difference_6(self):
        """
        Test case 6 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60]) == 0

    def test_double_the_difference_7(self):
        """
        Test case 7 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70]) == 0

    def test_double_the_difference_8(self):
        """
        Test case 8 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80]) == 0

    def test_double_the_difference_9(self):
        """
        Test case 9 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90]) == 0

    def test_double_the_difference_10(self):
        """
        Test case 10 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100]) == 0

# id_152.py

def sum_of_squares(lst):

    return sum([i**2 for i in lst if i > 0 and i%2!=0 and "." not in str(i)])

# id_152_Test.java
from scenario1.id_152 import sum_of_squares

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario1.id_152.sum_of_squares`.
    """
		
    def test_sum_of_squares_1(self):
        """
        Test case 1 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10]) == 0

    def test_sum_of_squares_2(self):
        """
        Test case 2 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]) == 0

    def test_sum_of_squares_3(self):
        """
        Test case 3 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]) == 0

    def test_sum_of_squares_4(self):
        """
        Test case 4 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40]) == 0

    def test_sum_of_squares_5(self):
        """
        Test case 5 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50]) == 0

    def test_sum_of_squares_6(self):
        """
        Test case 6 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60]) == 0

    def test_sum_of_squares_7(self):
        """
        Test case 7 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70]) == 0

    def test_sum_of_squares_8(self):
        """
        Test case 8 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80]) == 0

    def test_sum_of_squares_9(self):
        """
        Test case 9 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90]) == 0

    def test_sum_of_squares_10(self):
        """
        Test case 10 for :func:`scenario1.id_152.sum_of_squares`.
        """
        assert sum_of_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100]) == 0

# id_153.py

def sum_of_cubes(lst):

    return sum([i**3 for i in lst if i > 0 and i%2!=0 and "." not in str(i)])

# id_153_Test.java
from scenario1.id_153 import sum_of_cubes

import pytest

class id_153_Test:
    """
    Test class of id_153.py.
    It contains ten unit test cases for the :func:`scenario1.id_153.sum_of_cubes`.
    """
		
    def test_sum_of_cubes_1(self):
        """
        Test case 1 for :func:`scenario1.id_153.sum_of_cubes`.
        """
        assert sum_of_cubes([1,2,3,4,5,6,7,8,9,10]) == 0

    def test_sum_of_cubes_2(self):
        """
        Test case 2 for :func:`scenario1.id_153.sum_of_cubes`.
        """
        assert sum_of_cubes([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]) == 0

    def test_sum_of_cubes_3(self):
        """
        Test case 3 for :func:`scenario1.id_153.sum_of_cubes`.
        """
        assert sum_of_cubes([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]) == 0

    def test_sum_of_cubes_4(self):
        """
        Test case 4 for :func:`scenario1.id_153.