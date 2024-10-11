package glengineer.positions;
java
import org.junit.jupiter.api.BeforeEach;

class HWordPosition_5Test {

    private CharTable charTable;
    private HWordPosition hWordPosition;

    @BeforeEach
    void setUp() {
        charTable = new CharTable();
        hWordPosition = new HWordPosition(2, 5, 3);
    }

    @Test
    void testTextAt_EmptyCharTable() {
        assertEquals("", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordInsideCharTable() {
        charTable.setContent("Hello, World!");
        assertEquals("llo", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordStartsAtCharTableEdge() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(0, 5, 3);
        assertEquals("Hello", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordEndsAtCharTableEdge() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(7, 13, 3);
        assertEquals("World", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordOutsideCharTable() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(15, 20, 3);
        assertEquals("", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordOverlappingCharTableEdge() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(10, 15, 3);
        assertEquals("rld", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordAcrossMultipleLines() {
        charTable.setContent("Hello, World!\nHow are you?");
        hWordPosition = new HWordPosition(7, 13, 1);
        assertEquals("World!", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordWithSingleCharacter() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(4, 5, 3);
        assertEquals("o", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordWithNoCharacters() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(5, 5, 3);
        assertEquals("", hWordPosition.textAt(charTable));
    }

    @Test
    void testTextAt_WordWithNegativeCoordinates() {
        charTable.setContent("Hello, World!");
        hWordPosition = new HWordPosition(-2, 2, 3);
        assertEquals("", hWordPosition.textAt(charTable));
    }
}
