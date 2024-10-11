# id_130_Test.java
from scenario1.id_130 import tri

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario1.id_130.tri`.
    """


    def test_tri_1(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(0) == [1]

    def test_tri_2(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(1) == [1, 3]

    def test_tri_3(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(2) == [1, 3, 2]

    def test_tri_4(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(3) == [1, 3, 2, 4]

    def test_tri_5(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(4) == [1, 3, 2, 4, 3]

    def test_tri_6(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(5) == [1, 3, 2, 4, 3, 5]

    def test_tri_7(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(6) == [1, 3, 2, 4, 3, 5, 4]

    def test_tri_8(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(7) == [1, 3, 2, 4, 3, 5, 4, 6]

    def test_tri_9(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(8) == [1, 3, 2, 4, 3, 5, 4, 6, 5]

    def test_tri_10(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(9) == [1, 3, 2, 4, 3, 5, 4, 6, 5, 7]

# id_130_Test.py
from scenario1.id_130 import tri

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario1.id_130.tri`.
    """
		
    def test_tri_1(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(0) == [1]

    def test_tri_2(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(1) == [1, 3]

    def test_tri_3(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(2) == [1, 3, 2]

    def test_tri_4(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(3) == [1, 3, 2, 4]

    def test_tri_5(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(4) == [1, 3, 2, 4, 3]

    def test_tri_6(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(5) == [1, 3, 2, 4, 3, 5]

    def test_tri_7(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(6) == [1, 3, 2, 4, 3, 5, 4]

    def test_tri_8(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(7) == [1, 3, 2, 4, 3, 5, 4, 6]

    def test_tri_9(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(8) == [1, 3, 2, 4, 3, 5, 4, 6, 5]

    def test_tri_10(self):
        """
        Test case for the function :func:`scenario1.id_130.tri`.
        """
        assert tri(9) == [1, 3, 2, 4, 3, 5, 4, 6, 5, 7]

# id_131.py

def tri(n):

    if n == 0:
        return [1]
    my_tri = [1, 3]
    for i in range(2, n + 1):
        if i % 2 == 0:
            my_tri.append(i / 2 + 1)
        else:
            my_tri.append(my_tri[i - 1] + my_tri[i - 2] + (i + 3) / 2)
    return my_tri

# id_131_Test.java
from scenario1.id_131 import tri

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario1.id_131.tri`.
    """
		
    def test_tri_1(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(0) == [1]

    def test_tri_2(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(1) == [1, 3]

    def test_tri_3(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(2) == [1, 3, 2]

    def test_tri_4(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(3) == [1, 3, 2, 4]

    def test_tri_5(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(4) == [1, 3, 2, 4, 3]

    def test_tri_6(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(5) == [1, 3, 2, 4, 3, 5]

    def test_tri_7(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(6) == [1, 3, 2, 4, 3, 5, 4]

    def test_tri_8(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(7) == [1, 3, 2, 4, 3, 5, 4, 6]

    def test_tri_9(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(8) == [1, 3, 2, 4, 3, 5, 4, 6, 5]

    def test_tri_10(self):
        """
        Test case for the function :func:`scenario1.id_131.tri`.
        """
        assert tri(9) == [1, 3, 2