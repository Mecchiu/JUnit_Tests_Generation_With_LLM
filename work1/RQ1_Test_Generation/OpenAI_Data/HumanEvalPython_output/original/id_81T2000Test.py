# id_81_Test.java
from original.id_81 import numerical_letter_grade

import pytest

class id_81_Test:
    """
    Test class of id_81.py.
    It contains ten unit test cases for the :func:`original.id_81.numerical_letter_grade`.
    """


    def test_numerical_letter_grade_1(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5]) == ['A+', 'B', 'C-', 'C', 'A-']

    def test_numerical_letter_grade_2(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-']

    def test_numerical_letter_grade_3(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-']

    def test_numerical_letter_grade_4(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E']

    def test_numerical_letter_grade_5(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E']

    def test_numerical_letter_grade_6(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E']

    def test_numerical_letter_grade_7(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E']

    def test_numerical_letter_grade_8(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E', 'E']

    def test_numerical_letter_grade_9(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E', 'E', 'E']

    def test_numerical_letter_grade_10(self):
        """
        Test case for the :func:`original.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'D-', 'E', 'E', 'E', 'E', 'E', 'E', 'E']


# id_82.py

def is_prime(n):
    """
    Write a function that takes a number n and returns True if n is a prime number,
    otherwise it returns False.
    A prime number is a number that is only divisible by 1 and itself.
    For example, the first five prime numbers are 2, 3, 5, 7, and 11.

    Example:
    is_prime(7) ==> True
    is_prime(10) ==> False
    """

    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


# id_82_Test.java
from original.id_82 import is_prime

import pytest

class id_82_Test:
    """
    Test class of id_82.py.
    It contains ten unit test cases for the :func:`original.id_82.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_2(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_3(self):
        """
        Test case for the :func:`original.id_82.is_prime`.
        """
        assert is_prime(