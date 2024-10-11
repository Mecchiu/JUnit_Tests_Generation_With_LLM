# id_137_Test.java
from scenario1.id_137 import compare_one

import pytest

class id_137_Test:
    """
    Test class of id_137.py.
    It contains ten unit test cases for the :func:`scenario1.id_137.compare_one`.
    """


    def test_compare_one_1(self):
        """
        Test case for the :func:`scenario1.id_137.compare_one`.
        """
        assert compare_one(1, 2) == 2
        assert compare_one(2, 1) == 2
        assert compare_one(1, 1) == None
        assert compare_one(1.0, 2.0) == 2.0
        assert compare_one(2.0, 1.0) == 2.0
        assert compare_one(1.0, 1.0) == None
        assert compare_one('1', '2') == '2'
        assert compare_one('2', '1') == '2'
        assert compare_one('1', '1') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2.0') == '2.0'
        assert compare_one('2.0', '1,0') == '2.0'
        assert compare_one('1,0', '1.0') == None
        assert compare_one('1.0', '2,0') == '2,0'
        assert compare_one('2,0', '1.0') == '2,0'
        assert compare_one('1.0', '1,0') == None
        assert compare_one('1,0', '2') == '2'
        assert compare_one('2', '1,0') == '2'
        assert compare_one('1,0', '1') == None
        assert compare_one('1', '2,0') == '2,0'
        assert compare_one('2,0', '1') == '2,0'
        assert compare_one('1', '1,0') == None
        assert compare_one('1.0', '2') == '2'
        assert compare_one('2', '1.0') == '2'
        assert compare_one('1.0', '1') == None
        assert compare_one('1', '2.0') == '2.0'
        assert compare_one('2.0', '1') == '2.0'
        assert compare_one('1', '1.0') == None
        assert compare_one('1.0', '2,0') == '2,0'
        assert compare_one('2,0', '1.0') == '2,0'
        assert compare_one('1.0', '1,0') == None
        assert compare_one('1,0', '2.0') == '2.0'
        assert compare_one('2.0', '1,0') == '2.0'
        assert compare_one('1,0', '1.0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('1,0', '1,0') == None
        assert compare_one('1.0', '2.0') == '2.0'
        assert compare_one('2.0', '1.0') == '2.0'
        assert compare_one('1.0', '1.0') == None
        assert compare_one('1,0', '2,0') == '2,0'
        assert compare_one('2,0', '1,0') == '2,0'
        assert compare_one('