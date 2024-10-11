# id_130_Test.java
from scenario3.id_130 import tri

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario3.id_130.tri`.
    """


    def test_tri_1(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(3) == [1, 3, 2, 8]
		
    def test_tri_2(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(4) == [1, 3, 2, 8, 3]
		
    def test_tri_3(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(5) == [1, 3, 2, 8, 3, 11]
		
    def test_tri_4(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(6) == [1, 3, 2, 8, 3, 11, 5]
		
    def test_tri_5(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(7) == [1, 3, 2, 8, 3, 11, 5, 16]
		
    def test_tri_6(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(8) == [1, 3, 2, 8, 3, 11, 5, 16, 8]
		
    def test_tri_7(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(9) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19]
		
    def test_tri_8(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(10) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11]
		
    def test_tri_9(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(11) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24]
		
    def test_tri_10(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(12) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24, 13]
		
# id_130_Test.py
from scenario3.id_130 import tri

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario3.id_130.tri`.
    """
		
    def test_tri_1(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(3) == [1, 3, 2, 8]
		
    def test_tri_2(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(4) == [1, 3, 2, 8, 3]
		
    def test_tri_3(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(5) == [1, 3, 2, 8, 3, 11]
		
    def test_tri_4(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(6) == [1, 3, 2, 8, 3, 11, 5]
		
    def test_tri_5(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(7) == [1, 3, 2, 8, 3, 11, 5, 16]
		
    def test_tri_6(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(8) == [1, 3, 2, 8, 3, 11, 5, 16, 8]
		
    def test_tri_7(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(9) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19]
		
    def test_tri_8(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(10) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11]
		
    def test_tri_9(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(11) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24]
		
    def test_tri_10(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(12) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24, 13]
		
# id_131.py

def is_prime(n):
    """
    A prime number is a natural number greater than 1 that has no positive divisors 
    other than 1 and itself. Given a number, n, determine and print whether it's 
    Prime or Not prime.
    Note: If possible, try to come up with a O(sqrt(n)) primality algorithm, or see 
    what sort of optimizations you come up with for an O(n) algorithm. Be sure to 
    check out the Editorial after submitting your code!
    Input Format
    The first line contains an integer, T, the number of test cases.
    Each of the T subsequent lines contains an integer, n, to be tested for primality.
    Constraints
    1 <= T <= 30
    1 <= n <= 2 x 10^9
    Output Format
    For each test case, print whether n is Prime or Not prime on a new line.
    Sample Input
    3
    12
    5
    7
    Sample Output
    Not prime
    Prime
    Prime
    Explanation
    Test Case 0: n = 12.
    12 is divisible by numbers other than 1 and itself (i.e.: 2, 3, 6), so we print 
    Not prime on a new line.
    Test Case 1: n = 5.
    5 is only divisible 1 and itself, so we print Prime on a new line.
    Test Case 2: n = 7.
    7 is only divisible 1 and itself, so we print Prime on a new line.
    """

    pass
# id_131_Test.java
from scenario3.id_131 import is_prime

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario3.id_131.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(12) == "Not prime"
		
    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(5) == "Prime"
		
    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert