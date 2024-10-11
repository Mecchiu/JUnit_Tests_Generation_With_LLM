```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AntiShuffleTest {

    @Test
    void testAntiShuffleWithSingleWord() {
        assertEquals("Hi", AntiShuffle.antiShuffle("Hi"));
        assertEquals("ehllo", AntiShuffle.antiShuffle("hello"));
        assertEquals("bemnru", AntiShuffle.antiShuffle("number"));
        assertEquals("abcd", AntiShuffle.antiShuffle("abcd"));
    }

    @Test
    void testAntiShuffleWithMultipleWords() {
        assertEquals("Hello !!!Wdlor", AntiShuffle.antiShuffle("Hello World!!!"));
        assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
    }

    @Test
    void testAntiShuffleWithEmptyString() {
        assertEquals("", AntiShuffle.antiShuffle(""));
    }
}
```
```java
package original;

import java.util.Arrays;

class AntiShuffle {

    public static String antiShuffle(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = sortString(words[i]);
        }
        return String.join(" ", words);
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
```