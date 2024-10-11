# id_123_Test.java
from scenario2.id_123 import get_odd_collatz

import pytest

class id_123_Test:
    """
    Test class of id_123.py.
    It contains ten unit test cases for the :func:`scenario2.id_123.get_odd_collatz`.
    """


    def test_get_odd_collatz_1(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(1) == [1]

    def test_get_odd_collatz_2(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(2) == []

    def test_get_odd_collatz_3(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(3) == [3]

    def test_get_odd_collatz_4(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(4) == []

    def test_get_odd_collatz_5(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(5) == [5]

    def test_get_odd_collatz_6(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(6) == [5]

    def test_get_odd_collatz_7(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(7) == [7]

    def test_get_odd_collatz_8(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(8) == [5]

    def test_get_odd_collatz_9(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(9) == [7]

    def test_get_odd_collatz_10(self):
        """
        Test case for the :func:`scenario2.id_123.get_odd_collatz`.
        """
        assert get_odd_collatz(10) == [5]