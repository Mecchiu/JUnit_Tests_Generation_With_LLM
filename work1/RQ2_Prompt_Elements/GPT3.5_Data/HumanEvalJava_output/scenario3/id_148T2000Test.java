// Bf.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Bf {

    /**
     * * There are eight planets in our solar system: the closest to the Sun
     * is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn,
     * Uranus, Neptune.
     * Write a function that takes two planet names as strings planet1 and planet2.
     * The function should return a tuple containing all planets whose orbits are
     * located between the orbit of planet1 and the orbit of planet2, sorted by
     * the proximity to the sun.
     * The function should return an empty tuple if planet1 or planet2
     * are not correct planet names.
     * Examples
     * bf("Jupiter", "Neptune") ==> ("Saturn", "Uranus")
     * bf("Earth", "Mercury") ==> ("Venus")
     * bf("Mercury", "Uranus") ==> ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
     *
     * > bf("Jupiter", "Neptune")
     * ["Saturn", "Uranus"]
     * > bf("Earth", "Mercury")
     * ["Venus"]
     * > bf("Mercury", "Uranus")
     * ["Venus", "Earth", "Mars", "Jupiter", "Saturn"]
     * > bf("Neptune", "Venus")
     * ["Earth", "Mars", "Jupiter", "Saturn", "Uranus"]
     * > bf("Earth", "Earth")
     * []
     * > bf("Mars", "Earth")
     * []
     * > bf("Jupiter", "Makemake")
     * []
     */
    public static List<String> bf(String planet1, String planet2) {
        Map<String, Integer> planets = new HashMap<>();
        planets.put("Mercury", 1);
        planets.put("Venus", 2);
        planets.put("Earth", 3);
        planets.put("Mars", 4);
        planets.put("Jupiter", 5);
        planets.put("Saturn", 6);
        planets.put("Uranus", 7);
        planets.put("Neptune", 8);

        List<String> result = new ArrayList<>();

        if (!planets.containsKey(planet1) || !planets.containsKey(planet2)) {
            return result;
        }

        int orbit1 = planets.get(planet1);
        int orbit2 = planets.get(planet2);

        if (orbit1 == orbit2) {
            return result;
        }

        int minOrbit = Math.min(orbit1, orbit2);
        int maxOrbit = Math.max(orbit1, orbit2);

        for (Map.Entry<String, Integer> entry : planets.entrySet()) {
            int orbit = entry.getValue();
            if (orbit > minOrbit && orbit < maxOrbit) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}

// BfTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

    @Test
    void testBf1() {
        List<String> expected = Arrays.asList("Saturn", "Uranus");
        List<String> actual = Bf.bf("Jupiter", "Neptune");
        assertEquals(expected, actual);
    }

    @Test
    void testBf2() {
        List<String> expected = Arrays.asList("Venus");
        List<String> actual = Bf.bf("Earth", "Mercury");
        assertEquals(expected, actual);
    }

    @Test
    void testBf3() {
        List<String> expected = Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn");
        List<String> actual = Bf.bf("Mercury", "Uranus");
        assertEquals(expected, actual);
    }

    @Test
    void testBf4() {
        List<String> expected = Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus");
        List<String> actual = Bf.bf("Neptune", "Venus");
        assertEquals(expected, actual);
    }

    @Test
    void testBf5() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Earth", "Earth");
        assertEquals(expected, actual);
    }

    @Test
    void testBf6() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Mars", "Earth");
        assertEquals(expected, actual);
    }

    @Test
    void testBf7() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Jupiter", "Makemake");
        assertEquals(expected, actual);
    }

    @Test
    void testBf8() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Makemake", "Jupiter");
        assertEquals(expected, actual);
    }

    @Test
    void testBf9() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Pluto", "Mars");
        assertEquals(expected, actual);
    }

    @Test
    void testBf10() {
        List<String> expected = Arrays.asList();
        List<String> actual = Bf.bf("Mars", "Pluto");
        assertEquals(expected, actual);
    }
}