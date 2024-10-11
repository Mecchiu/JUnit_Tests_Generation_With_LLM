# id_126_Test.java
from scenario2.id_126 import is_sorted

import pytest

class id_126_Test:
    """
    Test class of id_126.py.
    It contains ten unit test cases for the :func:`scenario2.id_126.is_sorted`.
    """


    def test_is_sorted_1(self):
        """
        Test case 1 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5]) == True
		
    def test_is_sorted_2(self):
        """
        Test case 2 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5]) == False
		
    def test_is_sorted_3(self):
        """
        Test case 3 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5]) == False
		
    def test_is_sorted_4(self):
        """
        Test case 4 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6]) == True
		
    def test_is_sorted_5(self):
        """
        Test case 5 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7]) == True
		
    def test_is_sorted_6(self):
        """
        Test case 6 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8]) == True
		
    def test_is_sorted_7(self):
        """
        Test case 7 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9]) == True
		
    def test_is_sorted_8(self):
        """
        Test case 8 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10]) == True
		
    def test_is_sorted_9(self):
        """
        Test case 9 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11]) == True
		
    def test_is_sorted_10(self):
        """
        Test case 10 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12]) == True
		
    def test_is_sorted_11(self):
        """
        Test case 11 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == True
		
    def test_is_sorted_12(self):
        """
        Test case 12 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == True
		
    def test_is_sorted_13(self):
        """
        Test case 13 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == True
		
    def test_is_sorted_14(self):
        """
        Test case 14 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == True
		
    def test_is_sorted_15(self):
        """
        Test case 15 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == True
		
    def test_is_sorted_16(self):
        """
        Test case 16 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == True
		
    def test_is_sorted_17(self):
        """
        Test case 17 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == True
		
    def test_is_sorted_18(self):
        """
        Test case 18 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == True
		
    def test_is_sorted_19(self):
        """
        Test case 19 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]) == True
		
    def test_is_sorted_20(self):
        """
        Test case 20 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22]) == True
		
    def test_is_sorted_21(self):
        """
        Test case 21 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23]) == True
		
    def test_is_sorted_22(self):
        """
        Test case 22 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]) == True
		
    def test_is_sorted_23(self):
        """
        Test case 23 for :func:`scenario2.id_126.is_sorted`.
        """
        assert is_sorted([1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16