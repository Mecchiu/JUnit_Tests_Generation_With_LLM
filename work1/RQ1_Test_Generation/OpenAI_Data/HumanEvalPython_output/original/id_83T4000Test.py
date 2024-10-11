# id_83_Test.java
from original.id_83 import starts_one_ends

import pytest

class id_83_Test:
    """
    Test class of id_83.py.
    It contains ten unit test cases for the :func:`original.id_83.starts_one_ends`.
    """


    def test_starts_one_ends_1(self):
        """
        Test case for the function :func:`original.id_83.starts_one_ends`.
        """
        assert starts_one_ends(1) == 1
        assert starts_one_ends(2) == 19
        assert starts_one_ends(3) == 190
        assert starts_one_ends(4) == 1900
        assert starts_one_ends(5) == 19000
        assert starts_one_ends(6) == 190000
        assert starts_one_ends(7) == 1900000
        assert starts_one_ends(8) == 19000000
        assert starts_one_ends(9) == 190000000
        assert starts_one_ends(10) == 1900000000

# id_84.py

def is_prime(n):
    """
    Given a positive integer n, return True if n is a prime number,
    otherwise return False.
    """

    if n == 1: return False
    if n == 2: return True
    if n % 2 == 0: return False
    for i in range(3, int(n ** 0.5) + 1, 2):
        if n % i == 0: return False
    return True

def prime_factors(n):
    """
    Given a positive integer n, return a list of its prime factors.
    """

    factors = []
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0 and is_prime(i):
            factors.append(i)
    return factors

def prime_factor_count(n):
    """
    Given a positive integer n, return the count of its prime factors.
    """

    return len(prime_factors(n))

def prime_factor_count_sum(n):
    """
    Given a positive integer n, return the sum of the count of its prime factors.
    """

    return sum(prime_factor_count(i) for i in range(1, n + 1))

# id_84_Test.java
from original.id_84 import is_prime, prime_factors, prime_factor_count, prime_factor_count_sum

import pytest

