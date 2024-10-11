// ValidDateTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
			// Test case 1: Test a valid date
    @Test
    void testValidDate() {
        assertTrue(ValidDate.validDate("12-31-2020"));
    }

    // Test case 2: Test a date with invalid length
    @Test
    void testInvalidLength() {
        assertFalse(ValidDate.validDate("12-31-20"));
    }

    // Test case 3: Test a date with invalid format
    @Test
    void testInvalidFormat() {
        assertFalse(ValidDate.validDate("12/31/2020"));
    }

    // Test case 4: Test a date with invalid month
    @Test
    void testInvalidMonth() {
        assertFalse(ValidDate.validDate("13-31-2020"));
    }

    // Test case 5: Test a date with invalid day
    @Test
    void testInvalidDay() {
        assertFalse(ValidDate.validDate("12-32-2020"));
    }

    // Test case 6: Test a date with invalid year
    @Test
    void testInvalidYear() {
        assertFalse(ValidDate.validDate("12-31-20"));
    }

    // Test case 7: Test a date with invalid month and day
    @Test
    void testInvalidMonthAndDay() {
        assertFalse(ValidDate.validDate("04-31-2020"));
    }

    // Test case 8: Test a date with invalid month and year
    @Test
    void testInvalidMonthAndYear() {
        assertFalse(ValidDate.validDate("13-31-20"));
    }

    // Test case 9: Test a date with invalid day and year
    @Test
    void testInvalidDayAndYear() {
        assertFalse(ValidDate.validDate("12-32-20"));
    }

    // Test case 10: Test a date with invalid month, day and year
    @Test
    void testInvalidMonthDayAndYear() {
        assertFalse(ValidDate.validDate("13-32-20"));
    }
}