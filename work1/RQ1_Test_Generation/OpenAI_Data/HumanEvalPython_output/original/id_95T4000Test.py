# id_95_Test.java
from original.id_95 import check_dict_case

import pytest

class id_95_Test:
    """
    Test class of id_95.py.
    It contains ten unit test cases for the :func:`original.id_95.check_dict_case`.
    """


    def test_check_dict_case_1(self):
        """
        Test case 1 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana"}) == True

    def test_check_dict_case_2(self):
        """
        Test case 2 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) == False

    def test_check_dict_case_3(self):
        """
        Test case 3 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) == False

    def test_check_dict_case_4(self):
        """
        Test case 4 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) == False

    def test_check_dict_case_5(self):
        """
        Test case 5 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"STATE":"NC", "ZIP":"12345" }) == True

    def test_check_dict_case_6(self):
        """
        Test case 6 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({}) == False

    def test_check_dict_case_7(self):
        """
        Test case 7 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana", "c":"cat", "d":"dog"}) == True

    def test_check_dict_case_8(self):
        """
        Test case 8 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "B":"banana", "C":"cat", "D":"dog"}) == True

    def test_check_dict_case_9(self):
        """
        Test case 9 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "B":"banana", "c":"cat", "D":"dog"}) == False

    def test_check_dict_case_10(self):
        """
        Test case 10 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "b":"banana", "C":"cat", "d":"dog"}) == False

# id_95_Test.py
from original.id_95 import check_dict_case

import pytest

