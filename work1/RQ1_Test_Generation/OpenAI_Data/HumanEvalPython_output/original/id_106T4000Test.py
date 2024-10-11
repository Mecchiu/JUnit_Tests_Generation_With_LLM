# id_106_Test.java
from original.id_106 import f

import pytest

class id_106_Test:
    """
    Test class of id_106.py.
    It contains ten unit test cases for the :func:`original.id_106.f`.
    """


    def test_f_1(self):
        """
        Test case for the function f.
        """
        assert f(1) == [1]

    def test_f_2(self):
        """
        Test case for the function f.
        """
        assert f(2) == [1, 2]

    def test_f_3(self):
        """
        Test case for the function f.
        """
        assert f(3) == [1, 2, 3]

    def test_f_4(self):
        """
        Test case for the function f.
        """
        assert f(4) == [1, 2, 6, 24]

    def test_f_5(self):
        """
        Test case for the function f.
        """
        assert f(5) == [1, 2, 6, 24, 15]

    def test_f_6(self):
        """
        Test case for the function f.
        """
        assert f(6) == [1, 2, 6, 24, 15, 120]

    def test_f_7(self):
        """
        Test case for the function f.
        """
        assert f(7) == [1, 2, 6, 24, 15, 120, 105]

    def test_f_8(self):
        """
        Test case for the function f.
        """
        assert f(8) == [1, 2, 6, 24, 15, 120, 105, 840]

    def test_f_9(self):
        """
        Test case for the function f.
        """
        assert f(9) == [1, 2, 6, 24, 15, 120, 105, 840, 945]

    def test_f_10(self):
        """
        Test case for the function f.
        """
        assert f(10) == [1, 2, 6, 24, 15, 120, 105, 840, 945, 10395]