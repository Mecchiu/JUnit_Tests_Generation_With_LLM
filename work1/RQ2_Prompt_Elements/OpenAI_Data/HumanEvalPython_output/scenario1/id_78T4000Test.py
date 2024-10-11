# id_78_Test.java
from scenario1.id_78 import hex_key

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`scenario1.id_78.hex_key`.
    """


    def test_hex_key_1(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2') == 1
		
    def test_hex_key_2(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3') == 1
		
    def test_hex_key_3(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('5') == 1
		
    def test_hex_key_4(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7') == 1
		
    def test_hex_key_5(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('B') == 1
		
    def test_hex_key_6(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('D') == 1
		
    def test_hex_key_7(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B') == 2
		
    def test_hex_key_8(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D') == 2
		
    def test_hex_key_9(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D') == 2
		
    def test_hex_key_10(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B') == 2
		
    def test_hex_key_11(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D') == 2
		
    def test_hex_key_12(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD') == 2
		
    def test_hex_key_13(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD') == 3
		
    def test_hex_key_14(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7') == 3
		
    def test_hex_key_15(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B5') == 3
		
    def test_hex_key_16(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B3') == 3
		
    def test_hex_key_17(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B2') == 3
		
    def test_hex_key_18(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D7') == 3
		
    def test_hex_key_19(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D5') == 3
		
    def test_hex_key_20(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D3') == 3
		
    def test_hex_key_21(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D2') == 3
		
    def test_hex_key_22(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D7') == 3
		
    def test_hex_key_23(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D5') == 3
		
    def test_hex_key_24(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D3') == 3
		
    def test_hex_key_25(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D2') == 3
		
    def test_hex_key_26(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B5') == 3
		
    def test_hex_key_27(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B3') == 3
		
    def test_hex_key_28(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B2') == 3
		
    def test_hex_key_29(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D5') == 3
		
    def test_hex_key_30(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D3') == 3
		
    def test_hex_key_31(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D2') == 3
		
    def test_hex_key_32(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD5') == 3
		
    def test_hex_key_33(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD3') == 3
		
    def test_hex_key_34(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD2') == 3
		
    def test_hex_key_35(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD7') == 4
		
    def test_hex_key_36(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD5') == 4
		
    def test_hex_key_37(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD3') == 4
		
    def test_hex_key_38(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD2') == 4
		
    def test_hex_key_39(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7D') == 4
		
    def test_hex_key_40(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7B') == 4
		
    def test_hex_key_41(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B75') == 4
		
    def test_hex_key_42(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B73') == 4
		
    def test_hex_key_43(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B72') == 4
		
    def test_hex_key_44(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D7B') == 4
		
    def test_hex_key_45(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D75') == 4
		
    def test_hex_key_46(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D73') == 4
		
    def test_hex_key_47(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2D72') == 4
		
    def test_hex_key_48(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D7B') == 4
		
    def test_hex_key_49(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D75') == 4
		
    def test_hex_key_50(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D73') == 4
		
    def test_hex_key_51(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D72') == 4
		
    def test_hex_key_52(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B75') == 4
		
    def test_hex_key_53(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B73') == 4
		
    def test_hex_key_54(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B72') == 4
		
    def test_hex_key_55(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D75') == 4
		
    def test_hex_key_56(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D73') == 4
		
    def test_hex_key_57(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7D72') == 4
		
    def test_hex_key_58(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD75') == 4
		
    def test_hex_key_59(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD73') == 4
		
    def test_hex_key_60(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('BD72') == 4
		
    def test_hex_key_61(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD75') == 5
		
    def test_hex_key_62(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD73') == 5
		
    def test_hex_key_63(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2BD72') == 5
		
    def test_hex_key_64(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7D5') == 5
		
    def test_hex_key_65(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7D3') == 5
		
    def test_hex_key_66(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7D2') == 5
		
    def test_hex_key_67(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7B5') == 5
		
    def test_hex_key_68(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7B3') == 5
		
    def test_hex_key_69(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B7B2') == 5
		
    def test_hex_key_70(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B753') == 5
		
    def test_hex_key_71(self):
        """
        Test case