class id_95_Test:
    """
    Test class of id_95.py.
    It contains ten unit test cases for the :func:`original.id_95.check_dict_case`.
    """
		
    def test_check_dict_case_1(self):
        """
        Test case 1 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana"}) == True

    def test_check_dict_case_2(self):
        """
        Test case 2 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) == False

    def test_check_dict_case_3(self):
        """
        Test case 3 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) == False

    def test_check_dict_case_4(self):
        """
        Test case 4 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) == False

    def test_check_dict_case_5(self):
        """
        Test case 5 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"STATE":"NC", "ZIP":"12345" }) == True

    def test_check_dict_case_6(self):
        """
        Test case 6 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({}) == False

    def test_check_dict_case_7(self):
        """
        Test case 7 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana", "c":"cat", "d":"dog"}) == True

    def test_check_dict_case_8(self):
        """
        Test case 8 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "B":"banana", "C":"cat", "D":"dog"}) == True

    def test_check_dict_case_9(self):
        """
        Test case 9 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "B":"banana", "c":"cat", "D":"dog"}) == False

    def test_check_dict_case_10(self):
        """
        Test case 10 for :func:`original.id_95.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "b":"banana", "C":"cat", "d":"dog"}) == False

# id_96.py

def check_dict_case(dict):
    """
    Given a dictionary, return True if all keys are strings in lower 
    case or all keys are strings in upper case, else return False.
    The function should return False is the given dictionary is empty.
    Examples:
    check_dict_case({"a":"apple", "b":"banana"}) should return True.
    check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) should return False.
    check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) should return False.
    check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) should return False.
    check_dict_case({"STATE":"NC", "ZIP":"12345" }) should return True.
    """

    if len(dict.keys()) == 0:
        return False
    else:
        state = "start"
        for key in dict.keys():

            if isinstance(key, str) == False:
                state = "mixed"
                break
            if state == "start":
                if key.isupper():
                    state = "upper"
                elif key.islower():
                    state = "lower"
                else:
                    break
            elif (state == "upper" and not key.isupper()) or (state == "lower" and not key.islower()):
                    state = "mixed"
                    break
            else:
                break
        return state == "upper" or state == "lower" 

# id_96_Test.java
from original.id_96 import check_dict_case

import pytest

class id_96_Test:
    """
    Test class of id_96.py.
    It contains ten unit test cases for the :func:`original.id_96.check_dict_case`.
    """
		
    def test_check_dict_case_1(self):
        """
        Test case 1 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana"}) == True

    def test_check_dict_case_2(self):
        """
        Test case 2 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) == False

    def test_check_dict_case_3(self):
        """
        Test case 3 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) == False

    def test_check_dict_case_4(self):
        """
        Test case 4 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) == False

    def test_check_dict_case_5(self):
        """
        Test case 5 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"STATE":"NC", "ZIP":"12345" }) == True

    def test_check_dict_case_6(self):
        """
        Test case 6 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({}) == False

    def test_check_dict_case_7(self):
        """
        Test case 7 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana", "c":"cat", "d":"dog"}) == True

    def test_check_dict_case_8(self):
        """
        Test case 8 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "B":"banana", "C":"cat", "D":"dog"}) == True

    def test_check_dict_case_9(self):
        """
        Test case 9 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "B":"banana", "c":"cat", "D":"dog"}) == False

    def test_check_dict_case_10(self):
        """
        Test case 10 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "b":"banana", "C":"cat", "d":"dog"}) == False

# id_96_Test.py
from original.id_96 import check_dict_case

import pytest

class id_96_Test:
    """
    Test class of id_96.py.
    It contains ten unit test cases for the :func:`original.id_96.check_dict_case`.
    """
		
    def test_check_dict_case_1(self):
        """
        Test case 1 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana"}) == True

    def test_check_dict_case_2(self):
        """
        Test case 2 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) == False

    def test_check_dict_case_3(self):
        """
        Test case 3 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) == False

    def test_check_dict_case_4(self):
        """
        Test case 4 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) == False

    def test_check_dict_case_5(self):
        """
        Test case 5 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"STATE":"NC", "ZIP":"12345" }) == True

    def test_check_dict_case_6(self):
        """
        Test case 6 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({}) == False

    def test_check_dict_case_7(self):
        """
        Test case 7 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana", "c":"cat", "d":"dog"}) == True

    def test_check_dict_case_8(self):
        """
        Test case 8 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "B":"banana", "C":"cat", "D":"dog"}) == True

    def test_check_dict_case_9(self):
        """
        Test case 9 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "B":"banana", "c":"cat", "D":"dog"}) == False

    def test_check_dict_case_10(self):
        """
        Test case 10 for :func:`original.id_96.check_dict_case`.
        """
        assert check_dict_case({"A":"apple", "b":"banana", "C":"cat", "d":"dog"}) == False

# id_97.py

def check_dict_case(dict):
    """
    Given a dictionary, return True if all keys are strings in lower 
    case or all keys are strings in upper case, else return False.
    The function should return False is the given dictionary is empty.
    Examples:
    check_dict_case({"a":"apple", "b":"banana"}) should return True.
    check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) should return False.
    check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) should return False.
    check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) should return False.
    check_dict_case({"STATE":"NC", "ZIP":"12345" }) should return True.
    """

    if len(dict.keys()) == 0:
        return False
    else:
        state = "start"
        for key in dict.keys():

            if isinstance(key, str) == False:
                state = "mixed"
                break
            if state == "start":
                if key.isupper():
                    state = "upper"
                elif key.islower():
                    state = "lower"
                else:
                    break
            elif (state == "upper" and not key.isupper()) or (state == "lower" and not key.islower()):
                    state = "mixed"
                    break
            else:
                break
        return state == "upper" or state == "lower" 

# id_97_Test.java
from original.id_97 import check_dict_case

import pytest

class id_97_Test:
    """
    Test class of id_97.py.
    It contains ten unit test cases for the :func:`original.id_97.check_dict_case`.
    """
		
    def test_check_dict_case_1(self):
        """
        Test case 1 for :func:`original.id_97.check_dict_case`.
        """
        assert check_dict_case({"a":"apple", "b":"banana"}) == True

    def test_check_dict_case_2(self):
        """
        Test case 2 for