// Here's the source code for the ReverseDeleteTest class:

package scenario2;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseDeleteTest {

    @Test
    void testReverseDelete1() {
        List<Object> expected = Arrays.asList("racecar", true);
        List<Object> actual = ReverseDelete.reverseDelete("racecar", "abc");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete2() {
        List<Object> expected = Arrays.asList("level", true);
        List<Object> actual = ReverseDelete.reverseDelete("level", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete3() {
        List<Object> expected = Arrays.asList("deified", true);
        List<Object> actual = ReverseDelete.reverseDelete("deified", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete4() {
        List<Object> expected = Arrays.asList("rotor", true);
        List<Object> actual = ReverseDelete.reverseDelete("rotor", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete5() {
        List<Object> expected = Arrays.asList("madamimadam", true);
        List<Object> actual = ReverseDelete.reverseDelete("madamimadam", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete6() {
        List<Object> expected = Arrays.asList("hello", false);
        List<Object> actual = ReverseDelete.reverseDelete("hello", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete7() {
        List<Object> expected = Arrays.asList("world", false);
        List<Object> actual = ReverseDelete.reverseDelete("world", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete8() {
        List<Object> expected = Arrays.asList("", true);
        List<Object> actual = ReverseDelete.reverseDelete("", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete9() {
        List<Object> expected = Arrays.asList("a", true);
        List<Object> actual = ReverseDelete.reverseDelete("a", "xyz");
        assertEquals(expected, actual);
    }

    @Test
    void testReverseDelete10() {
        List<Object> expected = Arrays.asList("ab", false);
        List<Object> actual = ReverseDelete.reverseDelete("ab", "xyz");
        assertEquals(expected, actual);
    }
}