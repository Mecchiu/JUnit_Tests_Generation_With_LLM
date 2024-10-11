# id_19_Test.java
from original.id_19 import sort_numbers

import pytest

class id_19_Test:
    """
    Test class of id_19.py.
    It contains ten unit test cases for the :func:`original.id_19.sort_numbers`.
    """


    def test_sort_numbers_1(self):
        """
        Test case 1 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five') == 'one three five'

    def test_sort_numbers_2(self):
        """
        Test case 2 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two') == 'one two three five'

    def test_sort_numbers_3(self):
        """
        Test case 3 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four') == 'one two three four five'

    def test_sort_numbers_4(self):
        """
        Test case 4 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six') == 'one two three four five six'

    def test_sort_numbers_5(self):
        """
        Test case 5 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six seven') == 'one two three four five six seven'

    def test_sort_numbers_6(self):
        """
        Test case 6 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six seven eight') == 'one two three four five six seven eight'

    def test_sort_numbers_7(self):
        """
        Test case 7 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six seven eight nine') == 'one two three four five six seven eight nine'

    def test_sort_numbers_8(self):
        """
        Test case 8 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six seven eight nine zero') == 'zero one two three four five six seven eight nine'

    def test_sort_numbers_9(self):
        """
        Test case 9 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six seven eight nine zero one') == 'zero one one two three four five six seven eight nine'

    def test_sort_numbers_10(self):
        """
        Test case 10 for :func:`original.id_19.sort_numbers`.
        """
        assert sort_numbers('three one five two four six seven eight nine zero one two') == 'zero one one two two three four five six seven eight nine'