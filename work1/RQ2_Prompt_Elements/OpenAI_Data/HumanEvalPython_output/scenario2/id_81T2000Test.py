# id_81_Test.java
from scenario2.id_81 import numerical_letter_grade

import pytest

class id_81_Test:
    """
    Test class of id_81.py.
    It contains ten unit test cases for the :func:`scenario2.id_81.numerical_letter_grade`.
    """


    def test_numerical_letter_grade_1(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_2(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_3(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_4(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['B+', 'B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_5(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['B', 'B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_6(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['B-', 'C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_7(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([2.0, 1.7, 1.3, 1.0, 0.7, 0.0]) == ['C+', 'C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_8(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([1.7, 1.3, 1.0, 0.7, 0.0]) == ['C', 'C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_9(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([1.3, 1.0, 0.7, 0.0]) == ['C-', 'D+', 'D', 'E']
		
    def test_numerical_letter_grade_10(self):
        """
        Test case for the :func:`scenario2.id_81.numerical_letter_grade`.
        """
        assert numerical_letter_grade([1.0, 0.7, 0.0]) == ['D+', 'D', 'E']