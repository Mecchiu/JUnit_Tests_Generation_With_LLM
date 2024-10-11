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

    def test_is_valid_email_10(self):
        """
        Test case for the :func:`scenario3.id_142.is_valid_email`.
        """
        assert is_valid_email("example@example.com.com") == "No"

# id_143.py

def is_valid_password(password):
    """Create a function which takes a string representing a password, and returns 'Yes' 
    if the password is valid, and returns 'No' otherwise.
    A password is considered to be valid if and only if all the following conditions are met:
    - The password contains at least one lowercase letter ('a'-'z').
    - The password contains at least one uppercase letter ('A'-'Z').
    - The password contains at least one digit ('0'-'9').
    - The password contains at least one special character from the following list: 
    ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', 
    '|', ':', ';', '"', '<', '>', ',', '.', '?', '/', '~', '`'].
    - The password contains at least eight characters.
    Examples:
    is_valid_password("example") # => 'No' (the password should contain at least one digit)
    is_valid_password("example1") # => 'No' (the password should contain at least one uppercase 
    letter)
    is_valid_password("Example1") # => 'No' (the password should contain at least one special 
    character)
    is_valid_password("Example1!") # => 'Yes'
    is_valid_password("Example1!@") # => 'No' (the password should contain at least eight 
    characters)
    """

    pass
# id_143_Test.java
from scenario3.id_143 import is_valid_password

import pytest

class id_143_Test:
    """
    Test class of id_143.py.
    It contains ten unit test cases for the :func:`scenario3.id_143.is_valid_password`.
    """
		
    def test_is_valid_password_1(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("example") == "No"

    def test_is_valid_password_2(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("example1") == "No"

    def test_is_valid_password_3(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1") == "No"

    def test_is_valid_password_4(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!") == "Yes"

    def test_is_valid_password_5(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!@") == "No"

    def test_is_valid_password_6(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!@") == "No"

    def test_is_valid_password_7(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!@") == "No"

    def test_is_valid_password_8(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!@") == "No"

    def test_is_valid_password_9(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!@") == "No"

    def test_is_valid_password_10(self):
        """
        Test case for the :func:`scenario3.id_143.is_valid_password`.
        """
        assert is_valid_password("Example1!@") == "No"

# id_144.py

def is_valid_phone_number(phone_number):
    """Create a function which takes a string representing a phone number, and returns 'Yes' 
    if the phone number is valid, and returns 'No' otherwise.
    A phone number is considered to be valid if and only if all the following conditions are 
    met:
    - The phone number contains exactly ten digits ('0'-'9').
    - The first digit of the phone number is '0'.
    - The second digit of the phone number is '9'.
    - The third digit of the phone number is one of these: ['1', '2', '3', '4', '5', '6', '7', 
    '8'].
    Examples:
    is_valid_phone_number("0912345678") # => 'Yes'
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("091234567") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    is_valid_phone_number("09123456789") # => 'No' (the phone number should contain exactly ten 
    digits)
    """

    pass
# id_144_Test.java
from scenario3.id_144 import is_valid_phone_number

import pytest

class id_144_Test:
    """
    Test class of id_144.py.
    It contains ten unit test cases for the :func:`scenario3.id_144.is_valid_phone_number`.
    """
		
    def test_is_valid_phone_number_1(self):
        """
        Test case for the :func:`scenario3.id_144.is_valid_phone_number`.
        """
        assert is_valid_phone_number("0912345678") == "Yes"

    def test_is_valid_phone_number_2(self):
        """
        Test case for the :func:`scenario3.id_144.is_valid_phone_number`.
        """
        assert is_valid_phone_number("09123456789") == "No"

    def test_is_valid_phone_number_3(self):
        """
        Test case for the :func:`scenario3.id_144.is_valid_phone_number`.
        """
        assert is_valid_phone_number("091234567") == "No"

    def test_is_valid_phone_number_4(self):
        """
        Test case for the :func:`scenario3.id_144.is_valid_phone_number