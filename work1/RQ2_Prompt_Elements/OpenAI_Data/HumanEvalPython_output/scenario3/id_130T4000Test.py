# id_130_Test.java
from scenario3.id_130 import tri

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario3.id_130.tri`.
    """


    def test_tri_1(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(3) == [1, 3, 2, 8]
		
    def test_tri_2(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(4) == [1, 3, 2, 8, 3]
		
    def test_tri_3(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(5) == [1, 3, 2, 8, 3, 11]
		
    def test_tri_4(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(6) == [1, 3, 2, 8, 3, 11, 5]
		
    def test_tri_5(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(7) == [1, 3, 2, 8, 3, 11, 5, 16]
		
    def test_tri_6(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(8) == [1, 3, 2, 8, 3, 11, 5, 16, 8]
		
    def test_tri_7(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(9) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19]
		
    def test_tri_8(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(10) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11]
		
    def test_tri_9(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(11) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24]
		
    def test_tri_10(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(12) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24, 13]
		
# id_130_Test.py
from scenario3.id_130 import tri

import pytest

class id_130_Test:
    """
    Test class of id_130.py.
    It contains ten unit test cases for the :func:`scenario3.id_130.tri`.
    """
		
    def test_tri_1(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(3) == [1, 3, 2, 8]
		
    def test_tri_2(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(4) == [1, 3, 2, 8, 3]
		
    def test_tri_3(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(5) == [1, 3, 2, 8, 3, 11]
		
    def test_tri_4(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(6) == [1, 3, 2, 8, 3, 11, 5]
		
    def test_tri_5(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(7) == [1, 3, 2, 8, 3, 11, 5, 16]
		
    def test_tri_6(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(8) == [1, 3, 2, 8, 3, 11, 5, 16, 8]
		
    def test_tri_7(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(9) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19]
		
    def test_tri_8(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(10) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11]
		
    def test_tri_9(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(11) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24]
		
    def test_tri_10(self):
        """
        Test case for the :func:`scenario3.id_130.tri`.
        """
        assert tri(12) == [1, 3, 2, 8, 3, 11, 5, 16, 8, 19, 11, 24, 13]
		
# id_131.py

def is_prime(n):
    """
    A prime number is a natural number greater than 1 that has no positive divisors 
    other than 1 and itself. Given a number, n, determine and print whether it's 
    Prime or Not prime.
    Note: If possible, try to come up with a O(sqrt(n)) primality algorithm, or see 
    what sort of optimizations you come up with for an O(n) algorithm. Be sure to 
    check out the Editorial after submitting your code!
    Input Format
    The first line contains an integer, T, the number of test cases.
    Each of the T subsequent lines contains an integer, n, to be tested for primality.
    Constraints
    1 <= T <= 30
    1 <= n <= 2 x 10^9
    Output Format
    For each test case, print whether n is Prime or Not prime on a new line.
    Sample Input
    3
    12
    5
    7
    Sample Output
    Not prime
    Prime
    Prime
    Explanation
    Test Case 0: n = 12.
    12 is divisible by numbers other than 1 and itself (i.e.: 2, 3, 6), so we print 
    Not prime on a new line.
    Test Case 1: n = 5.
    5 is only divisible 1 and itself, so we print Prime on a new line.
    Test Case 2: n = 7.
    7 is only divisible 1 and itself, so we print Prime on a new line.
    """

    pass
# id_131_Test.java
from scenario3.id_131 import is_prime

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario3.id_131.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(12) == "Not prime"
		
    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(5) == "Prime"
		
    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(7) == "Prime"
		
    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(2) == "Prime"
		
    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(3) == "Prime"
		
    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(4) == "Not prime"
		
    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(6) == "Not prime"
		
    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(8) == "Not prime"
		
    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(9) == "Not prime"
		
    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(10) == "Not prime"
		
# id_131_Test.py
from scenario3.id_131 import is_prime

import pytest

class id_131_Test:
    """
    Test class of id_131.py.
    It contains ten unit test cases for the :func:`scenario3.id_131.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(12) == "Not prime"
		
    def test_is_prime_2(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(5) == "Prime"
		
    def test_is_prime_3(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(7) == "Prime"
		
    def test_is_prime_4(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(2) == "Prime"
		
    def test_is_prime_5(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(3) == "Prime"
		
    def test_is_prime_6(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(4) == "Not prime"
		
    def test_is_prime_7(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(6) == "Not prime"
		
    def test_is_prime_8(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(8) == "Not prime"
		
    def test_is_prime_9(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(9) == "Not prime"
		
    def test_is_prime_10(self):
        """
        Test case for the :func:`scenario3.id_131.is_prime`.
        """
        assert is_prime(10) == "Not prime"
		
# id_132.py

def is_palindrome(s):
    """
    Given a string, s, of lowercase letters, determine the index of the character 
    whose removal will make s a palindrome. If s is already a palindrome or no such 
    character exists, then print -1. There will always be a valid solution, and any 
    correct answer is acceptable. For example, if s = "bcbc", we can either remove 
    'b' at index 0 or 'c' at index 3.
    Input Format
    The first line contains an integer, q, denoting the number of queries.
    Each line i of the q subsequent lines (where 0 <= i < q) defines a query, s, 
    to be tested.
    Constraints
    1 <= q <= 20
    1 <= |s| <= 10^4
    Each character in s is an English lowercase letter.
    Output Format
    Print an integer denoting the zero-indexed position of the character that makes 
    s not a palindrome; if s is already a palindrome or no such character exists, 
    print -1.
    Sample Input
    3
    aaab
    baa
    aaa
    Sample Output
    3
    0
    -1
    Explanation
    Query 1: "aaab"
    Removing 'b' at index 3 results in a palindrome, so we print 3 on a new line.
    Query 2: "baa"
    Removing 'b' at index 0 results in a palindrome, so we print 0 on a new line.
    Query 3: "aaa"
    This string is already a palindrome, so we print -1; however, 0, 1, and 2 are 
    also all acceptable answers, as the string will still be a palindrome if any 
    one of the characters at those indices are removed.
    """

    pass
# id_132_Test.java
from scenario3.id_132 import is_palindrome

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario3.id_132.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case for the :func:`scenario3.id_132.is_palindrome`.
        """
        assert is_palindrome("aaab") == 3
		
    def test_is_palindrome_2(self):
        """
        Test case for the :func:`scenario3.id_132.is_palindrome`.
        """
        assert is_palindrome("baa") == 0
		
    def test_is_palindrome_3(self):
        """
        Test case for the :func:`scenario3.id_132.is_palindrome`.
        """
        assert is_palindrome("aaa") == -1
		
    def test_is_palindrome_4(self):
        """
        Test case for the :func:`scenario3.id_132.is_palindrome`.
        """
        assert is_palindrome("abc") == -1
		
    def test_is_palindrome_5(self):
        """
        Test case for the :func:`scenario3.id_132.is_palindrome`.
        """
        assert is_palindrome("abca") == 0
		
    def test_is_palindrome_6(self):
        """
        Test case for the :func:`scenario3.id_132.is_palindrome`.
        """
        assert is_palindrome("abcba") == -1
		
    def test_is_palindrome_7(self):
        """
        Test