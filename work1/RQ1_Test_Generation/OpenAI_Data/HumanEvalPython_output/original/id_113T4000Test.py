# id_113_Test.java
from original.id_113 import odd_count

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`original.id_113.odd_count`.
    """


    def test_odd_count_1(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['1234567']) == ["the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_2(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                               "the number of odd elements 8n the str8ng 8 of the 8nput."]

    def test_odd_count_3(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                         "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                         "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_4(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                   "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                   "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                   "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_5(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                             "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                             "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                             "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                             "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_6(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                       "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_7(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                 "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_8(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                           "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_9(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                                     "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_10(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                                               "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4 of the 4nput."]

# id_113_Test.py
from original.id_113 import odd_count

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`original.id_113.odd_count`.
    """
		
    def test_odd_count_1(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['1234567']) == ["the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_2(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                               "the number of odd elements 8n the str8ng 8 of the 8nput."]

    def test_odd_count_3(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                         "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                         "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_4(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                   "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                   "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                   "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_5(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                             "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                             "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                             "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                             "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_6(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                       "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                       "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_7(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                 "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                 "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_8(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                           "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                           "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_9(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                                     "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput.",
                                                                                                                     "the number of odd elements 4n the str4ng 4 of the 4nput."]

    def test_odd_count_10(self):
        """
        Test case for the :func:`original.id_113.odd_count`.
        """
        assert odd_count(['3',"11111111","1234567","1234567","1234567","1234567","1234567","1234567","1234567","1234567"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.",
                                                                                                                               "the number of odd elements 8n the str8ng 8 of the 8nput.",
                                                                                                                               "the number of odd elements 4n the str4ng 4