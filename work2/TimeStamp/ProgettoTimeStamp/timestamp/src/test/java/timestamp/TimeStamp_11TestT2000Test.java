package timestamp;
// TimeStamp_11Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#toString()} method.
*/
class TimeStamp_11Test {
    /**
     * Test case for the toString method.
     * It tests the conversion of a known NTP timestamp to its string representation.
     */
    @Test
    void testToStringKnownValue() {
        TimeStamp ts = new TimeStamp(0xc1a089bd_fc904f6dL);
        assertEquals("c1a089bd.fc904f6d", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of the minimum possible NTP timestamp to its string representation.
     */
    @Test
    void testToStringMinValue() {
        TimeStamp ts = new TimeStamp(0x00000000_00000000L);
        assertEquals("00000000.00000000", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of the maximum possible NTP timestamp to its string representation.
     */
    @Test
    void testToStringMaxValue() {
        TimeStamp ts = new TimeStamp(0xffffffff_ffffffffL);
        assertEquals("ffffffff.ffffffff", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with only seconds to its string representation.
     */
    @Test
    void testToStringOnlySeconds() {
        TimeStamp ts = new TimeStamp(0x12345678_00000000L);
        assertEquals("12345678.00000000", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with only fractional seconds to its string representation.
     */
    @Test
    void testToStringOnlyFraction() {
        TimeStamp ts = new TimeStamp(0x00000000_12345678L);
        assertEquals("00000000.12345678", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with both seconds and fractional seconds to its string representation.
     */
    @Test
    void testToStringSecondsAndFraction() {
        TimeStamp ts = new TimeStamp(0x12345678_9abcdef0L);
        assertEquals("12345678.9abcdef0", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with leading zeros in seconds to its string representation.
     */
    @Test
    void testToStringLeadingZerosInSeconds() {
        TimeStamp ts = new TimeStamp(0x00001234_56789abcL);
        assertEquals("00001234.56789abc", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with leading zeros in fraction to its string representation.
     */
    @Test
    void testToStringLeadingZerosInFraction() {
        TimeStamp ts = new TimeStamp(0x12345678_00001234L);
        assertEquals("12345678.00001234", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with all zeros to its string representation.
     */
    @Test
    void testToStringAllZeros() {
        TimeStamp ts = new TimeStamp(0x00000000_00000000L);
        assertEquals("00000000.00000000", ts.toString());
    }

    /**
     * Test case for the toString method.
     * It tests the conversion of a timestamp with all ones to its string representation.
     */
    @Test
    void testToStringAllOnes() {
        TimeStamp ts = new TimeStamp(0xffffffff_ffffffffL);
        assertEquals("ffffffff.ffffffff", ts.toString());
    }
}