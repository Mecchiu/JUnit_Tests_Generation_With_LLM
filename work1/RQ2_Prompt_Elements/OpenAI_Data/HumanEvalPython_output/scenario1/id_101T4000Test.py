# id_101_Test.java
from scenario1.id_101 import words_string

import pytest

class id_101_Test:
    """
    Test class of id_101.py.
    It contains ten unit test cases for the :func:`scenario1.id_101.words_string`.
    """


    def test_words_string_1(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("") == []

    def test_words_string_2(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a") == ["a"]

    def test_words_string_3(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b") == ["a", "b"]

    def test_words_string_4(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c") == ["a", "b", "c"]

    def test_words_string_5(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c,d") == ["a", "b", "c", "d"]

    def test_words_string_6(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c,d,e") == ["a", "b", "c", "d", "e"]

    def test_words_string_7(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c,d,e,f") == ["a", "b", "c", "d", "e", "f"]

    def test_words_string_8(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c,d,e,f,g") == ["a", "b", "c", "d", "e", "f", "g"]

    def test_words_string_9(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c,d,e,f,g,h") == ["a", "b", "c", "d", "e", "f", "g", "h"]

    def test_words_string_10(self):
        """
        Test case for the :func:`scenario1.id_101.words_string`.
        """
        assert words_string("a,b,c,d,e,f,g,h,i") == ["a", "b", "c", "d", "e", "f", "g", "h", "i"]

# id_102.py

def words_string_2(s):

    if not s:
        return []

    s_list = []

    for letter in s:
        if letter == ',':
            s_list.append(' ')
        else:
            s_list.append(letter)

    s_list = "".join(s_list)
    return s_list.split()

# id_102_Test.java
from scenario1.id_102 import words_string_2

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario1.id_102.words_string_2`.
    """
		
    def test_words_string_2_1(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("") == []

    def test_words_string_2_2(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a") == ["a"]

    def test_words_string_2_3(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b") == ["a", "b"]

    def test_words_string_2_4(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c") == ["a", "b", "c"]

    def test_words_string_2_5(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c,d") == ["a", "b", "c", "d"]

    def test_words_string_2_6(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c,d,e") == ["a", "b", "c", "d", "e"]

    def test_words_string_2_7(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c,d,e,f") == ["a", "b", "c", "d", "e", "f"]

    def test_words_string_2_8(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c,d,e,f,g") == ["a", "b", "c", "d", "e", "f", "g"]

    def test_words_string_2_9(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c,d,e,f,g,h") == ["a", "b", "c", "d", "e", "f", "g", "h"]

    def test_words_string_2_10(self):
        """
        Test case for the :func:`scenario1.id_102.words_string_2`.
        """
        assert words_string_2("a,b,c,d,e,f,g,h,i") == ["a", "b", "c", "d", "e", "f", "g", "h", "i"]

# id_103.py

def words_string_3(s):

    if not s:
        return []

    s_list = []

    for letter in s:
        if letter == ',':
            s_list.append(' ')
        else:
            s_list.append(letter)

    s_list = "".join(s_list)
    return s_list.split()

# id_103_Test.java
from scenario1.id_103 import words_string_3

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario1.id_103.words_string_3`.
    """
		
    def test_words_string_3_1(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("") == []

    def test_words_string_3_2(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a") == ["a"]

    def test_words_string_3_3(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b") == ["a", "b"]

    def test_words_string_3_4(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c") == ["a", "b", "c"]

    def test_words_string_3_5(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c,d") == ["a", "b", "c", "d"]

    def test_words_string_3_6(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c,d,e") == ["a", "b", "c", "d", "e"]

    def test_words_string_3_7(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c,d,e,f") == ["a", "b", "c", "d", "e", "f"]

    def test_words_string_3_8(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c,d,e,f,g") == ["a", "b", "c", "d", "e", "f", "g"]

    def test_words_string_3_9(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c,d,e,f,g,h") == ["a", "b", "c", "d", "e", "f", "g", "h"]

    def test_words_string_3_10(self):
        """
        Test case for the :func:`scenario1.id_103.words_string_3`.
        """
        assert words_string_3("a,b,c,d,e,f,g,h,i") == ["a", "b", "c", "d", "e", "f", "g", "h", "i"]

# id_104.py

def words_string_4(s):

    if not s:
        return []

    s_list = []

    for letter in s:
        if letter == ',':
            s_list.append(' ')
        else:
            s_list.append(letter)

    s_list = "".join(s_list)
    return s_list.split()

# id_104_Test.java
from scenario1.id_104 import words_string_4

import pytest

class id_104_Test:
    """
    Test class of id_104.py.
    It contains ten unit test cases for the :func:`scenario1.id_104.words_string_4`.
    """
		
    def test_words_string_4_1(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("") == []

    def test_words_string_4_2(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a") == ["a"]

    def test_words_string_4_3(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b") == ["a", "b"]

    def test_words_string_4_4(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c") == ["a", "b", "c"]

    def test_words_string_4_5(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c,d") == ["a", "b", "c", "d"]

    def test_words_string_4_6(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c,d,e") == ["a", "b", "c", "d", "e"]

    def test_words_string_4_7(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c,d,e,f") == ["a", "b", "c", "d", "e", "f"]

    def test_words_string_4_8(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c,d,e,f,g") == ["a", "b", "c", "d", "e", "f", "g"]

    def test_words_string_4_9(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c,d,e,f,g,h") == ["a", "b", "c", "d", "e", "f", "g", "h"]

    def test_words_string_4_10(self):
        """
        Test case for the :func:`scenario1.id_104.words_string_4`.
        """
        assert words_string_4("a,b,c,d,e,f,g,h,i") == ["a", "b", "c", "d", "e", "f", "g", "h", "i"]

# id_105.py

def words_string_5(s):

    if not s:
        return []

    s_list = []

    for letter in s:
        if letter == ',':
            s_list.append(' ')
        else:
            s_list.append(letter)

    s_list = "".join(s_list)
    return s_list.split()

# id_105_Test.java
from scenario1.id_105 import words_string_5

import pytest

class id_105_Test:
    """
    Test class of id_105.py.
    It contains ten unit test cases for the :func:`scenario1.id_105.words_string_5`.
    """
		
    def test_words_string_5_1(self):
        """
        Test case for the :func:`scenario1.id_105.words_string_5`.
        """
        assert words_string_5("") == []

    def test_words_string_5_2(self):
        """
        Test case for the :func:`scenario1.id_105.words_string_5`.
        """
        assert words_string_5("a") == ["a"]

    def test_words_string_5_3(self):
        """
        Test case for the :func:`scenario1.id_105.words_string_5`.
        """
        assert words_string_5("a,b") == ["a", "b"]

    def test_words_string_5_4(self):
        """
        Test case for the :func:`scenario1.id_