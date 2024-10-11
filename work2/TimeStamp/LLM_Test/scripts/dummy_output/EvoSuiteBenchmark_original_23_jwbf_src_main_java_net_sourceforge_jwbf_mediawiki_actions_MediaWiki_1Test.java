package net.sourceforge.jwbf.mediawiki.actions;
java
class MediaWiki_1Test {

    @Test
    void testEncode_NullInput() {
        assertThrows(NullPointerException.class, () -> MediaWiki.encode(null));
    }

    @Test
    void testEncode_EmptyInput() {
        assertEquals("", MediaWiki.encode(""));
    }

    @Test
    void testEncode_NormalInput() {
        assertEquals("Hello%20World", MediaWiki.encode("Hello World"));
    }

    @Test
    void testEncode_SpecialCharacters() {
        assertEquals("%21%40%23%24%25", MediaWiki.encode("!@#$%"));
    }

    @Test
    void testEncode_UnicodeCharacters() {
        assertEquals("%E2%82%AC", MediaWiki.encode("€"));
    }

    @Test
    void testEncode_Exception() {
        assertThrows(RuntimeException.class, () -> MediaWiki.encode("\uD83D\uDE00")); // Invalid UTF-8 character
    }

    @Test
    void testEncode_LongInput() {
        String longInput = "a".repeat(100000); // 100,000 'a's
        assertDoesNotThrow(() -> MediaWiki.encode(longInput));
    }

    @Test
    void testEncode_Performance() {
        long startTime = System.currentTimeMillis();
        MediaWiki.encode("PerformanceTest");
        long endTime = System.currentTimeMillis();
        assertTrue(endTime - startTime < 100); // Ensure encoding is fast
    }

    @Test
    void testEncode_URLEncoder() throws UnsupportedEncodingException {
        assertEquals(URLEncoder.encode("Hello World", MediaWiki.CHARSET), MediaWiki.encode("Hello World"));
    }
}
