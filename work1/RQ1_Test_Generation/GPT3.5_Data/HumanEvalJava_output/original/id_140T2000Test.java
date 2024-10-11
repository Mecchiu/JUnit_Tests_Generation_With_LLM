```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FixSpacesTest {

    @Test
    void testFixSpacesExample() {
        assertEquals("Example", FixSpaces.fixSpaces("Example"));
    }

    @Test
    void testFixSpacesExample1() {
        assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
    }

    @Test
    void testFixSpacesExample2() {
        assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
    }

    @Test
    void testFixSpacesExample3() {
        assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
    }

    @Test
    void testFixSpacesMudasirHanif() {
        assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
    }

    @Test
    void testFixSpacesYellowYellowDirtyFellow() {
        assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    void testFixSpacesExaMple() {
        assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
    }

    @Test
    void testFixSpacesExa122Mple() {
        assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
    }

    // Add more test cases as needed
}
```
```