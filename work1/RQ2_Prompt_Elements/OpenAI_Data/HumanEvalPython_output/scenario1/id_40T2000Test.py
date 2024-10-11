# id_40_Test.java
from scenario1.id_40 import triples_sum_to_zero

import pytest

class id_40_Test:
    """
    Test class of id_40.py.
    It contains ten unit test cases for the :func:`scenario1.id_40.triples_sum_to_zero`.
    """


    def test_triples_sum_to_zero_1(self):
        """
        Test case 1 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == False

    def test_triples_sum_to_zero_2(self):
        """
        Test case 2 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10]) == True

    def test_triples_sum_to_zero_3(self):
        """
        Test case 3 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15]) == True

    def test_triples_sum_to_zero_4(self):
        """
        Test case 4 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20]) == True

    def test_triples_sum_to_zero_5(self):
        """
        Test case 5 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30]) == True

    def test_triples_sum_to_zero_6(self):
        """
        Test case 6 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40]) == True

    def test_triples_sum_to_zero_7(self):
        """
        Test case 7 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50]) == True

    def test_triples_sum_to_zero_8(self):
        """
        Test case 8 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50, -51, -52, -53, -54, -55, -56, -57, -58, -59, -60]) == True

    def test_triples_sum_to_zero_9(self):
        """
        Test case 9 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50, -51, -52, -53, -54, -55, -56, -57, -58, -59, -60, -61, -62, -63, -64, -65, -66, -67, -68, -69, -70]) == True

    def test_triples_sum_to_zero_10(self):
        """
        Test case 10 for :func:`scenario1.id_40.triples_sum_to_zero`.
        """
        assert triples_sum_to_zero([1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50, -51, -52, -53, -54, -55, -56, -57, -58, -59, -60, -61, -62, -63, -64, -65, -66, -67, -68, -69, -70, -71, -72, -73, -74, -75, -76, -77, -78, -79, -80]) == True