```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseMusicTest {

    @Test
    void testParseMusic1() {
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(2);
        expected.add(2);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(4);
        expected.add(4);
        
        assertEquals(expected, ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o"));
    }

    @Test
    void testParseMusic2() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, ParseMusic.parseMusic(""));
    }

    @Test
    void testParseMusic3() {
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(4);
        expected.add(4);
        expected.add(4);
        
        assertEquals(expected, ParseMusic.parseMusic("o o o o"));
    }

    @Test
    void testParseMusic4() {
        List<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        
        assertEquals(expected, ParseMusic.parseMusic(".| .| .| .|"));
    }

    @Test
    void testParseMusic5() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(1);
        expected.add(1);
        expected.add(4);
        expected.add(4);
        expected.add(4);
        expected.add(4);
        
        assertEquals(expected, ParseMusic.parseMusic("o| o| .| .| o o o o"));
    }

    @Test
    void testParseMusic6() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(2);
        expected.add(1);
        expected.add(4);
        expected.add(2);
        expected.add(4);
        expected.add(2);
        
        assertEquals(expected, ParseMusic.parseMusic("o| .| o| .| o o| o o|"));
    }
}
```
```