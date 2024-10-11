# id_135_Test.java
from original.id_135 import can_arrange

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`original.id_135.can_arrange`.
    """


    def test_can_arrange_1(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5]) == 3
		
    def test_can_arrange_2(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3]) == -1
		
    def test_can_arrange_3(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10]) == 3
		
    def test_can_arrange_4(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10]) == -1
		
    def test_can_arrange_5(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]) == 3
		
    def test_can_arrange_6(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]) == -1
		
    def test_can_arrange_7(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]) == 3
		
    def test_can_arrange_8(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]) == -1
		
    def test_can_arrange_9(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,4,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40]) == 3
		
    def test_can_arrange_10(self):
        """
        Test case for the function :func:`original.id_135.can_arrange`.
        """
        assert can_arrange([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40]) == -1
		
if __name__ == '__main__':
    pytest.main()