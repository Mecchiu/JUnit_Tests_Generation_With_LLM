```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeTest {

    @Test
    void testEncodeLowerCase() {
        assertEquals("tgst", Encode.encode("TEST"));
    }

    @Test
    void testEncodeMixedCase() {
        assertEquals("mWDCSKR", Encode.encode("Mudasir"));
    }

    @Test
    void testEncodeVowels() {
        assertEquals("ygs", Encode.encode("YES"));
    }

    @Test
    void testEncodeSentence() {
        assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
    }

    @Test
    void testEncodeLongSentence() {
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", Encode.encode("I DoNt KnOw WhAt tO WrItE"));
    }

    @Test
    void testEncodeEmptyString() {
        assertEquals("", Encode.encode(""));
    }

    @Test
    void testEncodeSingleLetter() {
        assertEquals("B", Encode.encode("a"));
    }

    @Test
    void testEncodeNumbers() {
        assertEquals("12345", Encode.encode("12345"));
    }

    @Test
    void testEncodeSpecialCharacters() {
        assertEquals("!@#$%", Encode.encode("!@#$%"));
    }

    @Test
    void testEncodeNull() {
        assertNull(Encode.encode(null));
    }
}
```
```