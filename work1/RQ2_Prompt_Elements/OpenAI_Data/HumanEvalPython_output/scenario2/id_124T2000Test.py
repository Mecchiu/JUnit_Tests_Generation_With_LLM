# id_124_Test.java
from scenario2.id_124 import valid_date

import pytest

class id_124_Test:
    """
    Test class of id_124.py.
    It contains ten unit test cases for the :func:`scenario2.id_124.valid_date`.
    """


    def test_valid_date_1(self):
        """
        Test case 1 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('01-01-2000') == True

    def test_valid_date_2(self):
        """
        Test case 2 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('02-29-2000') == True

    def test_valid_date_3(self):
        """
        Test case 3 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('02-29-2001') == False

    def test_valid_date_4(self):
        """
        Test case 4 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('02-30-2000') == False

    def test_valid_date_5(self):
        """
        Test case 5 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('02-31-2000') == False

    def test_valid_date_6(self):
        """
        Test case 6 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('04-31-2000') == False

    def test_valid_date_7(self):
        """
        Test case 7 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('06-31-2000') == False

    def test_valid_date_8(self):
        """
        Test case 8 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('09-31-2000') == False

    def test_valid_date_9(self):
        """
        Test case 9 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('11-31-2000') == False

    def test_valid_date_10(self):
        """
        Test case 10 for :func:`scenario2.id_124.valid_date`.
        """
        assert valid_date('13-31-2000') == False