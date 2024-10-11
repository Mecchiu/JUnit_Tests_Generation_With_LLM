// ValidDate.java
package scenario3;

class ValidDate {

    /**
     * You have to write a function which validates a given date string and
     * returns True if the date is valid otherwise False.
     * The date is valid if all of the following rules are satisfied:
     * 1. The date string is not empty.
     * 2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
     * 3. The months should not be less than 1 or higher than 12.
     * 4. The date should be in the format: mm-dd-yyyy
     *
     * for example:
     * validDate('03-11-2000') => True
     *
     * validDate('15-01-2012') => False
     *
     * validDate('04-0-2040') => False
     *
     * validDate('06-04-2020') => True
     *
     * validDate('06/04/2020') => False
     *
     * > validDate("03-11-2000")
     * true
     * > validDate("15-01-2012")
     * false
     * > validDate("04-0-2040")
     * false
     * > validDate("06-04-2020")
     * true
     * > validDate("01-01-2007")
     * true
     * > validDate("03-32-2011")
     * false
     * > validDate("")
     * false
     * > validDate("04-31-3000")
     * false
     * > validDate("06-06-2005")
     * true
     * > validDate("21-31-2000")
     * false
     * > validDate("04-12-2003")
     * true
     * > validDate("04122003")
     * false
     * > validDate("20030412")
     * false
     * > validDate("2003-04")
     * false
     * > validDate("2003-04-12")
     * false
     * > validDate("04-2003")
     * false
     */
    public static Boolean validDate(String date) {
        if (date == null || date.isEmpty()) {
            return false;
        }
        String[] dateParts = date.split("-");
        if (dateParts.length != 3) {
            return false;
        }
        int month, day, year;
        try {
            month = Integer.parseInt(dateParts[0]);
            day = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return false;
            }
        }
        return true;
    }
}

// ValidDateTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
    @Test
    void testValidDate() {
        assertTrue(ValidDate.validDate("03-11-2000"));
        assertFalse(ValidDate.validDate("15-01-2012"));
        assertFalse(ValidDate.validDate("04-0-2040"));
        assertTrue(ValidDate.validDate("06-04-2020"));
        assertTrue(ValidDate.validDate("01-01-2007"));
        assertFalse(ValidDate.validDate("03-32-2011"));
        assertFalse(ValidDate.validDate(""));
        assertFalse(ValidDate.validDate("04-31-3000"));
        assertTrue(ValidDate.validDate("06-06-2005"));
        assertFalse(ValidDate.validDate("21-31-2000"));
        assertTrue(ValidDate.validDate("04-12-2003"));
        assertFalse(ValidDate.validDate("04122003"));
        assertFalse(ValidDate.validDate("20030412"));
        assertFalse(ValidDate.validDate("2003-04"));
        assertFalse(ValidDate.validDate("2003-04-12"));
        assertFalse(ValidDate.validDate("04-2003"));
    }
}