# id_134_Test.java
from scenario1.id_134 import check_if_last_char_is_a_letter

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
    """


    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World") == True
		
    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!") == False
		
    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! ") == False
		
    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1") == False
		
    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 ") == False
		
    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a") == True
		
    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ") == False
		
    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a !") == False
		
    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! ") == False
		
    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1") == False
		
    def test_check_if_last_char_is_a_letter_11(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 ") == False
		
    def test_check_if_last_char_is_a_letter_12(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a") == True
		
    def test_check_if_last_char_is_a_letter_13(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ") == False
		
    def test_check_if_last_char_is_a_letter_14(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a !") == False
		
    def test_check_if_last_char_is_a_letter_15(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! ") == False
		
    def test_check_if_last_char_is_a_letter_16(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1") == False
		
    def test_check_if_last_char_is_a_letter_17(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 ") == False
		
    def test_check_if_last_char_is_a_letter_18(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a") == True
		
    def test_check_if_last_char_is_a_letter_19(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ") == False
		
    def test_check_if_last_char_is_a_letter_20(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a !") == False
		
    def test_check_if_last_char_is_a_letter_21(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! ") == False
		
    def test_check_if_last_char_is_a_letter_22(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1") == False
		
    def test_check_if_last_char_is_a_letter_23(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 ") == False
		
    def test_check_if_last_char_is_a_letter_24(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a") == True
		
    def test_check_if_last_char_is_a_letter_25(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ") == False
		
    def test_check_if_last_char_is_a_letter_26(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a !") == False
		
    def test_check_if_last_char_is_a_letter_27(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! ") == False
		
    def test_check_if_last_char_is_a_letter_28(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1") == False
		
    def test_check_if_last_char_is_a_letter_29(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 ") == False
		
    def test_check_if_last_char_is_a_letter_30(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a") == True
		
    def test_check_if_last_char_is_a_letter_31(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ") == False
		
    def test_check_if_last_char_is_a_letter_32(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a !") == False
		
    def test_check_if_last_char_is_a_letter_33(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! ") == False
		
    def test_check_if_last_char_is_a_letter_34(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1") == False
		
    def test_check_if_last_char_is_a_letter_35(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1 ") == False
		
    def test_check_if_last_char_is_a_letter_36(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1 a") == True
		
    def test_check_if_last_char_is_a_letter_37(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ") == False
		
    def test_check_if_last_char_is_a_letter_38(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1 a !") == False
		
    def test_check_if_last_char_is_a_letter_39(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! ") == False
		
    def test_check_if_last_char_is_a_letter_40(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1 a ! 1") == False
		
    def test_check_if_last_char_is_a_letter_41(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! 1 a ! 1 a ! 1 a ! 1 a ! 1