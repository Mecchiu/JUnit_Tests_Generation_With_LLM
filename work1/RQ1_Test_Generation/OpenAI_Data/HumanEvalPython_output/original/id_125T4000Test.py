# id_125_Test.java
from original.id_125 import split_words

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`original.id_125.split_words`.
    """


    def test_split_words_1(self):
        """
        Test case 1 of split_words.
        """
        assert split_words("Hello world!") == ["Hello", "world!"]
		
    def test_split_words_2(self):
        """
        Test case 2 of split_words.
        """
        assert split_words("Hello,world!") == ["Hello", "world!"]
		
    def test_split_words_3(self):
        """
        Test case 3 of split_words.
        """
        assert split_words("abcdef") == 3
		
    def test_split_words_4(self):
        """
        Test case 4 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz") == 13
		
    def test_split_words_5(self):
        """
        Test case 5 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_6(self):
        """
        Test case 6 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_7(self):
        """
        Test case 7 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_8(self):
        """
        Test case 8 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_9(self):
        """
        Test case 9 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
    def test_split_words_10(self):
        """
        Test case 10 of split_words.
        """
        assert split_words("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz") == ["abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"]
		
if __name__ == '__main__':
    pytest.main()