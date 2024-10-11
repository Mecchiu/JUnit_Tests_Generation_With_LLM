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

    def test_closest_integer_35(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.8') == -1

    def test_closest_integer_36(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-0.9') == -1

    def test_closest_integer_37(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.1') == 1

    def test_closest_integer_38(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.2') == 1

    def test_closest_integer_39(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.3') == 1

    def test_closest_integer_40(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.4') == 1

    def test_closest_integer_41(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.6') == 2

    def test_closest_integer_42(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.7') == 2

    def test_closest_integer_43(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.8') == 2

    def test_closest_integer_44(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('1.9') == 2

    def test_closest_integer_45(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.1') == -1

    def test_closest_integer_46(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.2') == -1

    def test_closest_integer_47(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.3') == -1

    def test_closest_integer_48(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.4') == -1

    def test_closest_integer_49(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.6') == -2

    def test_closest_integer_50(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.7') == -2

    def test_closest_integer_51(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.8') == -2

    def test_closest_integer_52(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-1.9') == -2

    def test_closest_integer_53(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.1') == 2

    def test_closest_integer_54(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.2') == 2

    def test_closest_integer_55(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.3') == 2

    def test_closest_integer_56(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.4') == 2

    def test_closest_integer_57(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.6') == 3

    def test_closest_integer_58(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.7') == 3

    def test_closest_integer_59(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.8') == 3

    def test_closest_integer_60(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('2.9') == 3

    def test_closest_integer_61(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.1') == -2

    def test_closest_integer_62(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.2') == -2

    def test_closest_integer_63(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.3') == -2

    def test_closest_integer_64(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.4') == -2

    def test_closest_integer_65(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.6') == -3

    def test_closest_integer_66(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.7') == -3

    def test_closest_integer_67(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-2.8') == -3

    def test_closest_integer_68(self):
        """
        Test case for the :func:`scenario1.id_99.closest_integer`.
        """
        assert closest_integer('-