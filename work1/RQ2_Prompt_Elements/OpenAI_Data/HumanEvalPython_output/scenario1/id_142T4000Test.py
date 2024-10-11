# id_142_Test.java
from scenario1.id_142 import sum_squares

import pytest

class id_142_Test:
    """
    Test class of id_142.py.
    It contains ten unit test cases for the :func:`scenario1.id_142.sum_squares`.
    """


    def test_sum_squares_1(self):
        """
        Test case 1 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10]) == 385

    def test_sum_squares_2(self):
        """
        Test case 2 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]) == 1330

    def test_sum_squares_3(self):
        """
        Test case 3 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]) == 3135

    def test_sum_squares_4(self):
        """
        Test case 4 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40]) == 6385

    def test_sum_squares_5(self):
        """
        Test case 5 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50]) == 10385

    def test_sum_squares_6(self):
        """
        Test case 6 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60]) == 15385

    def test_sum_squares_7(self):
        """
        Test case 7 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70]) == 21085

    def test_sum_squares_8(self):
        """
        Test case 8 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80]) == 28085

    def test_sum_squares_9(self):
        """
        Test case 9 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90]) == 35585

    def test_sum_squares_10(self):
        """
        Test case 10 for :func:`scenario1.id_142.sum_squares`.
        """
        assert sum_squares([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100]) == 43585