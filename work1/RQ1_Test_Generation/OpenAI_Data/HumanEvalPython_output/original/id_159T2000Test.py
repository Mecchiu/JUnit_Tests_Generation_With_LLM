# id_159_Test.java
from original.id_159 import eat

import pytest

class id_159_Test:
    """
    Test class of id_159.py.
    It contains ten unit test cases for the :func:`original.id_159.eat`.
    """


    def test_eat_1(self):
        """
        Test case 1 for :func:`original.id_159.eat`.
        """
        assert eat(5, 6, 10) == [11, 4]

    def test_eat_2(self):
        """
        Test case 2 for :func:`original.id_159.eat`.
        """
        assert eat(4, 8, 9) == [12, 1]

    def test_eat_3(self):
        """
        Test case 3 for :func:`original.id_159.eat`.
        """
        assert eat(1, 10, 10) == [11, 0]

    def test_eat_4(self):
        """
        Test case 4 for :func:`original.id_159.eat`.
        """
        assert eat(2, 11, 5) == [7, 0]

    def test_eat_5(self):
        """
        Test case 5 for :func:`original.id_159.eat`.
        """
        assert eat(0, 0, 0) == [0, 0]

    def test_eat_6(self):
        """
        Test case 6 for :func:`original.id_159.eat`.
        """
        assert eat(0, 1, 1) == [1, 0]

    def test_eat_7(self):
        """
        Test case 7 for :func:`original.id_159.eat`.
        """
        assert eat(0, 1, 0) == [0, 0]

    def test_eat_8(self):
        """
        Test case 8 for :func:`original.id_159.eat`.
        """
        assert eat(0, 0, 1) == [0, 1]

    def test_eat_9(self):
        """
        Test case 9 for :func:`original.id_159.eat`.
        """
        assert eat(1, 0, 1) == [1, 0]

    def test_eat_10(self):
        """
        Test case 10 for :func:`original.id_159.eat`.
        """
        assert eat(1, 1, 0) == [1, 0]