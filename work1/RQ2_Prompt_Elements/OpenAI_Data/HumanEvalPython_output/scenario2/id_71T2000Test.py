# id_71_Test.java
from scenario2.id_71 import triangle_area

import pytest

class id_71_Test:
    """
    Test class of id_71.py.
    It contains ten unit test cases for the :func:`scenario2.id_71.triangle_area`.
    """


    def test_triangle_area_1(self):
        """
        Test case 1 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(3, 4, 5) == 6.00
		
    def test_triangle_area_2(self):
        """
        Test case 2 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
    def test_triangle_area_3(self):
        """
        Test case 3 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 3) == -1
		
    def test_triangle_area_4(self):
        """
        Test case 4 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 2) == -1
		
    def test_triangle_area_5(self):
        """
        Test case 5 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 2, 1) == -1
		
    def test_triangle_area_6(self):
        """
        Test case 6 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 2) == -1
		
    def test_triangle_area_7(self):
        """
        Test case 7 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
    def test_triangle_area_8(self):
        """
        Test case 8 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
    def test_triangle_area_9(self):
        """
        Test case 9 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
    def test_triangle_area_10(self):
        """
        Test case 10 for :func:`scenario2.id_71.triangle_area`.
        """
        assert triangle_area(1, 1, 1) == 0.43
		
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_71_Test.py'])