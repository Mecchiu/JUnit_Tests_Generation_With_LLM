# id_112_Test.java
from scenario2.id_112 import reverse_delete

import pytest

class id_112_Test:
    """
    Test class of id_112.py.
    It contains ten unit test cases for the :func:`scenario2.id_112.reverse_delete`.
    """


    def test_reverse_delete_1(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","a") == ("bcbc",True)
		
    def test_reverse_delete_2(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","b") == ("acaca",True)
		
    def test_reverse_delete_3(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","c") == ("ababa",True)
		
    def test_reverse_delete_4(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","d") == ("abacaba",False)
		
    def test_reverse_delete_5(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","") == ("abacaba",False)
		
    def test_reverse_delete_6(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("","a") == ("",True)
		
    def test_reverse_delete_7(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("","") == ("",True)
		
    def test_reverse_delete_8(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","ab") == ("c",True)
		
    def test_reverse_delete_9(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","ba") == ("c",True)
		
    def test_reverse_delete_10(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_11(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_12(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_13(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_14(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_15(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_16(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_17(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_18(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_19(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_20(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_21(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_22(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_23(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_24(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_25(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_26(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_27(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_28(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_29(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_30(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_31(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_32(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_33(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_34(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_35(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_36(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_37(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_38(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_39(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_40(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_41(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_42(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_43(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_44(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_45(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_46(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_47(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_48(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_49(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_50(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_51(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_52(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_53(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_54(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_55(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_56(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_57(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_58(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
    def test_reverse_delete_59(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","acb") == ("a",True)
		
    def test_reverse_delete_60(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","abc") == ("",True)
		
    def test_reverse_delete_61(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cba") == ("a",True)
		
    def test_reverse_delete_62(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","cab") == ("a",True)
		
    def test_reverse_delete_63(self):
        """
        Test case for the :func:`scenario2.id_112.reverse_delete`.
        """
        assert reverse_delete("abacaba","bac") == ("a",True)
		
   