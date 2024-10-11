# id_46_Test.java
from scenario2.id_46 import fib4

import pytest

class id_46_Test:
    """
    Test class of id_46.py.
    It contains ten unit test cases for the :func:`scenario2.id_46.fib4`.
    """


    def test_fib4_1(self):
        """
        Test case for the :func:`scenario2.id_46.fib4`.
        """
        assert fib4(0) == 0
        assert fib4(1) == 0
        assert fib4(2) == 2
        assert fib4(3) == 0
        assert fib4(4) == 2
        assert fib4(5) == 4
        assert fib4(6) == 6
        assert fib4(7) == 10
        assert fib4(8) == 16
        assert fib4(9) == 26
        assert fib4(10) == 42
        assert fib4(11) == 68
        assert fib4(12) == 110
        assert fib4(13) == 178
        assert fib4(14) == 288
        assert fib4(15) == 466
        assert fib4(16) == 754
        assert fib4(17) == 1220
        assert fib4(18) == 1974
        assert fib4(19) == 3194
        assert fib4(20) == 5168
        assert fib4(21) == 8362
        assert fib4(22) == 13530
        assert fib4(23) == 21892
        assert fib4(24) == 35422
        assert fib4(25) == 57314
        assert fib4(26) == 92736
        assert fib4(27) == 150050
        assert fib4(28) == 242786
        assert fib4(29) == 392836
        assert fib4(30) == 635622
        assert fib4(31) == 1028458
        assert fib4(32) == 1664080
        assert fib4(33) == 2692538
        assert fib4(34) == 4356618
        assert fib4(35) == 7049156
        assert fib4(36) == 11405774
        assert fib4(37) == 18454930
        assert fib4(38) == 29860704
        assert fib4(39) == 48315634
        assert fib4(40) == 78176338
        assert fib4(41) == 126491971
        assert fib4(42) == 204668309
        assert fib4(43) == 331160280
        assert fib4(44) == 535828591
        assert fib4(45) == 866988871
        assert fib4(46) == 1402817462
        assert fib4(47) == 2270006333
        assert fib4(48) == 3672825795
        assert fib4(49) == 5942834128
        assert fib4(50) == 9615660023
        assert fib4(51) == 15561494151
        assert fib4(52) == 25177094174
        assert fib4(53) == 40743588325
        assert fib4(54) == 65914680499
        assert fib4(55) == 106658268824
        assert fib4(56) == 172570950323
        assert fib4(57) == 2802292091