# id_135_Test.java
from scenario2.id_135 import can_arrange

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario2.id_135.can_arrange`.
    """


    def test_can_arrange_1(self):
        """
        Test case 1 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5]) == -1
		
    def test_can_arrange_2(self):
        """
        Test case 2 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([5,4,3,2,1]) == 4
		
    def test_can_arrange_3(self):
        """
        Test case 3 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10]) == -1
		
    def test_can_arrange_4(self):
        """
        Test case 4 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([10,9,8,7,6,5,4,3,2,1]) == 9
		
    def test_can_arrange_5(self):
        """
        Test case 5 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11]) == -1
		
    def test_can_arrange_6(self):
        """
        Test case 6 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([11,10,9,8,7,6,5,4,3,2,1]) == 10
		
    def test_can_arrange_7(self):
        """
        Test case 7 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12]) == -1
		
    def test_can_arrange_8(self):
        """
        Test case 8 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([12,11,10,9,8,7,6,5,4,3,2,1]) == 11
		
    def test_can_arrange_9(self):
        """
        Test case 9 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13]) == -1
		
    def test_can_arrange_10(self):
        """
        Test case 10 for :func:`scenario2.id_135.can_arrange`.
        """
        assert can_arrange([13,12,11,10,9,8,7,6,5,4,3,2,1]) == 12
		
		
if __name__ == '__main__':
    pytest.main()