# id_148_Test.java
from scenario2.id_148 import bf

import pytest

class id_148_Test:
    """
    Test class of id_148.py.
    It contains ten unit test cases for the :func:`scenario2.id_148.bf`.
    """


    def test_id_148_01(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Venus") == ("Venus",)
		
    def test_id_148_02(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Mercury") == ("Venus",)
		
    def test_id_148_03(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Earth") == ("Earth",)
		
    def test_id_148_04(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Venus") == ("Earth",)
		
    def test_id_148_05(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Mars") == ("Mars",)
		
    def test_id_148_06(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Earth") == ("Mars",)
		
    def test_id_148_07(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Jupiter") == ("Jupiter",)
		
    def test_id_148_08(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Mars") == ("Jupiter",)
		
    def test_id_148_09(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Saturn") == ("Saturn",)
		
    def test_id_148_10(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Jupiter") == ("Saturn",)
		
    def test_id_148_11(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Uranus") == ("Uranus",)
		
    def test_id_148_12(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Saturn") == ("Uranus",)
		
    def test_id_148_13(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Neptune") == ("Neptune",)
		
    def test_id_148_14(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Uranus") == ("Neptune",)
		
    def test_id_148_15(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Earth") == ("Venus", "Earth")
		
    def test_id_148_16(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Mercury") == ("Venus", "Earth")
		
    def test_id_148_17(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Mars") == ("Earth", "Mars")
		
    def test_id_148_18(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Venus") == ("Earth", "Mars")
		
    def test_id_148_19(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Jupiter") == ("Mars", "Jupiter")
		
    def test_id_148_20(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Earth") == ("Mars", "Jupiter")
		
    def test_id_148_21(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Saturn") == ("Jupiter", "Saturn")
		
    def test_id_148_22(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Mars") == ("Jupiter", "Saturn")
		
    def test_id_148_23(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Uranus") == ("Saturn", "Uranus")
		
    def test_id_148_24(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Jupiter") == ("Saturn", "Uranus")
		
    def test_id_148_25(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Neptune") == ("Uranus", "Neptune")
		
    def test_id_148_26(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Saturn") == ("Uranus", "Neptune")
		
    def test_id_148_27(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Mars") == ("Venus", "Earth", "Mars")
		
    def test_id_148_28(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Mercury") == ("Venus", "Earth", "Mars")
		
    def test_id_148_29(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Jupiter") == ("Earth", "Mars", "Jupiter")
		
    def test_id_148_30(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Venus") == ("Earth", "Mars", "Jupiter")
		
    def test_id_148_31(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Saturn") == ("Mars", "Jupiter", "Saturn")
		
    def test_id_148_32(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Earth") == ("Mars", "Jupiter", "Saturn")
		
    def test_id_148_33(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Uranus") == ("Jupiter", "Saturn", "Uranus")
		
    def test_id_148_34(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Mars") == ("Jupiter", "Saturn", "Uranus")
		
    def test_id_148_35(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus", "Neptune")
		
    def test_id_148_36(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Jupiter") == ("Saturn", "Uranus", "Neptune")
		
    def test_id_148_37(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Jupiter") == ("Venus", "Earth", "Mars", "Jupiter")
		
    def test_id_148_38(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Jupiter", "Mercury") == ("Venus", "Earth", "Mars", "Jupiter")
		
    def test_id_148_39(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Saturn") == ("Earth", "Mars", "Jupiter", "Saturn")
		
    def test_id_148_40(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Venus") == ("Earth", "Mars", "Jupiter", "Saturn")
		
    def test_id_148_41(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Uranus") == ("Mars", "Jupiter", "Saturn", "Uranus")
		
    def test_id_148_42(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Earth") == ("Mars", "Jupiter", "Saturn", "Uranus")
		
    def test_id_148_43(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mars", "Neptune") == ("Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_44(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Mars") == ("Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_45(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Saturn") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
		
    def test_id_148_46(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Saturn", "Mercury") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
		
    def test_id_148_47(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Uranus") == ("Earth", "Mars", "Jupiter", "Saturn", "Uranus")
		
    def test_id_148_48(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Venus") == ("Earth", "Mars", "Jupiter", "Saturn", "Uranus")
		
    def test_id_148_49(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Earth", "Neptune") == ("Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_50(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Earth") == ("Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_51(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus")
		
    def test_id_148_52(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Uranus", "Mercury") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus")
		
    def test_id_148_53(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Neptune") == ("Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_54(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Venus") == ("Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_55(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Neptune") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_56(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Neptune", "Mercury") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_id_148_57(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Mercury", "Mercury") == ()
		
    def test_id_148_58(self):
        """
        Test case for the function :func:`scenario2.id_148.bf`.
        """
        assert bf("Venus", "Venus") == ()
		
    def test_id_148_59(self):
        """
        Test case for the