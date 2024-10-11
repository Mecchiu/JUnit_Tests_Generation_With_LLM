package nu.staldal.lagoon.util;
java
class Wildcard_2Test {

    @Test
    void testInstantiateWildcard_noWildcard() {
        String pattern = "test";
        String part = "123";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("test", result);
    }

    @Test
    void testInstantiateWildcard_singleWildcard() {
        String pattern = "te*t";
        String part = "123";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("te123t", result);
    }

    @Test
    void testInstantiateWildcard_multipleWildcards() {
        String pattern = "t*st*";
        String part = "123";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("t123st123", result);
    }

    @Test
    void testInstantiateWildcard_wildcardAtBeginning() {
        String pattern = "*test";
        String part = "123";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("123test", result);
    }

    @Test
    void testInstantiateWildcard_wildcardAtEnd() {
        String pattern = "test*";
        String part = "123";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("test123", result);
    }

    @Test
    void testInstantiateWildcard_emptyPattern() {
        String pattern = "";
        String part = "123";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("", result);
    }

    @Test
    void testInstantiateWildcard_emptyPart() {
        String pattern = "test";
        String part = "";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("test", result);
    }

    @Test
    void testInstantiateWildcard_emptyPatternAndPart() {
        String pattern = "";
        String part = "";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("", result);
    }

    @Test
    void testInstantiateWildcard_longPatternAndPart() {
        String pattern = "very*long*pattern";
        String part = "123456789";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("very123456789long123456789pattern", result);
    }

    @Test
    void testInstantiateWildcard_specialCharacters() {
        String pattern = "te*st";
        String part = "!@#$%^&*()";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("te!@#$%^&*()st", result);
    }
}
