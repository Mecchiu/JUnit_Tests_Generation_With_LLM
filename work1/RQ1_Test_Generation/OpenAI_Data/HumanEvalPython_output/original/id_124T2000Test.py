# id_124_Test.java
from original.id_124 import valid_date

import pytest

class id_124_Test:
    """
    Test class of id_124.py.
    It contains ten unit test cases for the :func:`original.id_124.valid_date`.
    """


    def test_valid_date_1(self):
        """
        Test case 1 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('03-11-2000') == True

    def test_valid_date_2(self):
        """
        Test case 2 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('15-01-2012') == False

    def test_valid_date_3(self):
        """
        Test case 3 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('04-0-2040') == False

    def test_valid_date_4(self):
        """
        Test case 4 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_5(self):
        """
        Test case 5 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06/04/2020') == False

    def test_valid_date_6(self):
        """
        Test case 6 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_7(self):
        """
        Test case 7 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_8(self):
        """
        Test case 8 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_9(self):
        """
        Test case 9 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_10(self):
        """
        Test case 10 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

# id_124_Test.py
from original.id_124 import valid_date

import pytest

class id_124_Test:
    """
    Test class of id_124.py.
    It contains ten unit test cases for the :func:`original.id_124.valid_date`.
    """
		
    def test_valid_date_1(self):
        """
        Test case 1 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('03-11-2000') == True

    def test_valid_date_2(self):
        """
        Test case 2 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('15-01-2012') == False

    def test_valid_date_3(self):
        """
        Test case 3 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('04-0-2040') == False

    def test_valid_date_4(self):
        """
        Test case 4 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_5(self):
        """
        Test case 5 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06/04/2020') == False

    def test_valid_date_6(self):
        """
        Test case 6 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_7(self):
        """
        Test case 7 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_8(self):
        """
        Test case 8 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_9(self):
        """
        Test case 9 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_10(self):
        """
        Test case 10 for :func:`original.id_124.valid_date`.
        """
        assert valid_date('06-04-2020') == True

# id_125.py

def valid_date(date):
    """You have to write a function which validates a given date string and
    returns True if the date is valid otherwise False.
    The date is valid if all of the following rules are satisfied:
    1. The date string is not empty.
    2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
    3. The months should not be less than 1 or higher than 12.
    4. The date should be in the format: mm-dd-yyyy

    for example: 
    valid_date('03-11-2000') => True

    valid_date('15-01-2012') => False

    valid_date('04-0-2040') => False

    valid_date('06-04-2020') => True

    valid_date('06/04/2020') => False
    """

    try:
        date = date.strip()
        month, day, year = date.split('-')
        month, day, year = int(month), int(day), int(year)
        if month < 1 or month > 12:
            return False
        if month in [1,3,5,7,8,10,12] and day < 1 or day > 31:
            return False
        if month in [4,6,9,11] and day < 1 or day > 30:
            return False
        if month == 2 and day < 1 or day > 29:
            return False
    except:
        return False

    return True

# id_125_Test.java
from original.id_125 import valid_date

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`original.id_125.valid_date`.
    """
		
    def test_valid_date_1(self):
        """
        Test case 1 for :func:`original.id_125.valid_date`.
        """
        assert valid_date('03-11-2000') == True

    def test_valid_date_2(self):
        """
        Test case 2 for :func:`original.id_125.valid_date`.
        """
        assert valid_date('15-01-2012') == False

    def test_valid_date_3(self):
        """
        Test case 3 for :func:`original.id_125.valid_date`.
        """
        assert valid_date('04-0-2040') == False

    def test_valid_date_4(self):
        """
        Test case 4 for :func:`original.id_125.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_5(self):
        """
        Test case 5 for :func:`original.id_125.valid_date`.
        """
        assert valid_date('06/04/2020') == False

    def test_valid_date_6(self):
        """
        Test case 6 for :func:`original.id_125.valid_date`.
        """
        assert valid_date('06-04-2020') == True

    def test_valid_date_7(self):
        """
