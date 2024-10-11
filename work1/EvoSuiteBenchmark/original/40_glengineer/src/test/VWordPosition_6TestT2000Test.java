```java
class VWordPosition_6Test {

    @Test
    void testTextAt_shouldReturnTextAtPosition() {
        // Test setup
        CharTable charTable = new CharTable();
        charTable.setCharAt(0, 0, 'H');
        charTable.setCharAt(0, 1, 'e');
        charTable.setCharAt(0, 2, 'l');
        charTable.setCharAt(0, 3, 'l');
        charTable.setCharAt(0, 4, 'o');
        VWordPosition vWordPosition = new VWordPosition(0, 0, 5);

        // Test execution
        String text = vWordPosition.textAt(charTable);

        // Assertion
        assertEquals("Hello", text);
    }

    // Add more test cases here

}
```
```