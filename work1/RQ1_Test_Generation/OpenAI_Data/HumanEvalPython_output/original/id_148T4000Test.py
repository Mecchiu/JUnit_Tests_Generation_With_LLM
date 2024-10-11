# id_148_Test.java
from original.id_148 import bf

import pytest

class id_148_Test:
    """
    Test class of id_148.py.
    It contains ten unit test cases for the :func:`original.id_148.bf`.
    """


    def test_bf_1(self):
        """
        Test case 1 for :func:`original.id_148.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")

    def test_bf_2(self):
        """
        Test case 2 for :func:`original.id_148.bf`.
        """
        assert bf("Earth", "Mercury") == ("Venus",)

    def test_bf_3(self):
        """
        Test case 3 for :func:`original.id_148.bf`.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")

    def test_bf_4(self):
        """
        Test case 4 for :func:`original.id_148.bf`.
        """
        assert bf("Mercury", "Mercury") == ()

    def test_bf_5(self):
        """
        Test case 5 for :func:`original.id_148.bf`.
        """
        assert bf("Mercury", "Pluto") == ()

    def test_bf_6(self):
        """
        Test case 6 for :func:`original.id_148.bf`.
        """
        assert bf("Pluto", "Mercury") == ()

    def test_bf_7(self):
        """
        Test case 7 for :func:`original.id_148.bf`.
        """
        assert bf("Pluto", "Pluto") == ()

    def test_bf_8(self):
        """
        Test case 8 for :func:`original.id_148.bf`.
        """
        assert bf("Earth", "Earth") == ()

    def test_bf_9(self):
        """
        Test case 9 for :func:`original.id_148.bf`.
        """
        assert bf("Earth", "Jupiter") == ("Venus", "Mars")

    def test_bf_10(self):
        """
        Test case 10 for :func:`original.id_148.bf`.
        """
        assert bf("Jupiter", "Earth") == ("Saturn", "Uranus", "Neptune")

# id_148_Test.py
from original.id_148 import bf

import pytest

