// VowelsCountTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains one unit test case for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
@Test
    public void testVowelsCount() {
        assertEquals(0, VowelsCount.vowelsCount("abcdef"));
        assertEquals(1, VowelsCount.vowelsCount("abcd"));
        assertEquals(2, VowelsCount.vowelsCount("xy"));
        assertEquals(3, VowelsCount.vowelsCount("abY"));
        assertEquals(1, VowelsCount.vowelsCount("ABEDY"));
        assertEquals(1, VowelsCount.vowelsCount("abc"));
        assertEquals(2, VowelsCount.vowelsCount("ae"));
        assertEquals(1, VowelsCount.vowelsCount("ACE"));
    }
}
