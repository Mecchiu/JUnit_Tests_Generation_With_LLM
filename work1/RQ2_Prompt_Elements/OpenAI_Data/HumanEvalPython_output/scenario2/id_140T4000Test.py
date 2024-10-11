# id_140_Test.java
from scenario2.id_140 import fix_spaces

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`scenario2.id_140.fix_spaces`.
    """


    def test_fix_spaces_1(self):
        """
        Test case 1 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("") == ""

    def test_fix_spaces_2(self):
        """
        Test case 2 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces(" ") == "-"

    def test_fix_spaces_3(self):
        """
        Test case 3 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("  ") == "-"

    def test_fix_spaces_4(self):
        """
        Test case 4 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("   ") == "-"

    def test_fix_spaces_5(self):
        """
        Test case 5 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a") == "a"

    def test_fix_spaces_6(self):
        """
        Test case 6 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a ") == "a-"

    def test_fix_spaces_7(self):
        """
        Test case 7 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  ") == "a-"

    def test_fix_spaces_8(self):
        """
        Test case 8 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   ") == "a-"

    def test_fix_spaces_9(self):
        """
        Test case 9 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b") == "a_b"

    def test_fix_spaces_10(self):
        """
        Test case 10 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b") == "a-b"

    def test_fix_spaces_11(self):
        """
        Test case 11 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b") == "a-b"

    def test_fix_spaces_12(self):
        """
        Test case 12 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c") == "a_b_c"

    def test_fix_spaces_13(self):
        """
        Test case 13 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c") == "a-b-c"

    def test_fix_spaces_14(self):
        """
        Test case 14 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c") == "a-b-c"

    def test_fix_spaces_15(self):
        """
        Test case 15 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d") == "a_b_c_d"

    def test_fix_spaces_16(self):
        """
        Test case 16 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d") == "a-b-c-d"

    def test_fix_spaces_17(self):
        """
        Test case 17 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d") == "a-b-c-d"

    def test_fix_spaces_18(self):
        """
        Test case 18 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e") == "a_b_c_d_e"

    def test_fix_spaces_19(self):
        """
        Test case 19 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e") == "a-b-c-d-e"

    def test_fix_spaces_20(self):
        """
        Test case 20 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e") == "a-b-c-d-e"

    def test_fix_spaces_21(self):
        """
        Test case 21 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f") == "a_b_c_d_e_f"

    def test_fix_spaces_22(self):
        """
        Test case 22 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f") == "a-b-c-d-e-f"

    def test_fix_spaces_23(self):
        """
        Test case 23 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f") == "a-b-c-d-e-f"

    def test_fix_spaces_24(self):
        """
        Test case 24 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g") == "a_b_c_d_e_f_g"

    def test_fix_spaces_25(self):
        """
        Test case 25 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g") == "a-b-c-d-e-f-g"

    def test_fix_spaces_26(self):
        """
        Test case 26 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g") == "a-b-c-d-e-f-g"

    def test_fix_spaces_27(self):
        """
        Test case 27 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h") == "a_b_c_d_e_f_g_h"

    def test_fix_spaces_28(self):
        """
        Test case 28 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h") == "a-b-c-d-e-f-g-h"

    def test_fix_spaces_29(self):
        """
        Test case 29 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h") == "a-b-c-d-e-f-g-h"

    def test_fix_spaces_30(self):
        """
        Test case 30 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i") == "a_b_c_d_e_f_g_h_i"

    def test_fix_spaces_31(self):
        """
        Test case 31 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i") == "a-b-c-d-e-f-g-h-i"

    def test_fix_spaces_32(self):
        """
        Test case 32 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i") == "a-b-c-d-e-f-g-h-i"

    def test_fix_spaces_33(self):
        """
        Test case 33 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i j") == "a_b_c_d_e_f_g_h_i_j"

    def test_fix_spaces_34(self):
        """
        Test case 34 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i  j") == "a-b-c-d-e-f-g-h-i-j"

    def test_fix_spaces_35(self):
        """
        Test case 35 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i   j") == "a-b-c-d-e-f-g-h-i-j"

    def test_fix_spaces_36(self):
        """
        Test case 36 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i j k") == "a_b_c_d_e_f_g_h_i_j_k"

    def test_fix_spaces_37(self):
        """
        Test case 37 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i  j  k") == "a-b-c-d-e-f-g-h-i-j-k"

    def test_fix_spaces_38(self):
        """
        Test case 38 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i   j   k") == "a-b-c-d-e-f-g-h-i-j-k"

    def test_fix_spaces_39(self):
        """
        Test case 39 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i j k l") == "a_b_c_d_e_f_g_h_i_j_k_l"

    def test_fix_spaces_40(self):
        """
        Test case 40 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i  j  k  l") == "a-b-c-d-e-f-g-h-i-j-k-l"

    def test_fix_spaces_41(self):
        """
        Test case 41 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i   j   k   l") == "a-b-c-d-e-f-g-h-i-j-k-l"

    def test_fix_spaces_42(self):
        """
        Test case 42 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i j k l m") == "a_b_c_d_e_f_g_h_i_j_k_l_m"

    def test_fix_spaces_43(self):
        """
        Test case 43 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i  j  k  l  m") == "a-b-c-d-e-f-g-h-i-j-k-l-m"

    def test_fix_spaces_44(self):
        """
        Test case 44 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i   j   k   l   m") == "a-b-c-d-e-f-g-h-i-j-k-l-m"

    def test_fix_spaces_45(self):
        """
        Test case 45 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i j k l m n") == "a_b_c_d_e_f_g_h_i_j_k_l_m_n"

    def test_fix_spaces_46(self):
        """
        Test case 46 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i  j  k  l  m  n") == "a-b-c-d-e-f-g-h-i-j-k-l-m-n"

    def test_fix_spaces_47(self):
        """
        Test case 47 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i   j   k   l   m   n") == "a-b-c-d-e-f-g-h-i-j-k-l-m-n"

    def test_fix_spaces_48(self):
        """
        Test case 48 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a b c d e f g h i j k l m n o") == "a_b_c_d_e_f_g_h_i_j_k_l_m_n_o"

    def test_fix_spaces_49(self):
        """
        Test case 49 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a  b  c  d  e  f  g  h  i  j  k  l  m  n  o") == "a-b-c-d-e-f-g-h-i-j-k-l-m-n-o"

    def test_fix_spaces_50(self):
        """
        Test case 50 for :func:`scenario2.id_140.fix_spaces`.
        """
        assert fix_spaces("a   b   c   d   e   f   g   h   i   j   k   l   m   n   o") == "a-b-c-d-e-f-g-h-i-j-k-l-