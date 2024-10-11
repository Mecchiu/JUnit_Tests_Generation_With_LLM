```java
class ReverseDeleteTest {

    @Test
    void testReverseDelete1() {
        List<Object> result = ReverseDelete.reverseDelete("abcde", "ae");
        assertEquals(Arrays.asList("bcd", false), result);
    }

    @Test
    void testReverseDelete2() {
        List<Object> result = ReverseDelete.reverseDelete("abcdef", "b");
        assertEquals(Arrays.asList("acdef", false), result);
    }

    @Test
    void testReverseDelete3() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "ab");
        assertEquals(Arrays.asList("cdedc", true), result);
    }

    @Test
    void testReverseDelete4() {
        List<Object> result = ReverseDelete.reverseDelete("dwik", "w");
        assertEquals(Arrays.asList("dik", false), result);
    }

    @Test
    void testReverseDelete5() {
        List<Object> result = ReverseDelete.reverseDelete("a", "a");
        assertEquals(Arrays.asList("", true), result);
    }

    @Test
    void testReverseDelete6() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "");
        assertEquals(Arrays.asList("abcdedcba", true), result);
    }

    @Test
    void testReverseDelete7() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "v");
        assertEquals(Arrays.asList("abcdedcba", true), result);
    }

    @Test
    void testReverseDelete8() {
        List<Object> result = ReverseDelete.reverseDelete("vabba", "v");
        assertEquals(Arrays.asList("abba", true), result);
    }

    @Test
    void testReverseDelete9() {
        List<Object> result = ReverseDelete.reverseDelete("mamma", "mia");
        assertEquals(Arrays.asList("", true), result);
    }
}
```
