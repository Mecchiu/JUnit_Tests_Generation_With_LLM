```java
class Wildcard_1Test {

    @Test
    void testMatchWildcard() {
        // Test case 1
        String pattern1 = "abc*def";
        String filename1 = "abcdef";
        assertEquals("", Wildcard.matchWildcard(pattern1, filename1));

        // Test case 2
        String pattern2 = "abc*def";
        String filename2 = "abc123def";
        assertEquals("123", Wildcard.matchWildcard(pattern2, filename2));

        // Test case 3
        String pattern3 = "abc*def";
        String filename3 = "abc123def456";
        assertNull(Wildcard.matchWildcard(pattern3, filename3));

        // Add more test cases as needed
    }
}
```
```