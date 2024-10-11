# id_132_Test.java
from scenario1.id_132 import is_nested

import pytest

class id_132_Test:
    """
    Test class of id_132.py.
    It contains ten unit test cases for the :func:`scenario1.id_132.is_nested`.
    """


    def test_is_nested_1(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e]") == True

    def test_is_nested_2(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e") == False

    def test_is_nested_3(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h]") == True

    def test_is_nested_4(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h") == False

    def test_is_nested_5(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h][i[j]k]") == True

    def test_is_nested_6(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h][i[j]k") == False

    def test_is_nested_7(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h][i[j]k][l[m]n]") == True

    def test_is_nested_8(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h][i[j]k][l[m]n") == False

    def test_is_nested_9(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h][i[j]k][l[m]n][o[p]q]") == True

    def test_is_nested_10(self):
        """
        Test case for the :func:`scenario1.id_132.is_nested`.
        """
        assert is_nested("[a[b[c]d]e][f[g]h][i[j]k][l[m]n][o[p]q") == False