Here's the source code for the `ParseNestedParensTest` class with ten unit test cases for the `parseNestedParens` method:

```
class ParseNestedParensTest {

    @Test
    void testEmptyString() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = ParseNestedParens.parseNestedParens("");
        assertEquals(expected, actual);
    }

    @Test
    void testSinglePair() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = ParseNestedParens.parseNestedParens("()");
        assertEquals(expected, actual);
    }

    @Test
    void testMultiplePairs() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(1);
        List<Integer> actual = ParseNestedParens.parseNestedParens("()()()");
        assertEquals(expected, actual);
    }

    @Test
    void testNestedPairs() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        List<Integer> actual = ParseNestedParens.parseNestedParens("(())()");
        assertEquals(expected, actual);
    }

    @Test
    void testSingleNestedPair() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        List<Integer> actual = ParseNestedParens.parseNestedParens("(()())");
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleNestedPairs() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(2);
        List<Integer> actual = ParseNestedParens.parseNestedParens("(()(()))()");
        assertEquals(expected, actual);
    }

    @Test
    void testUnmatchedOpenParen() {
        assertThrows(IllegalArgumentException.class, () -> {
            ParseNestedParens.parseNestedParens("(()");
        });
    }

    @Test
    void testUnmatchedCloseParen() {
        assertThrows(IllegalArgumentException.class, () -> {
            ParseNestedParens.parseNestedParens("())");
        });
    }

    @Test
    void testInvalidCharacter() {
        assertThrows(IllegalArgumentException.class, () -> {
            ParseNestedParens.parseNestedParens("(a)");
        });
    }

    @Test
    void testOnlyOpenParens() {
        assertThrows(IllegalArgumentException.class, () -> {
            ParseNestedParens.parseNestedParens("(((");
        });
    }

    @Test
    void testOnlyCloseParens() {
        assertThrows(IllegalArgumentException.class, () -> {
            ParseNestedParens.parseNestedParens(")))");
        });
    }
}
```