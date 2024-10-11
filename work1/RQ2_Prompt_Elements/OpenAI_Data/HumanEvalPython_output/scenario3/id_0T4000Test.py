# id_0_Test.java
from scenario3.id_0 import has_close_elements

import pytest

class id_0_Test:
    """
    Test class of id_0.py.
    It contains ten unit test cases for the :func:`scenario3.id_0.has_close_elements`.
    """


    def test_has_close_elements_1(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.0, 3.0], 0.5) == False

    def test_has_close_elements_2(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3) == True

    def test_has_close_elements_3(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.5) == False

    def test_has_close_elements_4(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.7) == True

    def test_has_close_elements_5(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.9) == False

    def test_has_close_elements_6(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.1) == True

    def test_has_close_elements_7(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.3) == False

    def test_has_close_elements_8(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.5) == True

    def test_has_close_elements_9(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.7) == False

    def test_has_close_elements_10(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.9) == True

# id_0_Test.py
from scenario3.id_0 import has_close_elements

import pytest

class id_0_Test:
    """
    Test class of id_0.py.
    It contains ten unit test cases for the :func:`scenario3.id_0.has_close_elements`.
    """
		
    def test_has_close_elements_1(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.0, 3.0], 0.5) == False

    def test_has_close_elements_2(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3) == True

    def test_has_close_elements_3(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.5) == False

    def test_has_close_elements_4(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.7) == True

    def test_has_close_elements_5(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.9) == False

    def test_has_close_elements_6(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.1) == True

    def test_has_close_elements_7(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.3) == False

    def test_has_close_elements_8(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.5) == True

    def test_has_close_elements_9(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.7) == False

    def test_has_close_elements_10(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.9) == True

# id_0_Test.java
from scenario3.id_0 import has_close_elements

import pytest

class id_0_Test:
    """
    Test class of id_0.py.
    It contains ten unit test cases for the :func:`scenario3.id_0.has_close_elements`.
    """
		
    def test_has_close_elements_1(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.0, 3.0], 0.5) == False

    def test_has_close_elements_2(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3) == True

    def test_has_close_elements_3(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.5) == False

    def test_has_close_elements_4(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.7) == True

    def test_has_close_elements_5(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.9) == False

    def test_has_close_elements_6(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.1) == True

    def test_has_close_elements_7(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.3) == False

    def test_has_close_elements_8(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.5) == True

    def test_has_close_elements_9(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.7) == False

    def test_has_close_elements_10(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.9) == True

# id_0_Test.py
from scenario3.id_0 import has_close_elements

import pytest

class id_0_Test:
    """
    Test class of id_0.py.
    It contains ten unit test cases for the :func:`scenario3.id_0.has_close_elements`.
    """
		
    def test_has_close_elements_1(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.0, 3.0], 0.5) == False

    def test_has_close_elements_2(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3) == True

    def test_has_close_elements_3(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.5) == False

    def test_has_close_elements_4(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.7) == True

    def test_has_close_elements_5(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.9) == False

    def test_has_close_elements_6(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.1) == True

    def test_has_close_elements_7(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.3) == False

    def test_has_close_elements_8(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.5) == True

    def test_has_close_elements_9(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.7) == False

    def test_has_close_elements_10(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 1.9) == True

# id_0_Test.java
from scenario3.id_0 import has_close_elements

import pytest

class id_0_Test:
    """
    Test class of id_0.py.
    It contains ten unit test cases for the :func:`scenario3.id_0.has_close_elements`.
    """
		
    def test_has_close_elements_1(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.0, 3.0], 0.5) == False

    def test_has_close_elements_2(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3) == True

    def test_has_close_elements_3(self):
        """
        Test case for :func:`scenario3.id_0.has_close_elements`.
        """
        assert has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.5) == False

    def test_has_close_e