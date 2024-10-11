// SkjkasdkdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains ten unit test cases for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
	@Test
    void testEmptyList() {
        assertEquals(0, Skjkasdkd.skjkasdkd(List.of()));
    }

    @Test
    void testNoPrime() {
        assertEquals(0, Skjkasdkd.skjkasdkd(List.of(4, 6, 8, 9)));
    }

    @Test
    void testOnePrime() {
        assertEquals(2, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8)));
    }

    @Test
    void testTwoPrimes() {
        assertEquals(11, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11)));
    }

    @Test
    void testThreePrimes() {
        assertEquals(18, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17)));
    }

    @Test
    void testFourPrimes() {
        assertEquals(26, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17, 19)));
    }

    @Test
    void testFivePrimes() {
        assertEquals(35, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17, 19, 23)));
    }

    @Test
    void testSixPrimes() {
        assertEquals(44, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17, 19, 23, 29)));
    }

    @Test
    void testSevenPrimes() {
        assertEquals(53, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17, 19, 23, 29, 31)));
    }

    @Test
    void testEightPrimes() {
        assertEquals(62, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17, 19, 23, 29, 31, 37)));
    }

    @Test
    void testNinePrimes() {
        assertEquals(71, Skjkasdkd.skjkasdkd(List.of(2, 4, 6, 8, 11, 13, 17, 19, 23, 29, 31, 37, 41)));
    }
}
