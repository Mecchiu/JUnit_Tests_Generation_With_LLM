# id_77_Test.java
from scenario3.id_77 import iscube

import pytest

class id_77_Test:
    """
    Test class of id_77.py.
    It contains ten unit test cases for the :func:`scenario3.id_77.iscube`.
    """


    def test_iscube_1(self):
        """
        Test case for iscube(1).
        """
        assert iscube(1) == True

    def test_iscube_2(self):
        """
        Test case for iscube(2).
        """
        assert iscube(2) == False

    def test_iscube_3(self):
        """
        Test case for iscube(-1).
        """
        assert iscube(-1) == True

    def test_iscube_4(self):
        """
        Test case for iscube(64).
        """
        assert iscube(64) == True

    def test_iscube_5(self):
        """
        Test case for iscube(0).
        """
        assert iscube(0) == True

    def test_iscube_6(self):
        """
        Test case for iscube(180).
        """
        assert iscube(180) == False

    def test_iscube_7(self):
        """
        Test case for iscube(27).
        """
        assert iscube(27) == True

    def test_iscube_8(self):
        """
        Test case for iscube(125).
        """
        assert iscube(125) == True

    def test_iscube_9(self):
        """
        Test case for iscube(216).
        """
        assert iscube(216) == True

    def test_iscube_10(self):
        """
        Test case for iscube(343).
        """
        assert iscube(343) == True

# id_78.py

def is_prime(n):
    '''
    Write a function that takes an integer n and returns True 
    if this integer is a prime number.
    Note: you may assume the input is always valid.
    Examples:
    is_prime(1) ==> False
    is_prime(2) ==> True
    is_prime(3) ==> True
    is_prime(4) ==> False
    is_prime(5) ==> True
    is_prime(6) ==> False
    is_prime(7) ==> True
    is_prime(8) ==> False
    is_prime(9) ==> False
    is_prime(10) ==> False
    is_prime(11) ==> True
    is_prime(12) ==> False
    is_prime(13) ==> True
    is_prime(14) ==> False
    is_prime(15) ==> False
    is_prime(16) ==> False
    is_prime(17) ==> True
    is_prime(18) ==> False
    is_prime(19) ==> True
    is_prime(20) ==> False
    is_prime(21) ==> False
    is_prime(22) ==> False
    is_prime(23) ==> True
    is_prime(24) ==> False
    is_prime(25) ==> False
    is_prime(26) ==> False
    is_prime(27) ==> False
    is_prime(28) ==> False
    is_prime(29) ==> True
    is_prime(30) ==> False
    is_prime(31) ==> True
    is_prime(32) ==> False
    is_prime(33) ==> False
    is_prime(34) ==> False
    is_prime(35) ==> False
    is_prime(36) ==> False
    is_prime(37) ==> True
    is_prime(38) ==> False
    is_prime(39) ==> False
    is_prime(40) ==> False
    is_prime(41) ==> True
    is_prime(42) ==> False
    is_prime(43) ==> True
    is_prime(44) ==> False
    is_prime(45) ==> False
    is_prime(46) ==> False
    is_prime(47) ==> True
    is_prime(48) ==> False
    is_prime(49) ==> False
    is_prime(50) ==> False
    is_prime(51) ==> False
    is_prime(52) ==> False
    is_prime(53) ==> True
    is_prime(54) ==> False
    is_prime(55) ==> False
    is_prime(56) ==> False
    is_prime(57) ==> False
    is_prime(58) ==> False
    is_prime(59) ==> True
    is_prime(60) ==> False
    is_prime(61) ==> True
    is_prime(62) ==> False
    is_prime(63) ==> False
    is_prime(64) ==> False
    is_prime(65) ==> False
    is_prime(66) ==> False
    is_prime(67) ==> True
    is_prime(68) ==> False
    is_prime(69) ==> False
    is_prime(70) ==> False
    is_prime(71) ==> True
    is_prime(72) ==> False
    is_prime(73) ==> True
    is_prime(74) ==> False
    is_prime(75) ==> False
    is_prime(76) ==> False
    is_prime(77) ==> False
    is_prime(78) ==> False
    is_prime(79) ==> True
    is_prime(80) ==> False
    is_prime(81) ==> False
    is_prime(82) ==> False
    is_prime(83) ==> True
    is_prime(84) ==> False
    is_prime(85) ==> False
    is_prime(86) ==> False
    is_prime(87) ==> False
    is_prime(88) ==> False
    is_prime(89) ==> True
    is_prime(90) ==> False
    is_prime(91) ==> False
    is_prime(92) ==> False
    is_prime(93) ==> False
    is_prime(94) ==> False
    is_prime(95) ==> False
    is_prime(96) ==> False
    is_prime(97) ==> True
    is_prime(98) ==> False
    is_prime(99) ==> False
    is_prime(100) ==> False
    is_prime(101) ==> True
    is_prime(102) ==> False
    is_prime(103) ==> True
    is_prime(104) ==> False
    is_prime(105) ==> False
    is_prime(106) ==> False
    is_prime(107) ==> True
    is_prime(108) ==> False
    is_prime(109) ==> True
    is_prime(110) ==> False
    is_prime(111) ==> False
    is_prime(112) ==> False
    is_prime(113) ==> True
    is_prime(114) ==> False
    is_prime(115) ==> False
    is_prime(116) ==> False
    is_prime(117) ==> False
    is_prime(118) ==> False
    is_prime(119) ==> False
    is_prime(120) ==> False
    is_prime(121) ==> False
    is_prime(122) ==> False
    is_prime(123) ==> False
    is_prime(124) ==> False
    is_prime(125) ==> False
    is_prime(126) ==> False
    is_prime(127) ==> True
    is_prime(128) ==> False
    is_prime(129) ==> False
    is_prime(130) ==> False
    is_prime(131) ==> True
    is_prime(132) ==> False
    is_prime(133) ==> False
    is_prime(134) ==> False
    is_prime(135) ==> False
    is_prime(136) ==> False
    is_prime(137) ==> True
    is_prime(138) ==> False
    is_prime(139) ==> True
    is_prime(140) ==> False
    is_prime(141) ==> False
    is_prime(142