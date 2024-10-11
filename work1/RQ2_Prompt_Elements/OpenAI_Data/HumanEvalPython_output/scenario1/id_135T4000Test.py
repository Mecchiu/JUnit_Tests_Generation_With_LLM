# id_135_Test.java
from scenario1.id_135 import can_arrange

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario1.id_135.can_arrange`.
    """


    def test_can_arrange_1(self):
        """
        Test case 1 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5]) == -1
		
    def test_can_arrange_2(self):
        """
        Test case 2 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,5,4]) == 4
		
    def test_can_arrange_3(self):
        """
        Test case 3 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10]) == -1
		
    def test_can_arrange_4(self):
        """
        Test case 4 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11]) == 10
		
    def test_can_arrange_5(self):
        """
        Test case 5 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12]) == -1
		
    def test_can_arrange_6(self):
        """
        Test case 6 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13]) == 12
		
    def test_can_arrange_7(self):
        """
        Test case 7 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14]) == -1
		
    def test_can_arrange_8(self):
        """
        Test case 8 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]) == 14
		
    def test_can_arrange_9(self):
        """
        Test case 9 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]) == -1
		
    def test_can_arrange_10(self):
        """
        Test case 10 for :func:`scenario1.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]) == 16
		
if __name__ == '__main__':
    pytest.main(['-v', '-s', 'id_135_Test.py'])