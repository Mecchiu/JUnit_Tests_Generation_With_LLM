# id_81_Test.java
from scenario3.id_81 import numerical_letter_grade

import pytest

class id_81_Test:
    """
    Test class of id_81.py.
    It contains ten unit test cases for the :func:`scenario3.id_81.numerical_letter_grade`.
    """


    def test_id_81_1(self):
        """
        Test case 1 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5]) == ['A+', 'B', 'C-', 'C', 'A-']
		
    def test_id_81_2(self):
        """
        Test case 2 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_id_81_3(self):
        """
        Test case 3 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E']
		
    def test_id_81_4(self):
        """
        Test case 4 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E']
		
    def test_id_81_5(self):
        """
        Test case 5 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E', 'E']
		
    def test_id_81_6(self):
        """
        Test case 6 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E', 'E', 'E']
		
    def test_id_81_7(self):
        """
        Test case 7 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E', 'E', 'E', 'E']
		
    def test_id_81_8(self):
        """
        Test case 8 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E', 'E', 'E', 'E', 'E']
		
    def test_id_81_9(self):
        """
        Test case 9 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E']
		
    def test_id_81_10(self):
        """
        Test case 10 for :func:`scenario3.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3, 1.7, 2, 3.5, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]) == ['A+', 'B', 'C-', 'C', 'A-', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E']
		
# id_82.py

def is_prime(n):
    """
    Write a function that takes a number n and returns True if n is a prime number,
    otherwise it returns False.
    A prime number is a number that is only divisible by 1 and itself.

    Example:
    is_prime(5) ==> True
   