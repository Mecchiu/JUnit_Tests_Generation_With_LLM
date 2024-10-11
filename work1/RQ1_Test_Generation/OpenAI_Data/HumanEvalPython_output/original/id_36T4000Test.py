# id_36_Test.java
from original.id_36 import fizz_buzz

import pytest

class id_36_Test:
    """
    Test class of id_36.py.
    It contains ten unit test cases for the :func:`original.id_36.fizz_buzz`.
    """


    def test_fizz_buzz_1(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(50) == 0

    def test_fizz_buzz_2(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(78) == 2

    def test_fizz_buzz_3(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(79) == 3

    def test_fizz_buzz_4(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(100) == 4

    def test_fizz_buzz_5(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(1000) == 20

    def test_fizz_buzz_6(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(10000) == 200

    def test_fizz_buzz_7(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(100000) == 2000

    def test_fizz_buzz_8(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(1000000) == 20000

    def test_fizz_buzz_9(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(10000000) == 200000

    def test_fizz_buzz_10(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(100000000) == 2000000


# id_36_Test.py
from original.id_36 import fizz_buzz

import pytest

class id_36_Test:
    """
    Test class of id_36.py.
    It contains ten unit test cases for the :func:`original.id_36.fizz_buzz`.
    """
		
    def test_fizz_buzz_1(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(50) == 0

    def test_fizz_buzz_2(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(78) == 2

    def test_fizz_buzz_3(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(79) == 3

    def test_fizz_buzz_4(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(100) == 4

    def test_fizz_buzz_5(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(1000) == 20

    def test_fizz_buzz_6(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(10000) == 200

    def test_fizz_buzz_7(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(100000) == 2000

    def test_fizz_buzz_8(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(1000000) == 20000

    def test_fizz_buzz_9(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(10000000) == 200000

    def test_fizz_buzz_10(self):
        """
        Test case for the :func:`original.id_36.fizz_buzz`.
        """
        assert fizz_buzz(100000000) == 2000000


# id_37.py


def fizz_buzz(n: int):
    """Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
    >>> fizz_buzz(50)
    0
    >>> fizz_buzz(78)
    2
    >>> fizz_buzz(79)
    3
    """

    ns = []
    for i in range(n):
        if i % 11 == 0 or i % 13 == 0:
            ns.append(i)
    s = ''.join(list(map(str, ns)))
    ans = 0
    for c in s:
        ans += (c == '7')
    return ans


# id_37_Test.java
from original.id_37 import fizz_buzz

import pytest

class id_37_Test:
    """
    Test class of id_37.py.
    It contains ten unit test cases for the :func:`original.id_37.fizz_buzz`.
    """
		
    def test_fizz_buzz_1(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(50) == 0

    def test_fizz_buzz_2(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(78) == 2

    def test_fizz_buzz_3(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(79) == 3

    def test_fizz_buzz_4(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(100) == 4

    def test_fizz_buzz_5(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(1000) == 20

    def test_fizz_buzz_6(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(10000) == 200

    def test_fizz_buzz_7(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(100000) == 2000

    def test_fizz_buzz_8(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(1000000) == 20000

    def test_fizz_buzz_9(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(10000000) == 200000

    def test_fizz_buzz_10(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(100000000) == 2000000


# id_37_Test.py
from original.id_37 import fizz_buzz

import pytest

class id_37_Test:
    """
    Test class of id_37.py.
    It contains ten unit test cases for the :func:`original.id_37.fizz_buzz`.
    """
		
    def test_fizz_buzz_1(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(50) == 0

    def test_fizz_buzz_2(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(78) == 2

    def test_fizz_buzz_3(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(79) == 3

    def test_fizz_buzz_4(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(100) == 4

    def test_fizz_buzz_5(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(1000) == 20

    def test_fizz_buzz_6(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(10000) == 200

    def test_fizz_buzz_7(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(100000) == 2000

    def test_fizz_buzz_8(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(1000000) == 20000

    def test_fizz_buzz_9(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(10000000) == 200000

    def test_fizz_buzz_10(self):
        """
        Test case for the :func:`original.id_37.fizz_buzz`.
        """
        assert fizz_buzz(100000000) == 2000000


# id_38.py


def fizz_buzz(n: int):
    """Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
    >>> fizz_buzz(50)
    0
    >>> fizz_buzz(78)
    2
    >>> fizz_buzz(79)
    3
    """

    ns = []
    for i in range(n):
        if i % 11 == 0 or i % 13 == 0:
            ns.append(i)
    s = ''.join(list(map(str, ns)))
    ans = 0
    for c in s:
        ans += (c == '7')
    return ans


# id_38_Test.java
from original.id_38 import fizz_buzz

import pytest

class id_38_Test:
    """
    Test class of id_38.py.
    It contains ten unit test cases for the :func:`original.id_38.fizz_buzz`.
    """
		
    def test_fizz_buzz_1(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(50) == 0

    def test_fizz_buzz_2(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(78) == 2

    def test_fizz_buzz_3(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(79) == 3

    def test_fizz_buzz_4(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(100) == 4

    def test_fizz_buzz_5(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(1000) == 20

    def test_fizz_buzz_6(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(10000) == 200

    def test_fizz_buzz_7(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(100000) == 2000

    def test_fizz_buzz_8(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(1000000) == 20000

    def test_fizz_buzz_9(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(10000000) == 200000

    def test_fizz_buzz_10(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(100000000) == 2000000


# id_38_Test.py
from original.id_38 import fizz_buzz

import pytest

class id_38_Test:
    """
    Test class of id_38.py.
    It contains ten unit test cases for the :func:`original.id_38.fizz_buzz`.
    """
		
    def test_fizz_buzz_1(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(50) == 0

    def test_fizz_buzz_2(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(78) == 2

    def test_fizz_buzz_3(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(79) == 3

    def test_fizz_buzz_4(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(100) == 4

    def test_fizz_buzz_5(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(1000) == 20

    def test_fizz_buzz_6(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(10000) == 200

    def test_fizz_buzz_7(self):
        """
        Test case for the :func:`original.id_38.fizz_buzz`.
        """
        assert fizz_buzz(100000) == 2000

    def test_fizz_buzz_8(self):