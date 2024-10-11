// BfTest.java
package scenario2;

import java.util.ArrayList;
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
    void testBfWithCorrectPlanets() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        assertEquals(expected, Bf.bf("Venus", "Mars"));
    }

    @Test
    void testBfWithSamePlanets() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Earth", "Earth"));
    }

    @Test
    void testBfWithIncorrectPlanet1() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Pluto", "Mars"));
    }

    @Test
    void testBfWithIncorrectPlanet2() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Venus", "Pluto"));
    }

    @Test
    void testBfWithIncorrectPlanets() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Pluto", "Pluto"));
    }

    @Test
    void testBfWithPlanet1BeforePlanet2() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        assertEquals(expected, Bf.bf("Venus", "Mars"));
    }

    @Test
    void testBfWithPlanet2BeforePlanet1() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars"));
        assertEquals(expected, Bf.bf("Mars", "Venus"));
    }

    @Test
    void testBfWithPlanet1AndPlanet2Adjacent() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, Bf.bf("Earth", "Mars"));
    }

    @Test
    void testBfWithPlanet1AndPlanet2SeparatedByOnePlanet() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus"));
        assertEquals(expected, Bf.bf("Earth", "Mercury"));
    }

    @Test
    void testBfWithPlanet1AndPlanet2SeparatedByMoreThanOnePlanet() {
        List<Object> expected = new ArrayList<Object>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        assertEquals(expected, Bf.bf("Venus", "Saturn"));
    }
}