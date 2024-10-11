import static org.junit.jupiter.api.Assertions.assertEquals;

class GetMaxTriplesTest {

    @Test
    void testGetMaxTriples() {
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
        assertEquals(0, GetMaxTriples.getMaxTriples(2));
        assertEquals(1, GetMaxTriples.getMaxTriples(3));
        assertEquals(1, GetMaxTriples.getMaxTriples(4));
        assertEquals(2, GetMaxTriples.getMaxTriples(5));
        assertEquals(2, GetMaxTriples.getMaxTriples(6));
        assertEquals(3, GetMaxTriples.getMaxTriples(7));
        assertEquals(3, GetMaxTriples.getMaxTriples(8));
        assertEquals(4, GetMaxTriples.getMaxTriples(9));
        assertEquals(4, GetMaxTriples.getMaxTriples(10));
    }
}