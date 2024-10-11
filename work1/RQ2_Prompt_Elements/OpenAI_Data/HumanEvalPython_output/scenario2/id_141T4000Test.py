# id_141_Test.java
from scenario2.id_141 import file_name_check

import pytest

class id_141_Test:
    """
    Test class of id_141.py.
    It contains ten unit test cases for the :func:`scenario2.id_141.file_name_check`.
    """


    def test_file_name_check_1(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.txt') == 'Yes'

    def test_file_name_check_2(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.exe') == 'Yes'

    def test_file_name_check_3(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.dll') == 'Yes'

    def test_file_name_check_4(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.txt.txt') == 'No'

    def test_file_name_check_5(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.exe.exe') == 'No'

    def test_file_name_check_6(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.dll.dll') == 'No'

    def test_file_name_check_7(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.txt.exe') == 'No'

    def test_file_name_check_8(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.exe.txt') == 'No'

    def test_file_name_check_9(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.dll.txt') == 'No'

    def test_file_name_check_10(self):
        """
        Test case for the :func:`scenario2.id_141.file_name_check`.
        """
        assert file_name_check('abc.txt.dll') == 'No'