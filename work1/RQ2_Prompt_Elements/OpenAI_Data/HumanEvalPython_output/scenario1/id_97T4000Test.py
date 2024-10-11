# id_97_Test.java
from scenario1.id_97 import multiply

import pytest

class id_97_Test:
    """
    Test class of id_97.py.
    It contains ten unit test cases for the :func:`scenario1.id_97.multiply`.
    """


    def test_multiply_1(self):
        """
        Test case 1 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(1, 1) == 1

    def test_multiply_2(self):
        """
        Test case 2 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(1, -1) == 1

    def test_multiply_3(self):
        """
        Test case 3 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(-1, 1) == 1

    def test_multiply_4(self):
        """
        Test case 4 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(-1, -1) == 1

    def test_multiply_5(self):
        """
        Test case 5 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(0, 0) == 0

    def test_multiply_6(self):
        """
        Test case 6 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(0, 1) == 0

    def test_multiply_7(self):
        """
        Test case 7 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(1, 0) == 0

    def test_multiply_8(self):
        """
        Test case 8 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(0, -1) == 0

    def test_multiply_9(self):
        """
        Test case 9 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(-1, 0) == 0

    def test_multiply_10(self):
        """
        Test case 10 for :func:`scenario1.id_97.multiply`.
        """
        assert multiply(123456789, 987654321) == 9


# id_98.py

def divide(a, b):

    return abs(a % 10) / abs(b % 10)

# id_98_Test.java
from scenario1.id_98 import divide

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`scenario1.id_98.divide`.
    """
		
    def test_divide_1(self):
        """
        Test case 1 for :func:`scenario1.id_98.divide`.
        """
        assert divide(1, 1) == 1

    def test_divide_2(self):
        """
        Test case 2 for :func:`scenario1.id_98.divide`.
        """
        assert divide(1, -1) == 1

    def test_divide_3(self):
        """
        Test case 3 for :func:`scenario1.id_98.divide`.
        """
        assert divide(-1, 1) == 1

    def test_divide_4(self):
        """
        Test case 4 for :func:`scenario1.id_98.divide`.
        """
        assert divide(-1, -1) == 1

    def test_divide_5(self):
        """
        Test case 5 for :func:`scenario1.id_98.divide`.
        """
        assert divide(0, 0) == 0

    def test_divide_6(self):
        """
        Test case 6 for :func:`scenario1.id_98.divide`.
        """
        assert divide(0, 1) == 0

    def test_divide_7(self):
        """
        Test case 7 for :func:`scenario1.id_98.divide`.
        """
        assert divide(1, 0) == 0

    def test_divide_8(self):
        """
        Test case 8 for :func:`scenario1.id_98.divide`.
        """
        assert divide(0, -1) == 0

    def test_divide_9(self):
        """
        Test case 9 for :func:`scenario1.id_98.divide`.
        """
        assert divide(-1, 0) == 0

    def test_divide_10(self):
        """
        Test case 10 for :func:`scenario1.id_98.divide`.
        """
        assert divide(123456789, 987654321) == 0


# id_99.py

def mod(a, b):

    return abs(a % 10) % abs(b % 10)

# id_99_Test.java
from scenario1.id_99 import mod

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`scenario1.id_99.mod`.
    """
		
    def test_mod_1(self):
        """
        Test case 1 for :func:`scenario1.id_99.mod`.
        """
        assert mod(1, 1) == 0

    def test_mod_2(self):
        """
        Test case 2 for :func:`scenario1.id_99.mod`.
        """
        assert mod(1, -1) == 0

    def test_mod_3(self):
        """
        Test case 3 for :func:`scenario1.id_99.mod`.
        """
        assert mod(-1, 1) == 0

    def test_mod_4(self):
        """
        Test case 4 for :func:`scenario1.id_99.mod`.
        """
        assert mod(-1, -1) == 0

    def test_mod_5(self):
        """
        Test case 5 for :func:`scenario1.id_99.mod`.
        """
        assert mod(0, 0) == 0

    def test_mod_6(self):
        """
        Test case 6 for :func:`scenario1.id_99.mod`.
        """
        assert mod(0, 1) == 0

    def test_mod_7(self):
        """
        Test case 7 for :func:`scenario1.id_99.mod`.
        """
        assert mod(1, 0) == 0

    def test_mod_8(self):
        """
        Test case 8 for :func:`scenario1.id_99.mod`.
        """
        assert mod(0, -1) == 0

    def test_mod_9(self):
        """
        Test case 9 for :func:`scenario1.id_99.mod`.
        """
        assert mod(-1, 0) == 0

    def test_mod_10(self):
        """
        Test case 10 for :func:`scenario1.id_99.mod`.
        """
        assert mod(123456789, 987654321) == 8


# id_100.py

def power(a, b):

    return abs(a % 10) ** abs(b % 10)

# id_100_Test.java
from scenario1.id_100 import power

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`scenario1.id_100.power`.
    """
		
    def test_power_1(self):
        """
        Test case 1 for :func:`scenario1.id_100.power`.
        """
        assert power(1, 1) == 1

    def test_power_2(self):
        """
        Test case 2 for :func:`scenario1.id_100.power`.
        """
        assert power(1, -1) == 1

    def test_power_3(self):
        """
        Test case 3 for :func:`scenario1.id_100.power`.
        """
        assert power(-1, 1) == 1

    def test_power_4(self):
        """
        Test case 4 for :func:`scenario1.id_100.power`.
        """
        assert power(-1, -1) == 1

    def test_power_5(self):
        """
        Test case 5 for :func:`scenario1.id_100.power`.
        """
        assert power(0, 0) == 1

    def test_power_6(self):
        """
        Test case 6 for :func:`scenario1.id_100.power`.
        """
        assert power(0, 1) == 0

    def test_power_7(self):
        """
        Test case 7 for :func:`scenario1.id_100.power`.
        """
        assert power(1, 0) == 1

    def test_power_8(self):
        """
        Test case 8 for :func:`scenario1.id_100.power`.
        """
        assert power(0, -1) == 0

    def test_power_9(self):
        """
        Test case 9 for :func:`scenario1.id_100.power`.
        """
        assert power(-1, 0) == 1

    def test_power_10(self):
        """
        Test case 10 for :func:`scenario1.id_100.power`.
        """
        assert power(123456789, 987654321) == 9


