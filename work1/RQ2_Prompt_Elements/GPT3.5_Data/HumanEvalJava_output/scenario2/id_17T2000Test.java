// Test case 1: Test for empty input string
    @Test
    void testEmptyString() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = ParseMusic.parseMusic("");
        assertEquals(expected, actual);
    }

    // Test case 2: Test for single whole note
    @Test
    void testSingleWholeNote() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        List<Object> actual = ParseMusic.parseMusic("o");
        assertEquals(expected, actual);
    }

    // Test case 3: Test for single half note
    @Test
    void testSingleHalfNote() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        List<Object> actual = ParseMusic.parseMusic("o|");
        assertEquals(expected, actual);
    }

    // Test case 4: Test for single quarter note
    @Test
    void testSingleQuarterNote() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        List<Object> actual = ParseMusic.parseMusic(".|");
        assertEquals(expected, actual);
    }

    // Test case 5: Test for multiple notes of different types
    @Test
    void testMultipleNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(4);
        List<Object> actual = ParseMusic.parseMusic("o|o.|o");
        assertEquals(expected, actual);
    }

    // Test case 6: Test for multiple notes of same type
    @Test
    void testMultipleSameNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(4);
        expected.add(4);
        List<Object> actual = ParseMusic.parseMusic("ooo");
        assertEquals(expected, actual);
    }

    // Test case 7: Test for invalid input string
    @Test
    void testInvalidInput() {
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = ParseMusic.parseMusic("invalid");
        assertEquals(expected, actual);
    }

    // Test case 8: Test for input string with spaces
    @Test
    void testInputWithSpaces() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(4);
        List<Object> actual = ParseMusic.parseMusic("o| o. o");
        assertEquals(expected, actual);
    }

    // Test case 9: Test for input string with special characters
    @Test
    void testInputWithSpecialCharacters() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(4);
        List<Object> actual = ParseMusic.parseMusic("o|!@#$%^&*()_+o.");
        assertEquals(expected, actual);
    }

    // Test case 10: Test for input string with only quarter notes
    @Test
    void testInputWithOnlyQuarterNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        List<Object> actual = ParseMusic.parseMusic(".|.|.||");
        assertEquals(expected, actual);
    }
}