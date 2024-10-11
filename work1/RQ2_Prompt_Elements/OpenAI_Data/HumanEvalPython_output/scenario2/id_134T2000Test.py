# id_134_Test.java
from scenario2.id_134 import check_if_last_char_is_a_letter

import pytest

class id_134_Test:
    """
    Test class of id_134.py.
    It contains ten unit test cases for the :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
    """


    def test_check_if_last_char_is_a_letter_1(self):
        """
        Test case 1 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World") == False

    def test_check_if_last_char_is_a_letter_2(self):
        """
        Test case 2 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!") == True

    def test_check_if_last_char_is_a_letter_3(self):
        """
        Test case 3 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World! ") == False

    def test_check_if_last_char_is_a_letter_4(self):
        """
        Test case 4 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!  ") == False

    def test_check_if_last_char_is_a_letter_5(self):
        """
        Test case 5 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!   ") == False

    def test_check_if_last_char_is_a_letter_6(self):
        """
        Test case 6 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!    ") == False

    def test_check_if_last_char_is_a_letter_7(self):
        """
        Test case 7 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!     ") == False

    def test_check_if_last_char_is_a_letter_8(self):
        """
        Test case 8 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!      ") == False

    def test_check_if_last_char_is_a_letter_9(self):
        """
        Test case 9 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!       ") == False

    def test_check_if_last_char_is_a_letter_10(self):
        """
        Test case 10 for :func:`scenario2.id_134.check_if_last_char_is_a_letter`.
        """
        assert check_if_last_char_is_a_letter("Hello World!        ") == False