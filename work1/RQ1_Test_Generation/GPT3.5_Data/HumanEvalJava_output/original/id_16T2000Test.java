```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountDistinctCharactersTest {

    @Test
    void testCountDistinctCharacters_xyzXYZ() {
        assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
    }

    @Test
    void testCountDistinctCharacters_Jerry() {
        assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
    }

    @Test
    void testCountDistinctCharacters_emptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    @Test
    void testCountDistinctCharacters_abcde() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
    }

    @Test
    void testCountDistinctCharacters_abcdecadeCADE() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
    }

    @Test
    void testCountDistinctCharacters_aaaaAAAAaaaa() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
    }

    @Test
    void testCountDistinctCharacters_Jerry_jERRY_JeRRRY() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }
}
```
```java
package original;

import java.util.HashSet;
import java.util.Set;

class CountDistinctCharacters {

    public static int countDistinctCharacters(String string) {
        Set<Character> distinctCharacters = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            distinctCharacters.add(Character.toLowerCase(string.charAt(i)));
        }
        return distinctCharacters.size();
    }
}
```