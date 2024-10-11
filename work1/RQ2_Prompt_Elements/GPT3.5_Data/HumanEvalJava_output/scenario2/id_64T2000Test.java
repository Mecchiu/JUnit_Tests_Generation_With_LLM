// Test case 1: Empty string
    @Test
    void testEmptyString() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    // Test case 2: String with no vowels
    @Test
    void testNoVowels() {
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
    }

    // Test case 3: String with only one vowel
    @Test
    void testOneVowel() {
        assertEquals(1, VowelsCount.vowelsCount("hello"));
    }

    // Test case 4: String with multiple vowels
    @Test
    void testMultipleVowels() {
        assertEquals(4, VowelsCount.vowelsCount("programming"));
    }

    // Test case 5: String with all vowels
    @Test
    void testAllVowels() {
        assertEquals(6, VowelsCount.vowelsCount("aeiouy"));
    }

    // Test case 6: String with uppercase vowels
    @Test
    void testUppercaseVowels() {
        assertEquals(3, VowelsCount.vowelsCount("HELLO"));
    }

    // Test case 7: String with mixed case vowels
    @Test
    void testMixedCaseVowels() {
        assertEquals(3, VowelsCount.vowelsCount("HeLLo"));
    }

    // Test case 8: String with 'y' at the end
    @Test
    void testYAtEnd() {
        assertEquals(1, VowelsCount.vowelsCount("happy"));
    }

    // Test case 9: String with 'Y' at the end
    @Test
    void testCapitalYAtEnd() {
        assertEquals(1, VowelsCount.vowelsCount("HAPPY"));
    }

    // Test case 10: String with 'y' not at the end
    @Test
    void testYNotAtEnd() {
        assertEquals(0, VowelsCount.vowelsCount("yellow"));
    }
}