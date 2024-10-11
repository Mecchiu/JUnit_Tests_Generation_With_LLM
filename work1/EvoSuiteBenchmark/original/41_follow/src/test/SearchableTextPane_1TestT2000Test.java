```java
    private SearchableTextPane searchableTextPane;

    @BeforeEach
    void setUp() {
        Font font = new Font("Arial", Font.PLAIN, 12);
        searchableTextPane = new SearchableTextPane(font, 4);
        searchableTextPane.setText("This is a test text for searching. Searching is important for testing.");
    }

    @Test
    void testSearch_NullTerm() {
        int result = searchableTextPane.search(null);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_EmptyTerm() {
        int result = searchableTextPane.search("");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermNotFound() {
        int result = searchableTextPane.search("apple");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_TermFound() {
        int result = searchableTextPane.search("test");
        assertEquals(10, result);
    }

    @Test
    void testSearch_SameTermTwice() {
        searchableTextPane.search("important");
        int result = searchableTextPane.search("important");
        assertEquals(41, result);
    }

    @Test
    void testSearch_StartingFromPosition() {
        int result = searchableTextPane.search("searching", 20);
        assertEquals(29, result);
    }

    @Test
    void testSearch_StartingFromInvalidPosition() {
        int result = searchableTextPane.search("text", 100);
        assertEquals(-1, result);
    }

    @Test
    void testSearch_LongTerm() {
        int result = searchableTextPane.search("testing is important for searching");
        assertEquals(-1, result);
    }

    @Test
    void testSearch_LongTermStartingFromPosition() {
        int result = searchableTextPane.search("testing is important for searching", 20);
        assertEquals(-1, result);
    }
```
```