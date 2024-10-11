# id_124_Test.java
from scenario1.id_124 import valid_date

import pytest

class id_124_Test:
    """
    Test class of id_124.py.
    It contains ten unit test cases for the :func:`scenario1.id_124.valid_date`.
    """


    def test_valid_date_1(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2000') == True

    def test_valid_date_2(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2001') == True

    def test_valid_date_3(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2002') == True

    def test_valid_date_4(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2003') == True

    def test_valid_date_5(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2004') == True

    def test_valid_date_6(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2005') == True

    def test_valid_date_7(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2006') == True

    def test_valid_date_8(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2007') == True

    def test_valid_date_9(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2008') == True

    def test_valid_date_10(self):
        """
        Test case for valid_date.
        """
        assert valid_date('01-01-2009') == True