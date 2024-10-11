# id_152_Test.java
from scenario3.id_152 import compare

import pytest

class id_152_Test:
    """
    Test class of id_152.py.
    It contains ten unit test cases for the :func:`scenario3.id_152.compare`.
    """


    def test_compare_1(self):
        """
        Test case 1 for :func:`scenario3.id_152.compare`.
        """
        assert compare([1,2,3,4,5,1],[1,2,3,4,2,-2]) == [0,0,0,0,3,3]

    def test_compare_2(self):
        """
        Test case 2 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,5,0,0,0,4],[4,1,1,0,0,-2]) == [4,4,1,0,0,6]

    def test_compare_3(self):
        """
        Test case 3 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_4(self):
        """
        Test case 4 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_5(self):
        """
        Test case 5 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_6(self):
        """
        Test case 6 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_7(self):
        """
        Test case 7 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_8(self):
        """
        Test case 8 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_9(self):
        """
        Test case 9 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]

    def test_compare_10(self):
        """
        Test case 10 for :func:`scenario3.id_152.compare`.
        """
        assert compare([0,0,0,0,0,0],[0,0,0,0,0,0]) == [0,0,0,0,0,0]