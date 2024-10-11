# id_80_Test.java
from original.id_80 import is_happy

import pytest

class id_80_Test:
    """
    Test class of id_80.py.
    It contains ten unit test cases for the :func:`original.id_80.is_happy`.
    """


    def test_is_happy_1(self):
        """
        Test case 1 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('a') == False
		
    def test_is_happy_2(self):
        """
        Test case 2 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aa') == False
		
    def test_is_happy_3(self):
        """
        Test case 3 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('abcd') == True
		
    def test_is_happy_4(self):
        """
        Test case 4 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabb') == False
		
    def test_is_happy_5(self):
        """
        Test case 5 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('adb') == True
		
    def test_is_happy_6(self):
        """
        Test case 6 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('xyy') == False
		
    def test_is_happy_7(self):
        """
        Test case 7 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbcc') == True
		
    def test_is_happy_8(self):
        """
        Test case 8 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbccdd') == False
		
    def test_is_happy_9(self):
        """
        Test case 9 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbccddee') == True
		
    def test_is_happy_10(self):
        """
        Test case 10 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbccddeeff') == False
		
# id_80_Test.py
from original.id_80 import is_happy

import pytest

class id_80_Test:
    """
    Test class of id_80.py.
    It contains ten unit test cases for the :func:`original.id_80.is_happy`.
    """
		
    def test_is_happy_1(self):
        """
        Test case 1 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('a') == False
		
    def test_is_happy_2(self):
        """
        Test case 2 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aa') == False
		
    def test_is_happy_3(self):
        """
        Test case 3 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('abcd') == True
		
    def test_is_happy_4(self):
        """
        Test case 4 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabb') == False
		
    def test_is_happy_5(self):
        """
        Test case 5 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('adb') == True
		
    def test_is_happy_6(self):
        """
        Test case 6 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('xyy') == False
		
    def test_is_happy_7(self):
        """
        Test case 7 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbcc') == True
		
    def test_is_happy_8(self):
        """
        Test case 8 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbccdd') == False
		
    def test_is_happy_9(self):
        """
        Test case 9 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbccddee') == True
		
    def test_is_happy_10(self):
        """
        Test case 10 for :func:`original.id_80.is_happy`.
        """
        assert is_happy('aabbccddeeff') == False
		
# id_81.java

public class id_81 {
    /**
     * You are given a string s.
     * Your task is to check if the string is happy or not.
     * A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
     * For example:
     * is_happy(a) => False
     * is_happy(aa) => False
     * is_happy(abcd) => True
     * is_happy(aabb) => False
     * is_happy(adb) => True
     * is_happy(xyy) => False
     * @param s
     * @return
     */
    public static boolean is_happy(String s) {
        if (s.length() < 3) {
            return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i + 1) == s.charAt(i + 2) || s.charAt(i) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}

# id_81.py

def is_happy(s):
    """You are given a string s.
    Your task is to check if the string is happy or not.
    A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
    For example:
    is_happy(a) => False
    is_happy(aa) => False
    is_happy(abcd) => True
    is_happy(aabb) => False
    is_happy(adb) => True
    is_happy(xyy) => False
    """

    if len(s) < 3:
      return False

    for i in range(len(s) - 2):
      
      if s[i] == s[i+1] or s[i+1] == s[i+2] or s[i] == s[i+2]:
        return False
    return True

# id_81_Test.java
from original.id_81 import is_happy

import pytest

class id_81_Test:
    """
    Test class of id_81.py.
    It contains ten unit test cases for the :func:`original.id_81.is_happy`.
    """
		
    def test_is_happy_1(self):
        """
        Test case 1 for :func:`original.id_81.is_happy`.
        """
        assert is_happy('a') == False
		
    def test_is_happy_2(self):
        """
        Test case 2 for :func:`original.id_81.is_happy`.
        """
        assert is_happy('aa') == False
		
    def test_is_happy_3(self):
        """
        Test case 3 for :func:`original.id_81.is_happy`.
        """
        assert is_happy('abcd') == True
		
    def test_is_happy_4(self):
        """
        Test case 4 for :func:`original.id_81.is_happy`.
        """
        assert is_happy('aabb') == False
		
    def test_is_happy_5(self):
        """
        Test case 5 for :func:`original.id_81