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
        assert strange_sort_list([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12