# id_78_Test.java
from scenario3.id_78 import hex_key

import pytest

class id_78_Test:
    """
    Test class of id_78.py.
    It contains ten unit test cases for the :func:`scenario3.id_78.hex_key`.
    """


    def test_hex_key_1(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("AB") == 1
		
    def test_hex_key_2(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("1077E") == 2
		
    def test_hex_key_3(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("ABED1A33") == 4
		
    def test_hex_key_4(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("123456789ABCDEF0") == 6
		
    def test_hex_key_5(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("2020") == 2
		
    def test_hex_key_6(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("") == 0
		
    def test_hex_key_7(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("A") == 1
		
    def test_hex_key_8(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("B") == 1
		
    def test_hex_key_9(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("D") == 1
		
    def test_hex_key_10(self):
        """
        Test case for the :func:`scenario3.id_78.hex_key`.
        """
        assert hex_key("F") == 1
		
		
if __name__ == '__main__':
    pytest.main()