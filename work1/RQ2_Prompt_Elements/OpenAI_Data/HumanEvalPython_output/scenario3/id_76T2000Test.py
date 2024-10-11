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
    is_