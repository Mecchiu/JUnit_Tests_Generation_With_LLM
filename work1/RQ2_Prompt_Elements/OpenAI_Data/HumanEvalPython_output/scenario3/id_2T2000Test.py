# id_2_Test.java
from scenario3.id_2 import truncate_number

import pytest

class id_2_Test:
    """
    Test class of id_2.py.
    It contains ten unit test cases for the :func:`scenario3.id_2.truncate_number`.
    """


    def test_truncate_number_1(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.5) == 0.5
		
    def test_truncate_number_2(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.4) == 0.4
		
    def test_truncate_number_3(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.0) == 0.0
		
    def test_truncate_number_4(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.9) == 0.9
		
    def test_truncate_number_5(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.99) == 0.99
		
    def test_truncate_number_6(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.999) == 0.999
		
    def test_truncate_number_7(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.9999) == 0.9999
		
    def test_truncate_number_8(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.99999) == 0.99999
		
    def test_truncate_number_9(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.999999) == 0.999999
		
    def test_truncate_number_10(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.9999999) == 0.9999999
		
# id_2_Test.py
from scenario3.id_2 import truncate_number

import pytest

class id_2_Test:
    """
    Test class of id_2.py.
    It contains ten unit test cases for the :func:`scenario3.id_2.truncate_number`.
    """
		
    def test_truncate_number_1(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.5) == 0.5
		
    def test_truncate_number_2(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.4) == 0.4
		
    def test_truncate_number_3(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.0) == 0.0
		
    def test_truncate_number_4(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.9) == 0.9
		
    def test_truncate_number_5(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.99) == 0.99
		
    def test_truncate_number_6(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.999) == 0.999
		
    def test_truncate_number_7(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.9999) == 0.9999
		
    def test_truncate_number_8(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.99999) == 0.99999
		
    def test_truncate_number_9(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.999999) == 0.999999
		
    def test_truncate_number_10(self):
        """
        Test case for the :func:`scenario3.id_2.truncate_number`.
        """
        assert truncate_number(3.9999999) == 0.9999999
		
# id_3.java

/**
 * Given a positive floating point number, it can be decomposed into
 * and integer part (largest integer smaller than given number) and decimals
 * (leftover part always smaller than 1).
 *
 * Return the integer part of the number.
 *
 * @param number
 * @return
 */
public static int truncate_number(double number) {
    return (int) number;
}
# id_3.py


def truncate_number(number: float) -> float:
    """ Given a positive floating point number, it can be decomposed into
    and integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the integer part of the number.
    >>> truncate_number(3.5)
    3
    """
    pass
# id_3_Test.java
from scenario3.id_3 import truncate_number

import pytest

class id_3_Test:
    """
    Test class of id_3.py.
    It contains ten unit test cases for the :func:`scenario3.id_3.truncate_number`.
    """
		
    def test_truncate_number_1(self):
        """
        Test case for the :func:`scenario3.id_3.truncate_number`.
        """
        assert truncate_number(3.5) == 3
		
    def test_truncate_number_2(self):
        """
        Test case for the :func:`scenario3.id_3.truncate_number`.
        """
        assert truncate_number(3.4) == 3
		
    def test_truncate_number_3(self):
        """
        Test case for the :func:`scenario3.id_3.truncate_number`.
        """
        assert truncate_number(3.0) == 3
		
    def test_truncate_number_4(self):
        """
        Test case for the :func:`scenario3.id_3.truncate_number`.
        """
        assert truncate_number(3.9) == 3
		
    def test_truncate_number_5(self):
        """
        Test case for the :func:`scenario3.id_3.truncate_number`.
        """
        assert truncate_number(3.99) == 3
		
    def test_truncate_number_6(self):
        """
        Test case for the :func:`scenario3.