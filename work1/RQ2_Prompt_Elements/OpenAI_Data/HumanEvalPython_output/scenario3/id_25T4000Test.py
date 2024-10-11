# id_25_Test.java
from scenario3.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario3.id_25.factorize`.
    """


    def test_factorize_1(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_2(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_3(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(70) == [2, 5, 7]

    def test_factorize_4(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(100) == [2, 2, 5, 5]

    def test_factorize_5(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(1) == []

    def test_factorize_6(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(2) == [2]

    def test_factorize_7(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(3) == [3]

    def test_factorize_8(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_9(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(5) == [5]

    def test_factorize_10(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(6) == [2, 3]

# id_25.py
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """

    pass
# id_25_Test.java
from scenario3.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario3.id_25.factorize`.
    """
		
    def test_factorize_1(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_2(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_3(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(70) == [2, 5, 7]

    def test_factorize_4(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(100) == [2, 2, 5, 5]

    def test_factorize_5(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(1) == []

    def test_factorize_6(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(2) == [2]

    def test_factorize_7(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(3) == [3]

    def test_factorize_8(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_9(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(5) == [5]

    def test_factorize_10(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(6) == [2, 3]

# id_25.py
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """

    pass
# id_25_Test.java
from scenario3.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario3.id_25.factorize`.
    """
		
    def test_factorize_1(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_2(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_3(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(70) == [2, 5, 7]

    def test_factorize_4(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(100) == [2, 2, 5, 5]

    def test_factorize_5(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(1) == []

    def test_factorize_6(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(2) == [2]

    def test_factorize_7(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(3) == [3]

    def test_factorize_8(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_9(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(5) == [5]

    def test_factorize_10(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(6) == [2, 3]

# id_25.py
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """

    pass
# id_25_Test.java
from scenario3.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario3.id_25.factorize`.
    """
		
    def test_factorize_1(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_2(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_3(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(70) == [2, 5, 7]

    def test_factorize_4(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(100) == [2, 2, 5, 5]

    def test_factorize_5(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(1) == []

    def test_factorize_6(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(2) == [2]

    def test_factorize_7(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(3) == [3]

    def test_factorize_8(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_9(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(5) == [5]

    def test_factorize_10(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(6) == [2, 3]

# id_25.py
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """

    pass
# id_25_Test.java
from scenario3.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario3.id_25.factorize`.
    """
		
    def test_factorize_1(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_2(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_3(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(70) == [2, 5, 7]

    def test_factorize_4(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(100) == [2, 2, 5, 5]

    def test_factorize_5(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(1) == []

    def test_factorize_6(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(2) == [2]

    def test_factorize_7(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(3) == [3]

    def test_factorize_8(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_9(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(5) == [5]

    def test_factorize_10(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(6) == [2, 3]

# id_25.py
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """

    pass
# id_25_Test.java
from scenario3.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario3.id_25.factorize`.
    """
		
    def test_factorize_1(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_2(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_3(self):
        """
        Test case for the :func:`scenario3.id_25.factorize` function.
        """
        assert factorize(70) == [2, 5, 7]

