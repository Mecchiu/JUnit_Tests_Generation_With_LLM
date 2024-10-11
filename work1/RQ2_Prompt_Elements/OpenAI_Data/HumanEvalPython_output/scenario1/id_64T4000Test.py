# id_64_Test.java
from scenario1.id_64 import vowels_count

import pytest

class id_64_Test:
    """
    Test class of id_64.py.
    It contains ten unit test cases for the :func:`scenario1.id_64.vowels_count`.
    """


    def test_vowels_count_1(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiou") == 5
		
    def test_vowels_count_2(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("AEIOU") == 5
		
    def test_vowels_count_3(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOU") == 10
		
    def test_vowels_count_4(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOU") == 20
		
    def test_vowels_count_5(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOU") == 30
		
    def test_vowels_count_6(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 40
		
    def test_vowels_count_7(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 50
		
    def test_vowels_count_8(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 60
		
    def test_vowels_count_9(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 70
		
    def test_vowels_count_10(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 80
		
    def test_vowels_count_11(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 90
		
    def test_vowels_count_12(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 100
		
    def test_vowels_count_13(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 110
		
    def test_vowels_count_14(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 120
		
    def test_vowels_count_15(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 130
		
    def test_vowels_count_16(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 140
		
    def test_vowels_count_17(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 150
		
    def test_vowels_count_18(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 160
		
    def test_vowels_count_19(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 170
		
    def test_vowels_count_20(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 180
		
    def test_vowels_count_21(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 190
		
    def test_vowels_count_22(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 200
		
    def test_vowels_count_23(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 210
		
    def test_vowels_count_24(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 220
		
    def test_vowels_count_25(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 230
		
    def test_vowels_count_26(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 240
		
    def test_vowels_count_27(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 250
		
    def test_vowels_count_28(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOU") == 260
		
    def test_vowels_count_29(self):
        """
        Test case for the :func:`scenario1.id_64.vowels_count`.
        """
        assert vowels_count("aeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiouAEIOUaeiou