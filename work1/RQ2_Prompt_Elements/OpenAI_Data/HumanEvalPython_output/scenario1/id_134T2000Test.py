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
        assert check_if_last_char_is_a_letter("Hello World!  ") == False
		
    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!   ") == False
		
    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!    ") == False
		
    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!     ") == False
		
    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!      ") == False
		
    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!       ") == False
		
    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case for the function :func:`scenario1.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!        ") == False
		
# id_135.py

def check_if_last_char_is_a_letter_or_number(txt):

 
    check = txt.split(' ')[-1]
    return True if len(check) == 1 and (97 <= ord(check.lower()) <= 122 or 48 <= ord(check) <= 57) else False

# id_135_Test.java
from scenario1.id_135 import check_if_last_char_is_a_letter_or_number

import pytest

class id_135_Test:
    """
    Test class of id_135.py.
    It contains ten unit test cases for the :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
    """
		
    def test_check_if_last_char_is_a_letter_or_number_1(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World") == True
		
    def test_check_if_last_char_is_a_letter_or_number_2(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!") == False
		
    def test_check_if_last_char_is_a_letter_or_number_3(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World! ") == False
		
    def test_check_if_last_char_is_a_letter_or_number_4(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!  ") == False
		
    def test_check_if_last_char_is_a_letter_or_number_5(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!   ") == False
		
    def test_check_if_last_char_is_a_letter_or_number_6(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!    ") == False
		
    def test_check_if_last_char_is_a_letter_or_number_7(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!     ") == False
		
    def test_check_if_last_char_is_a_letter_or_number_8(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!      ") == False
		
    def test_check_if_last_char_is_a_letter_or_number_9(self):
        """
        Test case for the function :func:`scenario1.id_135.check_if_last_char_is_a_letter_or_number`.
        """
        assert check_if_last_char_is_a_letter_or_number("Hello World!       ") == False
		
    def