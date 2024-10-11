# id_127_Test.java
from original.id_127 import intersection

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`original.id_127.intersection`.
    """


    def test_intersection_1(self):
        """
        Test case 1.
        """
        assert intersection((1, 2), (2, 3)) == "NO"

    def test_intersection_2(self):
        """
        Test case 2.
        """
        assert intersection((-1, 1), (0, 4)) == "NO"

    def test_intersection_3(self):
        """
        Test case 3.
        """
        assert intersection((-3, -1), (-5, 5)) == "YES"

    def test_intersection_4(self):
        """
        Test case 4.
        """
        assert intersection((-3, -1), (-5, -4)) == "NO"

    def test_intersection_5(self):
        """
        Test case 5.
        """
        assert intersection((-3, -1), (-5, -2)) == "YES"

    def test_intersection_6(self):
        """
        Test case 6.
        """
        assert intersection((-3, -1), (-5, -1)) == "NO"

    def test_intersection_7(self):
        """
        Test case 7.
        """
        assert intersection((-3, -1), (-5, 0)) == "YES"

    def test_intersection_8(self):
        """
        Test case 8.
        """
        assert intersection((-3, -1), (-5, 1)) == "YES"

    def test_intersection_9(self):
        """
        Test case 9.
        """
        assert intersection((-3, -1), (-5, 2)) == "YES"

    def test_intersection_10(self):
        """
        Test case 10.
        """
        assert intersection((-3, -1), (-5, 3)) == "YES"

# id_127_Test.py
from original.id_127 import intersection

import pytest

class id_127_Test:
    """
    Test class of id_127.py.
    It contains ten unit test cases for the :func:`original.id_127.intersection`.
    """
		
    def test_intersection_1(self):
        """
        Test case 1.
        """
        assert intersection((1, 2), (2, 3)) == "NO"

    def test_intersection_2(self):
        """
        Test case 2.
        """
        assert intersection((-1, 1), (0, 4)) == "NO"

    def test_intersection_3(self):
        """
        Test case 3.
        """
        assert intersection((-3, -1), (-5, 5)) == "YES"

    def test_intersection_4(self):
        """
        Test case 4.
        """
        assert intersection((-3, -1), (-5, -4)) == "NO"

    def test_intersection_5(self):
        """
        Test case 5.
        """
        assert intersection((-3, -1), (-5, -2)) == "YES"

    def test_intersection_6(self):
        """
        Test case 6.
        """
        assert intersection((-3, -1), (-5, -1)) == "NO"

    def test_intersection_7(self):
        """
        Test case 7.
        """
        assert intersection((-3, -1), (-5, 0)) == "YES"

    def test_intersection_8(self):
        """
        Test case 8.
        """
        assert intersection((-3, -1), (-5, 1)) == "YES"

    def test_intersection_9(self):
        """
        Test case 9.
        """
        assert intersection((-3, -1), (-5, 2)) == "YES"

    def test_intersection_10(self):
        """
        Test case 10.
        """
        assert intersection((-3, -1), (-5, 3)) == "YES"

# id_128.py

def is_prime(num):
    """You are given a positive integer.
    Your task is to determine whether the number is a prime number.
    If the number is a prime number, return "YES", otherwise, return "NO".

    [input/output] samples:
    is_prime(1) ==> "NO"
    is_prime(2) ==> "YES"
    is_prime(3) ==> "YES"
    is_prime(4) ==> "NO"
    is_prime(5) ==> "YES"
    is_prime(6) ==> "NO"
    is_prime(7) ==> "YES"
    is_prime(8) ==> "NO"
    is_prime(9) ==> "NO"
    is_prime(10) ==> "NO"
    is_prime(11) ==> "YES"
    is_prime(12) ==> "NO"
    is_prime(13) ==> "YES"
    is_prime(14) ==> "NO"
    is_prime(15) ==> "NO"
    is_prime(16) ==> "NO"
    is_prime(17) ==> "YES"
    is_prime(18) ==> "NO"
    is_prime(19) ==> "YES"
    is_prime(20) ==> "NO"
    is_prime(21) ==> "NO"
    is_prime(22) ==> "NO"
    is_prime(23) ==> "YES"
    is_prime(24) ==> "NO"
    is_prime(25) ==> "NO"
    is_prime(26) ==> "NO"
    is_prime(27) ==> "NO"
    is_prime(28) ==> "NO"
    is_prime(29) ==> "YES"
    is_prime(30) ==> "NO"
    is_prime(31) ==> "YES"
    is_prime(32) ==> "NO"
    is_prime(33) ==> "NO"
    is_prime(34) ==> "NO"
    is_prime(35) ==> "NO"
    is_prime(36) ==> "NO"
    is_prime(37) ==> "YES"
    is_prime(38) ==> "NO"
    is_prime(39) ==> "NO"
    is_prime(40) ==> "NO"
    is_prime(41) ==> "YES"
    is_prime(42) ==> "NO"
    is_prime(43) ==> "YES"
    is_prime(44) ==> "NO"
    is_prime(45) ==> "NO"
    is_prime(46) ==> "NO"
    is_prime(47) ==> "YES"
    is_prime(48) ==> "NO"
    is_prime(49) ==> "NO"
    is_prime(50) ==> "NO"
    is_prime(51) ==> "NO"
    is_prime(52) ==> "NO"
    is_prime(53) ==> "YES"
    is_prime(54) ==> "NO"
    is_prime(55) ==> "NO"
    is_prime(56) ==> "NO"
    is_prime(57) ==> "NO"
    is_prime(58) ==> "NO"
    is_prime(59) ==> "YES"
    is_prime(60) ==> "NO"
    is_prime(61) ==> "YES"
    is_prime(62) ==> "NO"
    is_prime(63) ==> "NO"
    is_prime(64) ==> "NO"
    is_prime(65) ==> "NO"
    is_prime(66) ==> "NO"
    is_prime(67) ==> "YES"
    is_prime(68) ==> "NO"
    is_prime(69) ==> "NO"
    is_prime(70) ==> "NO"
    is_prime(71) ==> "YES"
    is_prime(72) ==> "NO"
    is_prime(73) ==> "YES"
    is_prime(74) ==> "NO"
    is_prime(75) ==> "NO"
    is_prime(76) ==> "NO"
    is_prime(77) ==> "NO"
    is_prime(78) ==> "NO"
    is_prime(79) ==> "YES"
    is_prime(80) ==> "NO"
    is_prime(81) ==> "NO"
    is_prime(82) ==> "NO"
    is_prime(83) ==> "YES"
    is_prime(84) ==> "NO"
    is_prime(85) ==> "NO"
    is_prime(86) ==> "NO"
    is_prime(87) ==> "NO"
    is_prime(88) ==> "NO"
    is_prime(89) ==> "YES"
    is_prime(90) ==> "NO"
    is_prime(91) ==> "NO"
    is_prime(92) ==> "NO"
    is_prime(93) ==> "NO"
    is_prime(94) ==> "NO"
    is_prime(95) ==> "NO"
    is_prime(96) ==> "NO"
    is_prime(97) ==> "YES"
    is_prime(98) ==> "NO"
    is_prime(99) ==> "NO"
    is_prime(100) ==> "NO"
    is_prime(101) ==> "YES"
    is_prime(102) ==> "NO"
    is_prime(103) ==> "YES"
    is_prime(104) ==> "NO"
    is_prime(105) ==> "NO"
    is_prime(106) ==> "NO"
    is_prime(107) ==> "YES"
    is_prime(108) ==> "NO"
    is_prime(109) ==> "YES"
    is_prime(110) ==> "NO"
    is_prime(111) ==> "NO"
    is_prime(112) ==> "NO"
    is_prime(113) ==> "NO"
    is_prime(114) ==> "NO"
    is_prime(115) ==> "NO"
    is_prime(116) ==> "NO"
    is_prime(117) ==> "NO"
    is_prime(118) ==> "NO"
    is_prime(119) ==> "NO"
    is_prime(120) ==> "NO"
    is_prime(121) ==> "NO"
    is_prime(122) ==> "NO"
    is_prime(123) ==> "NO"
    is_prime(124) ==> "NO"
    is_prime(125) ==> "NO"
    is_prime(126) ==> "NO"
    is_prime(127) ==> "YES"
    is_prime(128) ==> "NO"
    is_prime(129) ==> "NO"
    is_prime(130) ==> "NO"
    is_prime(131) ==> "YES"
    is_prime(132) ==> "NO"
    is_prime(133) ==> "NO"
    is_prime(134) ==> "NO"
    is_prime(135) ==> "NO"
    is_prime(136) ==> "NO"
    is_prime(137) ==> "YES"
    is_prime(138) ==> "NO"
    is_prime(139) ==> "YES"
    is_prime(140) ==> "NO"
    is_prime(141) ==> "NO"
    is_prime(142) ==> "NO"
    is_prime(143) ==> "NO"
    is_prime(144) ==> "NO"
    is_prime(145) ==> "NO"
    is_prime(146) ==> "NO"
    is_prime(147) ==> "NO"
    is_prime(148) ==> "NO"
    is_prime(149) ==> "NO"
    is_prime(150) ==> "NO"
    is_prime(151) ==> "NO"
    is_prime(152) ==> "NO"
    is_prime(153) ==> "NO"
    is_prime(154) ==> "NO"
    is_prime(155) ==> "NO"
    is_prime(156) ==> "NO"
    is_prime(157) ==> "NO"
    is_prime(158) ==> "NO"
    is_prime(159) ==> "NO"
    is_prime(160) ==> "NO"
    is_prime(161) ==> "NO"
    is_prime(162) ==> "NO"
    is_prime(163) ==> "NO"
    is_prime(164) ==> "NO"
    is_prime(165) ==> "NO"
    is_prime(166) ==> "NO"
    is_prime(167) ==> "NO"
    is_prime(168) ==> "NO"
    is_prime(169) ==> "NO"
    is_prime(170) ==> "NO"
    is_prime(171) ==> "NO"
    is_prime(172) ==> "NO"
    is_prime(173) ==> "YES"
    is_prime(174) ==> "NO"
    is_prime(175) ==> "NO"
    is_prime(176) ==> "NO"
    is_prime(177) ==> "NO"
    is_prime(178) ==> "NO"
    is_prime(179) ==> "YES"
    is_prime(180) ==> "NO"
    is_prime(181) ==> "NO"
    is_prime(182) ==> "NO"
    is_prime(183) ==> "NO"
    is_prime(184) ==> "NO"
    is_prime(185) ==> "NO"
    is_prime(186) ==> "NO"
    is_prime(187) ==> "NO"
    is_prime(188) ==> "NO"
    is_prime(189) ==> "NO"
    is_prime(190) ==> "NO"
    is_prime(191) ==> "YES"
    is_prime(192) ==> "NO"
    is_prime(193) ==> "YES"
    is_prime(194) ==> "NO"
    is_prime(195) ==> "NO"
    is_prime(196) ==> "NO"
    is_prime(197) ==> "YES"
    is_prime(198) ==> "NO"
    is_prime(199) ==> "YES"
    is_prime(200) ==> "NO"
    is_prime(201) ==> "NO"
    is_prime(202) ==> "NO"
    is_prime(203) ==> "NO"
    is_prime(204) ==> "NO"
    is_prime(205) ==> "NO"
    is_prime(206) ==> "NO"
    is_prime(207) ==> "NO"
    is_prime(208) ==> "NO"
    is_prime(209) ==> "NO"
    is_prime(210) ==> "NO"
    is_prime(211) ==> "YES"
    is_prime(212) ==> "NO"
    is_prime(213) ==> "NO"
    is_prime(214) ==> "NO"
    is_prime(215) ==> "NO"
    is_prime(216) ==> "NO"
    is_prime(217) ==> "NO"
    is_prime(218) ==> "NO"
    is_prime(219) ==> "NO"
    is_prime(220) ==> "NO"
    is_prime(221) ==> "NO"
    is_prime(222) ==> "NO"
    is_prime(223) ==> "YES"
    is_prime(224) ==> "NO"
    is_prime(225) ==> "NO"
    is_prime(226) ==> "NO"
    is_prime(227) ==> "NO"
    is_prime(228) ==> "NO"
    is_prime(229) ==