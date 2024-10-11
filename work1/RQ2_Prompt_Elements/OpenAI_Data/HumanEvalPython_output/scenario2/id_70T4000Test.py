# id_70_Test.java
from scenario2.id_70 import strange_sort_list

import pytest

class id_70_Test:
    """
    Test class of id_70.py.
    It contains ten unit test cases for the :func:`scenario2.id_70.strange_sort_list`.
    """


    def test_strange_sort_list_1(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5]) == [1, 5, 2, 4, 3]
		
    def test_strange_sort_list_2(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6]) == [1, 6, 2, 5, 3, 4]
		
    def test_strange_sort_list_3(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7]) == [1, 7, 2, 6, 3, 5, 4]
		
    def test_strange_sort_list_4(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8]) == [1, 8, 2, 7, 3, 6, 4, 5]
		
    def test_strange_sort_list_5(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [1, 9, 2, 8, 3, 7, 4, 6, 5]
		
    def test_strange_sort_list_6(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [1, 10, 2, 9, 3, 8, 4, 7, 5, 6]
		
    def test_strange_sort_list_7(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [1, 11, 2, 10, 3, 9, 4, 8, 5, 7, 6]
		
    def test_strange_sort_list_8(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [1, 12, 2, 11, 3, 10, 4, 9, 5, 8, 6, 7]
		
    def test_strange_sort_list_9(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [1, 13, 2, 12, 3, 11, 4, 10, 5, 9, 6, 8, 7]
		
    def test_strange_sort_list_10(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == [1, 14, 2, 13, 3, 12, 4, 11, 5, 10, 6, 9, 7, 8]
		
    def test_strange_sort_list_11(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]) == [1, 15, 2, 14, 3, 13, 4, 12, 5, 11, 6, 10, 7, 9, 8]
		
    def test_strange_sort_list_12(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) == [1, 16, 2, 15, 3, 14, 4, 13, 5, 12, 6, 11, 7, 10, 8, 9]
		
    def test_strange_sort_list_13(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]) == [1, 17, 2, 16, 3, 15, 4, 14, 5, 13, 6, 12, 7, 11, 8, 10, 9]
		
    def test_strange_sort_list_14(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]) == [1, 18, 2, 17, 3, 16, 4, 15, 5, 14, 6, 13, 7, 12, 8, 11, 9, 10]
		
    def test_strange_sort_list_15(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]) == [1, 19, 2, 18, 3, 17, 4, 16, 5, 15, 6, 14, 7, 13, 8, 12, 9, 11, 10]
		
    def test_strange_sort_list_16(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == [1, 20, 2, 19, 3, 18, 4, 17, 5, 16, 6, 15, 7, 14, 8, 13, 9, 12, 10, 11]
		
    def test_strange_sort_list_17(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]) == [1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11]
		
    def test_strange_sort_list_18(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22]) == [1, 22, 2, 21, 3, 20, 4, 19, 5, 18, 6, 17, 7, 16, 8, 15, 9, 14, 10, 13, 11, 12]
		
    def test_strange_sort_list_19(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23]) == [1, 23, 2, 22, 3, 21, 4, 20, 5, 19, 6, 18, 7, 17, 8, 16, 9, 15, 10, 14, 11, 13, 12]
		
    def test_strange_sort_list_20(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]) == [1, 24, 2, 23, 3, 22, 4, 21, 5, 20, 6, 19, 7, 18, 8, 17, 9, 16, 10, 15, 11, 14, 12, 13]
		
    def test_strange_sort_list_21(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]) == [1, 25, 2, 24, 3, 23, 4, 22, 5, 21, 6, 20, 7, 19, 8, 18, 9, 17, 10, 16, 11, 15, 12, 14, 13]
		
    def test_strange_sort_list_22(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]) == [1, 26, 2, 25, 3, 24, 4, 23, 5, 22, 6, 21, 7, 20, 8, 19, 9, 18, 10, 17, 11, 16, 12, 15, 13, 14]
		
    def test_strange_sort_list_23(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]) == [1, 27, 2, 26, 3, 25, 4, 24, 5, 23, 6, 22, 7, 21, 8, 20, 9, 19, 10, 18, 11, 17, 12, 16, 13, 15, 14]
		
    def test_strange_sort_list_24(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28]) == [1, 28, 2, 27, 3, 26, 4, 25, 5, 24, 6, 23, 7, 22, 8, 21, 9, 20, 10, 19, 11, 18, 12, 17, 13, 16, 14, 15]
		
    def test_strange_sort_list_25(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]) == [1, 29, 2, 28, 3, 27, 4, 26, 5, 25, 6, 24, 7, 23, 8, 22, 9, 21, 10, 20, 11, 19, 12, 18, 13, 17, 14, 16, 15]
		
    def test_strange_sort_list_26(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == [1, 30, 2, 29, 3, 28, 4, 27, 5, 26, 6, 25, 7, 24, 8, 23, 9, 22, 10, 21, 11, 20, 12, 19, 13, 18, 14, 17, 15, 16]
		
    def test_strange_sort_list_27(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]) == [1, 31, 2, 30, 3, 29, 4, 28, 5, 27, 6, 26, 7, 25, 8, 24, 9, 23, 10, 22, 11, 21, 12, 20, 13, 19, 14, 18, 15, 17, 16]
		
    def test_strange_sort_list_28(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32]) == [1, 32, 2, 31, 3, 30, 4, 29, 5, 28, 6, 27, 7, 26, 8, 25, 9, 24, 10, 23, 11, 22, 12, 21, 13, 20, 14, 19, 15, 18, 16, 17]
		
    def test_strange_sort_list_29(self):
        """
        Test case for the :func:`scenario2.id_70.strange_sort_list`.
        """
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33]) == [1, 33, 2, 32, 3, 31, 4, 30, 5, 29, 6, 28, 7, 27, 8, 26, 9, 25, 10, 24, 11, 23, 12, 22, 13, 21, 14, 20, 15, 19, 16, 18, 17]
		
    def test_strange_sort_list_30(self):
        """
        Test case for the :func