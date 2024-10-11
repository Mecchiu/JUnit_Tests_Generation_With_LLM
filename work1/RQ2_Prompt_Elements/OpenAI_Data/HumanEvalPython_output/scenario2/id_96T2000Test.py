# id_96_Test.java
from scenario2.id_96 import count_up_to

import pytest

class id_96_Test:
    """
    Test class of id_96.py.
    It contains ten unit test cases for the :func:`scenario2.id_96.count_up_to`.
    """


    def test_count_up_to_1(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(10) == [2, 3, 5, 7]

    def test_count_up_to_2(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(20) == [2, 3, 5, 7, 11, 13, 17, 19]

    def test_count_up_to_3(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(30) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

    def test_count_up_to_4(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(40) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37]

    def test_count_up_to_5(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(50) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]

    def test_count_up_to_6(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(60) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59]

    def test_count_up_to_7(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(70) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67]

    def test_count_up_to_8(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(80) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79]

    def test_count_up_to_9(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(90) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89]

    def test_count_up_to_10(self):
        """
        Test case for the :func:`scenario2.id_96.count_up_to`.
        """
        assert count_up_to(100) == [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]