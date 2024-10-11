# id_66_Test.java
from scenario2.id_66 import digitSum

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`scenario2.id_66.digitSum`.
    """


    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario2.id_66.digitSum`.
        """
        assert digitSum("") == 0
        assert digitSum("a") == 0
        assert digitSum("A") == 65
        assert digitSum("aB") == 65
        assert digitSum("aBc") == 65
        assert digitSum("aBcD") == 130
        assert digitSum("aBcDe") == 130
        assert digitSum("aBcDeF") == 195
        assert digitSum("aBcDeFg") == 195
        assert digitSum("aBcDeFgH") == 260

# id_66_Test.py
from scenario2.id_66 import digitSum

import pytest

class id_66_Test:
    """
    Test class of id_66.py.
    It contains ten unit test cases for the :func:`scenario2.id_66.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario2.id_66.digitSum`.
        """
        assert digitSum("") == 0
        assert digitSum("a") == 0
        assert digitSum("A") == 65
        assert digitSum("aB") == 65
        assert digitSum("aBc") == 65
        assert digitSum("aBcD") == 130
        assert digitSum("aBcDe") == 130
        assert digitSum("aBcDeF") == 195
        assert digitSum("aBcDeFg") == 195
        assert digitSum("aBcDeFgH") == 260

# id_67.java

public class id_67 {
    /**
     * Task
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     *
     * @param s
     * @return
     */
    public static int digitSum(String s) {
        if (s.equals("")) return 0;
        return s.chars().filter(Character::isUpperCase).sum();
    }
}

# id_67.py

def digitSum(s):
    """Task
    Write a function that takes a string as input and returns the sum of the upper characters only'
    ASCII codes.

    
    """

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

# id_67_Test.java
from scenario2.id_67 import digitSum

import pytest

class id_67_Test:
    """
    Test class of id_67.py.
    It contains ten unit test cases for the :func:`scenario2.id_67.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario2.id_67.digitSum`.
        """
        assert digitSum("") == 0
        assert digitSum("a") == 0
        assert digitSum("A") == 65
        assert digitSum("aB") == 65
        assert digitSum("aBc") == 65
        assert digitSum("aBcD") == 130
        assert digitSum("aBcDe") == 130
        assert digitSum("aBcDeF") == 195
        assert digitSum("aBcDeFg") == 195
        assert digitSum("aBcDeFgH") == 260

# id_67_Test.py
from scenario2.id_67 import digitSum

import pytest

class id_67_Test:
    """
    Test class of id_67.py.
    It contains ten unit test cases for the :func:`scenario2.id_67.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario2.id_67.digitSum`.
        """
        assert digitSum("") == 0
        assert digitSum("a") == 0
        assert digitSum("A") == 65
        assert digitSum("aB") == 65
        assert digitSum("aBc") == 65
        assert digitSum("aBcD") == 130
        assert digitSum("aBcDe") == 130
        assert digitSum("aBcDeF") == 195
        assert digitSum("aBcDeFg") == 195
        assert digitSum("aBcDeFgH") == 260

# id_68.java

public class id_68 {
    /**
     * Task
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     *
     * @param s
     * @return
     */
    public static int digitSum(String s) {
        if (s.equals("")) return 0;
        return s.chars().filter(Character::isUpperCase).sum();
    }
}

# id_68.py

def digitSum(s):
    """Task
    Write a function that takes a string as input and returns the sum of the upper characters only'
    ASCII codes.

    
    """

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

# id_68_Test.java
from scenario2.id_68 import digitSum

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario2.id_68.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario2.id_68.digitSum`.
        """
        assert digitSum("") == 0
        assert digitSum("a") == 0
        assert digitSum("A") == 65
        assert digitSum("aB") == 65
        assert digitSum("aBc") == 65
        assert digitSum("aBcD") == 130
        assert digitSum("aBcDe") == 130
        assert digitSum("aBcDeF") == 195
        assert digitSum("aBcDeFg") == 195
        assert digitSum("aBcDeFgH") == 260

# id_68_Test.py
from scenario2.id_68 import digitSum

import pytest

class id_68_Test:
    """
    Test class of id_68.py.
    It contains ten unit test cases for the :func:`scenario2.id_68.digitSum`.
    """
		
    def test_digitSum_1(self):
        """
        Test case for the :func:`scenario2.id_68.digitSum`.
        """
        assert digitSum("") == 0
        assert digitSum("a") == 0
        assert digitSum("A") == 65
        assert digitSum("aB") == 65
        assert digitSum("aBc") == 65
        assert digitSum("aBcD") == 130
        assert digitSum("aBcDe") == 130
        assert digitSum("aBcDeF") == 195
        assert digitSum("aBcDeFg") == 195
        assert digitSum("aBcDeFgH") == 260

# id_69.java

public class id_69 {
    /**
     * Task
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     *
     * @param s
     * @return
     */
    public static int digitSum(String s) {
        if (s.equals("")) return 0;
        return s.chars().filter(Character::isUpperCase).sum();
    }
}

# id_69.py

def digitSum(s):
    """Task
    Write a function that takes a string as input and returns the sum of the upper characters only'
    ASCII codes.

    
    """

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

# id_69_Test.java
from scenario2.id_69 import digitSum

import pytest

class id_