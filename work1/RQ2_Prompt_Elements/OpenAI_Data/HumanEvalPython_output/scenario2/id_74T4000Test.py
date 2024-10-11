# id_74_Test.java
from scenario2.id_74 import total_match

import pytest

class id_74_Test:
    """
    Test class of id_74.py.
    It contains ten unit test cases for the :func:`scenario2.id_74.total_match`.
    """


    def test_total_match_1(self):
        """
        Test case 1 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def'], ['ghi', 'jkl']) == ['abc', 'def']
    
    def test_total_match_2(self):
        """
        Test case 2 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def'], ['ghi', 'jkl', 'mno']) == ['ghi', 'jkl', 'mno']
    
    def test_total_match_3(self):
        """
        Test case 3 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi'], ['jkl', 'mno']) == ['jkl', 'mno']
    
    def test_total_match_4(self):
        """
        Test case 4 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi'], ['jkl', 'mno', 'pqr']) == ['jkl', 'mno', 'pqr']
    
    def test_total_match_5(self):
        """
        Test case 5 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi', 'jkl'], ['mno', 'pqr']) == ['mno', 'pqr']
    
    def test_total_match_6(self):
        """
        Test case 6 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi', 'jkl'], ['mno', 'pqr', 'stu']) == ['mno', 'pqr', 'stu']
    
    def test_total_match_7(self):
        """
        Test case 7 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi', 'jkl', 'mno'], ['pqr', 'stu']) == ['pqr', 'stu']
    
    def test_total_match_8(self):
        """
        Test case 8 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi', 'jkl', 'mno'], ['pqr', 'stu', 'vwx']) == ['pqr', 'stu', 'vwx']
    
    def test_total_match_9(self):
        """
        Test case 9 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi', 'jkl', 'mno', 'pqr'], ['stu', 'vwx']) == ['stu', 'vwx']
    
    def test_total_match_10(self):
        """
        Test case 10 for :func:`scenario2.id_74.total_match`.
        """
        assert total_match(['abc', 'def', 'ghi', 'jkl', 'mno', 'pqr'], ['stu', 'vwx', 'yz']) == ['stu', 'vwx', 'yz']