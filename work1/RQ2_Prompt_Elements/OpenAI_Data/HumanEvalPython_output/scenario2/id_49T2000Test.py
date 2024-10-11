# id_49_Test.java
from scenario2.id_49 import modp

import pytest

class id_49_Test:
    """
    Test class of id_49.py.
    It contains ten unit test cases for the :func:`scenario2.id_49.modp`.
    """


    def test_modp_1(self):
        """
        Test case for the :func:`scenario2.id_49.modp`.
        """
        assert modp(0, 3) == 1
        assert modp(1, 3) == 2
        assert modp(2, 3) == 4 % 3
        assert modp(3, 3) == 8 % 3
        assert modp(4, 3) == 16 % 3
        assert modp(5, 3) == 32 % 3
        assert modp(6, 3) == 64 % 3
        assert modp(7, 3) == 128 % 3
        assert modp(8, 3) == 256 % 3
        assert modp(9, 3) == 512 % 3
        assert modp(10, 3) == 1024 % 3
        assert modp(11, 3) == 2048 % 3
        assert modp(12, 3) == 4096 % 3
        assert modp(13, 3) == 8192 % 3
        assert modp(14, 3) == 16384 % 3
        assert modp(15, 3) == 32768 % 3
        assert modp(16, 3) == 65536 % 3
        assert modp(17, 3) == 131072 % 3
        assert modp(18, 3) == 262144 % 3
        assert modp(19, 3) == 524288 % 3
        assert modp(20, 3) == 1048576 % 3
        assert modp(21, 3) == 2097152 % 3
        assert modp(22, 3) == 4194304 % 3
        assert modp(23, 3) == 8388608 % 3
        assert modp(24, 3) == 16777216 % 3
        assert modp(25, 3) == 33554432 % 3
        assert modp(26, 3) == 67108864 % 3
        assert modp(27, 3) == 134217728 % 3
        assert modp(28, 3) == 268435456 % 3
        assert modp(29, 3) == 536870912 % 3
        assert modp(30, 3) == 1073741824 % 3
        assert modp(31, 3) == 2147483648 % 3
        assert modp(32, 3) == 4294967296 % 3
        assert modp(33, 3) == 8589934592 % 3
        assert modp(34, 3) == 17179869184 % 3
        assert modp(35, 3) == 34359738368 % 3
        assert modp(36, 3) == 68719476736 % 3
        assert modp(37, 3) == 137438953472 % 3
        assert modp(38, 3) == 274877906944 % 3
        assert modp(39, 3) == 549755813888 % 3
        assert modp(40, 3) == 1099511627776 % 3
        assert modp(41, 3) == 2199023255552 % 3
        assert modp(42, 3) == 4398046511104 % 3
        assert modp(43, 3) == 8796093022208 % 3
        assert modp(44, 3) == 17592186044416 % 3
        assert modp(45, 3) == 35184372088832 % 3
        assert modp(46, 3) == 70368744177664 % 3
        assert modp(47, 3) == 140737488355328 % 3
        assert modp(48, 3) == 281474976710656 % 3
        assert modp(49, 3) == 562949953421312 % 3
        assert modp(50, 3) == 1125899906842624 % 3
        assert modp(51, 3) == 2251799813685248 % 3
        assert modp(52, 3) == 4503599627370496 % 3
        assert modp(53, 3) == 9007199254740992 % 3
        assert modp(54, 3) == 18014398509481984 % 3
        assert modp(55, 3) == 36028797018963968 % 3
        assert modp(56, 3) == 72057594037927936 % 3
        assert modp(57, 3) == 144115188075855872 % 3
        assert modp(58, 3) == 288230376151711744 % 3
        assert modp(59, 3) == 576460752303423488 % 3
        assert modp(60, 3) == 1152921504606846976 % 3
        assert modp(61, 3) == 2305843009213693952 % 3
        assert modp(62, 3) == 4611686018427387904 % 3
        assert modp(63, 3) == 9223372036854775808 % 3
        assert modp(64, 3) == 18446744073709551616 % 3
        assert modp(65, 3) == 36893488147419103232 % 3
        assert modp(66, 3) == 73786976294838206464 % 3
        assert modp(67, 3) == 147573952589676412928 % 3
        assert modp(68, 3) == 295147905179352825856 % 3
        assert modp(69, 3) == 590295810358705651712 % 3
        assert modp(70, 3) == 1180591620717411303424 % 3
        assert modp(71, 3) == 2361183241434822606848 % 3
        assert modp(72, 3) == 4722366482869645213696 % 3
        assert modp(73, 3) == 9444732965739290427392 % 3
        assert modp(74, 3) == 18889465931478580854784 % 3
        assert modp(75, 3) == 37778931862957161709568 % 3
        assert modp(76, 3) == 75557863725914323419136 % 3
        assert modp(77, 3) == 151115727451828646838272 % 3
        assert modp(78, 3) == 302231454903657293676544 % 3
        assert modp(79, 3) == 604462909807314587353088 % 3
        assert modp(80, 3) == 1208925819614629174706176 % 3
        assert modp(81, 3) == 2417851639229258349412352 % 3
        assert modp(82, 3) == 4835703278458516698824704 % 3
        assert modp(83, 3) == 9671406556917033397649408 % 3
        assert modp(84, 3) == 19342813113834066795298816 % 3
        assert modp(85, 3) == 38685626227668133590597632 % 3
        assert modp(86, 3) == 77371252455336267181195264 % 3
        assert modp(87, 3) == 154742504910672534362390528 % 3
        assert modp(88, 3) == 309485009821345068724781056 % 3
        assert modp(89, 3) == 618970019642690137449562112 % 3
        assert modp(90, 3) == 1237940039285380274899124224 % 3
        assert modp(91, 3) == 2475880078570760549798248448 % 3
        assert modp(92, 3) == 4951760157141521099596496896 % 3
        assert modp(93, 3) == 9903520314283042199192993792 % 3
        assert modp(94, 3) == 19807040628566084398385987584 % 3
        assert modp(95, 3) == 39614081257132168796771975168 % 3
        assert modp(96, 3) == 79228162514264337593543950336 % 3
        assert modp(97, 3) == 158456325028528675187087900672 % 3
        assert modp(98, 3) == 316912650057057350374175801344 % 3
        assert modp(99, 3) == 633825300114