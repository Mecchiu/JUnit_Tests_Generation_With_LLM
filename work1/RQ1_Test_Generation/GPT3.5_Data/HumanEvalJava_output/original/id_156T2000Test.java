```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntToMiniRomanTest {

    @Test
    void testIntToMiniRoman_19() {
        assertEquals("xix", IntToMiniRoman.intToMiniRoman(19));
    }

    @Test
    void testIntToMiniRoman_152() {
        assertEquals("clii", IntToMiniRoman.intToMiniRoman(152));
    }

    @Test
    void testIntToMiniRoman_251() {
        assertEquals("ccli", IntToMiniRoman.intToMiniRoman(251));
    }

    @Test
    void testIntToMiniRoman_426() {
        assertEquals("cdxxvi", IntToMiniRoman.intToMiniRoman(426));
    }

    @Test
    void testIntToMiniRoman_500() {
        assertEquals("d", IntToMiniRoman.intToMiniRoman(500));
    }

    @Test
    void testIntToMiniRoman_1() {
        assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
    }

    @Test
    void testIntToMiniRoman_4() {
        assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
    }

    @Test
    void testIntToMiniRoman_43() {
        assertEquals("xliii", IntToMiniRoman.intToMiniRoman(43));
    }

    @Test
    void testIntToMiniRoman_90() {
        assertEquals("xc", IntToMiniRoman.intToMiniRoman(90));
    }

    @Test
    void testIntToMiniRoman_94() {
        assertEquals("xciv", IntToMiniRoman.intToMiniRoman(94));
    }

    @Test
    void testIntToMiniRoman_532() {
        assertEquals("dxxxii", IntToMiniRoman.intToMiniRoman(532));
    }

    @Test
    void testIntToMiniRoman_900() {
        assertEquals("cm", IntToMiniRoman.intToMiniRoman(900));
    }

    @Test
    void testIntToMiniRoman_994() {
        assertEquals("cmxciv", IntToMiniRoman.intToMiniRoman(994));
    }

    @Test
    void testIntToMiniRoman_1000() {
        assertEquals("m", IntToMiniRoman.intToMiniRoman(1000));
    }
}
```