# id_98_Test.java
from scenario2.id_98 import count_upper

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`scenario2.id_98.count_upper`.
    """


    def test_count_upper_1(self):
        """
        Test case 1 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("") == 0
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("a") == 0
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("A") == 1
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aA") == 1
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAa") == 1
		
    def test_count_upper_6(self):
        """
        Test case 6 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaA") == 2
		
    def test_count_upper_7(self):
        """
        Test case 7 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAa") == 2
		
    def test_count_upper_8(self):
        """
        Test case 8 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaA") == 3
		
    def test_count_upper_9(self):
        """
        Test case 9 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAa") == 3
		
    def test_count_upper_10(self):
        """
        Test case 10 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaA") == 4
		
    def test_count_upper_11(self):
        """
        Test case 11 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAa") == 4
		
    def test_count_upper_12(self):
        """
        Test case 12 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaA") == 5
		
    def test_count_upper_13(self):
        """
        Test case 13 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAa") == 5
		
    def test_count_upper_14(self):
        """
        Test case 14 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaA") == 6
		
    def test_count_upper_15(self):
        """
        Test case 15 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAa") == 6
		
    def test_count_upper_16(self):
        """
        Test case 16 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaA") == 7
		
    def test_count_upper_17(self):
        """
        Test case 17 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAa") == 7
		
    def test_count_upper_18(self):
        """
        Test case 18 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaA") == 8
		
    def test_count_upper_19(self):
        """
        Test case 19 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAa") == 8
		
    def test_count_upper_20(self):
        """
        Test case 20 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaA") == 9
		
    def test_count_upper_21(self):
        """
        Test case 21 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAa") == 9
		
    def test_count_upper_22(self):
        """
        Test case 22 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaA") == 10
		
    def test_count_upper_23(self):
        """
        Test case 23 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAa") == 10
		
    def test_count_upper_24(self):
        """
        Test case 24 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaA") == 11
		
    def test_count_upper_25(self):
        """
        Test case 25 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAa") == 11
		
    def test_count_upper_26(self):
        """
        Test case 26 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaA") == 12
		
    def test_count_upper_27(self):
        """
        Test case 27 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAa") == 12
		
    def test_count_upper_28(self):
        """
        Test case 28 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaA") == 13
		
    def test_count_upper_29(self):
        """
        Test case 29 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAa") == 13
		
    def test_count_upper_30(self):
        """
        Test case 30 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 14
		
    def test_count_upper_31(self):
        """
        Test case 31 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 14
		
    def test_count_upper_32(self):
        """
        Test case 32 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 15
		
    def test_count_upper_33(self):
        """
        Test case 33 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 15
		
    def test_count_upper_34(self):
        """
        Test case 34 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 16
		
    def test_count_upper_35(self):
        """
        Test case 35 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 16
		
    def test_count_upper_36(self):
        """
        Test case 36 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 17
		
    def test_count_upper_37(self):
        """
        Test case 37 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 17
		
    def test_count_upper_38(self):
        """
        Test case 38 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 18
		
    def test_count_upper_39(self):
        """
        Test case 39 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 18
		
    def test_count_upper_40(self):
        """
        Test case 40 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 19
		
    def test_count_upper_41(self):
        """
        Test case 41 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 19
		
    def test_count_upper_42(self):
        """
        Test case 42 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 20
		
    def test_count_upper_43(self):
        """
        Test case 43 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 20
		
    def test_count_upper_44(self):
        """
        Test case 44 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 21
		
    def test_count_upper_45(self):
        """
        Test case 45 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 21
		
    def test_count_upper_46(self):
        """
        Test case 46 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 22
		
    def test_count_upper_47(self):
        """
        Test case 47 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 22
		
    def test_count_upper_48(self):
        """
        Test case 48 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 23
		
    def test_count_upper_49(self):
        """
        Test case 49 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 23
		
    def test_count_upper_50(self):
        """
        Test case 50 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAa") == 24
		
    def test_count_upper_51(self):
        """
        Test case 51 for :func:`scenario2.id_98.count_upper`.
        """
        assert count_upper("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA") == 24
		
    def test_count_upper_52(self):
        """
        Test case 52 for :func:`scenario2.id_98.count_