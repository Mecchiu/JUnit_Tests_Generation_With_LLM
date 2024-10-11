# id_119_Test.java
from scenario2.id_119 import match_parens

import pytest

class id_119_Test:
    """
    Test class of id_119.py.
    It contains ten unit test cases for the :func:`scenario2.id_119.match_parens`.
    """


    def test_match_parens_1(self):
        """
        Test case 1 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(())', '()']) == 'Yes'

    def test_match_parens_2(self):
        """
        Test case 2 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(())', '))']) == 'No'

    def test_match_parens_3(self):
        """
        Test case 3 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '))']) == 'No'

    def test_match_parens_4(self):
        """
        Test case 4 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '()']) == 'Yes'

    def test_match_parens_5(self):
        """
        Test case 5 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', ')(']) == 'No'

    def test_match_parens_6(self):
        """
        Test case 6 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '()(']) == 'No'

    def test_match_parens_7(self):
        """
        Test case 7 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()']) == 'Yes'

    def test_match_parens_8(self):
        """
        Test case 8 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '())(']) == 'No'

    def test_match_parens_9(self):
        """
        Test case 9 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()(']) == 'No'

    def test_match_parens_10(self):
        """
        Test case 10 for :func:`scenario2.id_119.match_parens`.
        """
        assert match_parens(['(()', '()()()']) == 'Yes'