# id_101.py

def square(a):

    return abs(a % 10) ** 2

# id_101_Test.java
from scenario1.id_101 import square

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`scenario1.id_101.square`.
    """
		
    def test_square_1(self):
        """
        Test case 1 for :func:`scenario1.id_101.square`.
        """
        assert square(1) == 1

    def test_square_2(self):
        """
        Test case 2 for :func:`scenario1.id_101.square`.
        """
        assert square(-1) == 1

    def test_square_3(self):
        """
        Test case 3 for :func:`scenario1.id_101.square`.
        """
        assert square(0) == 0

    def test_square_4(self):
        """
        Test case 4 for :func:`scenario1.id_101.square`.
        """
        assert square(123456789) == 81

    def test_square_5(self):
        """
        Test case 5 for :func:`scenario1.id_101.square`.
        """
        assert square(987654321) == 1

    def test_square_6(self):
        """
        Test case 6 for :func:`scenario1.id_101.square`.
        """
        assert square(111111111) == 1

    def test_square_7(self):
        """
        Test case 7 for :func:`scenario1.id_101.square`.
        """
        assert square(222222222) == 4

    def test_square_8(self):
        """
        Test case 8 for :func:`scenario1.id_101.square`.
        """
        assert square(333333333) == 9

    def test_square_9(self):
        """
        Test case 9 for :func:`scenario1.id_101.square`.
        """
        assert square(444444444) == 6

    def test_square_10(self):
        """
        Test case 10 for :func:`scenario1.id_101.square`.
        """
        assert square(555555555) == 1


# id_102.py

def cube(a):

    return abs(a % 10) ** 3

# id_102_Test.java
from scenario1.id_102 import cube

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario1.id_102.cube`.
    """
		
    def test_cube_1(self):
        """
        Test case 1 for :func:`scenario1.id_102.cube`.
        """
        assert cube(1) == 1

    def test_cube_2(self):
        """
        Test case 2 for :func:`scenario1.id_102.cube`.
        """
        assert cube(-1) == 1

    def test_cube_3(self):
        """
        Test case 3 for :func:`scenario1.id_102.cube`.
        """
        assert cube(0) == 0

    def test_cube_4(self):
        """
        Test case 4 for :func:`scenario1.id_102.cube`.
        """
        assert cube(123456789) == 7

    def test_cube_5(self):
        """
        Test case 5 for :func:`scenario1.id_102.cube`.
        """
        assert cube(987654321) == 1

    def test_cube_6(self):
        """
        Test case 6 for :func:`scenario1.id_102.cube`.
        """
        assert cube(111111111) == 1

    def test_cube_7(self):
        """
        Test case 7 for :func:`scenario1.id_102.cube`.
        """
        assert cube(222222222) == 8

    def test_cube_8(self):
        """
        Test case 8 for :func:`scenario1.id_102.cube`.
        """
        assert cube(333333333) == 7

    def test_cube_9(self):
        """
        Test case 9 for :func:`scenario1.id_102.cube`.
        """
        assert cube(444444444) == 4

    def test_cube_10(self):
        """
        Test case 10 for :func:`scenario1.id_102.cube`.
        """
        assert cube(555555555) == 1


# id_103.py

def square_root(a):

    return abs(a % 10) ** 0.5

# id_103_Test.java
from scenario1.id_103 import square_root

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario1.id_103.square_root`.
    """
		
    def test_square_root_1(self):
        """
        Test case 1 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(1) == 1

    def test_square_root_2(self):
        """
        Test case 2 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(-1) == 1

    def test_square_root_3(self):
        """
        Test case 3 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(0) == 0

    def test_square_root_4(self):
        """
        Test case 4 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(123456789) == 9

    def test_square_root_5(self):
        """
        Test case 5 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(987654321) == 3

    def test_square_root_6(self):
        """
        Test case 6 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(111111111) == 1

    def test_square_root_7(self):
        """
        Test case 7 for :func:`scenario1.id_103.square_root`.
        """
        assert square_root(