```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BfTest {

    @Test
    void testBfJupiterNeptune() {
        List<Object> expected = new ArrayList<>();
        expected.add("Saturn");
        expected.add("Uranus");
        assertEquals(expected, Bf.bf("Jupiter", "Neptune"));
    }

    @Test
    void testBfEarthMercury() {
        List<Object> expected = new ArrayList<>();
        expected.add("Venus");
        assertEquals(expected, Bf.bf("Earth", "Mercury"));
    }

    @Test
    void testBfMercuryUranus() {
        List<Object> expected = new ArrayList<>();
        expected.add("Venus");
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        assertEquals(expected, Bf.bf("Mercury", "Uranus"));
    }

    @Test
    void testBfNeptuneVenus() {
        List<Object> expected = new ArrayList<>();
        expected.add("Earth");
        expected.add("Mars");
        expected.add("Jupiter");
        expected.add("Saturn");
        expected.add("Uranus");
        assertEquals(expected, Bf.bf("Neptune", "Venus"));
    }

    @Test
    void testBfEarthEarth() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Bf.bf("Earth", "Earth"));
    }

    @Test
    void testBfMarsEarth() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Bf.bf("Mars", "Earth"));
    }

    @Test
    void testBfJupiterMakemake() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Bf.bf("Jupiter", "Makemake"));
    }

    @Test
    void testBfInvalidPlanets() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Bf.bf("InvalidPlanet", "Makemake"));
    }
}
```
```