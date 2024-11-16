// TimeStamp_2Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getFraction()} method.
*/
class TimeStamp_2Test {
```java
    /**
     * Test case for getFraction() method.
     * This test checks if the getFraction() method returns the correct low-order 32-bits
     * representing the fractional seconds of the NTP timestamp.
     */
    @Test
    void testGetFraction() {
        // Test with a known NTP timestamp
        long ntpTime = 0xc1a089bd_fc904f6dL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0xfc904f6dL;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should match the expected value.");
    }

    /**
     * Test case for getFraction() method with zero fraction.
     * This test checks if the getFraction() method returns zero when the fractional part is zero.
     */
    @Test
    void testGetFractionZero() {
        // Test with a known NTP timestamp with zero fraction
        long ntpTime = 0xc1a089bd_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0x00000000L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should be zero.");
    }

    /**
     * Test case for getFraction() method with maximum fraction.
     * This test checks if the getFraction() method returns the maximum value when the fractional part is at its maximum.
     */
    @Test
    void testGetFractionMax() {
        // Test with a known NTP timestamp with maximum fraction
        long ntpTime = 0xc1a089bd_ffffffffL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0xffffffffL;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should be at maximum value.");
    }

    /**
     * Test case for getFraction() method with minimum fraction.
     * This test checks if the getFraction() method returns the minimum value when the fractional part is at its minimum.
     */
    @Test
    void testGetFractionMin() {
        // Test with a known NTP timestamp with minimum fraction
        long ntpTime = 0xc1a089bd_00000001L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0x00000001L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should be at minimum value.");
    }

    /**
     * Test case for getFraction() method with random fraction.
     * This test checks if the getFraction() method returns the correct value for a random fractional part.
     */
    @Test
    void testGetFractionRandom() {
        // Test with a random NTP timestamp
        long ntpTime = 0xc1a089bd_12345678L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0x12345678L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should match the expected random value.");
    }

    /**
     * Test case for getFraction() method with another random fraction.
     * This test checks if the getFraction() method returns the correct value for another random fractional part.
     */
    @Test
    void testGetFractionAnotherRandom() {
        // Test with another random NTP timestamp
        long ntpTime = 0xc1a089bd_abcdef01L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0xabcdef01L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should match the expected random value.");
    }

    /**
     * Test case for getFraction() method with a large timestamp.
     * This test checks if the getFraction() method handles large timestamps correctly.
     */
    @Test
    void testGetFractionLargeTimestamp() {
        // Test with a large NTP timestamp
        long ntpTime = 0xffffffff_ffffffffL;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0xffffffffL;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should be at maximum value for large timestamp.");
    }

    /**
     * Test case for getFraction() method with a small timestamp.
     * This test checks if the getFraction() method handles small timestamps correctly.
     */
    @Test
    void testGetFractionSmallTimestamp() {
        // Test with a small NTP timestamp
        long ntpTime = 0x00000000_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0x00000000L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should be zero for small timestamp.");
    }

    /**
     * Test case for getFraction() method with a timestamp having only fraction.
     * This test checks if the getFraction() method returns the correct value when the timestamp has only fractional part.
     */
    @Test
    void testGetFractionOnlyFraction() {
        // Test with a timestamp having only fraction
        long ntpTime = 0x00000000_87654321L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0x87654321L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should match the expected value when only fraction is present.");
    }

    /**
     * Test case for getFraction() method with a timestamp having only seconds.
     * This test checks if the getFraction() method returns zero when the timestamp has only seconds part.
     */
    @Test
    void testGetFractionOnlySeconds() {
        // Test with a timestamp having only seconds
        long ntpTime = 0x12345678_00000000L;
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedFraction = 0x00000000L;
        assertEquals(expectedFraction, timeStamp.getFraction(), "The fractional seconds should be zero when only seconds are present.");
    }
}
```

This test class `TimeStamp_2Test` contains ten unit test cases for the `getFraction()` method of the `TimeStamp` class. Each test case checks a different scenario to ensure the method behaves as expected.