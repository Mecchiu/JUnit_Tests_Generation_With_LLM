# id_106_Test.java
from scenario2.id_106 import f

import pytest

class id_106_Test:
    """
    Test class of id_106.py.
    It contains ten unit test cases for the :func:`scenario2.id_106.f`.
    """


    def test_f_1(self):
        """
        Test case for the function f.
        """
        assert f(1) == [1]
		
    def test_f_2(self):
        """
        Test case for the function f.
        """
        assert f(2) == [2, 1]
		
    def test_f_3(self):
        """
        Test case for the function f.
        """
        assert f(3) == [6, 1, 2]
		
    def test_f_4(self):
        """
        Test case for the function f.
        """
        assert f(4) == [24, 1, 2, 3]
		
    def test_f_5(self):
        """
        Test case for the function f.
        """
        assert f(5) == [120, 1, 2, 3, 4]
		
    def test_f_6(self):
        """
        Test case for the function f.
        """
        assert f(6) == [720, 1, 2, 3, 4, 5]
		
    def test_f_7(self):
        """
        Test case for the function f.
        """
        assert f(7) == [5040, 1, 2, 3, 4, 5, 6]
		
    def test_f_8(self):
        """
        Test case for the function f.
        """
        assert f(8) == [40320, 1, 2, 3, 4, 5, 6, 7]
		
    def test_f_9(self):
        """
        Test case for the function f.
        """
        assert f(9) == [362880, 1, 2, 3, 4, 5, 6, 7, 8]
		
    def test_f_10(self):
        """
        Test case for the function f.
        """
        assert f(10) == [3628800, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
# id_107.py

def g(n):
    """ Implement the function g that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 0.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    
    
    """

    ret = []
    for i in range(0,n):
        if i%2 == 0:
            x = 1
            for j in range(1,i+1): x *= j
            ret += [x]
        else:
            x = 0
            for j in range(1,i+1): x += j
            ret += [x]
    return ret

# id_107_Test.java
from scenario2.id_107 import g

import pytest

class id_107_Test:
    """
    Test class of id_107.py.
    It contains ten unit test cases for the :func:`scenario2.id_107.g`.
    """
		
    def test_g_1(self):
        """
        Test case for the function g.
        """
        assert g(1) == [1]
		
    def test_g_2(self):
        """
        Test case for the function g.
        """
        assert g(2) == [1, 1]
		
    def test_g_3(self):
        """
        Test case for the function g.
        """
        assert g(3) == [1, 1, 2]
		
    def test_g_4(self):
        """
        Test case for the function g.
        """
        assert g(4) == [1, 1, 2, 3]
		
    def test_g_5(self):
        """
        Test case for the function g.
        """
        assert g(5) == [1, 1, 2, 3, 4]
		
    def test_g_6(self):
        """
        Test case for the function g.
        """
        assert g(6) == [1, 1, 2, 3, 4, 5]
		
    def test_g_7(self):
        """
        Test case for the function g.
        """
        assert g(7) == [1, 1, 2, 3, 4, 5, 6]
		
    def test_g_8(self):
        """
        Test case for the function g.
        """
        assert g(8) == [1, 1, 2, 3, 4, 5, 6, 7]
		
    def test_g_9(self):
        """
        Test case for the function g.
        """
        assert g(9) == [1, 1, 2, 3, 4, 5, 6, 7, 8]
		
    def test_g_10(self):
        """
        Test case for the function g.
        """
        assert g(10) == [1, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
# id_108.py

def h(n):
    """ Implement the function h that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 0.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    
    
    """

    ret = []
    for i in range(0,n):
        if i%2 == 0:
            x = 1
            for j in range(1,i+1): x *= j
            ret += [x]
        else:
            x = 0
            for j in range(1,i+1): x += j
            ret += [x]
    return ret

# id_108_Test.java
from scenario2.id_108 import h

import pytest

class id_108_Test:
    """
    Test class of id_108.py.
    It contains ten unit test cases for the :func:`scenario2.id_108.h`.
    """
		
    def test_h_1(self):
        """
        Test case for the function h.
        """
        assert h(1) == [1]
		
    def test_h_2(self):
        """
        Test case for the function h.
        """
        assert h(2) == [1, 1]
		
    def test_h_3(self):
        """
        Test case for the function h.
        """
        assert h(3) == [1, 1, 2]
		
    def test_h_4(self):
        """
        Test case for the function h.
        """
        assert h(4) == [1, 1, 2, 3]
		
    def test_h_5(self):
        """
        Test case for the function h.
        """
        assert h(5) == [1, 1, 2, 3, 4]
		
    def test_h_6(self):
        """
        Test case for the function h.
        """
        assert h(6) == [1, 1, 2, 3, 4, 5]
		
    def test_h_7(self):
        """
        Test case for the function h.
        """
        assert h(7) == [1, 1, 2, 3, 4, 5, 6]
		
    def test_h_8(self):
        """
        Test case for the function h.
        """
        assert h(8) == [1, 1, 2, 3, 4, 5, 6, 7]
		
    def test_h_9(self):
        """
        Test case for the function h.
        """
        assert h(9) == [1, 1, 2, 3, 4, 5, 6, 7, 8]
		
    def test_h_10(self):
        """
        Test case for the function h.
        """
        assert h(10) == [1, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
# id_109.py

def i(n):
    """ Implement the function i that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 0.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    
    
    """

    ret = []
    for i in range(0,n):
        if i%2 == 0:
            x = 1
            for j in range(1,i+1): x *= j
            ret += [x]
        else:
            x = 0
            for j in range(1,i+1): x += j
            ret += [x]
    return ret

# id_109_Test.java
from scenario2.id_109 import i

import pytest

class id_109_Test:
    """
    Test class of id_109.py.
    It contains ten unit test cases for the :func:`scenario2.id_109.i`.
    """
		
    def test_i_1(self):
        """
        Test case for the function i.
        """
        assert i(1) == [1]
		
    def test_i_2(self):
        """
        Test case for the function i.
        """
        assert i(2) == [1, 1]
		
    def test_i_3(self):
        """
        Test case for the function i.
        """
        assert i(3) == [1, 1, 2]
		
    def test_i_4(self):
        """
        Test case for the function i.
        """
        assert i(4) == [1, 1, 2, 3]
		
    def test_i_5(self):
        """
        Test case for the function i.
        """
        assert i(5) == [1, 1, 2, 3, 4]
		
    def test_i_6(self):
        """
        Test case for the function i.
        """
        assert i(6) == [1, 1, 2, 3, 4, 5]
		
    def test_i_7(self):
        """
        Test case for the function i.
        """
        assert i(7) == [1, 1, 2, 3, 4, 5, 6]
		
    def test_i_8(self):
        """
        Test case for the function i.
        """
        assert i(8) == [1, 1, 2, 3, 4, 5, 6, 7]
		
    def test_i_9(self):
        """
        Test case for the function i.
        """
        assert i(9) == [1, 1, 2, 3, 4, 5, 6, 7, 8]
		
    def test_i_10(self):
        """
        Test case for the function i.
        """
        assert i(10) == [1, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
# id_110.py

def j(n):
    """ Implement the function j that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 0.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    
    
    """

    ret = []
    for i in range(0,n):
        if i%2 == 0:
            x = 1
            for j in range(1,i+1): x *= j
            ret += [x]
        else:
            x = 0
            for j in range(1,i+1): x += j
            ret += [x]
    return ret

# id_110_Test.java
from scenario2.id_110 import j

import pytest

class id_110_Test:
    """
    Test class of id_110.py.
    It contains ten unit test cases for the :func:`scenario2.id_110.j`.
    """
		
    def test_j_1(self):
        """
        Test case for the function j.
        """
        assert j(1) == [1]
		
    def test_j_2(self):
        """
        Test case for the function j.
        """
        assert j(2) == [1, 1]
		
    def test_j_3(self):
        """
        Test case for the function j.
        """
        assert j(3) == [1, 1, 2]
		
    def test_j_4(self):
        """
        Test case for the function j.
        """
        assert j(4) == [1, 1, 2, 3]
		
    def test_j_5(self):
        """
        Test case for the function j.
        """
        assert j(5) == [1, 1, 2, 3, 4]
		
    def test_j_6(self):
        """
        Test case for the function j.
        """
        assert j(6) == [1, 1, 2, 3, 4, 5]
		
    def test_j_7(self):
        """
        Test case for the function j.
        """
        assert j(7) == [1, 1, 2, 3, 4, 5, 6]
		
    def test_j_8(self):
        """
        Test case for the function j.
        """
        assert j(8) == [1, 1, 2, 3, 4, 5, 6, 7]
		
    def test_j_9(self):
        """
        Test case for the function j.
        """
        assert j(9) == [1, 1, 2, 3, 4, 5, 6, 7, 8]
		
    def test_j_10(self):
        """
        Test case for the function j.
        """
        assert j(10) == [1, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
# id_111.py

def k(n):
    """ Implement the function k that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 0.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    
    
    """

    ret = []
    for i in range(0,n):
        if i%2 == 0:
            x = 1
            for j in range(1,i+1): x *= j
            ret += [x]
        else:
            x = 0
            for j in range(1,i+1): x += j
            ret += [x]
    return ret

# id_111_Test.java
from scenario2.id_111 import k

import pytest

class id_111_Test:
    """
    Test class of id_111.py.
    It contains ten unit test cases for the :func:`scenario2.id_111.k`.
    """
		
    def test_k_1(self):
        """
        Test case for the function k.
        """
        assert k(1) == [1]
		
    def test_k_2(self):
        """
        Test case for the function k.
        """
        assert k(2) == [1, 1]
		
    def test_k_3(self):
        """
        Test case for the function k.
        """
        assert k(3) == [1, 1, 2]
		
    def test_k_4(self):
        """
        Test case for the function k.