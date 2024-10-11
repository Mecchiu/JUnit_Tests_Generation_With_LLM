// IsBoredTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
	@Test
    void testIsBored1() {
        String s = "I am bored. I am happy.";
        int expected = 1;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored2() {
        String s = "I am bored. I am happy. I am bored again.";
        int expected = 2;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored3() {
        String s = "I am bored. I am happy. I am bored again. I am bored again.";
        int expected = 3;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored4() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again.";
        int expected = 4;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored5() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again. I am bored again.";
        int expected = 5;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored6() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again.";
        int expected = 6;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored7() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again.";
        int expected = 7;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored8() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again.";
        int expected = 8;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored9() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again.";
        int expected = 9;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }

    @Test
    void testIsBored10() {
        String s = "I am bored. I am happy. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again. I am bored again.";
        int expected = 10;
        int actual = IsBored.isBored(s);
        assertEquals(expected, actual);
    }
}
