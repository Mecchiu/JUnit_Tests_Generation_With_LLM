# id_155_Test.java
from scenario1.id_155 import even_odd_count

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`scenario1.id_155.even_odd_count`.
    """


    def test_even_odd_count_1(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123) == (1, 2)
		
    def test_even_odd_count_2(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345) == (2, 3)
		
    def test_even_odd_count_3(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234) == (2, 2)
		
    def test_even_odd_count_4(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789) == (4, 5)
		
    def test_even_odd_count_5(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890) == (5, 5)
		
    def test_even_odd_count_6(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901) == (5, 6)
		
    def test_even_odd_count_7(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012) == (6, 6)
		
    def test_even_odd_count_8(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123) == (6, 7)
		
    def test_even_odd_count_9(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234) == (7, 7)
		
    def test_even_odd_count_10(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012345) == (7, 8)
		
    def test_even_odd_count_11(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123456) == (8, 8)
		
    def test_even_odd_count_12(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234567) == (8, 9)
		
    def test_even_odd_count_13(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012345678) == (9, 9)
		
    def test_even_odd_count_14(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123456789) == (9, 10)
		
    def test_even_odd_count_15(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234567890) == (10, 10)
		
    def test_even_odd_count_16(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012345678901) == (10, 11)
		
    def test_even_odd_count_17(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123456789012) == (11, 11)
		
    def test_even_odd_count_18(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234567890123) == (11, 12)
		
    def test_even_odd_count_19(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012345678901234) == (12, 12)
		
    def test_even_odd_count_20(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123456789012345) == (12, 13)
		
    def test_even_odd_count_21(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234567890123456) == (13, 13)
		
    def test_even_odd_count_22(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012345678901234567) == (13, 14)
		
    def test_even_odd_count_23(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123456789012345678) == (14, 14)
		
    def test_even_odd_count_24(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234567890123456789) == (14, 15)
		
    def test_even_odd_count_25(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(123456789012345678901234567890) == (15, 15)
		
    def test_even_odd_count_26(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(1234567890123456789012345678901) == (15, 16)
		
    def test_even_odd_count_27(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd_count`.
        """
        assert even_odd_count(12345678901234567890123456789012) == (16, 16)
		
    def test_even_odd_count_28(self):
        """
        Test case for the :func:`scenario1.id_155.even_odd