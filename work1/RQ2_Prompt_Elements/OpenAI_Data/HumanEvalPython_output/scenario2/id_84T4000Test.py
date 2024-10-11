# id_84_Test.java
from scenario2.id_84 import solve

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains ten unit test cases for the :func:`scenario2.id_84.solve`.
    """


    def test_id_84_1(self):
        """
        Test case 1 for :func:`scenario2.id_84.solve`.
        """
        assert solve(1) == "1"

    def test_id_84_2(self):
        """
        Test case 2 for :func:`scenario2.id_84.solve`.
        """
        assert solve(2) == "10"

    def test_id_84_3(self):
        """
        Test case 3 for :func:`scenario2.id_84.solve`.
        """
        assert solve(3) == "11"

    def test_id_84_4(self):
        """
        Test case 4 for :func:`scenario2.id_84.solve`.
        """
        assert solve(4) == "100"

    def test_id_84_5(self):
        """
        Test case 5 for :func:`scenario2.id_84.solve`.
        """
        assert solve(5) == "101"

    def test_id_84_6(self):
        """
        Test case 6 for :func:`scenario2.id_84.solve`.
        """
        assert solve(6) == "110"

    def test_id_84_7(self):
        """
        Test case 7 for :func:`scenario2.id_84.solve`.
        """
        assert solve(7) == "111"

    def test_id_84_8(self):
        """
        Test case 8 for :func:`scenario2.id_84.solve`.
        """
        assert solve(8) == "1000"

    def test_id_84_9(self):
        """
        Test case 9 for :func:`scenario2.id_84.solve`.
        """
        assert solve(9) == "1001"

    def test_id_84_10(self):
        """
        Test case 10 for :func:`scenario2.id_84.solve`.
        """
        assert solve(10) == "1010"

# id_85.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_85_Test.java
from scenario2.id_85 import solve

import pytest

class id_85_Test:
    """
    Test class of id_85.py.
    It contains ten unit test cases for the :func:`scenario2.id_85.solve`.
    """
		
    def test_id_85_1(self):
        """
        Test case 1 for :func:`scenario2.id_85.solve`.
        """
        assert solve(1) == "1"

    def test_id_85_2(self):
        """
        Test case 2 for :func:`scenario2.id_85.solve`.
        """
        assert solve(2) == "10"

    def test_id_85_3(self):
        """
        Test case 3 for :func:`scenario2.id_85.solve`.
        """
        assert solve(3) == "11"

    def test_id_85_4(self):
        """
        Test case 4 for :func:`scenario2.id_85.solve`.
        """
        assert solve(4) == "100"

    def test_id_85_5(self):
        """
        Test case 5 for :func:`scenario2.id_85.solve`.
        """
        assert solve(5) == "101"

    def test_id_85_6(self):
        """
        Test case 6 for :func:`scenario2.id_85.solve`.
        """
        assert solve(6) == "110"

    def test_id_85_7(self):
        """
        Test case 7 for :func:`scenario2.id_85.solve`.
        """
        assert solve(7) == "111"

    def test_id_85_8(self):
        """
        Test case 8 for :func:`scenario2.id_85.solve`.
        """
        assert solve(8) == "1000"

    def test_id_85_9(self):
        """
        Test case 9 for :func:`scenario2.id_85.solve`.
        """
        assert solve(9) == "1001"

    def test_id_85_10(self):
        """
        Test case 10 for :func:`scenario2.id_85.solve`.
        """
        assert solve(10) == "1010"

# id_86.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_86_Test.java
from scenario2.id_86 import solve

import pytest

class id_86_Test:
    """
    Test class of id_86.py.
    It contains ten unit test cases for the :func:`scenario2.id_86.solve`.
    """
		
    def test_id_86_1(self):
        """
        Test case 1 for :func:`scenario2.id_86.solve`.
        """
        assert solve(1) == "1"

    def test_id_86_2(self):
        """
        Test case 2 for :func:`scenario2.id_86.solve`.
        """
        assert solve(2) == "10"

    def test_id_86_3(self):
        """
        Test case 3 for :func:`scenario2.id_86.solve`.
        """
        assert solve(3) == "11"

    def test_id_86_4(self):
        """
        Test case 4 for :func:`scenario2.id_86.solve`.
        """
        assert solve(4) == "100"

    def test_id_86_5(self):
        """
        Test case 5 for :func:`scenario2.id_86.solve`.
        """
        assert solve(5) == "101"

    def test_id_86_6(self):
        """
        Test case 6 for :func:`scenario2.id_86.solve`.
        """
        assert solve(6) == "110"

    def test_id_86_7(self):
        """
        Test case 7 for :func:`scenario2.id_86.solve`.
        """
        assert solve(7) == "111"

    def test_id_86_8(self):
        """
        Test case 8 for :func:`scenario2.id_86.solve`.
        """
        assert solve(8) == "1000"

    def test_id_86_9(self):
        """
        Test case 9 for :func:`scenario2.id_86.solve`.
        """
        assert solve(9) == "1001"

    def test_id_86_10(self):
        """
        Test case 10 for :func:`scenario2.id_86.solve`.
        """
        assert solve(10) == "1010"

# id_87.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_87_Test.java
from scenario2.id_87 import solve

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`scenario2.id_87.solve`.
    """
		
    def test_id_87_1(self):
        """
        Test case 1 for :func:`scenario2.id_87.solve`.
        """
        assert solve(1) == "1"

    def test_id_87_2(self):
        """
        Test case 2 for :func:`scenario2.id_87.solve`.
        """
        assert solve(2) == "10"

    def test_id_87_3(self):
        """
        Test case 3 for :func:`scenario2.id_87.solve`.
        """
        assert solve(3) == "11"

    def test_id_87_4(self):
        """
        Test case 4 for :func:`scenario2.id_87.solve`.
        """
        assert solve(4) == "100"

    def test_id_87_5(self):
        """
        Test case 5 for :func:`scenario2.id_87.solve`.
        """
        assert solve(5) == "101"

    def test_id_87_6(self):
        """
        Test case 6 for :func:`scenario2.id_87.solve`.
        """
        assert solve(6) == "110"

    def test_id_87_7(self):
        """
        Test case 7 for :func:`scenario2.id_87.solve`.
        """
        assert solve(7) == "111"

    def test_id_87_8(self):
        """
        Test case 8 for :func:`scenario2.id_87.solve`.
        """
        assert solve(8) == "1000"

    def test_id_87_9(self):
        """
        Test case 9 for :func:`scenario2.id_87.solve`.
        """
        assert solve(9) == "1001"

    def test_id_87_10(self):
        """
        Test case 10 for :func:`scenario2.id_87.solve`.
        """
        assert solve(10) == "1010"

