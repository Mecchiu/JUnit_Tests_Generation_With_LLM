// VowelsCountTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
	// Test case 1: Empty string
    @Test
    void testVowelsCount1() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    // Test case 2: String with no vowels
    @Test
    void testVowelsCount2() {
        assertEquals(0, VowelsCount.vowelsCount("myth"));
    }

    // Test case 3: String with one vowel
    @Test
    void testVowelsCount3() {
        assertEquals(1, VowelsCount.vowelsCount("sky"));
    }

    // Test case 4: String with two vowels
    @Test
    void testVowelsCount4() {
        assertEquals(2, VowelsCount.vowelsCount("fly"));
    }

    // Test case 5: String with three vowels
    @Test
    void testVowelsCount5() {
        assertEquals(3, VowelsCount.vowelsCount("cry"));
    }

    // Test case 6: String with four vowels
    @Test
    void testVowelsCount6() {
        assertEquals(4, VowelsCount.vowelsCount("play"));
    }

    // Test case 7: String with five vowels
    @Test
    void testVowelsCount7() {
        assertEquals(5, VowelsCount.vowelsCount("beauty"));
    }

    // Test case 8: String with six vowels
    @Test
    void testVowelsCount8() {
        assertEquals(6, VowelsCount.vowelsCount("beautiful"));
    }

    // Test case 9: String with seven vowels
    @Test
    void testVowelsCount9() {
        assertEquals(7, VowelsCount.vowelsCount("beautifuly"));
    }

    // Test case 10: String with eight vowels
    @Test
    void testVowelsCount10() {
        assertEquals(8, VowelsCount.vowelsCount("beautifulye"));
    }
}
