# id_137_Test.java
from scenario2.id_137 import compare_one

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`scenario2.id_137.compare_one`.
    """


    def test_compare_one_1(self):
        """
        Test case 1 of compare_one.
        """
        assert compare_one(1, 2) == 2
		
    def test_compare_one_2(self):
        """
        Test case 2 of compare_one.
        """
        assert compare_one(1.0, 2.0) == 2.0
		
    def test_compare_one_3(self):
        """
        Test case 3 of compare_one.
        """
        assert compare_one(1.0, 2) == 2
		
    def test_compare_one_4(self):
        """
        Test case 4 of compare_one.
        """
        assert compare_one(1, 2.0) == 2.0
		
    def test_compare_one_5(self):
        """
        Test case 5 of compare_one.
        """
        assert compare_one('1', '2') == '2'
		
    def test_compare_one_6(self):
        """
        Test case 6 of compare_one.
        """
        assert compare_one('1.0', '2.0') == '2.0'
		
    def test_compare_one_7(self):
        """
        Test case 7 of compare_one.
        """
        assert compare_one('1.0', '2') == '2'
		
    def test_compare_one_8(self):
        """
        Test case 8 of compare_one.
        """
        assert compare_one('1', '2.0') == '2.0'
		
    def test_compare_one_9(self):
        """
        Test case 9 of compare_one.
        """
        assert compare_one('1,0', '2,0') == '2,0'
		
    def test_compare_one_10(self):
        """
        Test case 10 of compare_one.
        """
        assert compare_one('1,0', '2') == '2'
		
    def test_compare_one_11(self):
        """
        Test case 11 of compare_one.
        """
        assert compare_one('1', '2,0') == '2,0'
		
    def test_compare_one_12(self):
        """
        Test case 12 of compare_one.
        """
        assert compare_one(1, 1) == None
		
    def test_compare_one_13(self):
        """
        Test case 13 of compare_one.
        """
        assert compare_one(1.0, 1.0) == None
		
    def test_compare_one_14(self):
        """
        Test case 14 of compare_one.
        """
        assert compare_one('1', '1') == None
		
    def test_compare_one_15(self):
        """
        Test case 15 of compare_one.
        """
        assert compare_one('1.0', '1.0') == None
		
    def test_compare_one_16(self):
        """
        Test case 16 of compare_one.
        """
        assert compare_one('1,0', '1,0') == None
		
    def test_compare_one_17(self):
        """
        Test case 17 of compare_one.
        """
        assert compare_one('1.0', '1') == '1.0'
		
    def test_compare_one_18(self):
        """
        Test case 18 of compare_one.
        """
        assert compare_one('1', '1.0') == '1.0'
		
    def test_compare_one_19(self):
        """
        Test case 19 of compare_one.
        """
        assert compare_one('1,0', '1') == '1,0'
		
    def test_compare_one_20(self):
        """
        Test case 20 of compare_one.
        """
        assert compare_one('1', '1,0') == '1,0'
		
    def test_compare_one_21(self):
        """
        Test case 21 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_22(self):
        """
        Test case 22 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_23(self):
        """
        Test case 23 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_24(self):
        """
        Test case 24 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_25(self):
        """
        Test case 25 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_26(self):
        """
        Test case 26 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_27(self):
        """
        Test case 27 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_28(self):
        """
        Test case 28 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_29(self):
        """
        Test case 29 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_30(self):
        """
        Test case 30 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_31(self):
        """
        Test case 31 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_32(self):
        """
        Test case 32 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_33(self):
        """
        Test case 33 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_34(self):
        """
        Test case 34 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_35(self):
        """
        Test case 35 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_36(self):
        """
        Test case 36 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_37(self):
        """
        Test case 37 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_38(self):
        """
        Test case 38 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_39(self):
        """
        Test case 39 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_40(self):
        """
        Test case 40 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_41(self):
        """
        Test case 41 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_42(self):
        """
        Test case 42 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_43(self):
        """
        Test case 43 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_44(self):
        """
        Test case 44 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_45(self):
        """
        Test case 45 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_46(self):
        """
        Test case 46 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_47(self):
        """
        Test case 47 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_48(self):
        """
        Test case 48 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_49(self):
        """
        Test case 49 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_50(self):
        """
        Test case 50 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_51(self):
        """
        Test case 51 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_52(self):
        """
        Test case 52 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_53(self):
        """
        Test case 53 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_54(self):
        """
        Test case 54 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_55(self):
        """
        Test case 55 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_56(self):
        """
        Test case 56 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_57(self):
        """
        Test case 57 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_58(self):
        """
        Test case 58 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_59(self):
        """
        Test case 59 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_60(self):
        """
        Test case 60 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_61(self):
        """
        Test case 61 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_62(self):
        """
        Test case 62 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_63(self):
        """
        Test case 63 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_64(self):
        """
        Test case 64 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_65(self):
        """
        Test case 65 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_66(self):
        """
        Test case 66 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_67(self):
        """
        Test case 67 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_68(self):
        """
        Test case 68 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_69(self):
        """
        Test case 69 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_70(self):
        """
        Test case 70 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_71(self):
        """
        Test case 71 of compare_one.
        """
        assert compare_one('1.0', '1.0') == '1.0'
		
    def test_compare_one_72(self):
        """
        Test case 72 of compare_one.
        """
        assert compare_one('1,0', '1,0') == '1,0'
		
    def test_compare_one_73(self):
        """
        Test case 73 of compare_one.
        """
        assert compare_one('1.0', '1,0') == '1.0'
		
    def test_compare_one_74(self):
        """
        Test case 74 of compare_one.
        """
        assert compare_one('1,0', '1.0') == '1.0'
		
    def test_compare_one_