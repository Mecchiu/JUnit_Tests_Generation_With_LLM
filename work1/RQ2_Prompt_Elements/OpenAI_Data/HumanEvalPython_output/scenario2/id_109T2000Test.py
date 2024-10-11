# id_109_Test.java
from scenario2.id_109 import move_one_ball

import pytest

class id_109_Test:
    """
    Test class of id_109.py.
    It contains ten unit test cases for the :func:`scenario2.id_109.move_one_ball`.
    """


    def test_move_one_ball_1(self):
        """
        Test case 1 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_2(self):
        """
        Test case 2 for move_one_ball.
        """
        arr = [5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_3(self):
        """
        Test case 3 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_4(self):
        """
        Test case 4 for move_one_ball.
        """
        arr = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_5(self):
        """
        Test case 5 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_6(self):
        """
        Test case 6 for move_one_ball.
        """
        arr = [20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_7(self):
        """
        Test case 7 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_8(self):
        """
        Test case 8 for move_one_ball.
        """
        arr = [30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_9(self):
        """
        Test case 9 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_10(self):
        """
        Test case 10 for move_one_ball.
        """
        arr = [40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_11(self):
        """
        Test case 11 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_12(self):
        """
        Test case 12 for move_one_ball.
        """
        arr = [50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_13(self):
        """
        Test case 13 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_14(self):
        """
        Test case 14 for move_one_ball.
        """
        arr = [60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) == False
		
    def test_move_one_ball_15(self):
        """
        Test case 15 for move_one_ball.
        """
        arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70]
        assert move_one_ball(arr) == True
		
    def test_move_one_ball_16(self):
        """
        Test case 16 for move_one_ball.
        """
        arr = [70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        assert move_one_ball(arr) ==