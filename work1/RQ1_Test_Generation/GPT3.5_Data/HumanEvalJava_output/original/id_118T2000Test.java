```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetClosestVowelTest {

    @Test
    void testGetClosestVowel_yogurt() {
        assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
    }

    @Test
    void testGetClosestVowel_FULL() {
        assertEquals("U", GetClosestVowel.getClosestVowel("FULL"));
    }

    @Test
    void testGetClosestVowel_quick() {
        assertEquals("", GetClosestVowel.getClosestVowel("quick"));
    }

    @Test
    void testGetClosestVowel_ab() {
        assertEquals("", GetClosestVowel.getClosestVowel("ab"));
    }

    @Test
    void testGetClosestVowel_easy() {
        assertEquals("", GetClosestVowel.getClosestVowel("easy"));
    }

    @Test
    void testGetClosestVowel_eAsy() {
        assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
    }

    @Test
    void testGetClosestVowel_ali() {
        assertEquals("", GetClosestVowel.getClosestVowel("ali"));
    }

    @Test
    void testGetClosestVowel_bad() {
        assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
    }

    @Test
    void testGetClosestVowel_most() {
        assertEquals("o", GetClosestVowel.getClosestVowel("most"));
    }

    @Test
    void testGetClosestVowel_anime() {
        assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
    }
}
```
