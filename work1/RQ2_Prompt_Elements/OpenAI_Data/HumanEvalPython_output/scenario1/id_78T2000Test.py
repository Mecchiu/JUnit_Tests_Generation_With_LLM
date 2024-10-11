# id_78_Test.java
from scenario1.id_78 import hex_key

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`scenario1.id_78.hex_key`.
    """


    def test_hex_key_1(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2') == 1
		
    def test_hex_key_2(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3') == 1
		
    def test_hex_key_3(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('5') == 1
		
    def test_hex_key_4(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7') == 1
		
    def test_hex_key_5(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('B') == 1
		
    def test_hex_key_6(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('D') == 1
		
    def test_hex_key_7(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B') == 2
		
    def test_hex_key_8(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('3D') == 2
		
    def test_hex_key_9(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('5D') == 2
		
    def test_hex_key_10(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('7B') == 2
		
    def test_hex_key_11(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B3D5D7B') == 4
		
    def test_hex_key_12(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B3D5D7B2B3D5D7B') == 8
		
    def test_hex_key_13(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B') == 16
		
    def test_hex_key_14(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B') == 32
		
    def test_hex_key_15(self):
        """
        Test case for the :func:`scenario1.id_78.hex_key`.
        """
        assert hex_key('2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D7B2B3D5D