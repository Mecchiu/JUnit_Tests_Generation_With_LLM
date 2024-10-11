# id_60_Test.java
from scenario2.id_60 import sum_to_n

import pytest

class id_60_Test:
    """
    Test class of id_60.py.
    It contains ten unit test cases for the :func:`scenario2.id_60.sum_to_n`.
    """


    def test_sum_to_n_1(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 1.
        """
        assert sum_to_n(1) == 1

    def test_sum_to_n_2(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 2.
        """
        assert sum_to_n(2) == 3

    def test_sum_to_n_3(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 3.
        """
        assert sum_to_n(3) == 6

    def test_sum_to_n_4(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 4.
        """
        assert sum_to_n(4) == 10

    def test_sum_to_n_5(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 5.
        """
        assert sum_to_n(5) == 15

    def test_sum_to_n_6(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 6.
        """
        assert sum_to_n(6) == 21

    def test_sum_to_n_7(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 7.
        """
        assert sum_to_n(7) == 28

    def test_sum_to_n_8(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 8.
        """
        assert sum_to_n(8) == 36

    def test_sum_to_n_9(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 9.
        """
        assert sum_to_n(9) == 45

    def test_sum_to_n_10(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 10.
        """
        assert sum_to_n(10) == 55

# id_60_Test.py
from scenario2.id_60 import sum_to_n

import pytest

class id_60_Test:
    """
    Test class of id_60.py.
    It contains ten unit test cases for the :func:`scenario2.id_60.sum_to_n`.
    """
		
    def test_sum_to_n_1(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 1.
        """
        assert sum_to_n(1) == 1

    def test_sum_to_n_2(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 2.
        """
        assert sum_to_n(2) == 3

    def test_sum_to_n_3(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 3.
        """
        assert sum_to_n(3) == 6

    def test_sum_to_n_4(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 4.
        """
        assert sum_to_n(4) == 10

    def test_sum_to_n_5(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 5.
        """
        assert sum_to_n(5) == 15

    def test_sum_to_n_6(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 6.
        """
        assert sum_to_n(6) == 21

    def test_sum_to_n_7(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 7.
        """
        assert sum_to_n(7) == 28

    def test_sum_to_n_8(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 8.
        """
        assert sum_to_n(8) == 36

    def test_sum_to_n_9(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 9.
        """
        assert sum_to_n(9) == 45

    def test_sum_to_n_10(self):
        """
        Test case for the :func:`scenario2.id_60.sum_to_n` with n = 10.
        """
        assert sum_to_n(10) == 55

# id_61.java

/**
 * id_61
 */
public class id_61 {

    public static int sum_to_n(int n) {
        return (n * (n + 1)) / 2;
    }
}

# id_61.py


def sum_to_n(n: int):
    """sum_to_n is a function that sums numbers from 1 to n.
    
    
    """

    return (n * (n + 1)) / 2

# id_61_Test.java
from scenario2.id_61 import sum_to_n

import pytest

class id_61_Test:
    """
    Test class of id_61.py.
    It contains ten unit test cases for the :func:`scenario2.id_61.sum_to_n`.
    """
		
    def test_sum_to_n_1(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 1.
        """
        assert sum_to_n(1) == 1

    def test_sum_to_n_2(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 2.
        """
        assert sum_to_n(2) == 3

    def test_sum_to_n_3(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 3.
        """
        assert sum_to_n(3) == 6

    def test_sum_to_n_4(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 4.
        """
        assert sum_to_n(4) == 10

    def test_sum_to_n_5(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 5.
        """
        assert sum_to_n(5) == 15

    def test_sum_to_n_6(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 6.
        """
        assert sum_to_n(6) == 21

    def test_sum_to_n_7(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 7.
        """
        assert sum_to_n(7) == 28

    def test_sum_to_n_8(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 8.
        """
        assert sum_to_n(8) == 36

    def test_sum_to_n_9(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 9.
        """
        assert sum_to_n(9) == 45

    def test_sum_to_n_10(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 10.
        """
        assert sum_to_n(10) == 55

# id_61_Test.py
from scenario2.id_61 import sum_to_n

import pytest

class id_61_Test:
    """
    Test class of id_61.py.
    It contains ten unit test cases for the :func:`scenario2.id_61.sum_to_n`.
    """
		
    def test_sum_to_n_1(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 1.
        """
        assert sum_to_n(1) == 1

    def test_sum_to_n_2(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 2.
        """
        assert sum_to_n(2) == 3

    def test_sum_to_n_3(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 3.
        """
        assert sum_to_n(3) == 6

    def test_sum_to_n_4(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 4.
        """
        assert sum_to_n(4) == 10

    def test_sum_to_n_5(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 5.
        """
        assert sum_to_n(5) == 15

    def test_sum_to_n_6(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 6.
        """
        assert sum_to_n(6) == 21

    def test_sum_to_n_7(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 7.
        """
        assert sum_to_n(7) == 28

    def test_sum_to_n_8(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 8.
        """
        assert sum_to_n(8) == 36

    def test_sum_to_n_9(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 9.
        """
        assert sum_to_n(9) == 45

    def test_sum_to_n_10(self):
        """
        Test case for the :func:`scenario2.id_61.sum_to_n` with n = 10.
        """
        assert sum_to_n(10) == 55

# id_62.java

/**
 * id_62
 */
public class id_62 {

    public static int sum_to_n(int n) {
        return (n * (n + 1)) / 2;
    }
}

# id_62.py


def sum_to_n(n: int):
    """sum_to_n is a function that sums numbers from 1 to n.
    
    
    """

    return (n * (n + 1)) / 2

# id_62_Test.java
from scenario2.id_62 import sum_to_n

import pytest

class id_62_Test:
    """
    Test class of id_62.py.
    It contains ten unit test cases for the :func:`scenario2.id_62.sum_to_n`.
    """
		
    def test_sum_to_n_1(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 1.
        """
        assert sum_to_n(1) == 1

    def test_sum_to_n_2(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 2.
        """
        assert sum_to_n(2) == 3

    def test_sum_to_n_3(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 3.
        """
        assert sum_to_n(3) == 6

    def test_sum_to_n_4(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 4.
        """
        assert sum_to_n(4) == 10

    def test_sum_to_n_5(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 5.
        """
        assert sum_to_n(5) == 15

    def test_sum_to_n_6(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 6.
        """
        assert sum_to_n(6) == 21

    def test_sum_to_n_7(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 7.
        """
        assert sum_to_n(7) == 28

    def test_sum_to_n_8(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 8.
        """
        assert sum_to_n(8) == 36

    def test_sum_to_n_9(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 9.
        """
        assert sum_to_n(9) == 45

    def test_sum_to_n_10(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 10.
        """
        assert sum_to_n(10) == 55

# id_62_Test.py
from scenario2.id_62 import sum_to_n

import pytest

class id_62_Test:
    """
    Test class of id_62.py.
    It contains ten unit test cases for the :func:`scenario2.id_62.sum_to_n`.
    """
		
    def test_sum_to_n_1(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 1.
        """
        assert sum_to_n(1) == 1

    def test_sum_to_n_2(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 2.
        """
        assert sum_to_n(2) == 3

    def test_sum_to_n_3(self):
        """
        Test case for the :func:`scenario2.id_62.sum_to_n` with n = 3.
        """
        assert sum_to