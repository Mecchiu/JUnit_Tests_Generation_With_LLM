# id_141_Test.java
from scenario3.id_141 import file_name_check

import pytest

class id_141_Test:
    """
    Test class of id_141.py.
    It contains ten unit test cases for the :func:`scenario3.id_141.file_name_check`.
    """


    def test_file_name_check_1(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

    def test_file_name_check_2(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("1example.dll") == "No"

    def test_file_name_check_3(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.exe") == "Yes"

    def test_file_name_check_4(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.dll") == "Yes"

    def test_file_name_check_5(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

    def test_file_name_check_6(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

    def test_file_name_check_7(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

    def test_file_name_check_8(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

    def test_file_name_check_9(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

    def test_file_name_check_10(self):
        """
        Test case for the :func:`scenario3.id_141.file_name_check`.
        """
        assert file_name_check("example.txt") == "Yes"

# id_142.py

def is_valid_email(email):
    """Create a function which takes a string representing an email address, and returns
    'Yes' if the email address is valid, and returns 'No' otherwise.
    An email address is considered to be valid if and only if all the following conditions 
    are met:
    - The email address contains exactly one '@' character.
    - The substring before the '@' character contains only letters from the latin alphapet 
    ('a'-'z' and 'A'-'Z'), digits ('0'-'9'), and the underscore character ('_').
    - The substring after the '@' character contains only letters from the latin alphapet 
    ('a'-'z' and 'A'-'Z'), digits ('0'-'9'), and the dot character ('.').
    - The substring after the '@' character should not start with a dot character ('.').
    - The substring after the '@' character should not end with a dot character ('.').
    - The substring after the '@' character should not contain two consecutive dot characters 
    ('.').
    Examples:
    is_valid_email("example@example.com") # => 'Yes'
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.") # => 'No' (the substring after the '@' character 
    should not end with a dot character ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    is_valid_email("example@example.com.com") # => 'No' (the substring after the '@' character 
    should not contain two consecutive dot characters ('.'))
    """

    pass
# id_142_Test.java
from scenario3.id_142 import is_valid_email

import pytest

class id_142_Test:
    """
    Test class of id_142.py.
    It contains ten unit test cases for the :func:`scenario3.id_142.is_valid_email`.
    """
		
    def test_is_valid_email_1(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com") == "Yes"

    def test_is_valid_email_2(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_3(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.") == "No"

    def test_is_valid_email_4(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_5(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_6(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_7(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_8(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_9(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

    def test_is_valid_email_10(