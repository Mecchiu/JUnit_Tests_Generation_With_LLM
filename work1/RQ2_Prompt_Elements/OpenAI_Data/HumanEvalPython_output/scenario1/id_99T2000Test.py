# id_99_Test.java
from scenario1.id_99 import closest_integer

import pytest

class id_99_Test:
    """
    Test class of id_99.py.
    It contains ten unit test cases for the :func:`scenario1.id_99.closest_integer`.
    """


    def test_closest_integer_1(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.0') == 0

    def test_closest_integer_2(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.5') == 1

    def test_closest_integer_3(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.0') == 1

    def test_closest_integer_4(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.5') == 2

    def test_closest_integer_5(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.0') == 2

    def test_closest_integer_6(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.5') == 3

    def test_closest_integer_7(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('3.0') == 3

    def test_closest_integer_8(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('3.5') == 4

    def test_closest_integer_9(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('4.0') == 4

    def test_closest_integer_10(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('4.5') == 5

    def test_closest_integer_11(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.0') == 0

    def test_closest_integer_12(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.5') == -1

    def test_closest_integer_13(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.0') == -1

    def test_closest_integer_14(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.5') == -2

    def test_closest_integer_15(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.0') == -2

    def test_closest_integer_16(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.5') == -3

    def test_closest_integer_17(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-3.0') == -3

    def test_closest_integer_18(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-3.5') == -4

    def test_closest_integer_19(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-4.0') == -4

    def test_closest_integer_20(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-4.5') == -5

    def test_closest_integer_21(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.1') == 0

    def test_closest_integer_22(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.2') == 0

    def test_closest_integer_23(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.3') == 0

    def test_closest_integer_24(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.4') == 0

    def test_closest_integer_25(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.6') == 1

    def test_closest_integer_26(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.7') == 1

    def test_closest_integer_27(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.8') == 1

    def test_closest_integer_28(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('0.9') == 1

    def test_closest_integer_29(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.1') == 0

    def test_closest_integer_30(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.2') == 0

    def test_closest_integer_31(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.3') == 0

    def test_closest_integer_32(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.4') == 0

    def test_closest_integer_33(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.6') == -1

    def test_closest_integer_34(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.7') == -1

