# id_163_Test.java
from scenario2.id_163 import generate_integers

import pytest

class id_163_Test:
    """
    Test class of id_163.py.
    It contains ten unit test cases for the :func:`scenario2.id_163.generate_integers`.
    """


    def test_generate_integers_1(self):
        """
        Test case 1 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(2, 8) == [2, 4, 6, 8]

    def test_generate_integers_2(self):
        """
        Test case 2 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(8, 2) == [2, 4, 6, 8]

    def test_generate_integers_3(self):
        """
        Test case 3 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 1) == []

    def test_generate_integers_4(self):
        """
        Test case 4 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 2) == [2]

    def test_generate_integers_5(self):
        """
        Test case 5 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(2, 1) == [2]

    def test_generate_integers_6(self):
        """
        Test case 6 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 3) == [2]

    def test_generate_integers_7(self):
        """
        Test case 7 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(3, 1) == [2]

    def test_generate_integers_8(self):
        """
        Test case 8 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 4) == [2, 4]

    def test_generate_integers_9(self):
        """
        Test case 9 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(4, 1) == [2, 4]

    def test_generate_integers_10(self):
        """
        Test case 10 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 5) == [2, 4]

    def test_generate_integers_11(self):
        """
        Test case 11 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(5, 1) == [2, 4]

    def test_generate_integers_12(self):
        """
        Test case 12 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 6) == [2, 4, 6]

    def test_generate_integers_13(self):
        """
        Test case 13 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(6, 1) == [2, 4, 6]

    def test_generate_integers_14(self):
        """
        Test case 14 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 7) == [2, 4, 6]

    def test_generate_integers_15(self):
        """
        Test case 15 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(7, 1) == [2, 4, 6]

    def test_generate_integers_16(self):
        """
        Test case 16 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 8) == [2, 4, 6, 8]

    def test_generate_integers_17(self):
        """
        Test case 17 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(8, 1) == [2, 4, 6, 8]

    def test_generate_integers_18(self):
        """
        Test case 18 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 9) == [2, 4, 6, 8]

    def test_generate_integers_19(self):
        """
        Test case 19 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(9, 1) == [2, 4, 6, 8]

    def test_generate_integers_20(self):
        """
        Test case 20 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 10) == [2, 4, 6, 8]

    def test_generate_integers_21(self):
        """
        Test case 21 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(10, 1) == [2, 4, 6, 8]

    def test_generate_integers_22(self):
        """
        Test case 22 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 11) == [2, 4, 6, 8]

    def test_generate_integers_23(self):
        """
        Test case 23 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(11, 1) == [2, 4, 6, 8]

    def test_generate_integers_24(self):
        """
        Test case 24 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 12) == [2, 4, 6, 8]

    def test_generate_integers_25(self):
        """
        Test case 25 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(12, 1) == [2, 4, 6, 8]

    def test_generate_integers_26(self):
        """
        Test case 26 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 13) == [2, 4, 6, 8]

    def test_generate_integers_27(self):
        """
        Test case 27 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(13, 1) == [2, 4, 6, 8]

    def test_generate_integers_28(self):
        """
        Test case 28 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 14) == [2, 4, 6, 8]

    def test_generate_integers_29(self):
        """
        Test case 29 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(14, 1) == [2, 4, 6, 8]

    def test_generate_integers_30(self):
        """
        Test case 30 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 15) == [2, 4, 6, 8]

    def test_generate_integers_31(self):
        """
        Test case 31 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(15, 1) == [2, 4, 6, 8]

    def test_generate_integers_32(self):
        """
        Test case 32 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 16) == [2, 4, 6, 8]

    def test_generate_integers_33(self):
        """
        Test case 33 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(16, 1) == [2, 4, 6, 8]

    def test_generate_integers_34(self):
        """
        Test case 34 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 17) == [2, 4, 6, 8]

    def test_generate_integers_35(self):
        """
        Test case 35 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(17, 1) == [2, 4, 6, 8]

    def test_generate_integers_36(self):
        """
        Test case 36 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 18) == [2, 4, 6, 8]

    def test_generate_integers_37(self):
        """
        Test case 37 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(18, 1) == [2, 4, 6, 8]

    def test_generate_integers_38(self):
        """
        Test case 38 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 19) == [2, 4, 6, 8]

    def test_generate_integers_39(self):
        """
        Test case 39 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(19, 1) == [2, 4, 6, 8]

    def test_generate_integers_40(self):
        """
        Test case 40 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 20) == [2, 4, 6, 8]

    def test_generate_integers_41(self):
        """
        Test case 41 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(20, 1) == [2, 4, 6, 8]

    def test_generate_integers_42(self):
        """
        Test case 42 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 21) == [2, 4, 6, 8]

    def test_generate_integers_43(self):
        """
        Test case 43 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(21, 1) == [2, 4, 6, 8]

    def test_generate_integers_44(self):
        """
        Test case 44 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 22) == [2, 4, 6, 8]

    def test_generate_integers_45(self):
        """
        Test case 45 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(22, 1) == [2, 4, 6, 8]

    def test_generate_integers_46(self):
        """
        Test case 46 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 23) == [2, 4, 6, 8]

    def test_generate_integers_47(self):
        """
        Test case 47 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(23, 1) == [2, 4, 6, 8]

    def test_generate_integers_48(self):
        """
        Test case 48 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 24) == [2, 4, 6, 8]

    def test_generate_integers_49(self):
        """
        Test case 49 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(24, 1) == [2, 4, 6, 8]

    def test_generate_integers_50(self):
        """
        Test case 50 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 25) == [2, 4, 6, 8]

    def test_generate_integers_51(self):
        """
        Test case 51 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(25, 1) == [2, 4, 6, 8]

    def test_generate_integers_52(self):
        """
        Test case 52 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 26) == [2, 4, 6, 8]

    def test_generate_integers_53(self):
        """
        Test case 53 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(26, 1) == [2, 4, 6, 8]

    def test_generate_integers_54(self):
        """
        Test case 54 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 27) == [2, 4, 6, 8]

    def test_generate_integers_55(self):
        """
        Test case 55 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(27, 1) == [2, 4, 6, 8]

    def test_generate_integers_56(self):
        """
        Test case 56 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 28) == [2, 4, 6, 8]

    def test_generate_integers_57(self):
        """
        Test case 57 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(28, 1) == [2, 4, 6, 8]

    def test_generate_integers_58(self):
        """
        Test case 58 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 29) == [2, 4, 6, 8]

    def test_generate_integers_59(self):
        """
        Test case 59 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(29, 1) == [2, 4, 6, 8]

    def test_generate_integers_60(self):
        """
        Test case 60 for :func:`scenario2.id_163.generate_integers`.
        """
        assert generate_integers(1, 30) == [2, 4, 6, 8]

    def test_generate_integers_61(self):
        """
        Test case 61 for :func:`scenario2.id_163.