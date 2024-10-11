# id_153_Test.java
from original.id_153 import Strongest_Extension

import pytest

class id_153_Test:
    """
    Test class of id_153.py.
    It contains ten unit test cases for the :func:`original.id_153.Strongest_Extension`.
    """


    def test_Strongest_Extension_1(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'

    def test_Strongest_Extension_2(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD']) == 'my_class.AA'

    def test_Strongest_Extension_3(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE']) == 'my_class.AA'

    def test_Strongest_Extension_4(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF']) == 'my_class.AA'

    def test_Strongest_Extension_5(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG']) == 'my_class.AA'

    def test_Strongest_Extension_6(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH']) == 'my_class.AA'

    def test_Strongest_Extension_7(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II']) == 'my_class.AA'

    def test_Strongest_Extension_8(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ']) == 'my_class.AA'

    def test_Strongest_Extension_9(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ', 'KK']) == 'my_class.AA'

    def test_Strongest_Extension_10(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ', 'KK', 'LL']) == 'my_class.AA'


# id_154.py

def Strongest_Extension_2(class_name, extensions):
    """You will be given the name of a class (a string) and a list of extensions.
    The extensions are to be used to load additional classes to the class. The
    strength of the extension is as follows: Let CAP be the number of the uppercase
    letters in the extension's name, and let SM be the number of lowercase letters 
    in the extension's name, the strength is given by the fraction CAP - SM. 
    You should find the strongest extension and return a string in this 
    format: ClassName.StrongestExtensionName.
    If there are two or more extensions with the same strength, you should
    choose the one that comes first in the list.
    For example, if you are given "Slices" as the class and a list of the
    extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
    return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
    (its strength is -1).
    Example:
    for Strongest_Extension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'
    """

    strong = extensions[0]
    my_val = len([x for x in extensions[0] if x.isalpha() and x.isupper()]) - len([x for x in extensions[0] if x.isalpha() and x.islower()])
    for s in extensions:
        val = len([x for x in s if x.isalpha() and x.isupper()]) - len([x for x in s if x.isalpha() and x.islower()])
        if val > my_val:
            strong = s
            my_val = val

    ans = class_name + "." + strong
    return ans


# id_154_Test.java
from original.id_154 import Strongest_Extension_2

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`original.id_154.Strongest_Extension_2`.
    """
		
    def test_Strongest_Extension_2_1(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'

    def test_Strongest_Extension_2_2(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD']) == 'my_class.AA'

    def test_Strongest_Extension_2_3(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE']) == 'my_class.AA'

    def test_Strongest_Extension_2_4(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF']) == 'my_class.AA'

    def test_Strongest_Extension_2_5(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG']) == 'my_class.AA'

    def test_Strongest_Extension_2_6(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH']) == 'my_class.AA'

    def test_Strongest_Extension_2_7(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II']) == 'my_class.AA'

    def test_Strongest_Extension_2_8(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ']) == 'my_class.AA'

    def test_Strongest_Extension_2_9(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ', 'KK']) == 'my_class.AA'

    def test_Strongest_Extension_2_10(self):
        """
        Test case for Strongest_Extension_2.
        """
        assert Strongest_Extension_2('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ', 'KK', 'LL']) == 'my_class.AA'


# id_155.py

def Strongest_Extension_3(class_name, extensions):
    """You will be given the name of a class (a string) and a list of extensions.
    The extensions are to be used to load additional classes to the class. The
    strength of the extension is as follows: Let CAP be the number of the uppercase
    letters in the extension's name, and let SM be the number of lowercase letters 
    in the extension's name, the strength is given by the fraction CAP - SM. 
    You should find the strongest extension and return a string in this 
    format: ClassName.StrongestExtensionName.
    If there are two or more extensions with the same strength, you should
    choose the one that comes first in the list.
    For example, if you are given "Slices" as the class and a list of the
    extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
    return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
    (its strength is -1).
    Example:
    for Strongest_Extension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'
    """

    strong = extensions[0]
    my_val = len([x for x in extensions[0] if x.isalpha() and x.isupper()]) - len([x for x in extensions[0] if x.isalpha() and x.islower()])
    for s in extensions:
        val = len([x for x in s if x.isalpha() and x.isupper()]) - len([x for x in s if x.isalpha() and x.islower()])
        if val > my_val:
            strong = s
            my_val = val

    ans = class_name + "." + strong
    return ans


# id_155_Test.java
from original.id_155 import Strongest_Extension_3

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`original.id_155.Strongest_Extension_3`.
    """
		
    def test_Strongest_Extension_3_1(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'

    def test_Strongest_Extension_3_2(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD']) == 'my_class.AA'

    def test_Strongest_Extension_3_3(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE']) == 'my_class.AA'

    def test_Strongest_Extension_3_4(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF']) == 'my_class.AA'

    def test_Strongest_Extension_3_5(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG']) == 'my_class.AA'

    def test_Strongest_Extension_3_6(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH']) == 'my_class.AA'

    def test_Strongest_Extension_3_7(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II']) == 'my_class.AA'

    def test_Strongest_Extension_3_8(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ']) == 'my_class.AA'

    def test_Strongest_Extension_3_9(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ', 'KK']) == 'my_class.AA'

    def test_Strongest_Extension_3_10(self):
        """
        Test case for Strongest_Extension_3.
        """
        assert Strongest_Extension_3('my_class', ['AA', 'Be', 'CC', 'DD', 'EE', 'FF', 'GG', 'HH', 'II', 'JJ', 'KK', 'LL']) == 'my_class.AA'


# id_156.py

def Strongest_Extension_4(class_name, extensions):
    """You will be given the name of a class (a string) and a list of extensions.
    The extensions are to be used to load additional classes to the class. The
    strength of the extension is as follows: Let CAP be the number of the uppercase
    letters in the extension's name, and let SM be the number of lowercase letters 
    in the extension's name, the strength is given by the fraction CAP - SM. 
    You should find the strongest extension and return a string in this 
    format: ClassName.StrongestExtensionName.
    If there are two or more extensions with the same strength, you should
    choose the one that comes first in the list.
    For example, if you are given "Slices" as the class and a list of the
    extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
    return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
    (its strength is -1).
    Example:
    for Strongest_Extension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'
    """

    strong = extensions[0]
    my_val = len([x for x in extensions[0] if x.isalpha() and x.isupper()]) - len([x for x in extensions[0] if x.isalpha() and x.islower()])
    for s in extensions:
        val = len([x for x in s if x.isalpha() and x.isupper()]) - len([x for x in s if x.isalpha() and x.islower()])
        if val > my_val:
            strong = s
            my_val = val

    ans = class_name + "." + strong
    return ans


# id_156_Test.java
from original.id_156 import Strongest_Extension_4

import pytest

class id