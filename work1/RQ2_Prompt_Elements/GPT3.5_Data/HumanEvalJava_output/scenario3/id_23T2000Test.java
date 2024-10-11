// Strlen.java
package scenario3;

class Strlen {

    /**
     * Return length of given string
     *
     * > strlen("")
     * 0
     * > strlen("abc")
     * 3
     * > strlen("")
     * 0
     * > strlen("x")
     * 1
     * > strlen("asdasnakj")
     * 9
     */
    public static int strlen(String string) {
        return string.length();
    }
}

// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
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
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }
    
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            Strlen.strlen(null);
        });
    }
}