class id_148_Test:
    """
    Test class of id_148.py.
    It contains ten unit test cases for the :func:`original.id_148.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case 1 for :func:`original.id_148.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")

    def test_bf_2(self):
        """
        Test case 2 for :func:`original.id_148.bf`.
        """
        assert bf("Earth", "Mercury") == ("Venus",)

    def test_bf_3(self):
        """
        Test case 3 for :func:`original.id_148.bf`.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")

    def test_bf_4(self):
        """
        Test case 4 for :func:`original.id_148.bf`.
        """
        assert bf("Mercury", "Mercury") == ()

    def test_bf_5(self):
        """
        Test case 5 for :func:`original.id_148.bf`.
        """
        assert bf("Mercury", "Pluto") == ()

    def test_bf_6(self):
        """
        Test case 6 for :func:`original.id_148.bf`.
        """
        assert bf("Pluto", "Mercury") == ()

    def test_bf_7(self):
        """
        Test case 7 for :func:`original.id_148.bf`.
        """
        assert bf("Pluto", "Pluto") == ()

    def test_bf_8(self):
        """
        Test case 8 for :func:`original.id_148.bf`.
        """
        assert bf("Earth", "Earth") == ()

    def test_bf_9(self):
        """
        Test case 9 for :func:`original.id_148.bf`.
        """
        assert bf("Earth", "Jupiter") == ("Venus", "Mars")

    def test_bf_10(self):
        """
        Test case 10 for :func:`original.id_148.bf`.
        """
        assert bf("Jupiter", "Earth") == ("Saturn", "Uranus", "Neptune")

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

    planet_names = ("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    if planet1 not in planet_names or planet2 not in planet_names or planet1 == planet2:
        return ()
    planet1_index = planet_names.index(planet1)
    planet2_index = planet_names.index(planet2)
    if planet1_index < planet2_index:
        return (planet_names[planet1_index + 1: planet2_index])
    else:
        return (planet_names[planet2_index + 1 : planet1_index])

# id_149_Test.java
from original.id_149 import bf

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`original.id_149.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case 1 for :func:`original.id_149.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")

    def test_bf_2(self):
        """
        Test case 2 for :func:`original.id_149.bf`.
        """
        assert bf("Earth", "Mercury") == ("Venus",)

    def test_bf_3(self):
        """
        Test case 3 for :func:`original.id_149.bf`.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")

    def test_bf_4(self):
        """
        Test case 4 for :func:`original.id_149.bf`.
        """
        assert bf("Mercury", "Mercury") == ()

    def test_bf_5(self):
        """
        Test case 5 for :func:`original.id_149.bf`.
        """
        assert bf("Mercury", "Pluto") == ()

    def test_bf_6(self):
        """
        Test case 6 for :func:`original.id_149.bf`.
        """
        assert bf("Pluto", "Mercury") == ()

    def test_bf_7(self):
        """
        Test case 7 for :func:`original.id_149.bf`.
        """
        assert bf("Pluto", "Pluto") == ()

    def test_bf_8(self):
        """
        Test case 8 for :func:`original.id_149.bf`.
        """
        assert bf("Earth", "Earth") == ()

    def test_bf_9(self):
        """
        Test case 9 for :func:`original.id_149.bf`.
        """
        assert bf("Earth", "Jupiter") == ("Venus", "Mars")

    def test_bf_10(self):
        """
        Test case 10 for :func:`original.id_149.bf`.
        """
        assert bf("Jupiter", "Earth") == ("Saturn", "Uranus", "Neptune")

# id_149_Test.py
from original.id_149 import bf

import pytest

class id_149_Test:
    """
    Test class of id_149.py.
    It contains ten unit test cases for the :func:`original.id_149.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case 1 for :func:`original.id_149.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")

    def test_bf_2(self):
        """
        Test case 2 for :func:`original.id_149.bf`.
        """
        assert bf("Earth", "Mercury") == ("Venus",)

    def test_bf_3(self):
        """
        Test case 3 for :func:`original.id_149.bf`.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")

    def test_bf_4(self):
        """
        Test case 4 for :func:`original.id_149.bf`.
        """
        assert bf("Mercury", "Mercury") == ()

    def test_bf_5(self):
        """
        Test case 5 for :func:`original.id_149.bf`.
        """
        assert bf("Mercury", "Pluto") == ()

    def test_bf_6(self):
        """
        Test case 6 for :func:`original.id_149.bf`.
        """
        assert bf("Pluto", "Mercury") == ()

    def test_bf_7(self):
        """
        Test case 7 for :func:`original.id_149.bf`.
        """
        assert bf("Pluto", "Pluto") == ()

    def test_bf_8(self):
        """
        Test case 8 for :func:`original.id_149.bf`.
        """
        assert bf("Earth", "Earth") == ()

    def test_bf_9(self):
        """
        Test case 9 for :func:`original.id_149.bf`.
        """
        assert bf("Earth", "Jupiter") == ("Venus", "Mars")

    def test_bf_10(self):
        """
        Test case 10 for :func:`original.id_149.bf`.
        """
        assert bf("Jupiter", "Earth") == ("Saturn", "Uranus", "Neptune")

# id_150.py

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

    planet_names = ("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    if planet1 not in planet_names or planet2 not in planet_names or planet1 == planet2:
        return ()
    planet1_index = planet_names.index(planet1)
    planet2_index = planet_names.index(planet2)
    if planet1_index < planet2_index:
        return (planet_names[planet1_index + 1: planet2_index])
    else:
        return (planet_names[planet2_index + 1 : planet1_index])

# id_150_Test.java
from original.id_150 import bf

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`original.id_150.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case 1 for :func:`original.id_150.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")

    def test_bf_2(self):
        """
        Test case 2 for :func:`original.id_150.bf`.
        """
        assert bf("Earth", "Mercury") == ("Venus",)

    def test_bf_3(self):
        """
        Test case 3 for :func:`original.id_150.bf`.
        """
        assert bf("Mercury", "Uranus") == ("Venus", "Earth", "Mars", "Jupiter", "Saturn")

    def test_bf_4(self):
        """
        Test case 4 for :func:`original.id_150.bf`.
        """
        assert bf("Mercury", "Mercury") == ()

    def test_bf_5(self):
        """
        Test case 5 for :func:`original.id_150.bf`.
        """
        assert bf("Mercury", "Pluto") == ()

    def test_bf_6(self):
        """
        Test case 6 for :func:`original.id_150.bf`.
        """
        assert bf("Pluto", "Mercury") == ()

    def test_bf_7(self):
        """
        Test case 7 for :func:`original.id_150.bf`.
        """
        assert bf("Pluto", "Pluto") == ()

    def test_bf_8(self):
        """
        Test case 8 for :func:`original.id_150.bf`.
        """
        assert bf("Earth", "Earth") == ()

    def test_bf_9(self):
        """
        Test case 9 for :func:`original.id_150.bf`.
        """
        assert bf("Earth", "Jupiter") == ("Venus", "Mars")

    def test_bf_10(self):
        """
        Test case 10 for :func:`original.id_150.bf`.
        """
        assert bf("Jupiter", "Earth") == ("Saturn", "Uranus", "Neptune")

# id_150_Test.py
from original.id_150 import bf

import pytest

class id_150_Test:
    """
    Test class of id_150.py.
    It contains ten unit test cases for the :func:`original.id_150.bf`.
    """
		
    def test_bf_1(self):
        """
        Test case 1 for :func:`original.id_150.bf`.
        """
        assert bf("Jupiter", "Neptune") == ("Saturn", "Uranus")

    def test_bf_2(self):
        """
        Test case 2 for :func:`original.id_150.bf`.
        """
        assert bf("Earth", "Mercury") == ("Ven