# id_91_Test.java
from scenario2.id_91 import is_bored

import pytest

class id_91_Test:
    """
    Test class of id_91.py.
    It contains ten unit test cases for the :func:`scenario2.id_91.is_bored`.
    """


    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored.") == 1
		
    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored?") == 2
		
    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored?") == 2
		
    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored!") == 3
		
    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario2.id_91.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored!") == 3
		
# id_92.py

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    
    """

    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

# id_92_Test.java
from scenario2.id_92 import is_bored

import pytest

class id_92_Test:
    """
    Test class of id_92.py.
    It contains ten unit test cases for the :func:`scenario2.id_92.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am not bored.") == 1
		
    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am bored! I am not bored?") == 2
		
    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am not bored! I am bored?") == 2
		
    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored!") == 3
		
    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario2.id_92.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored!") == 3
		
# id_93.py

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    
    """

    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

# id_93_Test.java
from scenario2.id_93 import is_bored

import pytest

class id_93_Test:
    """
    Test class of id_93.py.
    It contains ten unit test cases for the :func:`scenario2.id_93.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am not bored.") == 1
		
    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am bored! I am not bored?") == 2
		
    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am not bored! I am bored?") == 2
		
    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored!") == 3
		
    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario2.id_93.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored!") == 3
		
# id_94.py

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    
    """

    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

# id_94_Test.java
from scenario2.id_94 import is_bored

import pytest

class id_94_Test:
    """
    Test class of id_94.py.
    It contains ten unit test cases for the :func:`scenario2.id_94.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am not bored.") == 1
		
    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am bored! I am not bored?") == 2
		
    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am not bored! I am bored?") == 2
		
    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_9(self):
        """
        Test case 9 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am bored! I am not bored? I am bored!") == 3
		
    def test_is_bored_10(self):
        """
        Test case 10 for :func:`scenario2.id_94.is_bored`.
        """
        assert is_bored("I am not bored! I am bored? I am not bored!") == 3
		
# id_95.py

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    
    """

    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

# id_95_Test.java
from scenario2.id_95 import is_bored

import pytest

class id_95_Test:
    """
    Test class of id_95.py.
    It contains ten unit test cases for the :func:`scenario2.id_95.is_bored`.
    """
		
    def test_is_bored_1(self):
        """
        Test case 1 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am bored.") == 1
		
    def test_is_bored_2(self):
        """
        Test case 2 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am not bored.") == 1
		
    def test_is_bored_3(self):
        """
        Test case 3 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_4(self):
        """
        Test case 4 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_bored_5(self):
        """
        Test case 5 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am bored! I am not bored?") == 2
		
    def test_is_bored_6(self):
        """
        Test case 6 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am not bored! I am bored?") == 2
		
    def test_is_bored_7(self):
        """
        Test case 7 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am bored! I am bored?") == 2
		
    def test_is_bored_8(self):
        """
        Test case 8 for :func:`scenario2.id_95.is_bored`.
        """
        assert is_bored("I am not bored! I am not bored?") == 2
		
    def test_is_