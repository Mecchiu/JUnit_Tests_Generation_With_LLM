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
```java
    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly converts a known NTP timestamp
     * to its expected string representation.
     */
    @Test
    void testToStringKnownValue() {
        long ntpTime = 0xc1a089bd_fc904f6dL; // Example NTP timestamp
        String expected = "c1a089bd.fc904f6d";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles the minimum possible NTP timestamp.
     */
    @Test
    void testToStringMinValue() {
        long ntpTime = 0x00000000_00000000L; // Minimum NTP timestamp
        String expected = "00000000.00000000";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles the maximum possible NTP timestamp.
     */
    @Test
    void testToStringMaxValue() {
        long ntpTime = 0xffffffff_ffffffffL; // Maximum NTP timestamp
        String expected = "ffffffff.ffffffff";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with only seconds.
     */
    @Test
    void testToStringOnlySeconds() {
        long ntpTime = 0x12345678_00000000L; // NTP timestamp with only seconds
        String expected = "12345678.00000000";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with only fractional seconds.
     */
    @Test
    void testToStringOnlyFraction() {
        long ntpTime = 0x00000000_12345678L; // NTP timestamp with only fractional seconds
        String expected = "00000000.12345678";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with both seconds and fractional seconds.
     */
    @Test
    void testToStringSecondsAndFraction() {
        long ntpTime = 0xabcdef12_34567890L; // NTP timestamp with both seconds and fractional seconds
        String expected = "abcdef12.34567890";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with leading zeros in seconds.
     */
    @Test
    void testToStringLeadingZerosSeconds() {
        long ntpTime = 0x00001234_56789abcL; // NTP timestamp with leading zeros in seconds
        String expected = "00001234.56789abc";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with leading zeros in fraction.
     */
    @Test
    void testToStringLeadingZerosFraction() {
        long ntpTime = 0x12345678_00000abcL; // NTP timestamp with leading zeros in fraction
        String expected = "12345678.00000abc";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with all zeros.
     */
    @Test
    void testToStringAllZeros() {
        long ntpTime = 0x00000000_00000000L; // NTP timestamp with all zeros
        String expected = "00000000.00000000";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }

    /**
     * Test case for the toString(long) method.
     * This test checks if the method correctly handles a timestamp with all ones.
     */
    @Test
    void testToStringAllOnes() {
        long ntpTime = 0xffffffff_ffffffffL; // NTP timestamp with all ones
        String expected = "ffffffff.ffffffff";
        assertEquals(expected, TimeStamp.toString(ntpTime));
    }
}
```

These test cases cover a variety of scenarios for the `toString(long)` method, ensuring that it correctly converts NTP timestamps to their string representations.