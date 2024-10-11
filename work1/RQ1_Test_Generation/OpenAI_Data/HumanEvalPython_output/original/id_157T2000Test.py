# id_157_Test.java
from original.id_157 import right_angle_triangle

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit test cases for the :func:`original.id_157.right_angle_triangle`.
    """


    def test_right_angle_triangle_1(self):
        """
        Test case 1 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(3, 4, 5) == True
		
    def test_right_angle_triangle_2(self):
        """
        Test case 2 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(1, 2, 3) == False
		
    def test_right_angle_triangle_3(self):
        """
        Test case 3 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(5, 12, 13) == True
		
    def test_right_angle_triangle_4(self):
        """
        Test case 4 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(8, 15, 17) == True
		
    def test_right_angle_triangle_5(self):
        """
        Test case 5 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(7, 24, 25) == True
		
    def test_right_angle_triangle_6(self):
        """
        Test case 6 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(9, 40, 41) == True
		
    def test_right_angle_triangle_7(self):
        """
        Test case 7 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(11, 60, 61) == True
		
    def test_right_angle_triangle_8(self):
        """
        Test case 8 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(12, 35, 37) == True
		
    def test_right_angle_triangle_9(self):
        """
        Test case 9 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(13, 84, 85) == True
		
    def test_right_angle_triangle_10(self):
        """
        Test case 10 for :func:`original.id_157.right_angle_triangle`.
        """
        assert right_angle_triangle(16, 63, 65) == True
		
if __name__ == '__main__':
    pytest.main()