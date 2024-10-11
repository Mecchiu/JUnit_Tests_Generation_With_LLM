Here's the code for the `ParseMusicTest` class with ten unit test cases for the `parseMusic` method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ParseMusicTest {

    @Test
    void testEmptyString() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = ParseMusic.parseMusic("");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNote() {
        List<Object> expected = Arrays.asList(4);
        List<Object> actual = ParseMusic.parseMusic("o");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleRest() {
        List<Object> expected = Arrays.asList(1);
        List<Object> actual = ParseMusic.parseMusic(".");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleNotes() {
        List<Object> expected = Arrays.asList(4, 4, 4);
        List<Object> actual = ParseMusic.parseMusic("ooo");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleRests() {
        List<Object> expected = Arrays.asList(1, 1, 1);
        List<Object> actual = ParseMusic.parseMusic("...");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotesAndRests() {
        List<Object> expected = Arrays.asList(4, 1, 4, 1, 4);
        List<Object> actual = ParseMusic.parseMusic("o.o.o");
        assertEquals(expected, actual);
    }

    @Test
    void testNoteFollowedByRest() {
        List<Object> expected = Arrays.asList(4, 1);
        List<Object> actual = ParseMusic.parseMusic("o.");
        assertEquals(expected, actual);
    }

    @Test
    void testRestFollowedByNote() {
        List<Object> expected = Arrays.asList(1, 4);
        List<Object> actual = ParseMusic.parseMusic(".o");
        assertEquals(expected, actual);
    }

    @Test
    void testDoubleNote() {
        List<Object> expected = Arrays.asList(2);
        List<Object> actual = ParseMusic.parseMusic("o|");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotesAndDoubleNotes() {
        List<Object> expected = Arrays.asList(4, 2, 4, 2, 4);
        List<Object> actual = ParseMusic.parseMusic("o|o|o");
        assertEquals(expected, actual);
    }
}
```