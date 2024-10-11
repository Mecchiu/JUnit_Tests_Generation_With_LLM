```java
public class SearchableTextPane_2Test {

    @Test
    void testSearch_NullTerm() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        int result = textPane.search(null);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_EmptyTerm() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        int result = textPane.search("");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermNotFound() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        int result = textPane.search("apple");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermFoundAtBeginning() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange banana");
        int result = textPane.search("apple");
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundInMiddle() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange banana");
        int result = textPane.search("orange");
        assertEquals(6, result);
    }

    @Test
    void testSearch_TermFoundAtEnd() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange banana");
        int result = textPane.search("banana");
        assertEquals(13, result);
    }

    @Test
    void testSearch_TermFoundMultipleTimes() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange apple banana apple");
        int result = textPane.search("apple");
        assertEquals(0, result);
    }

    @Test
    void testSearch_TermFoundAfterPreviousSearch() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange banana");
        textPane.search("orange");
        int result = textPane.search("banana");
        assertEquals(13, result);
    }

    @Test
    void testSearch_TermFoundAfterPreviousSearchWithOffset() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange banana apple orange banana");
        textPane.search("orange");
        int result = textPane.search("orange");
        assertEquals(19, result);
    }

    @Test
    void testSearch_TermFoundWithCaseSensitive() {
        SearchableTextPane textPane = new SearchableTextPane(new Font("Arial", Font.PLAIN, 12), 4);
        textPane.setText("apple orange banana Apple");
        int result = textPane.search("Apple");
        assertEquals(14, result);
    }
}
```
```