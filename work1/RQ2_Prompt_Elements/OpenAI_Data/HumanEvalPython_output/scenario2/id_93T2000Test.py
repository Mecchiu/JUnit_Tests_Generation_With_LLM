# id_93_Test.java
from scenario2.id_93 import encode

import pytest

class id_93_Test:
    """
    Test class of id_93.py.
    It contains ten unit test cases for the :func:`scenario2.id_93.encode`.
    """


    def test_encode_1(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World") == "Hgnnq Yqtnf"

    def test_encode_2(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!") == "Hgnnq Yqtnf!"

    def test_encode_3(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!") == "Hgnnq Yqtnf!!"

    def test_encode_4(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!") == "Hgnnq Yqtnf!!!"

    def test_encode_5(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!!") == "Hgnnq Yqtnf!!!!"

    def test_encode_6(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!!!") == "Hgnnq Yqtnf!!!!"

    def test_encode_7(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!!!!!") == "Hgnnq Yqtnf!!!!"

    def test_encode_8(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!!!!!!") == "Hgnnq Yqtnf!!!!"

    def test_encode_9(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!!!!!!!") == "Hgnnq Yqtnf!!!!"

    def test_encode_10(self):
        """
        Test case for the :func:`scenario2.id_93.encode`.
        """
        assert encode("Hello World!!!!!!!!!!!") == "Hgnnq Yqtnf!!!!"