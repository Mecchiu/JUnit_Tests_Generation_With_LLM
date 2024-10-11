# id_66_Test.java
from scenario1.id_66 import digitSum

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`scenario1.id_66.digitSum`.
    """


    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_4(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("abc") == 0
		
    def test_digitSum_5(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("ABC") == 65
		
    def test_digitSum_6(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("aBc") == 65
		
    def test_digitSum_7(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("AbC") == 65
		
    def test_digitSum_8(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("aBC") == 65
		
    def test_digitSum_9(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("Abc") == 65
		
    def test_digitSum_10(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("aBCdEf") == 65 + 66 + 67 + 69 + 70
		
# id_66_Test.py
from scenario1.id_66 import digitSum

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`scenario1.id_66.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_4(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("abc") == 0
		
    def test_digitSum_5(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("ABC") == 65
		
    def test_digitSum_6(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("aBc") == 65
		
    def test_digitSum_7(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("AbC") == 65
		
    def test_digitSum_8(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("aBC") == 65
		
    def test_digitSum_9(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("Abc") == 65
		
    def test_digitSum_10(self):
        """
        Test case for the :func:`scenario1.id_66.digitSum`.
        """
        assert digitSum("aBCdEf") == 65 + 66 + 67 + 69 + 70
		
# id_67.py

def digitSum(s):
    

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

# id_67_Test.java
from scenario1.id_67 import digitSum

import pytest

class id_67_Test:
    """
    Test class of id_67.py.
    It contains ten unit test cases for the :func:`scenario1.id_67.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_4(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("abc") == 0
		
    def test_digitSum_5(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("ABC") == 65
		
    def test_digitSum_6(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("aBc") == 65
		
    def test_digitSum_7(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("AbC") == 65
		
    def test_digitSum_8(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("aBC") == 65
		
    def test_digitSum_9(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("Abc") == 65
		
    def test_digitSum_10(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("aBCdEf") == 65 + 66 + 67 + 69 + 70
		
# id_67_Test.py
from scenario1.id_67 import digitSum

import pytest

class id_67_Test:
    """
    Test class of id_67.py.
    It contains ten unit test cases for the :func:`scenario1.id_67.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_4(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("abc") == 0
		
    def test_digitSum_5(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("ABC") == 65
		
    def test_digitSum_6(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("aBc") == 65
		
    def test_digitSum_7(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("AbC") == 65
		
    def test_digitSum_8(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("aBC") == 65
		
    def test_digitSum_9(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("Abc") == 65
		
    def test_digitSum_10(self):
        """
        Test case for the :func:`scenario1.id_67.digitSum`.
        """
        assert digitSum("aBCdEf") == 65 + 66 + 67 + 69 + 70
		
# id_68.py

def digitSum(s):
    

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

# id_68_Test.java
from scenario1.id_68 import digitSum

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario1.id_68.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_4(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("abc") == 0
		
    def test_digitSum_5(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("ABC") == 65
		
    def test_digitSum_6(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("aBc") == 65
		
    def test_digitSum_7(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("AbC") == 65
		
    def test_digitSum_8(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("aBC") == 65
		
    def test_digitSum_9(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("Abc") == 65
		
    def test_digitSum_10(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("aBCdEf") == 65 + 66 + 67 + 69 + 70
		
# id_68_Test.py
from scenario1.id_68 import digitSum

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario1.id_68.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_4(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("abc") == 0
		
    def test_digitSum_5(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("ABC") == 65
		
    def test_digitSum_6(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("aBc") == 65
		
    def test_digitSum_7(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("AbC") == 65
		
    def test_digitSum_8(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("aBC") == 65
		
    def test_digitSum_9(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("Abc") == 65
		
    def test_digitSum_10(self):
        """
        Test case for the :func:`scenario1.id_68.digitSum`.
        """
        assert digitSum("aBCdEf") == 65 + 66 + 67 + 69 + 70
		
# id_69.py

def digitSum(s):
    

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

# id_69_Test.java
from scenario1.id_69 import digitSum

import pytest

class id_69_Test:
    """
    Test class of id_69.py.
    It contains ten unit test cases for the :func:`scenario1.id_69.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario1.id_69.digitSum`.
        """
        assert digitSum("") == 0
		
    def test_digitSum_2(self):
        """
        Test case for the :func:`scenario1.id_69.digitSum`.
        """
        assert digitSum("a") == 0
		
    def test_digitSum_3(self):
        """
        Test case for the :func:`scenario1.id_69.digitSum`.
        """
        assert digitSum("A") == 65
		
    def test_digitSum_