# id_25_Test.java
from scenario2.id_25 import factorize

import pytest

class id_25_Test:
    """
    Test class of id_25.py.
    It contains ten unit test cases for the :func:`scenario2.id_25.factorize`.
    """


    def test_factorize_1(self):
        """
        Test case for factorize function.
        """
        assert factorize(1) == []

    def test_factorize_2(self):
        """
        Test case for factorize function.
        """
        assert factorize(2) == [2]

    def test_factorize_3(self):
        """
        Test case for factorize function.
        """
        assert factorize(3) == [3]

    def test_factorize_4(self):
        """
        Test case for factorize function.
        """
        assert factorize(4) == [2, 2]

    def test_factorize_5(self):
        """
        Test case for factorize function.
        """
        assert factorize(5) == [5]

    def test_factorize_6(self):
        """
        Test case for factorize function.
        """
        assert factorize(6) == [2, 3]

    def test_factorize_7(self):
        """
        Test case for factorize function.
        """
        assert factorize(7) == [7]

    def test_factorize_8(self):
        """
        Test case for factorize function.
        """
        assert factorize(8) == [2, 2, 2]

    def test_factorize_9(self):
        """
        Test case for factorize function.
        """
        assert factorize(9) == [3, 3]

    def test_factorize_10(self):
        """
        Test case for factorize function.
        """
        assert factorize(10) == [2, 5]

    def test_factorize_11(self):
        """
        Test case for factorize function.
        """
        assert factorize(11) == [11]

    def test_factorize_12(self):
        """
        Test case for factorize function.
        """
        assert factorize(12) == [2, 2, 3]

    def test_factorize_13(self):
        """
        Test case for factorize function.
        """
        assert factorize(13) == [13]

    def test_factorize_14(self):
        """
        Test case for factorize function.
        """
        assert factorize(14) == [2, 7]

    def test_factorize_15(self):
        """
        Test case for factorize function.
        """
        assert factorize(15) == [3, 5]

    def test_factorize_16(self):
        """
        Test case for factorize function.
        """
        assert factorize(16) == [2, 2, 2, 2]

    def test_factorize_17(self):
        """
        Test case for factorize function.
        """
        assert factorize(17) == [17]

    def test_factorize_18(self):
        """
        Test case for factorize function.
        """
        assert factorize(18) == [2, 3, 3]

    def test_factorize_19(self):
        """
        Test case for factorize function.
        """
        assert factorize(19) == [19]

    def test_factorize_20(self):
        """
        Test case for factorize function.
        """
        assert factorize(20) == [2, 2, 5]

    def test_factorize_21(self):
        """
        Test case for factorize function.
        """
        assert factorize(21) == [3, 7]

    def test_factorize_22(self):
        """
        Test case for factorize function.
        """
        assert factorize(22) == [2, 11]

    def test_factorize_23(self):
        """
        Test case for factorize function.
        """
        assert factorize(23) == [23]

    def test_factorize_24(self):
        """
        Test case for factorize function.
        """
        assert factorize(24) == [2, 2, 2, 3]

    def test_factorize_25(self):
        """
        Test case for factorize function.
        """
        assert factorize(25) == [5, 5]

    def test_factorize_26(self):
        """
        Test case for factorize function.
        """
        assert factorize(26) == [2, 13]

    def test_factorize_27(self):
        """
        Test case for factorize function.
        """
        assert factorize(27) == [3, 3, 3]

    def test_factorize_28(self):
        """
        Test case for factorize function.
        """
        assert factorize(28) == [2, 2, 7]

    def test_factorize_29(self):
        """
        Test case for factorize function.
        """
        assert factorize(29) == [29]

    def test_factorize_30(self):
        """
        Test case for factorize function.
        """
        assert factorize(30) == [2, 3, 5]

    def test_factorize_31(self):
        """
        Test case for factorize function.
        """
        assert factorize(31) == [31]

    def test_factorize_32(self):
        """
        Test case for factorize function.
        """
        assert factorize(32) == [2, 2, 2, 2, 2]

    def test_factorize_33(self):
        """
        Test case for factorize function.
        """
        assert factorize(33) == [3, 11]

    def test_factorize_34(self):
        """
        Test case for factorize function.
        """
        assert factorize(34) == [2, 17]

    def test_factorize_35(self):
        """
        Test case for factorize function.
        """
        assert factorize(35) == [5, 7]

    def test_factorize_36(self):
        """
        Test case for factorize function.
        """
        assert factorize(36) == [2, 2, 3, 3]

    def test_factorize_37(self):
        """
        Test case for factorize function.
        """
        assert factorize(37) == [37]

    def test_factorize_38(self):
        """
        Test case for factorize function.
        """
        assert factorize(38) == [2, 19]

    def test_factorize_39(self):
        """
        Test case for factorize function.
        """
        assert factorize(39) == [3, 13]

    def test_factorize_40(self):
        """
        Test case for factorize function.
        """
        assert factorize(40) == [2, 2, 2, 5]

    def test_factorize_41(self):
        """
        Test case for factorize function.
        """
        assert factorize(41) == [41]

    def test_factorize_42(self):
        """
        Test case for factorize function.
        """
        assert factorize(42) == [2, 3, 7]

    def test_factorize_43(self):
        """
        Test case for factorize function.
        """
        assert factorize(43) == [43]

    def test_factorize_44(self):
        """
        Test case for factorize function.
        """
        assert factorize(44) == [2, 2, 11]

    def test_factorize_45(self):
        """
        Test case for factorize function.
        """
        assert factorize(45) == [3, 3, 5]

    def test_factorize_46(self):
        """
        Test case for factorize function.
        """
        assert factorize(46) == [2, 23]

    def test_factorize_47(self):
        """
        Test case for factorize function.
        """
        assert factorize(47) == [47]

    def test_factorize_48(self):
        """
        Test case for factorize function.
        """
        assert factorize(48) == [2, 2, 2, 2, 3]

    def test_factorize_49(self):
        """
        Test case for factorize function.
        """
        assert factorize(49) == [7, 7]

    def test_factorize_50(self):
        """
        Test case for factorize function.
        """
        assert factorize(50) == [2, 5, 5]

    def test_factorize_51(self):
        """
        Test case for factorize function.
        """
        assert factorize(51) == [3, 17]

    def test_factorize_52(self):
        """
        Test case for factorize function.
        """
        assert factorize(52) == [2, 2, 13]

    def test_factorize_53(self):
        """
        Test case for factorize function.
        """
        assert factorize(53) == [53]

    def test_factorize_54(self):
        """
        Test case for factorize function.
        """
        assert factorize(54) == [2, 3, 3, 3]

    def test_factorize_55(self):
        """
        Test case for factorize function.
        """
        assert factorize(55) == [5, 11]

    def test_factorize_56(self):
        """
        Test case for factorize function.
        """
        assert factorize(56) == [2, 2, 2, 7]

    def test_factorize_57(self):
        """
        Test case for factorize function.
        """
        assert factorize(57) == [3, 19]

    def test_factorize_58(self):
        """
        Test case for factorize function.
        """
        assert factorize(58) == [2, 29]

    def test_factorize_59(self):
        """
        Test case for factorize function.
        """
        assert factorize(59) == [59]

    def test_factorize_60(self):
        """
        Test case for factorize function.
        """
        assert factorize(60) == [2, 2, 3, 5]

    def test_factorize_61(self):
        """
        Test case for factorize function.
        """
        assert factorize(61) == [61]

    def test_factorize_62(self):
        """
        Test case for factorize function.
        """
        assert factorize(62) == [2, 31]

    def test_factorize_63(self):
        """
        Test case for factorize function.
        """
        assert factorize(63) == [3, 3, 7]

    def test_factorize_64(self):
        """
        Test case for factorize function.
        """
        assert factorize(64) == [2, 2, 2, 2, 2, 2]

    def test_factorize_65(self):
        """
        Test case for factorize function.
        """
        assert factorize(65) == [5, 13]

    def test_factorize_66(self):
        """
        Test case for factorize function.
        """
        assert factorize(66) == [2, 3, 11]

    def test_factorize_67(self):
        """
        Test case for factorize function.
        """
        assert factorize(67) == [67]

    def test_factorize_68(self):
        """
        Test case for factorize function.
        """
        assert factorize(68) == [2, 2, 17]

    def test_factorize_69(self):
        """
        Test case for factorize function.
        """
        assert factorize(69) == [3, 23]

    def test_factorize_70(self):
        """
        Test case for factorize function.
        """
        assert factorize(70) == [2, 5, 7]

    def test_factorize_71(self):
        """
        Test case for factorize function.
        """
        assert factorize(71) == [71]

    def test_factorize_72(self):
        """
        Test case for factorize function.
        """
        assert factorize(72) == [2, 2, 2, 3, 3]

    def test_factorize_73(self):
        """
        Test case for factorize function.
        """
        assert factorize(73) == [73]

    def test_factorize_74(self):
        """
        Test case for factorize function.
        """
        assert factorize(74) == [2, 37]

    def test_factorize_75(self):
        """
        Test case for factorize function.
        """
        assert factorize(75) == [3, 5, 5]

    def test_factorize_76(self):
        """
        Test case for factorize function.
        """
        assert factorize(76) == [2, 2, 19]

    def test_factorize_77(self):
        """
        Test case for factorize function.
        """
        assert factorize(77) == [7, 11]

    def test_factorize_78(self):
        """
        Test case for factorize function.
        """
        assert factorize(78) == [2, 3, 13]

    def test_factorize_79(self):
        """
        Test case for factorize function.
        """
        assert factorize(79) == [79]

    def test_factorize_80(self):
        """
        Test case for factorize function.
        """
        assert factorize(80) == [2, 2, 2, 2, 5]

    def test_factorize_81(self):
        """
        Test case for factorize function.
        """
        assert factorize(81) == [3, 3, 3, 3]

    def test_factorize_82(self):
        """
        Test case for factorize function.
        """
        assert factorize(82) == [2, 41]

    def test_factorize_83(self):
        """
        Test case for factorize function.
        """
        assert factorize(83) == [83]

    def test_factorize_84(self):
        """
        Test case for factorize function.
        """
        assert factorize(84) == [2, 2, 3, 7]

    def test_factorize_85(self):
        """
        Test case for factorize function.
        """
        assert factorize(85) == [5, 17]

    def test_factorize_86(self):
        """
        Test case for factorize function.
        """
        assert factorize(86) == [2, 43]

    def test_factorize_87(self):
        """
        Test case for factorize function.
        """
        assert factorize(87) == [3, 29]

    def test_factorize_88(self):
        """
        Test case for factorize function.
        """
        assert factorize(88) == [2, 2, 2, 11]

    def test_factorize_89(self):
        """
        Test case for factorize function.
        """
        assert factorize(89) == [89]

    def test_factorize_90(self):
        """
        Test case for factorize function.
        """
        assert factorize(90) == [2, 3, 3, 5]

    def test_factorize_91(self):
        """
        Test case for factorize function.
        """
        assert factorize(91) == [7, 13]

    def test_factorize_92(self):
        """
        Test case for factorize function.
        """
        assert factorize(92) == [2, 2, 23]

    def test_factorize_93(self):
        """
        Test case for factorize function.
        """
        assert factorize(93) == [3, 31]

    def test_factorize_94(self):
        """
        Test case for factorize function.
        """
        assert factorize(94) == [2, 47]

    def test_factorize_95(self):
        """
        Test case for factorize function.
        """
        assert factorize(95) == [5, 19]

    def test_factorize_96(self):
        """
        Test case for factorize function.
        """
        assert factorize(96) == [2, 2,