# id_91_Test.java
from scenario3.id_91 import is_bored

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario3.id_91.is_bored`.
    """


    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("Hello world") == 0

    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("The sky is blue. The sun is shining. I love this weather") == 1

    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored") == 1

    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am not bored") == 1

    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored") == 2

    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored") == 3

    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored") == 4

    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored. I am bored") == 5

    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored. I am bored. I am not bored") == 6

    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored. I am bored. I am not bored. I am bored") == 7

# id_91_Test.py
from scenario3.id_91 import is_bored

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario3.id_91.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("Hello world") == 0

    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("The sky is blue. The sun is shining. I love this weather") == 1

    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored") == 1

    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am not bored") == 1

    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored") == 2

    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored") == 3

    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored") == 4

    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored. I am bored") == 5

    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored. I am bored. I am not bored") == 6

    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario3.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored. I am not bored. I am bored. I am not bored. I am bored") == 7

# id_92.py

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    For example:
    >>> is_bored("Hello world")
    0
    >>> is_bored("The sky is blue. The sun is shining. I love this weather")
    1
    """

    pass
# id_92_Test.java
from scenario3.id_92 import is_bored

import pytest

class id_92_Test:
    """
    Test class of id_92.py.
    It contains ten unit test cases for the :func:`scenario3.id_92.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario3.id_92.is_bored`.
        """
        assert is_bored("Hello world") == 0

    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario3.id_92.is_bored`.
        """
        assert is_bored("The sky is blue. The sun is shining. I love this weather") == 1

    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario3.id_92.is_bored`.
        """
        assert is_bored("I am bored") == 1

    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario3.id_92.is_bored`.
        """
        assert is_bored("I am not bored") == 1

    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario3.id_92.is_bored`.
        """
        assert is_bored("I am bored. I am not bored") == 2

    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario3.id_92.is_bored`.
        """
        assert is_b