class id_84_Test:
    """
    Test class of id_84.py.
    It contains four unit test cases for the :func:`original.id_84.is_prime`,
    :func:`original.id_84.prime_factors`, :func:`original.id_84.prime_factor_count`,
    and :func:`original.id_84.prime_factor_count_sum`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`original.id_84.is_prime`.
        """
        assert is_prime(1) == False
        assert is_prime(2) == True
        assert is_prime(3) == True
        assert is_prime(4) == False
        assert is_prime(5) == True
        assert is_prime(6) == False
        assert is_prime(7) == True
        assert is_prime(8) == False
        assert is_prime(9) == False
        assert is_prime(10) == False
        assert is_prime(11) == True
        assert is_prime(12) == False
        assert is_prime(13) == True
        assert is_prime(14) == False
        assert is_prime(15) == False
        assert is_prime(16) == False
        assert is_prime(17) == True
        assert is_prime(18) == False
        assert is_prime(19) == True
        assert is_prime(20) == False
        assert is_prime(21) == False
        assert is_prime(22) == False
        assert is_prime(23) == True
        assert is_prime(24) == False
        assert is_prime(25) == False
        assert is_prime(26) == False
        assert is_prime(27) == False
        assert is_prime(28) == False
        assert is_prime(29) == True
        assert is_prime(30) == False
        assert is_prime(31) == True
        assert is_prime(32) == False
        assert is_prime(33) == False
        assert is_prime(34) == False
        assert is_prime(35) == False
        assert is_prime(36) == False
        assert is_prime(37) == True
        assert is_prime(38) == False
        assert is_prime(39) == False
        assert is_prime(40) == False
        assert is_prime(41) == True
        assert is_prime(42) == False
        assert is_prime(43) == True
        assert is_prime(44) == False
        assert is_prime(45) == False
        assert is_prime(46) == False
        assert is_prime(47) == True
        assert is_prime(48) == False
        assert is_prime(49) == False
        assert is_prime(50) == False
        assert is_prime(51) == False
        assert is_prime(52) == False
        assert is_prime(53) == True
        assert is_prime(54) == False
        assert is_prime(55) == False
        assert is_prime(56) == False
        assert is_prime(57) == False
        assert is_prime(58) == False
        assert is_prime(59) == True
        assert is_prime(60) == False
        assert is_prime(61) == True
        assert is_prime(62) == False
        assert is_prime(63) == False
        assert is_prime(64) == False
        assert is_prime(65) == False
        assert is_prime(66) == False
        assert is_prime(67) == True
        assert is_prime(68) == False
        assert is_prime(69) == False
        assert is_prime(70) == False
        assert is_prime(71) == True
        assert is_prime(72) == False
        assert is_prime(73) == True
        assert is_prime(74) == False
        assert is_prime(75) == False
        assert is_prime(76) == False
        assert is_prime(77) == False
        assert is_prime(78) == False
        assert is_prime(79) == True
        assert is_prime(80) == False
        assert is_prime(81) == False
        assert is_prime(82) == False
        assert is_prime(83) == True
        assert is_prime(84) == False
        assert is_prime(85) == False
        assert is_prime(86) == False
        assert is_prime(87) == False
        assert is_prime(88) == False
        assert is_prime(89) == True
        assert is_prime(90) == False
        assert is_prime(91) == False
        assert is_prime(92) == False
        assert is_prime(93) == False
        assert is_prime(94) == False
        assert is_prime(95) == False
        assert is_prime(96) == False
        assert is_prime(97) == True
        assert is_prime(98) == False
        assert is_prime(99) == False
        assert is_prime(100) == False
        assert is_prime(101) == True
        assert is_prime(102) == False
        assert is_prime(103) == True
        assert is_prime(104) == False
        assert is_prime(105) == False
        assert is_prime(106) == False
        assert is_prime(107) == True
        assert is_prime(108) == False
        assert is_prime(109) == True
        assert is_prime(110) == False
        assert is_prime(111) == False
        assert is_prime(112) == False
        assert is_prime(113) == True
        assert is_prime(114) == False
        assert is_prime(115) == False
        assert is_prime(116) == False
        assert is_prime(117) == False
        assert is_prime(118) == False
        assert is_prime(119) == False
        assert is_prime(120) == False
        assert is_prime(121) == False
        assert is_prime(122) == False
        assert is_prime(123) == False
        assert is_prime(124) == False
        assert is_prime(125) == False
        assert is_prime(126) == False
        assert is_prime(127) == True
        assert is_prime(128) == False
        assert is_prime(129) == False
        assert is_prime(130) == False
        assert is_prime(131) == True
        assert is_prime(132) == False
        assert is_prime(133) == False
        assert is_prime(134) == False
        assert is_prime(135) == False
        assert is_prime(136) == False
        assert is_prime(137) == True
        assert is_prime(138) == False
        assert is_prime(139) == True
        assert is_prime(140) == False
        assert is_prime(141) == False
        assert is_prime(142) == False
        assert is_prime(143) == False
        assert is_prime(144) == False
        assert is_prime(145) == False
        assert is_prime(146) == False
        assert is_prime(147) == False
        assert is_prime(148) == False
        assert is_prime(149) == False
        assert is_prime(150) == False
        assert is_prime(151) == False
        assert is_prime(152) == False
        assert is_prime(153) == False
        assert is_prime(154) == False
        assert is_prime(155) == False
        assert is_prime(156) == False
        assert is_prime(157) == False
        assert is_prime(158) == False
        assert is_prime(159) == False
        assert is_prime(160) == False
        assert is_prime(161) == False
        assert is_prime(162) == False
        assert is_prime(163) == True
        assert is_prime(164) == False
        assert is_prime(165) == False
        assert is_prime(166) == False
        assert is_prime(167) == True
        assert is_prime(168) == False
        assert is_prime(169) == False
        assert is_prime(170) == False
        assert is_prime(171) == False
        assert is_prime(172) == False
        assert is_prime(173) == True
        assert is_prime(174) == False
        assert is_prime(175) == False
        assert is_prime(176) == False
        assert is_prime(177) == False
        assert is_prime(178) == False
        assert is_prime(179) == True
        assert is_prime(180) == False
        assert is_prime(181) == False
        assert is_prime(182) == False
        assert is_prime(183) == True
        assert is_prime(184) == False
        assert is_prime(185) == False
        assert is_prime(186) == False
        assert is_prime(187) == False
        assert is_prime(188) == False
        assert is_prime(189) == True
        assert is_prime(190) == False
        assert is_prime(191) == True
        assert is_prime(192) == False
        assert is_prime(193) == True
        assert is_prime(194) == False
        assert is_prime(195) == False
        assert is_prime(196) == False
        assert is_prime(197) == True
        assert is_prime(198) == False
        assert is_prime(199) == True
        assert is_prime(200) == False
        assert is_prime(201) == False
        assert is_prime(202) == False
        assert is_prime(203) == False
        assert is_prime(204) == False
        assert is_prime(205) == False
        assert is_prime(206) == False
        assert is_prime(207) == False
        assert is_prime(208) == False
        assert is_prime(209) == False
        assert is_prime(210) == False
        assert is_prime(211) == True
        assert is_prime(212) == False
        assert is_prime(213) == False
        assert is_prime(214) == False
        assert is_prime(215) == False
        assert is_prime(216) == False
        assert is_prime(217) == True
        assert is_prime(218) == False
        assert is_prime(219) == False
        assert is_prime(220) == False
        assert is_prime(221) == False
        assert is_prime(222) == False
        assert is_prime(223) == True
        assert is_prime(224) == False
        assert is_prime(225) == False
        assert is_prime(226) == False
        assert is_prime(227) == False
        assert is_prime(228) == False
        assert is_prime(229) == False
        assert is_prime(230) == False
        assert is_prime(231) == True
        assert is_prime(232) == False
        assert is_prime(233) == True
        assert is_prime(234) == False
        assert is_prime(235) == False
        assert is_prime(236) == False
        assert is_prime(237) == True
        assert is_prime(238) == False
        assert is_prime(239) == True
        assert is_prime(240) == False
        assert is_prime(241) == False
        assert is_prime(242) == False
        assert is_prime(243) == False
        assert is_prime(244) == False
        assert is_prime(245) == False
        assert is_prime(246) == False
        assert is_prime(247) == False
        assert is_prime(248) == False
        assert is_prime(249) == False
        assert is_prime(250) == False
        assert is_prime(251) == False
        assert is_prime(252) == False
        assert is_prime(253) == False
        assert is_prime(254) == False
        assert is_prime(255) == False
        assert is_prime(256) == False
        assert is_prime(257) == True
        assert is_prime(258) == False
        assert is_prime(259) == False
        assert is_prime(260) == False
        assert is_prime(261) == False
        assert is_prime(262) == False
        assert is_prime(263) == False
        assert is_prime(264) == False
        assert is_prime(265) == False
        assert is_prime(266) == False
        assert is_prime(267) == False
        assert is_prime(268) == False
        assert is_prime(269) == False
        assert is_prime(270) == False
        assert is_prime(271) == False
        assert is_prime(272) == False
        assert is_prime(273) == False
        assert is_prime(274) == False
        assert is_prime(275) == False
        assert is_prime(276) == False
        assert is_prime(277) == False
        assert is_prime(278) == False
        assert is_prime(279) == True
        assert is_prime(280) == False
        assert is_prime(281) == False
        assert is_prime(282) == False
        assert is_prime(283) == True
        assert is_prime(284) == False
        assert is_prime(285) == False
        assert is_prime(286) == False
        assert is_prime(287) == False
        assert is_prime(288) == False
        assert is_prime(289) == False
        assert is_prime(290) == False
        assert is_prime(291) == False
        assert is_prime(292) == False
        assert is_prime(293) == False
        assert is_prime(294) == False
        assert is_prime(295) == False
        assert is_prime(296) == False
        assert is_prime(297) == True
        assert is_prime(298) == False
        assert is_prime(299) == False
        assert is_prime(300) == False
        assert is_prime(301) == False
        assert is_prime(302) == False
