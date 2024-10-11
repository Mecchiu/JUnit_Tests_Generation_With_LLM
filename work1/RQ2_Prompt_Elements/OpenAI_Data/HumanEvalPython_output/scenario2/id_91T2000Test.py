# id_91_Test.java
from scenario2.id_91 import is_bored

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario2.id_91.is_bored`.
    """


    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored.") == 1
		
    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored?") == 2
		
    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored?") == 2
		
    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored!") == 3
		
    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored!") == 3
		
    def test_is_bored_11(self):
        """
        Test case 11 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored?") == 4
		
    def test_is_bored_12(self):
        """
        Test case 12 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored?") == 4
		
    def test_is_bored_13(self):
        """
        Test case 13 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored!") == 5
		
    def test_is_bored_14(self):
        """
        Test case 14 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored? I am not bored!") == 5
		
    def test_is_bored_15(self):
        """
        Test case 15 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored?") == 6
		
    def test_is_bored_16(self):
        """
        Test case 16 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored?") == 6
		
    def test_is_bored_17(self):
        """
        Test case 17 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored!") == 7
		
    def test_is_bored_18(self):
        """
        Test case 18 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored? I am not bored!") == 7
		
    def test_is_bored_19(self):
        """
        Test case 19 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored?") == 8
		
    def test_is_bored_20(self):
        """
        Test case 20 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored?") == 8
		
    def test_is_bored_21(self):
        """
        Test case 21 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored!") == 9
		
    def test_is_bored_22(self):
        """
        Test case 22 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored? I am not bored!") == 9
		
    def test_is_bored_23(self):
        """
        Test case 23 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored?") == 10
		
    def test_is_bored_24(self):
        """
        Test case 24 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored? I am not bored! I am bored?") == 10
		
    def test_is_bored_25(self):
        """
        Test case 25 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored! I am not bored? I am bored!") == 11