# id_111_Test.java
from scenario3.id_111 import histogram

import pytest

class id_111_Test:
    """
    Test class of id_111.py.
    It contains ten unit test cases for the :func:`scenario3.id_111.histogram`.
    """


    def test_histogram_1(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}

    def test_histogram_2(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b b a') == {'a': 2, 'b': 2}

    def test_histogram_3(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b') == {'a': 2, 'b': 2}

    def test_histogram_4(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('b b b b a') == {'b': 4}

    def test_histogram_5(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('') == {}

    def test_histogram_6(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c') == {'a': 2, 'b': 2, 'c': 2}

    def test_histogram_7(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a') == {'a': 3, 'b': 2, 'c': 2}

    def test_histogram_8(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a b') == {'a': 3, 'b': 3, 'c': 2}

    def test_histogram_9(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a b c') == {'a': 3, 'b': 3, 'c': 3}

    def test_histogram_10(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a b c a') == {'a': 4, 'b': 3, 'c': 3}

# id_111_Test.py
from scenario3.id_111 import histogram

import pytest

class id_111_Test:
    """
    Test class of id_111.py.
    It contains ten unit test cases for the :func:`scenario3.id_111.histogram`.
    """
		
    def test_histogram_1(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}

    def test_histogram_2(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b b a') == {'a': 2, 'b': 2}

    def test_histogram_3(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b') == {'a': 2, 'b': 2}

    def test_histogram_4(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('b b b b a') == {'b': 4}

    def test_histogram_5(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('') == {}

    def test_histogram_6(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c') == {'a': 2, 'b': 2, 'c': 2}

    def test_histogram_7(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a') == {'a': 3, 'b': 2, 'c': 2}

    def test_histogram_8(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a b') == {'a': 3, 'b': 3, 'c': 2}

    def test_histogram_9(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a b c') == {'a': 3, 'b': 3, 'c': 3}

    def test_histogram_10(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a b c a') == {'a': 4, 'b': 3, 'c': 3}

# id_111_Test.java
from scenario3.id_111 import histogram

import pytest

class id_111_Test:
    """
    Test class of id_111.py.
    It contains ten unit test cases for the :func:`scenario3.id_111.histogram`.
    """
		
    def test_histogram_1(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}

    def test_histogram_2(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b b a') == {'a': 2, 'b': 2}

    def test_histogram_3(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b') == {'a': 2, 'b': 2}

    def test_histogram_4(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('b b b b a') == {'b': 4}

    def test_histogram_5(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('') == {}

    def test_histogram_6(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c') == {'a': 2, 'b': 2, 'c': 2}

    def test_histogram_7(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
        assert histogram('a b c a b c a') == {'a': 3, 'b': 2, 'c': 2}

    def test_histogram_8(self):
        """
        Test case for the :func:`scenario3.id_111.histogram` function.
        """
       