package nu.staldal.lagoon.util;
java
class Wildcard_0Test {

    @Test
    void testIsWildcard_NoWildcard() {
        assertFalse(Wildcard.isWildcard("test"));
    }

    @Test
    void testIsWildcard_SingleWildcard() {
        assertTrue(Wildcard.isWildcard("test*"));
    }

    @Test
    void testIsWildcard_MultipleWildcards() {
        assertTrue(Wildcard.isWildcard("test*;*test"));
    }

    @Test
    void testIsWildcard_OnlyWildcard() {
        assertTrue(Wildcard.isWildcard("*"));
    }

    @Test
    void testIsWildcard_EmptyString() {
        assertFalse(Wildcard.isWildcard(""));
    }

    @Test
    void testIsWildcard_Null() {
        assertFalse(Wildcard.isWildcard(null));
    }

    @Test
    void testIsWildcard_OnlySemicolon() {
        assertTrue(Wildcard.isWildcard(";"));
    }

    @Test
    void testIsWildcard_SemicolonAndWildcard() {
        assertTrue(Wildcard.isWildcard(";*"));
    }

    @Test
    void testIsWildcard_SemicolonAndText() {
        assertTrue(Wildcard.isWildcard(";test"));
    }

    @Test
    void testIsWildcard_TextAndSemicolon() {
        assertTrue(Wildcard.isWildcard("test;"));
    }
}
