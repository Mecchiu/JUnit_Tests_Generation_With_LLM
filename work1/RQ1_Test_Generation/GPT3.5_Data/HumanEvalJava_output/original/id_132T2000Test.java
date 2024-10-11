```java
class IsNestedTest {

    @Test
    void testIsNestedWithValidNestedBrackets() {
        assertTrue(IsNested.isNested("[[]]"));
        assertTrue(IsNested.isNested("[[[][]]]"));
        assertTrue(IsNested.isNested("[[[]]]"));
        assertTrue(IsNested.isNested("[[[][]]]"));
        assertTrue(IsNested.isNested("[[[[[]]]]]"));
    }

    @Test
    void testIsNestedWithInvalidNestedBrackets() {
        assertFalse(IsNested.isNested("[]]]]]]][[[[[]"));
        assertFalse(IsNested.isNested("[][]"));
        assertFalse(IsNested.isNested("[]"));
        assertFalse(IsNested.isNested("[[]][["));
        assertFalse(IsNested.isNested("[[[[[[[["));
    }

    @Test
    void testIsNestedWithEmptyString() {
        assertFalse(IsNested.isNested(""));
    }

    @Test
    void testIsNestedWithSingleBracket() {
        assertFalse(IsNested.isNested("["));
        assertFalse(IsNested.isNested("]"));
    }

}
```
