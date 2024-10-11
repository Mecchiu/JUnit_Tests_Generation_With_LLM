# id_102_Test.java
from scenario2.id_102 import choose_num

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario2.id_102.choose_num`.
    """


    def test_choose_num_1(self):
        """
        Test case 1 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 1) == -1

    def test_choose_num_2(self):
        """
        Test case 2 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 2) == -1

    def test_choose_num_3(self):
        """
        Test case 3 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 3) == 2

    def test_choose_num_4(self):
        """
        Test case 4 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 4) == 4

    def test_choose_num_5(self):
        """
        Test case 5 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 5) == 4

    def test_choose_num_6(self):
        """
        Test case 6 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 6) == 6

    def test_choose_num_7(self):
        """
        Test case 7 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 7) == 6

    def test_choose_num_8(self):
        """
        Test case 8 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 8) == 8

    def test_choose_num_9(self):
        """
        Test case 9 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 9) == 8

    def test_choose_num_10(self):
        """
        Test case 10 for :func:`scenario2.id_102.choose_num`.
        """
        assert choose_num(1, 10) == 10