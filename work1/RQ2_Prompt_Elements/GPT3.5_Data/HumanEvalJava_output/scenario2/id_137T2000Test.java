Here's the code for the CompareOneTest class:

```
class CompareOneTest {

    @Test
    void testIntegers() {
        assertEquals(5, CompareOne.compareOne(3, 5));
        assertEquals(7, CompareOne.compareOne(7, 2));
        assertNull(CompareOne.compareOne(4, 4));
    }

    @Test
    void testFloats() {
        assertEquals(3.5f, CompareOne.compareOne(2.1f, 3.5f));
        assertEquals(6.2f, CompareOne.compareOne(6.2f, 4.8f));
        assertNull(CompareOne.compareOne(1.0f, 1.0f));
    }

    @Test
    void testStrings() {
        assertEquals("hello", CompareOne.compareOne("hello", "world"));
        assertEquals("world", CompareOne.compareOne("hello", "world"));
        assertNull(CompareOne.compareOne("test", "test"));
    }

    @Test
    void testMixedTypes() {
        assertEquals(5, CompareOne.compareOne(5, "3.2"));
        assertEquals(7.5f, CompareOne.compareOne(7.5f, "4.3"));
        assertEquals("hello", CompareOne.compareOne("hello", 5));
        assertNull(CompareOne.compareOne(3.0f, "3.0"));
    }
}
```

This test class contains four test methods, each testing a different scenario for the `compareOne` method. The first method tests the case where both inputs are integers, the second tests the case where both inputs are floats, the third tests the case where both inputs are strings, and the fourth tests the case where the inputs are of different types. Each test method contains multiple assertions to cover different scenarios and edge cases.