# id_63_Test.java
from scenario1.id_63 import fibfib

import pytest

class id_63_Test:
    """
    Test class of id_63.py.
    It contains ten unit test cases for the :func:`scenario1.id_63.fibfib`.
    """


    def test_fibfib_1(self):
        """
        Test case for the :func:`scenario1.id_63.fibfib`.
        """
        assert fibfib(0) == 0
        assert fibfib(1) == 0
        assert fibfib(2) == 1
        assert fibfib(3) == 1
        assert fibfib(4) == 2
        assert fibfib(5) == 4
        assert fibfib(6) == 7
        assert fibfib(7) == 13
        assert fibfib(8) == 24
        assert fibfib(9) == 44
        assert fibfib(10) == 81
        assert fibfib(11) == 149
        assert fibfib(12) == 274
        assert fibfib(13) == 504
        assert fibfib(14) == 927
        assert fibfib(15) == 1705
        assert fibfib(16) == 3136
        assert fibfib(17) == 5768
        assert fibfib(18) == 10609
        assert fibfib(19) == 19513
        assert fibfib(20) == 35890
        assert fibfib(21) == 66012
        assert fibfib(22) == 121415
        assert fibfib(23) == 223317
        assert fibfib(24) == 410744
        assert fibfib(25) == 755476
        assert fibfib(26) == 1389537
        assert fibfib(27) == 2555757
        assert fibfib(28) == 4700770
        assert fibfib(29) == 8646064
        assert fibfib(30) == 15902591
        assert fibfib(31) == 29249425
        assert fibfib(32) == 53798080
        assert fibfib(33) == 98950096
        assert fibfib(34) == 181997601
        assert fibfib(35) == 334745777
        assert fibfib(36) == 615693474
        assert fibfib(37) == 1132436852
        assert fibfib(38) == 2082876103
        assert fibfib(39) == 3831006429
        assert fibfib(40) == 7046314390
        assert fibfib(41) == 13049695449
        assert fibfib(42) == 24326970116
        assert fibfib(43) == 44677513117
        assert fibfib(44) == 82724026156
        assert fibfib(45) == 153708698712
        assert fibfib(46) == 283326957209
        assert fibfib(47) == 523347633027
        assert fibfib(48) == 967140655758
        assert fibfib(49) == 1779979416994
        assert fibfib(50) == 3292353435671
        assert fibfib(51) == 6092126482325
        assert fibfib(52) == 11244674036800
        assert fibfib(53) == 20828761031723
        assert fibfib(54) == 38789684543876
        assert fibfib(55) == 71789798769185
        assert fibfib(56) == 133357651828216
        assert fibfib(57) == 247588007854345
        assert fibfib(58) == 461749030642916
        assert fibfib(59) == 859006548227789
        assert fibfib(60) == 1598015958704920
        assert fibfib(61) == 2968030555722897
        assert fibfib(62) == 5534064877022376
        assert fibfib(63) == 10284720757613721
        assert fibfib(64) == 19005201170230044
        assert fibfib(65) == 35422484817926200
        assert fibfib(66) == 66438388149871301
        assert fibfib(67) == 123332068249423216
        assert fibfib(68) == 229345491278069073
        assert fibfib(69) == 429569872564781300
        assert fibfib(70) == 806515533049393201
        assert fibfib(71) == 1508450417457521512
        assert fibfib(72) == 2833269572093701713
        assert fibfib(73) == 5233476330273605376
        assert fibfib(74) == 9671406556917033449
        assert fibfib(75) == 17799794160047141824
        assert fibfib(76) == 32923534358418653577
        assert fibfib(77) == 60921264823487557704
        assert fibfib(78) == 112446740368008913449
        assert fibfib(79) == 208287610317232482376
        assert fibfib(80) == 387896845438832219161
        assert fibfib(81) == 717897987691852588770
        assert fibfib(82) == 1333576518282161159609
        assert fibfib(83) == 2475880078570760549798
        assert fibfib(84) == 4617490306496282961609
        assert fibfib(85) == 8590065482277323632896
        assert fibfib(86) == 15980159587049706478397
        assert fibfib(87) == 29680305557227834657840
        assert fibfib(88) == 55340648770223838753961
        assert fibfib(89) == 102847207576137174139228
        assert fibfib(90) == 190052011702300648935781
        assert fibfib(91) == 354224848179261915075276
        assert fibfib(92) == 664383881498713154835800
        assert fibfib(93) == 1233320682494232169069713
        assert fibfib(94) == 2293454912780690892278126
        assert fibfib(95) == 4295698725647813123138241
        assert fibfib(96) == 8065155330493931082228800
        assert fibfib(97) == 15084504174575211651914241
        assert fibfib(98) == 28332695720937017149957126
        assert fibfib(99) == 52334763302736053721354401
        assert fibfib(100) == 967140655691703339764940736
        assert fibfib(101) == 1779979416004714189735077913
        assert fibfib(102) == 3292353435841865358907296160
        assert fibfib(103) == 6092126482348755715257841401
        assert fibfib(104) == 11244674036800891376201189736
        assert fibfib(105) == 20828761031723248235415617113
        assert fibfib(106) == 38789684543883221912250144160
        assert fibfib(107) == 71789798769185258877043289401
        assert fibfib(108) == 133357651828216115910949028176
        assert fibfib(109) == 247588007857076054929838912113
        assert fibfib(110) == 461749030649628296161169044160
        assert fibfib(111) == 859006548227732363276428829401
        assert fibfib(112) == 1598015958704970647840163572816
        assert fibfib(113) == 2968030555722783465811556714113
        assert fibfib(114) == 5534064877022383875411794192320
        assert fibfib(115) == 10284720757613717413913