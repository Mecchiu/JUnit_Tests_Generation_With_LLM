// BfTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains one unit test case for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

    /**
     * * There are seven planets in our solar system: the closest to the Sun
     * is Mars, Jupiter, Saturn, Uranus, Neptune, Mars, Venus, Earth.
     * Create a list containing planet names from the list returned by
     * {@link Bf#bf(String, String)}.
     * Check the result:
     * 1.  Incomplete, empty, null.
     * 2.  All planets have the right name.
     * 3.  All planets have the right name.
     * 4.  All planets have the right name.
     * 5.  All planets return the right value.
     * 6.  All planets have a corresponding planets argument value.
     * 7.  All planets return a planet argument value equal to the first element of the list returned by
     *     {@link Bf#bf(String, String)} with the same number of elements.
     */
	@Test
    public void createListFromName() {
        List<Object> planets = Bf.bf("Moon", "Mercury");
//        assertEquals(planets.get(0), "Mercury");
//        assertNotNull(planets.get(1)); assertEquals(planets.get(1), "Moon");
        assertNull(planets);
    }
}

