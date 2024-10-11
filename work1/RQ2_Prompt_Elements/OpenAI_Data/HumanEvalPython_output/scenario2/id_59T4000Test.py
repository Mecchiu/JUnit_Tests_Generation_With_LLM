# id_59_Test.java
from scenario2.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario2.id_59.largest_prime_factor`.
    """


    def test_largest_prime_factor_1(self):
        """
        Test case 1 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(10) == 5
		
    def test_largest_prime_factor_2(self):
        """
        Test case 2 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29
		
    def test_largest_prime_factor_3(self):
        """
        Test case 3 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(600851475143) == 6857
		
    def test_largest_prime_factor_4(self):
        """
        Test case 4 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(1) == 1
		
    def test_largest_prime_factor_5(self):
        """
        Test case 5 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2
		
    def test_largest_prime_factor_6(self):
        """
        Test case 6 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3
		
    def test_largest_prime_factor_7(self):
        """
        Test case 7 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(4) == 2
		
    def test_largest_prime_factor_8(self):
        """
        Test case 8 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5
		
    def test_largest_prime_factor_9(self):
        """
        Test case 9 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(6) == 3
		
    def test_largest_prime_factor_10(self):
        """
        Test case 10 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7
		
    def test_largest_prime_factor_11(self):
        """
        Test case 11 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(8) == 2
		
    def test_largest_prime_factor_12(self):
        """
        Test case 12 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(9) == 3
		
    def test_largest_prime_factor_13(self):
        """
        Test case 13 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(11) == 11
		
    def test_largest_prime_factor_14(self):
        """
        Test case 14 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(12) == 3
		
    def test_largest_prime_factor_15(self):
        """
        Test case 15 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(14) == 7
		
    def test_largest_prime_factor_16(self):
        """
        Test case 16 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(15) == 5
		
    def test_largest_prime_factor_17(self):
        """
        Test case 17 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(16) == 2
		
    def test_largest_prime_factor_18(self):
        """
        Test case 18 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(17) == 17
		
    def test_largest_prime_factor_19(self):
        """
        Test case 19 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(18) == 3
		
    def test_largest_prime_factor_20(self):
        """
        Test case 20 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(19) == 19
		
    def test_largest_prime_factor_21(self):
        """
        Test case 21 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(20) == 5
		
    def test_largest_prime_factor_22(self):
        """
        Test case 22 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(21) == 7
		
    def test_largest_prime_factor_23(self):
        """
        Test case 23 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(22) == 11
		
    def test_largest_prime_factor_24(self):
        """
        Test case 24 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(23) == 23
		
    def test_largest_prime_factor_25(self):
        """
        Test case 25 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(24) == 3
		
    def test_largest_prime_factor_26(self):
        """
        Test case 26 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(25) == 5
		
    def test_largest_prime_factor_27(self):
        """
        Test case 27 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(26) == 13
		
    def test_largest_prime_factor_28(self):
        """
        Test case 28 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(27) == 3
		
    def test_largest_prime_factor_29(self):
        """
        Test case 29 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(28) == 7
		
    def test_largest_prime_factor_30(self):
        """
        Test case 30 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(29) == 29
		
    def test_largest_prime_factor_31(self):
        """
        Test case 31 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(30) == 5
		
    def test_largest_prime_factor_32(self):
        """
        Test case 32 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(31) == 31
		
    def test_largest_prime_factor_33(self):
        """
        Test case 33 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(32) == 2
		
    def test_largest_prime_factor_34(self):
        """
        Test case 34 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(33) == 11
		
    def test_largest_prime_factor_35(self):
        """
        Test case 35 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(34) == 17
		
    def test_largest_prime_factor_36(self):
        """
        Test case 36 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(35) == 5
		
    def test_largest_prime_factor_37(self):
        """
        Test case 37 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(36) == 3
		
    def test_largest_prime_factor_38(self):
        """
        Test case 38 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(37) == 37
		
    def test_largest_prime_factor_39(self):
        """
        Test case 39 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(38) == 19
		
    def test_largest_prime_factor_40(self):
        """
        Test case 40 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(39) == 13
		
    def test_largest_prime_factor_41(self):
        """
        Test case 41 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(40) == 5
		
    def test_largest_prime_factor_42(self):
        """
        Test case 42 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(41) == 41
		
    def test_largest_prime_factor_43(self):
        """
        Test case 43 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(42) == 3
		
    def test_largest_prime_factor_44(self):
        """
        Test case 44 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(43) == 43
		
    def test_largest_prime_factor_45(self):
        """
        Test case 45 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(44) == 11
		
    def test_largest_prime_factor_46(self):
        """
        Test case 46 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(45) == 5
		
    def test_largest_prime_factor_47(self):
        """
        Test case 47 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(46) == 23
		
    def test_largest_prime_factor_48(self):
        """
        Test case 48 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(47) == 47
		
    def test_largest_prime_factor_49(self):
        """
        Test case 49 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(48) == 3
		
    def test_largest_prime_factor_50(self):
        """
        Test case 50 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(49) == 7
		
    def test_largest_prime_factor_51(self):
        """
        Test case 51 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(50) == 5
		
    def test_largest_prime_factor_52(self):
        """
        Test case 52 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(51) == 17
		
    def test_largest_prime_factor_53(self):
        """
        Test case 53 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(52) == 13
		
    def test_largest_prime_factor_54(self):
        """
        Test case 54 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(53) == 53
		
    def test_largest_prime_factor_55(self):
        """
        Test case 55 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(54) == 3
		
    def test_largest_prime_factor_56(self):
        """
        Test case 56 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(55) == 5
		
    def test_largest_prime_factor_57(self):
        """
        Test case 57 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(56) == 7
		
    def test_largest_prime_factor_58(self):
        """
        Test case 58 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(57) == 19
		
    def test_largest_prime_factor_59(self):
        """
        Test case 59 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(58) == 29
		
    def test_largest_prime_factor_60(self):
        """
        Test case 60 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(59) == 59
		
    def test_largest_prime_factor_61(self):
        """
        Test case 61 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(60) == 5
		
    def test_largest_prime_factor_62(self):
        """
        Test case 62 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(61) == 61
		
    def test_largest_prime_factor_63(self):
        """
        Test case 63 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(62) == 31
		
    def test_largest_prime_factor_64(self):
        """
        Test case 64 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(63) == 3
		
    def test_largest_prime_factor_65(self):
        """
        Test case 65 for :func:`scenario2.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(64) == 2
		
    def test_largest_prime_factor_66(self):
        """
        Test case 66 for :func:`sc