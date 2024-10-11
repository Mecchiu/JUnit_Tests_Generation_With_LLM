```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsumTest {

    @Test
    void testEmptyString() {
        assertEquals(0, Digitsum.digitSum(""));
    }

    @Test
    void testLowerCaseAndUpperCase() {
        assertEquals(131, Digitsum.digitSum("abAB"));
    }

    @Test
    void testMixedCharacters() {
        assertEquals(67, Digitsum.digitSum("abcCd"));
    }

    @Test
    void testWithLowerCase() {
        assertEquals(69, Digitsum.digitSum("helloE"));
    }

    @Test
    void testMultipleUpperCase() {
        assertEquals(131, Digitsum.digitSum("woArBld"));
    }

    @Test
    void testMixedCaseAndExtraCharacters() {
        assertEquals(153, Digitsum.digitSum("aAaaaXa"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(151, Digitsum.digitSum(" How are yOu?"));
    }

    @Test
    void testLongString() {
        assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
    }
}
```
