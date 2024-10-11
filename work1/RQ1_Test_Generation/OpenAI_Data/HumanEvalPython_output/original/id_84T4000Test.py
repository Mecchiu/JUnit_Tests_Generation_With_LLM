# id_84_Test.java
from original.id_84 import solve

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains ten unit test cases for the :func:`original.id_84.solve`.
    """


    def test_id_84_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_84_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_84_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_84_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_84_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_84_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_84_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_84_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_84_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_84_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_84_Test.py
from original.id_84 import solve

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains ten unit test cases for the :func:`original.id_84.solve`.
    """
		
    def test_id_84_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_84_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_84_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_84_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_84_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_84_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_84_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_84_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_84_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_84_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_85.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    Example
        For N = 1000, the sum of digits will be 1 the output should be "1".
        For N = 150, the sum of digits will be 6 the output should be "110".
        For N = 147, the sum of digits will be 12 the output should be "1100".
    
    Variables:
        @N integer
             Constraints: 0 ≤ N ≤ 10000.
    Output:
         a string of binary number
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_85_Test.java
from original.id_85 import solve

import pytest

class id_85_Test:
    """
    Test class of id_85.py.
    It contains ten unit test cases for the :func:`original.id_85.solve`.
    """
		
    def test_id_85_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_85_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_85_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_85_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_85_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_85_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_85_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_85_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_85_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_85_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_85_Test.py
from original.id_85 import solve

import pytest

class id_85_Test:
    """
    Test class of id_85.py.
    It contains ten unit test cases for the :func:`original.id_85.solve`.
    """
		
    def test_id_85_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_85_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_85_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_85_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_85_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_85_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_85_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_85_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_85_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_85_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_86.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    Example
        For N = 1000, the sum of digits will be 1 the output should be "1".
        For N = 150, the sum of digits will be 6 the output should be "110".
        For N = 147, the sum of digits will be 12 the output should be "1100".
    
    Variables:
        @N integer
             Constraints: 0 ≤ N ≤ 10000.
    Output:
         a string of binary number
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_86_Test.java
from original.id_86 import solve

import pytest

class id_86_Test:
    """
    Test class of id_86.py.
    It contains ten unit test cases for the :func:`original.id_86.solve`.
    """
		
    def test_id_86_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_86_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_86_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_86_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_86_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_86_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_86_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_86_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_86_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_86_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_86_Test.py
from original.id_86 import solve

import pytest

class id_86_Test:
    """
    Test class of id_86.py.
    It contains ten unit test cases for the :func:`original.id_86.solve`.
    """
		
    def test_id_86_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_86_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_86_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_86_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_86_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_86_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_86_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_86_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_86_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_86_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_87.py

def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    Example
        For N = 1000, the sum of digits will be 1 the output should be "1".
        For N = 150, the sum of digits will be 6 the output should be "110".
        For N = 147, the sum of digits will be 12 the output should be "1100".
    
    Variables:
        @N integer
             Constraints: 0 ≤ N ≤ 10000.
    Output:
         a string of binary number
    """

    return bin(sum(int(i) for i in str(N)))[2:]

# id_87_Test.java
from original.id_87 import solve

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`original.id_87.solve`.
    """
		
    def test_id_87_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_87_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_87_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_87_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_87_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_87_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_87_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_87_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_87_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110"
    
    def test_id_87_10(self):
        """
        Test case 10.
        """
        assert solve(7) == "111"

# id_87_Test.py
from original.id_87 import solve

import pytest

class id_87_Test:
    """
    Test class of id_87.py.
    It contains ten unit test cases for the :func:`original.id_87.solve`.
    """
		
    def test_id_87_1(self):
        """
        Test case 1.
        """
        assert solve(1000) == "1"
    
    def test_id_87_2(self):
        """
        Test case 2.
        """
        assert solve(150) == "110"
    
    def test_id_87_3(self):
        """
        Test case 3.
        """
        assert solve(147) == "1100"
    
    def test_id_87_4(self):
        """
        Test case 4.
        """
        assert solve(1) == "1"
    
    def test_id_87_5(self):
        """
        Test case 5.
        """
        assert solve(2) == "10"
    
    def test_id_87_6(self):
        """
        Test case 6.
        """
        assert solve(3) == "11"
    
    def test_id_87_7(self):
        """
        Test case 7.
        """
        assert solve(4) == "100"
    
    def test_id_87_8(self):
        """
        Test case 8.
        """
        assert solve(5) == "101"
    
    def test_id_87_9(self):
        """
        Test case 9.
        """
        assert solve(6) == "110