# id_144_Test.java
from original.id_144 import simplify

import pytest

class id_144_Test:
    """
    Test class of id_144.py.
    It contains ten unit test cases for the :func:`original.id_144.simplify`.
    """


    def test_simplify_1(self):
        """
        Test case 1 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/5", "5/1") == True

    def test_simplify_2(self):
        """
        Test case 2 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/6", "2/1") == False

    def test_simplify_3(self):
        """
        Test case 3 for :func:`original.id_144.simplify`.
        """
        assert simplify("7/10", "10/2") == False

    def test_simplify_4(self):
        """
        Test case 4 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/2") == True

    def test_simplify_5(self):
        """
        Test case 5 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/3") == False

    def test_simplify_6(self):
        """
        Test case 6 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/4") == True

    def test_simplify_7(self):
        """
        Test case 7 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/5") == False

    def test_simplify_8(self):
        """
        Test case 8 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/6") == False

    def test_simplify_9(self):
        """
        Test case 9 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/7") == False

    def test_simplify_10(self):
        """
        Test case 10 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/8") == True

# id_144_Test.py
from original.id_144 import simplify

import pytest

class id_144_Test:
    """
    Test class of id_144.py.
    It contains ten unit test cases for the :func:`original.id_144.simplify`.
    """
		
    def test_simplify_1(self):
        """
        Test case 1 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/5", "5/1") == True

    def test_simplify_2(self):
        """
        Test case 2 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/6", "2/1") == False

    def test_simplify_3(self):
        """
        Test case 3 for :func:`original.id_144.simplify`.
        """
        assert simplify("7/10", "10/2") == False

    def test_simplify_4(self):
        """
        Test case 4 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/2") == True

    def test_simplify_5(self):
        """
        Test case 5 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/3") == False

    def test_simplify_6(self):
        """
        Test case 6 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/4") == True

    def test_simplify_7(self):
        """
        Test case 7 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/5") == False

    def test_simplify_8(self):
        """
        Test case 8 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/6") == False

    def test_simplify_9(self):
        """
        Test case 9 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/7") == False

    def test_simplify_10(self):
        """
        Test case 10 for :func:`original.id_144.simplify`.
        """
        assert simplify("1/2", "1/8") == True

# id_145.py

def is_valid_ip(ip):
    """Your task is to implement a function that checks if the given string is a valid IPv4 address.

    is_valid_ip("1.2.3.4") = True
    is_valid_ip("1.2.3") = False
    is_valid_ip("1.2.3.4.5") = False
    is_valid_ip("123.45.67.89") = True
    is_valid_ip("123.456.78.90") = False
    is_valid_ip("123.045.067.089") = False
    """

    ip_list = ip.split(".")
    if len(ip_list) != 4:
        return False
    for i in ip_list:
        if not i.isdigit():
            return False
        if len(i) > 1 and i[0] == "0":
            return False
        if int(i) > 255:
            return False
    return True

# id_145_Test.java
from original.id_145 import is_valid_ip

import pytest

class id_145_Test:
    """
    Test class of id_145.py.
    It contains ten unit test cases for the :func:`original.id_145.is_valid_ip`.
    """
		
    def test_is_valid_ip_1(self):
        """
        Test case 1 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("1.2.3.4") == True

    def test_is_valid_ip_2(self):
        """
        Test case 2 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("1.2.3") == False

    def test_is_valid_ip_3(self):
        """
        Test case 3 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("1.2.3.4.5") == False

    def test_is_valid_ip_4(self):
        """
        Test case 4 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("123.45.67.89") == True

    def test_is_valid_ip_5(self):
        """
        Test case 5 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("123.456.78.90") == False

    def test_is_valid_ip_6(self):
        """
        Test case 6 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("123.045.067.089") == False

    def test_is_valid_ip_7(self):
        """
        Test case 7 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("0.0.0.0") == True

    def test_is_valid_ip_8(self):
        """
        Test case 8 for :func:`original.id_145.is_valid_ip`.
        """
        assert is_valid_ip("255.255.255.255") ==