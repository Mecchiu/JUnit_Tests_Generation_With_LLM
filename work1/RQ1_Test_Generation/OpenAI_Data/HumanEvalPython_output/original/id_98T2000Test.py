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
		
# id_99.py

def count_upper(s):
    """
    Given a string s, count the number of uppercase vowels in even indices.
    
    For example:
    count_upper('aBCdEf') returns 1
    count_upper('abcdefg') returns 0
    count_upper('dBBE') returns 0
    """

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
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
        assert count_upper('aBCdEf') == 1
		
    def test_count_upper_2(self):
        """
        Test case 2 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('abcdefg') == 0
		
    def test_count_upper_3(self):
        """
        Test case 3 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('dBBE') == 0
		
    def test_count_upper_4(self):
        """
        Test case 4 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('a') == 0
		
    def test_count_upper_5(self):
        """
        Test case 5 for :func:`original.id_99.count_upper`.
        """
        assert count_upper('A') == 1
		
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
    It contains ten unit test cases for the :