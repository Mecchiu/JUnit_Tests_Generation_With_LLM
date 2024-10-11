// ParseMusic.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class ParseMusic {

    /**
     * Input to this function is a string representing musical notes in a special ASCII format.
     * Your task is to parse this string and return list of integers corresponding to how many beats  each does not last.
     * Here is a legend:
     * 'o' - whole note, lasts four beats
     * 'o|' - half note, lasts two beats
     * '.|' - quarter note, lasts one beat
     *
     * > parseMusic("o o| .| o| o| .| .| .| .| o o")
     * [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     * > parseMusic("")
     * []
     * > parseMusic("o o o o")
     * [4, 4, 4, 4]
     * > parseMusic(".| .| .| .|")
     * [1, 1, 1, 1]
     * > parseMusic("o| o| .| .| o o o o")
     * [2, 2, 1, 1, 4, 4, 4, 4]
     * > parseMusic("o| .| o| .| o o| o o|")
     * [2, 1, 2, 1, 4, 2, 4, 2]
     */
    public static List<Integer> parseMusic(String musicString) {
        List<Integer> beats = new ArrayList<>();
        int i = 0;
        while (i < musicString.length()) {
            char c = musicString.charAt(i);
            if (c == 'o') {
                beats.add(4);
                i++;
            } else if (c == 'o' && musicString.charAt(i + 1) == '|') {
                beats.add(2);
                i += 2;
            } else if (c == '.' && musicString.charAt(i + 1) == '|') {
                beats.add(1);
                i += 2;
            } else {
                i++;
            }
        }
        return beats;
    }
}

// ParseMusicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains ten unit test cases for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
    @Test
    void testEmptyString() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = ParseMusic.parseMusic("");
        assertEquals(expected, actual);
    }

    @Test
    void testWholeNotes() {
        List<Integer> expected = List.of(4, 4, 4, 4);
        List<Integer> actual = ParseMusic.parseMusic("o o o o");
        assertEquals(expected, actual);
    }

    @Test
    void testQuarterNotes() {
        List<Integer> expected = List.of(1, 1, 1, 1);
        List<Integer> actual = ParseMusic.parseMusic(".| .| .| .|");
        assertEquals(expected, actual);
    }

    @Test
    void testHalfNotes() {
        List<Integer> expected = List.of(2, 2, 2, 2);
        List<Integer> actual = ParseMusic.parseMusic("o| o| o| o|");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotes() {
        List<Integer> expected = List.of(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4);
        List<Integer> actual = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotes2() {
        List<Integer> expected = List.of(2, 2, 1, 1, 4, 4, 4, 4);
        List<Integer> actual = ParseMusic.parseMusic("o| o| .| .| o o o o");
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNotes3() {
        List<Integer> expected = List.of(2, 1, 2, 1, 4, 2, 4, 2);
        List<Integer> actual = ParseMusic.parseMusic("o| .| o| .| o o| o o|");
        assertEquals(expected, actual);
    }

    @Test
    void testInvalidInput() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> ParseMusic.parseMusic("o| o| .| .| o o o"));
    }

    @Test
    void testInvalidInput2() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> ParseMusic.parseMusic("o| o| .| .| o o o|"));
    }

    @Test
    void testInvalidInput3() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> ParseMusic.parseMusic("o| o| .| .| o o| o"));
    }
}