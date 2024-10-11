# id_153_Test.java
from scenario2.id_153 import Strongest_Extension

import pytest

class id_153_Test:
    """
    Test class of id_153.py.
    It contains ten unit test cases for the :func:`scenario2.id_153.Strongest_Extension`.
    """


    def test_Strongest_Extension_1(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed']) == "Slices.SErviNGSliCes"

    def test_Strongest_Extension_2(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_3(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_4(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_5(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_6(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_7(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_8(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_9(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"

    def test_Strongest_Extension_10(self):
        """
        Test case for Strongest_Extension.
        """
        assert Strongest_Extension("Slices", ['SErviNGSliCes', 'Cheese', 'StuFfed', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices', 'Slices']) == "Slices.Slices"