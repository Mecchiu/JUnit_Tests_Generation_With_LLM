Here's the source code for the test class:

```
// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Wildcard_2Test {

    @Test
    void testInstantiateWildcard_noWildcard() {
        String pattern = "hello";
        String part = "world";
        String expected = "hello";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_oneWildcard() {
        String pattern = "hello*world";
        String part = "beautiful ";
        String expected = "hellobeautiful world";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_multipleWildcards() {
        String pattern = "hello*beautiful*world";
        String part1 = "crazy ";
        String part2 = "fantastic ";
        String expected = "hellocrazy beautiful fantastic world";
        String actual = Wildcard.instantiateWildcard(pattern, part1 + part2);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_emptyPart() {
        String pattern = "hello*world";
        String part = "";
        String expected = "helloworld";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_emptyPattern() {
        String pattern = "";
        String part = "world";
        String expected = "";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_emptyPatternAndPart() {
        String pattern = "";
        String part = "";
        String expected = "";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_wildcardAtBeginning() {
        String pattern = "*world";
        String part = "hello ";
        String expected = "hello world";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_wildcardAtEnd() {
        String pattern = "hello*";
        String part = "world";
        String expected = "helloworld";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_multipleWildcardsSamePart() {
        String pattern = "hello*beautiful*world";
        String part = "fantastic ";
        String expected = "hellofantastic beautiful fantastic world";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard_multipleWildcardsDifferentParts() {
        String pattern = "hello*beautiful*world";
        String part1 = "crazy ";
        String part2 = "fantastic ";
        String expected = "hellocrazy beautiful fantastic world";
        String actual = Wildcard.instantiateWildcard(pattern, part1, part2);
        assertEquals(expected, actual);
    }
}
```