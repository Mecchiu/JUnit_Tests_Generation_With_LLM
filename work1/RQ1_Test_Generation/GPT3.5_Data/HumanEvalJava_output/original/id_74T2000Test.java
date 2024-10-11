```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class TotalMatchTest {

    @Test
    void testEmptyLists() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList(), Arrays.asList());
        assertEquals(Arrays.asList(), result);
    }

    @Test
    void testSameTotalChars() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi"));
        assertEquals(Arrays.asList("hi", "hi"), result);
    }

    @Test
    void testFirstListLessChars() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi", "admin", "project"));
        assertEquals(Arrays.asList("hi", "admin"), result);
    }

    @Test
    void testSecondListLessChars() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hi"));
        assertEquals(Arrays.asList("hI", "hi", "hi"), result);
    }

    @Test
    void testSingleElementLists() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("4"), Arrays.asList("1", "2", "3", "4", "5"));
        assertEquals(Arrays.asList("4"), result);
    }

    @Test
    void testMixedCaseStrings() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "Hi"));
        assertEquals(Arrays.asList("hI", "Hi"), result);
    }

    @Test
    void testDifferentLengthStrings() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hii"));
        assertEquals(Arrays.asList("hi", "admin"), result);
    }

    @Test
    void testFirstListEmpty() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList(), Arrays.asList("this"));
        assertEquals(Arrays.asList(), result);
    }

    @Test
    void testSecondListEmpty() {
        List<Object> result = TotalMatch.totalMatch(Arrays.asList("this"), Arrays.asList());
        assertEquals(Arrays.asList(), result);
    }
}
```
