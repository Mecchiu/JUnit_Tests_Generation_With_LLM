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
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 165
		
    def test_double_the_difference_2(self):
        """
        Test case 2 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 0
		
    def test_double_the_difference_3(self):
        """
        Test case 3 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 825
		
    def test_double_the_difference_4(self):
        """
        Test case 4 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20]) == 0
		
    def test_double_the_difference_5(self):
        """
        Test case 5 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 1785
		
    def test_double_the_difference_6(self):
        """
        Test case 6 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30]) == 0
		
    def test_double_the_difference_7(self):
        """
        Test case 7 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == 3585
		
    def test_double_the_difference_8(self):
        """
        Test case 8 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40]) == 0
		
    def test_double_the_difference_9(self):
        """
        Test case 9 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == 7185
		
    def test_double_the_difference_10(self):
        """
        Test case 10 for :func:`scenario1.id_151.double_the_difference`.
        """
        assert double_the_difference([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50]) == 0
		
if __name__ == '__main__':
    pytest.main()