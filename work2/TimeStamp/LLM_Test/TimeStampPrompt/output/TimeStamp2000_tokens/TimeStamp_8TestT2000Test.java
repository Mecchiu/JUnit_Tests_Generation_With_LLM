package timestamp;
// TimeStamp_8Test.java


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
        String hexString = "c1a089bd.fc90zzzz";
        assertThrows(NumberFormatException.class, () -> {
            TimeStamp.parseNtpString(hexString);
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
     * Test case for parsing a null NTP hex string.
     */
    @Test
    void testParseNtpStringNull() {
        String hexString = null;
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
     * Test case for parsing a valid NTP hex string with maximum values.
     */
    @Test
    void testParseNtpStringMaxValues() {
        String hexString = "ffffffff.ffffffff";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with minimum values.
     */
    @Test
    void testParseNtpStringMinValues() {
        String hexString = "00000000.00000000";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString, timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with mixed case.
     */
    @Test
    void testParseNtpStringMixedCase() {
        String hexString = "C1A089BD.fc904f6d";
        TimeStamp timeStamp = TimeStamp.parseNtpString(hexString);
        assertNotNull(timeStamp);
        assertEquals(hexString.toLowerCase(), timeStamp.toString());
    }

    /**
     * Test case for parsing a valid NTP hex string with extra spaces.
     */
    @Test
    void testParseNtpStringExtraSpaces() {
        String hexString = " c1a089bd.fc904f6d ";
        assertThrows(NumberFormatException.class, () -> {
            TimeStamp.parseNtpString(hexString.trim());
        });
    }
}