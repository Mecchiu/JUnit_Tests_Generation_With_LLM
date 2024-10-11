```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlipCaseTest {

    @Test
    void testFlipCaseWithEmptyString() {
        assertEquals("", FlipCase.flipCase(""));
    }

    @Test
    void testFlipCaseWithAllLowerCase() {
        assertEquals("HELLO", FlipCase.flipCase("hello"));
    }

    @Test
    void testFlipCaseWithAllUpperCase() {
        assertEquals("hello", FlipCase.flipCase("HELLO"));
    }

    @Test
    void testFlipCaseWithMixedCase() {
        assertEquals("hELLO", FlipCase.flipCase("Hello"));
    }

    @Test
    void testFlipCaseWithSpecialCharacters() {
        assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
    }

    @Test
    void testFlipCaseWithNumbers() {
        assertEquals("12345", FlipCase.flipCase("12345"));
    }

    @Test
    void testFlipCaseWithSpaces() {
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
    }

    @Test
    void testFlipCaseWithNullString() {
        assertThrows(NullPointerException.class, () -> FlipCase.flipCase(null));
    }

    @Test
    void testFlipCaseWithLongString() {
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
    }

    @Test
    void testFlipCaseWithSingleCharacter() {
        assertEquals("A", FlipCase.flipCase("a"));
    }
}
```
```