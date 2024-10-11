# id_119_Test.java
from original.id_119 import match_parens

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`original.id_119.match_parens`.
    """


    def test_match_parens_1(self):
        """
        Test case 1 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['()(', ')']) == 'Yes'

    def test_match_parens_2(self):
        """
        Test case 2 for :func:`original.id_119.match_parens`.
        """
        assert match_parens([')', ')']) == 'No'

    def test_match_parens_3(self):
        """
        Test case 3 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(', ')']) == 'Yes'

    def test_match_parens_4(self):
        """
        Test case 4 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(', '(']) == 'No'

    def test_match_parens_5(self):
        """
        Test case 5 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')']) == 'Yes'

    def test_match_parens_6(self):
        """
        Test case 6 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '))']) == 'Yes'

    def test_match_parens_7(self):
        """
        Test case 7 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(']) == 'No'

    def test_match_parens_8(self):
        """
        Test case 8 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')((']) == 'No'

    def test_match_parens_9(self):
        """
        Test case 9 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(((']) == 'No'

    def test_match_parens_10(self):
        """
        Test case 10 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')((((']) == 'No'

# id_119_Test.py
from original.id_119 import match_parens

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`original.id_119.match_parens`.
    """
		
    def test_match_parens_1(self):
        """
        Test case 1 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['()(', ')']) == 'Yes'

    def test_match_parens_2(self):
        """
        Test case 2 for :func:`original.id_119.match_parens`.
        """
        assert match_parens([')', ')']) == 'No'

    def test_match_parens_3(self):
        """
        Test case 3 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(', ')']) == 'Yes'

    def test_match_parens_4(self):
        """
        Test case 4 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(', '(']) == 'No'

    def test_match_parens_5(self):
        """
        Test case 5 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')']) == 'Yes'

    def test_match_parens_6(self):
        """
        Test case 6 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '))']) == 'Yes'

    def test_match_parens_7(self):
        """
        Test case 7 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(']) == 'No'

    def test_match_parens_8(self):
        """
        Test case 8 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')((']) == 'No'

    def test_match_parens_9(self):
        """
        Test case 9 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(((']) == 'No'

    def test_match_parens_10(self):
        """
        Test case 10 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')((((']) == 'No'

# id_120.py

def is_valid_ip(s):
    '''
    You are given a string s, which represents an IP address.
    Your job is to check if it is a valid IP address.
    An IP address is valid if and only if it satisfies the following conditions:
    1. It contains exactly four parts.
    2. Each part is between 0 and 255, inclusive.
    3. Each part consists of digits only.
    Return 'Yes' if it is a valid IP address, and return 'No' otherwise.

    Examples:
    is_valid_ip('192.168.1.1') == 'Yes'
    is_valid_ip('192.168.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1.1.1