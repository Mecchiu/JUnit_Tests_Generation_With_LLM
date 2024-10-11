```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsHappyTest {

    @Test
    void testIsHappySingleCharacter() {
        assertFalse(IsHappy.isHappy("a"));
    }

    @Test
    void testIsHappyTwoSameCharacters() {
        assertFalse(IsHappy.isHappy("aa"));
    }

    @Test
    void testIsHappyThreeDistinctCharacters() {
        assertTrue(IsHappy.isHappy("abc"));
    }

    @Test
    void testIsHappyTwoSameAndOneDifferentCharacter() {
        assertFalse(IsHappy.isHappy("aab"));
    }

    @Test
    void testIsHappyThreeDistinctCharactersWithRepetition() {
        assertTrue(IsHappy.isHappy("abca"));
    }

    @Test
    void testIsHappyThreeSameCharacters() {
        assertFalse(IsHappy.isHappy("aaa"));
    }

    @Test
    void testIsHappyFourDistinctCharacters() {
        assertTrue(IsHappy.isHappy("abcd"));
    }

    @Test
    void testIsHappyTwoSameAndTwoDifferentCharacters() {
        assertFalse(IsHappy.isHappy("aabb"));
    }

    @Test
    void testIsHappyThreeDistinctCharactersWithRepetition() {
        assertTrue(IsHappy.isHappy("abcb"));
    }

    @Test
    void testIsHappyLongStringHappy() {
        assertTrue(IsHappy.isHappy("iopaxpoi"));
    }

    @Test
    void testIsHappyLongStringNotHappy() {
        assertFalse(IsHappy.isHappy("iopaxioi"));
    }
}
```