# id_88.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_88_Test.java
from scenario2.id_88 import solve

import pytest

class id_88_Test:
    """
    Test class of id_88.py.
    It contains ten unit test cases for the :func:`scenario2.id_88.solve`.
    """
		
    def test_id_88_1(self):
        """
        Test case 1 for :func:`scenario2.id_88.solve`.
        """
        assert solve(1) == "1"

    def test_id_88_2(self):
        """
        Test case 2 for :func:`scenario2.id_88.solve`.
        """
        assert solve(2) == "10"

    def test_id_88_3(self):
        """
        Test case 3 for :func:`scenario2.id_88.solve`.
        """
        assert solve(3) == "11"

    def test_id_88_4(self):
        """
        Test case 4 for :func:`scenario2.id_88.solve`.
        """
        assert solve(4) == "100"

    def test_id_88_5(self):
        """
        Test case 5 for :func:`scenario2.id_88.solve`.
        """
        assert solve(5) == "101"

    def test_id_88_6(self):
        """
        Test case 6 for :func:`scenario2.id_88.solve`.
        """
        assert solve(6) == "110"

    def test_id_88_7(self):
        """
        Test case 7 for :func:`scenario2.id_88.solve`.
        """
        assert solve(7) == "111"

    def test_id_88_8(self):
        """
        Test case 8 for :func:`scenario2.id_88.solve`.
        """
        assert solve(8) == "1000"

    def test_id_88_9(self):
        """
        Test case 9 for :func:`scenario2.id_88.solve`.
        """
        assert solve(9) == "1001"

    def test_id_88_10(self):
        """
        Test case 10 for :func:`scenario2.id_88.solve`.
        """
        assert solve(10) == "1010"

# id_89.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_89_Test.java
from scenario2.id_89 import solve

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario2.id_89.solve`.
    """
		
    def test_id_89_1(self):
        """
        Test case 1 for :func:`scenario2.id_89.solve`.
        """
        assert solve(1) == "1"

    def test_id_89_2(self):
        """
        Test case 2 for :func:`scenario2.id_89.solve`.
        """
        assert solve(2) == "10"

    def test_id_89_3(self):
        """
        Test case 3 for :func:`scenario2.id_89.solve`.
        """
        assert solve(3) == "11"

    def test_id_89_4(self):
        """
        Test case 4 for :func:`scenario2.id_89.solve`.
        """
        assert solve(4) == "100"

    def test_id_89_5(self):
        """
        Test case 5 for :func:`scenario2.id_89.solve`.
        """
        assert solve(5) == "101"

    def test_id_89_6(self):
        """
        Test case 6 for :func:`scenario2.id_89.solve`.
        """
        assert solve(6) == "110"

    def test_id_89_7(self):
        """
        Test case 7 for :func:`scenario2.id_89.solve`.
        """
        assert solve(7) == "111"

    def test_id_89_8(self):
        """
        Test case 8 for :func:`scenario2.id_89.solve`.
        """
        assert solve(8) == "1000"

    def test_id_89_9(self):
        """
        Test case 9 for :func:`scenario2.id_89.solve`.
        """
        assert solve(9) == "1001"

    def test_id_89_10(self):
        """
        Test case 10 for :func:`scenario2.id_89.solve`.
        """
        assert solve(10) == "1010"

# id_90.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_90_Test.java
from scenario2.id_90 import solve

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario2.id_90.solve`.
    """
		
    def test_id_90_1(self):
        """
        Test case 1 for :func:`scenario2.id_90.solve`.
        """
        assert solve(1) == "1"

    def test_id_90_2(self):
        """
        Test case 2 for :func: