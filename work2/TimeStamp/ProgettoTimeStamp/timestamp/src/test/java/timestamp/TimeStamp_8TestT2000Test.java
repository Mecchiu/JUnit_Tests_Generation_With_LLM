// TimeStamp_8Test.java

package timestamp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#parseNtpString(String)} method.
*/
class TimeStamp_8Test {
    /**
     * Test case for parsing a valid NTP hex string.
     */
    @Test
    void testParseNtpStringValid() {
        String hexString = "c1a089bd.fc904f6d";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing an invalid NTP hex string with no decimal point.
     */
    @Test
    void testParseNtpStringInvalidNoDecimal() {
        String hexString = "c1a089bd";
        assertThrows(NumberFormatException.class, () -> {
            TimeStamp.parseNtpString(hexString);
        });
    }

    /**
     * Test case for parsing an invalid NTP hex string with non-hex characters.
     */
    @Test
    void testParseNtpStringInvalidCharacters() {
        String hexString = "c1a089bd.fc90g6d";
        assertThrows(NumberFormatException.class, () -> {
            TimeStamp.parseNtpString(hexString);
        });
    }

    /**
     * Test case for parsing a null NTP hex string.
     */
    @Test
    void testParseNtpStringNull() {
        assertThrows(NumberFormatException.class, () -> {
            TimeStamp.parseNtpString(null);
        });
    }

    /**
     * Test case for parsing an empty NTP hex string.
     */
    @Test
    void testParseNtpStringEmpty() {
        String hexString = "";
        assertThrows(NumberFormatException.class, () -> {
            TimeStamp.parseNtpString(hexString);
        });
    }

    /**
     * Test case for parsing a valid NTP hex string with leading zeros.
     */
    @Test
    void testParseNtpStringLeadingZeros() {
        String hexString = "00000000.00000001";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with maximum value.
     */
    @Test
    void testParseNtpStringMaxValue() {
        String hexString = "ffffffff.ffffffff";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with minimum value.
     */
    @Test
    void testParseNtpStringMinValue() {
        String hexString = "00000000.00000000";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with fractional part only.
     */
    @Test
    void testParseNtpStringFractionOnly() {
        String hexString = "00000000.fc904f6d";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with seconds part only.
     */
    @Test
    void testParseNtpStringSecondsOnly() {
        String hexString = "c1a089bd.00000000";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }
}