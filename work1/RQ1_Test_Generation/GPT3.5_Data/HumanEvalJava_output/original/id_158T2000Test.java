```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class FindMaxTest {

    @Test
    void testFindMax() {
        List<String> words1 = Arrays.asList("name", "of", "string");
        assertEquals("string", FindMax.findMax(words1));

        List<String> words2 = Arrays.asList("name", "enam", "game");
        assertEquals("enam", FindMax.findMax(words2));

        List<String> words3 = Arrays.asList("aaaaaaa", "bb", "cc");
        assertEquals("aaaaaaa", FindMax.findMax(words3));

        List<String> words4 = Arrays.asList("abc", "cba");
        assertEquals("abc", FindMax.findMax(words4));

        List<String> words5 = Arrays.asList("play", "this", "game", "of", "footbott");
        assertEquals("footbott", FindMax.findMax(words5));

        List<String> words6 = Arrays.asList("we", "are", "gonna", "rock");
        assertEquals("gonna", FindMax.findMax(words6));

        List<String> words7 = Arrays.asList("we", "are", "a", "mad", "nation");
        assertEquals("nation", FindMax.findMax(words7));

        List<String> words8 = Arrays.asList("this", "is", "a", "prrk");
        assertEquals("this", FindMax.findMax(words8));

        List<String> words9 = Arrays.asList("b");
        assertEquals("b", FindMax.findMax(words9));

        List<String> words10 = Arrays.asList("play", "play", "play");
        assertEquals("play", FindMax.findMax(words10));
    }
}
```
