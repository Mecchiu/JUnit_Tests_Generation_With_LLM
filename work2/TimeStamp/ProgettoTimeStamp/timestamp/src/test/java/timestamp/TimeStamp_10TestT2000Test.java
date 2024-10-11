package timestamp;
// TimeStamp_10Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#equals(Object)} method.
*/
class TimeStamp_10Test {
    /**
     * Test case for equals method with identical TimeStamp objects.
     */
    @Test
    void testEqualsIdentical() {
        TimeStamp ts1 = new TimeStamp(0x83aa7e80L << 32 | 0x00000000L);
        TimeStamp ts2 = new TimeStamp(0x83aa7e80L << 32 | 0x00000000L);
        assertTrue(ts1.equals(ts2), "Identical TimeStamps should be equal");
    }

    /**
     * Test case for equals method with different TimeStamp objects.
     */
    @Test
    void testEqualsDifferent() {
        TimeStamp ts1 = new TimeStamp(0x83aa7e80L << 32 | 0x00000000L);
        TimeStamp ts2 = new TimeStamp(0x83aa7e81L << 32 | 0x00000000L);
        assertFalse(ts1.equals(ts2), "Different TimeStamps should not be equal");
    }

    /**
     * Test case for equals method with null object.
     */
    @Test
    void testEqualsNull() {
        TimeStamp ts1 = new TimeStamp(0x83aa7e80L << 32 | 0x00000000L);
        assertFalse(ts1.equals(null), "TimeStamp should not be equal to null");
    }

    /**
     * Test case for equals method with different object type.
     */
    @Test
    void testEqualsDifferentType() {
        TimeStamp ts1 = new TimeStamp(0x83aa7e80L << 32 | 0x00000000L);
        String notATimeStamp = "Not a TimeStamp";
        assertFalse(ts1.equals(notATimeStamp), "TimeStamp should not be equal to a different object type");
    }

    /**
     * Test case for equals method with TimeStamp object created from Date.
     */
    @Test
    void testEqualsFromDate() {
        Date date = new Date();
        TimeStamp ts1 = new TimeStamp(date);
        TimeStamp ts2 = new TimeStamp(date);
        assertTrue(ts1.equals(ts2), "TimeStamps created from the same Date should be equal");
    }

    /**
     * Test case for equals method with TimeStamp object created from hex string.
     */
    @Test
    void testEqualsFromHexString() {
        String hexString = "c1a089bd.fc904f6d";
        TimeStamp ts1 = new TimeStamp(hexString);
        TimeStamp ts2 = new TimeStamp(hexString);
        assertTrue(ts1.equals(ts2), "TimeStamps created from the same hex string should be equal");
    }

    /**
     * Test case for equals method with TimeStamp object created from long value.
     */
    @Test
    void testEqualsFromLong() {
        long ntpValue = 0x83aa7e80L << 32 | 0x00000000L;
        TimeStamp ts1 = new TimeStamp(ntpValue);
        TimeStamp ts2 = new TimeStamp(ntpValue);
        assertTrue(ts1.equals(ts2), "TimeStamps created from the same long value should be equal");
    }

    /**
     * Test case for equals method with TimeStamp object created from different long values.
     */
    @Test
    void testEqualsDifferentLong() {
        long ntpValue1 = 0x83aa7e80L << 32 | 0x00000000L;
        long ntpValue2 = 0x83aa7e81L << 32 | 0x00000000L;
        TimeStamp ts1 = new TimeStamp(ntpValue1);
        TimeStamp ts2 = new TimeStamp(ntpValue2);
        assertFalse(ts1.equals(ts2), "TimeStamps created from different long values should not be equal");
    }

    /**
     * Test case for equals method with TimeStamp object created from different hex strings.
     */
    @Test
    void testEqualsDifferentHexString() {
        String hexString1 = "c1a089bd.fc904f6d";
        String hexString2 = "c1a089bd.fc904f6e";
        TimeStamp ts1 = new TimeStamp(hexString1);
        TimeStamp ts2 = new TimeStamp(hexString2);
        assertFalse(ts1.equals(ts2), "TimeStamps created from different hex strings should not be equal");
    }

    /**
     * Test case for equals method with TimeStamp object created from different Dates.
     */
    @Test
    void testEqualsDifferentDate() {
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + 1000); // 1 second later
        TimeStamp ts1 = new TimeStamp(date1);
        TimeStamp ts2 = new TimeStamp(date2);
        assertFalse(ts1.equals(ts2), "TimeStamps created from different Dates should not be equal");
    }
}