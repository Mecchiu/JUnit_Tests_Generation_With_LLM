# id_122_Test.java
from scenario1.id_122 import add_elements

import pytest

class id_122_Test:
    """
    Test class of id_122.py.
    It contains ten unit test cases for the :func:`scenario1.id_122.add_elements`.
    """


    def test_add_elements_1(self):
        """
        Test case 1 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 3) == 6

    def test_add_elements_2(self):
        """
        Test case 2 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 5) == 15

    def test_add_elements_3(self):
        """
        Test case 3 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 1) == 1

    def test_add_elements_4(self):
        """
        Test case 4 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 0) == 0

    def test_add_elements_5(self):
        """
        Test case 5 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -1) == 0

    def test_add_elements_6(self):
        """
        Test case 6 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 6) == 15

    def test_add_elements_7(self):
        """
        Test case 7 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 7) == 15

    def test_add_elements_8(self):
        """
        Test case 8 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -2) == 0

    def test_add_elements_9(self):
        """
        Test case 9 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -3) == 0

    def test_add_elements_10(self):
        """
        Test case 10 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -4) == 0

# id_122_Test.py
from scenario1.id_122 import add_elements

import pytest

class id_122_Test:
    """
    Test class of id_122.py.
    It contains ten unit test cases for the :func:`scenario1.id_122.add_elements`.
    """
		
    def test_add_elements_1(self):
        """
        Test case 1 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 3) == 6

    def test_add_elements_2(self):
        """
        Test case 2 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 5) == 15

    def test_add_elements_3(self):
        """
        Test case 3 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 1) == 1

    def test_add_elements_4(self):
        """
        Test case 4 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 0) == 0

    def test_add_elements_5(self):
        """
        Test case 5 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -1) == 0

    def test_add_elements_6(self):
        """
        Test case 6 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 6) == 15

    def test_add_elements_7(self):
        """
        Test case 7 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 7) == 15

    def test_add_elements_8(self):
        """
        Test case 8 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -2) == 0

    def test_add_elements_9(self):
        """
        Test case 9 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -3) == 0

    def test_add_elements_10(self):
        """
        Test case 10 for :func:`scenario1.id_122.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -4) == 0

# id_123.py

def add_elements(arr, k):

    return sum(elem for elem in arr[:k] if len(str(elem)) <= 2)


# id_123_Test.java
from scenario1.id_123 import add_elements

import pytest

class id_123_Test:
    """
    Test class of id_123.py.
    It contains ten unit test cases for the :func:`scenario1.id_123.add_elements`.
    """
		
    def test_add_elements_1(self):
        """
        Test case 1 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 3) == 6

    def test_add_elements_2(self):
        """
        Test case 2 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 5) == 15

    def test_add_elements_3(self):
        """
        Test case 3 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 1) == 1

    def test_add_elements_4(self):
        """
        Test case 4 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 0) == 0

    def test_add_elements_5(self):
        """
        Test case 5 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], -1) == 0

    def test_add_elements_6(self):
        """
        Test case 6 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 6) == 15

    def test_add_elements_7(self):
        """
        Test case 7 for :func:`scenario1.id_123.add_elements`.
        """
        assert add_elements([1, 2, 3, 4, 5], 7) == 15

    def test_add_elements_8(self):
        """
        Test case