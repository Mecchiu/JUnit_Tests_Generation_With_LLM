# id_89_Test.java
from scenario2.id_89 import encrypt

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario2.id_89.encrypt`.
    """


    def test_encrypt_1(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('abc') == 'def'
		
    def test_encrypt_2(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('xyz') == 'bcd'
		
    def test_encrypt_3(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello') == 'jgnnq'
		
    def test_encrypt_4(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world') == 'jgnnq yqtnf'
		
    def test_encrypt_5(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_6(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_7(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_8(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_9(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_10(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
		
# id_89_Test.py
from scenario2.id_89 import encrypt

import pytest

class id_89_Test:
    """
    Test class of id_89.py.
    It contains ten unit test cases for the :func:`scenario2.id_89.encrypt`.
    """
		
    def test_encrypt_1(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('abc') == 'def'
		
    def test_encrypt_2(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('xyz') == 'bcd'
		
    def test_encrypt_3(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello') == 'jgnnq'
		
    def test_encrypt_4(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world') == 'jgnnq yqtnf'
		
    def test_encrypt_5(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_6(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_7(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_8(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_9(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_10(self):
        """
        Test case for the :func:`scenario2.id_89.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
		
# id_90.py

def encrypt(s):
    """Create a function encrypt that takes a string as an argument and
    returns a string encrypted with the alphabet being rotated. 
    The alphabet should be rotated in a manner such that the letters 
    shift down by two multiplied to two places.
    
    
    """

    d = 'abcdefghijklmnopqrstuvwxyz'
    out = ''
    for c in s:
        if c in d:
            out += d[(d.index(c)+2*2) % 26]
        else:
            out += c
    return out

# id_90_Test.java
from scenario2.id_90 import encrypt

import pytest

class id_90_Test:
    """
    Test class of id_90.py.
    It contains ten unit test cases for the :func:`scenario2.id_90.encrypt`.
    """
		
    def test_encrypt_1(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('abc') == 'def'
		
    def test_encrypt_2(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('xyz') == 'bcd'
		
    def test_encrypt_3(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('hello') == 'jgnnq'
		
    def test_encrypt_4(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('hello world') == 'jgnnq yqtnf'
		
    def test_encrypt_5(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_6(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_7(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_8(self):
        """
        Test case for the :func:`scenario2.id_90.encrypt`.
        """
        assert encrypt('hello world!') == 'jgnnq yqtnf!'
		
    def test_encrypt_9(self):
        """
        Test case for the :func