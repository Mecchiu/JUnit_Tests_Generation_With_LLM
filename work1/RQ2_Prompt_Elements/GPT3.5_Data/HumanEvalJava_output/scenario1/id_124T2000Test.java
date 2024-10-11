// ValidDateTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
    
    @Test
    void testValidDate() {
        assertTrue(ValidDate.validDate("01-01-2020"));
        assertTrue(ValidDate.validDate("02-29-2020"));
        assertTrue(ValidDate.validDate("04-30-2020"));
        assertTrue(ValidDate.validDate("06-30-2020"));
        assertTrue(ValidDate.validDate("09-30-2020"));
        assertTrue(ValidDate.validDate("11-30-2020"));
        assertFalse(ValidDate.validDate("00-01-2020"));
        assertFalse(ValidDate.validDate("13-01-2020"));
        assertFalse(ValidDate.validDate("01-00-2020"));
        assertFalse(ValidDate.validDate("01-32-2020"));
    }
}