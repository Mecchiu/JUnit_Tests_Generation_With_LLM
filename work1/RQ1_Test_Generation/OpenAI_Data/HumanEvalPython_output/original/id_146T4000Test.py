# id_146_Test.java
from original.id_146 import specialFilter

import pytest

class id_146_Test:
    """
    Test class of id_146.py.
    It contains ten unit test cases for the :func:`original.id_146.specialFilter`.
    """


    def test_specialFilter_1(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([15, -73, 14, -15]) == 1
		
    def test_specialFilter_2(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([33, -2, -3, 45, 21, 109]) == 2
		
    def test_specialFilter_3(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([-1, -2, -3, -4, -5, -6, -7, -8, -9, -10]) == 0
		
    def test_specialFilter_4(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 0
		
    def test_specialFilter_5(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 0
		
    def test_specialFilter_6(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 0
		
    def test_specialFilter_7(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([31, 32, 33, 34, 35, 36, 37, 38, 39, 40]) == 0
		
    def test_specialFilter_8(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([41, 42, 43, 44, 45, 46, 47, 48, 49, 50]) == 0
		
    def test_specialFilter_9(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([51, 52, 53, 54, 55, 56, 57, 58, 59, 60]) == 0
		
    def test_specialFilter_10(self):
        """
        Test case for specialFilter.
        """
        assert specialFilter([61, 62, 63, 64, 65, 66, 67, 68, 69, 70]) == 0
		
		
if __name__ == '__main__':
    pytest.main()