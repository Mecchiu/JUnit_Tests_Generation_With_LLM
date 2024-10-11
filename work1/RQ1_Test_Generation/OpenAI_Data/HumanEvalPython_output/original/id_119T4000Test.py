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
        assert match_parens(['(()', '()']) == 'Yes'

    def test_match_parens_7(self):
        """
        Test case 7 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(']) == 'No'

    def test_match_parens_8(self):
        """
        Test case 8 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '()(']) == 'No'

    def test_match_parens_9(self):
        """
        Test case 9 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()']) == 'Yes'

    def test_match_parens_10(self):
        """
        Test case 10 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()(']) == 'No'

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
        assert match_parens(['(()', '()']) == 'Yes'

    def test_match_parens_7(self):
        """
        Test case 7 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(']) == 'No'

    def test_match_parens_8(self):
        """
        Test case 8 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '()(']) == 'No'

    def test_match_parens_9(self):
        """
        Test case 9 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()']) == 'Yes'

    def test_match_parens_10(self):
        """
        Test case 10 for :func:`original.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()(']) == 'No'

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
    is_valid_ip('0.0.0.0') == 'Yes'
    is_valid_ip('255.255.255.255') == 'Yes'
    is_valid_ip('192.168.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.') == 'No'
    is_valid_ip('192.168.1') == 'No'
    is_valid_ip('192.168.1.1.1') == 'No'
    is_valid_ip('192.168.1.1.1.1') == 'No'
    is_valid_ip('192.168.1.256') == 'No'
    is_valid_ip('192.168.1.2555') == 'No'
    is_valid_ip('192.168.1.25a') == 'No'
    is_valid_ip('192.168.1.25-') == 'No'
    '''

    def check(s):
        if len(s) == 0:
            return False
        if len(s) > 1 and s[0] == '0':
            return False
        if not s.isdigit():
            return False
        if int(s) > 255:
            return False
        return True

    lst = s.split('.')
    if len(lst) != 4:
        return 'No'
    for i in lst:
        if not check(i):
            return 'No'
    return 'Yes'

# id_120_Test.java
from original.id_120 import is_valid_ip

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`original.id_120.is_valid_ip`.
    """
		
    def test_is_valid_ip_1(self):
        """
        Test case 1 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1') == 'Yes'

    def test_is_valid_ip_2(self):
        """
        Test case 2 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('0.0.0.0') == 'Yes'

    def test_is_valid_ip_3(self):
        """
        Test case 3 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('255.255.255.255') == 'Yes'

    def test_is_valid_ip_4(self):
        """
        Test case 4 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.1') == 'No'

    def test_is_valid_ip_5(self):
        """
        Test case 5 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.') == 'No'

    def test_is_valid_ip_6(self):
        """
        Test case 6 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1') == 'No'

    def test_is_valid_ip_7(self):
        """
        Test case 7 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.1') == 'No'

    def test_is_valid_ip_8(self):
        """
        Test case 8 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.1.1') == 'No'

    def test_is_valid_ip_9(self):
        """
        Test case 9 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.256') == 'No'

    def test_is_valid_ip_10(self):
        """
        Test case 10 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.2555') == 'No'

# id_120_Test.py
from original.id_120 import is_valid_ip

import pytest

class id_120_Test:
    """
    Test class of id_120.py.
    It contains ten unit test cases for the :func:`original.id_120.is_valid_ip`.
    """
		
    def test_is_valid_ip_1(self):
        """
        Test case 1 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1') == 'Yes'

    def test_is_valid_ip_2(self):
        """
        Test case 2 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('0.0.0.0') == 'Yes'

    def test_is_valid_ip_3(self):
        """
        Test case 3 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('255.255.255.255') == 'Yes'

    def test_is_valid_ip_4(self):
        """
        Test case 4 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.1') == 'No'

    def test_is_valid_ip_5(self):
        """
        Test case 5 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.') == 'No'

    def test_is_valid_ip_6(self):
        """
        Test case 6 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1') == 'No'

    def test_is_valid_ip_7(self):
        """
        Test case 7 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.1') == 'No'

    def test_is_valid_ip_8(self):
        """
        Test case 8 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.1.1.1') == 'No'

    def test_is_valid_ip_9(self):
        """
        Test case 9 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.256') == 'No'

    def test_is_valid_ip_10(self):
        """
        Test case 10 for :func:`original.id_120.is_valid_ip`.
        """
        assert is_valid_ip('192.168.1.2555') == 'No'

# id_121.py

def is_valid_ip_v6(s):
    '''
    You are given a string s, which represents an IPv6 address.
    Your job is to check if it is a valid IPv6 address.
    An IPv6 address is valid if and only if it satisfies the following conditions:
    1. It contains exactly eight parts.
    2. Each part is between 0 and 65535, inclusive.
    3. Each part consists of hexadecimal digits only.
    Return 'Yes' if it is a valid IPv6 address, and return 'No' otherwise.

    Examples:
    is_valid_ip_v6('2001:0db8:0000:0000:0000:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:db8:0:0:0:ff00:42:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:42:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0:0:ff00:0042:8329') == 'Yes'
    is_valid_ip_v6('2001:0db8:0:0: