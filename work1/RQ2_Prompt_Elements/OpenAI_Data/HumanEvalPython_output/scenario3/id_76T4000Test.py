# id_76_Test.java
from scenario3.id_76 import is_simple_power

import pytest

class id_76_Test:
    """
    Test class of id_76.py.
    It contains ten unit test cases for the :func:`scenario3.id_76.is_simple_power`.
    """


    def test_is_simple_power_1(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 4) == True
		
    def test_is_simple_power_2(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(2, 2) == True
		
    def test_is_simple_power_3(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(8, 2) == True
		
    def test_is_simple_power_4(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(3, 2) == False
		
    def test_is_simple_power_5(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(3, 1) == False
		
    def test_is_simple_power_6(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(5, 3) == False
		
    def test_is_simple_power_7(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 1) == True
		
    def test_is_simple_power_8(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 2) == True
		
    def test_is_simple_power_9(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 3) == True
		
    def test_is_simple_power_10(self):
        """
        Test case for is_simple_power.
        """
        assert is_simple_power(1, 5) == True
		
# id_77.py

def is_prime(n):
    """Your task is to write a function that returns true if a number n is a prime
    and false in other cases.
    A prime number is a natural number greater than 1 that has no positive divisors
    other than 1 and itself.
    For example:
    is_prime(1) => false
    is_prime(2) => true
    is_prime(3) => true
    is_prime(4) => false
    is_prime(5) => true
    is_prime(6) => false
    is_prime(7) => true
    is_prime(8) => false
    is_prime(9) => false
    is_prime(10) => false
    is_prime(11) => true
    is_prime(12) => false
    is_prime(13) => true
    is_prime(14) => false
    is_prime(15) => false
    is_prime(16) => false
    is_prime(17) => true
    is_prime(18) => false
    is_prime(19) => true
    is_prime(20) => false
    is_prime(21) => false
    is_prime(22) => false
    is_prime(23) => true
    is_prime(24) => false
    is_prime(25) => false
    is_prime(26) => false
    is_prime(27) => false
    is_prime(28) => false
    is_prime(29) => true
    is_prime(30) => false
    is_prime(31) => true
    is_prime(32) => false
    is_prime(33) => false
    is_prime(34) => false
    is_prime(35) => false
    is_prime(36) => false
    is_prime(37) => true
    is_prime(38) => false
    is_prime(39) => false
    is_prime(40) => false
    is_prime(41) => true
    is_prime(42) => false
    is_prime(43) => true
    is_prime(44) => false
    is_prime(45) => false
    is_prime(46) => false
    is_prime(47) => true
    is_prime(48) => false
    is_prime(49) => false
    is_prime(50) => false
    is_prime(51) => false
    is_prime(52) => false
    is_prime(53) => true
    is_prime(54) => false
    is_prime(55) => false
    is_prime(56) => false
    is_prime(57) => false
    is_prime(58) => false
    is_prime(59) => true
    is_prime(60) => false
    is_prime(61) => true
    is_prime(62) => false
    is_prime(63) => false
    is_prime(64) => false
    is_prime(65) => false
    is_prime(66) => false
    is_prime(67) => true
    is_prime(68) => false
    is_prime(69) => false
    is_prime(70) => false
    is_prime(71) => true
    is_prime(72) => false
    is_prime(73) => true
    is_prime(74) => false
    is_prime(75) => false
    is_prime(76) => false
    is_prime(77) => false
    is_prime(78) => false
    is_prime(79) => true
    is_prime(80) => false
    is_prime(81) => false
    is_prime(82) => false
    is_prime(83) => true
    is_prime(84) => false
    is_prime(85) => false
    is_prime(86) => false
    is_prime(87) => false
    is_prime(88) => false
    is_prime(89) => true
    is_prime(90) => false
    is_prime(91) => false
    is_prime(92) => false
    is_prime(93) => false
    is_prime(94) => false
    is_prime(95) => false
    is_prime(96) => false
    is_prime(97) => true
    is_prime(98) => false
    is_prime(99) => false
    is_prime(100) => false
    is_prime(101) => true
    is_prime(102) => false
    is_prime(103) => true
    is_prime(104) => false
    is_prime(105) => false
    is_prime(106) => false
    is_prime(107) => true
    is_prime(108) => false
    is_prime(109) => true
    is_prime(110) => false
    is_prime(111) => false
    is_prime(112) => false
    is_prime(113) => true
    is_prime(114) => false
    is_prime(115) => false
    is_prime(116) => false
    is_prime(117) => false
    is_prime(118) => false
    is_prime(119) => false
    is_prime(120) => false
    is_prime(121) => false
    is_prime(122) => false
    is_prime(123) => false
    is_prime(124) => false
    is_prime(125) => false
    is_prime(126) => false
    is_prime(127) => true
    is_prime(128) => false
    is_prime(129) => false
    is_prime(130) => false
    is_prime(131) => true
    is_prime(132) => false
    is_prime(133) => false
    is_prime(134) => false
    is_prime(135) => false
    is_prime(136) => false
    is_prime(137) => true
    is_prime(138) => false
    is_prime(139) => true
    is_prime(140) => false
    is_prime(141) => false
    is_prime(142) => false
    is_prime(143) => false
    is_prime(144) => false
    is_prime(145) => false
    is_prime(146) => false
    is_prime(147) => false
    is_prime(148) => false
    is_prime(149) => false
    is_prime(150) => false
    is_prime(151) => false
    is_prime(152) => false
    is_prime(153) => false
    is_prime(154) => false
    is_prime(155) => false
    is_prime(156) => false
    is_prime(157) => true
    is_prime(158) => false
    is_prime(159) => false
    is_prime(160) => false
    is_prime(161) => false
    is_prime(162) => false
    is_prime(163) => false
    is_prime(164) => false
    is_prime(165) => false
    is_prime(166) => false
    is_prime(167) => true
    is_prime(168) => false
    is_prime(169) => false
    is_prime(170) => false
    is_prime(171) => false
    is_prime(172) => false
    is_prime(173) => true
    is_prime(174) => false
    is_prime(175) => false
    is_prime(176) => false
    is_prime(177) => false
    is_prime(178) => false
    is_prime(179) => true
    is_prime(180) => false
    is_prime(181) => false
    is_prime(182) => false
    is_prime(183) => false
    is_prime(184) => false
    is_prime(185) => false
    is_prime(186) => false
    is_prime(187) => false
    is_prime(188) => false
    is_prime(189) => false
    is_prime(190) => false
    is_prime(191) => true
    is_prime(192) => false
    is_prime(193) => true
    is_prime(194) => false
    is_prime(195) => false
    is_prime(196) => false
    is_prime(197) => true
    is_prime(198) => false
    is_prime(199) => true
    is_prime(200) => false
    is_prime(201) => false
    is_prime(202) => false
    is_prime(203) => false
    is_prime(204) => false
    is_prime(205) => false
    is_prime(206) => false
    is_prime(207) => false
    is_prime(208) => false
    is_prime(209) => false
    is_prime(210) => false
    is_prime(211) => true
    is_prime(212) => false
    is_prime(213) => false
    is_prime(214) => false
    is_prime(215) => false
    is_prime(216) => false
    is_prime(217) => true
    is_prime(218) => false
    is_prime(219) => false
    is_prime(220) => false
    is_prime(221) => false
    is_prime(222) => false
    is_prime(223) => true
    is_prime(224) => false
    is_prime(225) => false
    is_prime(226) => false
    is_prime(227) => false
    is_prime(228) => false
    is_prime(229) => false
    is_prime(230) => false
    is_prime(231) => false
    is_prime(232) => false
    is_prime(233) => true
    is_prime(234) => false
    is_prime(235) => false
    is_prime(236) => false
    is_prime(237) => false
    is_prime(238) => false
    is_prime(239) => false
    is_prime(240) => false
    is_prime(241) => false
    is_prime(242) => false
    is_prime(243) => false
    is_prime(244) => false
    is_prime(245) => false
    is_prime(246) => false
    is_prime(247) => false
    is_prime(248) => false
    is_prime(249) => false
    is_prime(250) => false
    is_prime(251) => false
    is_prime(252) => false
    is_prime(253) => false
    is_prime(254) => false
    is_prime(255) => false
    is_prime(256) => False
    is_prime(257) => True
    is_prime(258) => False
    is_prime(259) => False
    is_prime(260) => False
    is_prime(261) => False
    is_prime(262) => False
    is_prime(263) => False
    is_prime(264) => False
    is_prime(265) => False
    is_prime(266) => False
    is_prime(267) => False
    is_prime(268) => False
    is_prime(269) => False
    is_prime(270) => False
    is_prime(271) => False
    is_prime(272) => False
    is_prime(273) => False
    is_prime(274) => False
    is_prime(275) => False
    is_prime(276) => False
    is_prime(277) => False
    is_prime(278) => False
    is_prime(279) => True
    is_prime(280) => False
    is_prime(281) => False
    is_prime(282) => False
    is_prime(283) => True
    is_prime(284) => False
    is_prime(285) => False
    is_prime(286) => False
    is_prime(287) => False
    is_prime(288) => False
    is_prime(289) => False
    is_prime(290) => False
    is_prime(291) => False
    is_prime(292) => False
    is_prime(293) => False
    is_prime(294) => False
    is_prime(295) => False
    is_prime(296) => False
    is_prime(297) => False
    is_prime(298) => False
    is_prime(299) => False
    is_prime(300) => False
    is_prime(301) => False
    is_prime(302) => False
    is_prime(303) => False
    is_prime(304) => False
    is_prime(305) => False
    is_prime(306) => False
    is_prime(307) => False
    is_prime(308) => False
    is_prime(309) => False
    is_prime(310) => False
    is_prime(311) => False
    is_prime(312) => False
    is_prime(313) => True
    is_prime(314) => False
    is_prime(315) => False
    is_prime(316) => False
    is_prime(317) => False
    is_prime(318) => False
    is_prime(319) => False
    is_prime(320) => False
    is_prime(321) => False
    is_prime(322) => False
    is_prime(323) => False
    is_prime(324) => False
    is_prime(325) => False
    is_prime(326) => False
    is_prime(327) => False
    is_prime(328) => False
    is_prime(329) => False
    is_prime(330) => False
    is_prime(331) => False
    is_prime(332) => False
    is_prime(333) => False
    is_prime(334) => False
    is_prime(335) => False
    is_prime(336) => False
    is_prime(337) => False
    is_prime(338) => False
    is_prime(339) => False
    is_prime(340) => False
    is_prime(341) => False
    is_prime(342) => False
    is_