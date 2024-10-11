package timestamp;
// TimeStamp_15Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#compareTo(TimeStamp)} method.
*/
class TimeStamp_15Test {
    /**
     * Test case for comparing two identical timestamps.
     */
    @Test
    void testCompareToEqualTimestamps() {
        TimeStamp ts1 = new TimeStamp("c1a089bd.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089bd.fc904f6d");
        assertEquals(0, ts1.compareTo(ts2), "Timestamps should be equal");
    }

    /**
     * Test case for comparing a timestamp with a later timestamp.
     */
    @Test
    void testCompareToEarlierTimestamp() {
        TimeStamp ts1 = new TimeStamp("c1a089bd.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089be.fc904f6d");
        assertTrue(ts1.compareTo(ts2) < 0, "First timestamp should be earlier");
    }

    /**
     * Test case for comparing a timestamp with an earlier timestamp.
     */
    @Test
    void testCompareToLaterTimestamp() {
        TimeStamp ts1 = new TimeStamp("c1a089be.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089bd.fc904f6d");
        assertTrue(ts1.compareTo(ts2) > 0, "First timestamp should be later");
    }

    /**
     * Test case for comparing two timestamps with different fractional parts.
     */
    @Test
    void testCompareToDifferentFractionalParts() {
        TimeStamp ts1 = new TimeStamp("c1a089bd.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089bd.fc904f6e");
        assertTrue(ts1.compareTo(ts2) < 0, "First timestamp should be earlier due to fractional part");
    }

    /**
     * Test case for comparing two timestamps with the same seconds but different fractional parts.
     */
    @Test
    void testCompareToSameSecondsDifferentFractionalParts() {
        TimeStamp ts1 = new TimeStamp("c1a089bd.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089bd.fc904f6c");
        assertTrue(ts1.compareTo(ts2) > 0, "First timestamp should be later due to fractional part");
    }

    /**
     * Test case for comparing a timestamp with itself.
     */
    @Test
    void testCompareToSelf() {
        TimeStamp ts = new TimeStamp("c1a089bd.fc904f6d");
        assertEquals(0, ts.compareTo(ts), "Timestamp should be equal to itself");
    }

    /**
     * Test case for comparing two timestamps with different seconds.
     */
    @Test
    void testCompareToDifferentSeconds() {
        TimeStamp ts1 = new TimeStamp("c1a089bc.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089bd.fc904f6d");
        assertTrue(ts1.compareTo(ts2) < 0, "First timestamp should be earlier due to seconds");
    }

    /**
     * Test case for comparing two timestamps with the same seconds and fractional parts.
     */
    @Test
    void testCompareToSameSecondsAndFractionalParts() {
        TimeStamp ts1 = new TimeStamp("c1a089bd.fc904f6d");
        TimeStamp ts2 = new TimeStamp("c1a089bd.fc904f6d");
        assertEquals(0, ts1.compareTo(ts2), "Timestamps should be equal");
    }

    /**
     * Test case for comparing two timestamps with maximum and minimum values.
     */
    @Test
    void testCompareToMaxAndMinValues() {
        TimeStamp ts1 = new TimeStamp(Long.MAX_VALUE);
        TimeStamp ts2 = new TimeStamp(Long.MIN_VALUE);
        assertTrue(ts1.compareTo(ts2) > 0, "Max timestamp should be greater than min timestamp");
    }

    /**
     * Test case for comparing two timestamps with minimum and maximum values.
     */
    @Test
    void testCompareToMinAndMaxValues() {
        TimeStamp ts1 = new TimeStamp(Long.MIN_VALUE);
        TimeStamp ts2 = new TimeStamp(Long.MAX_VALUE);
        assertTrue(ts1.compareTo(ts2) < 0, "Min timestamp should be less than max timestamp");
    }
}