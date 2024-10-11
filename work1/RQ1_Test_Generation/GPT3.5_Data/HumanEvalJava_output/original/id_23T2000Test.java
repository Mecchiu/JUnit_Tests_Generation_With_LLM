```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrlenTest {

    @Test
    void testEmptyString() {
        assertEquals(0, Strlen.strlen(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, Strlen.strlen("x"));
    }

    @Test
    void testMultipleCharacterString() {
        assertEquals(3, Strlen.strlen("abc"));
    }

    @Test
    void testLongString() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    // Add more test cases as needed
}
```
