# id_98_Test.java
from original.id_98 import count_upper

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`original.id_98.count_upper`.
    """


    def test_count_upper_1(self):
        """
        Test case 1 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aBCdEf') == 1
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('abcdefg') == 0
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('a') == 0
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('A') == 1
		
    def test_count_upper_6(self):
        """
        Test case 6 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aA') == 1
		
    def test_count_upper_7(self):
        """
        Test case 7 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAa') == 1
		
    def test_count_upper_8(self):
        """
        Test case 8 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAaA') == 2
		
    def test_count_upper_9(self):
        """
        Test case 9 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAaAa') == 2
		
    def test_count_upper_10(self):
        """
        Test case 10 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAaAaA') == 3
		
# id_98_Test.py
from original.id_98 import count_upper

import pytest

class id_98_Test:
    """
    Test class of id_98.py.
    It contains ten unit test cases for the :func:`original.id_98.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aBCdEf') == 1
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('abcdefg') == 0
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('a') == 0
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('A') == 1
		
    def test_count_upper_6(self):
        """
        Test case 6 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aA') == 1
		
    def test_count_upper_7(self):
        """
        Test case 7 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAa') == 1
		
    def test_count_upper_8(self):
        """
        Test case 8 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAaA') == 2
		
    def test_count_upper_9(self):
        """
        Test case 9 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAaAa') == 2
		
    def test_count_upper_10(self):
        """
        Test case 10 for :func:`original.id_98.count_upper`.
        """
        assert count_upper('aAaAaA') == 3
		
# id_99.java

/**
 * Given a string s, return the number of vowels in even indices.
 * 
 * For example:
 * count_upper('aBCdEf') returns 2
 * count_upper('abcdefg') returns 2
 * count_upper('dBBE') returns 0
 */
public class id_99 {
    public static int count_upper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}

# id_99.py

def count_upper(s):
    """
    Given a string s, return the number of vowels in even indices.
    
    For example:
    count_upper('aBCdEf') returns 2
    count_upper('abcdefg') returns 2
    count_upper('dBBE') returns 0
    """

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "aeiou":
            count += 1
    return count

# id_99_Test.java
from original.id_99 import count_upper

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`original.id_99.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aBCdEf') == 2
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('abcdefg') == 2
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('a') == 1
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('A') == 0
		
    def test_count_upper_6(self):
        """
        Test case 6 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aA') == 1
		
    def test_count_upper_7(self):
        """
        Test case 7 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAa') == 1
		
    def test_count_upper_8(self):
        """
        Test case 8 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAaA') == 2
		
    def test_count_upper_9(self):
        """
        Test case 9 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAaAa') == 2
		
    def test_count_upper_10(self):
        """
        Test case 10 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAaAaA') == 3
		
# id_99_Test.py
from original.id_99 import count_upper

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`original.id_99.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aBCdEf') == 2
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('abcdefg') == 2
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('a') == 1
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('A') == 0
		
    def test_count_upper_6(self):
        """
        Test case 6 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aA') == 1
		
    def test_count_upper_7(self):
        """
        Test case 7 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAa') == 1
		
    def test_count_upper_8(self):
        """
        Test case 8 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAaA') == 2
		
    def test_count_upper_9(self):
        """
        Test case 9 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAaAa') == 2
		
    def test_count_upper_10(self):
        """
        Test case 10 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('aAaAaA') == 3
		
# id_100.java

/**
 * Given a string s, return the number of consonants in even indices.
 * 
 * For example:
 * count_upper('aBCdEf') returns 2
 * count_upper('abcdefg') returns 2
 * count_upper('dBBE') returns 0
 */
public class id_100 {
    public static int count_upper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                count++;
            }
        }
        return count;
    }
}

# id_100.py

def count_upper(s):
    """
    Given a string s, return the number of consonants in even indices.
    
    For example:
    count_upper('aBCdEf') returns 2
    count_upper('abcdefg') returns 2
    count_upper('dBBE') returns 0
    """

    count = 0
    for i in range(0,len(s),2):
        if s[i] not in "aeiou":
            count += 1
    return count

# id_100_Test.java
from original.id_100 import count_upper

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`original.id_100.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aBCdEf') == 2
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('abcdefg') == 2
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('a') == 0
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('A') == 1
		
    def test_count_upper_6(self):
        """
        Test case 6 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aA') == 1
		
    def test_count_upper_7(self):
        """
        Test case 7 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aAa') == 1
		
    def test_count_upper_8(self):
        """
        Test case 8 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aAaA') == 2
		
    def test_count_upper_9(self):
        """
        Test case 9 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aAaAa') == 2
		
    def test_count_upper_10(self):
        """
        Test case 10 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aAaAaA') == 3
		
# id_100_Test.py
from original.id_100 import count_upper

import pytest

class id_100_Test:
    """
    Test class of id_100.py.
    It contains ten unit test cases for the :func:`original.id_100.count_upper`.
    """
		
    def test_count_upper_1(self):
        """
        Test case 1 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('aBCdEf') == 2
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('abcdefg') == 2
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_100.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test