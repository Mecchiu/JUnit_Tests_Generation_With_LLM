# id_140_Test.java
from scenario1.id_140 import fix_spaces

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`scenario1.id_140.fix_spaces`.
    """


    def test_fix_spaces_1(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("") == ""
		
    def test_fix_spaces_2(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces(" ") == "_"
		
    def test_fix_spaces_3(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("  ") == "__"
		
    def test_fix_spaces_4(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("   ") == "-"
		
    def test_fix_spaces_5(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("    ") == "--"
		
    def test_fix_spaces_6(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("     ") == "---"
		
    def test_fix_spaces_7(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("      ") == "----"
		
    def test_fix_spaces_8(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("       ") == "-----"
		
    def test_fix_spaces_9(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("        ") == "------"
		
    def test_fix_spaces_10(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("         ") == "-------"
		
    def test_fix_spaces_11(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("          ") == "--------"
		
    def test_fix_spaces_12(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("           ") == "---------"
		
    def test_fix_spaces_13(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("            ") == "----------"
		
    def test_fix_spaces_14(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("             ") == "-----------"
		
    def test_fix_spaces_15(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("              ") == "------------"
		
    def test_fix_spaces_16(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("               ") == "-------------"
		
    def test_fix_spaces_17(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                ") == "--------------"
		
    def test_fix_spaces_18(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                 ") == "---------------"
		
    def test_fix_spaces_19(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                  ") == "----------------"
		
    def test_fix_spaces_20(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                   ") == "-----------------"
		
    def test_fix_spaces_21(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                    ") == "------------------"
		
    def test_fix_spaces_22(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                     ") == "-------------------"
		
    def test_fix_spaces_23(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                      ") == "--------------------"
		
    def test_fix_spaces_24(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                       ") == "---------------------"
		
    def test_fix_spaces_25(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                        ") == "----------------------"
		
    def test_fix_spaces_26(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                         ") == "-----------------------"
		
    def test_fix_spaces_27(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                          ") == "------------------------"
		
    def test_fix_spaces_28(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                           ") == "-------------------------"
		
    def test_fix_spaces_29(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                            ") == "--------------------------"
		
    def test_fix_spaces_30(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                             ") == "---------------------------"
		
    def test_fix_spaces_31(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                              ") == "----------------------------"
		
    def test_fix_spaces_32(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                               ") == "-----------------------------"
		
    def test_fix_spaces_33(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                ") == "------------------------------"
		
    def test_fix_spaces_34(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                 ") == "-------------------------------"
		
    def test_fix_spaces_35(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                  ") == "--------------------------------"
		
    def test_fix_spaces_36(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                   ") == "---------------------------------"
		
    def test_fix_spaces_37(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                    ") == "----------------------------------"
		
    def test_fix_spaces_38(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                     ") == "-----------------------------------"
		
    def test_fix_spaces_39(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                      ") == "------------------------------------"
		
    def test_fix_spaces_40(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                       ") == "-------------------------------------"
		
    def test_fix_spaces_41(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                        ") == "--------------------------------------"
		
    def test_fix_spaces_42(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                         ") == "---------------------------------------"
		
    def test_fix_spaces_43(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                          ") == "----------------------------------------"
		
    def test_fix_spaces_44(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                           ") == "-----------------------------------------"
		
    def test_fix_spaces_45(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                            ") == "------------------------------------------"
		
    def test_fix_spaces_46(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                             ") == "-------------------------------------------"
		
    def test_fix_spaces_47(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                              ") == "--------------------------------------------"
		
    def test_fix_spaces_48(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                               ") == "---------------------------------------------"
		
    def test_fix_spaces_49(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                ") == "----------------------------------------------"
		
    def test_fix_spaces_50(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                 ") == "-----------------------------------------------"
		
    def test_fix_spaces_51(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                  ") == "------------------------------------------------"
		
    def test_fix_spaces_52(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                   ") == "-------------------------------------------------"
		
    def test_fix_spaces_53(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                    ") == "--------------------------------------------------"
		
    def test_fix_spaces_54(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                     ") == "---------------------------------------------------"
		
    def test_fix_spaces_55(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                      ") == "----------------------------------------------------"
		
    def test_fix_spaces_56(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                       ") == "-----------------------------------------------------"
		
    def test_fix_spaces_57(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                        ") == "------------------------------------------------------"
		
    def test_fix_spaces_58(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                         ") == "-------------------------------------------------------"
		
    def test_fix_spaces_59(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                          ") == "--------------------------------------------------------"
		
    def test_fix_spaces_60(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                           ") == "---------------------------------------------------------"
		
    def test_fix_spaces_61(self):
        """
        Test case for the :func:`scenario1.id_140.fix_spaces`.
        """
        assert fix_spaces("                                                            ") == "-------------------------------------------------------