# id_156_Test.java
from scenario2.id_156 import int_to_mini_roman

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario2.id_156.int_to_mini_roman`.
    """


    def test_int_to_mini_roman_1(self):
        """
        Test case 1 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1) == 'i'

    def test_int_to_mini_roman_2(self):
        """
        Test case 2 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(4) == 'iv'

    def test_int_to_mini_roman_3(self):
        """
        Test case 3 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(5) == 'v'

    def test_int_to_mini_roman_4(self):
        """
        Test case 4 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(9) == 'ix'

    def test_int_to_mini_roman_5(self):
        """
        Test case 5 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(10) == 'x'

    def test_int_to_mini_roman_6(self):
        """
        Test case 6 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(40) == 'xl'

    def test_int_to_mini_roman_7(self):
        """
        Test case 7 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(50) == 'l'

    def test_int_to_mini_roman_8(self):
        """
        Test case 8 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(90) == 'xc'

    def test_int_to_mini_roman_9(self):
        """
        Test case 9 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(100) == 'c'

    def test_int_to_mini_roman_10(self):
        """
        Test case 10 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(400) == 'cd'

    def test_int_to_mini_roman_11(self):
        """
        Test case 11 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(500) == 'd'

    def test_int_to_mini_roman_12(self):
        """
        Test case 12 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(900) == 'cm'

    def test_int_to_mini_roman_13(self):
        """
        Test case 13 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(1000) == 'm'

    def test_int_to_mini_roman_14(self):
        """
        Test case 14 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(3) == 'iii'

    def test_int_to_mini_roman_15(self):
        """
        Test case 15 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(6) == 'vi'

    def test_int_to_mini_roman_16(self):
        """
        Test case 16 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(7) == 'vii'

    def test_int_to_mini_roman_17(self):
        """
        Test case 17 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(8) == 'viii'

    def test_int_to_mini_roman_18(self):
        """
        Test case 18 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(11) == 'xi'

    def test_int_to_mini_roman_19(self):
        """
        Test case 19 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(12) == 'xii'

    def test_int_to_mini_roman_20(self):
        """
        Test case 20 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(13) == 'xiii'

    def test_int_to_mini_roman_21(self):
        """
        Test case 21 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(14) == 'xiv'

    def test_int_to_mini_roman_22(self):
        """
        Test case 22 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(15) == 'xv'

    def test_int_to_mini_roman_23(self):
        """
        Test case 23 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(16) == 'xvi'

    def test_int_to_mini_roman_24(self):
        """
        Test case 24 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(17) == 'xvii'

    def test_int_to_mini_roman_25(self):
        """
        Test case 25 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(18) == 'xviii'

    def test_int_to_mini_roman_26(self):
        """
        Test case 26 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(19) == 'xix'

    def test_int_to_mini_roman_27(self):
        """
        Test case 27 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(20) == 'xx'

    def test_int_to_mini_roman_28(self):
        """
        Test case 28 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(21) == 'xxi'

    def test_int_to_mini_roman_29(self):
        """
        Test case 29 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(22) == 'xxii'

    def test_int_to_mini_roman_30(self):
        """
        Test case 30 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(23) == 'xxiii'

    def test_int_to_mini_roman_31(self):
        """
        Test case 31 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(24) == 'xxiv'

    def test_int_to_mini_roman_32(self):
        """
        Test case 32 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(25) == 'xxv'

    def test_int_to_mini_roman_33(self):
        """
        Test case 33 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(26) == 'xxvi'

    def test_int_to_mini_roman_34(self):
        """
        Test case 34 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(27) == 'xxvii'

    def test_int_to_mini_roman_35(self):
        """
        Test case 35 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(28) == 'xxviii'

    def test_int_to_mini_roman_36(self):
        """
        Test case 36 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(29) == 'xxix'

    def test_int_to_mini_roman_37(self):
        """
        Test case 37 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(30) == 'xxx'

    def test_int_to_mini_roman_38(self):
        """
        Test case 38 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(31) == 'xxxi'

    def test_int_to_mini_roman_39(self):
        """
        Test case 39 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(32) == 'xxxii'

    def test_int_to_mini_roman_40(self):
        """
        Test case 40 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(33) == 'xxxiii'

    def test_int_to_mini_roman_41(self):
        """
        Test case 41 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(34) == 'xxxiv'

    def test_int_to_mini_roman_42(self):
        """
        Test case 42 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(35) == 'xxxv'

    def test_int_to_mini_roman_43(self):
        """
        Test case 43 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(36) == 'xxxvi'

    def test_int_to_mini_roman_44(self):
        """
        Test case 44 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(37) == 'xxxvii'

    def test_int_to_mini_roman_45(self):
        """
        Test case 45 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(38) == 'xxxviii'

    def test_int_to_mini_roman_46(self):
        """
        Test case 46 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(39) == 'xxxix'

    def test_int_to_mini_roman_47(self):
        """
        Test case 47 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(41) == 'xli'

    def test_int_to_mini_roman_48(self):
        """
        Test case 48 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(42) == 'xlii'

    def test_int_to_mini_roman_49(self):
        """
        Test case 49 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(43) == 'xliii'

    def test_int_to_mini_roman_50(self):
        """
        Test case 50 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(44) == 'xliv'

    def test_int_to_mini_roman_51(self):
        """
        Test case 51 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(45) == 'xlv'

    def test_int_to_mini_roman_52(self):
        """
        Test case 52 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(46) == 'xlvi'

    def test_int_to_mini_roman_53(self):
        """
        Test case 53 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(47) == 'xlvii'

    def test_int_to_mini_roman_54(self):
        """
        Test case 54 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(48) == 'xlviii'

    def test_int_to_mini_roman_55(self):
        """
        Test case 55 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(49) == 'xlix'

    def test_int_to_mini_roman_56(self):
        """
        Test case 56 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(51) == 'li'

    def test_int_to_mini_roman_57(self):
        """
        Test case 57 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(52) == 'lii'

    def test_int_to_mini_roman_58(self):
        """
        Test case 58 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(53) == 'liii'

    def test_int_to_mini_roman_59(self):
        """
        Test case 59 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_to_mini_roman(54) == 'liv'

    def test_int_to_mini_roman_60(self):
        """
        Test case 60 for :func:`scenario2.id_156.int_to_mini_roman`.
        """
        assert int_