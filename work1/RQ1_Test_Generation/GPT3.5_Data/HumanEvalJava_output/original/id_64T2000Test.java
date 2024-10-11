```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelsCountTest {

    @Test
    void testVowelsCount1() {
        assertEquals(2, VowelsCount.vowelsCount("abcde"));
    }

    @Test
    void testVowelsCount2() {
        assertEquals(3, VowelsCount.vowelsCount("Alone"));
    }

    @Test
    void testVowelsCount3() {
        assertEquals(2, VowelsCount.vowelsCount("key"));
    }

    @Test
    void testVowelsCount4() {
        assertEquals(1, VowelsCount.vowelsCount("bye"));
    }

    @Test
    void testVowelsCount5() {
        assertEquals(2, VowelsCount.vowelsCount("keY"));
    }

    @Test
    void testVowelsCount6() {
        assertEquals(1, VowelsCount.vowelsCount("bYe"));
    }

    @Test
    void testVowelsCount7() {
        assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
    }

    @Test
    void testVowelsCountEmptyString() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    @Test
    void testVowelsCountNoVowels() {
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
    }

    @Test
    void testVowelsCountOnlyY() {
        assertEquals(1, VowelsCount.vowelsCount("y"));
    }
}
```
