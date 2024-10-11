# id_148_Test.java
from scenario3.id_148 import bf

import pytest

class id_148_Test:
    """
    Test class of id_148.py.
    It contains ten unit test cases for the :func:`scenario3.id_148.bf`.
    """


    def test_bf_1(self):
        """
        Test case for the function bf.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")
		
    def test_bf_2(self):
        """
        Test case for the function bf.
        """
        assert bf("Earth", "Mercury") == ("Venus")
		
    def test_bf_3(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
		
    def test_bf_4(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Mercury") == ()
		
    def test_bf_5(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Pluto") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_bf_6(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Mercury") == ()
		
    def test_bf_7(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Pluto") == ()
		
    def test_bf_8(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Uranus") == ()
		
    def test_bf_9(self):
        """
        Test case for the function bf.
        """
        assert bf("Uranus", "Pluto") == ()
		
    def test_bf_10(self):
        """
        Test case for the function bf.
        """
        assert bf("Uranus", "Uranus") == ()
		
# id_148_Test.py
from scenario3.id_148 import bf

import pytest

class id_148_Test:
    """
    Test class of id_148.py.
    It contains ten unit test cases for the :func:`scenario3.id_148.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case for the function bf.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")
		
    def test_bf_2(self):
        """
        Test case for the function bf.
        """
        assert bf("Earth", "Mercury") == ("Venus")
		
    def test_bf_3(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
		
    def test_bf_4(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Mercury") == ()
		
    def test_bf_5(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Pluto") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_bf_6(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Mercury") == ()
		
    def test_bf_7(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Pluto") == ()
		
    def test_bf_8(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Uranus") == ()
		
    def test_bf_9(self):
        """
        Test case for the function bf.
        """
        assert bf("Uranus", "Pluto") == ()
		
    def test_bf_10(self):
        """
        Test case for the function bf.
        """
        assert bf("Uranus", "Uranus") == ()
		
# id_149.py

def bf(planet1, planet2):
    '''
    There are eight planets in our solar system: the closerst to the Sun 
    is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn, 
    Uranus, Neptune.
    Write a function that takes two planet names as strings planet1 and planet2. 
    The function should return a tuple containing all planets whose orbits are 
    located between the orbit of planet1 and the orbit of planet2, sorted by 
    the proximity to the sun. 
    The function should return an empty tuple if planet1 or planet2
    are not correct planet names. 
    Examples
    bf("Jupiter", "Neptune") ==> ("Saturn", "Uranus")
    bf("Earth", "Mercury") ==> ("Venus")
    bf("Mercury", "Uranus") ==> ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
    '''

    pass
# id_149_Test.java
from scenario3.id_149 import bf

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`scenario3.id_149.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case for the function bf.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")
		
    def test_bf_2(self):
        """
        Test case for the function bf.
        """
        assert bf("Earth", "Mercury") == ("Venus")
		
    def test_bf_3(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
		
    def test_bf_4(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Mercury") == ()
		
    def test_bf_5(self):
        """
        Test case for the function bf.
        """
        assert bf("Mercury", "Pluto") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
		
    def test_bf_6(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Mercury") == ()
		
    def test_bf_7(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Pluto") == ()
		
    def test_bf_8(self):
        """
        Test case for the function bf.
        """
        assert bf("Pluto", "Uranus") == ()
		
    def test_bf_9(self):
        """
        Test case for the function bf.
        """
        assert bf("Uranus", "Pluto") == ()
		
    def test_bf_10(self):
        """
        Test case for the function bf.
        """
        assert bf("Uranus", "Uranus") == ()
		
# id_149_Test.py
from scenario3.id_149 import bf

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`scenario3.id_149.bf`.
    """