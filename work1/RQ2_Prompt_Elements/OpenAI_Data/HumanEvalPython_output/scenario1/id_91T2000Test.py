# id_91_Test.java
from scenario1.id_91 import is_bored

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario1.id_91.is_bored`.
    """


    def test_is_bored_1(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am not bored.") == 0
		
    def test_is_bored_3(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am bored. I am bored.") == 3
		
    def test_is_bored_4(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am not bored. I am not bored. I am not bored.") == 0
		
    def test_is_bored_5(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored.") == 2
		
    def test_is_bored_6(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am not bored. I am bored. I am not bored.") == 1
		
    def test_is_bored_7(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am bored. I am not bored.") == 2
		
    def test_is_bored_8(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am not bored. I am bored. I am bored.") == 2
		
    def test_is_bored_9(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am not bored.") == 1
		
    def test_is_bored_10(self):
        """
        Test case for the :func:`scenario1.id_91.is_bored`.
        """
        assert is_bored("I am not bored. I am not bored. I am bored.") == 1
		
# id_92.py

def is_bored(S):

    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

# id_92_Test.java
from scenario1.id_92 import is_bored

import pytest

class id_92_Test:
    """
    Test class of id_92.py.
    It contains ten unit test cases for the :func:`scenario1.id_92.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am not bored.") == 0
		
    def test_is_bored_3(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am bored. I am bored. I am bored.") == 3
		
    def test_is_bored_4(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am not bored. I am not bored. I am not bored.") == 0
		
    def test_is_bored_5(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored.") == 2
		
    def test_is_bored_6(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am not bored. I am bored. I am not bored.") == 1
		
    def test_is_bored_7(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am bored. I am bored. I am not bored.") == 2
		
    def test_is_bored_8(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am not bored. I am bored. I am bored.") == 2
		
    def test_is_bored_9(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am not bored.") == 1
		
    def test_is_bored_10(self):
        """
        Test case for the :func:`scenario1.id_92.is_bored`.
        """
        assert is_bored("I am not bored. I am not bored. I am bored.") == 1
		
# id_93.py

def is_bored(S):

    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

# id_93_Test.java
from scenario1.id_93 import is_bored

import pytest

class id_93_Test:
    """
    Test class of id_93.py.
    It contains ten unit test cases for the :func:`scenario1.id_93.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case for the :func:`scenario1.id_93.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case for the :func:`scenario1.id_93.is_bored`.
        """
        assert is_bored("I am not bored.") == 0
		
    def test_is_bored_3(self):
        """
        Test case for the :func:`scenario1.id_93.is_bored`.
        """
        assert is_bored("I am bored. I am bored. I am bored.") == 3
		
    def test_is_bored_4(self):
        """
        Test case for the :func:`scenario1.id_93.is_bored`.
        """
        assert is_bored("I am not bored. I am not bored. I am not bored.") == 0
		
    def test_is_bored_5(self):
        """
        Test case for the :func:`scenario1.id_93.is_bored`.
        """
        assert is_bored("I am bored. I am not bored. I am bored.") == 2
		
    def test_is_bored_6(self):
        """
        Test case for the :func