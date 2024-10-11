package timestamp;
// TimeStamp_12Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#toString(long)} method.
*/
class TimeStamp_12Test {
    /**
     * Test case for converting a known NTP timestamp to its string representation.
     */
    @Test
    void testToStringKnownValue() {
        long ntpTime = 0xc1a089bd_fc904f6dL;
        String expected = "c1a089bd.fc904f6d";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting zero NTP timestamp to its string representation.
     */
    @Test
    void testToStringZeroValue() {
        long ntpTime = 0x00000000_00000000L;
        String expected = "00000000.00000000";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting maximum NTP timestamp to its string representation.
     */
    @Test
    void testToStringMaxValue() {
        long ntpTime = 0xffffffff_ffffffffL;
        String expected = "ffffffff.ffffffff";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting minimum NTP timestamp to its string representation.
     */
    @Test
    void testToStringMinValue() {
        long ntpTime = 0x00000000_00000001L;
        String expected = "00000000.00000001";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting a random NTP timestamp to its string representation.
     */
    @Test
    void testToStringRandomValue() {
        long ntpTime = 0x12345678_9abcdef0L;
        String expected = "12345678.9abcdef0";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting a timestamp with only fractional part.
     */
    @Test
    void testToStringFractionOnly() {
        long ntpTime = 0x00000000_12345678L;
        String expected = "00000000.12345678";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting a timestamp with only seconds part.
     */
    @Test
    void testToStringSecondsOnly() {
        long ntpTime = 0x12345678_00000000L;
        String expected = "12345678.00000000";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting a timestamp with alternating bits.
     */
    @Test
    void testToStringAlternatingBits() {
        long ntpTime = 0xaaaaaaaa_55555555L;
        String expected = "aaaaaaaa.55555555";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting a timestamp with all bits set in seconds part.
     */
    @Test
    void testToStringAllBitsSeconds() {
        long ntpTime = 0xffffffff_00000000L;
        String expected = "ffffffff.00000000";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for converting a timestamp with all bits set in fractional part.
     */
    @Test
    void testToStringAllBitsFraction() {
        long ntpTime = 0x00000000_ffffffffL;
        String expected = "00000000.ffffffff";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }
}