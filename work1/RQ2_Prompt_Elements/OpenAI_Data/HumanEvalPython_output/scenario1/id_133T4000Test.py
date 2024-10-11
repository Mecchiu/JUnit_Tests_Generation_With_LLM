# id_133_Test.java
from scenario1.id_133 import sum_squares

import pytest

class id_133_Test:
    """
    Test class of id_133.py.
    It contains ten unit test cases for the :func:`scenario1.id_133.sum_squares`.
    """


    def test_sum_squares_1(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4]) == 30
		
    def test_sum_squares_3(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5]) == 55
		
    def test_sum_squares_4(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6]) == 91
		
    def test_sum_squares_5(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7]) == 140
		
    def test_sum_squares_6(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8]) == 204
		
    def test_sum_squares_7(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 285
		
    def test_sum_squares_8(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 385
		
    def test_sum_squares_9(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 506
		
    def test_sum_squares_10(self):
        """
        Test case for the :func:`scenario1.id_133.sum_squares`.
        """
        assert sum_squares([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 650
		
		
# id_134.py


def sum_cubes(lst):
   
    

    import math
    cubed = 0
    for i in lst:
        cubed += math.ceil(i)**3
    return cubed

# id_134_Test.java
from scenario1.id_134 import sum_cubes

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario1.id_134.sum_cubes`.
    """
		
    def test_sum_cubes_1(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3]) == 36
		
    def test_sum_cubes_2(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4]) == 100
		
    def test_sum_cubes_3(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5]) == 225
		
    def test_sum_cubes_4(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6]) == 391
		
    def test_sum_cubes_5(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7]) == 585
		
    def test_sum_cubes_6(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8]) == 816
		
    def test_sum_cubes_7(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 1089
		
    def test_sum_cubes_8(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 1404
		
    def test_sum_cubes_9(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 1763
		
    def test_sum_cubes_10(self):
        """
        Test case for the :func:`scenario1.id_134.sum_cubes`.
        """
        assert sum_cubes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 2167
		
		
# id_135.py


def sum_factorials(lst):
   
    

    import math
    factorial = 0
    for i in lst:
        factorial += math.factorial(i)
    return factorial

# id_135_Test.java
from scenario1.id_135 import sum_factorials

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario1.id_135.sum_factorials`.
    """
		
    def test_sum_factorials_1(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3]) == 9
		
    def test_sum_factorials_2(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4]) == 33
		
    def test_sum_factorials_3(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5]) == 153
		
    def test_sum_factorials_4(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6]) == 873
		
    def test_sum_factorials_5(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6, 7]) == 5913
		
    def test_sum_factorials_6(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6, 7, 8]) == 46233
		
    def test_sum_factorials_7(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 409113
		
    def test_sum_factorials_8(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 409113
		
    def test_sum_factorials_9(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 48828125
		
    def test_sum_factorials_10(self):
        """
        Test case for the :func:`scenario1.id_135.sum_factorials`.
        """
        assert sum_factorials([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 6227020800
		
		
# id_136.py


def sum_fibonacci(lst):
   
    

    import math
    fibonacci = 0
    for i in lst:
        fibonacci += math.ceil(((1+math.sqrt(5))**i-(1-math.sqrt(5))**i)/(2**i*math.sqrt(5)))
    return fibonacci

# id_136_Test.java
from scenario1.id_136 import sum_fibonacci

import pytest

class id_136_Test:
    """
    Test class of id_136.py.
    It contains ten unit test cases for the :func:`scenario1.id_136.sum_fibonacci`.
    """
		
    def test_sum_fibonacci_1(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3]) == 7
		
    def test_sum_fibonacci_2(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4]) == 20
		
    def test_sum_fibonacci_3(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5]) == 55
		
    def test_sum_fibonacci_4(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6]) == 144
		
    def test_sum_fibonacci_5(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6, 7]) == 377
		
    def test_sum_fibonacci_6(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6, 7, 8]) == 987
		
    def test_sum_fibonacci_7(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6, 7, 8, 9]) == 2584
		
    def test_sum_fibonacci_8(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 6765
		
    def test_sum_fibonacci_9(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == 17711
		
    def test_sum_fibonacci_10(self):
        """
        Test case for the :func:`scenario1.id_136.sum_fibonacci`.
        """
        assert sum_fibonacci([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == 46368
		
		
# id_137.py


def sum_primes(lst):
   
    

    import math
    primes = 0
    for i in lst:
        if i > 1:
            for j in range(2, i):
                if (i % j) == 0:
                    break
            else:
                primes += i
    return primes

# id_137_Test.java
from scenario1.id_137 import sum_primes

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`scenario1.id_137.sum_primes`.
    """
		
    def test_sum_primes_1(self):
        """
        Test case for the :func:`scenario1.id_137.sum_primes`.
        """
        assert sum_primes([1, 2, 3]) == 5
		
    def test_sum_primes_2(self):
        """
        Test case for the :func:`scenario1.id_137.sum_primes`.
        """
        assert sum_primes([1, 2, 3, 4]) == 7
		
    def test_sum_primes_3(self):
        """
        Test case for the :func:`scenario1.id_137.sum_primes`.
        """
        assert sum_primes([1, 2, 3, 4, 5]) == 10
		
    def test_sum_primes_4(self):
        """
        Test case for the :func:`scenario1.id_137.sum_primes`.
        """
        assert sum_primes([1, 2, 3, 4, 5, 6]) == 10
		
    def test_sum_primes_5(self):
        """
        Test case for the :func:`scenario1.id_137.sum_primes`.
        """
        assert sum_primes([1, 2, 3, 4, 5, 6, 7]) == 17
		
    def test_sum_primes_6(self):
        """
        Test case for the :func:`scenario1.id_137.sum_primes`.
        """
        assert sum_primes([1, 2, 3, 4, 5