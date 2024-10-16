# id_151_Test.java
from scenario2.id_151 import double_the_difference

import pytest

class id_151_Test:
    """
    Test class of id_151.py.
    It contains ten unit test cases for the :func:`scenario2.id_151.double_the_difference`.
    """


    def test_double_the_difference_1(self):
        """
        Test case 1 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5]) == 55

    def test_double_the_difference_2(self):
        """
        Test case 2 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([-1, -2, -3, -4, -5]) == 0

    def test_double_the_difference_3(self):
        """
        Test case 3 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1.1, 2.2, 3.3, 4.4, 5.5]) == 0

    def test_double_the_difference_4(self):
        """
        Test case 4 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 385

    def test_double_the_difference_5(self):
        """
        Test case 5 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 2870

    def test_double_the_difference_6(self):
        """
        Test case 6 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 9455

    def test_double_the_difference_7(self):
        """
        Test case 7 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == 20270

    def test_double_the_difference_8(self):
        """
        Test case 8 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == 43430

    def test_double_the_difference_9(self):
        """
        Test case 9 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == 91035

    def test_double_the_difference_10(self):
        """
        Test case 10 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70]) == 189415

    def test_double_the_difference_11(self):
        """
        Test case 11 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80]) == 390640

    def test_double_the_difference_12(self):
        """
        Test case 12 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90]) == 804185

    def test_double_the_difference_13(self):
        """
        Test case 13 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]) == 1625260

    def test_double_the_difference_14(self):
        """
        Test case 14 for :func:`scenario2.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8,