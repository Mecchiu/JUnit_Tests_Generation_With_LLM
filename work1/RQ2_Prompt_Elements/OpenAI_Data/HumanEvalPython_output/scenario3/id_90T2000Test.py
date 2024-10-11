# id_90_Test.java
from scenario3.id_90 import next_smallest

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario3.id_90.next_smallest`.
    """


    def test_next_smallest_1(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([1, 2, 3, 4, 5]) == 2
		
    def test_next_smallest_2(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([5, 1, 4, 3, 2]) == 2
		
    def test_next_smallest_3(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([]) == None
		
    def test_next_smallest_4(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([1, 1]) == None
		
    def test_next_smallest_5(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == 2
		
    def test_next_smallest_6(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2
		
    def test_next_smallest_7(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]) == 2
		
    def test_next_smallest_8(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2
		
    def test_next_smallest_9(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]) == 2
		
    def test_next_smallest_10(self):
        """
        Test case for next_smallest() function.
        """
        assert next_smallest([30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]) == 2
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_90_Test.py'])