# id_20_Test.java
from scenario3.id_20 import find_closest_elements

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario3.id_20.find_closest_elements`.
    """


    def test_find_closest_elements_1(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2]) == (2.0, 2.2)

    def test_find_closest_elements_2(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0]) == (2.0, 2.0)

    def test_find_closest_elements_3(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.1]) == (2.0, 2.1)

    def test_find_closest_elements_4(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.3]) == (2.0, 2.3)

    def test_find_closest_elements_5(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.4]) == (2.0, 2.4)

    def test_find_closest_elements_6(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.5]) == (2.0, 2.5)

    def test_find_closest_elements_7(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.6]) == (2.0, 2.6)

    def test_find_closest_elements_8(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.7]) == (2.0, 2.7)

    def test_find_closest_elements_9(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.8]) == (2.0, 2.8)

    def test_find_closest_elements_10(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.9]) == (2.0, 2.9)

# id_20_Test.py
from scenario3.id_20 import find_closest_elements

import pytest

class id_20_Test:
    """
    Test class of id_20.py.
    It contains ten unit test cases for the :func:`scenario3.id_20.find_closest_elements`.
    """
		
    def test_find_closest_elements_1(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.2]) == (2.0, 2.2)

    def test_find_closest_elements_2(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0]) == (2.0, 2.0)

    def test_find_closest_elements_3(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.1]) == (2.0, 2.1)

    def test_find_closest_elements_4(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.3]) == (2.0, 2.3)

    def test_find_closest_elements_5(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.4]) == (2.0, 2.4)

    def test_find_closest_elements_6(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.5]) == (2.0, 2.5)

    def test_find_closest_elements_7(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.6]) == (2.0, 2.6)

    def test_find_closest_elements_8(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.7]) == (2.0, 2.7)

    def test_find_closest_elements_9(self):
        """
        Test case for the :func:`scenario3.id_20.find_closest_elements` function.
        """
        assert find_closest_elements([1.0, 2.0, 3.0, 4.0, 5.0, 2.8]) == (2.0, 2.8)

    def test_find_closest_elements_10(self):
        """
        Test case for the